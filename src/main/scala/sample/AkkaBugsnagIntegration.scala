package sample

import akka.actor.ActorSystem

object AkkaBugsnagIntegration extends App {

  val system: ActorSystem = ActorSystem("helloAkka")

  import com.bugsnag.BugsnagAppender
  import org.slf4j.LoggerFactory

  val rootLogger = LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME).asInstanceOf[ch.qos.logback.classic.Logger]
  val appender = rootLogger.getAppender("BUGSNAG").asInstanceOf[BugsnagAppender]
  val client = appender.getClient
  rootLogger.error("This doesn't work")
  client.notify(new RuntimeException("This works"))
  rootLogger.error("This works as well", new RuntimeException("This works as well"))

}
