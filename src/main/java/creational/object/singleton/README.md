# Singleton - Design Pattern
## Intencion
Garantizar que una clase solo tenga una instancia y proporcionar un punto de acceso global de ella
## Cuando aplicar
* muchos clientes precisa de una clase X,  y por cada cliente se crea una clase X
* cuando la instancia única debe ser extensible mediante subclases, y los clientes deben poder usar una instancia extendida sin modificar su código
## Pasos
* Hacer privado el constructor por defecto para evitar que otros
  objetos utilicen el operador new con la clase Singleton.
* Crear un método de creación estático que actúe como constru-
  ctor. este método invoca al constructor priva-
  do para crear un objeto y lo guarda en un campo estático. Las
  siguientes llamadas a este método devuelven el objeto alma-
  cenado en caché.
  Si tu código tiene acceso a la clase Singleton, podrá invocar su
  método estático. De esta manera, cada vez que se invoque este
  método, siempre se devolverá el mismo objeto.
## Participantes
* **Singleton**
  * es responsable de c rear su propia unica class
  * define una instancia que permite a los cleintes acceder a esta unica instancia
  