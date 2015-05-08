package ca.adrianchung;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public void run() throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            logger.info("I am running!");
            Thread.sleep(1000L);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Application application = new Application();
        application.run();
    }
}
