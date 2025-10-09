public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world");
    }
}

/*

            Comparação entre Maven e Gradle

Maven e Gradle são populares em Java, sendo ferramentas
de automação de compilação e gerenciamento de dependências.
Eles ajudam a simplificar e organizar o processo de
construção, teste e implantação de projetos Java, tornando
o desenvolvimento mais eficiente.

--------------------------------------------------------------

                   O que é Maven?

Maven é uma ferramenta de gerenciamento de projetos utilizada
no desenvolvimento de software Java. Ele constrói, testa e
implanta aplicativos, gerenciando dependências e configurando
o ambiente de desenvolvimento de forma consistente e
eficiente.

Principais conceitos:

1. Dependency Management: O Maven gerencia as dependências
   de um projeto. As dependências são declaradas no pom.xml
   e o Maven é responsável por baixá-las automaticamente do
   repositório central do Maven ou de repositórios
   personalizados;

2. Convenção sobre Configuração: O Maven segue um conjunto de
   convenções, o que significa que muitas configurações são
   predefinidas e podem ser usadas fora da caixa sem a
   necessidade de configuração adicional;

3. Ciclo de Vida Padrão: O Maven possui um ciclo de vida padrão
   com diferentes fases (como: compile, test, package, install,
   deploy), e cada uma executa uma série de metas. O ciclo de
   vida padrão permite a construção e teste um projeto usando
   comandos como mvn compile, mvn test e mvn package;

4. Central Repository: O Maven possui um repositório central
   que contém uma grande variedade de bibliotecas Java prontas
   para serem utilizadas.
   Link do repositório: https://mvnrepository.com/

--------------------------------------------------------------

                   O que é Gradle?

Gradle é uma ferramenta de construção e automação de projetos
Java que ganhou popularidade ao longo dos anos. Ele usa uma
linguagem de domínio específico (DSL) baseada em Groovy ou
Kotlin para definir a estrutura do projeto e as tarefas de
construção.

Principais conceitos:

1. Flexibilidade: O Gradle é muito flexível e permite que o
   desenvolvedor defina as próprias tarefas de construção e
   configure o processo de construção de acordo com as
   necessidades do desenvolvedor;

2. Build by Convention: O Gradle segue algumas convenções,
   mas com mais liberdade que o Maven na forma de como o
   desenvolvedor organiza e configura o projeto;

3. Dependency Management: O Gradle gerencia as dependências
   do projeto e pode baixá-las de repositórios remotos;

4. Incremental Builds: O Gradle é projetado para realizar
   compilações incrementais, o que significa que ele pode
   construir apenas as partes do projeto que foram
   alteradas desde a última compilação, tornando o
   processo mais rápido.

                      Semelhanças

Eles são semelhantes por fornecerem convenções para a
estrutura do diretório do projeto, dependência de
gerenciamento e plugins de construção. Eles também são
suportados em IDEs e ferramentas de Integração Contínua (CI).

                      Diferenças

A principal diferença entre eles é a maneira de como
gerenciam as dependências e como eles descrevem a lógica
de construção. Maven usa arquivos XML para gerenciar as
dependências e descreve a lógica de construção usando
plugins, enquanto Gradle usa um formato de script e
descreve a lógica de construção como código.

              Vantagens e Desvantagens

Maven é fácil de aprender e ter um grande ecossistema.
A desvantagem é que os arquivos XML podem se tornar
muito grandes e difíceis de gerenciar para projetos
complexos.
Gradle permite scripts de construção mais poderosos e
é mais flexível. Porém, é mais difícil de aprender e
o ecossistema ainda não é grande como o do Maven.

 */