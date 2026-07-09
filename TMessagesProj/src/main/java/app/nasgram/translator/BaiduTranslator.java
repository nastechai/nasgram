package app.nasgram.translator;

/** Stub — Baidu translation provider (not yet implemented). */
public class BaiduTranslator extends BaseTranslator {

    private static final BaiduTranslator INSTANCE = new BaiduTranslator();

    public static BaiduTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public Result translate(String text, String from, String to) throws Exception {
        throw new UnsupportedOperationException("BaiduTranslator is not available");
    }

    @Override
    public boolean supportLanguage(String language) {
        return false;
    }
}
