package database.daos;

import database.connections.MyDatabaseConn;
import database.entities.Countries;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Adm
 */
public class CountriesDao {
    private final PreparedStatement getByIdStmt;
    private final PreparedStatement insertStmt;
    private final PreparedStatement deleteAllStmt;
    
    public CountriesDao() throws SQLException {
        Connection connection = MyDatabaseConn.getInstance().getConnection();
        getByIdStmt = connection.prepareStatement("select * from countries where id = ?");
        insertStmt = connection.prepareStatement("insert into countries values (?, ?, ?, ?)");
        deleteAllStmt = connection.prepareStatement("delete from countries");
    }
    
    public void create(String name) throws SQLException {
        Connection con = MyDatabaseConn.getConnection();
        try( PreparedStatement pstmt = con.prepareStatement(
        "insert into countries (name) values (?)") ){
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        }
    }
    
    //Countries
    public Integer findByName(String name) throws SQLException {
        Connection con = MyDatabaseConn.getConnection();
        try ( Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery(
              "select id from countries where name='" + name + "'")){
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    
    //Countries
    public Countries findById(int id) throws SQLException{
        if (id < 1) {
            System.out.println("Invalid ID (must be over 0!)");
            return null;
        }

        getByIdStmt.setInt(1, id);
        ResultSet result =  getByIdStmt.executeQuery();

        Countries returnCountries = null;

        while (result.next()) {
            returnCountries =  new Countries();
            returnCountries.setId(result.getInt(1));
            returnCountries.setName(result.getString(2));
            returnCountries.setCode(result.getString(3));
            returnCountries.setContinent(result.getString(4));
        }
        return returnCountries;
    }
    
    public boolean insert(Countries country) throws SQLException {
        if (country == null) {
            System.out.println("Cannot insert a null country!");
            return false;
        }

        insertStmt.setInt(1, country.getId());
        insertStmt.setString(2, country.getName());
        insertStmt.setString(3, country.getCode());
        insertStmt.setString(4, country.getContinent());

        return insertStmt.execute();
    }

    public boolean deleteAll() throws SQLException {
        return deleteAllStmt.execute();
    }
    
    
}