# Creational Patterns

Estos nos proveen soluciones para la creación de objetos, permitiéndonos hacer un sistema
independiente de cómo sus objetos son creados. Estos son los dos más usados:

Corresponden a patrones de diseño de software que solucionan problemas de creación de instancias. Nos ayudan a encapsular 
y abstraer dicha creación:


Definen cómo puede crearse un objeto. Habitualmente esto incluye aislar los detalles de la creación del objeto, de forma 
que su código no dependa de los tipos de objeto que hay y, por lo tanto, no deba se modificado al añadir un nuevo tipo de objeto

En este caso, nos vamos a concentrar en los patrones creacionales, estos patrones buscan en cierta forma «despreocupar»
al sistema de como sus objetos son creados o compuestos.
Los patrones de creación proporcionan diversos mecanismos de creación de objetos, que aumentan la flexibilidad y la 
reutilización del código existente de una manera adecuada a la situación. Esto le da al programa más flexibilidad para 
decidir qué objetos deben crearse para un caso de uso dado.

Estos son los patrones creacionales:

* Abstract Factory, permite trabajar con objetos de diferentes familias de manera que no se mezclen entre sí. De esa 
* manera se consigue la el tipo de familia que se esté utilizando sea transparente.
* Builder, abstrae el proceso de creación de los objetos complejos, centralizandolo en pun punto.
* Factory Method, centraliza en una clase constructora la creación de objetos de un tipo determinado. Ocultando al
* invocante la necesidad de indicar un tipo u otro.
* Prototype, crea un objeto a partir de la clonación de un objeto ya existente.
* Singleton, garantiza que solo exista una instancia de un objeto y que la forma de acceder a dicha instancia sea general.


Abstract Factory
En este patrón, una interfaz crea conjuntos o familias de objetos relacionados sin especificar el nombre de la clase.

Builder Patterns
Permite producir diferentes tipos y representaciones de un objeto utilizando el mismo código de construcción. 
Se utiliza para la creación etapa por etapa de un objeto complejo combinando objetos simples. La creación final de 
objetos depende de las etapas del proceso creativo, pero es independiente de otros objetos.

Factory Method
Proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos 
que se crearán. Proporciona instanciación de objetos implícita a través de interfaces comunes

Prototype
Permite copiar objetos existentes sin hacer que su código dependa de sus clases. Se utiliza para restringir las operaciones 
de memoria / base de datos manteniendo la modificación al mínimo utilizando copias de objetos.

Singleton
Este patrón de diseño restringe la creación de instancias de una clase a un único objeto. 

