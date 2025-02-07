package ai.mender.domain;

import ai.mender.output.TableOutput;

import java.io.PrintWriter;
import java.util.List;

public record FunctionListResponse (boolean success, String message, List<FunctionRec> items) {
    public void writeTableOutput(PrintWriter writer) {
        TableOutput.writeTableOutput(writer, this.items, FunctionRec.class);
    }
}
