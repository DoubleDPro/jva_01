package exercise_2;

import java.util.ArrayList;
import java.util.List;

public abstract class FileSystemComposite implements FSItem {

  private String name;
  private String path;

  private final List<FileSystemComposite> children = new ArrayList<>();

  public FileSystemComposite(String name, String path) {
    this.name = name;
    this.path = path;
  }

  public void add(FileSystemComposite fileSystemComposite) {
    children.add(fileSystemComposite);
  }

  public int count() {
    return children.size();
  }

  public String getPath() {
    return this.path;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<FileSystemComposite> getChildren() {
    return children;
  }

  public void print() {
    children.forEach(FileSystemComposite::print);
  }

  @Override
  public String toString() {
    return "FileSystemComposite{" +
        "name='" + name + '\'' +
        ", path='" + path + '\'' +
        '}';
  }
}
