import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.auth.credentials.WebIdentityTokenFileCredentialsProvider
import java.nio.file.Paths

@main def hello: Unit =
  println("Hello world!")
  println(msg)
  somethingElse()

def msg = "I was compiled by Scala 3. :)"

def somethingElse(): AwsCredentialsProvider =
  WebIdentityTokenFileCredentialsProvider.builder
    .roleArn("dummy")
    .roleSessionName("Dummy")
    .webIdentityTokenFile(Paths.get("."))
    .build
