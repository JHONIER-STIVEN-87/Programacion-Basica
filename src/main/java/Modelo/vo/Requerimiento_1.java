package Modelo.vo;

public class Requerimiento_1 {
    private Integer ID_Proyecto;
    private String Ciudad;
    private String Banco_Vinculado;
    private String Construtura;
    
	public Requerimiento_1() {
		super();
	}

	public Requerimiento_1(Integer iD_Proyecto, String ciudad) {
		super();
		ID_Proyecto = iD_Proyecto;
		Ciudad = ciudad;
	}

	public Integer getID_Proyecto() {
		return ID_Proyecto;
	}

	public void setID_Proyecto(Integer iD_Proyecto) {
		ID_Proyecto = iD_Proyecto;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getBanco_Vinculado() {
		return Banco_Vinculado;
	}

	public void setBanco_Vinculado(String banco_Vinculado) {
		Banco_Vinculado = banco_Vinculado;
	}

	public String getConstrutura() {
		return Construtura;
	}

	public void setConstrutura(String construtura) {
		Construtura = construtura;
	}
    
    
}
