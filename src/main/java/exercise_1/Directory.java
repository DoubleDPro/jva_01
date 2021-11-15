package exercise_1;

import java.util.List;

public class Directory extends AbstractFSItem {

  private List<FSItem> children;

  public Directory(String name, FSItem parent, String path) {
    super(name, parent, path);
  }

  public List<FSItem> getChildren() {
    return children;
  }


}
