package disco.db.server;

import disco.base.Result;
import disco.base.SearchResult;
import disco.base.AINode;
import disco.db.common.Discovery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DiscoverySQLLite implements Discovery {

    Connection connection;
    String classSQLLite = "org.sqlite.JDBC";
    String dbName = "jdbc:sqlite:disco.db";

    void createTableIfNotPesent()
    {
        String createTable="";
    }

    @Override
    public Result register(AINode node) {
        Result result = new Result();
        try {
            Class.forName(classSQLLite);
            this.connection = DriverManager.getConnection(dbName);
            if (this.connection != null) {
                Statement stmt= this.connection.createStatement();

            }
        } catch (ClassNotFoundException | SQLException e) {
            result.setErrorCode(-1);
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Result deregister(String nodeId) {
        return null;
    }

    @Override
    public SearchResult find(String query) {
        return null;
    }
}
