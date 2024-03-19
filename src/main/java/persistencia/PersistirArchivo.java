package persistencia;

import com.google.gson.Gson;
import logica.OperacionA;
import java.io.FileWriter;

/*
 * Establece la forma de persistir en un archivo JSON.
 */
public class PersistirArchivo {

  public static String alJson(OperacionA o) {
    Gson gerson = new Gson();
    String oJSON = gerson.toJson(o);
    return oJSON;
  }

  public static void alArchivo(OperacionA a) {
    Gson gerson = new Gson();
    try {
      FileWriter f = new FileWriter("archivito.json", true);
      gerson.toJson(a, f);
      f.flush();
      f.close();
    } catch (Exception e) {
      System.out.println("# TODO MAL CON EL ARCHIVO #");
      e.printStackTrace();
    }
  }

}
