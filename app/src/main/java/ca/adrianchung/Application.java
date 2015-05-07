package ca.adrianchung;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public void run() {
        logger.info("I am running!");
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }
}
