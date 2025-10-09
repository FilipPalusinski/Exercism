public class LogLevels {
    
    public static String message(String logLine) {
        int startingIndex = logLine.indexOf("]:");
        if (startingIndex == -1) {
            return logLine.trim();
        }
        String message = logLine.substring(startingIndex + 2);
        return message.trim();
    }

    public static String logLevel(String logLine) {
        int startIndex = logLine.indexOf("[") + 1;
        int endIndex = logLine.indexOf("]");
         if (startIndex == 0 || endIndex == -1) {
            return "";
        }
        
        return logLine.substring(startIndex, endIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
