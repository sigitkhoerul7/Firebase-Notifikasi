package sigit.firebasenotifikasi.app;

/**
 * Created by sigit on 26/07/17.
 */

public class Config {
//    global topic to receive app wide push notificatin

    public static final String TOPIC_GLOBAL = "global";

//    broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE ="registrationComplate";
    public static final String PUSH_NOTIFICATION = "pushNotification";

//    id handle the notifacations in the notifaications tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;
    public static final String SHARED_PREF = "ah_firebase";
}

