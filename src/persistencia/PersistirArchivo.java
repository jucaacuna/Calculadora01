package persistencia;

import com.google.gson.Gson;
import logica.OperacionA;

/*
 * Establece la forma de persistir en un archivo JSON.
 */
public class PersistirArchivo {

  public static String alJson(OperacionA o) {
    Gson gerson = new Gson();
    String oJSON = gerson.toJson(o);
    return oJSON;
  }



}
