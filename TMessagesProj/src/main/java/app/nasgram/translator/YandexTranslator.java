package app.nasgram.translator;

/** Stub — Yandex translation provider (not yet implemented). */
public class YandexTranslator extends BaseTranslator {

    private static final YandexTranslator INSTANCE = new YandexTranslator();

    public static YandexTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public Result translate(String text, String from, String to) throws Exception {
        throw new UnsupportedOperationException("YandexTranslator is not available");
    }

    @Override
    public boolean supportLanguage(String language) {
        return false;
    }
}
