package mx.edu.itlapiedad.DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Materias;
import mx.edu.itlapiedad.models.Pago;


public class RMPago implements RowMapper<Pago>{
	@Override
	public Pago mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pago Pago= new Pago();
		Pago.setIdpago(rs.getInt("idpago"));
		Pago.setEstado(rs.getString("estado"));
		Pago.setSemestre_idsemestre(rs.getInt("semestre_idsemestre"));
		Pago.setAlumnos_idAlumno(rs.getInt("alumnos_idAlumno"));
		Pago.setTicket(rs.getString("ticket"));
		Pago.setNoTransaccion(rs.getInt("noTransaccion"));

		return Pago;
	}

}
