public class PropertiesUtil {

    private final static Properties prop;
    
    static {
        prop = new Properties();
        try {
            prop.load(PropertiesUtil.class.getResourceAsStream("/application.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Properties getProperties() {
        return prop;
    }
}
