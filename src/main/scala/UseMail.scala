
object Mail {
  import Mail._

  def main(args: Array[String]): Unit = {

//simple mail
  send a new Mail (

    from = ("sivaram@gmail.com", "siva"),   // from email id and name FYI : name is optional
    to = "rahul@gmail.com",				 // to Email id	
    cc = "siva@gmail.com",				// cc is optional 
    subject = "Import stuff",			
    message = "Dear user  ..."
  )

   // for rich message
  
  send a new Mail (
    from = "sivaram@gmail.com" -> "sivaram",
    to = Seq("dev@mycompany.com", "marketing@mycompany.com"),
    subject = "Our New Strategy (tm)",
    message = "Please find attach the latest strategy document.",
    richMessage = "Here's the <blink>latest</blink> <strong>Strategy</strong>..."
  )
// for Multimedia 
  send a new Mail (
    from = "sivaram@gmail.com" -> "sivaram",
    to = "dev@mycompany.com" :: "marketing@mycompany.com" :: Nil,
    subject = "Our 5-year plan",
    message = "Here is the presentation with the stuff we're going to for the next five years.",
    attachment = new java.io.File("/home/boss/important-presentation.ppt")
  )
}}