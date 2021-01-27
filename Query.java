package util;

public class Query {
	public static String admin= "select * from admin where username=? and password=?";
	public static String retrieve="select * from patient";
	public static String delete="delete from patient where id=?";
	public static String insert="insert into patient values(?,?,?,?)";
	public static String update= "update patient set name=?, age=?, mobileno=? where id=?";

}
