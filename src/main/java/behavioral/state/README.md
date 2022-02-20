# Strategy - Design Pattern
## Intencion

State es un patrón de diseño de comportamiento que permite
a un objeto alterar su comportamiento cuando su estado inte-
rno cambia. Parece como si el objeto cambiara su clase.


Un objeto toma los methodos de un objetoState
los estados pueden cambiar el edatado del mismo bojeto
delega a cada metodo

el objeto tiene un estado por defecto 
modificar el comportamiento de un objeto cuando su "estado" interno se modifica
externamiento debe parecer que la clase del objeto se ha cambiado

los estados definen el proximo estado de el **Context**

lo mejor es que **State** tenga un atributo de **Context**, para que cada mensaje
no requiera de un parametro de el **Context**

## Pasos
* Se crea el **Context** que es la clase la cual va a tener un comportamiento dependendiendo el estado que tenga
* Todos los **ConcreteState** desarrollan los mensajes de **State** para poder aplicar polimorfismo
* Cada **ConcreteState** define un comportamiento "unico" para el **Context**

## Participantes
* Context
  * define la interfaz que le interesa al cliente del patron
  * tiene una instancia de **ConcreteState**, que representa el estado actual
* State
  * define una interfaz/clase abstracta que cada **ConcreteState** desarrollara
* ConcreteState
  * cada subclass implementa un comportamiento asociado con un estado de el **Contex**

## Consecuencias