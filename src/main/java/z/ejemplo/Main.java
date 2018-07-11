package z.ejemplo;

import static spark.Spark.get;

/**
 *
 * @author Christian
 */
public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Página de inicio...");
    }

}
