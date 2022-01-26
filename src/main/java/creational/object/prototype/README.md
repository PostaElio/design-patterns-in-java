# Prototype - Design Pattern
## Intencion
El modo prototipo es usar el objeto de instancia existente para clonar un objeto con las mismas propiedades. 
La función es que cuando se crea un objeto complejo o una instancia, el programa puede ejecutarse de manera más 
eficiente a través de la clonación, asegurando que la eficiencia del programa, entonces el patrón prototipo es 
también un patrón creacional
## Cuando aplicar
* use el patrón prototipo cuando un sistema debe ser independiente de cómo se crean, componen y representan sus productos
* cuando las clases para instanciar se especifican en tiempo de ejecución, por ejemplo, mediante carga dinámica 
* para evitar construir una jerarquía de clases de fábricas que sea paralela a la jerarquía de clases de los productos 
* cuando las instancias de una clase pueden tener una de solo unas pocas combinaciones diferentes de estado. puede ser más conveniente instalar una cantidad correspondiente de prototipos y clonarlos en lugar de instanciar la clase manualmente, cada vez con el estado apropiado
## Pasos
* se crea una clase que implementa la interfaz Clonable
## Participantes
* **Clonable**
  * es una interfaz que nos proporciona el mensaje clone()
* **Product**
  * debe implementar **Clonable**
