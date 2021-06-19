# P.O.O

Documentacion

¿Qué es un Ivernadero?

Un invernadero tiene varias funciones pero entre ellas esta la de protección de las plantas de factores adversos a su desarrollo. Algunos de estos factores son altas y bajas temperaturas, lluvias y vientos fuertes, granizadas e inclusive heladas. Sin embargo, dada su característica de ser una estructura cerrada, también pueden mantenerse las plagas a raya.


¿Qué se puede encontrar en nuestro invernadero?

En nuestro invernadero encontramos plantas de tipo: 

Gimnospermas que son : Cipreses, Araucaria,Sequoias y Tsuga.

Angiospermas que son : Orquideaa, Lirios, Margaritas y Rosas.

Briofitas que son : Hylocomium splenders, Tortula muralis, Eriopus remotifolius y Zygodon menziesii.

Pteridofitas que son : Asplenium nidus, Blechnum gibbum, Cyrtomium falcatum y Selaginella willdenowii.


¿Como agregar plantas en el invernadero creado?


Para agregar una planta al invernadero lo que tenemos que hacer es:

1ro Crear el objeto:

			Plant p1 = new Plant();



2do Luego colocar la información deseada en cada atributo:


			p1.settype("Gimnospermas");
			p1.setname("Cipreses");
			p1.setcolor("Green");
			p1.setflower("Yes");
			p1.setseed("Yes");
			p1.setfruit("No");
			p1.setspore("No");



3ro A continuación debemos añadir a la lista Array el objeto que acabamos de crear:


			ArrayList<Plant> Plants = new ArrayList<>();

			Plants.add(p1);
      

4to Al final vamos a imprimir esa planta creada de esta manera:


      System.out.println("\n" + p1);


Cuyo resultado sera :
            
            
            Clasificacion:Gimnospermas
            Nombre:Cipreses
            Color:Green
            Flor:Yes
            Semilla:Yes
            Fruta:No
            Esporas:No

¿Como utilizar el invernadero?

Simplemente hay que ingresar en la clase de java llamada “Main.java” y también podemos ingresar a la clase “Plant.java” para comenzar a cambiar o editar el código.


Diagrama : 

![image](https://user-images.githubusercontent.com/64318749/122624327-b1ec5400-d06d-11eb-8ece-ed63a8bc9aed.png)
