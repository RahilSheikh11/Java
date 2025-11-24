package SQL_query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import DSA.Arraylis_1;
import database.db_connection;
class account {
	String name,password;
	int balance;
	
	 account(String name, String password,int balance) {
		this.name=name;
		this.password=password;
		this.balance=balance;
		
	}
}
public class batch_query {
	Connection con;
	db_connection c = new db_connection();
	
	public void batch_query() {
		con=c.gConnection();
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement psmt = con.prepareStatement("insert into student(name,password,balance) values(?,?,?)");
			psmt.setString(1, "Rahil");
			psmt.setString(2, "Rahilpassword");
			psmt.setString(3, "1000000");
			psmt.addBatch();
			
			psmt.setString(1, "Rahil1");
			psmt.setString(2, "Rahil1password");
			psmt.setString(3, "10000000");
			psmt.addBatch();
			
			psmt.setString(1, "Rahil2");
			psmt.setString(2, "Rahil2password");
			psmt.setString(3, "100000000");
			psmt.addBatch();
			
			psmt.setString(1, "Rahil3");
			psmt.setString(2, "Rahil3password");
			psmt.setString(3, "1000000000");
			psmt.addBatch();
			
			int i[] = psmt.executeBatch();
			con.commit();
			//System.out.println(i.length);
			if(i.length>0) {
				System.out.println("Data Inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void array_list() throws SQLException {
		con=c.gConnection();
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "insert into student(name,password,balance)values(?,?,?)";
		ArrayList<account> al = new ArrayList<account>();
		al.add(new account("Rahil","Rahilpass",1000));
		al.add(new account("Rahil1","Rahilpass1",1000));
		al.add(new account("Rahil2","Rahilpass2",1000));
		al.add(new account("Rahil3","Rahilpass3",1000));
		al.add(new account("Rahil4","Rahilpass4",1000));
		for(account a:al) {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1,a.name);
			psmt.setString(2,a.password);
			psmt.setInt(3,a.balance);
			psmt.addBatch();
			int i[] = psmt.executeBatch();
			con.commit();
	
			if(i.length>0) {
				System.out.println("Data inserted from Array List");
			}
			}
		}
	
	public void join() throws SQLException {
		
		con=c.gConnection();
		PreparedStatement psmt = con.prepareStatement("select s.acc_number, s.name, t.id AS transaction_id, t.amount, t.type, t.date from student s join transaction t on s.acc_number = t.acc_no order by s.acc_number, t.date;");
ResultSet rs = psmt.executeQuery();
while(rs.next()) {
		System.out.println(rs.getInt("s.acc_number")+ " " + rs.getInt("transaction_id") + " " + rs.getInt("t.amount") + " " + rs.getString("t.type") + " " + rs.getDate("t.date"));
}
	}
		
	public void transfer_debit() throws SQLException {
		con = c.gConnection();
		int amount = 111500;
		
			con.setAutoCommit(false);
			PreparedStatement psmt2 = con.prepareStatement("Select balance from student where id=?");
			psmt2.setInt(1, 3);
			ResultSet rs= psmt2.executeQuery();
			int balance=0;
			if(rs.next()) {
				balance=rs.getInt("balance");
			}
			if(balance>amount) {
		
		
		try {
			con.setAutoCommit(false);
			PreparedStatement psmt= con.prepareStatement("update student set balance=balance-? where id=?");
			psmt.setInt(1, amount);
			psmt.setInt(2,3);
			int i = psmt.executeUpdate();
			if(i>0) {
				System.out.println("Balance deducted.....!!");
			}
			else {System.out.println("Not enough money....");}
			con.commit();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
			else {
				System.out.println("Insufficient balance");
			}
	}
	
	public void tranfer_credit() {
		con = c.gConnection();
		try {
			con.setAutoCommit(false);
			PreparedStatement psmt= con.prepareStatement("update student set balance=balance+? where id=?");
			psmt.setInt(1, 500);
			psmt.setInt(2,10);
			int i = psmt.executeUpdate();
			if(i>0) {
				System.out.println("Balance credited.....!!");
			}
			else {System.out.println("Not enough money....");}
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public static void main(String[] args) throws SQLException {
	batch_query bc = new batch_query();
	//bc.batch_query();
	//bc.array_list();
	
//	bc.transfer_debit();
	//bc.tranfer_credit();
	bc.join();
}
}
