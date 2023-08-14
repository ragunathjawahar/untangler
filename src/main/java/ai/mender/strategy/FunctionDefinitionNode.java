package ai.mender.strategy;

import ai.mender.domain.FunctionRec;
import org.antlr.v4.runtime.ParserRuleContext;

public interface FunctionDefinitionNode<T extends ParserRuleContext> {
    default int getStartLine()  {
        return getAntlrNode().start.getLine();
    }

    default FunctionRec toFunctionRec() {
        return new FunctionRec(getName(), getStartLine());
    }

    String getName();

    T getAntlrNode();
}