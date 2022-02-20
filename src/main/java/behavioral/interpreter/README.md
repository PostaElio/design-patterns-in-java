* AbstractExpression
  * declara un abstract interprete operaction que es comun para todos los nodos en el abstracto sintaxis arbol
* TerminalExpression
  * implementan un interpret opration associado con terminal symbols en la gramatica
  * una instancia es requerida para todos los terminos symbol en una sentencia
* NonTermialExpression


AbstractExpression: declara una interfaz para la ejecución de una operación.
TerminalExpression: implementa una operación asociada con los símbolos terminales de la gramática
NonterminalExpression: implementa una operación de interpretación asociada con los símbolos no terminales de la gramática.
Context: contiene información global para el interprete.
Client: construye un árbol sintáctico abstracto que representa una sentencia particular en el lenguaje que la gramática define. El cliente construye una expresión




844893


