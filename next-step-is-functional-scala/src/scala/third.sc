import java.io.File
import java.nio.file.Paths

class DirectoryInfo(fullName: String) {
  def getFullName = fullName
}

val workingDirectory = new DirectoryInfo("/Users/anil/Code/java/next-step-is-functional-scala/");

val f: (Int) => String = { id: Int => {
  val path: String = new File(workingDirectory.getFullName, id + ".txt").toString;
  val lines = scala.io.Source.fromFile(Paths.get(path).toString).mkString

  lines
}
};

val f2: (Integer) => String =  { id: Integer =>  f(id) }

f2(2)
