package ru.andremoniy.objctojavacnv.processors.m;

import org.antlr.runtime.tree.CommonTree;
import ru.andremoniy.objctojavacnv.ConverterM;
import ru.andremoniy.objctojavacnv.antlr.output.ObjcmLexer;
import ru.andremoniy.objctojavacnv.context.BlockContext;
import ru.andremoniy.objctojavacnv.context.ExpressionContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Andremoniy
 * Date: 30.09.13
 * Time: 9:33
 */
public class TryCatch implements IProcessor {

    private StringBuilder sb;
    private CommonTree tree;
    private BlockContext blockCtx;

    public TryCatch(StringBuilder sb, CommonTree tree, BlockContext blockCtx) {
        this.sb = sb;
        this.tree = tree;
        this.blockCtx = blockCtx;
    }


    @Override
    public void process() {
        // double try-wrapping. Internal try-catch will produce exceptions of needed type
        // external try-catch will catch them
//        sb.append("try {\n");         -- off
        sb.append("try ");
        List<String> exceptionsList = new ArrayList<>();
        Map<String, CommonTree> catchBlocks = new HashMap<>();
        for (Object obj : tree.getChildren()) {
            CommonTree childTree = (CommonTree) obj;
            switch (childTree.getType()) {
                // todo: finally in separate block!
                case ObjcmLexer.BLOCK:
                    ConverterM.m_process_block(sb, childTree, blockCtx.newBlock());
                    break;
                case ObjcmLexer.CATCH_STMT:
                    String exceptionType = childTree.getFirstChildWithType(ObjcmLexer.EXC_TYPE).getChild(0).getText().trim();
                    exceptionsList.add(exceptionType);
                    catchBlocks.put(exceptionType, (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.BLOCK));
                    break;
            }
        }
        if (!exceptionsList.isEmpty()) {
//            sb.append(" catch (Exception e) {\n");
//            for (String exceptionType : exceptionsList) {
//                sb.append(" if (e instanceof ").append(exceptionType).append(") throw new ").append(exceptionType).append("();\n");
//            }
//            sb.append("}\n");
//            sb.append("} ");
            for (String exceptionType : exceptionsList) {
                sb.append(" catch(").append(exceptionType).append(" e) \n");
                CommonTree catchBlock = catchBlocks.get(exceptionType);
                if (catchBlock != null) {
                    ConverterM.m_process_block(sb, catchBlock, blockCtx.newBlock());
                } else {
                    sb.append("{ }");
                }
                sb.append("\n ");
            }
            CommonTree finallyBlock = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.FINALLY_BLOCK);
            if (finallyBlock != null) {
                sb.append(" finally \n");
                ConverterM.m_process_block(sb, finallyBlock, blockCtx.newBlock());
            }
        }
    }
}
