package com.sap.integration.utils.configuration;


/**
 * Class which provides method for getting/saving properties from/to the configuration file. <br>
 */
public class Property {

    public static final String ANW_PROTOCOL = "ANW_PROTOCOL";
    public static final String ANW_SERVER = "ANW_SERVER";
    public static final String ANW_PORT = "ANW_PORT";
    public static final String ANW_CERTIFICATE = "ANW_CERTIFICATE";

    public static final String IDP_PROTOCOL = "IDP_PROTOCOL";
    public static final String IDP_SERVER = "IDP_SERVER";
    public static final String IDP_PORT = "IDP_PORT";
    public static final String IDP_PATH = "IDP_PATH";

    public static final String APP_ID = "APP_ID";
    public static final String APP_SECRET = "APP_SECRET";
    public static final String REFRESH_TOKEN = "REFRESH_TOKEN";
    public static final String ACCESS_TOKEN = "ACCESS_TOKEN";

    public static final String SCHEDULER_ACTIVATION = "SCHEDULER_ACTIVATION";
    public static final String SCHEDULER_ACCESS_TOKEN = "SCHEDULER_ACCESS_TOKEN";
    public static final String SCHEDULER_INTEGRATION = "SCHEDULER_INTEGRATION";

    public static final String USE_DEFAULT_WAREHOUSE = "USE_DEFAULT_WAREHOUSE";
    public static final String DEFAULT_ANW_WAREHOUSE = "DEFAULT_ANW_WAREHOUSE";

    public static String getAnwProtocol() throws Exception {
        return PropertyLoader.loadProperty(ANW_PROTOCOL);
    }

    public static void saveAnwProtocol(String value) throws Exception {
        PropertyLoader.saveProperty(ANW_PROTOCOL, value);
    }

    public static String getAnwServer() throws Exception {
        return PropertyLoader.loadProperty(ANW_SERVER);
    }

    public static void saveAnwServer(String value) throws Exception {
        PropertyLoader.saveProperty(ANW_SERVER, value);
    }

    public static String getAnwPort() throws Exception {
        return PropertyLoader.loadProperty(ANW_PORT);
    }

    public static void saveAnwPort(String value) throws Exception {
        PropertyLoader.saveProperty(ANW_PORT, value);
    }

    public static String getAnwCertificate() throws Exception {
        return PropertyLoader.loadProperty(ANW_CERTIFICATE);
    }

    public static void saveAnwCertificate(String value) throws Exception {
        PropertyLoader.saveProperty(ANW_CERTIFICATE, value);
    }

    public static String getIdpProtocol() throws Exception {
        return PropertyLoader.loadProperty(IDP_PROTOCOL);
    }

    public static void saveIdpProtocol(String value) throws Exception {
        PropertyLoader.saveProperty(IDP_PROTOCOL, value);
    }

    public static String getIdpServer() throws Exception {
        return PropertyLoader.loadProperty(IDP_SERVER);
    }

    public static void saveIdpServer(String value) throws Exception {
        PropertyLoader.saveProperty(IDP_SERVER, value);
    }

    public static String getIdpPort() throws Exception {
        return PropertyLoader.loadProperty(IDP_PORT);
    }

    public static void saveIdpPort(String value) throws Exception {
        PropertyLoader.saveProperty(IDP_PORT, value);
    }

    public static String getIdpPath() throws Exception {
        return PropertyLoader.loadProperty(IDP_PATH);
    }

    public static void saveIdpPath(String value) throws Exception {
        PropertyLoader.saveProperty(IDP_PATH, value);
    }

    public static String getAppId() throws Exception {
        return PropertyLoader.loadProperty(APP_ID);
    }

    public static void saveAppId(String value) throws Exception {
        PropertyLoader.saveProperty(APP_ID, value);
    }

    public static String getAppSecret() throws Exception {
        return PropertyLoader.loadProperty(APP_SECRET);
    }

    public static void saveAppSecret(String value) throws Exception {
        PropertyLoader.saveProperty(APP_SECRET, value);
    }

    public static String getRefreshToken() throws Exception {
        return PropertyLoader.loadProperty(REFRESH_TOKEN);
    }

    public static void saveRefreshToken(String value) throws Exception {
        PropertyLoader.saveProperty(REFRESH_TOKEN, value);
    }

    public static String getAccessToken() throws Exception {
        return PropertyLoader.loadProperty(ACCESS_TOKEN);
    }

    public static void saveAccessToken(String value) throws Exception {
        PropertyLoader.saveProperty(ACCESS_TOKEN, value);
    }

    public static boolean getSchedulerActivation() throws Exception {
        return Boolean.valueOf(PropertyLoader.loadProperty(SCHEDULER_ACTIVATION));
    }

    public static void saveSchedulerActivation(String value) throws Exception {
        PropertyLoader.saveProperty(SCHEDULER_ACTIVATION, value);
    }

    public static String getSchedulerAccessToken() throws Exception {
        return PropertyLoader.loadProperty(SCHEDULER_ACCESS_TOKEN);
    }

    public static void saveSchedulerAccessToken(String value) throws Exception {
        PropertyLoader.saveProperty(SCHEDULER_ACCESS_TOKEN, value);
    }

    public static String getSchedulerIntegration() throws Exception {
        return PropertyLoader.loadProperty(SCHEDULER_INTEGRATION);
    }

    public static void saveSchedulerIntegration(String value) throws Exception {
        PropertyLoader.saveProperty(SCHEDULER_INTEGRATION, value);
    }

    public static String getDefaultAnwWarehouse() throws Exception {
        return PropertyLoader.loadProperty(DEFAULT_ANW_WAREHOUSE);
    }

    public static void saveDefaultAnwWarehouse(String value) throws Exception {
        PropertyLoader.saveProperty(DEFAULT_ANW_WAREHOUSE, value);
    }

    public static boolean getUseDefaultWarehouse() throws Exception {
        return Boolean.valueOf(PropertyLoader.loadProperty(USE_DEFAULT_WAREHOUSE));
    }

    public static void saveUseDefaultWarehouse(Boolean value) throws Exception {
        saveUseDefaultWarehouse(String.valueOf(value));
    }

    public static void saveUseDefaultWarehouse(String value) throws Exception {
        PropertyLoader.saveProperty(USE_DEFAULT_WAREHOUSE, value);
    }
}
