public class LogLine {
private String log;
    public LogLine(String logLine) {
         this.log = logLine;
    }

    public LogLevel getLogLevel() {
        String levelCode = log.substring(log.indexOf('[') + 1, log.indexOf(']'));

          switch (levelCode) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
          LogLevel level = getLogLevel();

        // extract message part (everything after "]:" + optional space)
        String message = log.substring(log.indexOf("]:") + 2).trim();

        // combine number and message
        return level.getNumberOfLogLevel() + ":" + message;
    }
}
