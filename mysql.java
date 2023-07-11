package ConexaoBD;

import java.sql.*;

public class mysql 
{
	public static Connection conectar()
	{
		Connection conn = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/hospedes";
		String user = "root";
		String password = "123456";
		
		try 
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			String status = "Conexao ao MySQL estabelecida com sucesso";
			System.out.println(status);
			return conn;
		
		} 
		catch (Exception e) 
		{
			String status = "Problema ao conectar o MySQL: ";
			System.out.println(status + e);
			return null;
		}

	}
}

