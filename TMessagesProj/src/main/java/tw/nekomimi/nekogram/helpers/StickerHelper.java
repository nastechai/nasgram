package tw.nekomimi.nasgram.helpers;

import android.graphics.Bitmap;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.RLottieDrawable;

import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class StickerHelper {
    private static final Executor rendererExecutor = Executors.newCachedThreadPool();

    public static void convertStickerFormat(String path, boolean animated, Consumer<String> callback) {
        // GIF export is not available in this build.
        FileLog.d("GIF export not supported");
    }
}
