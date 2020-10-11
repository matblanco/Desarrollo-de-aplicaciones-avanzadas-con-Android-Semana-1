package semana1.curso3.coursera.restApi;

public class Constants {

    private static final String VERSION = "/v1/";

    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;

    public static final String ACCESS_TOKEN = "6953085721.0468ebf.84bfd0439f5b4b2ea6d236405311f71e";

    private static final String KEY_ACCESS_TOKEN = "access_token=";

    private static final String KEY_GET_SEARCH_USER = "users/search";

    private static final String KEY_GET_RECENT_MEDIA_USER_ID = "users/{user_id}/media/recent/?";

    static final String URL_GET_SEARCH_USER = KEY_GET_SEARCH_USER;

    static final String URL_GET_RECENT_MEDIA_USER_ID = KEY_GET_RECENT_MEDIA_USER_ID + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

}