package app.nasgram.gifski;

import android.graphics.Bitmap;

/**
 * Stub implementation — the gifski native library is not bundled.
 * GIF export will be silently skipped (renderToGif returns false).
 */
public class Gifski {

    public static class Settings {
        private int width, height, quality;
        private short repeat;

        public void setWidth(int width) { this.width = width; }
        public void setHeight(int height) { this.height = height; }
        public void setQuality(int quality) { this.quality = quality; }
        public void setRepeat(short repeat) { this.repeat = repeat; }
    }

    public Gifski(Settings settings) {}

    public void setFileOutput(String path) {}

    public void addFrameBitmap(int framePosition, Bitmap bitmap, double pts) throws Exception {
        throw new UnsupportedOperationException("gifski library is not available");
    }

    public void finish() throws Exception {
        throw new UnsupportedOperationException("gifski library is not available");
    }
}
