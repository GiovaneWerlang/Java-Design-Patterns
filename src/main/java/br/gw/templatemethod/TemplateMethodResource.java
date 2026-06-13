package br.gw.templatemethod;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Tag(name="Behavioral")
@Path("/templatemethod")
public class TemplateMethodResource {

    @GET
    public void execute() {
        List<String> lines = new ArrayList<>(List.of("Name","John"));
        ExporterMethod exporterMethod = null;

        exporterMethod = new CsvExport();
        File file = exporterMethod.export(lines);
        System.out.println(file.getName());
        file.delete();

        exporterMethod = new ExcelExport();
        file = exporterMethod.export(lines);
        System.out.println(file.getName());

        file.delete();
    }

}
