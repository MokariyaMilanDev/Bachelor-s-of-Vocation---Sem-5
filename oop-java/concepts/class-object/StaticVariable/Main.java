
class VersionControl {
   private static String version = "1.0.0";

   public static String getVersion() {
      return version;
   }
}

/**
 * Main
 */
public class Main {

   public static void main(String[] args) {
      String version = VersionControl.getVersion();
      System.out.println("Version " + version);
   }
}
