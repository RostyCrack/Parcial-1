# Parcial-1

1. ¿Qué es encapsulamiento? ¿Qué ventajas ofrece?
	
	-El encapsulamiento se basa en controlar la manera de la que las clases interactuando con los atributos de otras clases. Los modificadores de acceso son private, static y public. Esto para controlar que atributos salen de una clase y que otros no.

2. ¿Qué es ocultación de información? ¿Por qué aplicarla? ¿Cómo se implementa en Java?
	-El punto de esto es evitar que otras clases modifiquen datos en otras clases sin que nos demos cuenta. La mayoría del tiempo se usa con private a los atributos y se utiliza un método para enviar los atributos deseados a las demás clases. Esto nos asegura que si un atributo esta sometido a un proceso antes de estar listo para ser leído por otra clase, dicha clase no pueda obtener el valor sin los procesos necesarios.