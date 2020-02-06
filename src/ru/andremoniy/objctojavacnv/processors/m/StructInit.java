package ru.andremoniy.objctojavacnv.processors.m;

import org.antlr.runtime.tree.CommonTree;
import ru.andremoniy.objctojavacnv.ConverterM;
import ru.andremoniy.objctojavacnv.antlr.output.ObjcmLexer;
import ru.andremoniy.objctojavacnv.context.ExpressionContext;

/**
 * User: 1
 * Date: 10.09.13
 * Time: 9:42
 */
public class StructInit implements IProcessor {

    private StringBuilder sb;
    private CommonTree tree;
    private ExpressionContext exprCtx;

    public StructInit(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        this.sb = sb;
        this.tree = tree;
        this.exprCtx = exprCtx;
    }

    public void process() {
        String structName = tree.getFirstChildWithType(ObjcmLexer.NAME).getChild(0).toString();

        sb.append("new ").append(structName).append("(");

        int classicalExprCounter = 0;
        for (Object obj : tree.getChildren()) {
            CommonTree childTree = (CommonTree) obj;
            if (childTree.getType() == ObjcmLexer.CLASSICAL_EXPR) {
                if (++classicalExprCounter > 1) sb.append(", ");
                ConverterM.process_classical_expr(sb, childTree, exprCtx.newExpr(), false, false);
            }
        }

        sb.append(")");
    }
}
