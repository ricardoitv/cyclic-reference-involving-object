import software.amazon.awssdk.auth.credentials.WebIdentityTokenFileCredentialsProvider
import java.nio.file.Paths

object Main extends App {
  val builder = WebIdentityTokenFileCredentialsProvider.builder
  builder
    .roleArn("dummy")
    .roleSessionName("Dummy")
    .webIdentityTokenFile(Paths.get("."))
    .build
}
