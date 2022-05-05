package database;

import database.connections.MyDatabaseConn;
import database.daos.*;
import database.entities.*;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author Adm
 */
public class DatabaseManager {    
    private CitiesDao cityDao;
    private ContinentsDao continentDao;
    private CountriesDao countryDao;
    
    public DatabaseManager(){
        try {
            cityDao = new CitiesDao();
            continentDao = new ContinentsDao();
            countryDao = new CountriesDao();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    
    public void compulsory(){
        try{
            Countries country1 = new Countries(10, "Romania", "155", "Europe");
            Countries country2 = new Countries(11, "Ukraine", "156", "Europe");

            System.out.println("First, we create a connection to the database.");
            CountriesDao countryDao = new CountriesDao();

            System.out.println("Then, we delete all entities in the 'countries' table.");
            countryDao.deleteAll();

            System.out.println("After deletion, we insert two countries:");
            System.out.println("Country 1: " + country1);
            System.out.println("Country 2: " + country2);
            countryDao.insert(country1);
            countryDao.insert(country2);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
    
}
