package de.htw.messenger

import scalaj.http.{Http, HttpOptions, HttpResponse}

/**
  * @author Vera
  */
object RegisterService {

  /**
    * Registers a new user.
    *
    * @param user the user to register.
    * @return true if registration at server succeeded.
    */
  def registerUser(user: User): Boolean = {

    val result: HttpResponse[Map[String, String]] = Http("http://localhost:8081/register")
      .postData(s"""{"name": "${user.name}", "email": "${user.email}", "password": "${user.password}"}""")
      .header("Content-Type", "application/json")
      .header("Charset", "UTF-8")
      .option(HttpOptions.readTimeout(10000))
      .asParamMap

    println(result.statusLine)
    println(s"HTTP status code: ${result.code}")

    result.code == 200

  }

}
