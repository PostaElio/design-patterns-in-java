# Strategy - Design Pattern
## Intencion
permite definir una familia de algoritmos, colocar cada uno de
ellos en una clase separada y hacer sus objetos intercambiables.


Esta estructura puede resultar similar al patrón Strategy, pero
hay una diferencia clave. En el patrón State, los estados pa-
rticulares pueden conocerse entre sí e iniciar transiciones de
un estado a otro, mientras que las estrategias casi nunca se
conocen.

**Nos permite seleccionar los objetos(strategias) a usar, mientras que el steate administra solo sus estados**
En el caso del patrón de estrategia, su cliente, que proporciona una estrategia diferente al contexto, en el patrón 
de estado, la transición de estado es administrada por el contexto o el propio estado.
en los stateConcrete podriamos teneer una referencia a nuestro objeto context

resuelve un methodo en especifico y no modifica el estado de un objeto ?
## Cuando aplicar
* tenemos que implementar diferentes versiones de un algoritmo
* evitar if/swith en la clase **Context**
## Pasos
* Se crea el **Context** que es la clase la cual va a tener un comportamiento dependendiendo el estado que tenga
* Todos los **ConcreteState** desarrollan los mensajes de **State** para poder aplicar polimorfismo
* Cada **ConcreteState** define un comportamiento "unico" para el **Context**

## Participantes
* **Strategy**
  * declara una interfaz
  * declara un método que la clase **Context** utiliza para ejecutar una estrategia.
* **ConcreteStrategy**
  * implementa el algotimo usando la **Strategy** interface
* **Context**
  * es configurado con un **ConcreteStrategy** objeto
  * mantiene una referencia a una de las estrategias concretas y se comunica con este objeto únicamente a través 
de la interfaz estrategia.
## Consecuencias