package exercise_2;

public class FS {

  FileSystemComposite parent;

  public FS(FileSystemComposite parent) {
    this.parent = parent;
  }

  public FileSystemComposite getParent() {
    return parent;
  }

}
