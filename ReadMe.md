## Konfiguracija java.util.logging Logger-a

Pokretanje iz konzole sa parametrom za putanju do `logging.properties` fajla, ukoliko je fajl u trenutnom folderu:

`java -Djava.util.logging.config.file=logging.properties -jar demo-maven-1.0-SNAPSHOT.jar`

Ukoliko je `loging.properties` fajl na nekom drugom mestu, potrebna je putanja do fajla. Ova putanja se zadaje zavisno od sistema.
U primeru je putanja `e:\config\logging.properties`.

#### Windows (cmd)
 
`java -Djava.util.logging.config.file=e:/config/logging.properties -jar demo-maven-1.0-SNAPSHOT.jar`

#### Linux (gitbash)

`java -Djava.util.logging.config.file=/e/1/logging.properties -jar demo-maven-1.0-SNAPSHOT.jar`
