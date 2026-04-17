****Sistema de Gestión de Vehículos Inteligentes****
**Descripción del Proyecto**

Este proyecto consiste en el diseño e implementación de un sistema orientado a objetos para gestionar diferentes tipos de vehículos dentro de una ciudad inteligente. Se busca representar la realidad mediante modelos abstractos, destacando las características esenciales de cada tipo de transporte y su comportamiento.

**Objetivo**

Aplicar el principio de abstracción utilizando conceptos de Programación Orientada a Objetos como clases abstractas, interfaces, herencia, composición, agregación y polimorfismo, con el fin de construir un sistema flexible y reutilizable.

**Estructura del Sistema**

Clase abstracta Vehiculo:
Define la base común para todos los vehículos. Contiene un identificador y un método abstracto que obliga a las subclases a definir su patrón de movimiento.

Interfaces:
IConectable define el comportamiento de sincronización GPS.
IRecargable define la capacidad de recargar energía.

Clases concretas:
DronTransporte representa un vehículo aéreo con su propio patrón de movimiento.
CamionAutonomo representa un vehículo terrestre que además implementa capacidades tecnológicas como conexión GPS y recarga de energía.
BicicletaDeCarga representa un vehículo ecológico con capacidad de transporte de carga.

Clase CentroControl:
Se encarga de gestionar una colección de vehículos, permitiendo registrar unidades y monitorear el comportamiento de toda la flota.

**Relaciones del Sistema**

Herencia: Las clases DronTransporte, CamionAutonomo y BicicletaDeCarga heredan de Vehiculo.

Implementación: CamionAutonomo implementa las interfaces IConectable e IRecargable.

Composición: CentroControl contiene una colección de objetos Vehiculo.

Polimorfismo: Se aplica al recorrer la lista de vehículos y ejecutar el método patronMovimiento sin importar el tipo específico de cada objeto.

