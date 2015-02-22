import java.io.File
import java.nio.file.Paths

class DirectoryInfo(fullName: String) {
  def getFullName = fullName
}

val f = new Function2[DirectoryInfo, Integer, String] {
  def apply(workingDirectory: DirectoryInfo, id: Integer) = {
    val path: String = new File(workingDirectory.getFullName, id + ".txt").toString;

    val lines = scala.io.Source.fromFile(Paths.get(path).toString).mkString

    lines;
  }
}


val workingDirectory = new DirectoryInfo("/Users/anil/Code/java/next-step-is-functional-scala/");


f(workingDirectory, 2)