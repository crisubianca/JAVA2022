package database.daos;

import database.connections.MyDatabaseConn;
import database.entities.Continents;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Adm
 */
public class ContinentsDao {
    private final PreparedStatement getByIdStmt;
    private final PreparedStatement insertStmt;
    private final PreparedStatement deleteAllStmt;
    
    public ContinentsDao() throws SQLException {
        Connection connection = MyDatabaseConn.getInstance().getConnection();
        getByIdStmt = connection.prepareStatement("select * from continents where id = ?");
        insertStmt = connection.prepareStatement("insert into continents values (?, ?, ?, ?)");
        deleteAllStmt = connection.prepareStatement("delete from continents");
    }
    
    public void create(String name) throws SQLException {
        Connection con = MyDatabaseConn.getConnection();
        try( PreparedStatement pstmt = con.prepareStatement(
        "insert into continents (name) values (?)") ){
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        }
    }
    
    //Continent
    public Integer findByName(String name) throws SQLException {
        Connection con = MyDatabaseConn.getConnection();
        try ( Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery(
              "select id from continents where name='" + name + "'")){
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    
    //Continent
    public Continents findById(int id) throws SQLException{
        if (id < 1) {
            System.out.println("Invalid ID (must be over 0!)");
            return null;
        }

        getByIdStmt.setInt(1, id);
        ResultSet result =  getByIdStmt.executeQuery();

        Continents returnContinents = null;

        while (result.next()) {
            returnContinents =  new Continents();
            returnContinents.setId(result.getInt(1));
            returnContinents.setName(result.getString(2));
            returnContinents.setArea(result.getString(3));
            returnContinents.setPopulation(result.getInt(4));
        }
        return returnContinents;
    }
    
    public boolean insert(Continents continent) throws SQLException {
        if (continent == null) {
            System.out.println("Cannot insert a null continent!");
            return false;
        }

        insertStmt.setInt(1, continent.getId());
        insertStmt.setString(2, continent.getName());
        insertStmt.setString(3, continent.getArea());
        insertStmt.setInt(4, continent.getPopulation());

        return insertStmt.execute();
    }

    public boolean deleteAll() throws SQLException {
        return deleteAllStmt.execute();
    }
    
    
}
