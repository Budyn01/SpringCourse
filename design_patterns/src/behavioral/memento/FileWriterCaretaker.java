package behavioral.memento;

/**
 * Created by Budyn on 06.05.2018.
 */
public class FileWriterCaretaker {
    private Object obj;

    public void save(FileWriterUtil fileWriter) {
        this.obj = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(obj);
    }
}
