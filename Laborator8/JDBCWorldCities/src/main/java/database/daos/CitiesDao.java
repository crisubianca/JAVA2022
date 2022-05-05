package database.daos;

import database.connections.MyDatabaseConn;
import database.entities.Cities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Adm
 */
public class CitiesDao {
    private final PreparedStatement getByIdStmt;
    private final PreparedStatement insertStmt;
    private final PreparedStatement deleteAllStmt;
    
    public CitiesDao() throws SQLException {
        Connection connection = MyDatabaseConn.getInstance().getConnection();
        getByIdStmt = connection.prepareStatement("select * from countries where id = ?");
        insertStmt = connection.prepareStatement("insert into countries values (?, ?, ?, ?)");
        deleteAllStmt = connection.prepareStatement("delete from countries");
    }
    
    public void create(String name) throws SQLException {
        Connection con = MyDatabaseConn.getConnection();
        try( PreparedStatement pstmt = con.prepareStatement(
        "insert into cities (name) values (?)") ){
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        }
    }
    
    //Cities
    public Integer findByName(String name) throws SQLException {
        Connection con = MyDatabaseConn.getConnection();
        try ( Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery(
              "select id from cities where name='" + name + "'")){
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    
    //Cities
    public Cities findById(int id) throws SQLException{
        if (id < 1) {
            System.out.println("Invalid ID (must be over 0!)");
            return null;
        }

        getByIdStmt.setInt(1, id);
        ResultSet result =  getByIdStmt.executeQuery();

        Cities returnCities = null;

        while (result.next()) {
            returnCities =  new Cities();
            returnCities.setId(result.getInt(1));
            returnCities.setName(result.getString(2));
            returnCities.setCountry(result.getInt(3));
            returnCities.setCapital(result.getInt(4));
            returnCities.setLatitude(result.getFloat(5));
            returnCities.setLongitude(result.getFloat(6));
        }
        return returnCities;
    }
    
    public boolean insert(Cities city) throws SQLException {
        if (city == null) {
            System.out.println("Cannot insert a null city!");
            return false;
        }

        insertStmt.setInt(1, city.getId());
        insertStmt.setString(2, city.getName());
        insertStmt.setInt(3, city.getCountry());
        insertStmt.setInt(4, city.getCapital());
        insertStmt.setFloat(5, city.getLatitude());
        insertStmt.setFloat(6, city.getLongitude());

        return insertStmt.execute();
    }

    public boolean deleteAll() throws SQLException {
        return deleteAllStmt.execute();
    }
    
    
}