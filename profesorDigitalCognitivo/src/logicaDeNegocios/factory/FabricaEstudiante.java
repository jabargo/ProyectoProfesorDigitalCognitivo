package logicaDeNegocios.factory;

import java.sql.Date;

import logicaDeNegocios.Estudiante;
import logicaDeNegocios.dto.DtoEstudiante;


public class FabricaEstudiante {
	
	public Estudiante fabricarEstudiante(DtoEstudiante dtoEstudiante){
		return new Estudiante(dtoEstudiante.getIdEstudiante(), dtoEstudiante.getNumeroCarne(),
				dtoEstudiante.getFechaNacimiento(), dtoEstudiante.getPrimerApellido(), dtoEstudiante.getSegundoApellido(),
				dtoEstudiante.getNombre(), dtoEstudiante.getCorreo());
	}

}
