# Facade - Design Pattern

## Intencion
Define una interfaz de nivel superior que hace que los subsistemas sean más fáciles de usar

## Cuando aplicar
* Cuando queremos abstraer la logica de diferentes objetos y encapsularlos uno solo


## Pasos

## Participantes
* **Facade**
  * sabe qué clases de subsistema son responsables de una solicitud
  * delega las solicitudes de los clientes a los objetos del subsistema apropiados
* **Subsystem Class**
  * No tienene conocimiento del **Facade** 
  * Son "manejados" por el **Facade** 
  * Desarrollan su propia funcionalidad
## Consecuencias
