package deringo.configuration;

public class ConfigTest {

    public static void main(String[] args) {
        System.out.println( "test.parameter must be false and is: " + Config.is("test.parameter") );
        String path = ConfigTest.class.getClassLoader().getResource("test.properties").getPath();
        System.setProperty("localconf", path);
        System.out.println( "test.parameter must be false and is: " + Config.is("test.parameter") );
        Config.reinit();
        System.out.println( "test.parameter must be true and is: " + Config.is("test.parameter") );
    }

}
