public abstract class IDEOperation {
  private Compiler cmp;
  private Runtime rtime;

  public void compile(String javaFile) {
    cmp.compile(javaFile);
  }

  public void run(String classFile) {
    rtime.run (classFile);
  }

  //to be delayed until needed.
  public abstract void generateDocs(String javaFile);


  public IDEOperation() {
    cmp = new Compiler();
    rtime = new Runtime();
  }
}

class Compiler {

public void compile(String fileName) {
        System.out.println("Estoy compilando: " + fileName);
    }
}

class Runtime {

public void run(String fileName) {
        System.out.println("Estoy ejecutando: " + fileName);
    }
}