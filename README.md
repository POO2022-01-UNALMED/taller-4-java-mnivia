# Taller practico tenga en cuenta...

Para hacer uso de la herramienta para autocalificar tu implementacion debes pegar los archivos y carpetas que se generan de tu carpeta src de un proyecto y pegarlos en la carpeta src/main/java o la carpeta especificada y al momento de realizar un commit y subirlo(push) al repositorio de GitHub se ejecutara la prueba, se daran mas indicaciones en los talleres.

![Logo UNAL](https://github.com/POO-UNALMED/useful/blob/master/img/escudoUnal_black.png)
#### FACULTAD DE MINAS  SEDE MEDELLIN


1) ¿Qué utilidad tiene la sobrecarga de métodos? ¿Por qué no simplemente llamarlos con
nombres diferentes?

R/ Permite generar diferentes tipos de objetos de una misma clase. Tambien muestra el comportamiento de los objetos que realizan una misma accion bajo diferentes parametros. Porque son para una misma accion.

2) ¿Por qué cree que la firma de un método no está compuesta por el nombre de los argumentos
ni el tipo de retorno para diferenciarlo de los demás?

R/ Porque la salida puede ser diferente para distintas entradas, y estas entradas son inherentes a su nombre, lo que determina su firma es su tipo y cantidad de argumentos de entrada del metodo en cuestión.

3)¿Qué ventajas puede encontrar en un inicializador estático frente a simplemente definir el
valor inicial de un atributo en la declaración del mismo?

Que puede ser llamado por cualquier objeto de la clase, con el fin de acceder a sus valores o en su defecto, ser modificados.

4) ¿Qué ventajas tiene poder llamar a otro constructor con la expresión this()?

Se pueden generar objetos asociasdos al objeto actual, con distintos atributos segun sea llamado el constructor y sus repectivos parametros.
