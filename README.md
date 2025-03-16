 # gestor de personas
 ## programacion 1: orientada a objetos basica
 ## S25 evidencia de aprendizaje 2 
 ### grupo  de trabajo N 7
 ### darwin monsalve noreña 
 ### Yancarlos cardenas salazar
 ### jorge eliecer cuervo zapata 
 ### grupo: PREICA2501BO10016
 ### Docente: julian andrez loaiza 
 ### facultad de ingenieria y ciencias agropecuarias 
 ### tecnologia en desarrollo de software 
 ### Institucion universitaria digital de antioquia (iudigital) 
 ### 13 de marzo de 2025
 ## Evidencia de aprendisaje 2
 
 <p>Identificar el nivel de conocimiento en los paradigmas de la POO utilizando como plataforma de desarrollo el lenguaje JAVA</p>

<p>1) Realizar un programa de consola que permita realizar las siguientes operaciones</p>
   
<p>a) Realizar una clase que permita capturar el nombre, apellido, genero, edad, estas propiedades deberán ser definidas mediante el modificador de acceso Privado y permitir que la instancia del objeto creada pueda realizarse directamente mediante la utilización de un método constructor.</p>
<p>b) Realizar un método que permita Capturar y retornar el nombre y el género de 5 personas capturadas por teclado.</p>
<p>c) Realizar un método que permita retornar el promedio de las edades capturadas.</p>
<p>d) Realizar un método que permita retornar la cantidad de personas con género Masculino.</p>
<p>e) Realizar un método que permita retornar la cantidad de personas con género Femenino.</p> 

## Solución:
<p>Para el desarrollo de esta actividad, primero declaramos una clase a la cual le definimos los atributos: nombre, apellido, genero y edad los cuales estan determinados por el modificador de acceso privado y por el tipo de dato que le corresponde a cada atributo.

Después creamos el método constructor con los parametros correspondientes a los atributos de la clase, cada uno con su tipo de dato correspondiente y utilizamos "this" para diferenciar el atributo de la clase con el parametro del constructor.

Luego utilizamos los "get" como métodos de acceso para obtener la información de los atributos privados de la clase, manteniendo los principio de encapsulamiento y abstracción.

Despuén definimos otra clase, la cual utilizamos para ejecutar el programa. en esta clase creamos un "array" para almacenar los datos de las persona y creamos un nuevo objeto "scanner" para leer las entradas de dichos datos por consola.

Luego de eso empezamos a crear el método donde vamos a resibir por consola los datos de las 5 personas determinadas por un bucle "for", en el cual incluimos un bucle "while" para validar el genero que el usuario ingrese, hasta que el genero sea valido (m o f).

Continuamos con la creación de los métodos para obtener "nombres y generos", para calcular "promedio de edades", para contar las personas de "genero masculino", también para contar las personas de "genero femenino" y por ultimo el método main que lo utilizamos para imprimir los resultados.<p/>

## Conclusiones:
<p>El programa fue probado y demostró ser eficiente en la recolección y el procesamiento de la información de las 5 personas. Recoge los datos por consola, los almacena y los procesa de manera efectiva, para luego generar e imprimir unos informes estadísticos básicos como, nombres y generos, promedio de edades, etc.

Este programa aunque fue un trabajo en grupo, quisimos comenzar a hacerlo cada uno por separado y luego reunirnos y fusionar las ideas, me gusto mucho esta forma de realizarlo porque permite que cada uno desarrolle su lógica y haga una exploración profunda del problema a solucionar, claro esta que al reunir los esfuerzos de los integrantes del grupo y analizar juntos el código nos permitió identificar y corregir errores mejorando así la calidad del programa. pienso que el trabajo en equipo y la colaboración mutua es muy importante porque nos permite compartir conocimientos y experiencias, que hasta el momento son pocos y pocas, pero que de alguna manera enrriquecen nuestro proceso de aprendizaje y mejoran nuestras habilidades.<p/>
