// $ANTLR 3.4 C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g 2013-09-11 09:48:45

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PreprocessorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASTERISK", "BACKSLASH", "COMMENT", "DEFINE", "DEFINED", "DIGIT", "ELIF", "ELSE", "ENDIF", "EXC", "ID", "IF", "IFDEF", "IFNDEF", "IMPORT", "INCLUDE", "LETTER", "L_BR", "L_SHFT", "L_UBR", "MATH_OP", "MINUS", "NUMBER", "PLUS", "POINTS3", "QUOTE", "RESERVED_WORDS", "RET", "R_BR", "R_SHFT", "R_UBR", "SINGLE_COMMENT", "SPECIAL_CHARS", "T_BACKSLASH", "T_BLOCK", "T_COND_OP", "T_DEFINE", "T_EXPRESSION", "T_EX_AND", "T_EX_COND", "T_EX_DEF", "T_EX_MATH", "T_EX_NOT", "T_EX_OP", "T_EX_OR", "T_EX_SNGL", "T_FILENAME", "T_ID", "T_IF_DEFINE", "T_IF_ELSE", "T_IF_MAIN", "T_IF_NOT_DEFINE", "T_IF_SIMPLE", "T_IMPORT", "T_INCLUDE", "T_IN_BRACKETS", "T_NAME", "T_PARAM", "T_PATH", "T_REPLACE", "WS", "'&&'", "','", "'.'", "'/'", "'<='", "'=='", "'>='", "'\\'#\\''", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int ASTERISK=4;
    public static final int BACKSLASH=5;
    public static final int COMMENT=6;
    public static final int DEFINE=7;
    public static final int DEFINED=8;
    public static final int DIGIT=9;
    public static final int ELIF=10;
    public static final int ELSE=11;
    public static final int ENDIF=12;
    public static final int EXC=13;
    public static final int ID=14;
    public static final int IF=15;
    public static final int IFDEF=16;
    public static final int IFNDEF=17;
    public static final int IMPORT=18;
    public static final int INCLUDE=19;
    public static final int LETTER=20;
    public static final int L_BR=21;
    public static final int L_SHFT=22;
    public static final int L_UBR=23;
    public static final int MATH_OP=24;
    public static final int MINUS=25;
    public static final int NUMBER=26;
    public static final int PLUS=27;
    public static final int POINTS3=28;
    public static final int QUOTE=29;
    public static final int RESERVED_WORDS=30;
    public static final int RET=31;
    public static final int R_BR=32;
    public static final int R_SHFT=33;
    public static final int R_UBR=34;
    public static final int SINGLE_COMMENT=35;
    public static final int SPECIAL_CHARS=36;
    public static final int T_BACKSLASH=37;
    public static final int T_BLOCK=38;
    public static final int T_COND_OP=39;
    public static final int T_DEFINE=40;
    public static final int T_EXPRESSION=41;
    public static final int T_EX_AND=42;
    public static final int T_EX_COND=43;
    public static final int T_EX_DEF=44;
    public static final int T_EX_MATH=45;
    public static final int T_EX_NOT=46;
    public static final int T_EX_OP=47;
    public static final int T_EX_OR=48;
    public static final int T_EX_SNGL=49;
    public static final int T_FILENAME=50;
    public static final int T_ID=51;
    public static final int T_IF_DEFINE=52;
    public static final int T_IF_ELSE=53;
    public static final int T_IF_MAIN=54;
    public static final int T_IF_NOT_DEFINE=55;
    public static final int T_IF_SIMPLE=56;
    public static final int T_IMPORT=57;
    public static final int T_INCLUDE=58;
    public static final int T_IN_BRACKETS=59;
    public static final int T_NAME=60;
    public static final int T_PARAM=61;
    public static final int T_PATH=62;
    public static final int T_REPLACE=63;
    public static final int WS=64;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public PreprocessorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PreprocessorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return PreprocessorParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g"; }


    public static class code_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:45:1: code : ( code_fragment )+ EOF ;
    public final PreprocessorParser.code_return code() throws RecognitionException {
        PreprocessorParser.code_return retval = new PreprocessorParser.code_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        PreprocessorParser.code_fragment_return code_fragment1 =null;


        Object EOF2_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:45:6: ( ( code_fragment )+ EOF )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:45:8: ( code_fragment )+ EOF
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:45:8: ( code_fragment )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ASTERISK && LA1_0 <= DIGIT)||(LA1_0 >= EXC && LA1_0 <= 73)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:45:8: code_fragment
            	    {
            	    pushFollow(FOLLOW_code_fragment_in_code160);
            	    code_fragment1=code_fragment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, code_fragment1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_code165); 
            EOF2_tree = 
            (Object)adaptor.create(EOF2)
            ;
            adaptor.addChild(root_0, EOF2_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "code"


    public static class smth_else_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "smth_else"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:49:1: smth_else : (~ ( DEFINE | IMPORT | IF | ELSE | ENDIF | IFDEF | IFNDEF | ELIF ) )+ ;
    public final PreprocessorParser.smth_else_return smth_else() throws RecognitionException {
        PreprocessorParser.smth_else_return retval = new PreprocessorParser.smth_else_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set3=null;

        Object set3_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:50:2: ( (~ ( DEFINE | IMPORT | IF | ELSE | ENDIF | IFDEF | IFNDEF | ELIF ) )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:50:4: (~ ( DEFINE | IMPORT | IF | ELSE | ENDIF | IFDEF | IFNDEF | ELIF ) )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:50:4: (~ ( DEFINE | IMPORT | IF | ELSE | ENDIF | IFDEF | IFNDEF | ELIF ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==INCLUDE) ) {
                    alt2=1;
                }
                else if ( ((LA2_0 >= ASTERISK && LA2_0 <= COMMENT)||(LA2_0 >= DEFINED && LA2_0 <= DIGIT)||(LA2_0 >= EXC && LA2_0 <= ID)||(LA2_0 >= LETTER && LA2_0 <= 73)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    set3=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ASTERISK && input.LA(1) <= COMMENT)||(input.LA(1) >= DEFINED && input.LA(1) <= DIGIT)||(input.LA(1) >= EXC && input.LA(1) <= ID)||(input.LA(1) >= INCLUDE && input.LA(1) <= 73) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set3)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "smth_else"


    public static class code_fragment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code_fragment"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:51:1: code_fragment : ( define_directive | import_declaration | if_simple_check_wrapper | if_define_block_wrapper | if_not_define_block_wrapper | smth_else );
    public final PreprocessorParser.code_fragment_return code_fragment() throws RecognitionException {
        PreprocessorParser.code_fragment_return retval = new PreprocessorParser.code_fragment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.define_directive_return define_directive4 =null;

        PreprocessorParser.import_declaration_return import_declaration5 =null;

        PreprocessorParser.if_simple_check_wrapper_return if_simple_check_wrapper6 =null;

        PreprocessorParser.if_define_block_wrapper_return if_define_block_wrapper7 =null;

        PreprocessorParser.if_not_define_block_wrapper_return if_not_define_block_wrapper8 =null;

        PreprocessorParser.smth_else_return smth_else9 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:52:2: ( define_directive | import_declaration | if_simple_check_wrapper | if_define_block_wrapper | if_not_define_block_wrapper | smth_else )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:52:4: define_directive
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_define_directive_in_code_fragment216);
                    define_directive4=define_directive();

                    state._fsp--;

                    adaptor.addChild(root_0, define_directive4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:53:4: import_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_import_declaration_in_code_fragment221);
                    import_declaration5=import_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, import_declaration5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:54:4: if_simple_check_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_simple_check_wrapper_in_code_fragment226);
                    if_simple_check_wrapper6=if_simple_check_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, if_simple_check_wrapper6.getTree());

                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:55:4: if_define_block_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_define_block_wrapper_in_code_fragment231);
                    if_define_block_wrapper7=if_define_block_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, if_define_block_wrapper7.getTree());

                    }
                    break;
                case 5 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:56:4: if_not_define_block_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_not_define_block_wrapper_in_code_fragment236);
                    if_not_define_block_wrapper8=if_not_define_block_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, if_not_define_block_wrapper8.getTree());

                    }
                    break;
                case 6 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:57:4: smth_else
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_smth_else_in_code_fragment241);
                    smth_else9=smth_else();

                    state._fsp--;

                    adaptor.addChild(root_0, smth_else9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "code_fragment"


    public static class ret_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ret"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:60:1: ret : ( RET )+ ;
    public final PreprocessorParser.ret_return ret() throws RecognitionException {
        PreprocessorParser.ret_return retval = new PreprocessorParser.ret_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RET10=null;

        Object RET10_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:60:5: ( ( RET )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:60:7: ( RET )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:60:7: ( RET )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RET) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:60:7: RET
            	    {
            	    RET10=(Token)match(input,RET,FOLLOW_RET_in_ret252); 
            	    RET10_tree = 
            	    (Object)adaptor.create(RET10)
            	    ;
            	    adaptor.addChild(root_0, RET10_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ret"


    public static class if_not_define_block_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_not_define_block_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:62:1: if_not_define_block_wrapper : if_not_define_block -> ^( T_IF_NOT_DEFINE if_not_define_block ) ;
    public final PreprocessorParser.if_not_define_block_wrapper_return if_not_define_block_wrapper() throws RecognitionException {
        PreprocessorParser.if_not_define_block_wrapper_return retval = new PreprocessorParser.if_not_define_block_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.if_not_define_block_return if_not_define_block11 =null;


        RewriteRuleSubtreeStream stream_if_not_define_block=new RewriteRuleSubtreeStream(adaptor,"rule if_not_define_block");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:63:2: ( if_not_define_block -> ^( T_IF_NOT_DEFINE if_not_define_block ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:63:4: if_not_define_block
            {
            pushFollow(FOLLOW_if_not_define_block_in_if_not_define_block_wrapper262);
            if_not_define_block11=if_not_define_block();

            state._fsp--;

            stream_if_not_define_block.add(if_not_define_block11.getTree());

            // AST REWRITE
            // elements: if_not_define_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:24: -> ^( T_IF_NOT_DEFINE if_not_define_block )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:63:27: ^( T_IF_NOT_DEFINE if_not_define_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_NOT_DEFINE, "T_IF_NOT_DEFINE")
                , root_1);

                adaptor.addChild(root_1, stream_if_not_define_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_not_define_block_wrapper"


    public static class if_not_define_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_not_define_block"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:65:1: if_not_define_block : ( ifndef1 | ifndef2 ) ret main_code_block ( ELSE ret else_code_block )? ENDIF ;
    public final PreprocessorParser.if_not_define_block_return if_not_define_block() throws RecognitionException {
        PreprocessorParser.if_not_define_block_return retval = new PreprocessorParser.if_not_define_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE16=null;
        Token ENDIF19=null;
        PreprocessorParser.ifndef1_return ifndef112 =null;

        PreprocessorParser.ifndef2_return ifndef213 =null;

        PreprocessorParser.ret_return ret14 =null;

        PreprocessorParser.main_code_block_return main_code_block15 =null;

        PreprocessorParser.ret_return ret17 =null;

        PreprocessorParser.else_code_block_return else_code_block18 =null;


        Object ELSE16_tree=null;
        Object ENDIF19_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:66:2: ( ( ifndef1 | ifndef2 ) ret main_code_block ( ELSE ret else_code_block )? ENDIF )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:66:4: ( ifndef1 | ifndef2 ) ret main_code_block ( ELSE ret else_code_block )? ENDIF
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:66:4: ( ifndef1 | ifndef2 )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IFNDEF) ) {
                alt5=1;
            }
            else if ( (LA5_0==IF) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:66:5: ifndef1
                    {
                    pushFollow(FOLLOW_ifndef1_in_if_not_define_block281);
                    ifndef112=ifndef1();

                    state._fsp--;

                    adaptor.addChild(root_0, ifndef112.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:66:15: ifndef2
                    {
                    pushFollow(FOLLOW_ifndef2_in_if_not_define_block285);
                    ifndef213=ifndef2();

                    state._fsp--;

                    adaptor.addChild(root_0, ifndef213.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_ret_in_if_not_define_block288);
            ret14=ret();

            state._fsp--;

            adaptor.addChild(root_0, ret14.getTree());

            pushFollow(FOLLOW_main_code_block_in_if_not_define_block292);
            main_code_block15=main_code_block();

            state._fsp--;

            adaptor.addChild(root_0, main_code_block15.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:68:3: ( ELSE ret else_code_block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:68:4: ELSE ret else_code_block
                    {
                    ELSE16=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_not_define_block297); 
                    ELSE16_tree = 
                    (Object)adaptor.create(ELSE16)
                    ;
                    adaptor.addChild(root_0, ELSE16_tree);


                    pushFollow(FOLLOW_ret_in_if_not_define_block299);
                    ret17=ret();

                    state._fsp--;

                    adaptor.addChild(root_0, ret17.getTree());

                    pushFollow(FOLLOW_else_code_block_in_if_not_define_block304);
                    else_code_block18=else_code_block();

                    state._fsp--;

                    adaptor.addChild(root_0, else_code_block18.getTree());

                    }
                    break;

            }


            ENDIF19=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_not_define_block311); 
            ENDIF19_tree = 
            (Object)adaptor.create(ENDIF19)
            ;
            adaptor.addChild(root_0, ENDIF19_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_not_define_block"


    public static class ifndef1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifndef1"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:73:1: ifndef1 : IFNDEF name ;
    public final PreprocessorParser.ifndef1_return ifndef1() throws RecognitionException {
        PreprocessorParser.ifndef1_return retval = new PreprocessorParser.ifndef1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IFNDEF20=null;
        PreprocessorParser.name_return name21 =null;


        Object IFNDEF20_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:73:9: ( IFNDEF name )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:73:11: IFNDEF name
            {
            root_0 = (Object)adaptor.nil();


            IFNDEF20=(Token)match(input,IFNDEF,FOLLOW_IFNDEF_in_ifndef1321); 
            IFNDEF20_tree = 
            (Object)adaptor.create(IFNDEF20)
            ;
            adaptor.addChild(root_0, IFNDEF20_tree);


            pushFollow(FOLLOW_name_in_ifndef1323);
            name21=name();

            state._fsp--;

            adaptor.addChild(root_0, name21.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifndef1"


    public static class ifndef2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifndef2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:75:1: ifndef2 : IF EXC DEFINED L_BR name R_BR ;
    public final PreprocessorParser.ifndef2_return ifndef2() throws RecognitionException {
        PreprocessorParser.ifndef2_return retval = new PreprocessorParser.ifndef2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF22=null;
        Token EXC23=null;
        Token DEFINED24=null;
        Token L_BR25=null;
        Token R_BR27=null;
        PreprocessorParser.name_return name26 =null;


        Object IF22_tree=null;
        Object EXC23_tree=null;
        Object DEFINED24_tree=null;
        Object L_BR25_tree=null;
        Object R_BR27_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:75:9: ( IF EXC DEFINED L_BR name R_BR )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:75:11: IF EXC DEFINED L_BR name R_BR
            {
            root_0 = (Object)adaptor.nil();


            IF22=(Token)match(input,IF,FOLLOW_IF_in_ifndef2331); 
            IF22_tree = 
            (Object)adaptor.create(IF22)
            ;
            adaptor.addChild(root_0, IF22_tree);


            EXC23=(Token)match(input,EXC,FOLLOW_EXC_in_ifndef2334); 
            EXC23_tree = 
            (Object)adaptor.create(EXC23)
            ;
            adaptor.addChild(root_0, EXC23_tree);


            DEFINED24=(Token)match(input,DEFINED,FOLLOW_DEFINED_in_ifndef2337); 
            DEFINED24_tree = 
            (Object)adaptor.create(DEFINED24)
            ;
            adaptor.addChild(root_0, DEFINED24_tree);


            L_BR25=(Token)match(input,L_BR,FOLLOW_L_BR_in_ifndef2339); 
            L_BR25_tree = 
            (Object)adaptor.create(L_BR25)
            ;
            adaptor.addChild(root_0, L_BR25_tree);


            pushFollow(FOLLOW_name_in_ifndef2342);
            name26=name();

            state._fsp--;

            adaptor.addChild(root_0, name26.getTree());

            R_BR27=(Token)match(input,R_BR,FOLLOW_R_BR_in_ifndef2344); 
            R_BR27_tree = 
            (Object)adaptor.create(R_BR27)
            ;
            adaptor.addChild(root_0, R_BR27_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifndef2"


    public static class if_simple_check_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_simple_check_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:77:1: if_simple_check_wrapper : if_simple_check -> ^( T_IF_SIMPLE if_simple_check ) ;
    public final PreprocessorParser.if_simple_check_wrapper_return if_simple_check_wrapper() throws RecognitionException {
        PreprocessorParser.if_simple_check_wrapper_return retval = new PreprocessorParser.if_simple_check_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.if_simple_check_return if_simple_check28 =null;


        RewriteRuleSubtreeStream stream_if_simple_check=new RewriteRuleSubtreeStream(adaptor,"rule if_simple_check");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:78:2: ( if_simple_check -> ^( T_IF_SIMPLE if_simple_check ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:78:4: if_simple_check
            {
            pushFollow(FOLLOW_if_simple_check_in_if_simple_check_wrapper353);
            if_simple_check28=if_simple_check();

            state._fsp--;

            stream_if_simple_check.add(if_simple_check28.getTree());

            // AST REWRITE
            // elements: if_simple_check
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 78:20: -> ^( T_IF_SIMPLE if_simple_check )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:78:23: ^( T_IF_SIMPLE if_simple_check )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_SIMPLE, "T_IF_SIMPLE")
                , root_1);

                adaptor.addChild(root_1, stream_if_simple_check.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_simple_check_wrapper"


    public static class if_simple_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_simple_check"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:80:1: if_simple_check : IF expression_wrapper ret ( main_code_block )? ( ELIF expression_wrapper ret else_code_block )* ( ELSE ret else_code_block )? ENDIF ;
    public final PreprocessorParser.if_simple_check_return if_simple_check() throws RecognitionException {
        PreprocessorParser.if_simple_check_return retval = new PreprocessorParser.if_simple_check_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF29=null;
        Token ELIF33=null;
        Token ELSE37=null;
        Token ENDIF40=null;
        PreprocessorParser.expression_wrapper_return expression_wrapper30 =null;

        PreprocessorParser.ret_return ret31 =null;

        PreprocessorParser.main_code_block_return main_code_block32 =null;

        PreprocessorParser.expression_wrapper_return expression_wrapper34 =null;

        PreprocessorParser.ret_return ret35 =null;

        PreprocessorParser.else_code_block_return else_code_block36 =null;

        PreprocessorParser.ret_return ret38 =null;

        PreprocessorParser.else_code_block_return else_code_block39 =null;


        Object IF29_tree=null;
        Object ELIF33_tree=null;
        Object ELSE37_tree=null;
        Object ENDIF40_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:81:2: ( IF expression_wrapper ret ( main_code_block )? ( ELIF expression_wrapper ret else_code_block )* ( ELSE ret else_code_block )? ENDIF )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:81:4: IF expression_wrapper ret ( main_code_block )? ( ELIF expression_wrapper ret else_code_block )* ( ELSE ret else_code_block )? ENDIF
            {
            root_0 = (Object)adaptor.nil();


            IF29=(Token)match(input,IF,FOLLOW_IF_in_if_simple_check371); 
            IF29_tree = 
            (Object)adaptor.create(IF29)
            ;
            adaptor.addChild(root_0, IF29_tree);


            pushFollow(FOLLOW_expression_wrapper_in_if_simple_check373);
            expression_wrapper30=expression_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, expression_wrapper30.getTree());

            pushFollow(FOLLOW_ret_in_if_simple_check375);
            ret31=ret();

            state._fsp--;

            adaptor.addChild(root_0, ret31.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:82:3: ( main_code_block )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= ASTERISK && LA7_0 <= DIGIT)||(LA7_0 >= EXC && LA7_0 <= 73)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:82:3: main_code_block
                    {
                    pushFollow(FOLLOW_main_code_block_in_if_simple_check379);
                    main_code_block32=main_code_block();

                    state._fsp--;

                    adaptor.addChild(root_0, main_code_block32.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:83:3: ( ELIF expression_wrapper ret else_code_block )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ELIF) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:83:4: ELIF expression_wrapper ret else_code_block
            	    {
            	    ELIF33=(Token)match(input,ELIF,FOLLOW_ELIF_in_if_simple_check385); 
            	    ELIF33_tree = 
            	    (Object)adaptor.create(ELIF33)
            	    ;
            	    adaptor.addChild(root_0, ELIF33_tree);


            	    pushFollow(FOLLOW_expression_wrapper_in_if_simple_check388);
            	    expression_wrapper34=expression_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression_wrapper34.getTree());

            	    pushFollow(FOLLOW_ret_in_if_simple_check390);
            	    ret35=ret();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ret35.getTree());

            	    pushFollow(FOLLOW_else_code_block_in_if_simple_check394);
            	    else_code_block36=else_code_block();

            	    state._fsp--;

            	    adaptor.addChild(root_0, else_code_block36.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:85:3: ( ELSE ret else_code_block )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:85:4: ELSE ret else_code_block
                    {
                    ELSE37=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_simple_check401); 
                    ELSE37_tree = 
                    (Object)adaptor.create(ELSE37)
                    ;
                    adaptor.addChild(root_0, ELSE37_tree);


                    pushFollow(FOLLOW_ret_in_if_simple_check403);
                    ret38=ret();

                    state._fsp--;

                    adaptor.addChild(root_0, ret38.getTree());

                    pushFollow(FOLLOW_else_code_block_in_if_simple_check408);
                    else_code_block39=else_code_block();

                    state._fsp--;

                    adaptor.addChild(root_0, else_code_block39.getTree());

                    }
                    break;

            }


            ENDIF40=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_simple_check415); 
            ENDIF40_tree = 
            (Object)adaptor.create(ENDIF40)
            ;
            adaptor.addChild(root_0, ENDIF40_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_simple_check"


    public static class expression_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:90:1: expression_wrapper : expression -> ^( T_EXPRESSION expression ) ;
    public final PreprocessorParser.expression_wrapper_return expression_wrapper() throws RecognitionException {
        PreprocessorParser.expression_wrapper_return retval = new PreprocessorParser.expression_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.expression_return expression41 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:91:2: ( expression -> ^( T_EXPRESSION expression ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:91:4: expression
            {
            pushFollow(FOLLOW_expression_in_expression_wrapper427);
            expression41=expression();

            state._fsp--;

            stream_expression.add(expression41.getTree());

            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:15: -> ^( T_EXPRESSION expression )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:91:18: ^( T_EXPRESSION expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EXPRESSION, "T_EXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression_wrapper"


    public static class if_define_block_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_define_block_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:93:1: if_define_block_wrapper : if_define_block -> ^( T_IF_DEFINE if_define_block ) ;
    public final PreprocessorParser.if_define_block_wrapper_return if_define_block_wrapper() throws RecognitionException {
        PreprocessorParser.if_define_block_wrapper_return retval = new PreprocessorParser.if_define_block_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.if_define_block_return if_define_block42 =null;


        RewriteRuleSubtreeStream stream_if_define_block=new RewriteRuleSubtreeStream(adaptor,"rule if_define_block");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:94:2: ( if_define_block -> ^( T_IF_DEFINE if_define_block ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:94:4: if_define_block
            {
            pushFollow(FOLLOW_if_define_block_in_if_define_block_wrapper446);
            if_define_block42=if_define_block();

            state._fsp--;

            stream_if_define_block.add(if_define_block42.getTree());

            // AST REWRITE
            // elements: if_define_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:20: -> ^( T_IF_DEFINE if_define_block )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:94:23: ^( T_IF_DEFINE if_define_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_DEFINE, "T_IF_DEFINE")
                , root_1);

                adaptor.addChild(root_1, stream_if_define_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_define_block_wrapper"


    public static class if_define_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_define_block"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:96:1: if_define_block : ( ifdef1 | ifdef2 ) ret ( main_code_block )? ( ELSE ret else_code_block )? ENDIF ;
    public final PreprocessorParser.if_define_block_return if_define_block() throws RecognitionException {
        PreprocessorParser.if_define_block_return retval = new PreprocessorParser.if_define_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE47=null;
        Token ENDIF50=null;
        PreprocessorParser.ifdef1_return ifdef143 =null;

        PreprocessorParser.ifdef2_return ifdef244 =null;

        PreprocessorParser.ret_return ret45 =null;

        PreprocessorParser.main_code_block_return main_code_block46 =null;

        PreprocessorParser.ret_return ret48 =null;

        PreprocessorParser.else_code_block_return else_code_block49 =null;


        Object ELSE47_tree=null;
        Object ENDIF50_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:97:2: ( ( ifdef1 | ifdef2 ) ret ( main_code_block )? ( ELSE ret else_code_block )? ENDIF )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:97:4: ( ifdef1 | ifdef2 ) ret ( main_code_block )? ( ELSE ret else_code_block )? ENDIF
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:97:4: ( ifdef1 | ifdef2 )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IF) ) {
                alt10=1;
            }
            else if ( (LA10_0==IFDEF) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:97:5: ifdef1
                    {
                    pushFollow(FOLLOW_ifdef1_in_if_define_block466);
                    ifdef143=ifdef1();

                    state._fsp--;

                    adaptor.addChild(root_0, ifdef143.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:97:14: ifdef2
                    {
                    pushFollow(FOLLOW_ifdef2_in_if_define_block470);
                    ifdef244=ifdef2();

                    state._fsp--;

                    adaptor.addChild(root_0, ifdef244.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_ret_in_if_define_block473);
            ret45=ret();

            state._fsp--;

            adaptor.addChild(root_0, ret45.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:98:3: ( main_code_block )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= ASTERISK && LA11_0 <= DIGIT)||(LA11_0 >= EXC && LA11_0 <= 73)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:98:3: main_code_block
                    {
                    pushFollow(FOLLOW_main_code_block_in_if_define_block477);
                    main_code_block46=main_code_block();

                    state._fsp--;

                    adaptor.addChild(root_0, main_code_block46.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:99:3: ( ELSE ret else_code_block )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ELSE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:99:4: ELSE ret else_code_block
                    {
                    ELSE47=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_define_block483); 
                    ELSE47_tree = 
                    (Object)adaptor.create(ELSE47)
                    ;
                    adaptor.addChild(root_0, ELSE47_tree);


                    pushFollow(FOLLOW_ret_in_if_define_block485);
                    ret48=ret();

                    state._fsp--;

                    adaptor.addChild(root_0, ret48.getTree());

                    pushFollow(FOLLOW_else_code_block_in_if_define_block490);
                    else_code_block49=else_code_block();

                    state._fsp--;

                    adaptor.addChild(root_0, else_code_block49.getTree());

                    }
                    break;

            }


            ENDIF50=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_define_block497); 
            ENDIF50_tree = 
            (Object)adaptor.create(ENDIF50)
            ;
            adaptor.addChild(root_0, ENDIF50_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_define_block"


    public static class ifdef1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifdef1"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:104:1: ifdef1 : IF DEFINED L_BR name R_BR ;
    public final PreprocessorParser.ifdef1_return ifdef1() throws RecognitionException {
        PreprocessorParser.ifdef1_return retval = new PreprocessorParser.ifdef1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF51=null;
        Token DEFINED52=null;
        Token L_BR53=null;
        Token R_BR55=null;
        PreprocessorParser.name_return name54 =null;


        Object IF51_tree=null;
        Object DEFINED52_tree=null;
        Object L_BR53_tree=null;
        Object R_BR55_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:104:8: ( IF DEFINED L_BR name R_BR )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:104:10: IF DEFINED L_BR name R_BR
            {
            root_0 = (Object)adaptor.nil();


            IF51=(Token)match(input,IF,FOLLOW_IF_in_ifdef1507); 
            IF51_tree = 
            (Object)adaptor.create(IF51)
            ;
            adaptor.addChild(root_0, IF51_tree);


            DEFINED52=(Token)match(input,DEFINED,FOLLOW_DEFINED_in_ifdef1509); 
            DEFINED52_tree = 
            (Object)adaptor.create(DEFINED52)
            ;
            adaptor.addChild(root_0, DEFINED52_tree);


            L_BR53=(Token)match(input,L_BR,FOLLOW_L_BR_in_ifdef1511); 
            L_BR53_tree = 
            (Object)adaptor.create(L_BR53)
            ;
            adaptor.addChild(root_0, L_BR53_tree);


            pushFollow(FOLLOW_name_in_ifdef1513);
            name54=name();

            state._fsp--;

            adaptor.addChild(root_0, name54.getTree());

            R_BR55=(Token)match(input,R_BR,FOLLOW_R_BR_in_ifdef1515); 
            R_BR55_tree = 
            (Object)adaptor.create(R_BR55)
            ;
            adaptor.addChild(root_0, R_BR55_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifdef1"


    public static class ifdef2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifdef2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:106:1: ifdef2 : IFDEF name ;
    public final PreprocessorParser.ifdef2_return ifdef2() throws RecognitionException {
        PreprocessorParser.ifdef2_return retval = new PreprocessorParser.ifdef2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IFDEF56=null;
        PreprocessorParser.name_return name57 =null;


        Object IFDEF56_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:106:8: ( IFDEF name )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:106:10: IFDEF name
            {
            root_0 = (Object)adaptor.nil();


            IFDEF56=(Token)match(input,IFDEF,FOLLOW_IFDEF_in_ifdef2523); 
            IFDEF56_tree = 
            (Object)adaptor.create(IFDEF56)
            ;
            adaptor.addChild(root_0, IFDEF56_tree);


            pushFollow(FOLLOW_name_in_ifdef2526);
            name57=name();

            state._fsp--;

            adaptor.addChild(root_0, name57.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifdef2"


    public static class main_code_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main_code_block"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:108:1: main_code_block : code_block -> ^( T_IF_MAIN code_block ) ;
    public final PreprocessorParser.main_code_block_return main_code_block() throws RecognitionException {
        PreprocessorParser.main_code_block_return retval = new PreprocessorParser.main_code_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.code_block_return code_block58 =null;


        RewriteRuleSubtreeStream stream_code_block=new RewriteRuleSubtreeStream(adaptor,"rule code_block");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:109:2: ( code_block -> ^( T_IF_MAIN code_block ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:109:4: code_block
            {
            pushFollow(FOLLOW_code_block_in_main_code_block535);
            code_block58=code_block();

            state._fsp--;

            stream_code_block.add(code_block58.getTree());

            // AST REWRITE
            // elements: code_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:15: -> ^( T_IF_MAIN code_block )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:109:18: ^( T_IF_MAIN code_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_MAIN, "T_IF_MAIN")
                , root_1);

                adaptor.addChild(root_1, stream_code_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "main_code_block"


    public static class else_code_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_code_block"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:111:1: else_code_block : code_block -> ^( T_IF_ELSE code_block ) ;
    public final PreprocessorParser.else_code_block_return else_code_block() throws RecognitionException {
        PreprocessorParser.else_code_block_return retval = new PreprocessorParser.else_code_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.code_block_return code_block59 =null;


        RewriteRuleSubtreeStream stream_code_block=new RewriteRuleSubtreeStream(adaptor,"rule code_block");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:112:2: ( code_block -> ^( T_IF_ELSE code_block ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:112:4: code_block
            {
            pushFollow(FOLLOW_code_block_in_else_code_block552);
            code_block59=code_block();

            state._fsp--;

            stream_code_block.add(code_block59.getTree());

            // AST REWRITE
            // elements: code_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:15: -> ^( T_IF_ELSE code_block )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:112:18: ^( T_IF_ELSE code_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_ELSE, "T_IF_ELSE")
                , root_1);

                adaptor.addChild(root_1, stream_code_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_code_block"


    public static class code_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code_block"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:114:1: code_block : ( code_fragment )+ -> ^( T_BLOCK ( code_fragment )+ ) ;
    public final PreprocessorParser.code_block_return code_block() throws RecognitionException {
        PreprocessorParser.code_block_return retval = new PreprocessorParser.code_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.code_fragment_return code_fragment60 =null;


        RewriteRuleSubtreeStream stream_code_fragment=new RewriteRuleSubtreeStream(adaptor,"rule code_fragment");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:115:2: ( ( code_fragment )+ -> ^( T_BLOCK ( code_fragment )+ ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:115:4: ( code_fragment )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:115:4: ( code_fragment )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= ASTERISK && LA13_0 <= DIGIT)||(LA13_0 >= EXC && LA13_0 <= 73)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:115:4: code_fragment
            	    {
            	    pushFollow(FOLLOW_code_fragment_in_code_block569);
            	    code_fragment60=code_fragment();

            	    state._fsp--;

            	    stream_code_fragment.add(code_fragment60.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            // AST REWRITE
            // elements: code_fragment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:19: -> ^( T_BLOCK ( code_fragment )+ )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:115:22: ^( T_BLOCK ( code_fragment )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_BLOCK, "T_BLOCK")
                , root_1);

                if ( !(stream_code_fragment.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_code_fragment.hasNext() ) {
                    adaptor.addChild(root_1, stream_code_fragment.nextTree());

                }
                stream_code_fragment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "code_block"


    public static class inside_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inside_block"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:117:1: inside_block : (~ ( ELSE | ENDIF | ELIF ) )* ;
    public final PreprocessorParser.inside_block_return inside_block() throws RecognitionException {
        PreprocessorParser.inside_block_return retval = new PreprocessorParser.inside_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set61=null;

        Object set61_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:118:2: ( (~ ( ELSE | ENDIF | ELIF ) )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:118:4: (~ ( ELSE | ENDIF | ELIF ) )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:118:4: (~ ( ELSE | ENDIF | ELIF ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= ASTERISK && LA14_0 <= DIGIT)||(LA14_0 >= EXC && LA14_0 <= 73)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    set61=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ASTERISK && input.LA(1) <= DIGIT)||(input.LA(1) >= EXC && input.LA(1) <= 73) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set61)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inside_block"


    public static class name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:120:1: name : ID -> ^( T_NAME ID ) ;
    public final PreprocessorParser.name_return name() throws RecognitionException {
        PreprocessorParser.name_return retval = new PreprocessorParser.name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID62=null;

        Object ID62_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:120:6: ( ID -> ^( T_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:120:8: ID
            {
            ID62=(Token)match(input,ID,FOLLOW_ID_in_name609);  
            stream_ID.add(ID62);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:11: -> ^( T_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:120:14: ^( T_NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_NAME, "T_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name"


    public static class import_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:122:1: import_declaration : ( IMPORT | INCLUDE ) import_end ;
    public final PreprocessorParser.import_declaration_return import_declaration() throws RecognitionException {
        PreprocessorParser.import_declaration_return retval = new PreprocessorParser.import_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set63=null;
        PreprocessorParser.import_end_return import_end64 =null;


        Object set63_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:123:2: ( ( IMPORT | INCLUDE ) import_end )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:123:4: ( IMPORT | INCLUDE ) import_end
            {
            root_0 = (Object)adaptor.nil();


            set63=(Token)input.LT(1);

            if ( (input.LA(1) >= IMPORT && input.LA(1) <= INCLUDE) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set63)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_import_end_in_import_declaration634);
            import_end64=import_end();

            state._fsp--;

            adaptor.addChild(root_0, import_end64.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_declaration"


    public static class import_end_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_end"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:125:1: import_end : ( import_internal | import_external );
    public final PreprocessorParser.import_end_return import_end() throws RecognitionException {
        PreprocessorParser.import_end_return retval = new PreprocessorParser.import_end_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.import_internal_return import_internal65 =null;

        PreprocessorParser.import_external_return import_external66 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:126:2: ( import_internal | import_external )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==L_UBR) ) {
                alt15=1;
            }
            else if ( (LA15_0==QUOTE) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:126:4: import_internal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_import_internal_in_import_end644);
                    import_internal65=import_internal();

                    state._fsp--;

                    adaptor.addChild(root_0, import_internal65.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:127:5: import_external
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_import_external_in_import_end651);
                    import_external66=import_external();

                    state._fsp--;

                    adaptor.addChild(root_0, import_external66.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_end"


    public static class import_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:129:1: import_internal : import_internal_string -> ^( T_IMPORT import_internal_string ) ;
    public final PreprocessorParser.import_internal_return import_internal() throws RecognitionException {
        PreprocessorParser.import_internal_return retval = new PreprocessorParser.import_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.import_internal_string_return import_internal_string67 =null;


        RewriteRuleSubtreeStream stream_import_internal_string=new RewriteRuleSubtreeStream(adaptor,"rule import_internal_string");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:130:2: ( import_internal_string -> ^( T_IMPORT import_internal_string ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:130:4: import_internal_string
            {
            pushFollow(FOLLOW_import_internal_string_in_import_internal661);
            import_internal_string67=import_internal_string();

            state._fsp--;

            stream_import_internal_string.add(import_internal_string67.getTree());

            // AST REWRITE
            // elements: import_internal_string
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:27: -> ^( T_IMPORT import_internal_string )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:130:30: ^( T_IMPORT import_internal_string )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IMPORT, "T_IMPORT")
                , root_1);

                adaptor.addChild(root_1, stream_import_internal_string.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_internal"


    public static class import_internal_string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_internal_string"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:132:1: import_internal_string : L_UBR path_wrapper R_UBR ;
    public final PreprocessorParser.import_internal_string_return import_internal_string() throws RecognitionException {
        PreprocessorParser.import_internal_string_return retval = new PreprocessorParser.import_internal_string_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token L_UBR68=null;
        Token R_UBR70=null;
        PreprocessorParser.path_wrapper_return path_wrapper69 =null;


        Object L_UBR68_tree=null;
        Object R_UBR70_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:133:2: ( L_UBR path_wrapper R_UBR )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:133:4: L_UBR path_wrapper R_UBR
            {
            root_0 = (Object)adaptor.nil();


            L_UBR68=(Token)match(input,L_UBR,FOLLOW_L_UBR_in_import_internal_string679); 
            L_UBR68_tree = 
            (Object)adaptor.create(L_UBR68)
            ;
            adaptor.addChild(root_0, L_UBR68_tree);


            pushFollow(FOLLOW_path_wrapper_in_import_internal_string682);
            path_wrapper69=path_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, path_wrapper69.getTree());

            R_UBR70=(Token)match(input,R_UBR,FOLLOW_R_UBR_in_import_internal_string685); 
            R_UBR70_tree = 
            (Object)adaptor.create(R_UBR70)
            ;
            adaptor.addChild(root_0, R_UBR70_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_internal_string"


    public static class path_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "path_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:135:1: path_wrapper : path -> ^( T_PATH path ) ;
    public final PreprocessorParser.path_wrapper_return path_wrapper() throws RecognitionException {
        PreprocessorParser.path_wrapper_return retval = new PreprocessorParser.path_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.path_return path71 =null;


        RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:2: ( path -> ^( T_PATH path ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:4: path
            {
            pushFollow(FOLLOW_path_in_path_wrapper695);
            path71=path();

            state._fsp--;

            stream_path.add(path71.getTree());

            // AST REWRITE
            // elements: path
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 136:9: -> ^( T_PATH path )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:12: ^( T_PATH path )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_PATH, "T_PATH")
                , root_1);

                adaptor.addChild(root_1, stream_path.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "path_wrapper"


    public static class path_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "path"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:138:1: path : filename_wrapper ( '/' filename_wrapper )* ;
    public final PreprocessorParser.path_return path() throws RecognitionException {
        PreprocessorParser.path_return retval = new PreprocessorParser.path_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal73=null;
        PreprocessorParser.filename_wrapper_return filename_wrapper72 =null;

        PreprocessorParser.filename_wrapper_return filename_wrapper74 =null;


        Object char_literal73_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:138:6: ( filename_wrapper ( '/' filename_wrapper )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:138:8: filename_wrapper ( '/' filename_wrapper )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_filename_wrapper_in_path712);
            filename_wrapper72=filename_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, filename_wrapper72.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:138:25: ( '/' filename_wrapper )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==68) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:138:26: '/' filename_wrapper
            	    {
            	    char_literal73=(Token)match(input,68,FOLLOW_68_in_path715); 
            	    char_literal73_tree = 
            	    (Object)adaptor.create(char_literal73)
            	    ;
            	    adaptor.addChild(root_0, char_literal73_tree);


            	    pushFollow(FOLLOW_filename_wrapper_in_path717);
            	    filename_wrapper74=filename_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, filename_wrapper74.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "path"


    public static class filename_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filename_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:140:1: filename_wrapper : filename -> ^( T_FILENAME filename ) ;
    public final PreprocessorParser.filename_wrapper_return filename_wrapper() throws RecognitionException {
        PreprocessorParser.filename_wrapper_return retval = new PreprocessorParser.filename_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.filename_return filename75 =null;


        RewriteRuleSubtreeStream stream_filename=new RewriteRuleSubtreeStream(adaptor,"rule filename");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:141:2: ( filename -> ^( T_FILENAME filename ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:141:4: filename
            {
            pushFollow(FOLLOW_filename_in_filename_wrapper729);
            filename75=filename();

            state._fsp--;

            stream_filename.add(filename75.getTree());

            // AST REWRITE
            // elements: filename
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 141:13: -> ^( T_FILENAME filename )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:141:16: ^( T_FILENAME filename )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_FILENAME, "T_FILENAME")
                , root_1);

                adaptor.addChild(root_1, stream_filename.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "filename_wrapper"


    public static class filename_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filename"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:1: filename : ID ( MINUS ID )* ( '.' ID )? ;
    public final PreprocessorParser.filename_return filename() throws RecognitionException {
        PreprocessorParser.filename_return retval = new PreprocessorParser.filename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID76=null;
        Token MINUS77=null;
        Token ID78=null;
        Token char_literal79=null;
        Token ID80=null;

        Object ID76_tree=null;
        Object MINUS77_tree=null;
        Object ID78_tree=null;
        Object char_literal79_tree=null;
        Object ID80_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:9: ( ID ( MINUS ID )* ( '.' ID )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:11: ID ( MINUS ID )* ( '.' ID )?
            {
            root_0 = (Object)adaptor.nil();


            ID76=(Token)match(input,ID,FOLLOW_ID_in_filename745); 
            ID76_tree = 
            (Object)adaptor.create(ID76)
            ;
            adaptor.addChild(root_0, ID76_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:14: ( MINUS ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MINUS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:15: MINUS ID
            	    {
            	    MINUS77=(Token)match(input,MINUS,FOLLOW_MINUS_in_filename748); 
            	    MINUS77_tree = 
            	    (Object)adaptor.create(MINUS77)
            	    ;
            	    adaptor.addChild(root_0, MINUS77_tree);


            	    ID78=(Token)match(input,ID,FOLLOW_ID_in_filename750); 
            	    ID78_tree = 
            	    (Object)adaptor.create(ID78)
            	    ;
            	    adaptor.addChild(root_0, ID78_tree);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:26: ( '.' ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==67) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:27: '.' ID
                    {
                    char_literal79=(Token)match(input,67,FOLLOW_67_in_filename755); 
                    char_literal79_tree = 
                    (Object)adaptor.create(char_literal79)
                    ;
                    adaptor.addChild(root_0, char_literal79_tree);


                    ID80=(Token)match(input,ID,FOLLOW_ID_in_filename757); 
                    ID80_tree = 
                    (Object)adaptor.create(ID80)
                    ;
                    adaptor.addChild(root_0, ID80_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "filename"


    public static class filename2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filename2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:145:1: filename2 : ID ( ( MINUS | PLUS ) ID )* ( '.' ID )? ;
    public final PreprocessorParser.filename2_return filename2() throws RecognitionException {
        PreprocessorParser.filename2_return retval = new PreprocessorParser.filename2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID81=null;
        Token set82=null;
        Token ID83=null;
        Token char_literal84=null;
        Token ID85=null;

        Object ID81_tree=null;
        Object set82_tree=null;
        Object ID83_tree=null;
        Object char_literal84_tree=null;
        Object ID85_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:146:2: ( ID ( ( MINUS | PLUS ) ID )* ( '.' ID )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:146:4: ID ( ( MINUS | PLUS ) ID )* ( '.' ID )?
            {
            root_0 = (Object)adaptor.nil();


            ID81=(Token)match(input,ID,FOLLOW_ID_in_filename2768); 
            ID81_tree = 
            (Object)adaptor.create(ID81)
            ;
            adaptor.addChild(root_0, ID81_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:146:7: ( ( MINUS | PLUS ) ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==MINUS||LA19_0==PLUS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:146:8: ( MINUS | PLUS ) ID
            	    {
            	    set82=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set82)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    ID83=(Token)match(input,ID,FOLLOW_ID_in_filename2779); 
            	    ID83_tree = 
            	    (Object)adaptor.create(ID83)
            	    ;
            	    adaptor.addChild(root_0, ID83_tree);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:146:28: ( '.' ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==67) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:146:29: '.' ID
                    {
                    char_literal84=(Token)match(input,67,FOLLOW_67_in_filename2784); 
                    char_literal84_tree = 
                    (Object)adaptor.create(char_literal84)
                    ;
                    adaptor.addChild(root_0, char_literal84_tree);


                    ID85=(Token)match(input,ID,FOLLOW_ID_in_filename2786); 
                    ID85_tree = 
                    (Object)adaptor.create(ID85)
                    ;
                    adaptor.addChild(root_0, ID85_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "filename2"


    public static class import_external_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_external"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:148:1: import_external : import_external2 -> ^( T_INCLUDE import_external2 ) ;
    public final PreprocessorParser.import_external_return import_external() throws RecognitionException {
        PreprocessorParser.import_external_return retval = new PreprocessorParser.import_external_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.import_external2_return import_external286 =null;


        RewriteRuleSubtreeStream stream_import_external2=new RewriteRuleSubtreeStream(adaptor,"rule import_external2");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:149:2: ( import_external2 -> ^( T_INCLUDE import_external2 ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:149:4: import_external2
            {
            pushFollow(FOLLOW_import_external2_in_import_external797);
            import_external286=import_external2();

            state._fsp--;

            stream_import_external2.add(import_external286.getTree());

            // AST REWRITE
            // elements: import_external2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 149:21: -> ^( T_INCLUDE import_external2 )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:149:24: ^( T_INCLUDE import_external2 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_INCLUDE, "T_INCLUDE")
                , root_1);

                adaptor.addChild(root_1, stream_import_external2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_external"


    public static class import_external2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_external2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:151:1: import_external2 : QUOTE filename2 QUOTE ;
    public final PreprocessorParser.import_external2_return import_external2() throws RecognitionException {
        PreprocessorParser.import_external2_return retval = new PreprocessorParser.import_external2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token QUOTE87=null;
        Token QUOTE89=null;
        PreprocessorParser.filename2_return filename288 =null;


        Object QUOTE87_tree=null;
        Object QUOTE89_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:2: ( QUOTE filename2 QUOTE )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:4: QUOTE filename2 QUOTE
            {
            root_0 = (Object)adaptor.nil();


            QUOTE87=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_import_external2815); 
            QUOTE87_tree = 
            (Object)adaptor.create(QUOTE87)
            ;
            adaptor.addChild(root_0, QUOTE87_tree);


            pushFollow(FOLLOW_filename2_in_import_external2817);
            filename288=filename2();

            state._fsp--;

            adaptor.addChild(root_0, filename288.getTree());

            QUOTE89=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_import_external2819); 
            QUOTE89_tree = 
            (Object)adaptor.create(QUOTE89)
            ;
            adaptor.addChild(root_0, QUOTE89_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_external2"


    public static class define_directive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "define_directive"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:154:1: define_directive : DEFINE id_wrapper ( mln_end )? ( replace_wrapper )? -> ^( T_DEFINE DEFINE id_wrapper ( replace_wrapper )? ) ;
    public final PreprocessorParser.define_directive_return define_directive() throws RecognitionException {
        PreprocessorParser.define_directive_return retval = new PreprocessorParser.define_directive_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFINE90=null;
        PreprocessorParser.id_wrapper_return id_wrapper91 =null;

        PreprocessorParser.mln_end_return mln_end92 =null;

        PreprocessorParser.replace_wrapper_return replace_wrapper93 =null;


        Object DEFINE90_tree=null;
        RewriteRuleTokenStream stream_DEFINE=new RewriteRuleTokenStream(adaptor,"token DEFINE");
        RewriteRuleSubtreeStream stream_id_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule id_wrapper");
        RewriteRuleSubtreeStream stream_mln_end=new RewriteRuleSubtreeStream(adaptor,"rule mln_end");
        RewriteRuleSubtreeStream stream_replace_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule replace_wrapper");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:155:2: ( DEFINE id_wrapper ( mln_end )? ( replace_wrapper )? -> ^( T_DEFINE DEFINE id_wrapper ( replace_wrapper )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:155:4: DEFINE id_wrapper ( mln_end )? ( replace_wrapper )?
            {
            DEFINE90=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_define_directive830);  
            stream_DEFINE.add(DEFINE90);


            pushFollow(FOLLOW_id_wrapper_in_define_directive833);
            id_wrapper91=id_wrapper();

            state._fsp--;

            stream_id_wrapper.add(id_wrapper91.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:155:24: ( mln_end )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==BACKSLASH) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RET) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:155:24: mln_end
                    {
                    pushFollow(FOLLOW_mln_end_in_define_directive836);
                    mln_end92=mln_end();

                    state._fsp--;

                    stream_mln_end.add(mln_end92.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:155:33: ( replace_wrapper )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:155:33: replace_wrapper
                    {
                    pushFollow(FOLLOW_replace_wrapper_in_define_directive839);
                    replace_wrapper93=replace_wrapper();

                    state._fsp--;

                    stream_replace_wrapper.add(replace_wrapper93.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: id_wrapper, DEFINE, replace_wrapper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 155:50: -> ^( T_DEFINE DEFINE id_wrapper ( replace_wrapper )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:155:53: ^( T_DEFINE DEFINE id_wrapper ( replace_wrapper )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_DEFINE, "T_DEFINE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_DEFINE.nextNode()
                );

                adaptor.addChild(root_1, stream_id_wrapper.nextTree());

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:155:83: ( replace_wrapper )?
                if ( stream_replace_wrapper.hasNext() ) {
                    adaptor.addChild(root_1, stream_replace_wrapper.nextTree());

                }
                stream_replace_wrapper.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "define_directive"


    public static class mln_end_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mln_end"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:158:1: mln_end : BACKSLASH ret ;
    public final PreprocessorParser.mln_end_return mln_end() throws RecognitionException {
        PreprocessorParser.mln_end_return retval = new PreprocessorParser.mln_end_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BACKSLASH94=null;
        PreprocessorParser.ret_return ret95 =null;


        Object BACKSLASH94_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:158:9: ( BACKSLASH ret )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:158:11: BACKSLASH ret
            {
            root_0 = (Object)adaptor.nil();


            BACKSLASH94=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_mln_end865); 
            BACKSLASH94_tree = 
            (Object)adaptor.create(BACKSLASH94)
            ;
            adaptor.addChild(root_0, BACKSLASH94_tree);


            pushFollow(FOLLOW_ret_in_mln_end867);
            ret95=ret();

            state._fsp--;

            adaptor.addChild(root_0, ret95.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mln_end"


    public static class id_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:160:1: id_wrapper : name_wrapper ( in_brackets_wrapper )? -> ^( T_ID name_wrapper ( in_brackets_wrapper )? ) ;
    public final PreprocessorParser.id_wrapper_return id_wrapper() throws RecognitionException {
        PreprocessorParser.id_wrapper_return retval = new PreprocessorParser.id_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.name_wrapper_return name_wrapper96 =null;

        PreprocessorParser.in_brackets_wrapper_return in_brackets_wrapper97 =null;


        RewriteRuleSubtreeStream stream_name_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule name_wrapper");
        RewriteRuleSubtreeStream stream_in_brackets_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule in_brackets_wrapper");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:161:2: ( name_wrapper ( in_brackets_wrapper )? -> ^( T_ID name_wrapper ( in_brackets_wrapper )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:161:4: name_wrapper ( in_brackets_wrapper )?
            {
            pushFollow(FOLLOW_name_wrapper_in_id_wrapper877);
            name_wrapper96=name_wrapper();

            state._fsp--;

            stream_name_wrapper.add(name_wrapper96.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:161:17: ( in_brackets_wrapper )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:161:17: in_brackets_wrapper
                    {
                    pushFollow(FOLLOW_in_brackets_wrapper_in_id_wrapper879);
                    in_brackets_wrapper97=in_brackets_wrapper();

                    state._fsp--;

                    stream_in_brackets_wrapper.add(in_brackets_wrapper97.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: in_brackets_wrapper, name_wrapper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 161:38: -> ^( T_ID name_wrapper ( in_brackets_wrapper )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:161:41: ^( T_ID name_wrapper ( in_brackets_wrapper )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_ID, "T_ID")
                , root_1);

                adaptor.addChild(root_1, stream_name_wrapper.nextTree());

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:161:61: ( in_brackets_wrapper )?
                if ( stream_in_brackets_wrapper.hasNext() ) {
                    adaptor.addChild(root_1, stream_in_brackets_wrapper.nextTree());

                }
                stream_in_brackets_wrapper.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_wrapper"


    public static class name_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:163:1: name_wrapper : ID -> ^( T_NAME ID ) ;
    public final PreprocessorParser.name_wrapper_return name_wrapper() throws RecognitionException {
        PreprocessorParser.name_wrapper_return retval = new PreprocessorParser.name_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID98=null;

        Object ID98_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:164:2: ( ID -> ^( T_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:164:4: ID
            {
            ID98=(Token)match(input,ID,FOLLOW_ID_in_name_wrapper902);  
            stream_ID.add(ID98);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 164:7: -> ^( T_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:164:10: ^( T_NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_NAME, "T_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name_wrapper"


    public static class in_brackets_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_brackets_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:166:1: in_brackets_wrapper : in_brackets -> ^( T_IN_BRACKETS in_brackets ) ;
    public final PreprocessorParser.in_brackets_wrapper_return in_brackets_wrapper() throws RecognitionException {
        PreprocessorParser.in_brackets_wrapper_return retval = new PreprocessorParser.in_brackets_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.in_brackets_return in_brackets99 =null;


        RewriteRuleSubtreeStream stream_in_brackets=new RewriteRuleSubtreeStream(adaptor,"rule in_brackets");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:167:2: ( in_brackets -> ^( T_IN_BRACKETS in_brackets ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:167:4: in_brackets
            {
            pushFollow(FOLLOW_in_brackets_in_in_brackets_wrapper921);
            in_brackets99=in_brackets();

            state._fsp--;

            stream_in_brackets.add(in_brackets99.getTree());

            // AST REWRITE
            // elements: in_brackets
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 167:16: -> ^( T_IN_BRACKETS in_brackets )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:167:19: ^( T_IN_BRACKETS in_brackets )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IN_BRACKETS, "T_IN_BRACKETS")
                , root_1);

                adaptor.addChild(root_1, stream_in_brackets.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "in_brackets_wrapper"


    public static class in_brackets_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_brackets"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:169:1: in_brackets : L_BR param_wrapper ( ',' param_wrapper )* R_BR ;
    public final PreprocessorParser.in_brackets_return in_brackets() throws RecognitionException {
        PreprocessorParser.in_brackets_return retval = new PreprocessorParser.in_brackets_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token L_BR100=null;
        Token char_literal102=null;
        Token R_BR104=null;
        PreprocessorParser.param_wrapper_return param_wrapper101 =null;

        PreprocessorParser.param_wrapper_return param_wrapper103 =null;


        Object L_BR100_tree=null;
        Object char_literal102_tree=null;
        Object R_BR104_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:170:2: ( L_BR param_wrapper ( ',' param_wrapper )* R_BR )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:170:4: L_BR param_wrapper ( ',' param_wrapper )* R_BR
            {
            root_0 = (Object)adaptor.nil();


            L_BR100=(Token)match(input,L_BR,FOLLOW_L_BR_in_in_brackets940); 
            L_BR100_tree = 
            (Object)adaptor.create(L_BR100)
            ;
            adaptor.addChild(root_0, L_BR100_tree);


            pushFollow(FOLLOW_param_wrapper_in_in_brackets942);
            param_wrapper101=param_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, param_wrapper101.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:170:23: ( ',' param_wrapper )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==66) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:170:24: ',' param_wrapper
            	    {
            	    char_literal102=(Token)match(input,66,FOLLOW_66_in_in_brackets945); 
            	    char_literal102_tree = 
            	    (Object)adaptor.create(char_literal102)
            	    ;
            	    adaptor.addChild(root_0, char_literal102_tree);


            	    pushFollow(FOLLOW_param_wrapper_in_in_brackets948);
            	    param_wrapper103=param_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param_wrapper103.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            R_BR104=(Token)match(input,R_BR,FOLLOW_R_BR_in_in_brackets952); 
            R_BR104_tree = 
            (Object)adaptor.create(R_BR104)
            ;
            adaptor.addChild(root_0, R_BR104_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "in_brackets"


    public static class param_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:173:1: param_wrapper : ( param_common | POINTS3 );
    public final PreprocessorParser.param_wrapper_return param_wrapper() throws RecognitionException {
        PreprocessorParser.param_wrapper_return retval = new PreprocessorParser.param_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token POINTS3106=null;
        PreprocessorParser.param_common_return param_common105 =null;


        Object POINTS3106_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:174:2: ( param_common | POINTS3 )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==POINTS3) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:174:4: param_common
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_param_common_in_param_wrapper964);
                    param_common105=param_common();

                    state._fsp--;

                    adaptor.addChild(root_0, param_common105.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:175:4: POINTS3
                    {
                    root_0 = (Object)adaptor.nil();


                    POINTS3106=(Token)match(input,POINTS3,FOLLOW_POINTS3_in_param_wrapper969); 
                    POINTS3106_tree = 
                    (Object)adaptor.create(POINTS3106)
                    ;
                    adaptor.addChild(root_0, POINTS3106_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param_wrapper"


    public static class param_common_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_common"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:178:1: param_common : ID -> ^( T_PARAM ID ) ;
    public final PreprocessorParser.param_common_return param_common() throws RecognitionException {
        PreprocessorParser.param_common_return retval = new PreprocessorParser.param_common_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID107=null;

        Object ID107_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:179:2: ( ID -> ^( T_PARAM ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:179:4: ID
            {
            ID107=(Token)match(input,ID,FOLLOW_ID_in_param_common981);  
            stream_ID.add(ID107);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 179:7: -> ^( T_PARAM ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:179:10: ^( T_PARAM ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_PARAM, "T_PARAM")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param_common"


    public static class replace_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "replace_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:181:1: replace_wrapper : replace -> ^( T_REPLACE replace ) ;
    public final PreprocessorParser.replace_wrapper_return replace_wrapper() throws RecognitionException {
        PreprocessorParser.replace_wrapper_return retval = new PreprocessorParser.replace_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.replace_return replace108 =null;


        RewriteRuleSubtreeStream stream_replace=new RewriteRuleSubtreeStream(adaptor,"rule replace");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:2: ( replace -> ^( T_REPLACE replace ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:4: replace
            {
            pushFollow(FOLLOW_replace_in_replace_wrapper1000);
            replace108=replace();

            state._fsp--;

            stream_replace.add(replace108.getTree());

            // AST REWRITE
            // elements: replace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 182:12: -> ^( T_REPLACE replace )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:15: ^( T_REPLACE replace )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_REPLACE, "T_REPLACE")
                , root_1);

                adaptor.addChild(root_1, stream_replace.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "replace_wrapper"


    public static class replace_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "replace"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:184:1: replace : replace_internal ( backslash ret replace_internal )* ;
    public final PreprocessorParser.replace_return replace() throws RecognitionException {
        PreprocessorParser.replace_return retval = new PreprocessorParser.replace_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.replace_internal_return replace_internal109 =null;

        PreprocessorParser.backslash_return backslash110 =null;

        PreprocessorParser.ret_return ret111 =null;

        PreprocessorParser.replace_internal_return replace_internal112 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:184:9: ( replace_internal ( backslash ret replace_internal )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:184:11: replace_internal ( backslash ret replace_internal )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_replace_internal_in_replace1018);
            replace_internal109=replace_internal();

            state._fsp--;

            adaptor.addChild(root_0, replace_internal109.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:184:28: ( backslash ret replace_internal )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:184:29: backslash ret replace_internal
            	    {
            	    pushFollow(FOLLOW_backslash_in_replace1021);
            	    backslash110=backslash();

            	    state._fsp--;

            	    adaptor.addChild(root_0, backslash110.getTree());

            	    pushFollow(FOLLOW_ret_in_replace1023);
            	    ret111=ret();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ret111.getTree());

            	    pushFollow(FOLLOW_replace_internal_in_replace1025);
            	    replace_internal112=replace_internal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, replace_internal112.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "replace"


    public static class backslash_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "backslash"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:186:1: backslash : BACKSLASH -> ^( T_BACKSLASH BACKSLASH ) ;
    public final PreprocessorParser.backslash_return backslash() throws RecognitionException {
        PreprocessorParser.backslash_return retval = new PreprocessorParser.backslash_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BACKSLASH113=null;

        Object BACKSLASH113_tree=null;
        RewriteRuleTokenStream stream_BACKSLASH=new RewriteRuleTokenStream(adaptor,"token BACKSLASH");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:2: ( BACKSLASH -> ^( T_BACKSLASH BACKSLASH ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:4: BACKSLASH
            {
            BACKSLASH113=(Token)match(input,BACKSLASH,FOLLOW_BACKSLASH_in_backslash1037);  
            stream_BACKSLASH.add(BACKSLASH113);


            // AST REWRITE
            // elements: BACKSLASH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:14: -> ^( T_BACKSLASH BACKSLASH )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:17: ^( T_BACKSLASH BACKSLASH )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_BACKSLASH, "T_BACKSLASH")
                , root_1);

                adaptor.addChild(root_1, 
                stream_BACKSLASH.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "backslash"


    public static class replace_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "replace_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:189:1: replace_internal : ( '\\'#\\'' | (~ ( BACKSLASH | RET ) )+ ) ;
    public final PreprocessorParser.replace_internal_return replace_internal() throws RecognitionException {
        PreprocessorParser.replace_internal_return retval = new PreprocessorParser.replace_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal114=null;
        Token set115=null;

        Object string_literal114_tree=null;
        Object set115_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:190:2: ( ( '\\'#\\'' | (~ ( BACKSLASH | RET ) )+ ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:190:4: ( '\\'#\\'' | (~ ( BACKSLASH | RET ) )+ )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:190:4: ( '\\'#\\'' | (~ ( BACKSLASH | RET ) )+ )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==72) ) {
                alt28=1;
            }
            else if ( (LA28_0==ASTERISK||(LA28_0 >= COMMENT && LA28_0 <= RESERVED_WORDS)||(LA28_0 >= R_BR && LA28_0 <= 71)||LA28_0==73) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:190:5: '\\'#\\''
                    {
                    string_literal114=(Token)match(input,72,FOLLOW_72_in_replace_internal1056); 
                    string_literal114_tree = 
                    (Object)adaptor.create(string_literal114)
                    ;
                    adaptor.addChild(root_0, string_literal114_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:190:15: (~ ( BACKSLASH | RET ) )+
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:190:15: (~ ( BACKSLASH | RET ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        alt27 = dfa27.predict(input);
                        switch (alt27) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
                    	    {
                    	    set115=(Token)input.LT(1);

                    	    if ( input.LA(1)==ASTERISK||(input.LA(1) >= COMMENT && input.LA(1) <= RESERVED_WORDS)||(input.LA(1) >= R_BR && input.LA(1) <= 73) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set115)
                    	        );
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "replace_internal"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:192:1: expression : ex_or -> ^( T_EX_OR ex_or ) ;
    public final PreprocessorParser.expression_return expression() throws RecognitionException {
        PreprocessorParser.expression_return retval = new PreprocessorParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.ex_or_return ex_or116 =null;


        RewriteRuleSubtreeStream stream_ex_or=new RewriteRuleSubtreeStream(adaptor,"rule ex_or");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:193:2: ( ex_or -> ^( T_EX_OR ex_or ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:193:4: ex_or
            {
            pushFollow(FOLLOW_ex_or_in_expression1078);
            ex_or116=ex_or();

            state._fsp--;

            stream_ex_or.add(ex_or116.getTree());

            // AST REWRITE
            // elements: ex_or
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 193:10: -> ^( T_EX_OR ex_or )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:193:13: ^( T_EX_OR ex_or )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EX_OR, "T_EX_OR")
                , root_1);

                adaptor.addChild(root_1, stream_ex_or.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class ex_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_or"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:195:1: ex_or : ex_and_wrp ( '||' expression_wrapper )* ;
    public final PreprocessorParser.ex_or_return ex_or() throws RecognitionException {
        PreprocessorParser.ex_or_return retval = new PreprocessorParser.ex_or_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal118=null;
        PreprocessorParser.ex_and_wrp_return ex_and_wrp117 =null;

        PreprocessorParser.expression_wrapper_return expression_wrapper119 =null;


        Object string_literal118_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:195:7: ( ex_and_wrp ( '||' expression_wrapper )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:195:9: ex_and_wrp ( '||' expression_wrapper )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ex_and_wrp_in_ex_or1094);
            ex_and_wrp117=ex_and_wrp();

            state._fsp--;

            adaptor.addChild(root_0, ex_and_wrp117.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:195:20: ( '||' expression_wrapper )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==73) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:195:21: '||' expression_wrapper
            	    {
            	    string_literal118=(Token)match(input,73,FOLLOW_73_in_ex_or1097); 
            	    string_literal118_tree = 
            	    (Object)adaptor.create(string_literal118)
            	    ;
            	    adaptor.addChild(root_0, string_literal118_tree);


            	    pushFollow(FOLLOW_expression_wrapper_in_ex_or1099);
            	    expression_wrapper119=expression_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression_wrapper119.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_or"


    public static class ex_and_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_and_wrp"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:197:1: ex_and_wrp : ex_and -> ^( T_EX_AND ex_and ) ;
    public final PreprocessorParser.ex_and_wrp_return ex_and_wrp() throws RecognitionException {
        PreprocessorParser.ex_and_wrp_return retval = new PreprocessorParser.ex_and_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.ex_and_return ex_and120 =null;


        RewriteRuleSubtreeStream stream_ex_and=new RewriteRuleSubtreeStream(adaptor,"rule ex_and");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:2: ( ex_and -> ^( T_EX_AND ex_and ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:4: ex_and
            {
            pushFollow(FOLLOW_ex_and_in_ex_and_wrp1111);
            ex_and120=ex_and();

            state._fsp--;

            stream_ex_and.add(ex_and120.getTree());

            // AST REWRITE
            // elements: ex_and
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 198:11: -> ^( T_EX_AND ex_and )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:14: ^( T_EX_AND ex_and )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EX_AND, "T_EX_AND")
                , root_1);

                adaptor.addChild(root_1, stream_ex_and.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_and_wrp"


    public static class ex_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_and"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:200:1: ex_and : ex_not_wrp ( '&&' expression_wrapper )* ;
    public final PreprocessorParser.ex_and_return ex_and() throws RecognitionException {
        PreprocessorParser.ex_and_return retval = new PreprocessorParser.ex_and_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal122=null;
        PreprocessorParser.ex_not_wrp_return ex_not_wrp121 =null;

        PreprocessorParser.expression_wrapper_return expression_wrapper123 =null;


        Object string_literal122_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:200:8: ( ex_not_wrp ( '&&' expression_wrapper )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:200:10: ex_not_wrp ( '&&' expression_wrapper )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ex_not_wrp_in_ex_and1129);
            ex_not_wrp121=ex_not_wrp();

            state._fsp--;

            adaptor.addChild(root_0, ex_not_wrp121.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:200:21: ( '&&' expression_wrapper )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==65) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:200:22: '&&' expression_wrapper
            	    {
            	    string_literal122=(Token)match(input,65,FOLLOW_65_in_ex_and1132); 
            	    string_literal122_tree = 
            	    (Object)adaptor.create(string_literal122)
            	    ;
            	    adaptor.addChild(root_0, string_literal122_tree);


            	    pushFollow(FOLLOW_expression_wrapper_in_ex_and1134);
            	    expression_wrapper123=expression_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression_wrapper123.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_and"


    public static class ex_not_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_not_wrp"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:202:1: ex_not_wrp : ex_not -> ^( T_EX_NOT ex_not ) ;
    public final PreprocessorParser.ex_not_wrp_return ex_not_wrp() throws RecognitionException {
        PreprocessorParser.ex_not_wrp_return retval = new PreprocessorParser.ex_not_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.ex_not_return ex_not124 =null;


        RewriteRuleSubtreeStream stream_ex_not=new RewriteRuleSubtreeStream(adaptor,"rule ex_not");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:203:2: ( ex_not -> ^( T_EX_NOT ex_not ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:203:4: ex_not
            {
            pushFollow(FOLLOW_ex_not_in_ex_not_wrp1145);
            ex_not124=ex_not();

            state._fsp--;

            stream_ex_not.add(ex_not124.getTree());

            // AST REWRITE
            // elements: ex_not
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 203:11: -> ^( T_EX_NOT ex_not )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:203:14: ^( T_EX_NOT ex_not )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EX_NOT, "T_EX_NOT")
                , root_1);

                adaptor.addChild(root_1, stream_ex_not.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_not_wrp"


    public static class ex_not_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_not"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:205:1: ex_not : ( EXC )? ex_cond ;
    public final PreprocessorParser.ex_not_return ex_not() throws RecognitionException {
        PreprocessorParser.ex_not_return retval = new PreprocessorParser.ex_not_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXC125=null;
        PreprocessorParser.ex_cond_return ex_cond126 =null;


        Object EXC125_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:205:8: ( ( EXC )? ex_cond )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:205:10: ( EXC )? ex_cond
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:205:10: ( EXC )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==EXC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:205:10: EXC
                    {
                    EXC125=(Token)match(input,EXC,FOLLOW_EXC_in_ex_not1161); 
                    EXC125_tree = 
                    (Object)adaptor.create(EXC125)
                    ;
                    adaptor.addChild(root_0, EXC125_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_ex_cond_in_ex_not1164);
            ex_cond126=ex_cond();

            state._fsp--;

            adaptor.addChild(root_0, ex_cond126.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_not"


    public static class ex_cond_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_cond_wrp"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:207:1: ex_cond_wrp : ex_cond -> ^( T_EX_COND ex_cond ) ;
    public final PreprocessorParser.ex_cond_wrp_return ex_cond_wrp() throws RecognitionException {
        PreprocessorParser.ex_cond_wrp_return retval = new PreprocessorParser.ex_cond_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.ex_cond_return ex_cond127 =null;


        RewriteRuleSubtreeStream stream_ex_cond=new RewriteRuleSubtreeStream(adaptor,"rule ex_cond");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:208:2: ( ex_cond -> ^( T_EX_COND ex_cond ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:208:4: ex_cond
            {
            pushFollow(FOLLOW_ex_cond_in_ex_cond_wrp1174);
            ex_cond127=ex_cond();

            state._fsp--;

            stream_ex_cond.add(ex_cond127.getTree());

            // AST REWRITE
            // elements: ex_cond
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 208:12: -> ^( T_EX_COND ex_cond )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:208:15: ^( T_EX_COND ex_cond )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EX_COND, "T_EX_COND")
                , root_1);

                adaptor.addChild(root_1, stream_ex_cond.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_cond_wrp"


    public static class ex_cond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_cond"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:210:1: ex_cond : ex_sngl_wrp ( cond_op_wrp ex_sngl_wrp )? ;
    public final PreprocessorParser.ex_cond_return ex_cond() throws RecognitionException {
        PreprocessorParser.ex_cond_return retval = new PreprocessorParser.ex_cond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.ex_sngl_wrp_return ex_sngl_wrp128 =null;

        PreprocessorParser.cond_op_wrp_return cond_op_wrp129 =null;

        PreprocessorParser.ex_sngl_wrp_return ex_sngl_wrp130 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:210:9: ( ex_sngl_wrp ( cond_op_wrp ex_sngl_wrp )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:210:11: ex_sngl_wrp ( cond_op_wrp ex_sngl_wrp )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ex_sngl_wrp_in_ex_cond1192);
            ex_sngl_wrp128=ex_sngl_wrp();

            state._fsp--;

            adaptor.addChild(root_0, ex_sngl_wrp128.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:210:23: ( cond_op_wrp ex_sngl_wrp )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==L_UBR||LA32_0==R_UBR||(LA32_0 >= 69 && LA32_0 <= 71)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:210:24: cond_op_wrp ex_sngl_wrp
                    {
                    pushFollow(FOLLOW_cond_op_wrp_in_ex_cond1195);
                    cond_op_wrp129=cond_op_wrp();

                    state._fsp--;

                    adaptor.addChild(root_0, cond_op_wrp129.getTree());

                    pushFollow(FOLLOW_ex_sngl_wrp_in_ex_cond1197);
                    ex_sngl_wrp130=ex_sngl_wrp();

                    state._fsp--;

                    adaptor.addChild(root_0, ex_sngl_wrp130.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_cond"


    public static class cond_op_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond_op_wrp"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:212:1: cond_op_wrp : cond_op -> ^( T_COND_OP cond_op ) ;
    public final PreprocessorParser.cond_op_wrp_return cond_op_wrp() throws RecognitionException {
        PreprocessorParser.cond_op_wrp_return retval = new PreprocessorParser.cond_op_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.cond_op_return cond_op131 =null;


        RewriteRuleSubtreeStream stream_cond_op=new RewriteRuleSubtreeStream(adaptor,"rule cond_op");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:213:2: ( cond_op -> ^( T_COND_OP cond_op ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:213:4: cond_op
            {
            pushFollow(FOLLOW_cond_op_in_cond_op_wrp1209);
            cond_op131=cond_op();

            state._fsp--;

            stream_cond_op.add(cond_op131.getTree());

            // AST REWRITE
            // elements: cond_op
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:12: -> ^( T_COND_OP cond_op )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:213:15: ^( T_COND_OP cond_op )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_COND_OP, "T_COND_OP")
                , root_1);

                adaptor.addChild(root_1, stream_cond_op.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cond_op_wrp"


    public static class cond_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond_op"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:215:1: cond_op : ( '==' | '<=' | '>=' | L_UBR | R_UBR );
    public final PreprocessorParser.cond_op_return cond_op() throws RecognitionException {
        PreprocessorParser.cond_op_return retval = new PreprocessorParser.cond_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set132=null;

        Object set132_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:215:9: ( '==' | '<=' | '>=' | L_UBR | R_UBR )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            {
            root_0 = (Object)adaptor.nil();


            set132=(Token)input.LT(1);

            if ( input.LA(1)==L_UBR||input.LA(1)==R_UBR||(input.LA(1) >= 69 && input.LA(1) <= 71) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set132)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cond_op"


    public static class ex_sngl_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_sngl_wrp"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:217:1: ex_sngl_wrp : ex_sngl -> ^( T_EX_SNGL ex_sngl ) ;
    public final PreprocessorParser.ex_sngl_wrp_return ex_sngl_wrp() throws RecognitionException {
        PreprocessorParser.ex_sngl_wrp_return retval = new PreprocessorParser.ex_sngl_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.ex_sngl_return ex_sngl133 =null;


        RewriteRuleSubtreeStream stream_ex_sngl=new RewriteRuleSubtreeStream(adaptor,"rule ex_sngl");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:218:2: ( ex_sngl -> ^( T_EX_SNGL ex_sngl ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:218:4: ex_sngl
            {
            pushFollow(FOLLOW_ex_sngl_in_ex_sngl_wrp1252);
            ex_sngl133=ex_sngl();

            state._fsp--;

            stream_ex_sngl.add(ex_sngl133.getTree());

            // AST REWRITE
            // elements: ex_sngl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:12: -> ^( T_EX_SNGL ex_sngl )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:218:15: ^( T_EX_SNGL ex_sngl )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EX_SNGL, "T_EX_SNGL")
                , root_1);

                adaptor.addChild(root_1, stream_ex_sngl.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_sngl_wrp"


    public static class ex_sngl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_sngl"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:220:1: ex_sngl : ( math_expr_wrp | defined_wrp );
    public final PreprocessorParser.ex_sngl_return ex_sngl() throws RecognitionException {
        PreprocessorParser.ex_sngl_return retval = new PreprocessorParser.ex_sngl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.math_expr_wrp_return math_expr_wrp134 =null;

        PreprocessorParser.defined_wrp_return defined_wrp135 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:220:9: ( math_expr_wrp | defined_wrp )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID||(LA33_0 >= MINUS && LA33_0 <= PLUS)) ) {
                alt33=1;
            }
            else if ( (LA33_0==DEFINED||LA33_0==L_BR) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:220:11: math_expr_wrp
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_math_expr_wrp_in_ex_sngl1269);
                    math_expr_wrp134=math_expr_wrp();

                    state._fsp--;

                    adaptor.addChild(root_0, math_expr_wrp134.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:221:4: defined_wrp
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_defined_wrp_in_ex_sngl1275);
                    defined_wrp135=defined_wrp();

                    state._fsp--;

                    adaptor.addChild(root_0, defined_wrp135.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_sngl"


    public static class defined_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defined_wrp"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:223:1: defined_wrp : defined_expr -> ^( T_EX_DEF defined_expr ) ;
    public final PreprocessorParser.defined_wrp_return defined_wrp() throws RecognitionException {
        PreprocessorParser.defined_wrp_return retval = new PreprocessorParser.defined_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.defined_expr_return defined_expr136 =null;


        RewriteRuleSubtreeStream stream_defined_expr=new RewriteRuleSubtreeStream(adaptor,"rule defined_expr");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:224:2: ( defined_expr -> ^( T_EX_DEF defined_expr ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:224:4: defined_expr
            {
            pushFollow(FOLLOW_defined_expr_in_defined_wrp1285);
            defined_expr136=defined_expr();

            state._fsp--;

            stream_defined_expr.add(defined_expr136.getTree());

            // AST REWRITE
            // elements: defined_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:17: -> ^( T_EX_DEF defined_expr )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:224:20: ^( T_EX_DEF defined_expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EX_DEF, "T_EX_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_defined_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "defined_wrp"


    public static class defined_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defined_expr"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:226:1: defined_expr : ( DEFINED )? L_BR expression_wrapper ( mln_end )? R_BR ( mln_end )? ;
    public final PreprocessorParser.defined_expr_return defined_expr() throws RecognitionException {
        PreprocessorParser.defined_expr_return retval = new PreprocessorParser.defined_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFINED137=null;
        Token L_BR138=null;
        Token R_BR141=null;
        PreprocessorParser.expression_wrapper_return expression_wrapper139 =null;

        PreprocessorParser.mln_end_return mln_end140 =null;

        PreprocessorParser.mln_end_return mln_end142 =null;


        Object DEFINED137_tree=null;
        Object L_BR138_tree=null;
        Object R_BR141_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:2: ( ( DEFINED )? L_BR expression_wrapper ( mln_end )? R_BR ( mln_end )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:4: ( DEFINED )? L_BR expression_wrapper ( mln_end )? R_BR ( mln_end )?
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:4: ( DEFINED )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==DEFINED) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:4: DEFINED
                    {
                    DEFINED137=(Token)match(input,DEFINED,FOLLOW_DEFINED_in_defined_expr1304); 
                    DEFINED137_tree = 
                    (Object)adaptor.create(DEFINED137)
                    ;
                    adaptor.addChild(root_0, DEFINED137_tree);


                    }
                    break;

            }


            L_BR138=(Token)match(input,L_BR,FOLLOW_L_BR_in_defined_expr1307); 
            L_BR138_tree = 
            (Object)adaptor.create(L_BR138)
            ;
            adaptor.addChild(root_0, L_BR138_tree);


            pushFollow(FOLLOW_expression_wrapper_in_defined_expr1309);
            expression_wrapper139=expression_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, expression_wrapper139.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:38: ( mln_end )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==BACKSLASH) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:38: mln_end
                    {
                    pushFollow(FOLLOW_mln_end_in_defined_expr1312);
                    mln_end140=mln_end();

                    state._fsp--;

                    adaptor.addChild(root_0, mln_end140.getTree());

                    }
                    break;

            }


            R_BR141=(Token)match(input,R_BR,FOLLOW_R_BR_in_defined_expr1315); 
            R_BR141_tree = 
            (Object)adaptor.create(R_BR141)
            ;
            adaptor.addChild(root_0, R_BR141_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:53: ( mln_end )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==BACKSLASH) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RET) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:53: mln_end
                    {
                    pushFollow(FOLLOW_mln_end_in_defined_expr1318);
                    mln_end142=mln_end();

                    state._fsp--;

                    adaptor.addChild(root_0, mln_end142.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "defined_expr"


    public static class math_expr_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "math_expr_wrp"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:229:1: math_expr_wrp : math_expr -> ^( T_EX_MATH math_expr ) ;
    public final PreprocessorParser.math_expr_wrp_return math_expr_wrp() throws RecognitionException {
        PreprocessorParser.math_expr_wrp_return retval = new PreprocessorParser.math_expr_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.math_expr_return math_expr143 =null;


        RewriteRuleSubtreeStream stream_math_expr=new RewriteRuleSubtreeStream(adaptor,"rule math_expr");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:230:2: ( math_expr -> ^( T_EX_MATH math_expr ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:230:4: math_expr
            {
            pushFollow(FOLLOW_math_expr_in_math_expr_wrp1330);
            math_expr143=math_expr();

            state._fsp--;

            stream_math_expr.add(math_expr143.getTree());

            // AST REWRITE
            // elements: math_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 230:14: -> ^( T_EX_MATH math_expr )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:230:17: ^( T_EX_MATH math_expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EX_MATH, "T_EX_MATH")
                , root_1);

                adaptor.addChild(root_1, stream_math_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "math_expr_wrp"


    public static class math_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "math_expr"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:232:1: math_expr : single_expr ( op_wrp single_expr )* ;
    public final PreprocessorParser.math_expr_return math_expr() throws RecognitionException {
        PreprocessorParser.math_expr_return retval = new PreprocessorParser.math_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.single_expr_return single_expr144 =null;

        PreprocessorParser.op_wrp_return op_wrp145 =null;

        PreprocessorParser.single_expr_return single_expr146 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:233:2: ( single_expr ( op_wrp single_expr )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:233:4: single_expr ( op_wrp single_expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_single_expr_in_math_expr1350);
            single_expr144=single_expr();

            state._fsp--;

            adaptor.addChild(root_0, single_expr144.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:233:16: ( op_wrp single_expr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ASTERISK||LA37_0==MINUS||LA37_0==PLUS) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:233:17: op_wrp single_expr
            	    {
            	    pushFollow(FOLLOW_op_wrp_in_math_expr1353);
            	    op_wrp145=op_wrp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op_wrp145.getTree());

            	    pushFollow(FOLLOW_single_expr_in_math_expr1355);
            	    single_expr146=single_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_expr146.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "math_expr"


    public static class op_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op_wrp"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:235:1: op_wrp : op -> ^( T_EX_OP op ) ;
    public final PreprocessorParser.op_wrp_return op_wrp() throws RecognitionException {
        PreprocessorParser.op_wrp_return retval = new PreprocessorParser.op_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.op_return op147 =null;


        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:235:8: ( op -> ^( T_EX_OP op ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:235:10: op
            {
            pushFollow(FOLLOW_op_in_op_wrp1366);
            op147=op();

            state._fsp--;

            stream_op.add(op147.getTree());

            // AST REWRITE
            // elements: op
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 235:13: -> ^( T_EX_OP op )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:235:16: ^( T_EX_OP op )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EX_OP, "T_EX_OP")
                , root_1);

                adaptor.addChild(root_1, stream_op.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "op_wrp"


    public static class op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:237:1: op : ( ASTERISK | PLUS | MINUS );
    public final PreprocessorParser.op_return op() throws RecognitionException {
        PreprocessorParser.op_return retval = new PreprocessorParser.op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set148=null;

        Object set148_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:237:4: ( ASTERISK | PLUS | MINUS )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            {
            root_0 = (Object)adaptor.nil();


            set148=(Token)input.LT(1);

            if ( input.LA(1)==ASTERISK||input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set148)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "op"


    public static class single_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_expr"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:239:1: single_expr : ( PLUS | MINUS )? single_expr2 ;
    public final PreprocessorParser.single_expr_return single_expr() throws RecognitionException {
        PreprocessorParser.single_expr_return retval = new PreprocessorParser.single_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set149=null;
        PreprocessorParser.single_expr2_return single_expr2150 =null;


        Object set149_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:240:2: ( ( PLUS | MINUS )? single_expr2 )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:240:4: ( PLUS | MINUS )? single_expr2
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:240:4: ( PLUS | MINUS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==MINUS||LA38_0==PLUS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
                    {
                    set149=(Token)input.LT(1);

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set149)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_single_expr2_in_single_expr1410);
            single_expr2150=single_expr2();

            state._fsp--;

            adaptor.addChild(root_0, single_expr2150.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "single_expr"


    public static class single_expr2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_expr2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:242:1: single_expr2 : ( name ( L_BR ( param ( ',' param )* )? R_BR )? | const_expr );
    public final PreprocessorParser.single_expr2_return single_expr2() throws RecognitionException {
        PreprocessorParser.single_expr2_return retval = new PreprocessorParser.single_expr2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token L_BR152=null;
        Token char_literal154=null;
        Token R_BR156=null;
        PreprocessorParser.name_return name151 =null;

        PreprocessorParser.param_return param153 =null;

        PreprocessorParser.param_return param155 =null;

        PreprocessorParser.const_expr_return const_expr157 =null;


        Object L_BR152_tree=null;
        Object char_literal154_tree=null;
        Object R_BR156_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:2: ( name ( L_BR ( param ( ',' param )* )? R_BR )? | const_expr )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==NUMBER) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:4: name ( L_BR ( param ( ',' param )* )? R_BR )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_name_in_single_expr21420);
                    name151=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name151.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:9: ( L_BR ( param ( ',' param )* )? R_BR )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==L_BR) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:10: L_BR ( param ( ',' param )* )? R_BR
                            {
                            L_BR152=(Token)match(input,L_BR,FOLLOW_L_BR_in_single_expr21423); 
                            L_BR152_tree = 
                            (Object)adaptor.create(L_BR152)
                            ;
                            adaptor.addChild(root_0, L_BR152_tree);


                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:15: ( param ( ',' param )* )?
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==ID||LA40_0==NUMBER) ) {
                                alt40=1;
                            }
                            switch (alt40) {
                                case 1 :
                                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:16: param ( ',' param )*
                                    {
                                    pushFollow(FOLLOW_param_in_single_expr21426);
                                    param153=param();

                                    state._fsp--;

                                    adaptor.addChild(root_0, param153.getTree());

                                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:22: ( ',' param )*
                                    loop39:
                                    do {
                                        int alt39=2;
                                        int LA39_0 = input.LA(1);

                                        if ( (LA39_0==66) ) {
                                            alt39=1;
                                        }


                                        switch (alt39) {
                                    	case 1 :
                                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:23: ',' param
                                    	    {
                                    	    char_literal154=(Token)match(input,66,FOLLOW_66_in_single_expr21429); 
                                    	    char_literal154_tree = 
                                    	    (Object)adaptor.create(char_literal154)
                                    	    ;
                                    	    adaptor.addChild(root_0, char_literal154_tree);


                                    	    pushFollow(FOLLOW_param_in_single_expr21431);
                                    	    param155=param();

                                    	    state._fsp--;

                                    	    adaptor.addChild(root_0, param155.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop39;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            R_BR156=(Token)match(input,R_BR,FOLLOW_R_BR_in_single_expr21437); 
                            R_BR156_tree = 
                            (Object)adaptor.create(R_BR156)
                            ;
                            adaptor.addChild(root_0, R_BR156_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:244:4: const_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_const_expr_in_single_expr21444);
                    const_expr157=const_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, const_expr157.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "single_expr2"


    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:247:1: param : ( ID | NUMBER );
    public final PreprocessorParser.param_return param() throws RecognitionException {
        PreprocessorParser.param_return retval = new PreprocessorParser.param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set158=null;

        Object set158_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:247:7: ( ID | NUMBER )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            {
            root_0 = (Object)adaptor.nil();


            set158=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==NUMBER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set158)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class const_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "const_expr"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:250:1: const_expr : NUMBER ;
    public final PreprocessorParser.const_expr_return const_expr() throws RecognitionException {
        PreprocessorParser.const_expr_return retval = new PreprocessorParser.const_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUMBER159=null;

        Object NUMBER159_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:251:2: ( NUMBER )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:251:4: NUMBER
            {
            root_0 = (Object)adaptor.nil();


            NUMBER159=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_const_expr1470); 
            NUMBER159_tree = 
            (Object)adaptor.create(NUMBER159)
            ;
            adaptor.addChild(root_0, NUMBER159_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "const_expr"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA3_eotS =
        "\135\uffff";
    static final String DFA3_eofS =
        "\2\uffff\1\7\5\uffff\2\7\21\uffff\1\7\13\uffff\1\7\65\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\1\4\1\10\4\uffff\2\4\13\uffff\1\25\1\10\4\uffff\1\4"+
        "\13\uffff\1\4\13\uffff\1\10\1\25\50\uffff";
    static final String DFA3_maxS =
        "\1\111\1\uffff\1\111\1\33\4\uffff\2\111\13\uffff\1\25\1\33\4\uffff"+
        "\1\111\13\uffff\1\111\13\uffff\1\33\1\25\50\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\2\1\6\17\uffff\1\3\41\uffff\4\2\13"+
        "\uffff\3\2\13\uffff\1\3\5\uffff\1\3";
    static final String DFA3_specialS =
        "\135\uffff}>";
    static final String[] DFA3_transitionS = {
            "\3\7\1\1\2\7\3\uffff\2\7\1\3\1\4\1\5\1\6\1\2\66\7",
            "",
            "\23\7\1\10\5\7\1\11\54\7",
            "\1\25\4\uffff\1\26\1\27\6\uffff\1\27\3\uffff\3\27",
            "",
            "",
            "",
            "",
            "\12\7\1\33\73\7",
            "\12\7\1\47\73\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64\5\uffff\1\27\6\uffff\1\27\3\uffff\3\27",
            "",
            "",
            "",
            "",
            "\25\7\1\71\10\7\1\74\40\7\1\72\1\73\5\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\25\7\1\110\1\7\1\110\1\7\1\112\45\7\1\111\6\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\4\uffff\1\27\1\126\6\uffff\1\27\3\uffff\3\27",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "51:1: code_fragment : ( define_directive | import_declaration | if_simple_check_wrapper | if_define_block_wrapper | if_not_define_block_wrapper | smth_else );";
        }
    }
    static final String DFA22_eotS =
        "\u04b9\uffff";
    static final String DFA22_eofS =
        "\1\3\1\uffff\1\14\2\uffff\3\26\1\uffff\2\26\2\uffff\1\146\16\uffff"+
        "\2\146\10\uffff\1\146\4\uffff\1\146\1\u00b5\1\u00c7\11\uffff\1\u00c7"+
        "\15\uffff\1\u00eb\15\uffff\1\u00f8\4\uffff\1\u00f8\26\uffff\1\u00f8"+
        "\4\uffff\2\u00f8\1\u0142\2\u0154\1\uffff\1\u0154\15\uffff\1\u0154"+
        "\13\uffff\1\u0154\1\uffff\1\u0154\1\u01b6\1\u01c8\14\uffff\1\u01c8"+
        "\1\uffff\1\u01ec\14\uffff\1\u01fe\1\uffff\4\u01fe\14\uffff\1\u01fe"+
        "\1\uffff\3\u01fe\14\uffff\1\u01fe\1\uffff\5\u01fe\46\uffff\1\u01fe"+
        "\15\uffff\1\u0318\15\uffff\1\u0328\1\uffff\1\u0328\1\u0345\2\u0357"+
        "\14\uffff\1\u0357\1\uffff\1\u0389\14\uffff\1\u039b\1\uffff\4\u039b"+
        "\14\uffff\1\u039b\1\uffff\3\u039b\14\uffff\1\u039b\15\uffff\1\u039b"+
        "\1\uffff\5\u039b\u0340\uffff";
    static final String DFA22_minS =
        "\1\4\1\uffff\1\4\2\uffff\3\4\1\uffff\2\4\2\uffff\1\4\16\uffff\2"+
        "\4\10\uffff\1\4\4\uffff\3\4\11\uffff\1\4\15\uffff\1\4\15\uffff\1"+
        "\4\4\uffff\1\4\26\uffff\1\4\4\uffff\5\4\1\uffff\1\4\15\uffff\1\4"+
        "\13\uffff\1\4\1\uffff\3\4\14\uffff\1\4\1\uffff\1\4\14\uffff\1\4"+
        "\1\uffff\4\4\14\uffff\1\4\1\uffff\3\4\14\uffff\1\4\1\uffff\5\4\46"+
        "\uffff\1\4\15\uffff\1\4\15\uffff\1\4\1\uffff\4\4\14\uffff\1\4\1"+
        "\uffff\1\4\14\uffff\1\4\1\uffff\4\4\14\uffff\1\4\1\uffff\3\4\14"+
        "\uffff\1\4\15\uffff\1\4\1\uffff\5\4\u0340\uffff";
    static final String DFA22_maxS =
        "\1\111\1\uffff\1\111\2\uffff\3\111\1\uffff\2\111\2\uffff\1\111\16"+
        "\uffff\2\111\10\uffff\1\111\4\uffff\3\111\11\uffff\1\111\15\uffff"+
        "\1\111\15\uffff\1\111\4\uffff\1\111\26\uffff\1\111\4\uffff\5\111"+
        "\1\uffff\1\111\15\uffff\1\111\13\uffff\1\111\1\uffff\3\111\14\uffff"+
        "\1\111\1\uffff\1\111\14\uffff\1\111\1\uffff\4\111\14\uffff\1\111"+
        "\1\uffff\3\111\14\uffff\1\111\1\uffff\5\111\46\uffff\1\111\15\uffff"+
        "\1\111\15\uffff\1\111\1\uffff\4\111\14\uffff\1\111\1\uffff\1\111"+
        "\14\uffff\1\111\1\uffff\4\111\14\uffff\1\111\1\uffff\3\111\14\uffff"+
        "\1\111\15\uffff\1\111\1\uffff\5\111\u0340\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\1\3\uffff\1\1\3\uffff\1\1\11\uffff\1"+
        "\1\117\uffff\1\1\116\uffff\1\1\21\uffff\1\1\43\uffff\1\1\14\uffff"+
        "\1\1\111\uffff\1\1\21\uffff\1\1\45\uffff\1\1\13\uffff\1\1\1\uffff"+
        "\4\1\1\uffff\1\1\30\uffff\1\1\1\uffff\1\1\14\uffff\6\1\14\uffff"+
        "\5\1\14\uffff\1\1\1\uffff\5\1\14\uffff\6\1\14\uffff\5\1\14\uffff"+
        "\1\1\1\uffff\1\1\14\uffff\1\1\1\uffff\2\1\14\uffff\1\1\1\uffff\4"+
        "\1\14\uffff\1\1\1\uffff\5\1\14\uffff\1\1\1\uffff\5\1\14\uffff\1"+
        "\1\1\uffff\2\1\14\uffff\1\1\1\uffff\4\1\14\uffff\1\1\1\uffff\5\1"+
        "\14\uffff\1\1\1\uffff\5\1\14\uffff\1\1\1\uffff\4\1\14\uffff\1\1"+
        "\1\uffff\1\1\10\uffff\1\1\3\uffff\1\1\1\uffff\5\1\10\uffff\1\1\3"+
        "\uffff\1\1\1\uffff\4\1\14\uffff\1\1\15\uffff\1\1\1\uffff\5\1\14"+
        "\uffff\1\1\1\uffff\3\1\14\uffff\1\1\1\uffff\2\1\14\uffff\1\1\1\uffff"+
        "\1\1\14\uffff\6\1\14\uffff\5\1\14\uffff\1\1\15\uffff\1\1\1\uffff"+
        "\5\1\14\uffff\6\1\14\uffff\5\1\14\uffff\1\1\1\uffff\1\1\14\uffff"+
        "\1\1\1\uffff\2\1\14\uffff\1\1\1\uffff\4\1\14\uffff\1\1\1\uffff\5"+
        "\1\14\uffff\1\1\1\uffff\5\1\14\uffff\1\1\1\uffff\2\1\14\uffff\1"+
        "\1\1\uffff\4\1\14\uffff\1\1\1\uffff\5\1\14\uffff\1\1\1\uffff\5\1"+
        "\14\uffff\1\1\1\uffff\5\1\14\uffff\1\1\1\uffff\4\1\14\uffff\1\1"+
        "\1\uffff\1\1\10\uffff\1\1\3\uffff\1\1\1\uffff\5\1\10\uffff\1\1\3"+
        "\uffff\1\1\1\uffff\4\1\14\uffff\1\1\15\uffff\1\1\1\uffff\5\1\1\uffff";
    static final String DFA22_specialS =
        "\u04b9\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\10\1\3\1\10\1\2\2\10\1\15\1\12\1\14\2\10\1\5\1\6\1\7\1\11"+
            "\1\4\13\10\1\3\50\10\1\1\1\10",
            "",
            "\1\26\1\14\1\26\1\14\7\26\5\14\66\26",
            "",
            "",
            "\4\26\1\34\4\26\1\35\1\53\6\26\1\55\3\26\1\46\1\54\1\46\56"+
            "\26",
            "\12\26\1\67\73\26",
            "\12\26\1\105\73\26",
            "",
            "\23\26\1\123\5\26\1\130\54\26",
            "\33\26\1\146\52\26",
            "",
            "",
            "\4\146\1\167\4\146\1\157\1\165\6\146\1\170\3\146\1\164\1\166"+
            "\1\164\56\146",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\21\146\1\172\64\146",
            "\4\146\1\u0088\5\146\1\u0096\6\146\1\u0098\3\146\1\u0094\1"+
            "\u0097\1\u0094\56\146",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\146\1\u00a5\13\146\1\u00a7\57\146",
            "",
            "",
            "",
            "",
            "\1\u00b6\1\146\1\u00b5\1\146\2\u00b5\3\146\2\u00b5\5\146\1"+
            "\u00b5\1\u00b4\1\u00b5\1\u00b7\1\u00b5\1\u00b6\1\u00b5\1\u00b6"+
            "\6\u00b5\1\u00b7\36\u00b5\1\u00b8\3\u00b5\3\u00b7\1\u00b5\1"+
            "\u00b9",
            "\1\u00c6\1\u00b5\1\u00c7\1\u00b5\2\u00c7\3\u00b5\2\u00c7\5"+
            "\u00b5\3\u00c7\1\u00c8\1\u00c7\1\u00c6\1\u00c7\1\u00c6\6\u00c7"+
            "\1\u00c8\36\u00c7\1\u00c9\3\u00c7\3\u00c8\1\u00c7\1\u00ca",
            "\4\u00c7\1\u00dc\4\u00c7\1\u00d7\1\u00da\6\u00c7\1\u00dd\3"+
            "\u00c7\1\u00d9\1\u00db\1\u00d9\56\u00c7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\33\u00c7\1\u00eb\52\u00c7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\33\u00eb\1\u00f8\52\u00eb",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00f8\1\u0104\73\u00f8",
            "",
            "",
            "",
            "",
            "\12\u00f8\1\u0112\73\u00f8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u00f8\1\u0124\5\u00f8\1\u0122\6\u00f8\1\u0125\3\u00f8\1"+
            "\u0120\1\u0123\1\u0120\56\u00f8",
            "",
            "",
            "",
            "",
            "\12\u00f8\1\u0132\13\u00f8\1\u0134\57\u00f8",
            "\1\u0143\1\u00f8\1\u0142\1\u00f8\2\u0142\3\u00f8\2\u0142\5"+
            "\u00f8\1\u0142\1\u0141\1\u0142\1\u0144\1\u0142\1\u0143\1\u0142"+
            "\1\u0143\6\u0142\1\u0144\36\u0142\1\u0145\3\u0142\3\u0144\1"+
            "\u0142\1\u0146",
            "\1\u0153\1\u0142\1\u0154\1\u0142\2\u0154\3\u0142\2\u0154\5"+
            "\u0142\3\u0154\1\u0155\1\u0154\1\u0153\1\u0154\1\u0153\6\u0154"+
            "\1\u0155\36\u0154\1\u0156\3\u0154\3\u0155\1\u0154\1\u0157",
            "\21\u0154\1\u0164\64\u0154",
            "\4\u0154\1\u0177\4\u0154\1\u0172\1\u0175\6\u0154\1\u0178\3"+
            "\u0154\1\u0174\1\u0176\1\u0174\56\u0154",
            "",
            "\4\u0154\1\u018a\4\u0154\1\u0186\1\u017a\6\u0154\1\u018b\3"+
            "\u0154\1\u0188\1\u0189\1\u0188\56\u0154",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\21\u0154\1\u018d\64\u0154",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0154\1\u01a6\13\u0154\1\u01a8\57\u0154",
            "",
            "\1\u01b7\1\u0154\1\u01b6\1\u0154\2\u01b6\3\u0154\2\u01b6\5"+
            "\u0154\1\u01b6\1\u01b5\1\u01b6\1\u01b8\1\u01b6\1\u01b7\1\u01b6"+
            "\1\u01b7\6\u01b6\1\u01b8\36\u01b6\1\u01b9\3\u01b6\3\u01b8\1"+
            "\u01b6\1\u01ba",
            "\1\u01c7\1\u01b6\1\u01c8\1\u01b6\2\u01c8\3\u01b6\2\u01c8\5"+
            "\u01b6\3\u01c8\1\u01c9\1\u01c8\1\u01c7\1\u01c8\1\u01c7\6\u01c8"+
            "\1\u01c9\36\u01c8\1\u01ca\3\u01c8\3\u01c9\1\u01c8\1\u01cb",
            "\4\u01c8\1\u01dd\4\u01c8\1\u01d8\1\u01db\6\u01c8\1\u01de\3"+
            "\u01c8\1\u01da\1\u01dc\1\u01da\56\u01c8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01ed\1\u01c8\1\u01ec\1\u01c8\2\u01ec\3\u01c8\2\u01ec\5"+
            "\u01c8\1\u01ec\1\u01eb\1\u01ec\1\u01ee\1\u01ec\1\u01ed\1\u01ec"+
            "\1\u01ed\6\u01ec\1\u01ee\36\u01ec\1\u01ef\3\u01ec\3\u01ee\1"+
            "\u01ec\1\u01f0",
            "",
            "\1\u01fd\1\u01ec\1\u01fe\1\u01ec\2\u01fe\3\u01ec\2\u01fe\5"+
            "\u01ec\3\u01fe\1\u01ff\1\u01fe\1\u01fd\1\u01fe\1\u01fd\6\u01fe"+
            "\1\u01ff\36\u01fe\1\u0200\3\u01fe\3\u01ff\1\u01fe\1\u0201",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u01fe\1\u020e\13\u01fe\1\u020e\5\u01fe\1\u0210\51\u01fe",
            "",
            "\12\u01fe\1\u021f\12\u01fe\1\u021d\1\u0220\1\u021d\56\u01fe",
            "\4\u01fe\1\u0231\5\u01fe\1\u022f\6\u01fe\1\u0232\3\u01fe\1"+
            "\u022d\1\u0230\1\u022d\56\u01fe",
            "\4\u01fe\1\u0244\4\u01fe\1\u023f\1\u0242\6\u01fe\1\u0245\3"+
            "\u01fe\1\u0241\1\u0243\1\u0241\56\u01fe",
            "\4\u01fe\1\u0257\4\u01fe\1\u0252\1\u0255\6\u01fe\1\u0258\3"+
            "\u01fe\1\u0254\1\u0256\1\u0254\56\u01fe",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u01fe\1\u0267\12\u01fe\1\u0265\1\u0268\1\u0265\56\u01fe",
            "",
            "\4\u01fe\1\u0279\5\u01fe\1\u0277\6\u01fe\1\u027a\3\u01fe\1"+
            "\u0275\1\u0278\1\u0275\56\u01fe",
            "\4\u01fe\1\u028c\4\u01fe\1\u0287\1\u028a\6\u01fe\1\u028d\3"+
            "\u01fe\1\u0289\1\u028b\1\u0289\56\u01fe",
            "\4\u01fe\1\u029f\4\u01fe\1\u029a\1\u029d\6\u01fe\1\u02a0\3"+
            "\u01fe\1\u029c\1\u029e\1\u029c\56\u01fe",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u01fe\1\u02b1\5\u01fe\1\u02af\6\u01fe\1\u02b2\3\u01fe\1"+
            "\u02ad\1\u02b0\1\u02ad\56\u01fe",
            "",
            "\12\u01fe\1\u02bf\13\u01fe\1\u02c1\57\u01fe",
            "\1\u02d0\1\u02ca\17\u01fe\1\u02ce\1\u01fe\1\u02d1\1\u01fe\1"+
            "\u02d0\1\u01fe\1\u02d0\4\u01fe\1\u02d4\1\u01fe\1\u02d1\36\u01fe"+
            "\1\u02d2\3\u01fe\3\u02d1\1\u01fe\1\u02d3",
            "\1\u02e1\1\u02dd\21\u01fe\1\u02e3\1\u01fe\1\u02e1\1\u01fe\1"+
            "\u02e1\4\u01fe\1\u02e6\1\u01fe\1\u02e3\36\u01fe\1\u02e4\3\u01fe"+
            "\3\u02e3\1\u01fe\1\u02e5",
            "\21\u01fe\1\u02f3\64\u01fe",
            "\4\u01fe\1\u0306\4\u01fe\1\u0301\1\u0304\6\u01fe\1\u0307\3"+
            "\u01fe\1\u0303\1\u0305\1\u0303\56\u01fe",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0318\1\u01fe\1\u0318\1\u01fe\2\u0318\3\u01fe\2\u0318\5"+
            "\u01fe\5\u0318\1\u0314\5\u0318\1\u01fe\43\u0318\1\u0316\1\u0317"+
            "\5\u0318",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0328\1\u0318\1\u0328\1\u0318\2\u0328\3\u0318\2\u0328\5"+
            "\u0318\5\u0328\1\u0325\1\u0328\1\u0325\3\u0328\1\u0318\43\u0328"+
            "\1\u0327\6\u0328",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0328\1\u0335\13\u0328\1\u0337\57\u0328",
            "",
            "\1\u0346\1\u0328\1\u0345\1\u0328\2\u0345\3\u0328\2\u0345\5"+
            "\u0328\1\u0345\1\u0344\1\u0345\1\u0347\1\u0345\1\u0346\1\u0345"+
            "\1\u0346\6\u0345\1\u0347\36\u0345\1\u0348\3\u0345\3\u0347\1"+
            "\u0345\1\u0349",
            "\1\u0356\1\u0345\1\u0357\1\u0345\2\u0357\3\u0345\2\u0357\5"+
            "\u0345\3\u0357\1\u0358\1\u0357\1\u0356\1\u0357\1\u0356\6\u0357"+
            "\1\u0358\36\u0357\1\u0359\3\u0357\3\u0358\1\u0357\1\u035a",
            "\21\u0357\1\u0367\64\u0357",
            "\4\u0357\1\u037a\4\u0357\1\u0375\1\u0378\6\u0357\1\u037b\3"+
            "\u0357\1\u0377\1\u0379\1\u0377\56\u0357",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u038a\1\u0357\1\u0389\1\u0357\2\u0389\3\u0357\2\u0389\5"+
            "\u0357\1\u0389\1\u0388\1\u0389\1\u038b\1\u0389\1\u038a\1\u0389"+
            "\1\u038a\6\u0389\1\u038b\36\u0389\1\u038c\3\u0389\3\u038b\1"+
            "\u0389\1\u038d",
            "",
            "\1\u039a\1\u0389\1\u039b\1\u0389\2\u039b\3\u0389\2\u039b\5"+
            "\u0389\3\u039b\1\u039c\1\u039b\1\u039a\1\u039b\1\u039a\6\u039b"+
            "\1\u039c\36\u039b\1\u039d\3\u039b\3\u039c\1\u039b\1\u039e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u039b\1\u03ab\13\u039b\1\u03ab\5\u039b\1\u03ad\51\u039b",
            "",
            "\12\u039b\1\u03bc\12\u039b\1\u03ba\1\u03bd\1\u03ba\56\u039b",
            "\4\u039b\1\u03ce\5\u039b\1\u03cc\6\u039b\1\u03cf\3\u039b\1"+
            "\u03ca\1\u03cd\1\u03ca\56\u039b",
            "\4\u039b\1\u03e1\4\u039b\1\u03dc\1\u03df\6\u039b\1\u03e2\3"+
            "\u039b\1\u03de\1\u03e0\1\u03de\56\u039b",
            "\4\u039b\1\u03f4\4\u039b\1\u03ef\1\u03f2\6\u039b\1\u03f5\3"+
            "\u039b\1\u03f1\1\u03f3\1\u03f1\56\u039b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u039b\1\u0404\12\u039b\1\u0402\1\u0405\1\u0402\56\u039b",
            "",
            "\4\u039b\1\u0416\5\u039b\1\u0414\6\u039b\1\u0417\3\u039b\1"+
            "\u0412\1\u0415\1\u0412\56\u039b",
            "\4\u039b\1\u0429\4\u039b\1\u0424\1\u0427\6\u039b\1\u042a\3"+
            "\u039b\1\u0426\1\u0428\1\u0426\56\u039b",
            "\4\u039b\1\u043c\4\u039b\1\u0437\1\u043a\6\u039b\1\u043d\3"+
            "\u039b\1\u0439\1\u043b\1\u0439\56\u039b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u039b\1\u044f\4\u039b\1\u044a\1\u044d\6\u039b\1\u0450\3"+
            "\u039b\1\u044c\1\u044e\1\u044c\56\u039b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u039b\1\u0461\5\u039b\1\u045f\6\u039b\1\u0462\3\u039b\1"+
            "\u045d\1\u0460\1\u045d\56\u039b",
            "",
            "\12\u039b\1\u046f\13\u039b\1\u0471\57\u039b",
            "\1\u0480\1\u047a\17\u039b\1\u047e\1\u039b\1\u0481\1\u039b\1"+
            "\u0480\1\u039b\1\u0480\4\u039b\1\u0484\1\u039b\1\u0481\36\u039b"+
            "\1\u0482\3\u039b\3\u0481\1\u039b\1\u0483",
            "\1\u0491\1\u048d\21\u039b\1\u0493\1\u039b\1\u0491\1\u039b\1"+
            "\u0491\4\u039b\1\u0496\1\u039b\1\u0493\36\u039b\1\u0494\3\u039b"+
            "\3\u0493\1\u039b\1\u0495",
            "\21\u039b\1\u04a3\64\u039b",
            "\4\u039b\1\u04b6\4\u039b\1\u04b1\1\u04b4\6\u039b\1\u04b7\3"+
            "\u039b\1\u04b3\1\u04b5\1\u04b3\56\u039b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "155:33: ( replace_wrapper )?";
        }
    }
    static final String DFA23_eotS =
        "\133\uffff";
    static final String DFA23_eofS =
        "\2\2\16\uffff\2\2\15\uffff\1\2\16\uffff\1\2\54\uffff";
    static final String DFA23_minS =
        "\2\4\16\uffff\2\4\15\uffff\1\4\16\uffff\1\4\54\uffff";
    static final String DFA23_maxS =
        "\2\111\16\uffff\2\111\15\uffff\1\111\16\uffff\1\111\54\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\35\uffff\1\1\16\uffff\1\1\15\uffff\2\1\15\uffff\2\1"+
        "\15\uffff";
    static final String DFA23_specialS =
        "\133\uffff}>";
    static final String[] DFA23_transitionS = {
            "\21\2\1\1\64\2",
            "\12\2\1\20\15\2\1\21\55\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\34\2\1\40\41\2\1\37\7\2",
            "\34\2\1\57\41\2\1\56\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\2\1\75\15\2\1\76\55\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\2\1\114\15\2\1\115\55\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "161:17: ( in_brackets_wrapper )?";
        }
    }
    static final String DFA26_eotS =
        "\u00a1\uffff";
    static final String DFA26_eofS =
        "\1\1\7\uffff\1\1\13\uffff\1\1\5\uffff\1\47\1\uffff\4\47\1\uffff"+
        "\1\163\1\uffff\1\163\1\uffff\1\1\173\uffff";
    static final String DFA26_minS =
        "\1\4\7\uffff\1\4\13\uffff\1\4\5\uffff\1\4\1\uffff\4\4\1\uffff\1"+
        "\4\1\uffff\1\4\1\uffff\1\4\173\uffff";
    static final String DFA26_maxS =
        "\1\111\7\uffff\1\111\13\uffff\1\111\5\uffff\1\111\1\uffff\4\111"+
        "\1\uffff\1\111\1\uffff\1\111\1\uffff\1\111\173\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\31\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2"+
        "\uffff\1\1\15\uffff\6\1\15\uffff\1\1\15\uffff\1\1\15\uffff\2\1\15"+
        "\uffff\1\1\14\uffff\6\1\16\uffff\14\1\1\uffff";
    static final String DFA26_specialS =
        "\u00a1\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\10\104\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\33\1\1\24\52\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\1\1\44\1\32\2\44\1\43\1\41\1\42\2\44\1\34\1\35\1\36"+
            "\1\37\1\33\13\44\1\45\50\44\1\40\1\44",
            "",
            "",
            "",
            "",
            "",
            "\106\47",
            "",
            "\4\47\1\65\4\47\1\66\1\70\6\47\1\72\3\47\1\67\1\71\1\67\56"+
            "\47",
            "\12\47\1\110\73\47",
            "\12\47\1\126\73\47",
            "\23\47\1\144\5\47\1\145\54\47",
            "",
            "\106\163",
            "",
            "\4\163\1\u0084\4\163\1\u0080\1\u0082\6\163\1\u0085\3\163\1"+
            "\u0081\1\u0083\1\u0081\56\163",
            "",
            "\1\u009e\1\1\1\u009e\1\u0094\2\u009e\1\u009d\1\u009b\1\u009c"+
            "\2\u009e\1\u0096\1\u0097\1\u0098\1\u0099\1\u0095\13\u009e\1"+
            "\u009f\50\u009e\1\u009a\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 184:28: ( backslash ret replace_internal )*";
        }
    }
    static final String DFA27_eotS =
        "\u04b9\uffff";
    static final String DFA27_eofS =
        "\1\1\2\uffff\1\16\1\uffff\4\16\1\uffff\1\132\1\uffff\1\132\17\uffff"+
        "\3\132\1\u00ae\2\u00bf\15\uffff\1\u00df\15\uffff\1\u00ec\15\uffff"+
        "\2\u00ec\32\uffff\2\u00ec\1\u013b\3\u014c\15\uffff\1\u014c\15\uffff"+
        "\2\u014c\1\u01af\2\u01c0\15\uffff\1\u01e5\1\u01f6\15\uffff\5\u01f6"+
        "\15\uffff\4\u01f6\15\uffff\6\u01f6\47\uffff\1\u030c\15\uffff\1\u031c"+
        "\15\uffff\1\u031c\1\u033e\3\u034f\15\uffff\1\u0382\1\u0393\15\uffff"+
        "\5\u0393\15\uffff\4\u0393\15\uffff\1\u0393\15\uffff\6\u0393\u034c"+
        "\uffff";
    static final String DFA27_minS =
        "\1\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\17\uffff\6"+
        "\4\15\uffff\1\4\15\uffff\1\4\15\uffff\2\4\32\uffff\6\4\15\uffff"+
        "\1\4\15\uffff\5\4\15\uffff\2\4\15\uffff\5\4\15\uffff\4\4\15\uffff"+
        "\6\4\47\uffff\1\4\15\uffff\1\4\15\uffff\5\4\15\uffff\2\4\15\uffff"+
        "\5\4\15\uffff\4\4\15\uffff\1\4\15\uffff\6\4\u034c\uffff";
    static final String DFA27_maxS =
        "\1\111\2\uffff\1\111\1\uffff\4\111\1\uffff\1\111\1\uffff\1\111\17"+
        "\uffff\6\111\15\uffff\1\111\15\uffff\1\111\15\uffff\2\111\32\uffff"+
        "\6\111\15\uffff\1\111\15\uffff\5\111\15\uffff\2\111\15\uffff\5\111"+
        "\15\uffff\4\111\15\uffff\6\111\47\uffff\1\111\15\uffff\1\111\15"+
        "\uffff\5\111\15\uffff\2\111\15\uffff\5\111\15\uffff\4\111\15\uffff"+
        "\1\111\15\uffff\6\111\u034c\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\4\uffff\1\1\1\uffff\1\1\2\uffff\1\1\113"+
        "\uffff\1\1\123\uffff\1\1\20\uffff\1\1\37\uffff\1\1\14\uffff\1\1"+
        "\116\uffff\1\1\20\uffff\1\1\55\uffff\6\1\15\uffff\1\1\15\uffff\2"+
        "\1\15\uffff\6\1\14\uffff\5\1\14\uffff\6\1\15\uffff\6\1\14\uffff"+
        "\5\1\14\uffff\2\1\15\uffff\3\1\15\uffff\5\1\15\uffff\6\1\15\uffff"+
        "\6\1\15\uffff\3\1\15\uffff\5\1\15\uffff\6\1\15\uffff\6\1\15\uffff"+
        "\5\1\15\uffff\2\1\15\uffff\7\1\14\uffff\6\1\14\uffff\1\1\15\uffff"+
        "\6\1\15\uffff\4\1\15\uffff\3\1\15\uffff\2\1\15\uffff\6\1\14\uffff"+
        "\5\1\14\uffff\1\1\15\uffff\6\1\15\uffff\6\1\14\uffff\5\1\14\uffff"+
        "\2\1\15\uffff\3\1\15\uffff\5\1\15\uffff\6\1\15\uffff\6\1\15\uffff"+
        "\3\1\15\uffff\5\1\15\uffff\6\1\15\uffff\6\1\15\uffff\6\1\15\uffff"+
        "\5\1\15\uffff\2\1\15\uffff\7\1\14\uffff\6\1\14\uffff\1\1\15\uffff"+
        "\6\1\15\uffff";
    static final String DFA27_specialS =
        "\u04b9\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\11\1\1\1\11\1\3\2\11\1\14\1\12\1\13\2\11\1\5\1\6\1\7\1\10"+
            "\1\4\13\11\1\1\52\11",
            "",
            "",
            "\106\16",
            "",
            "\4\16\1\34\4\16\1\35\1\37\6\16\1\41\3\16\1\36\1\40\1\36\56"+
            "\16",
            "\12\16\1\57\73\16",
            "\12\16\1\75\73\16",
            "\23\16\1\113\5\16\1\114\54\16",
            "",
            "\106\132",
            "",
            "\4\132\1\153\4\132\1\147\1\151\6\132\1\154\3\132\1\150\1\152"+
            "\1\150\56\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\21\132\1\172\64\132",
            "\4\132\1\u0088\5\132\1\u008a\6\132\1\u008c\3\132\1\u0089\1"+
            "\u008b\1\u0089\56\132",
            "\12\132\1\u009a\13\132\1\u009b\57\132",
            "\1\u00aa\20\u00ae\1\u00a9\1\u00ae\1\u00ab\1\u00ae\1\u00aa\1"+
            "\u00ae\1\u00aa\6\u00ae\1\u00ab\36\u00ae\1\u00ac\3\u00ae\3\u00ab"+
            "\1\u00ae\1\u00ad",
            "\1\u00bb\22\u00bf\1\u00bc\1\u00bf\1\u00bb\1\u00bf\1\u00bb\6"+
            "\u00bf\1\u00bc\36\u00bf\1\u00bd\3\u00bf\3\u00bc\1\u00bf\1\u00be",
            "\4\u00bf\1\u00d0\4\u00bf\1\u00cc\1\u00ce\6\u00bf\1\u00d1\3"+
            "\u00bf\1\u00cd\1\u00cf\1\u00cd\56\u00bf",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\106\u00df",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\106\u00ec",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00ec\1\u00f9\73\u00ec",
            "\12\u00ec\1\u0107\73\u00ec",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u00ec\1\u0118\5\u00ec\1\u0116\6\u00ec\1\u0119\3\u00ec\1"+
            "\u0115\1\u0117\1\u0115\56\u00ec",
            "\12\u00ec\1\u0127\13\u00ec\1\u0128\57\u00ec",
            "\1\u0137\20\u013b\1\u0136\1\u013b\1\u0138\1\u013b\1\u0137\1"+
            "\u013b\1\u0137\6\u013b\1\u0138\36\u013b\1\u0139\3\u013b\3\u0138"+
            "\1\u013b\1\u013a",
            "\1\u0148\22\u014c\1\u0149\1\u014c\1\u0148\1\u014c\1\u0148\6"+
            "\u014c\1\u0149\36\u014c\1\u014a\3\u014c\3\u0149\1\u014c\1\u014b",
            "\21\u014c\1\u0159\64\u014c",
            "\4\u014c\1\u016b\4\u014c\1\u0167\1\u0169\6\u014c\1\u016c\3"+
            "\u014c\1\u0168\1\u016a\1\u0168\56\u014c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u014c\1\u017e\4\u014c\1\u017b\1\u017a\6\u014c\1\u017f\3"+
            "\u014c\1\u017c\1\u017d\1\u017c\56\u014c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\21\u014c\1\u018d\64\u014c",
            "\12\u014c\1\u019b\13\u014c\1\u019c\57\u014c",
            "\1\u01ab\20\u01af\1\u01aa\1\u01af\1\u01ac\1\u01af\1\u01ab\1"+
            "\u01af\1\u01ab\6\u01af\1\u01ac\36\u01af\1\u01ad\3\u01af\3\u01ac"+
            "\1\u01af\1\u01ae",
            "\1\u01bc\22\u01c0\1\u01bd\1\u01c0\1\u01bc\1\u01c0\1\u01bc\6"+
            "\u01c0\1\u01bd\36\u01c0\1\u01be\3\u01c0\3\u01bd\1\u01c0\1\u01bf",
            "\4\u01c0\1\u01d1\4\u01c0\1\u01cd\1\u01cf\6\u01c0\1\u01d2\3"+
            "\u01c0\1\u01ce\1\u01d0\1\u01ce\56\u01c0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01e1\20\u01e5\1\u01e0\1\u01e5\1\u01e2\1\u01e5\1\u01e1\1"+
            "\u01e5\1\u01e1\6\u01e5\1\u01e2\36\u01e5\1\u01e3\3\u01e5\3\u01e2"+
            "\1\u01e5\1\u01e4",
            "\1\u01f2\22\u01f6\1\u01f3\1\u01f6\1\u01f2\1\u01f6\1\u01f2\6"+
            "\u01f6\1\u01f3\36\u01f6\1\u01f4\3\u01f6\3\u01f3\1\u01f6\1\u01f5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u01f6\1\u0203\13\u01f6\1\u0203\5\u01f6\1\u0204\51\u01f6",
            "\12\u01f6\1\u0213\12\u01f6\1\u0212\1\u0214\1\u0212\56\u01f6",
            "\4\u01f6\1\u0225\5\u01f6\1\u0223\6\u01f6\1\u0226\3\u01f6\1"+
            "\u0222\1\u0224\1\u0222\56\u01f6",
            "\4\u01f6\1\u0238\4\u01f6\1\u0234\1\u0236\6\u01f6\1\u0239\3"+
            "\u01f6\1\u0235\1\u0237\1\u0235\56\u01f6",
            "\4\u01f6\1\u024b\4\u01f6\1\u0247\1\u0249\6\u01f6\1\u024c\3"+
            "\u01f6\1\u0248\1\u024a\1\u0248\56\u01f6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u01f6\1\u025b\12\u01f6\1\u025a\1\u025c\1\u025a\56\u01f6",
            "\4\u01f6\1\u026d\5\u01f6\1\u026b\6\u01f6\1\u026e\3\u01f6\1"+
            "\u026a\1\u026c\1\u026a\56\u01f6",
            "\4\u01f6\1\u0280\4\u01f6\1\u027c\1\u027e\6\u01f6\1\u0281\3"+
            "\u01f6\1\u027d\1\u027f\1\u027d\56\u01f6",
            "\4\u01f6\1\u0293\4\u01f6\1\u028f\1\u0291\6\u01f6\1\u0294\3"+
            "\u01f6\1\u0290\1\u0292\1\u0290\56\u01f6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u01f6\1\u02a5\5\u01f6\1\u02a3\6\u01f6\1\u02a6\3\u01f6\1"+
            "\u02a2\1\u02a4\1\u02a2\56\u01f6",
            "\12\u01f6\1\u02b4\13\u01f6\1\u02b5\57\u01f6",
            "\1\u02c4\1\u02c8\17\u01f6\1\u02c3\1\u01f6\1\u02c5\1\u01f6\1"+
            "\u02c4\1\u01f6\1\u02c4\4\u01f6\1\u02c9\1\u01f6\1\u02c5\36\u01f6"+
            "\1\u02c6\3\u01f6\3\u02c5\1\u01f6\1\u02c7",
            "\1\u02d6\1\u02da\21\u01f6\1\u02d7\1\u01f6\1\u02d6\1\u01f6\1"+
            "\u02d6\4\u01f6\1\u02db\1\u01f6\1\u02d7\36\u01f6\1\u02d8\3\u01f6"+
            "\3\u02d7\1\u01f6\1\u02d9",
            "\21\u01f6\1\u02e8\64\u01f6",
            "\4\u01f6\1\u02fa\4\u01f6\1\u02f6\1\u02f8\6\u01f6\1\u02fb\3"+
            "\u01f6\1\u02f7\1\u02f9\1\u02f7\56\u01f6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\25\u030c\1\u0309\51\u030c\1\u030a\1\u030b\5\u030c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\25\u031c\1\u031a\1\u031c\1\u031a\47\u031c\1\u031b\6\u031c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u031c\1\u032a\13\u031c\1\u032b\57\u031c",
            "\1\u033a\20\u033e\1\u0339\1\u033e\1\u033b\1\u033e\1\u033a\1"+
            "\u033e\1\u033a\6\u033e\1\u033b\36\u033e\1\u033c\3\u033e\3\u033b"+
            "\1\u033e\1\u033d",
            "\1\u034b\22\u034f\1\u034c\1\u034f\1\u034b\1\u034f\1\u034b\6"+
            "\u034f\1\u034c\36\u034f\1\u034d\3\u034f\3\u034c\1\u034f\1\u034e",
            "\21\u034f\1\u035c\64\u034f",
            "\4\u034f\1\u036e\4\u034f\1\u036a\1\u036c\6\u034f\1\u036f\3"+
            "\u034f\1\u036b\1\u036d\1\u036b\56\u034f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u037e\20\u0382\1\u037d\1\u0382\1\u037f\1\u0382\1\u037e\1"+
            "\u0382\1\u037e\6\u0382\1\u037f\36\u0382\1\u0380\3\u0382\3\u037f"+
            "\1\u0382\1\u0381",
            "\1\u038f\22\u0393\1\u0390\1\u0393\1\u038f\1\u0393\1\u038f\6"+
            "\u0393\1\u0390\36\u0393\1\u0391\3\u0393\3\u0390\1\u0393\1\u0392",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0393\1\u03a0\13\u0393\1\u03a0\5\u0393\1\u03a1\51\u0393",
            "\12\u0393\1\u03b0\12\u0393\1\u03af\1\u03b1\1\u03af\56\u0393",
            "\4\u0393\1\u03c2\5\u0393\1\u03c0\6\u0393\1\u03c3\3\u0393\1"+
            "\u03bf\1\u03c1\1\u03bf\56\u0393",
            "\4\u0393\1\u03d5\4\u0393\1\u03d1\1\u03d3\6\u0393\1\u03d6\3"+
            "\u0393\1\u03d2\1\u03d4\1\u03d2\56\u0393",
            "\4\u0393\1\u03e8\4\u0393\1\u03e4\1\u03e6\6\u0393\1\u03e9\3"+
            "\u0393\1\u03e5\1\u03e7\1\u03e5\56\u0393",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0393\1\u03f8\12\u0393\1\u03f7\1\u03f9\1\u03f7\56\u0393",
            "\4\u0393\1\u040a\5\u0393\1\u0408\6\u0393\1\u040b\3\u0393\1"+
            "\u0407\1\u0409\1\u0407\56\u0393",
            "\4\u0393\1\u041d\4\u0393\1\u0419\1\u041b\6\u0393\1\u041e\3"+
            "\u0393\1\u041a\1\u041c\1\u041a\56\u0393",
            "\4\u0393\1\u0430\4\u0393\1\u042c\1\u042e\6\u0393\1\u0431\3"+
            "\u0393\1\u042d\1\u042f\1\u042d\56\u0393",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u0393\1\u0443\4\u0393\1\u043f\1\u0441\6\u0393\1\u0444\3"+
            "\u0393\1\u0440\1\u0442\1\u0440\56\u0393",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u0393\1\u0455\5\u0393\1\u0453\6\u0393\1\u0456\3\u0393\1"+
            "\u0452\1\u0454\1\u0452\56\u0393",
            "\12\u0393\1\u0464\13\u0393\1\u0465\57\u0393",
            "\1\u0474\1\u0478\17\u0393\1\u0473\1\u0393\1\u0475\1\u0393\1"+
            "\u0474\1\u0393\1\u0474\4\u0393\1\u0479\1\u0393\1\u0475\36\u0393"+
            "\1\u0476\3\u0393\3\u0475\1\u0393\1\u0477",
            "\1\u0486\1\u048a\21\u0393\1\u0487\1\u0393\1\u0486\1\u0393\1"+
            "\u0486\4\u0393\1\u048b\1\u0393\1\u0487\36\u0393\1\u0488\3\u0393"+
            "\3\u0487\1\u0393\1\u0489",
            "\21\u0393\1\u0498\64\u0393",
            "\4\u0393\1\u04aa\4\u0393\1\u04a6\1\u04a8\6\u0393\1\u04ab\3"+
            "\u0393\1\u04a7\1\u04a9\1\u04a7\56\u0393",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()+ loopback of 190:15: (~ ( BACKSLASH | RET ) )+";
        }
    }
 

    public static final BitSet FOLLOW_code_fragment_in_code160 = new BitSet(new long[]{0xFFFFFFFFFFFFE3F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_EOF_in_code165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_define_directive_in_code_fragment216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_declaration_in_code_fragment221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_simple_check_wrapper_in_code_fragment226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_define_block_wrapper_in_code_fragment231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_not_define_block_wrapper_in_code_fragment236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_smth_else_in_code_fragment241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RET_in_ret252 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_if_not_define_block_in_if_not_define_block_wrapper262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifndef1_in_if_not_define_block281 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ifndef2_in_if_not_define_block285 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ret_in_if_not_define_block288 = new BitSet(new long[]{0xFFFFFFFFFFFFE3F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_main_code_block_in_if_not_define_block292 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ELSE_in_if_not_define_block297 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ret_in_if_not_define_block299 = new BitSet(new long[]{0xFFFFFFFFFFFFE3F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_else_code_block_in_if_not_define_block304 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDIF_in_if_not_define_block311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFNDEF_in_ifndef1321 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_name_in_ifndef1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifndef2331 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EXC_in_ifndef2334 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DEFINED_in_ifndef2337 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_L_BR_in_ifndef2339 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_name_in_ifndef2342 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_R_BR_in_ifndef2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_simple_check_in_if_simple_check_wrapper353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_simple_check371 = new BitSet(new long[]{0x000000000E206100L});
    public static final BitSet FOLLOW_expression_wrapper_in_if_simple_check373 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ret_in_if_simple_check375 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_main_code_block_in_if_simple_check379 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_ELIF_in_if_simple_check385 = new BitSet(new long[]{0x000000000E206100L});
    public static final BitSet FOLLOW_expression_wrapper_in_if_simple_check388 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ret_in_if_simple_check390 = new BitSet(new long[]{0xFFFFFFFFFFFFE3F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_else_code_block_in_if_simple_check394 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_ELSE_in_if_simple_check401 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ret_in_if_simple_check403 = new BitSet(new long[]{0xFFFFFFFFFFFFE3F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_else_code_block_in_if_simple_check408 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDIF_in_if_simple_check415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_wrapper427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_define_block_in_if_define_block_wrapper446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifdef1_in_if_define_block466 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ifdef2_in_if_define_block470 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ret_in_if_define_block473 = new BitSet(new long[]{0xFFFFFFFFFFFFFBF0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_main_code_block_in_if_define_block477 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ELSE_in_if_define_block483 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ret_in_if_define_block485 = new BitSet(new long[]{0xFFFFFFFFFFFFE3F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_else_code_block_in_if_define_block490 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDIF_in_if_define_block497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifdef1507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DEFINED_in_ifdef1509 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_L_BR_in_ifdef1511 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_name_in_ifdef1513 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_R_BR_in_ifdef1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFDEF_in_ifdef2523 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_name_in_ifdef2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_block_in_main_code_block535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_block_in_else_code_block552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_fragment_in_code_block569 = new BitSet(new long[]{0xFFFFFFFFFFFFE3F2L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ID_in_name609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_import_declaration626 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_import_end_in_import_declaration634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_internal_in_import_end644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_external_in_import_end651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_internal_string_in_import_internal661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_UBR_in_import_internal_string679 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_path_wrapper_in_import_internal_string682 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_R_UBR_in_import_internal_string685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_path_wrapper695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filename_wrapper_in_path712 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_path715 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_filename_wrapper_in_path717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_filename_in_filename_wrapper729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_filename745 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_filename748 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_filename750 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_filename755 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_filename757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_filename2768 = new BitSet(new long[]{0x000000000A000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_filename2771 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_filename2779 = new BitSet(new long[]{0x000000000A000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_filename2784 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_filename2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_external2_in_import_external797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_import_external2815 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_filename2_in_import_external2817 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_QUOTE_in_import_external2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_define_directive830 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_id_wrapper_in_define_directive833 = new BitSet(new long[]{0xFFFFFFFF7FFFFFF2L,0x00000000000003FFL});
    public static final BitSet FOLLOW_mln_end_in_define_directive836 = new BitSet(new long[]{0xFFFFFFFF7FFFFFD2L,0x00000000000003FFL});
    public static final BitSet FOLLOW_replace_wrapper_in_define_directive839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKSLASH_in_mln_end865 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ret_in_mln_end867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_wrapper_in_id_wrapper877 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_in_brackets_wrapper_in_id_wrapper879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name_wrapper902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_brackets_in_in_brackets_wrapper921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_BR_in_in_brackets940 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_param_wrapper_in_in_brackets942 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_in_brackets945 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_param_wrapper_in_in_brackets948 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_R_BR_in_in_brackets952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_common_in_param_wrapper964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTS3_in_param_wrapper969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param_common981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_replace_in_replace_wrapper1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_replace_internal_in_replace1018 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_backslash_in_replace1021 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ret_in_replace1023 = new BitSet(new long[]{0xFFFFFFFF7FFFFFD0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_replace_internal_in_replace1025 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_BACKSLASH_in_backslash1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_replace_internal1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ex_or_in_expression1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ex_and_wrp_in_ex_or1094 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ex_or1097 = new BitSet(new long[]{0x000000000E206100L});
    public static final BitSet FOLLOW_expression_wrapper_in_ex_or1099 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ex_and_in_ex_and_wrp1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ex_not_wrp_in_ex_and1129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ex_and1132 = new BitSet(new long[]{0x000000000E206100L});
    public static final BitSet FOLLOW_expression_wrapper_in_ex_and1134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ex_not_in_ex_not_wrp1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXC_in_ex_not1161 = new BitSet(new long[]{0x000000000E204100L});
    public static final BitSet FOLLOW_ex_cond_in_ex_not1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ex_cond_in_ex_cond_wrp1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ex_sngl_wrp_in_ex_cond1192 = new BitSet(new long[]{0x0000000400800002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_cond_op_wrp_in_ex_cond1195 = new BitSet(new long[]{0x000000000E204100L});
    public static final BitSet FOLLOW_ex_sngl_wrp_in_ex_cond1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_op_in_cond_op_wrp1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ex_sngl_in_ex_sngl_wrp1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_expr_wrp_in_ex_sngl1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defined_wrp_in_ex_sngl1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defined_expr_in_defined_wrp1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINED_in_defined_expr1304 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_L_BR_in_defined_expr1307 = new BitSet(new long[]{0x000000000E206100L});
    public static final BitSet FOLLOW_expression_wrapper_in_defined_expr1309 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_mln_end_in_defined_expr1312 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_R_BR_in_defined_expr1315 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_mln_end_in_defined_expr1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_expr_in_math_expr_wrp1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_expr_in_math_expr1350 = new BitSet(new long[]{0x000000000A000012L});
    public static final BitSet FOLLOW_op_wrp_in_math_expr1353 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_single_expr_in_math_expr1355 = new BitSet(new long[]{0x000000000A000012L});
    public static final BitSet FOLLOW_op_in_op_wrp1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_expr2_in_single_expr1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_single_expr21420 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_L_BR_in_single_expr21423 = new BitSet(new long[]{0x0000000104004000L});
    public static final BitSet FOLLOW_param_in_single_expr21426 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_single_expr21429 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_param_in_single_expr21431 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_R_BR_in_single_expr21437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_expr_in_single_expr21444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_const_expr1470 = new BitSet(new long[]{0x0000000000000002L});

}