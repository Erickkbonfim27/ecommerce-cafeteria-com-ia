package br.com.cafeteria.inteligente.imagem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class ImagemUtils {
    public static byte[] decodeBase64ToImage(String base64Image) {
        return Base64.getDecoder().decode(base64Image);
    }
    public static String encodeImageToBase64(File imageFile) throws IOException {
        try (FileInputStream imageInFile = new FileInputStream(imageFile)) {
            byte[] imageData = new byte[(int) imageFile.length()];
            imageInFile.read(imageData);
            return Base64.getEncoder().encodeToString(imageData);
        }
    }
}
