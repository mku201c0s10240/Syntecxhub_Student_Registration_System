package student_registeration_system;

import java.sql.*;
import java.util.*;

public class Registeration_Process {

	Scanner sc=new Scanner(System.in);
	public void addStudent() {
		String sql="insert into students_register values(?, ?, ?, ?, ?)";
		String check="select id from students_register where id=?";
		try(Connection con=Std_Connection.getConnection()){
			System.out.println("Enter student id");
			int id=sc.nextInt();
			
			PreparedStatement psc=con.prepareStatement(check);
			psc.setInt(1, id);
			ResultSet rs=psc.executeQuery();
			
			while(rs.next()) {
				System.out.println(id+" is Already Existing");
				return;
			}
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			sc.nextLine();
			System.out.println("enter student name");
			ps.setString(2, sc.nextLine());
			System.out.println("enter student email");
			ps.setString(3, sc.nextLine());
			System.out.println("enter student age");
			ps.setInt(4, sc.nextInt());
			sc.nextLine();
			System.out.println("enter student course");
			ps.setString(5, sc.nextLine());
			ps.executeUpdate();
			System.out.println("Student Added Successfully");
			
		}catch(Exception e) {
			System.out.println("Error while adding student");
		}
	}
	public void viewStudent() {
		
		String sql="select * from students_register";
		try(Connection con=Std_Connection.getConnection();
				Statement s=con.createStatement();
				ResultSet rs=s.executeQuery(sql)){
			
			while(rs.next()) {
			System.out.println(rs.getInt("id")+"  |"+rs.getString("name")+"    |"+rs.getString("email")+"      |"+
			rs.getInt("age")+"  |"+rs.getString("course"));
			}
			
		}catch(Exception e) {
			System.out.println("Error while view students");
		}
		
	}
	public void updateStudent() {

		String sql="update students_register set name=?, email=?, age=?, course=? where id=?";
		String check="select id from students_register where id=?";
		
		try(Connection con=Std_Connection.getConnection()){
			System.out.println("Enter Student Id");
			int id=sc.nextInt();
			
			PreparedStatement psc=con.prepareStatement(check);
			psc.setInt(1, id);
			ResultSet rs=psc.executeQuery();
			while(!rs.next()) {
				System.out.println("Student Id Not Found");
				return;
			}
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(5, id);
			sc.nextLine();
			System.out.println("Enter Student Name");
			ps.setString(1, sc.nextLine());
			System.out.println("Enter Student Email");
			ps.setString(2, sc.nextLine());
			System.out.println("Enter Student Age");
			ps.setInt(3, sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Course");
			ps.setString(4, sc.nextLine());
			
			int row=ps.executeUpdate();
			
			System.out.println(row>0?+row+" Row Update Successfully":row+" Rows Affected");
			
		}catch(Exception e) {
			System.out.println("Error while updating student");
		}
	}
	public void deleteStudent() {

		String sql="delete from students_register where id=?";
		String check="select id from students_register where id=?";
		try(Connection con=Std_Connection.getConnection()){
			System.out.println("Enter Student Id");
			int id=sc.nextInt();
			PreparedStatement psc=con.prepareStatement(check);
			psc.setInt(1, id);
			ResultSet rs=psc.executeQuery();
			while(!rs.next()) {
				System.out.println("Student Id not Found");
				return;
			}
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			System.out.println(row>0?+row+" Row is Deleted":+row+" Row Affected");
		}catch(Exception e) {
			System.out.println("Error While Deleting Student");
		}
		
		
	}
	
	

}
