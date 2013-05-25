package step2;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.lang.WordUtils;

public class App
{
    static Log log = LogFactory.getLog(App.class);
    public static void main( String[] args )
    {
        log.fatal("fatal log sample");
        log.error("error log sample");
        log.warn("warn log sample");
        log.info("info log sample");
        log.debug("debug log sample");
        log.trace("trace log sample");
        System.out.println(WordUtils.swapCase("Hello World!"));
    }
}
