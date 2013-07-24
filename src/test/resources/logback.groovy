import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.status.OnConsoleStatusListener

import static ch.qos.logback.classic.Level.*

statusListener(OnConsoleStatusListener)

appender("FILE", RollingFileAppender) {
    file = "resper-service.log"
//    rollingPolicy(TimeBasedRollingPolicy) {
//        fileNamePattern = "resper-service.%d{yyyy-MM-dd}.log"
//        maxHistory = 30
//    }
    encoder(PatternLayoutEncoder) {
        pattern =  "%-5level %d{HH:mm:ss.SSS} [%thread] %logger{36} - %msg%n"
    }
}

appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%-5level %d{HH:mm:ss.SSS} [%thread]  %logger{56} - %msg%n"
    }
}
logger("org.springframework", INFO)

logger("org.apache.commons", INFO)
logger("org.eclipse", INFO)
logger("org.hibernate", INFO)
logger("net.sf.jasperreports.engine.fill", INFO)

logger("org.springframework.util", DEBUG)
logger("org.springframework.web", DEBUG)
logger("za.co.imqs", DEBUG)

logger("za.co.imqs.report", TRACE)

root(DEBUG, ["FILE", "CONSOLE"])

scan()