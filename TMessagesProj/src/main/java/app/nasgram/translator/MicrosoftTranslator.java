package app.nasgram.translator;

/** Stub — Microsoft translation provider (not yet implemented). */
public class MicrosoftTranslator extends BaseTranslator {

    private static final MicrosoftTranslator INSTANCE = new MicrosoftTranslator();

    public static MicrosoftTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public Result translate(String text, String from, String to) throws Exception {
        throw new UnsupportedOperationException("MicrosoftTranslator is not available");
    }

    @Override
    public boolean supportLanguage(String language) {
        return false;
    }
}
