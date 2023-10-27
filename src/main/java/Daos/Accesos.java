package Daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="accesos", schema="gbp_operacional")
public class Accesos {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_acceso", nullable=false)
	private long id_acceso;
	
	@Column(name="codigo_acceso", nullable=false)
	private String codigo_acceso;
	
	@Column(name="descripcion_acceso")
	private String descripcion_acceso;
	
    @OneToMany(mappedBy="acceso")
    List<Usuario> usuariosConAcceso;     

	//CONSTRUCTORES
	public Accesos() {
		super();
	}

	public Accesos(String codigo_acceso, String descripcion_acceso) {
		super();
		
		this.codigo_acceso = codigo_acceso;
		this.descripcion_acceso = descripcion_acceso;
	}	

}
