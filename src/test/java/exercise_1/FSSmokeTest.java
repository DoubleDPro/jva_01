package exercise_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FSSmokeTest {

  @Test
  void smokeTest() {
    FSItem parentDirectory =
        new Directory("Parent directory", null, "/home/parent_directory/");
    FSItem directory =
        new Directory("Directory", parentDirectory, "/home/parent_directory/directory");
    FSItem file =
        new File("File", directory, "/home/parent_directory/directory/file");
    FSItem link =
        new Link("Link to directory", parentDirectory, "/home/parent_directory/directory/link", directory);
    FS fileSystem = new FS();
    fileSystem.addEntry(parentDirectory);
    fileSystem.addEntry(directory);
    fileSystem.addEntry(file);
    fileSystem.addEntry(link);
    assertEquals(4, fileSystem.getEntryList().size());
  }

}