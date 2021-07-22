package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class JDBC {

    public static void main(String[] args) {
        
        String id,name,designation;
        int salary;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ID");
        id=s.next();
        System.out.println("Enter Name");
        name=s.next();
        System.out.println("Enter Designation");
        designation=s.next();
        System.out.println("Enter Salary");
        salary=s.nextInt();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/employee","root","");
            if(con!=null)
            {
            System.out.println("Connected");
                PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, designation);
                ps.setInt(4, salary);
                int i=ps.executeUpdate();
                if(i>0)
                    System.out.println("Record Inserted");
                else
                    System.out.println("Record not Inserted");
            }
            else
                System.out.println("Not Connected");
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        
    }
    
}

