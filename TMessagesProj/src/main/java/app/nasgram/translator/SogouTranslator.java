package app.nasgram.translator;

/** Stub — Sogou translation provider (not yet implemented). */
public class SogouTranslator extends BaseTranslator {

    private static final SogouTranslator INSTANCE = new SogouTranslator();

    public static SogouTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public Result translate(String text, String from, String to) throws Exception {
        throw new UnsupportedOperationException("SogouTranslator is not available");
    }

    @Override
    public boolean supportLanguage(String language) {
        return false;
    }
}
