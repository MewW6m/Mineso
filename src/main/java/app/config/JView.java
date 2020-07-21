package app.config;

/**
 * JView<br>
 * JsonView構造
 * @author MewW6m　(https://github.com/MewW6m)
 */
public class JView {

    public static interface Ignore {
    }

    public static interface Public {
    }

    public static interface UserInfo extends Public {
    }

    public static interface UserDetail extends UserInfo {
    }

    public static interface NortificationInfo extends Public {
    }

    public static interface TagInfo  extends Public{
    }

    public static interface AppInfo  extends Public{
    }

    public static interface Profile extends Public {
    }

    public static interface Account extends Public {
    }

    public static interface Nortification extends Public {
    }

    public static interface Customize extends Public {
    }

    public static interface commonSetting extends Profile, Account, Nortification, Customize{
    }

    public static interface follow extends Public{}
    public static interface follower extends Public{}
}
