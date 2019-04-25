package by.epam.shapes.validator;

import java.io.File;

public class PathValidator {
    public static boolean isValidPath(String path) {
        if (path == null) {
            return false;
        }
        File file = new File(path);
        return (file.exists() && file.isFile() && file.canRead());
    }
}
