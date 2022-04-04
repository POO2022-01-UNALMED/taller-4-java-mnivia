package classroom;

public enum Tipo {
	
	DISCIPLINAR(10,"Disciplinar"),FUNDAMENTACION(20,"Fundamentacion"),ELECTIVA(30,"Electiva");//--------El segundo parametro
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {//----Private
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
