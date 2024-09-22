# Maven - Dependency Management

Slides da aula: <a target="_blank" href="https://docs.google.com/presentation/d/1wudqWaBDK40QnBAYjuh4Q65dcC2wqLW_/edit#slide=id.p121">AQUI</a>

Utiliza o Maven para gerar um novo projeto usando o archetype maven-archetype-quickstart, que é um modelo básico de projeto Maven.

Aqui está o que cada parâmetro faz:

- DgroupId=one.digitalinovation: Define o ID do grupo do projeto. Esse ID geralmente segue o padrão de um nome de domínio invertido e identifica de maneira única o projeto dentro da organização.
- DartifactId=quick-start-maven: Define o ID do artefato, que é o nome do projeto.
- Darchetype=maven-archetype-quickstart: Especifica o archetype a ser usado, que neste caso é o maven-archetype-quickstart, um modelo simples e básico para um projeto Maven.
- DinteractiveMode=false: Desativa o modo interativo, permitindo que todos os parâmetros necessários sejam passados na linha de comando.
  Esse comando cria uma estrutura básica de projeto Maven com as configurações que você especificou.

  <br/>

```
mvn archetype:generate "-DgroupId=one.digitalinovation" "-DartifactId=quick-start-maven" "-Darchetype=maven-archetype-quickstart" "-DinteractiveMode=false"

mvn archetype:generate -DgroupId=one.digitalinovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false
```

- compile (criar a pasta target)
- test
- clean (exclui a pasta target)

## Como encontrar outros mvn archetyoe list

- Buscar por "maven archetype list"
- Github
- Maven Repository

## Repositório Local

- Windows: %USERPROFILE%\.m2\repository
- Linux: $HOME/.m2/repository

## Publicar localmente um projeto

```
mvn install
```

O comando acima publica o projeto como uma dependecia localmente, podendo ser utilizada em outros projetos.
No proojeto de destino, aqui as dependências se tornas tornam Transitivas ao invés de Diretas.

## Comandos para gerar classpath

```
mvn dependency:build-classpath –DincludeScope=compile
mvn dependency:build-classpath –DincludeScope=test
mvn dependency:build-classpath –DincludeScope=runtime
```

## Optional em dependências

Quando não quer que uma dependência se torne transitiva de seu projeto, torne-a opcional:

```
<optional>true</optional>
```

## Exclusions em dependências

Quando não resta opção, vc pode colocar excluions para evitar certas dependências transitivas de outros pacotes, desta forma:

```
 <dependencies>
    <dependency>
      <groupId>one.digitalinovation</groupId>
      <artifactId>quick-start-maven</artifactId>
      <version>1.0.0</version>
    </dependency>
    <exclusions>
      <exclusion>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
      </exclusion>
    </exclusions>
  </dependencies>
```

## Plugins no java

Inserção de um plugin:

```
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-javadoc-plugin</artifactId>
        <version>3.10.0</version>
      </plugin>
    </plugins>
  </build>

  mvn javadoc:javadoc

  mvn javadoc:help
```
