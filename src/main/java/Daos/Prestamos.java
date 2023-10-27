package Daos;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Prestamos {


	//ATRIBUTOS
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id_usuario", nullable=false)
		private long idUsuario;
		
		@Column(name="dni_usuario", nullable=false)
		private String dniUsuario;
		
		@Column(name="id_prestamo")
		private String nombreUsuario;
		
		@Column(name="apellidos_usuario")
		private String apellidosUsuario;
		
		@Column(name="tlf_usuario")
		private String tlfUsuario;
		
		@Column(name="email_usuario")
		private String emailUsuario;
		
		@Column(name="clave_usuario")
		private String claveUsuario;
		
		@Column(name="estaBloqueado_usuario")
		private boolean estaBloqueadoUsuario;
		
		@Column(name="fch_fin_bloqueo")
		@Temporal(TemporalType.TIMESTAMP)
		private Calendar fchFinBloqueo;
		
		@Column(name="fch_alta_usuario")
		@Temporal(TemporalType.TIMESTAMP)
		private Calendar fchAltaUsuario;
		
		@Column(name="fch_baja_usuario")
		@Temporal(TemporalType.TIMESTAMP)
		private Calendar fchBajaUsuario;
		
		/*@Column(name="id_acceso")
		private long idAcceso;*/
		
	    @ManyToOne
	    @JoinColumn(name="id_acceso")
	    Accesos acceso;
}
