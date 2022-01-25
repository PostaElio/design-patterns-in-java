# Abstract Factory - Pattern Design
## Cuando aplicar
* un sistema debe ser independiente de cómo se crean, componen y representan sus productos
* un sistema debe configurarse con una de varias familias de productos
* una familia de objetos de productos relacionados está diseñada para usarse juntos, y debe hacer cumplir esta restricción
* desea proporcionar una biblioteca de clase de productos y desea revelar solo sus interfaces, no sus implementaciones
## Participantes
* **AbstractFactory**
  * declara una interface que tienen mensajes abstractos que crean **AbstractProduct**.
* **ConcreteFactory**
  * desarrollan los methodos para crear **ConcreteProduct**.
  * implementan **AbstractFactory** interface.
* **AbstractProduct**
  * declara una interface para los diferentes tipos de **ConcreteProduct**.
* **ConcreteProduct**
  * definen un producto para ser creado por su correspondiente **ConcreteFactory**.
  * implementan **AbstractProducto** interface.
* **Client** 
  * usan solo las interfaces declaradas por el **AbstractFactory** y **AbstractProduct** classes.
## Colaboraciones


crea una familia de **AbstractProduct** 
se utiliza en diseños mas complejos
es un conjunto de **Factory-Method**

