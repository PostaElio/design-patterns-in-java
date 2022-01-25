# Builder - Pattern Design
## Intencion
Separar la construcción de un objeto complejo de su representación para que el mismo proceso de construcción
pueda crear una representación diferente
## Cuando aplicar
* el algoritmo para crear un objeto complejo debe ser independiente de las partes que componen el objeto y de cómo se ensamblan
* el proceso de construccion debe permetir diferentes representaciones de el objeto(constructores sobre cargados)
* tenemos una clase con muchas subclases
## Participantes 
* **ProductBuilder**
  * permite la construccion abstracta y dinamica de el **Product** 
  * se define en el mismo **Product** como una classe static
  * tiene un atributo correspondiente a la clase a crear
* **Product**
  * es nuestro objeto dinamico a construir
  * puede contener atributos requeridos
## Colaboraciones

## Consecuencias


