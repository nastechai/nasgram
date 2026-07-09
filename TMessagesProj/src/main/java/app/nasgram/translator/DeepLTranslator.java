package app.nasgram.translator;

/** Stub — DeepL translation provider (not yet implemented). */
public class DeepLTranslator extends BaseTranslator {

    private static final DeepLTranslator INSTANCE = new DeepLTranslator();

    public static DeepLTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public Result translate(String text, String from, String to) throws Exception {
        throw new UnsupportedOperationException("DeepLTranslator is not available");
    }

    @Override
    public boolean supportLanguage(String language) {
        return false;
    }
}
