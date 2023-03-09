package kawah.edu;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *  JDBC
 */

@Path("users")
public class UsersResource {
    Connection connection = null;

    @GET
    public String test(){
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","akuganteng");
            Statement st = connection.createStatement();
            st.executeUpdate("INSERT INTO db_kawah_edu.users VALUES(20,'Fajarsya','kaligoro',080800808)");
            st.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return "berhasil";
    }

    @GET
    @Path("list")
    public List<String> listUsers(){
        List<String> users = new ArrayList<>();
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","akuganteng");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT nama FROM db_kawah_edu.users");
            while (rs.next()){
                users.add(rs.getString("nama"));
            }
            st.close();
            rs.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        return users;
    }

    @GET
    @Path("nama")
    public List<String> getUser(){
        List<String> users = new ArrayList<>();
        try {
           connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","akuganteng");
           PreparedStatement st = connection.prepareStatement("SELECT nama FROM db_kawah_edu.users WHERE nama = ?");
           st.setString(1,"Fajarsya");
           ResultSet rs = st.executeQuery();
           while (rs.next()){
               users.add(rs.getString("nama"));
           }
            rs.close();
            st.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return users;
    }

    @POST
    public User add(User user){
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","akuganteng");
            PreparedStatement ps = connection.prepareStatement("INSERT INTO db_kawah_edu.users VALUES(?,?,?,?)");
            ps.setInt(1,user.id);
            ps.setString(2,user.nama);
            ps.setString(3, user.alamat);
            ps.setInt(4,user.nohp);
            ps.executeUpdate();
            ps.close();
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }

        return user;
    }
}
