package de.htw.messenger

/**
  * Hello world!
  *
  */
object App {

  def main(args: Array[String]) {
    println("Hello World!")
    // TODO hier die Startview öffnen :-)
    val isSuccessful: Boolean = RegisterService.registerUser(User("test", "mail2", "123"))

    println(s"Success? $isSuccessful")

  }
}
