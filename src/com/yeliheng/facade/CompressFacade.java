package com.yeliheng.facade;

/**
 * 外观
 */
public class CompressFacade {

    private ImageReader imageReader = new ImageReader();

    private ImageCompression compression = new ImageCompression();

    public void compress() {
        compression.jpg(imageReader);
    }
}
