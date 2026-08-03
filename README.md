
# Desenvolvimento de Software I

# Tarefa da Aula de DS

  
  

## Como configurar o Java no computador

  

Primeiramente precisamos saber se o computador possui o JDK(Java Development Kit) que possui o compilador e as ferramentas necessárias para o desenvolvimento do código. Após a verificação, escolhemos a versão e baixamos para o computador.

Execute o instalador baixado e prossiga com as configurações na tela, abriremos as "Variáveis de Ambiente do Sistema", crie ou edite a variável **JAVA_HOME** apontando para a pasta onde o JFK foi instalado.

Adicione na pasta **bin** do JDK á variável **path**.

Abra o terminal (Prompt de Comando ou Bash) e digite **java -version**. Se retornar a versão, a configuração foi bem-sucedida.

  

## Regras básicas do Java

  

-  **Estrutura de Classe:** Todo código deve estar dentro de uma classe. O nome do arquivo deve ser igual o nome da classe pública ex: ClassePrincipal.java.

-  **Método Main:** Todo programa Java executável precisa ter o método `public static void main(String[] args)`, que é o ponto de entrada da aplicação.

-  **Sensibilidade a Maiúsculas/Minúsculas (Case-sensitive):**  `variavel` e `Variavel` são tratadas como coisas distintas.

-  **Finalização de Comandos:** Todo comando deve terminar com ponto e vírgula (`;`).

-  **Blocos de Código:** Chaves `{ }` são usadas para definir o início e fim de blocos, como classes, métodos e loops.

-  **Comentários:** Usar `//` para linha única ou `/* ... */` para múltiplas linhas.

-  **Convenção de Nomes:** Nomes de classes começam com maiúscula (CamelCase), enquanto variáveis e métodos começam com minúscula.

  

## Explicação de como funciona o Java

O Java funciona compilando o código-fonte `.java` em um formato médio chamado bytecode `.class`, que não é específico de uma máquina, . Esse bytecode é executado pela Java Virtual Machine (JVM) em qualquer sistema operacional, garantindo a portabilidade

  

`- Bytecode é um formato intermediário de código, mais próximo da máquina do que o código-fonte humano (como Java ou Python), mas não é código de máquina nativo `

  
  

- Para executar código Java no terminal do VS Code quando o botão "Run" não funcionar, devemos usar os comandos `javac` (compilar) e `java` (executar) diretamente no terminal . Temos que certificar de estarmos na pasta correta do arquivo e que o JDK esteja instalado e configurado nas variáveis de ambiente.

  
  

## Anotações aula04

  

== -> igual

=== -> estritamente igual

=> ou <= --> maior igual ou menor igual

|| -> ou

&& -> e

  

0 || 1 -> 1 bit

8 bits -> 1 Byte

  
  

## Anotações aula05

Java Casting é o processo de converter um tipo de dado em outro (primitivo ou objeto). Ele permite tratar uma variável como um tipo diferente, sendo fundamental para manipular dados com herança ou alterar precisão numérica. Divide-se em implícito (automático para tipos maiores, ou widening) e explícito (manual para tipos menores, ou narrowing, podendo perder dados).

  

## Anotações aula06

== -> igual a a == A -> True

  

=== -> igual a a === A -> False

  

=! diferente de a =! A -> False

  

==! -> diferente a ==! A -> True

  

## Aula07

  

Laços de repetição

  

## Aula08

**Conceitos de Orientações a Objetos**
A **Orientação a Objetos** (ou **POO**) é um modo de organizar códigos de computador usando **classes** e **objetos** para representar coisas do mundo real. Os seus quatro pilares principais são a **abstração**, o **encapsulamento** e o **polimorfismo**, junto com a **herança**.

-   Classe: O molde ou a planta que define como algo deve ser feito. Exemplo: a planta de uma casa 
- Objeto: A cópia real criada a partir da classe. Exemplo: a casa pronta.
- Atributos: As características do obejto. Exemplo: a casa pronta 
- Métodos: As ações que o objeto pode fazer. Exemplo: abrir a porta ou acender a luz


Os Quatro Pilares

-   **Abstração**: Escolher apenas os detalhes importantes de algo real e ignorar o que não serve para o programa.

-   **Encapsulamento**: Esconder os dados de dentro do objeto e mostrar apenas o necessário para os outros usarem com segurança.

-   **Herança**: Passar características e ações de uma classe pai para uma classe filho, para não repetir códigos.

-   **Polimorfismo**: Permitir que uma mesma ação seja feita de formas diferentes dependendo de quem está fazendo (como um cachorro latir e um gato miar, mas ambos fazem o ato de "fazer som").

### Classes, Objetos, Atributos e Métodos

**Analogia:** uma **classe** é uma planta de arquitetura (o projeto de uma casa). Um **objeto** é a casa construída a partir dessa planta. Você pode construir várias casas (objetos) a partir da mesma planta (classe), cada uma com cor de parede diferente (atributos), mas todas com porta que abre e fecha (métodos).