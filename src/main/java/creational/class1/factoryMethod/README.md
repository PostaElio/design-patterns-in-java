# Factory Method - Design Pattern
## Intencion
Se define una interfaz para la creacion de objetos. dejando que cada subclass decida que clase va a instanciar.
De esa forma tenemos clases instanciadas abstractas para el cliente
## Cuando aplicar
* no sabe de de antemano con que tipos de objetos la aplicacion va a trabajar
* una clase quiere que sus subclases especifiquen los objetos que crea
* las clases delegan la responsabilidad a una de varias subclases auxiliares, y desea localizar el conocimiento de qué suclases auxiliares es el delegado
## Pasos
* Se crea una interfaz con un methodo **createProduct**, este methodo retorna una class abstract **AbstractProduct**
* Tenemos classes que implementan nuestra interfaz, de esta forma tenemos multiples classes que desarrollan el methodo
**createProduct** por lo tanto tenemos multiples classes que extienden de **AbstractProduct**.
## Participantes
* **Product**
  * define la interface de objectos que el factory method crea.
  * interfaz de clase de producto, utilizada para estandarizar las clases de productos
* **ConcreteProduct**
  * implementan el Product interface, pueden ser muchas clases.
* **Creator**
  * declara el método de fábrica, que devuelve un objeto de tipo **Product**.
* **ConcreteCreator**
  * sobre escribe el factory method para retornar una instancia de un **ConcreteProduct**
## Consecuancias
una desventaja potencial de los métodos factory es que los clientes podrían tener que crear una 
subclase de la clase creadora solo para crear un objeto de producto concreto en particular.
la subclasificación está bien cuando el cliente tiene que subclasificar la clase creadora de todos modos,
pero de lo contrario, el cliente ahora debe lidiar con otro punto de evolución
## UML
![](uml/factory-method.png)
