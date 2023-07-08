public class SampleCodeWithSecrets {
    // Hardcoded Secret
    private static final String password = "mysecretpassword";

    // API Key
    private static final String apiKey = "1234567890abcdefghijklmnopqrstuvwxyz";

    // Database Connection String
    private static final String dbConnectionString = "mysql://username:password@hostname/database";

    // Encryption Key
    private static final String encryptionKey = "kji9876543210zyxwvutsrqponml";

    // OAuth Token
    private static final String oauthToken = "abcdefghijklmnopqrstuvwxyz1234567890";

    // Secret Key in Config File
    private static final String secretKey = Config.secretKey;

    // Secret in Environment Variable
    private static final String secret = System.getenv("MY_SECRET");

    // Private Key
    private static final String privateKey = "-----BEGIN RSA PRIVATE KEY-----\n"
            + "MIIEpAIBAAKCAQEAs9IYz2QKF8C/UHbTgE+MDkL78QzRJuVHnDS4js5CaADNFneM\n"
            + "...";

    // Access Token
    private static final String accessToken = "Bearer abcdefghijklmnopqrstuvwxyz1234567890";

    // Credentials in Keychain
    private static final String username = "my_username";
    private static final String password = Keytar.getPassword("my_service", username);

    // Secret in Comment
    // Secret: my_secret_key

    // Encryption Password in Function Call
    encrypt(data, "mypassword");

    // Database Credentials in Query String
    private static final String queryString = "user=myuser&password=mypassword&database=mydb";

    // Hardcoded API URL with Secret
    private static final String apiUrl = "https://api.example.com/endpoint?apikey=secretapikey";

    // Secret in URL Parameters
    private static final String url = "https://example.com/?secret=mysupersecret";

    // Secret in Query Parameter
    private static final String queryParam = "secret_key=mysupersecretkey";

    // Private SSH Key
    private static final String sshPrivateKey = "-----BEGIN RSA PRIVATE KEY-----\n"
            + "MIIEowIBAAKCAQEAsTmRH+avb5Ys1MtcZj2WLLAV7Pm5vq4S5stvHkN+ZiWcjA1V\n"
            + "...";

    // Secret in Constant Variable Name
    private static final String mySecret = "this_is_a_secret";

    // AWS Secret Access Key
    private static final String awsSecretAccessKey = "abcdefghijk1234567890lmnopqrstuvwxyz";

    // Hardcoded Token
    private static final String token = "mysecrettoken";

    // Other code goes here...
}