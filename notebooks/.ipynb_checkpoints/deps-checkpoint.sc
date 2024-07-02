import $ivy.`org.apache.spark::spark-sql:2.4.3`


import org.apache.spark.sql._


//Reducir numero logs
import org.apache.log4j.{Level, Logger}
Logger.getLogger("org").setLevel(Level.OFF)


//Circe para trabajar con JSON
import $ivy.`com.softwaremill.sttp.client::async-http-client-backend-monix:2.0.0-RC2`
import sttp.client.quick.{quickRequest, UriContext, backend}
import sttp.client.asynchttpclient.monix._


//Sttp para realizar request
import $ivy.`com.softwaremill.sttp.client::async-http-client-backend-monix:2.0.0-RC2`
import sttp.client.quick.{quickRequest, UriContext, backend}
import sttp.client.asynchttpclient.monix._
import sttp.client.basicRequest

//For adding extra dependenies
import $ivy.`org.typelevel::cats-core:1.6.0`


//Funciones
def createApiUri(category: String, widget: String, start_date: String, end_date: String, time_trunc: String) = {
    val baseUrl = s"https://apidatos.ree.es/es/datos/$category/$widget"
    val params = Map(
        "start_date" -> start_date,
        "end_date" -> end_date,
        "time_trunc" -> time_trunc
    ).map { case(k,v) => s"$k=$v"}.mkString("&")
  
    s"$baseUrl?$params"
}