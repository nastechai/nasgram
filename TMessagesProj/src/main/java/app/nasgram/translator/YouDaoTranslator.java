package app.nasgram.translator;

/** Stub — YouDao translation provider (not yet implemented). */
public class YouDaoTranslator extends BaseTranslator {

    private static final YouDaoTranslator INSTANCE = new YouDaoTranslator();

    public static YouDaoTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public Result translate(String text, String from, String to) throws Exception {
        throw new UnsupportedOperationException("YouDaoTranslator is not available");
    }

    @Override
    public boolean supportLanguage(String language) {
        return false;
    }
}
