#   inventario ventas productos para el cabello 
Desarrollo de una aplicacion de inventarios que necesita un coordinador de logistica de una empresa, desea agilizar el proceso de inventario tanto para la recepcion y salida de los productos de la empresa. Esta empresa hace una gestion de inventarios periodicamente. Como informacion basica: datos proveedor, datos de empresa, productos, precios, fechas de salidas y entradas de los mismos 
##  Aclaraciones:
+ esta aplicacion se utilizara periodicamente para realizar la gestion
+ Se manejara almacenamiento de datos localmente
+ Se realiza validacion y verificacion de los datos de los productos 

### Analisis de ejercicio
Aproximación Plantilla Historia de Usuario:
<img width="940" alt="Historia_1" src="https://github.com/Viryi1810/demo.github.io/assets/132966483/0cd943b6-8b58-495d-a7bc-e0b837f35a3f">
<img width="960" alt="Historia_2" src="https://github.com/Viryi1810/demo.github.io/assets/132966483/11c1448a-7913-467f-bcc6-086a195a49b4">
<img width="960" alt="Historia_3" src="https://github.com/Viryi1810/demo.github.io/assets/132966483/08ff2fe7-b577-4a81-9014-f709ae099db3">


Aproximacion caso de uso 
![Diagrama de caso de uso](https://github.com/Viryi1810/demo.github.io/assets/132966483/74baddd1-b34d-49fe-ab35-5233adb8799b)

### Aproximacion diagrama de flujo
![Diagramas de flujo](https://github.com/Viryi1810/demo.github.io/assets/132966483/7351a30e-f26b-4554-a097-b696fc6e8231)

#### Aproximacion seudocodigo
- Inicio
  - Caracteres: nombres [50], productos [50]
  - Real: cantidad [50]
  - Caracteres: nombre, producto
  - Entero: numeroProductos, i
  - Real: venta, total<- 0
  - Imprimir: 'Digite el numero de productos:'
  - Asignar: numeroproductos
  - Para i=0 hasta numeroProductos - 1, 1
  - Imprimir: 'Digite el nombre del producto:'
  - Asignar: producto
  - Imprimir: 'Digite cantidad del producto:'
  - Asignar: cantidad
  - nombres[i] <- nombre
  - productos[i] <- producto
  - cantidades[i] <- cantidad
  - finPara
  - Para i=0 hasta numeroEmpleados -1, 1
  - total <-
  - total + (productos[i] + ventas[i]
  - finPara
  - Imprimir: 'El total es: + total
- Fin

