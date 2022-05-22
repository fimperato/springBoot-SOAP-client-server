#!/bin/bash

# SOAP service server script
# launch example : ./start-server.sh -s 8082 -w "$HOME/temp/services" -n "new-soap-service.wsdl"
echo "Starting server ..."

## Defaults
server_port=${server_port:-8082}
new_wsdl_path=${new_wsdl_path:-""}

# Display Help #
Help()
{
   echo "SOAP service server script."
   echo
   echo "Syntax: scriptTemplate [-h|s|w]"
   echo "options:"
   echo "h     Print this Help."
   echo "s     Set server port (optional)."
   echo "w     Set new soap service wsdl path (optional)."
   echo "n     Set new soap service wsdl name (required if w set)."
   echo
}

#while [ $# -gt 0 ]; do
#   if [[ $1 == *"--"* ]]; then
#        param="${1/--/}"
#        declare $param="$2"
#        echo $1 $2 $param
#   fi
#  shift
#done

# Get the options
while getopts ":hs:w:n:" option
do
   case "${option}" in
      h)
         Help
         exit;;
      s)
          echo "server port set."
          server_port=$OPTARG;;
      w)
          echo "new wsdl path set"
          new_wsdl_path=$OPTARG;;
      n)
          echo "new wsdl name set"
          new_wsdl_name=$OPTARG;;
     \?) # Invalid option
         echo "Error: Invalid option"
         exit;;
   esac
done

echo "Settings ..";
echo "server port $server_port";
echo "new service wsdl path $new_wsdl_path";
echo "new service wsdl name $new_wsdl_name";

#if [ -z "$1" ];
#then
#  server_port=8082
#  echo "server port set to default value $server_port";
#else
#  server_port=$1
#  echo "server port set to input value $server_port";
#fi

testval=""
new_soap_service_profile=""
new_soap_service_params1=""
new_soap_service_params2=""
if [ -z "$new_wsdl_path" ];
then
  echo "new_wsdl_path not set - new soap service profile NOT enabled";
else
  new_soap_service_profile="-Pnew-soap-service"
  new_soap_service_params1="-Dnew.wsdl.path=${new_wsdl_path}"
  new_soap_service_params2="-Dnew.wsdl.name=${new_wsdl_name}"
  echo "new_wsdl_path set to $new_wsdl_path - new soap service profile enabled";
fi

echo "new_soap_service_profile $new_soap_service_profile";
echo "new_soap_service_params1 $new_soap_service_params1";
echo "new_soap_service_params2 $new_soap_service_params2";

# create SOAP server server package
if [ -z "$new_soap_service_profile" ];
then
  mvn clean package -Denv=local -Pcxf-codegen-sources
else
  mvn clean package -Denv=local -Pcxf-codegen-sources "${new_soap_service_profile}" "${new_soap_service_params1}" "${new_soap_service_params2}"
fi


# cleaning
docker container stop $(docker ps -a | grep "fimperato/springboot-soap-server" | awk '{print $1}')
docker container rm $(docker ps -a | grep "fimperato/springboot-soap-server" | awk '{print $1}')
docker rmi fimperato/springboot-soap-server

# build image
docker image build -t fimperato/springboot-soap-server ./

# start container
docker container run -it --publish $server_port:8080 fimperato/springboot-soap-server
