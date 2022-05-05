import database.DatabaseManager;
import database.daos.CountriesDao;
import database.entities.Countries;

public class Main {
    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();

        databaseManager.compulsory();
    }
}