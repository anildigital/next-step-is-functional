import java.io.File
import java.nio.file.Paths

class DirectoryInfo(fullName: String) {
  def getFullName = fullName
}


val workingDirectory = new DirectoryInfo("/Users/anil/Code/java/next-step-is-functional-scala/");

val f = new Function1[Integer, String] {
  def apply( id: Integer) = {
    val path: String = new File(workingDirectory.getFullName, id + ".txt").toString;

    val lines = scala.io.Source.fromFile(Paths.get(path).toString).mkString

    lines;
  }
}


f(2)