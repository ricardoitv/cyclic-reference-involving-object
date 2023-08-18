import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.auth.credentials.WebIdentityTokenFileCredentialsProvider
import java.nio.file.Paths

object Main extends App {
  println("Hello world!")
  println(msg)
  somethingElse()

  def msg = "blah"

  def somethingElse(): AwsCredentialsProvider = {
    WebIdentityTokenFileCredentialsProvider.builder
      .roleArn("dummy")
      .roleSessionName("Dummy")
      .webIdentityTokenFile(Paths.get("."))
      .build
  }
}
