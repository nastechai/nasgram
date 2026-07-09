package app.nasgram.translator;

/** Stub — Lingo translation provider (not yet implemented). */
public class LingoTranslator extends BaseTranslator {

    private static final LingoTranslator INSTANCE = new LingoTranslator();

    public static LingoTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public Result translate(String text, String from, String to) throws Exception {
        throw new UnsupportedOperationException("LingoTranslator is not available");
    }

    @Override
    public boolean supportLanguage(String language) {
        return false;
    }
}
