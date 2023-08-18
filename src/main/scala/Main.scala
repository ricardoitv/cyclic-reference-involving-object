import software.amazon.awssdk.auth.credentials.WebIdentityTokenFileCredentialsProvider
import java.nio.file.Paths

object Main extends App {
  WebIdentityTokenFileCredentialsProvider.builder
    .roleArn("dummy")
    .roleSessionName("Dummy")
    .webIdentityTokenFile(Paths.get("."))
    .build
}
