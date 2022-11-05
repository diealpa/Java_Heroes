# Java_Heroes
Desarrollar, utilizando Spring Boot 2 y Java 11, una API que permita hacer un mantenimiento de s�per
h�roes.
Este mantenimiento debe permitir:
� Consultar todos los s�per h�roes.
� Consultar un �nico s�per h�roe por id.
� Consultar todos los s�per h�roes que contienen, en su nombre, el valor de un par�metro
enviado en la petici�n. Por ejemplo, si enviamos �man� devolver� �Spiderman�, �Superman�,
�Manolito el fuerte�, etc.
� Modificar un s�per h�roe.
� Eliminar un s�per h�roe.
� Test unitarios de alg�n servicio.


� Los s�per h�roes se deben guardar en una base de datos H2 en memoria.
� La prueba se debe presentar en un repositorio de Git. No hace falta que est� publicado. Se
puede pasar comprimido en un �nico archivo.


� Utilizar alguna librer�a que facilite el mantenimiento de los scripts DDL de base de datos.
� Implementar una anotaci�n personalizada que sirva para medir cu�nto tarda en ejecutarse.
una petici�n. Se podr�a anotar alguno o todos los m�todos de la API con esa anotaci�n.
Funcionar�a de forma similar al @Timed de Spring, pero imprimiendo la duraci�n en un log.
� Gesti�n centralizada de excepciones.
� Test de integraci�n.
� Presentar la aplicaci�n dockerizada.
� Poder cachear peticiones.
� Documentaci�n de la API.
� Seguridad del API.
