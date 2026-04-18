## **Logica De Transporte**
## **Descripción del Proyecto**

Este proyecto consiste en el desarrollo de un sistema orientado a objetos que permite gestionar diferentes tipos de vehículos dentro de una ciudad inteligente. Se modelan tanto vehículos tradicionales como unidades con capacidades tecnológicas, aplicando el principio de abstracción para simplificar la representación del sistema.

El sistema permite registrar vehículos y monitorear su comportamiento de manera centralizada.


## **Estructura del Sistema**

Clase abstracta Vehiculo:
Define la base común para todos los vehículos. Contiene el atributo id y un método abstracto patronMovimiento(), el cual debe ser implementado por cada subclase para definir su forma de desplazamiento.

Interfaces:

IConectable:
Define el comportamiento de sincronización GPS, utilizado por vehículos con capacidades tecnológicas.

IRecargable:
Define el comportamiento de recarga de energía, aplicable a vehículos eléctricos o autónomos.

Clases concretas:

BicicletaDeCarga:
Representa un vehículo ecológico destinado al transporte de carga. Incluye el atributo capacidadKg y define su movimiento mediante pedaleo con carga.

CamionAutonomo:
Representa un vehículo terrestre autónomo. Incluye el atributo ruta y define su desplazamiento en función de esta. Además, implementa la interfaz IConectable para la sincronización de su GPS.

DronTransporte:
Representa un vehículo aéreo autónomo. Incluye el atributo nivelBateria y define su desplazamiento mediante vuelo. Implementa las interfaces IConectable e IRecargable, permitiendo la sincronización GPS y la recarga de energía.

Clase CentroControl:
Se encarga de gestionar la flota de vehículos mediante una colección ArrayList<Vehiculo>. Permite registrar nuevas unidades y monitorear el comportamiento de todos los vehículos.


## **Relaciones del Sistema**

Herencia:
Las clases BicicletaDeCarga, CamionAutonomo y DronTransporte heredan de la clase abstracta Vehiculo.

Implementación de interfaces:
CamionAutonomo implementa IConectable.
DronTransporte implementa IConectable e IRecargable.

Composición:
CentroControl contiene una colección de objetos Vehiculo, representando la gestión de la flota.

Agregación:
Los vehículos son registrados externamente en el CentroControl mediante el método registrarUnidad.

Polimorfismo:
Se aplica en el método monitorearFlota(), donde se recorre la lista de vehículos y se ejecuta el método patronMovimiento() de cada uno, sin importar su tipo específico.

