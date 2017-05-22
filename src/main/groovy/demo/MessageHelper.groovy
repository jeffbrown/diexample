package demo

import groovy.util.logging.Slf4j

@Slf4j
class MessageHelper {

    void logMessage(String message) {
        log.info message
    }

}
