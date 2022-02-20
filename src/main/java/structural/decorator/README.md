# Decorator - Design Pattern

## Intencion
permite
añadir funcionalidades a objetos colocando estos objetos de-
ntro de objetos encapsuladores especiales que contienen es-
tas funcionalidades.
adjuntar responsabilidades adicionales a un objeto dinámicamente. los decoradores proporcionan una alternativa flexible a la subclasificación para ampliar la funcionalidad

## Cuando aplicar
agregar responsabilidad a objetos individuales de forma dinámica y transparente, es decir, sin afectar a otros objetos por responsabilidades

que se puede retirar

cuando la extensión por subclasificación no es práctica. a veces es posible una gran cantidad de extensiones independientes y produciría una explosión de subclases para admitir cada combinación. o una definición de clase puede estar oculta o no disponible para la subclasificación
* Queremos que un objeto tenga comportamiento dinamico correspondiente a objetos que implementan su misma interfaz
## Pasos
1. Se crea la interfaz **Component** la cual implementaran el **Decorator** y los **ConcreteComponent**
2. El **Decorator** tiene un atributo que es tipo **Component** y desarrolla los methodos abstractos
de **Component** para que cada clase que extienda **Decorator** ya tenga implementado el methodo
3. El **ConcreteComponent** es el que va a ser envolvido por **ConcreteDecorator**
## Participantes
* **Component**(Pizza)
  * declara la interfaz común tanto para wrappers como para objetos envueltos
  * define la interfaz para objetos a los que se les pueden agregar responsabilidades dinámicamente
* **ConcreteComponent**(Prepizza)
  * es una clase de objetos envueltos. Define el comportamiento básico, que los decoradores pueden alterar
  * define un objeto en el que se pueden adjuntar responsabilidades adicionales
* **Decorator**(IngredienteDePizza)
  * tiene un campo para referenciar un objeto envuelto. El tipo del campo debe declararse como la interfaz del 
  componente para que pueda contener tanto los componentes concretos como los decoradores. La clase decoradora
  base delega todas las operaciones al objeto envuelto.
  * mantiene una referencia a un objeto componente y define una interfaz que se ajusta a la interfaz del componente
* **ConcreteDecorator**(Mozzarella,Morron,SalsaDeTomate, etc)
  * definen funcionalidades adicionales que se pueden añadir dinámicamente a los componentes.
  * Los decoradores concretos sobrescriben métodos de la clase decoradora base y ejecutan su comportamiento, ya sea
  antes o después de invocar al método padre.
  * añade responsabilidad al componente

## Consecuencias

