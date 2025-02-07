package ai.mender.domain;

import ai.mender.output.TableOutput;

import java.io.PrintWriter;
import java.util.List;

public record SourceEditListResponse(boolean success, String message, List<SourceEdit> edits) {
    public void writeTableOutput(PrintWriter writer) {
        TableOutput.writeTableOutput(writer, this.edits, SourceEdit.class);
    }
}
