package exercise_1;

public abstract class AbstractFSItem implements FSItem {

  private String name;
  private final FSItem parent;
  private final String path;

  public AbstractFSItem(String name, FSItem parent, String path) {
    this.name = name;
    this.parent = parent;
    this.path = path;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getPath() {
    return path;
  }

  @Override
  public FSItem getParent() {
    return parent;
  }

}
