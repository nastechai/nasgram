package app.nasgram.translator;

import java.util.Collections;
import java.util.List;

/** Stub — Google App translation provider (not yet implemented). */
public class GoogleAppTranslator extends BaseTranslator {

    private static final GoogleAppTranslator INSTANCE = new GoogleAppTranslator();

    public static GoogleAppTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public Result translate(String text, String from, String to) throws Exception {
        throw new UnsupportedOperationException("GoogleAppTranslator is not available");
    }

    @Override
    public boolean supportLanguage(String language) {
        return false;
    }

    @Override
    public List<String> getTargetLanguages() {
        return Collections.emptyList();
    }
}
