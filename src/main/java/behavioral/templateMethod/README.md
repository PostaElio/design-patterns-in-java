# Strategy - Design Pattern


define el esqueleto de un algoritmo en un methodo, permitiendo que las subclasses redefinir los pasos de el 
algoritmo sin cambiar la estrucutura del algoritmo


es un patrón de diseño de comportamiento
que define el esqueleto de un algoritmo en la superclase pe-
ro permite que las subclases sobrescriban pasos del algoritmo
sin cambiar su estructura


Considera
declarar el método plantilla como final para evitar que las
subclases lo sobrescriban.
## Intencion

## Pasos

## Participantes
* AbstractClass
  * define operaciones primitivas abstractas que definen **ConcreteClass** para implementar los pasos de un algoritmo
  * implementa un método de plantilla que define el esqueleto de un algoritmo. el método de plantilla llama a 
  operaciones primitivas, así como a operaciones definidas en clase abstracta o esos u otros objetos
  * El motodo platilla deberia tener la sintaxis **final** para no ser modificada por sus subclases.
  * Inversión de control: es la clase padre quien llama a las operaciones de los hijos.
* ConcreteClass
  * implementa las operaciones primitivas para llevar a cabo nuestros pasos específicos de subclase del algoritmo
## El método de plantilla llama a los siguientes tipos de operaciones
* **Template Method**: el metodo de plantilla sirve para la reutilización de código. Esta llama a las diferentes operaciones
cocretas, operaciones primitivas, operaciones de gancho y metodos de fabricacion.
* **Primitive Operation**(deben redefinirse): son metodos abstractos de la super clase y deben ser implementados por las sub clases
* **Concrete Operation**: pertenecen a la clase abstracta??????
* **Hook Operation**(pueden redefinirse): normalmente no hacen nada, si es necesario se la puede sobreescribir

## Consecuencias
