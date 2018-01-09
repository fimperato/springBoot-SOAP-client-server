## Step 1. generazione keystore file jks:
$ keytool -genkey -keyalg RSA -alias selfsigned -keystore soaptest.jks -storepass password -validity 360
Specificare nome e cognome
  [Unknown]:  localhost
Specificare il nome dell'unit▒ organizzativa
  [Unknown]:  me
Specificare il nome dell'organizzazione
  [Unknown]:  me
Specificare la localit▒
  [Unknown]:  bologna
Specificare la provincia
  [Unknown]:  bologna
Specificare il codice a due lettere del paese in cui si trova l'unit▒
  [Unknown]:  IT
Il dato CN=localhost, OU=me, O=me, L=bologna, ST=bologna, C=IT ▒ corretto?
  [no]:  si

Immettere la password della chiave per <selfsigned>
        (INVIO se corrisponde alla password del keystore):
[invio]

## 1.1 Check:
keytool -list -keystore [path]/springBoot-SOAP-client-server/keystore/soaptest.jks

Result:
$ keytool -list -keystore [path]/springBoot-SOAP-client-server/keystore/soaptest.jks
Immettere la password del keystore:  password

Tipo keystore: JKS
Provider keystore: SUN

Il keystore contiene 1 voce

selfsigned, 5-gen-2018, PrivateKeyEntry,
Impronta digitale certificato (SHA1): 3A:7F:7A:38:A2:75:7E:78:63:1F:E0:93:62:ED:C2:7A:A2:82:9F:A1

# 2 Tomcat server in https:
[Apache Tomcat server path]\conf\server.xml

Aggiungere ai Connector:

<Connector port="8443" protocol="HTTP/1.1" SSLEnabled="true"
		maxThreads="150" scheme="https" secure="true"
		clientAuth="false" sslProtocol="TLS" 
		keystoreFile="C:\ws\sts390\test\springBoot-SOAP-client-server\keystore\soaptest.jks" keystorePass="password"/>
        
## 2.2 Check
https://localhost:8443/
http://localhost:8081/
