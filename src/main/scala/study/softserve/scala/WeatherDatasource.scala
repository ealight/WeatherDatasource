package study.softserve.scala

object WeatherDatasource extends App {
  val consumerSettings = ConsumerInitializer.setUp()

  ConsumerInitializer.run(consumerSettings)
}
