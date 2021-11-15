package exercise_1;

import java.util.ArrayList;
import java.util.List;

public class FS {

  List<FSItem> entryList;

  public FS(List<FSItem> entryList) {
    this.entryList = entryList;
  }

  public FS() {
    entryList = new ArrayList<>();
  }

  public void addEntry(FSItem fsItem) {
    entryList.add(fsItem);
  }

  public List<FSItem> getEntryList() {
    return entryList;
  }

  public void setEntryList(List<FSItem> entryList) {
    this.entryList = entryList;
  }
}
