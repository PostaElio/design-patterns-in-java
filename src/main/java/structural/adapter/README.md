# Adapter - Design Pattern
## Intencion

## Cuando aplicar
* desea utilizar una clase existente y su interfaz no coincide con la que necesita
* desea crear una clase reutilizable que coopere con clases no relacionadas o imprevistas, es decir, clases que no
necesariamente tienen interfaces compatibles
## Pasos

## Participantes
* Target
  * define el dominio especifico de una interface que el cliente va a usar.
* Client 
  * colabora con los objetos coformando la **Target** interface.
* Adaptee 
  * define una existente interface que necesita ser adaptada.
* Adapter
  * adapta la interface de **Adaptee** para la **Target** interface.

## Consecuencias