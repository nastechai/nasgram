package app.nasgram.translator;

import java.util.Collections;
import java.util.List;

/**
 * Base class for all translation providers.
 * Subclasses implement the actual HTTP calls to each provider.
 */
public abstract class BaseTranslator {

    public static class Result {
        public final String translation;
        public final String sourceLanguage;

        public Result(String translation, String sourceLanguage) {
            this.translation = translation;
            this.sourceLanguage = sourceLanguage;
        }
    }

    /**
     * Translate {@code text} from language {@code from} (may be null for auto-detect)
     * into language {@code to}.
     */
    public abstract Result translate(String text, String from, String to) throws Exception;

    public abstract boolean supportLanguage(String language);

    public List<String> getTargetLanguages() {
        return Collections.emptyList();
    }
}
