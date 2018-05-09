
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddAcc {
	public static void main(String args[])
	{
		
		try
		{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			//System.out.println("Connected");
			String query="SELECT * FROM feereport_accountant";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				//String a=rs.getString("name");
				//String b=rs.getString("psssword");
				
				System.out.print(" ||Password:"+rs.getString("password"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
