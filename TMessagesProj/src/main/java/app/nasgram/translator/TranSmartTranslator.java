package app.nasgram.translator;

/** Stub — TranSmart (Tencent) translation provider (not yet implemented). */
public class TranSmartTranslator extends BaseTranslator {

    private static final TranSmartTranslator INSTANCE = new TranSmartTranslator();

    public static TranSmartTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public Result translate(String text, String from, String to) throws Exception {
        throw new UnsupportedOperationException("TranSmartTranslator is not available");
    }

    @Override
    public boolean supportLanguage(String language) {
        return false;
    }
}
