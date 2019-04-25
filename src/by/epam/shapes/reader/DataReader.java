package by.epam.shapes.reader;

import by.epam.shapes.validator.PathValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    private static final Logger logger = LogManager.getLogger();
    private static final String DEFAULT_FILE_NAME = "file\\Input.txt";
    public List<String> read(String path) {
        String filePath = PathValidator.isValidPath(path) ? path : DEFAULT_FILE_NAME;
        List<String> list;
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            //br returns as stream and convert it into a List
            list = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            logger.error("IOException", e);
            throw new RuntimeException("File can not be read", e);
        }
        return list;
    }
}