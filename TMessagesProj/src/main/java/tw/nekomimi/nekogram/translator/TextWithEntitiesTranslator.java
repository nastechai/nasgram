package tw.nekomimi.nasgram.translator;

import org.telegram.tgnet.TLRPC;

import java.util.Collections;
import java.util.List;

public class TextWithEntitiesTranslator implements Translator.ITranslator {

    private static final TextWithEntitiesTranslator INSTANCE = new TextWithEntitiesTranslator();

    public static TextWithEntitiesTranslator of(String type) {
        return INSTANCE;
    }

    @Override
    public Translator.TranslationResult translate(TLRPC.TL_textWithEntities query, String fl, String tl) throws Exception {
        throw new UnsupportedOperationException("Third-party translation providers are not available");
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
