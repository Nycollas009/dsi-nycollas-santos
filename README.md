# Desenvolvimento de Software I
# Tarefa da Aula de DS


## Como configurar o Java no computador 

Primeiramente precisamos saber se o computador possui o JDK(Java Development Kit) que possui o compilador e as ferramentas necessárias para o desenvolvimento do código. Após a verificação, escolhemos a versão e baixamos para o computador.
	Execute o instalador baixado e prossiga com as configurações na tela, abriremos as "Variáveis de Ambiente do Sistema", crie ou edite a variável **JAVA_HOME** apontando para a pasta onde o JFK foi instalado.
	Adicione na pasta **bin** do JDK á variável **path**.
	Abra o terminal (Prompt de Comando ou Bash) e digite  **java -version**. Se retornar a versão, a configuração foi bem-sucedida.

## Regras básicas do Java

-   **Estrutura de Classe:**  Todo código deve estar dentro de uma classe. O nome do arquivo deve ser igual o nome da classe pública ex:  ClassePrincipal.java.
-   **Método Main:**  Todo programa Java executável precisa ter o método  `public static void main(String[] args)`, que é o ponto de entrada da aplicação.
-   **Sensibilidade a Maiúsculas/Minúsculas (Case-sensitive):**  `variavel`  e  `Variavel`  são tratadas como coisas distintas.
-   **Finalização de Comandos:**  Todo comando deve terminar com ponto e vírgula (`;`).
-   **Blocos de Código:**  Chaves  `{ }`  são usadas para definir o início e fim de blocos, como classes, métodos e loops.
-   **Comentários:**  Usar  `//`  para linha única ou  `/* ... */`  para múltiplas linhas.
-   **Convenção de Nomes:**  Nomes de classes começam com maiúscula (CamelCase), enquanto variáveis e métodos começam com minúscula.

## Explicação de como funciona o Java
O Java funciona compilando o código-fonte `.java` em um formato médio chamado bytecode `.class`, que não é específico de uma máquina, . Esse bytecode é executado pela Java Virtual Machine (JVM) em qualquer sistema operacional, garantindo a portabilidade 

`- Bytecode  é um formato intermediário de código, mais próximo da máquina do que o código-fonte humano (como Java ou Python), mas não é código de máquina nativo `


- Para executar código Java no terminal do VS Code quando o botão "Run" não funcionar, devemos usar os comandos  `javac` (compilar) e `java` (executar) diretamente no terminal . Temos que certificar de estarmos na pasta correta do arquivo e que o JDK esteja instalado e configurado nas variáveis de ambiente.
