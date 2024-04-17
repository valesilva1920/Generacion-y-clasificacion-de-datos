Habrá un archivo de texto plano por cada vendedor, el cual
tendrá el siguiente formato (de una venta por línea):
TipoDocumentoVendedor;NúmeroDocumentoVendedor
IDProducto1;CantidadProducto1Vendido;
IDProducto2;CantidadProducto2Vendido;
IDProducto3;CantidadProducto3Vendido;
La cantidad de vendedores es desconocida, pero como entrada el programa tendrá varios
(posiblemente, muchos) archivos planos en una carpeta, cada uno con la información de
ventas de un vendedor. Todos los archivos de vendedores deben estar en la misma carpeta de
proyecto que el programa a entregar, con el fin de facilitar la exploración de estos archivos
desde el programa.
Adicionalmente, el programa tendrá como entrada un archivo con la información de los
vendedores. El archivo de texto plano tendrá el formato que se describe a continuación, con
un vendedor por línea.
Formato archivo de información vendedores:
TipoDocumento;NúmeroDocumento;NombresVendedor1;ApellidosVendedor1
TipoDocumento;NúmeroDocumento;NombresVendedor2;ApellidosVendedor2
TipoDocumento;NúmeroDocumento;NombresVendedor3;ApellidosVendedor3
El programa también tendrá como entrada un archivo con la información de todos los
productos disponibles. Cada producto debe ir con el ID y el nombre.
Formato archivo de información productos:
IDProducto1;NombreProducto1;PrecioPorUnidadProducto1
IDProducto2;NombreProducto2;PrecioPorUnidadProducto2
IDProducto3;NombreProducto3;PrecioPorUnidadProducto3
La tarea mínima del proyecto consiste en diseñar e implementar un programa en Java bien
sustentado y con buenas costumbres de programación que, tomando como entrada los
archivos descritos, haga las siguientes tareas:
1. Muy buena documentación del código según los estándares de documentación en Java.
2. Excelentes prácticas de programación, especialmente en el espaciado y nombramiento
de variables.
3. El programa debe crear un archivo con la información de todos los vendedores, de a uno
por línea. Al frente del nombre de cada vendedor, separado por punto y coma, debe estar
la cantidad de dinero que recaudó según los archivos. El archivo debe estar ordenado por
cantidad de dinero, de mayor a menor, de a un vendedor por línea. Es básicamente un
archivo de reporte de ventas de los vendedores, del mejor al peor; un archivo CSV.
4. El programa debe crear un archivo con la información de los productos vendidos por
cantidad, ordenados en forma descendente. Deben ir el nombre y el precio, separados
por punto y coma, y de a un producto por línea. Es básicamente un archivo plano CSV.
5. Para propósitos de prueba, se deben crear métodos de generación de archivos de prueba
para el programa en cuestión. Entre estos métodos deben estar al menos:
a. createSalesMenFile( int randomSalesCount, String name, long id): dada una
cantidad, un nombre y un id, crea un archivo pseudoaleatorio de ventas de un
vendedor con el nombre y el id dados.
b. createProductsFile( int productsCount ): crea un archivo con información
pseudoaleatoria de productos, con los datos de productsCount productos.
c. createSalesManInfoFile( int salesmanCount ): crea un archivo con información de
salesmanCount vendedores; el número de estos según lo indique el argumento entero.
La información debe ser generada de manera pseudoaleatoria y ser coherente, es decir,
los nombres y apellidos pueden ser extraídos de listas de nombres reales de personas.
