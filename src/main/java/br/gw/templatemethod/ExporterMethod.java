package br.gw.templatemethod;

import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class ExporterMethod {

    public final File export(List<String> lines) {
        try {
            File export = openFile();
            addHeaders(export, lines);
            addRows(export, lines);
            return export;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public File openFile() throws IOException {
        File newFile = new File("report." + getExtension());
        newFile.delete();
        newFile.createNewFile();
        return newFile;
    }

    public abstract String getExtension();
    public abstract void addHeaders(File export, List<String> lines);
    public abstract void addRows(File export, List<String> lines);

}
