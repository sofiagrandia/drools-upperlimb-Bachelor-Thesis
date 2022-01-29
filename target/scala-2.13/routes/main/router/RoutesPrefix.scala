// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/anaco/Documents/TFG/play-samples-play-java-starter-example/conf/routes
// @DATE:Sun Apr 25 19:26:44 CEST 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
