package br.gw.templatemethod;

import java.io.File;
import java.util.List;

public class CsvExport extends ExporterMethod {

    @Override
    public void addHeaders(File export, List<String> lines) {

    }

    @Override
    public void addRows(File export, List<String> lines) {

    }

    @Override
    public String getExtension() {
        return "csv";
    }

}
