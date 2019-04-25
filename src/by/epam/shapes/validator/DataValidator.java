package by.epam.shapes.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    private Pattern pattern;
    private Matcher matcher;
    private static final String REG_PATTERN = "(-?[0-9]*?\\.[0-9]*?\\s){14}(-?[0-9]*?\\.[0-9]*?)";

    public DataValidator() {
        pattern = Pattern.compile(REG_PATTERN);
    }

    public boolean validate(final String line) {
        matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
