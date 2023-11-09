package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author domin
 */
public class AccesAPI {

    private String adresseURL;
    private String[] param;
    private ArrayList<String> reponse = null;

    public String getAdresseURL() {
        return adresseURL;
    }

    public void setAdresseURL(String adresseURL) {
        this.adresseURL = adresseURL;
    }

    public String[] getParam() {
        return param;
    }

    public void setParam(String[] param) {
        this.param = param;
    }

    public ArrayList<String> getReponse() {
        return reponse;
    }

    @Override
    public String toString() {
        return "AccesAPI{" + "adresseURL=" + adresseURL + ", param=" + param + ", reponse=" + reponse + '}';
    }

    public AccesAPI(String adresseURL, String[] param) {
        this.adresseURL = adresseURL;
        this.param = param;
        envoieEtReceptionDonneesAvecHttpURL();
    }

    /**
     * envoiEtReceptionDonneesAvecHttpUEL
     * Appel au service web
     */
    private void envoieEtReceptionDonneesAvecHttpURL() {
        try {
            // Configuration de l'URL
            // Dans lesDonnées, les paramètres se suivent, séparés par un "/"
            String lesDonnees = "";
            for (String unParam : param) {
                lesDonnees += "/" + unParam;
            }
            URL url = URI.create(this.adresseURL + lesDonnees).toURL();
            System.out.println("url : " + url);

            // Configuration de la connexion au web service
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Configuration de la méthode HTTP utilisé pour joindre le web service
            conn.setRequestMethod("GET");

            // Connexion au web service
            conn.connect();

            // Déclaration du flux et du buffer de réception
            InputStream in = conn.getInputStream();
            BufferedReader BufferReception = new BufferedReader(new InputStreamReader(in));

            // Lecture de la réponse
            String ligneReponse = "";
            this.reponse = new ArrayList();

            try {
                do {
                    ligneReponse = BufferReception.readLine();
                    if (ligneReponse != null) {
                        reponse.add(ligneReponse);
                    }
                } while (ligneReponse != null); // (ligneReponse.length() > 0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // Fermeture de la connexion
            conn.disconnect();

//            for (String uneReponse: reponse) {
//                System.out.println("uneReponse : " + uneReponse);
//            }
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(this.getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
