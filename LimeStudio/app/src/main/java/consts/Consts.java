package consts;

import net.toload.main.hd.BuildConfig;

public class Consts {
    public static boolean isPubookPro() {
        return BuildConfig.FLAVOR.equals("PubuReaderPro");
    }
}
