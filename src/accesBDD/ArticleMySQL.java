package accesBDD;

import java.sql.*;
import scannette.classeMetier.Article;

public class ArticleMySQL {

    private final Connection laConnection = Connexion.getConnect("Localhost",
            "bdmagasin",
            "adminBDMag",
            "mdpBDMag");

    public Article readArticle(int no) {

        Article lArticle = null;

        try {
            PreparedStatement prepStmt = null;
            String sql = "SELECT * FROM article WHERE id=? ";

            prepStmt = laConnection.prepareStatement(sql);
            prepStmt.setInt(1, no);            
            ResultSet result = prepStmt.executeQuery();
            if (result.next()) {
                System.out.println("no "+result.getInt(1));
                System.out.println("result "+result);
                lArticle = new Article(result.getInt(1), result.getString(2),result.getFloat(3));              
            }
            prepStmt.close();
        } catch (SQLException ex) {
            System.out.println("SQLExeption : " + ex.getMessage());
            System.out.println("SQLState : " + ex.getSQLState());
            System.out.println("Code erreur : " + ex.getErrorCode());
        }

        return lArticle;
    }

}
