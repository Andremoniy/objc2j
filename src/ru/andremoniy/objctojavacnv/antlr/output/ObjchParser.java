// $ANTLR 3.4 C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g 2013-08-26 21:04:49

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ObjchParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARCHIVE_DECLARATION", "CATEGORY", "DIGIT", "ENUM", "EXTERN", "FIELD", "FIELDS", "FIELD_NAME", "FILE_NAME", "GROUP_MODIFIER", "ID", "INIT_DECLARATION", "INTERFACE", "INTERFACE_NAME", "LETTER", "METHOD", "METHOD_NAME", "METHOD_PARAM", "METHOD_PARAMS", "METHOD_TYPE", "MODIFIER", "MULTI_COMMENT", "NAME", "NUMBER", "OLD_NAME", "PARAM_NAME", "PARAM_PREFIX", "PREPROCESSOR_DECLARATION", "PROTOCOL", "SINGLE_COMMENT", "STATIC_METHOD", "STRUCT", "SUPERCLASS_NAME", "TYPE", "TYPEDEF", "TYPEDEF_ELEMENT", "TYPEDEF_NAME", "T_STATIC", "UNION", "VALUE", "WHITESPACE", "'&'", "'&~'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'...'", "':'", "';'", "'<'", "'<<'", "'='", "'>'", "'>>'", "'@class'", "'@end'", "'@interface'", "'@optional'", "'@private'", "'@property'", "'@protected'", "'@protocol'", "'@public'", "'NS_INLINE'", "'NS_REQUIRES_NIL_TERMINATION'", "'['", "']'", "'_NSWINDOWS_DLL_GOOP'", "'__attribute__'", "'__declspec'", "'__weak'", "'assign'", "'const'", "'copy'", "'dllimport'", "'enum'", "'extern'", "'format'", "'inline'", "'int'", "'long'", "'nonatomic'", "'readonly'", "'readwrite'", "'retain'", "'static'", "'strong'", "'struct'", "'typedef'", "'union'", "'unsigned'", "'{'", "'|'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int ARCHIVE_DECLARATION=4;
    public static final int CATEGORY=5;
    public static final int DIGIT=6;
    public static final int ENUM=7;
    public static final int EXTERN=8;
    public static final int FIELD=9;
    public static final int FIELDS=10;
    public static final int FIELD_NAME=11;
    public static final int FILE_NAME=12;
    public static final int GROUP_MODIFIER=13;
    public static final int ID=14;
    public static final int INIT_DECLARATION=15;
    public static final int INTERFACE=16;
    public static final int INTERFACE_NAME=17;
    public static final int LETTER=18;
    public static final int METHOD=19;
    public static final int METHOD_NAME=20;
    public static final int METHOD_PARAM=21;
    public static final int METHOD_PARAMS=22;
    public static final int METHOD_TYPE=23;
    public static final int MODIFIER=24;
    public static final int MULTI_COMMENT=25;
    public static final int NAME=26;
    public static final int NUMBER=27;
    public static final int OLD_NAME=28;
    public static final int PARAM_NAME=29;
    public static final int PARAM_PREFIX=30;
    public static final int PREPROCESSOR_DECLARATION=31;
    public static final int PROTOCOL=32;
    public static final int SINGLE_COMMENT=33;
    public static final int STATIC_METHOD=34;
    public static final int STRUCT=35;
    public static final int SUPERCLASS_NAME=36;
    public static final int TYPE=37;
    public static final int TYPEDEF=38;
    public static final int TYPEDEF_ELEMENT=39;
    public static final int TYPEDEF_NAME=40;
    public static final int T_STATIC=41;
    public static final int UNION=42;
    public static final int VALUE=43;
    public static final int WHITESPACE=44;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ObjchParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ObjchParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ObjchParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g"; }


    public static class code_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:55:1: code : ( code_internal )* ;
    public final ObjchParser.code_return code() throws RecognitionException {
        ObjchParser.code_return retval = new ObjchParser.code_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.code_internal_return code_internal1 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:55:6: ( ( code_internal )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:56:3: ( code_internal )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:56:3: ( code_internal )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==50||LA1_0==52||LA1_0==61||(LA1_0 >= 63 && LA1_0 <= 64)||LA1_0==66||LA1_0==68||LA1_0==70||LA1_0==74||(LA1_0 >= 76 && LA1_0 <= 77)||LA1_0==79||(LA1_0 >= 82 && LA1_0 <= 83)||(LA1_0 >= 85 && LA1_0 <= 87)||LA1_0==92||(LA1_0 >= 94 && LA1_0 <= 95)||LA1_0==97) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:56:3: code_internal
            	    {
            	    pushFollow(FOLLOW_code_internal_in_code186);
            	    code_internal1=code_internal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, code_internal1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "code"


    public static class code_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:59:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct_wrapper | declarations | garbage );
    public final ObjchParser.code_internal_return code_internal() throws RecognitionException {
        ObjchParser.code_internal_return retval = new ObjchParser.code_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.class_declaration_return class_declaration2 =null;

        ObjchParser.typedef_declaration_wrapper_return typedef_declaration_wrapper3 =null;

        ObjchParser.enum_wrapper_return enum_wrapper4 =null;

        ObjchParser.protocol_declaration_wrapper_return protocol_declaration_wrapper5 =null;

        ObjchParser.interface_declaration_wrapper_return interface_declaration_wrapper6 =null;

        ObjchParser.extern_declarations_return extern_declarations7 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper8 =null;

        ObjchParser.declarations_return declarations9 =null;

        ObjchParser.garbage_return garbage10 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:60:2: ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct_wrapper | declarations | garbage )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:60:4: class_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_class_declaration_in_code_internal199);
                    class_declaration2=class_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, class_declaration2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:61:5: typedef_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_declaration_wrapper_in_code_internal206);
                    typedef_declaration_wrapper3=typedef_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_declaration_wrapper3.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:62:5: enum_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_wrapper_in_code_internal213);
                    enum_wrapper4=enum_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_wrapper4.getTree());

                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:63:4: protocol_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_declaration_wrapper_in_code_internal218);
                    protocol_declaration_wrapper5=protocol_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_declaration_wrapper5.getTree());

                    }
                    break;
                case 5 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:64:4: interface_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interface_declaration_wrapper_in_code_internal224);
                    interface_declaration_wrapper6=interface_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_declaration_wrapper6.getTree());

                    }
                    break;
                case 6 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:65:4: extern_declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_extern_declarations_in_code_internal230);
                    extern_declarations7=extern_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, extern_declarations7.getTree());

                    }
                    break;
                case 7 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:66:4: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_code_internal235);
                    typedef_struct_wrapper8=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper8.getTree());

                    }
                    break;
                case 8 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:67:4: declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarations_in_code_internal240);
                    declarations9=declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, declarations9.getTree());

                    }
                    break;
                case 9 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:68:4: garbage
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_garbage_in_code_internal245);
                    garbage10=garbage();

                    state._fsp--;

                    adaptor.addChild(root_0, garbage10.getTree());

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
    // $ANTLR end "code_internal"


    public static class garbage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "garbage"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:1: garbage : ( '_NSWINDOWS_DLL_GOOP' | '__declspec' '(' 'dllimport' ')' );
    public final ObjchParser.garbage_return garbage() throws RecognitionException {
        ObjchParser.garbage_return retval = new ObjchParser.garbage_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal11=null;
        Token string_literal12=null;
        Token char_literal13=null;
        Token string_literal14=null;
        Token char_literal15=null;

        Object string_literal11_tree=null;
        Object string_literal12_tree=null;
        Object char_literal13_tree=null;
        Object string_literal14_tree=null;
        Object char_literal15_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:9: ( '_NSWINDOWS_DLL_GOOP' | '__declspec' '(' 'dllimport' ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==74) ) {
                alt3=1;
            }
            else if ( (LA3_0==76) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:11: '_NSWINDOWS_DLL_GOOP'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal11=(Token)match(input,74,FOLLOW_74_in_garbage257); 
                    string_literal11_tree = 
                    (Object)adaptor.create(string_literal11)
                    ;
                    adaptor.addChild(root_0, string_literal11_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:72:4: '__declspec' '(' 'dllimport' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal12=(Token)match(input,76,FOLLOW_76_in_garbage262); 
                    string_literal12_tree = 
                    (Object)adaptor.create(string_literal12)
                    ;
                    adaptor.addChild(root_0, string_literal12_tree);


                    char_literal13=(Token)match(input,47,FOLLOW_47_in_garbage264); 
                    char_literal13_tree = 
                    (Object)adaptor.create(char_literal13)
                    ;
                    adaptor.addChild(root_0, char_literal13_tree);


                    string_literal14=(Token)match(input,81,FOLLOW_81_in_garbage266); 
                    string_literal14_tree = 
                    (Object)adaptor.create(string_literal14)
                    ;
                    adaptor.addChild(root_0, string_literal14_tree);


                    char_literal15=(Token)match(input,48,FOLLOW_48_in_garbage268); 
                    char_literal15_tree = 
                    (Object)adaptor.create(char_literal15)
                    ;
                    adaptor.addChild(root_0, char_literal15_tree);


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
    // $ANTLR end "garbage"


    public static class enum_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enum_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:1: enum_wrapper : enum_declaration ';' -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.enum_wrapper_return enum_wrapper() throws RecognitionException {
        ObjchParser.enum_wrapper_return retval = new ObjchParser.enum_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal17=null;
        ObjchParser.enum_declaration_return enum_declaration16 =null;


        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:2: ( enum_declaration ';' -> ^( ENUM enum_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:4: enum_declaration ';'
            {
            pushFollow(FOLLOW_enum_declaration_in_enum_wrapper282);
            enum_declaration16=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration16.getTree());

            char_literal17=(Token)match(input,55,FOLLOW_55_in_enum_wrapper284);  
            stream_55.add(char_literal17);


            // AST REWRITE
            // elements: enum_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:25: -> ^( ENUM enum_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:28: ^( ENUM enum_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUM, "ENUM")
                , root_1);

                adaptor.addChild(root_1, stream_enum_declaration.nextTree());

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
    // $ANTLR end "enum_wrapper"


    public static class extern_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extern_declarations"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:78:1: extern_declarations : ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ ;
    public final ObjchParser.extern_declarations_return extern_declarations() throws RecognitionException {
        ObjchParser.extern_declarations_return retval = new ObjchParser.extern_declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.extern_declatation_return extern_declatation18 =null;


        RewriteRuleSubtreeStream stream_extern_declatation=new RewriteRuleSubtreeStream(adaptor,"rule extern_declatation");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:2: ( ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:4: ( extern_declatation )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:4: ( extern_declatation )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==83) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:4: extern_declatation
            	    {
            	    pushFollow(FOLLOW_extern_declatation_in_extern_declarations304);
            	    extern_declatation18=extern_declatation();

            	    state._fsp--;

            	    stream_extern_declatation.add(extern_declatation18.getTree());

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


            // AST REWRITE
            // elements: extern_declatation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:24: -> ( ^( EXTERN extern_declatation ) )+
            {
                if ( !(stream_extern_declatation.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_extern_declatation.hasNext() ) {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:27: ^( EXTERN extern_declatation )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(EXTERN, "EXTERN")
                    , root_1);

                    adaptor.addChild(root_1, stream_extern_declatation.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_extern_declatation.reset();

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
    // $ANTLR end "extern_declarations"


    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarations"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:81:1: declarations : ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper | ns_inline (~ '{' )+ (~ '}' )+ '}' );
    public final ObjchParser.declarations_return declarations() throws RecognitionException {
        ObjchParser.declarations_return retval = new ObjchParser.declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set25=null;
        Token set26=null;
        Token char_literal27=null;
        ObjchParser.optional_prefix_return optional_prefix19 =null;

        ObjchParser.method_declaration_wrapper_return method_declaration_wrapper20 =null;

        ObjchParser.property_prefix_return property_prefix21 =null;

        ObjchParser.optional_prefix_return optional_prefix22 =null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper23 =null;

        ObjchParser.ns_inline_return ns_inline24 =null;


        Object set25_tree=null;
        Object set26_tree=null;
        Object char_literal27_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:2: ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper | ns_inline (~ '{' )+ (~ '}' )+ '}' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==50||LA10_1==52) ) {
                    alt10=1;
                }
                else if ( (LA10_1==ID||LA10_1==77||LA10_1==79||LA10_1==82||(LA10_1 >= 85 && LA10_1 <= 87)||LA10_1==92||LA10_1==95||LA10_1==97) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case 50:
            case 52:
                {
                alt10=1;
                }
                break;
            case ID:
            case 66:
            case 77:
            case 79:
            case 82:
            case 85:
            case 86:
            case 87:
            case 92:
            case 95:
            case 97:
                {
                alt10=2;
                }
                break;
            case 70:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:4: ( optional_prefix )? method_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:4: ( optional_prefix )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==64) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:4: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations325);
                            optional_prefix19=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix19.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_method_declaration_wrapper_in_declarations328);
                    method_declaration_wrapper20=method_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, method_declaration_wrapper20.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:4: ( property_prefix )? ( optional_prefix )? field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:4: ( property_prefix )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==66) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:4: property_prefix
                            {
                            pushFollow(FOLLOW_property_prefix_in_declarations333);
                            property_prefix21=property_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, property_prefix21.getTree());

                            }
                            break;

                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:21: ( optional_prefix )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==64) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:21: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations336);
                            optional_prefix22=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix22.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_field_declaration_wrapper_in_declarations339);
                    field_declaration_wrapper23=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper23.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:4: ns_inline (~ '{' )+ (~ '}' )+ '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ns_inline_in_declarations344);
                    ns_inline24=ns_inline();

                    state._fsp--;

                    adaptor.addChild(root_0, ns_inline24.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:14: (~ '{' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= ARCHIVE_DECLARATION && LA8_0 <= 97)||(LA8_0 >= 99 && LA8_0 <= 100)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
                    	    {
                    	    set25=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= ARCHIVE_DECLARATION && input.LA(1) <= 97)||(input.LA(1) >= 99 && input.LA(1) <= 100) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set25)
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:20: (~ '}' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= ARCHIVE_DECLARATION && LA9_0 <= 99)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
                    	    {
                    	    set26=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= ARCHIVE_DECLARATION && input.LA(1) <= 99) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set26)
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    char_literal27=(Token)match(input,100,FOLLOW_100_in_declarations354); 
                    char_literal27_tree = 
                    (Object)adaptor.create(char_literal27)
                    ;
                    adaptor.addChild(root_0, char_literal27_tree);


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
    // $ANTLR end "declarations"


    public static class static_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "static_prefix"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:87:1: static_prefix : 'static' -> ^( T_STATIC 'static' ) ;
    public final ObjchParser.static_prefix_return static_prefix() throws RecognitionException {
        ObjchParser.static_prefix_return retval = new ObjchParser.static_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal28=null;

        Object string_literal28_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:2: ( 'static' -> ^( T_STATIC 'static' ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:4: 'static'
            {
            string_literal28=(Token)match(input,92,FOLLOW_92_in_static_prefix367);  
            stream_92.add(string_literal28);


            // AST REWRITE
            // elements: 92
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 88:13: -> ^( T_STATIC 'static' )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:16: ^( T_STATIC 'static' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_STATIC, "T_STATIC")
                , root_1);

                adaptor.addChild(root_1, 
                stream_92.nextNode()
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
    // $ANTLR end "static_prefix"


    public static class method_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:90:1: method_declaration_wrapper : method_declaration -> ^( METHOD method_declaration ) ;
    public final ObjchParser.method_declaration_wrapper_return method_declaration_wrapper() throws RecognitionException {
        ObjchParser.method_declaration_wrapper_return retval = new ObjchParser.method_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_declaration_return method_declaration29 =null;


        RewriteRuleSubtreeStream stream_method_declaration=new RewriteRuleSubtreeStream(adaptor,"rule method_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:91:2: ( method_declaration -> ^( METHOD method_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:91:4: method_declaration
            {
            pushFollow(FOLLOW_method_declaration_in_method_declaration_wrapper386);
            method_declaration29=method_declaration();

            state._fsp--;

            stream_method_declaration.add(method_declaration29.getTree());

            // AST REWRITE
            // elements: method_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:23: -> ^( METHOD method_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:91:26: ^( METHOD method_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD, "METHOD")
                , root_1);

                adaptor.addChild(root_1, stream_method_declaration.nextTree());

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
    // $ANTLR end "method_declaration_wrapper"


    public static class field_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:93:1: field_declaration_wrapper : field_declaration -> ^( FIELD field_declaration ) ;
    public final ObjchParser.field_declaration_wrapper_return field_declaration_wrapper() throws RecognitionException {
        ObjchParser.field_declaration_wrapper_return retval = new ObjchParser.field_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_return field_declaration30 =null;


        RewriteRuleSubtreeStream stream_field_declaration=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:94:2: ( field_declaration -> ^( FIELD field_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:94:4: field_declaration
            {
            pushFollow(FOLLOW_field_declaration_in_field_declaration_wrapper404);
            field_declaration30=field_declaration();

            state._fsp--;

            stream_field_declaration.add(field_declaration30.getTree());

            // AST REWRITE
            // elements: field_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:22: -> ^( FIELD field_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:94:25: ^( FIELD field_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD, "FIELD")
                , root_1);

                adaptor.addChild(root_1, stream_field_declaration.nextTree());

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
    // $ANTLR end "field_declaration_wrapper"


    public static class property_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property_prefix"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:96:1: property_prefix : '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' ;
    public final ObjchParser.property_prefix_return property_prefix() throws RecognitionException {
        ObjchParser.property_prefix_return retval = new ObjchParser.property_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal31=null;
        Token char_literal32=null;
        Token char_literal34=null;
        Token char_literal36=null;
        ObjchParser.property_prefix_param_return property_prefix_param33 =null;

        ObjchParser.property_prefix_param_return property_prefix_param35 =null;


        Object string_literal31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:2: ( '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:4: '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal31=(Token)match(input,66,FOLLOW_66_in_property_prefix422); 
            string_literal31_tree = 
            (Object)adaptor.create(string_literal31)
            ;
            adaptor.addChild(root_0, string_literal31_tree);


            char_literal32=(Token)match(input,47,FOLLOW_47_in_property_prefix424); 
            char_literal32_tree = 
            (Object)adaptor.create(char_literal32)
            ;
            adaptor.addChild(root_0, char_literal32_tree);


            pushFollow(FOLLOW_property_prefix_param_in_property_prefix426);
            property_prefix_param33=property_prefix_param();

            state._fsp--;

            adaptor.addChild(root_0, property_prefix_param33.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:42: ( ',' property_prefix_param )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==51) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:43: ',' property_prefix_param
            	    {
            	    char_literal34=(Token)match(input,51,FOLLOW_51_in_property_prefix429); 
            	    char_literal34_tree = 
            	    (Object)adaptor.create(char_literal34)
            	    ;
            	    adaptor.addChild(root_0, char_literal34_tree);


            	    pushFollow(FOLLOW_property_prefix_param_in_property_prefix431);
            	    property_prefix_param35=property_prefix_param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property_prefix_param35.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            char_literal36=(Token)match(input,48,FOLLOW_48_in_property_prefix435); 
            char_literal36_tree = 
            (Object)adaptor.create(char_literal36)
            ;
            adaptor.addChild(root_0, char_literal36_tree);


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
    // $ANTLR end "property_prefix"


    public static class optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optional_prefix"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:99:1: optional_prefix : '@optional' ;
    public final ObjchParser.optional_prefix_return optional_prefix() throws RecognitionException {
        ObjchParser.optional_prefix_return retval = new ObjchParser.optional_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal37=null;

        Object string_literal37_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:100:2: ( '@optional' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:100:4: '@optional'
            {
            root_0 = (Object)adaptor.nil();


            string_literal37=(Token)match(input,64,FOLLOW_64_in_optional_prefix446); 
            string_literal37_tree = 
            (Object)adaptor.create(string_literal37)
            ;
            adaptor.addChild(root_0, string_literal37_tree);


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
    // $ANTLR end "optional_prefix"


    public static class ns_inline_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ns_inline"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:102:1: ns_inline : 'NS_INLINE' ;
    public final ObjchParser.ns_inline_return ns_inline() throws RecognitionException {
        ObjchParser.ns_inline_return retval = new ObjchParser.ns_inline_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal38=null;

        Object string_literal38_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:103:2: ( 'NS_INLINE' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:103:4: 'NS_INLINE'
            {
            root_0 = (Object)adaptor.nil();


            string_literal38=(Token)match(input,70,FOLLOW_70_in_ns_inline456); 
            string_literal38_tree = 
            (Object)adaptor.create(string_literal38)
            ;
            adaptor.addChild(root_0, string_literal38_tree);


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
    // $ANTLR end "ns_inline"


    public static class property_prefix_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property_prefix_param"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:105:1: property_prefix_param : ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' | 'assign' | 'copy' | 'strong' );
    public final ObjchParser.property_prefix_param_return property_prefix_param() throws RecognitionException {
        ObjchParser.property_prefix_param_return retval = new ObjchParser.property_prefix_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set39=null;

        Object set39_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:2: ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' | 'assign' | 'copy' | 'strong' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set39=(Token)input.LT(1);

            if ( input.LA(1)==78||input.LA(1)==80||(input.LA(1) >= 88 && input.LA(1) <= 91)||input.LA(1)==93 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set39)
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
    // $ANTLR end "property_prefix_param"


    public static class interface_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:1: interface_declaration_wrapper : interface_declaration -> ^( INTERFACE interface_declaration ) ;
    public final ObjchParser.interface_declaration_wrapper_return interface_declaration_wrapper() throws RecognitionException {
        ObjchParser.interface_declaration_wrapper_return retval = new ObjchParser.interface_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.interface_declaration_return interface_declaration40 =null;


        RewriteRuleSubtreeStream stream_interface_declaration=new RewriteRuleSubtreeStream(adaptor,"rule interface_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:116:2: ( interface_declaration -> ^( INTERFACE interface_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:116:4: interface_declaration
            {
            pushFollow(FOLLOW_interface_declaration_in_interface_declaration_wrapper509);
            interface_declaration40=interface_declaration();

            state._fsp--;

            stream_interface_declaration.add(interface_declaration40.getTree());

            // AST REWRITE
            // elements: interface_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 116:26: -> ^( INTERFACE interface_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:116:29: ^( INTERFACE interface_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE, "INTERFACE")
                , root_1);

                adaptor.addChild(root_1, stream_interface_declaration.nextTree());

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
    // $ANTLR end "interface_declaration_wrapper"


    public static class protocol_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:1: protocol_declaration_wrapper : protocol_declaration -> ^( PROTOCOL protocol_declaration ) ;
    public final ObjchParser.protocol_declaration_wrapper_return protocol_declaration_wrapper() throws RecognitionException {
        ObjchParser.protocol_declaration_wrapper_return retval = new ObjchParser.protocol_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_declaration_return protocol_declaration41 =null;


        RewriteRuleSubtreeStream stream_protocol_declaration=new RewriteRuleSubtreeStream(adaptor,"rule protocol_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:119:2: ( protocol_declaration -> ^( PROTOCOL protocol_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:119:4: protocol_declaration
            {
            pushFollow(FOLLOW_protocol_declaration_in_protocol_declaration_wrapper527);
            protocol_declaration41=protocol_declaration();

            state._fsp--;

            stream_protocol_declaration.add(protocol_declaration41.getTree());

            // AST REWRITE
            // elements: protocol_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 119:25: -> ^( PROTOCOL protocol_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:119:28: ^( PROTOCOL protocol_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROTOCOL, "PROTOCOL")
                , root_1);

                adaptor.addChild(root_1, stream_protocol_declaration.nextTree());

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
    // $ANTLR end "protocol_declaration_wrapper"


    public static class typedef_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:121:1: typedef_declaration_wrapper : typedef_declaration -> ^( TYPEDEF typedef_declaration ) ;
    public final ObjchParser.typedef_declaration_wrapper_return typedef_declaration_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_wrapper_return retval = new ObjchParser.typedef_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_return typedef_declaration42 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:122:2: ( typedef_declaration -> ^( TYPEDEF typedef_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:122:4: typedef_declaration
            {
            pushFollow(FOLLOW_typedef_declaration_in_typedef_declaration_wrapper544);
            typedef_declaration42=typedef_declaration();

            state._fsp--;

            stream_typedef_declaration.add(typedef_declaration42.getTree());

            // AST REWRITE
            // elements: typedef_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:24: -> ^( TYPEDEF typedef_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:122:27: ^( TYPEDEF typedef_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEDEF, "TYPEDEF")
                , root_1);

                adaptor.addChild(root_1, stream_typedef_declaration.nextTree());

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
    // $ANTLR end "typedef_declaration_wrapper"


    public static class typedef_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:1: typedef_declaration : 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? ;
    public final ObjchParser.typedef_declaration_return typedef_declaration() throws RecognitionException {
        ObjchParser.typedef_declaration_return retval = new ObjchParser.typedef_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal43=null;
        Token char_literal47=null;
        ObjchParser.typedef_internal_return typedef_internal44 =null;

        ObjchParser.typedef_name_return typedef_name45 =null;

        ObjchParser.func_pointer_return func_pointer46 =null;


        Object string_literal43_tree=null;
        Object char_literal47_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:2: ( 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:4: 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal43=(Token)match(input,95,FOLLOW_95_in_typedef_declaration561); 
            string_literal43_tree = 
            (Object)adaptor.create(string_literal43)
            ;
            adaptor.addChild(root_0, string_literal43_tree);


            pushFollow(FOLLOW_typedef_internal_in_typedef_declaration563);
            typedef_internal44=typedef_internal();

            state._fsp--;

            adaptor.addChild(root_0, typedef_internal44.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:31: ( typedef_name | func_pointer )?
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:32: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_declaration566);
                    typedef_name45=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name45.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:47: func_pointer
                    {
                    pushFollow(FOLLOW_func_pointer_in_typedef_declaration570);
                    func_pointer46=func_pointer();

                    state._fsp--;

                    adaptor.addChild(root_0, func_pointer46.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:62: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==55) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:62: ';'
                    {
                    char_literal47=(Token)match(input,55,FOLLOW_55_in_typedef_declaration574); 
                    char_literal47_tree = 
                    (Object)adaptor.create(char_literal47)
                    ;
                    adaptor.addChild(root_0, char_literal47_tree);


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
    // $ANTLR end "typedef_declaration"


    public static class func_pointer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_pointer"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:1: func_pointer : '(' ( '*' )* ID ')' '(' ( ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )* )? ')' ;
    public final ObjchParser.func_pointer_return func_pointer() throws RecognitionException {
        ObjchParser.func_pointer_return retval = new ObjchParser.func_pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal49=null;
        Token ID50=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Token ID53=null;
        Token char_literal54=null;
        Token ID55=null;
        Token char_literal56=null;
        Token ID57=null;
        Token char_literal58=null;
        Token ID59=null;
        Token string_literal60=null;
        Token char_literal61=null;

        Object char_literal48_tree=null;
        Object char_literal49_tree=null;
        Object ID50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal52_tree=null;
        Object ID53_tree=null;
        Object char_literal54_tree=null;
        Object ID55_tree=null;
        Object char_literal56_tree=null;
        Object ID57_tree=null;
        Object char_literal58_tree=null;
        Object ID59_tree=null;
        Object string_literal60_tree=null;
        Object char_literal61_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:2: ( '(' ( '*' )* ID ')' '(' ( ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )* )? ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:4: '(' ( '*' )* ID ')' '(' ( ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal48=(Token)match(input,47,FOLLOW_47_in_func_pointer585); 
            char_literal48_tree = 
            (Object)adaptor.create(char_literal48)
            ;
            adaptor.addChild(root_0, char_literal48_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:8: ( '*' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==49) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:8: '*'
            	    {
            	    char_literal49=(Token)match(input,49,FOLLOW_49_in_func_pointer587); 
            	    char_literal49_tree = 
            	    (Object)adaptor.create(char_literal49)
            	    ;
            	    adaptor.addChild(root_0, char_literal49_tree);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            ID50=(Token)match(input,ID,FOLLOW_ID_in_func_pointer590); 
            ID50_tree = 
            (Object)adaptor.create(ID50)
            ;
            adaptor.addChild(root_0, ID50_tree);


            char_literal51=(Token)match(input,48,FOLLOW_48_in_func_pointer592); 
            char_literal51_tree = 
            (Object)adaptor.create(char_literal51)
            ;
            adaptor.addChild(root_0, char_literal51_tree);


            char_literal52=(Token)match(input,47,FOLLOW_47_in_func_pointer594); 
            char_literal52_tree = 
            (Object)adaptor.create(char_literal52)
            ;
            adaptor.addChild(root_0, char_literal52_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:24: ( ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:25: ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )*
                    {
                    ID53=(Token)match(input,ID,FOLLOW_ID_in_func_pointer597); 
                    ID53_tree = 
                    (Object)adaptor.create(ID53)
                    ;
                    adaptor.addChild(root_0, ID53_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:28: ( ( '*' )+ ID )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==49) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:29: ( '*' )+ ID
                            {
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:29: ( '*' )+
                            int cnt15=0;
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==49) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:29: '*'
                            	    {
                            	    char_literal54=(Token)match(input,49,FOLLOW_49_in_func_pointer600); 
                            	    char_literal54_tree = 
                            	    (Object)adaptor.create(char_literal54)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal54_tree);


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt15 >= 1 ) break loop15;
                                        EarlyExitException eee =
                                            new EarlyExitException(15, input);
                                        throw eee;
                                }
                                cnt15++;
                            } while (true);


                            ID55=(Token)match(input,ID,FOLLOW_ID_in_func_pointer603); 
                            ID55_tree = 
                            (Object)adaptor.create(ID55)
                            ;
                            adaptor.addChild(root_0, ID55_tree);


                            }
                            break;

                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:39: ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==51) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:40: ',' ( ( ID ( ( '*' )+ ID )? ) | '...' )
                    	    {
                    	    char_literal56=(Token)match(input,51,FOLLOW_51_in_func_pointer608); 
                    	    char_literal56_tree = 
                    	    (Object)adaptor.create(char_literal56)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal56_tree);


                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:44: ( ( ID ( ( '*' )+ ID )? ) | '...' )
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==ID) ) {
                    	        alt19=1;
                    	    }
                    	    else if ( (LA19_0==53) ) {
                    	        alt19=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 19, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:45: ( ID ( ( '*' )+ ID )? )
                    	            {
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:45: ( ID ( ( '*' )+ ID )? )
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:46: ID ( ( '*' )+ ID )?
                    	            {
                    	            ID57=(Token)match(input,ID,FOLLOW_ID_in_func_pointer612); 
                    	            ID57_tree = 
                    	            (Object)adaptor.create(ID57)
                    	            ;
                    	            adaptor.addChild(root_0, ID57_tree);


                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:49: ( ( '*' )+ ID )?
                    	            int alt18=2;
                    	            int LA18_0 = input.LA(1);

                    	            if ( (LA18_0==49) ) {
                    	                alt18=1;
                    	            }
                    	            switch (alt18) {
                    	                case 1 :
                    	                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:50: ( '*' )+ ID
                    	                    {
                    	                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:50: ( '*' )+
                    	                    int cnt17=0;
                    	                    loop17:
                    	                    do {
                    	                        int alt17=2;
                    	                        int LA17_0 = input.LA(1);

                    	                        if ( (LA17_0==49) ) {
                    	                            alt17=1;
                    	                        }


                    	                        switch (alt17) {
                    	                    	case 1 :
                    	                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:50: '*'
                    	                    	    {
                    	                    	    char_literal58=(Token)match(input,49,FOLLOW_49_in_func_pointer615); 
                    	                    	    char_literal58_tree = 
                    	                    	    (Object)adaptor.create(char_literal58)
                    	                    	    ;
                    	                    	    adaptor.addChild(root_0, char_literal58_tree);


                    	                    	    }
                    	                    	    break;

                    	                    	default :
                    	                    	    if ( cnt17 >= 1 ) break loop17;
                    	                                EarlyExitException eee =
                    	                                    new EarlyExitException(17, input);
                    	                                throw eee;
                    	                        }
                    	                        cnt17++;
                    	                    } while (true);


                    	                    ID59=(Token)match(input,ID,FOLLOW_ID_in_func_pointer618); 
                    	                    ID59_tree = 
                    	                    (Object)adaptor.create(ID59)
                    	                    ;
                    	                    adaptor.addChild(root_0, ID59_tree);


                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:63: '...'
                    	            {
                    	            string_literal60=(Token)match(input,53,FOLLOW_53_in_func_pointer625); 
                    	            string_literal60_tree = 
                    	            (Object)adaptor.create(string_literal60)
                    	            ;
                    	            adaptor.addChild(root_0, string_literal60_tree);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal61=(Token)match(input,48,FOLLOW_48_in_func_pointer633); 
            char_literal61_tree = 
            (Object)adaptor.create(char_literal61)
            ;
            adaptor.addChild(root_0, char_literal61_tree);


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
    // $ANTLR end "func_pointer"


    public static class typedef_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:131:1: typedef_internal : ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration_wrapper );
    public final ObjchParser.typedef_internal_return typedef_internal() throws RecognitionException {
        ObjchParser.typedef_internal_return retval = new ObjchParser.typedef_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper262 =null;

        ObjchParser.typedef_rename_return typedef_rename63 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper64 =null;

        ObjchParser.union_declaration_wrapper_return union_declaration_wrapper65 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:132:2: ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration_wrapper )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt22=1;
                }
                break;
            case ID:
                {
                alt22=2;
                }
                break;
            case 94:
                {
                alt22=3;
                }
                break;
            case 96:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:132:4: typedef_enum_wrapper2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_enum_wrapper2_in_typedef_internal645);
                    typedef_enum_wrapper262=typedef_enum_wrapper2();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_enum_wrapper262.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:133:5: typedef_rename
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_rename_in_typedef_internal652);
                    typedef_rename63=typedef_rename();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_rename63.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:134:5: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_typedef_internal659);
                    typedef_struct_wrapper64=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper64.getTree());

                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:135:4: union_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_union_declaration_wrapper_in_typedef_internal664);
                    union_declaration_wrapper65=union_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, union_declaration_wrapper65.getTree());

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
    // $ANTLR end "typedef_internal"


    public static class union_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "union_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:138:1: union_declaration_wrapper : union_declaration -> ^( UNION union_declaration ) ;
    public final ObjchParser.union_declaration_wrapper_return union_declaration_wrapper() throws RecognitionException {
        ObjchParser.union_declaration_wrapper_return retval = new ObjchParser.union_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.union_declaration_return union_declaration66 =null;


        RewriteRuleSubtreeStream stream_union_declaration=new RewriteRuleSubtreeStream(adaptor,"rule union_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:2: ( union_declaration -> ^( UNION union_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:4: union_declaration
            {
            pushFollow(FOLLOW_union_declaration_in_union_declaration_wrapper676);
            union_declaration66=union_declaration();

            state._fsp--;

            stream_union_declaration.add(union_declaration66.getTree());

            // AST REWRITE
            // elements: union_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 139:22: -> ^( UNION union_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:25: ^( UNION union_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNION, "UNION")
                , root_1);

                adaptor.addChild(root_1, stream_union_declaration.nextTree());

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
    // $ANTLR end "union_declaration_wrapper"


    public static class union_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "union_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:141:1: union_declaration : 'union' '{' ( typedef_struct )+ '}' ( union_name )? ;
    public final ObjchParser.union_declaration_return union_declaration() throws RecognitionException {
        ObjchParser.union_declaration_return retval = new ObjchParser.union_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        ObjchParser.typedef_struct_return typedef_struct69 =null;

        ObjchParser.union_name_return union_name71 =null;


        Object string_literal67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:142:2: ( 'union' '{' ( typedef_struct )+ '}' ( union_name )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:142:4: 'union' '{' ( typedef_struct )+ '}' ( union_name )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal67=(Token)match(input,96,FOLLOW_96_in_union_declaration695); 
            string_literal67_tree = 
            (Object)adaptor.create(string_literal67)
            ;
            adaptor.addChild(root_0, string_literal67_tree);


            char_literal68=(Token)match(input,98,FOLLOW_98_in_union_declaration700); 
            char_literal68_tree = 
            (Object)adaptor.create(char_literal68)
            ;
            adaptor.addChild(root_0, char_literal68_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:144:4: ( typedef_struct )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==94) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:144:4: typedef_struct
            	    {
            	    pushFollow(FOLLOW_typedef_struct_in_union_declaration705);
            	    typedef_struct69=typedef_struct();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typedef_struct69.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            char_literal70=(Token)match(input,100,FOLLOW_100_in_union_declaration710); 
            char_literal70_tree = 
            (Object)adaptor.create(char_literal70)
            ;
            adaptor.addChild(root_0, char_literal70_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:145:7: ( union_name )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:145:7: union_name
                    {
                    pushFollow(FOLLOW_union_name_in_union_declaration712);
                    union_name71=union_name();

                    state._fsp--;

                    adaptor.addChild(root_0, union_name71.getTree());

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
    // $ANTLR end "union_declaration"


    public static class union_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "union_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:148:1: union_internal : ( field_declaration_wrapper | typedef_struct_wrapper );
    public final ObjchParser.union_internal_return union_internal() throws RecognitionException {
        ObjchParser.union_internal_return retval = new ObjchParser.union_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper72 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper73 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:149:2: ( field_declaration_wrapper | typedef_struct_wrapper )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID||LA25_0==77||LA25_0==79||LA25_0==82||(LA25_0 >= 85 && LA25_0 <= 87)||LA25_0==92||LA25_0==95||LA25_0==97) ) {
                alt25=1;
            }
            else if ( (LA25_0==94) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:149:4: field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_field_declaration_wrapper_in_union_internal726);
                    field_declaration_wrapper72=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper72.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:4: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_union_internal731);
                    typedef_struct_wrapper73=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper73.getTree());

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
    // $ANTLR end "union_internal"


    public static class typedef_rename_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_rename"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:1: typedef_rename : ID ( '*' )* -> ^( OLD_NAME ID ) ;
    public final ObjchParser.typedef_rename_return typedef_rename() throws RecognitionException {
        ObjchParser.typedef_rename_return retval = new ObjchParser.typedef_rename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID74=null;
        Token char_literal75=null;

        Object ID74_tree=null;
        Object char_literal75_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:2: ( ID ( '*' )* -> ^( OLD_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:4: ID ( '*' )*
            {
            ID74=(Token)match(input,ID,FOLLOW_ID_in_typedef_rename742);  
            stream_ID.add(ID74);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:7: ( '*' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==49) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:7: '*'
            	    {
            	    char_literal75=(Token)match(input,49,FOLLOW_49_in_typedef_rename744);  
            	    stream_49.add(char_literal75);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


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
            // 153:12: -> ^( OLD_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:15: ^( OLD_NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OLD_NAME, "OLD_NAME")
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
    // $ANTLR end "typedef_rename"


    public static class typedef_enum_wrapper2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_enum_wrapper2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:1: typedef_enum_wrapper2 : enum_declaration -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper2() throws RecognitionException {
        ObjchParser.typedef_enum_wrapper2_return retval = new ObjchParser.typedef_enum_wrapper2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.enum_declaration_return enum_declaration76 =null;


        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:157:2: ( enum_declaration -> ^( ENUM enum_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:157:4: enum_declaration
            {
            pushFollow(FOLLOW_enum_declaration_in_typedef_enum_wrapper2767);
            enum_declaration76=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration76.getTree());

            // AST REWRITE
            // elements: enum_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 157:21: -> ^( ENUM enum_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:157:24: ^( ENUM enum_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUM, "ENUM")
                , root_1);

                adaptor.addChild(root_1, stream_enum_declaration.nextTree());

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
    // $ANTLR end "typedef_enum_wrapper2"


    public static class enum_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enum_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:1: enum_declaration : 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' ;
    public final ObjchParser.enum_declaration_return enum_declaration() throws RecognitionException {
        ObjchParser.enum_declaration_return retval = new ObjchParser.enum_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal84=null;
        ObjchParser.struct_name_return struct_name78 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper80 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper82 =null;


        Object string_literal77_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object char_literal84_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:160:2: ( 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:160:4: 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal77=(Token)match(input,82,FOLLOW_82_in_enum_declaration787); 
            string_literal77_tree = 
            (Object)adaptor.create(string_literal77)
            ;
            adaptor.addChild(root_0, string_literal77_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:160:11: ( struct_name )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:160:11: struct_name
                    {
                    pushFollow(FOLLOW_struct_name_in_enum_declaration789);
                    struct_name78=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name78.getTree());

                    }
                    break;

            }


            char_literal79=(Token)match(input,98,FOLLOW_98_in_enum_declaration792); 
            char_literal79_tree = 
            (Object)adaptor.create(char_literal79)
            ;
            adaptor.addChild(root_0, char_literal79_tree);


            pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration794);
            typedef_declaration_element_wrapper80=typedef_declaration_element_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, typedef_declaration_element_wrapper80.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:160:64: ( ',' typedef_declaration_element_wrapper )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==51) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==ID||LA28_1==NUMBER||LA28_1==47) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:160:65: ',' typedef_declaration_element_wrapper
            	    {
            	    char_literal81=(Token)match(input,51,FOLLOW_51_in_enum_declaration797); 
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    adaptor.addChild(root_0, char_literal81_tree);


            	    pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration799);
            	    typedef_declaration_element_wrapper82=typedef_declaration_element_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typedef_declaration_element_wrapper82.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:160:107: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:160:107: ','
                    {
                    char_literal83=(Token)match(input,51,FOLLOW_51_in_enum_declaration803); 
                    char_literal83_tree = 
                    (Object)adaptor.create(char_literal83)
                    ;
                    adaptor.addChild(root_0, char_literal83_tree);


                    }
                    break;

            }


            char_literal84=(Token)match(input,100,FOLLOW_100_in_enum_declaration806); 
            char_literal84_tree = 
            (Object)adaptor.create(char_literal84)
            ;
            adaptor.addChild(root_0, char_literal84_tree);


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
    // $ANTLR end "enum_declaration"


    public static class typedef_struct_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_struct_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:162:1: typedef_struct_wrapper : typedef_struct -> ^( STRUCT typedef_struct ) ;
    public final ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper() throws RecognitionException {
        ObjchParser.typedef_struct_wrapper_return retval = new ObjchParser.typedef_struct_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_return typedef_struct85 =null;


        RewriteRuleSubtreeStream stream_typedef_struct=new RewriteRuleSubtreeStream(adaptor,"rule typedef_struct");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:163:2: ( typedef_struct -> ^( STRUCT typedef_struct ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:163:4: typedef_struct
            {
            pushFollow(FOLLOW_typedef_struct_in_typedef_struct_wrapper817);
            typedef_struct85=typedef_struct();

            state._fsp--;

            stream_typedef_struct.add(typedef_struct85.getTree());

            // AST REWRITE
            // elements: typedef_struct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:19: -> ^( STRUCT typedef_struct )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:163:22: ^( STRUCT typedef_struct )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STRUCT, "STRUCT")
                , root_1);

                adaptor.addChild(root_1, stream_typedef_struct.nextTree());

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
    // $ANTLR end "typedef_struct_wrapper"


    public static class typedef_struct_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_struct"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:165:1: typedef_struct : 'struct' ( typedef_name )? ( '{' ( struct_field_wrapper )+ '}' )? ( struct_name ( array_size )? ( ',' struct_name ( array_size )? )* )? ( ';' )? ;
    public final ObjchParser.typedef_struct_return typedef_struct() throws RecognitionException {
        ObjchParser.typedef_struct_return retval = new ObjchParser.typedef_struct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal86=null;
        Token char_literal88=null;
        Token char_literal90=null;
        Token char_literal93=null;
        Token char_literal96=null;
        ObjchParser.typedef_name_return typedef_name87 =null;

        ObjchParser.struct_field_wrapper_return struct_field_wrapper89 =null;

        ObjchParser.struct_name_return struct_name91 =null;

        ObjchParser.array_size_return array_size92 =null;

        ObjchParser.struct_name_return struct_name94 =null;

        ObjchParser.array_size_return array_size95 =null;


        Object string_literal86_tree=null;
        Object char_literal88_tree=null;
        Object char_literal90_tree=null;
        Object char_literal93_tree=null;
        Object char_literal96_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:166:2: ( 'struct' ( typedef_name )? ( '{' ( struct_field_wrapper )+ '}' )? ( struct_name ( array_size )? ( ',' struct_name ( array_size )? )* )? ( ';' )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:166:4: 'struct' ( typedef_name )? ( '{' ( struct_field_wrapper )+ '}' )? ( struct_name ( array_size )? ( ',' struct_name ( array_size )? )* )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal86=(Token)match(input,94,FOLLOW_94_in_typedef_struct835); 
            string_literal86_tree = 
            (Object)adaptor.create(string_literal86)
            ;
            adaptor.addChild(root_0, string_literal86_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:166:13: ( typedef_name )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:166:13: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_struct837);
                    typedef_name87=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name87.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:167:3: ( '{' ( struct_field_wrapper )+ '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==98) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:167:4: '{' ( struct_field_wrapper )+ '}'
                    {
                    char_literal88=(Token)match(input,98,FOLLOW_98_in_typedef_struct843); 
                    char_literal88_tree = 
                    (Object)adaptor.create(char_literal88)
                    ;
                    adaptor.addChild(root_0, char_literal88_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:168:4: ( struct_field_wrapper )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==ID||LA31_0==79||LA31_0==82||(LA31_0 >= 86 && LA31_0 <= 87)||(LA31_0 >= 94 && LA31_0 <= 95)||LA31_0==97) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:168:4: struct_field_wrapper
                    	    {
                    	    pushFollow(FOLLOW_struct_field_wrapper_in_typedef_struct848);
                    	    struct_field_wrapper89=struct_field_wrapper();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, struct_field_wrapper89.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);


                    char_literal90=(Token)match(input,100,FOLLOW_100_in_typedef_struct853); 
                    char_literal90_tree = 
                    (Object)adaptor.create(char_literal90)
                    ;
                    adaptor.addChild(root_0, char_literal90_tree);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:9: ( struct_name ( array_size )? ( ',' struct_name ( array_size )? )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:10: struct_name ( array_size )? ( ',' struct_name ( array_size )? )*
                    {
                    pushFollow(FOLLOW_struct_name_in_typedef_struct858);
                    struct_name91=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name91.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:22: ( array_size )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==72) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:22: array_size
                            {
                            pushFollow(FOLLOW_array_size_in_typedef_struct860);
                            array_size92=array_size();

                            state._fsp--;

                            adaptor.addChild(root_0, array_size92.getTree());

                            }
                            break;

                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:34: ( ',' struct_name ( array_size )? )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==51) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:35: ',' struct_name ( array_size )?
                    	    {
                    	    char_literal93=(Token)match(input,51,FOLLOW_51_in_typedef_struct864); 
                    	    char_literal93_tree = 
                    	    (Object)adaptor.create(char_literal93)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal93_tree);


                    	    pushFollow(FOLLOW_struct_name_in_typedef_struct866);
                    	    struct_name94=struct_name();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, struct_name94.getTree());

                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:51: ( array_size )?
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( (LA34_0==72) ) {
                    	        alt34=1;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:51: array_size
                    	            {
                    	            pushFollow(FOLLOW_array_size_in_typedef_struct868);
                    	            array_size95=array_size();

                    	            state._fsp--;

                    	            adaptor.addChild(root_0, array_size95.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:67: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:67: ';'
                    {
                    char_literal96=(Token)match(input,55,FOLLOW_55_in_typedef_struct875); 
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    adaptor.addChild(root_0, char_literal96_tree);


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
    // $ANTLR end "typedef_struct"


    public static class struct_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:172:1: struct_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.struct_name_return struct_name() throws RecognitionException {
        ObjchParser.struct_name_return retval = new ObjchParser.struct_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID97=null;

        Object ID97_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:173:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:173:4: ID
            {
            ID97=(Token)match(input,ID,FOLLOW_ID_in_struct_name888);  
            stream_ID.add(ID97);


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
            // 173:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:173:10: ^( NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
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
    // $ANTLR end "struct_name"


    public static class struct_field_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_field_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:175:1: struct_field_wrapper : struct_field -> ^( FIELD struct_field ) ;
    public final ObjchParser.struct_field_wrapper_return struct_field_wrapper() throws RecognitionException {
        ObjchParser.struct_field_wrapper_return retval = new ObjchParser.struct_field_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field_return struct_field98 =null;


        RewriteRuleSubtreeStream stream_struct_field=new RewriteRuleSubtreeStream(adaptor,"rule struct_field");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:176:2: ( struct_field -> ^( FIELD struct_field ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:176:4: struct_field
            {
            pushFollow(FOLLOW_struct_field_in_struct_field_wrapper906);
            struct_field98=struct_field();

            state._fsp--;

            stream_struct_field.add(struct_field98.getTree());

            // AST REWRITE
            // elements: struct_field
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 176:17: -> ^( FIELD struct_field )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:176:20: ^( FIELD struct_field )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD, "FIELD")
                , root_1);

                adaptor.addChild(root_1, stream_struct_field.nextTree());

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
    // $ANTLR end "struct_field_wrapper"


    public static class struct_field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_field"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:178:1: struct_field : ( struct_field1 | struct_field2 );
    public final ObjchParser.struct_field_return struct_field() throws RecognitionException {
        ObjchParser.struct_field_return retval = new ObjchParser.struct_field_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field1_return struct_field199 =null;

        ObjchParser.struct_field2_return struct_field2100 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:179:2: ( struct_field1 | struct_field2 )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ID||LA38_0==79||LA38_0==82||(LA38_0 >= 86 && LA38_0 <= 87)||LA38_0==95||LA38_0==97) ) {
                alt38=1;
            }
            else if ( (LA38_0==94) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:179:4: struct_field1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field1_in_struct_field924);
                    struct_field199=struct_field1();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field199.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:180:4: struct_field2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field2_in_struct_field929);
                    struct_field2100=struct_field2();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field2100.getTree());

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
    // $ANTLR end "struct_field"


    public static class struct_field1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_field1"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:1: struct_field1 : type_declaration field_name ( ',' field_name )* ';' ;
    public final ObjchParser.struct_field1_return struct_field1() throws RecognitionException {
        ObjchParser.struct_field1_return retval = new ObjchParser.struct_field1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal103=null;
        Token char_literal105=null;
        ObjchParser.type_declaration_return type_declaration101 =null;

        ObjchParser.field_name_return field_name102 =null;

        ObjchParser.field_name_return field_name104 =null;


        Object char_literal103_tree=null;
        Object char_literal105_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:184:2: ( type_declaration field_name ( ',' field_name )* ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:184:4: type_declaration field_name ( ',' field_name )* ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_struct_field1941);
            type_declaration101=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration101.getTree());

            pushFollow(FOLLOW_field_name_in_struct_field1943);
            field_name102=field_name();

            state._fsp--;

            adaptor.addChild(root_0, field_name102.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:184:32: ( ',' field_name )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==51) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:184:33: ',' field_name
            	    {
            	    char_literal103=(Token)match(input,51,FOLLOW_51_in_struct_field1946); 
            	    char_literal103_tree = 
            	    (Object)adaptor.create(char_literal103)
            	    ;
            	    adaptor.addChild(root_0, char_literal103_tree);


            	    pushFollow(FOLLOW_field_name_in_struct_field1948);
            	    field_name104=field_name();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_name104.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            char_literal105=(Token)match(input,55,FOLLOW_55_in_struct_field1952); 
            char_literal105_tree = 
            (Object)adaptor.create(char_literal105)
            ;
            adaptor.addChild(root_0, char_literal105_tree);


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
    // $ANTLR end "struct_field1"


    public static class struct_field2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_field2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:186:1: struct_field2 : typedef_struct_wrapper ;
    public final ObjchParser.struct_field2_return struct_field2() throws RecognitionException {
        ObjchParser.struct_field2_return retval = new ObjchParser.struct_field2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper106 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:2: ( typedef_struct_wrapper )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:4: typedef_struct_wrapper
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_typedef_struct_wrapper_in_struct_field2962);
            typedef_struct_wrapper106=typedef_struct_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, typedef_struct_wrapper106.getTree());

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
    // $ANTLR end "struct_field2"


    public static class typedef_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:189:1: typedef_name : ID ( '*' )* -> ^( TYPEDEF_NAME ID ) ;
    public final ObjchParser.typedef_name_return typedef_name() throws RecognitionException {
        ObjchParser.typedef_name_return retval = new ObjchParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID107=null;
        Token char_literal108=null;

        Object ID107_tree=null;
        Object char_literal108_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:190:2: ( ID ( '*' )* -> ^( TYPEDEF_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:190:4: ID ( '*' )*
            {
            ID107=(Token)match(input,ID,FOLLOW_ID_in_typedef_name973);  
            stream_ID.add(ID107);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:190:7: ( '*' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==49) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:190:7: '*'
            	    {
            	    char_literal108=(Token)match(input,49,FOLLOW_49_in_typedef_name975);  
            	    stream_49.add(char_literal108);


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


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
            // 190:12: -> ^( TYPEDEF_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:190:15: ^( TYPEDEF_NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEDEF_NAME, "TYPEDEF_NAME")
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
    // $ANTLR end "typedef_name"


    public static class typedef_declaration_element_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_declaration_element_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:192:1: typedef_declaration_element_wrapper : typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) ;
    public final ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_element_wrapper_return retval = new ObjchParser.typedef_declaration_element_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_element_return typedef_declaration_element109 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration_element=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration_element");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:193:2: ( typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:193:4: typedef_declaration_element
            {
            pushFollow(FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper993);
            typedef_declaration_element109=typedef_declaration_element();

            state._fsp--;

            stream_typedef_declaration_element.add(typedef_declaration_element109.getTree());

            // AST REWRITE
            // elements: typedef_declaration_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 193:32: -> ^( TYPEDEF_ELEMENT typedef_declaration_element )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:193:35: ^( TYPEDEF_ELEMENT typedef_declaration_element )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEDEF_ELEMENT, "TYPEDEF_ELEMENT")
                , root_1);

                adaptor.addChild(root_1, stream_typedef_declaration_element.nextTree());

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
    // $ANTLR end "typedef_declaration_element_wrapper"


    public static class typedef_declaration_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_declaration_element"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:1: typedef_declaration_element : ( ID ( '=' element_value )? | element_value ( '=' element_value )? );
    public final ObjchParser.typedef_declaration_element_return typedef_declaration_element() throws RecognitionException {
        ObjchParser.typedef_declaration_element_return retval = new ObjchParser.typedef_declaration_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID110=null;
        Token char_literal111=null;
        Token char_literal114=null;
        ObjchParser.element_value_return element_value112 =null;

        ObjchParser.element_value_return element_value113 =null;

        ObjchParser.element_value_return element_value115 =null;


        Object ID110_tree=null;
        Object char_literal111_tree=null;
        Object char_literal114_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:197:2: ( ID ( '=' element_value )? | element_value ( '=' element_value )? )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==NUMBER||LA43_0==47) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:197:4: ID ( '=' element_value )?
                    {
                    root_0 = (Object)adaptor.nil();


                    ID110=(Token)match(input,ID,FOLLOW_ID_in_typedef_declaration_element1013); 
                    ID110_tree = 
                    (Object)adaptor.create(ID110)
                    ;
                    adaptor.addChild(root_0, ID110_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:197:7: ( '=' element_value )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==58) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:197:8: '=' element_value
                            {
                            char_literal111=(Token)match(input,58,FOLLOW_58_in_typedef_declaration_element1016); 
                            char_literal111_tree = 
                            (Object)adaptor.create(char_literal111)
                            ;
                            adaptor.addChild(root_0, char_literal111_tree);


                            pushFollow(FOLLOW_element_value_in_typedef_declaration_element1018);
                            element_value112=element_value();

                            state._fsp--;

                            adaptor.addChild(root_0, element_value112.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:198:4: element_value ( '=' element_value )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_element_value_in_typedef_declaration_element1025);
                    element_value113=element_value();

                    state._fsp--;

                    adaptor.addChild(root_0, element_value113.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:198:18: ( '=' element_value )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==58) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:198:19: '=' element_value
                            {
                            char_literal114=(Token)match(input,58,FOLLOW_58_in_typedef_declaration_element1028); 
                            char_literal114_tree = 
                            (Object)adaptor.create(char_literal114)
                            ;
                            adaptor.addChild(root_0, char_literal114_tree);


                            pushFollow(FOLLOW_element_value_in_typedef_declaration_element1030);
                            element_value115=element_value();

                            state._fsp--;

                            adaptor.addChild(root_0, element_value115.getTree());

                            }
                            break;

                    }


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
    // $ANTLR end "typedef_declaration_element"


    public static class element_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "element_value"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:201:1: element_value : simple_expression -> ^( VALUE simple_expression ) ;
    public final ObjchParser.element_value_return element_value() throws RecognitionException {
        ObjchParser.element_value_return retval = new ObjchParser.element_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression_return simple_expression116 =null;


        RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:202:2: ( simple_expression -> ^( VALUE simple_expression ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:202:4: simple_expression
            {
            pushFollow(FOLLOW_simple_expression_in_element_value1044);
            simple_expression116=simple_expression();

            state._fsp--;

            stream_simple_expression.add(simple_expression116.getTree());

            // AST REWRITE
            // elements: simple_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 202:22: -> ^( VALUE simple_expression )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:202:25: ^( VALUE simple_expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VALUE, "VALUE")
                , root_1);

                adaptor.addChild(root_1, stream_simple_expression.nextTree());

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
    // $ANTLR end "element_value"


    public static class simple_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_expression"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:1: simple_expression : simple_expression2 ( op2 simple_expression2 )* ;
    public final ObjchParser.simple_expression_return simple_expression() throws RecognitionException {
        ObjchParser.simple_expression_return retval = new ObjchParser.simple_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression2_return simple_expression2117 =null;

        ObjchParser.op2_return op2118 =null;

        ObjchParser.simple_expression2_return simple_expression2119 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:206:2: ( simple_expression2 ( op2 simple_expression2 )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:206:4: simple_expression2 ( op2 simple_expression2 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_simple_expression2_in_simple_expression1065);
            simple_expression2117=simple_expression2();

            state._fsp--;

            adaptor.addChild(root_0, simple_expression2117.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:206:23: ( op2 simple_expression2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0 >= 45 && LA44_0 <= 46)||LA44_0==57||LA44_0==60||LA44_0==99) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:206:25: op2 simple_expression2
            	    {
            	    pushFollow(FOLLOW_op2_in_simple_expression1069);
            	    op2118=op2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op2118.getTree());

            	    pushFollow(FOLLOW_simple_expression2_in_simple_expression1071);
            	    simple_expression2119=simple_expression2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simple_expression2119.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "simple_expression"


    public static class simple_expression2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_expression2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:209:1: simple_expression2 : ( ID | NUMBER | '(' simple_expression ')' );
    public final ObjchParser.simple_expression2_return simple_expression2() throws RecognitionException {
        ObjchParser.simple_expression2_return retval = new ObjchParser.simple_expression2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID120=null;
        Token NUMBER121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        ObjchParser.simple_expression_return simple_expression123 =null;


        Object ID120_tree=null;
        Object NUMBER121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:2: ( ID | NUMBER | '(' simple_expression ')' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt45=1;
                }
                break;
            case NUMBER:
                {
                alt45=2;
                }
                break;
            case 47:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID120=(Token)match(input,ID,FOLLOW_ID_in_simple_expression21085); 
                    ID120_tree = 
                    (Object)adaptor.create(ID120)
                    ;
                    adaptor.addChild(root_0, ID120_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:211:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER121=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_simple_expression21090); 
                    NUMBER121_tree = 
                    (Object)adaptor.create(NUMBER121)
                    ;
                    adaptor.addChild(root_0, NUMBER121_tree);


                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:212:4: '(' simple_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal122=(Token)match(input,47,FOLLOW_47_in_simple_expression21095); 
                    char_literal122_tree = 
                    (Object)adaptor.create(char_literal122)
                    ;
                    adaptor.addChild(root_0, char_literal122_tree);


                    pushFollow(FOLLOW_simple_expression_in_simple_expression21097);
                    simple_expression123=simple_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_expression123.getTree());

                    char_literal124=(Token)match(input,48,FOLLOW_48_in_simple_expression21099); 
                    char_literal124_tree = 
                    (Object)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);


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
    // $ANTLR end "simple_expression2"


    public static class op2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:1: op2 : ( '|' | '&~' | '&' | '<<' | '>>' );
    public final ObjchParser.op2_return op2() throws RecognitionException {
        ObjchParser.op2_return retval = new ObjchParser.op2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set125=null;

        Object set125_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:5: ( '|' | '&~' | '&' | '<<' | '>>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set125=(Token)input.LT(1);

            if ( (input.LA(1) >= 45 && input.LA(1) <= 46)||input.LA(1)==57||input.LA(1)==60||input.LA(1)==99 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set125)
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
    // $ANTLR end "op2"


    public static class class_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:216:1: class_declaration : '@class' ID ( ',' ID )* ';' ;
    public final ObjchParser.class_declaration_return class_declaration() throws RecognitionException {
        ObjchParser.class_declaration_return retval = new ObjchParser.class_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal126=null;
        Token ID127=null;
        Token char_literal128=null;
        Token ID129=null;
        Token char_literal130=null;

        Object string_literal126_tree=null;
        Object ID127_tree=null;
        Object char_literal128_tree=null;
        Object ID129_tree=null;
        Object char_literal130_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:217:2: ( '@class' ID ( ',' ID )* ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:217:4: '@class' ID ( ',' ID )* ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal126=(Token)match(input,61,FOLLOW_61_in_class_declaration1134); 
            string_literal126_tree = 
            (Object)adaptor.create(string_literal126)
            ;
            adaptor.addChild(root_0, string_literal126_tree);


            ID127=(Token)match(input,ID,FOLLOW_ID_in_class_declaration1136); 
            ID127_tree = 
            (Object)adaptor.create(ID127)
            ;
            adaptor.addChild(root_0, ID127_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:217:16: ( ',' ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==51) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:217:17: ',' ID
            	    {
            	    char_literal128=(Token)match(input,51,FOLLOW_51_in_class_declaration1139); 
            	    char_literal128_tree = 
            	    (Object)adaptor.create(char_literal128)
            	    ;
            	    adaptor.addChild(root_0, char_literal128_tree);


            	    ID129=(Token)match(input,ID,FOLLOW_ID_in_class_declaration1141); 
            	    ID129_tree = 
            	    (Object)adaptor.create(ID129)
            	    ;
            	    adaptor.addChild(root_0, ID129_tree);


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            char_literal130=(Token)match(input,55,FOLLOW_55_in_class_declaration1145); 
            char_literal130_tree = 
            (Object)adaptor.create(char_literal130)
            ;
            adaptor.addChild(root_0, char_literal130_tree);


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
    // $ANTLR end "class_declaration"


    public static class protocol_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:1: protocol_declaration : '@protocol' protocol_name ( generic )? protocol_end ;
    public final ObjchParser.protocol_declaration_return protocol_declaration() throws RecognitionException {
        ObjchParser.protocol_declaration_return retval = new ObjchParser.protocol_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal131=null;
        ObjchParser.protocol_name_return protocol_name132 =null;

        ObjchParser.generic_return generic133 =null;

        ObjchParser.protocol_end_return protocol_end134 =null;


        Object string_literal131_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:220:2: ( '@protocol' protocol_name ( generic )? protocol_end )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:220:4: '@protocol' protocol_name ( generic )? protocol_end
            {
            root_0 = (Object)adaptor.nil();


            string_literal131=(Token)match(input,68,FOLLOW_68_in_protocol_declaration1155); 
            string_literal131_tree = 
            (Object)adaptor.create(string_literal131)
            ;
            adaptor.addChild(root_0, string_literal131_tree);


            pushFollow(FOLLOW_protocol_name_in_protocol_declaration1157);
            protocol_name132=protocol_name();

            state._fsp--;

            adaptor.addChild(root_0, protocol_name132.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:220:30: ( generic )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:220:30: generic
                    {
                    pushFollow(FOLLOW_generic_in_protocol_declaration1159);
                    generic133=generic();

                    state._fsp--;

                    adaptor.addChild(root_0, generic133.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_protocol_end_in_protocol_declaration1165);
            protocol_end134=protocol_end();

            state._fsp--;

            adaptor.addChild(root_0, protocol_end134.getTree());

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
    // $ANTLR end "protocol_declaration"


    public static class protocol_end_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_end"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:224:1: protocol_end : ( protocol_end1 | protocol_end2 );
    public final ObjchParser.protocol_end_return protocol_end() throws RecognitionException {
        ObjchParser.protocol_end_return retval = new ObjchParser.protocol_end_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_end1_return protocol_end1135 =null;

        ObjchParser.protocol_end2_return protocol_end2136 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:225:2: ( protocol_end1 | protocol_end2 )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID||LA48_0==50||LA48_0==52||LA48_0==62||LA48_0==64||LA48_0==66||LA48_0==70||LA48_0==77||LA48_0==79||LA48_0==82||(LA48_0 >= 85 && LA48_0 <= 87)||LA48_0==92||LA48_0==95||LA48_0==97) ) {
                alt48=1;
            }
            else if ( (LA48_0==55) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:225:4: protocol_end1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end1_in_protocol_end1177);
                    protocol_end1135=protocol_end1();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end1135.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:226:4: protocol_end2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end2_in_protocol_end1182);
                    protocol_end2136=protocol_end2();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end2136.getTree());

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
    // $ANTLR end "protocol_end"


    public static class protocol_end1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_end1"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:228:1: protocol_end1 : ( declarations )* '@end' ;
    public final ObjchParser.protocol_end1_return protocol_end1() throws RecognitionException {
        ObjchParser.protocol_end1_return retval = new ObjchParser.protocol_end1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal138=null;
        ObjchParser.declarations_return declarations137 =null;


        Object string_literal138_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:229:2: ( ( declarations )* '@end' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:229:4: ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:229:4: ( declarations )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ID||LA49_0==50||LA49_0==52||LA49_0==64||LA49_0==66||LA49_0==70||LA49_0==77||LA49_0==79||LA49_0==82||(LA49_0 >= 85 && LA49_0 <= 87)||LA49_0==92||LA49_0==95||LA49_0==97) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:229:4: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_protocol_end11191);
            	    declarations137=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations137.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            string_literal138=(Token)match(input,62,FOLLOW_62_in_protocol_end11196); 
            string_literal138_tree = 
            (Object)adaptor.create(string_literal138)
            ;
            adaptor.addChild(root_0, string_literal138_tree);


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
    // $ANTLR end "protocol_end1"


    public static class protocol_end2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_end2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:233:1: protocol_end2 : ';' ;
    public final ObjchParser.protocol_end2_return protocol_end2() throws RecognitionException {
        ObjchParser.protocol_end2_return retval = new ObjchParser.protocol_end2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal139=null;

        Object char_literal139_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:234:2: ( ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:234:4: ';'
            {
            root_0 = (Object)adaptor.nil();


            char_literal139=(Token)match(input,55,FOLLOW_55_in_protocol_end21208); 
            char_literal139_tree = 
            (Object)adaptor.create(char_literal139)
            ;
            adaptor.addChild(root_0, char_literal139_tree);


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
    // $ANTLR end "protocol_end2"


    public static class generic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generic"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:238:1: generic : '<' generic_internal '>' ;
    public final ObjchParser.generic_return generic() throws RecognitionException {
        ObjchParser.generic_return retval = new ObjchParser.generic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal140=null;
        Token char_literal142=null;
        ObjchParser.generic_internal_return generic_internal141 =null;


        Object char_literal140_tree=null;
        Object char_literal142_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:238:9: ( '<' generic_internal '>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:238:11: '<' generic_internal '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal140=(Token)match(input,56,FOLLOW_56_in_generic1221); 
            char_literal140_tree = 
            (Object)adaptor.create(char_literal140)
            ;
            adaptor.addChild(root_0, char_literal140_tree);


            pushFollow(FOLLOW_generic_internal_in_generic1223);
            generic_internal141=generic_internal();

            state._fsp--;

            adaptor.addChild(root_0, generic_internal141.getTree());

            char_literal142=(Token)match(input,59,FOLLOW_59_in_generic1225); 
            char_literal142_tree = 
            (Object)adaptor.create(char_literal142)
            ;
            adaptor.addChild(root_0, char_literal142_tree);


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
    // $ANTLR end "generic"


    public static class generic_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generic_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:240:1: generic_internal : type_declaration ( ',' type_declaration )* ;
    public final ObjchParser.generic_internal_return generic_internal() throws RecognitionException {
        ObjchParser.generic_internal_return retval = new ObjchParser.generic_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal144=null;
        ObjchParser.type_declaration_return type_declaration143 =null;

        ObjchParser.type_declaration_return type_declaration145 =null;


        Object char_literal144_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:241:2: ( type_declaration ( ',' type_declaration )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:241:4: type_declaration ( ',' type_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_generic_internal1234);
            type_declaration143=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration143.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:241:21: ( ',' type_declaration )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==51) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:241:22: ',' type_declaration
            	    {
            	    char_literal144=(Token)match(input,51,FOLLOW_51_in_generic_internal1237); 
            	    char_literal144_tree = 
            	    (Object)adaptor.create(char_literal144)
            	    ;
            	    adaptor.addChild(root_0, char_literal144_tree);


            	    pushFollow(FOLLOW_type_declaration_in_generic_internal1239);
            	    type_declaration145=type_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type_declaration145.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "generic_internal"


    public static class protocol_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:243:1: protocol_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.protocol_name_return protocol_name() throws RecognitionException {
        ObjchParser.protocol_name_return retval = new ObjchParser.protocol_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID146=null;

        Object ID146_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:4: ID
            {
            ID146=(Token)match(input,ID,FOLLOW_ID_in_protocol_name1251);  
            stream_ID.add(ID146);


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
            // 244:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:10: ^( NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
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
    // $ANTLR end "protocol_name"


    public static class interface_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:1: interface_declaration : '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' ;
    public final ObjchParser.interface_declaration_return interface_declaration() throws RecognitionException {
        ObjchParser.interface_declaration_return retval = new ObjchParser.interface_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal147=null;
        Token char_literal149=null;
        Token string_literal153=null;
        ObjchParser.interface_name_return interface_name148 =null;

        ObjchParser.superclass_name_return superclass_name150 =null;

        ObjchParser.interface_body_return interface_body151 =null;

        ObjchParser.declarations_return declarations152 =null;


        Object string_literal147_tree=null;
        Object char_literal149_tree=null;
        Object string_literal153_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:247:2: ( '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:247:4: '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            string_literal147=(Token)match(input,63,FOLLOW_63_in_interface_declaration1271); 
            string_literal147_tree = 
            (Object)adaptor.create(string_literal147)
            ;
            adaptor.addChild(root_0, string_literal147_tree);


            pushFollow(FOLLOW_interface_name_in_interface_declaration1273);
            interface_name148=interface_name();

            state._fsp--;

            adaptor.addChild(root_0, interface_name148.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:247:32: ( ':' superclass_name )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:247:33: ':' superclass_name
                    {
                    char_literal149=(Token)match(input,54,FOLLOW_54_in_interface_declaration1276); 
                    char_literal149_tree = 
                    (Object)adaptor.create(char_literal149)
                    ;
                    adaptor.addChild(root_0, char_literal149_tree);


                    pushFollow(FOLLOW_superclass_name_in_interface_declaration1278);
                    superclass_name150=superclass_name();

                    state._fsp--;

                    adaptor.addChild(root_0, superclass_name150.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:248:2: ( interface_body )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==98) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:248:2: interface_body
                    {
                    pushFollow(FOLLOW_interface_body_in_interface_declaration1283);
                    interface_body151=interface_body();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_body151.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:249:2: ( declarations )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==ID||LA53_0==50||LA53_0==52||LA53_0==64||LA53_0==66||LA53_0==70||LA53_0==77||LA53_0==79||LA53_0==82||(LA53_0 >= 85 && LA53_0 <= 87)||LA53_0==92||LA53_0==95||LA53_0==97) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:249:2: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_interface_declaration1287);
            	    declarations152=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations152.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            string_literal153=(Token)match(input,62,FOLLOW_62_in_interface_declaration1291); 
            string_literal153_tree = 
            (Object)adaptor.create(string_literal153)
            ;
            adaptor.addChild(root_0, string_literal153_tree);


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
    // $ANTLR end "interface_declaration"


    public static class interface_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_body"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:253:1: interface_body : '{' ( interface_body_item )* '}' ;
    public final ObjchParser.interface_body_return interface_body() throws RecognitionException {
        ObjchParser.interface_body_return retval = new ObjchParser.interface_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal154=null;
        Token char_literal156=null;
        ObjchParser.interface_body_item_return interface_body_item155 =null;


        Object char_literal154_tree=null;
        Object char_literal156_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:254:2: ( '{' ( interface_body_item )* '}' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:255:2: '{' ( interface_body_item )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal154=(Token)match(input,98,FOLLOW_98_in_interface_body1304); 
            char_literal154_tree = 
            (Object)adaptor.create(char_literal154)
            ;
            adaptor.addChild(root_0, char_literal154_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:256:3: ( interface_body_item )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==ID||LA54_0==65||LA54_0==67||LA54_0==69||LA54_0==77||LA54_0==79||LA54_0==82||(LA54_0 >= 85 && LA54_0 <= 87)||LA54_0==92||(LA54_0 >= 94 && LA54_0 <= 97)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:256:3: interface_body_item
            	    {
            	    pushFollow(FOLLOW_interface_body_item_in_interface_body1308);
            	    interface_body_item155=interface_body_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, interface_body_item155.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            char_literal156=(Token)match(input,100,FOLLOW_100_in_interface_body1312); 
            char_literal156_tree = 
            (Object)adaptor.create(char_literal156)
            ;
            adaptor.addChild(root_0, char_literal156_tree);


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
    // $ANTLR end "interface_body"


    public static class interface_body_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_body_item"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:1: interface_body_item : ( group_modifier_wrapper ( simple_fields_declaration )? | simple_fields_declaration | union_declaration_wrapper ';' | typedef_struct_wrapper );
    public final ObjchParser.interface_body_item_return interface_body_item() throws RecognitionException {
        ObjchParser.interface_body_item_return retval = new ObjchParser.interface_body_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal161=null;
        ObjchParser.group_modifier_wrapper_return group_modifier_wrapper157 =null;

        ObjchParser.simple_fields_declaration_return simple_fields_declaration158 =null;

        ObjchParser.simple_fields_declaration_return simple_fields_declaration159 =null;

        ObjchParser.union_declaration_wrapper_return union_declaration_wrapper160 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper162 =null;


        Object char_literal161_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:261:2: ( group_modifier_wrapper ( simple_fields_declaration )? | simple_fields_declaration | union_declaration_wrapper ';' | typedef_struct_wrapper )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 65:
            case 67:
            case 69:
                {
                alt56=1;
                }
                break;
            case ID:
            case 77:
            case 79:
            case 82:
            case 85:
            case 86:
            case 87:
            case 92:
            case 95:
            case 97:
                {
                alt56=2;
                }
                break;
            case 96:
                {
                alt56=3;
                }
                break;
            case 94:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:261:4: group_modifier_wrapper ( simple_fields_declaration )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_group_modifier_wrapper_in_interface_body_item1324);
                    group_modifier_wrapper157=group_modifier_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, group_modifier_wrapper157.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:261:27: ( simple_fields_declaration )?
                    int alt55=2;
                    alt55 = dfa55.predict(input);
                    switch (alt55) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:261:27: simple_fields_declaration
                            {
                            pushFollow(FOLLOW_simple_fields_declaration_in_interface_body_item1326);
                            simple_fields_declaration158=simple_fields_declaration();

                            state._fsp--;

                            adaptor.addChild(root_0, simple_fields_declaration158.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:262:4: simple_fields_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simple_fields_declaration_in_interface_body_item1332);
                    simple_fields_declaration159=simple_fields_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_fields_declaration159.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:263:4: union_declaration_wrapper ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_union_declaration_wrapper_in_interface_body_item1337);
                    union_declaration_wrapper160=union_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, union_declaration_wrapper160.getTree());

                    char_literal161=(Token)match(input,55,FOLLOW_55_in_interface_body_item1339); 
                    char_literal161_tree = 
                    (Object)adaptor.create(char_literal161)
                    ;
                    adaptor.addChild(root_0, char_literal161_tree);


                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:264:4: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_interface_body_item1344);
                    typedef_struct_wrapper162=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper162.getTree());

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
    // $ANTLR end "interface_body_item"


    public static class union_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "union_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:267:1: union_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.union_name_return union_name() throws RecognitionException {
        ObjchParser.union_name_return retval = new ObjchParser.union_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID163=null;

        Object ID163_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:4: ID
            {
            ID163=(Token)match(input,ID,FOLLOW_ID_in_union_name1355);  
            stream_ID.add(ID163);


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
            // 268:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:10: ^( NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
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
    // $ANTLR end "union_name"


    public static class group_modifier_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "group_modifier_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:270:1: group_modifier_wrapper : group_modifier -> ^( GROUP_MODIFIER group_modifier ) ;
    public final ObjchParser.group_modifier_wrapper_return group_modifier_wrapper() throws RecognitionException {
        ObjchParser.group_modifier_wrapper_return retval = new ObjchParser.group_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.group_modifier_return group_modifier164 =null;


        RewriteRuleSubtreeStream stream_group_modifier=new RewriteRuleSubtreeStream(adaptor,"rule group_modifier");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:2: ( group_modifier -> ^( GROUP_MODIFIER group_modifier ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:4: group_modifier
            {
            pushFollow(FOLLOW_group_modifier_in_group_modifier_wrapper1374);
            group_modifier164=group_modifier();

            state._fsp--;

            stream_group_modifier.add(group_modifier164.getTree());

            // AST REWRITE
            // elements: group_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 271:19: -> ^( GROUP_MODIFIER group_modifier )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:22: ^( GROUP_MODIFIER group_modifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(GROUP_MODIFIER, "GROUP_MODIFIER")
                , root_1);

                adaptor.addChild(root_1, stream_group_modifier.nextTree());

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
    // $ANTLR end "group_modifier_wrapper"


    public static class group_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "group_modifier"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:273:1: group_modifier : ( '@private' | '@protected' | '@public' );
    public final ObjchParser.group_modifier_return group_modifier() throws RecognitionException {
        ObjchParser.group_modifier_return retval = new ObjchParser.group_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set165=null;

        Object set165_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:2: ( '@private' | '@protected' | '@public' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set165=(Token)input.LT(1);

            if ( input.LA(1)==65||input.LA(1)==67||input.LA(1)==69 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set165)
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
    // $ANTLR end "group_modifier"


    public static class interface_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:276:1: interface_name : ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) ;
    public final ObjchParser.interface_name_return interface_name() throws RecognitionException {
        ObjchParser.interface_name_return retval = new ObjchParser.interface_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID166=null;
        ObjchParser.category_return category167 =null;


        Object ID166_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_category=new RewriteRuleSubtreeStream(adaptor,"rule category");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:2: ( ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:4: ID ( category )?
            {
            ID166=(Token)match(input,ID,FOLLOW_ID_in_interface_name1413);  
            stream_ID.add(ID166);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:7: ( category )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==47) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:7: category
                    {
                    pushFollow(FOLLOW_category_in_interface_name1415);
                    category167=category();

                    state._fsp--;

                    stream_category.add(category167.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: category, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:17: -> ^( INTERFACE_NAME ID ( category )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:20: ^( INTERFACE_NAME ID ( category )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_NAME, "INTERFACE_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:40: ( category )?
                if ( stream_category.hasNext() ) {
                    adaptor.addChild(root_1, stream_category.nextTree());

                }
                stream_category.reset();

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
    // $ANTLR end "interface_name"


    public static class category_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "category"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:279:1: category : '(' ID ')' -> ^( CATEGORY ID ) ;
    public final ObjchParser.category_return category() throws RecognitionException {
        ObjchParser.category_return retval = new ObjchParser.category_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal168=null;
        Token ID169=null;
        Token char_literal170=null;

        Object char_literal168_tree=null;
        Object ID169_tree=null;
        Object char_literal170_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:279:9: ( '(' ID ')' -> ^( CATEGORY ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:279:11: '(' ID ')'
            {
            char_literal168=(Token)match(input,47,FOLLOW_47_in_category1434);  
            stream_47.add(char_literal168);


            ID169=(Token)match(input,ID,FOLLOW_ID_in_category1436);  
            stream_ID.add(ID169);


            char_literal170=(Token)match(input,48,FOLLOW_48_in_category1438);  
            stream_48.add(char_literal170);


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
            // 279:22: -> ^( CATEGORY ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:279:25: ^( CATEGORY ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CATEGORY, "CATEGORY")
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
    // $ANTLR end "category"


    public static class superclass_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superclass_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:281:1: superclass_name : ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) ;
    public final ObjchParser.superclass_name_return superclass_name() throws RecognitionException {
        ObjchParser.superclass_name_return retval = new ObjchParser.superclass_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID171=null;
        ObjchParser.generic_return generic172 =null;


        Object ID171_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_generic=new RewriteRuleSubtreeStream(adaptor,"rule generic");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:282:2: ( ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:282:4: ID ( generic )?
            {
            ID171=(Token)match(input,ID,FOLLOW_ID_in_superclass_name1455);  
            stream_ID.add(ID171);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:282:7: ( generic )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:282:7: generic
                    {
                    pushFollow(FOLLOW_generic_in_superclass_name1457);
                    generic172=generic();

                    state._fsp--;

                    stream_generic.add(generic172.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ID, generic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:16: -> ^( SUPERCLASS_NAME ID ( generic )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:282:19: ^( SUPERCLASS_NAME ID ( generic )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SUPERCLASS_NAME, "SUPERCLASS_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:282:40: ( generic )?
                if ( stream_generic.hasNext() ) {
                    adaptor.addChild(root_1, stream_generic.nextTree());

                }
                stream_generic.reset();

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
    // $ANTLR end "superclass_name"


    public static class simple_fields_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_fields_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:1: simple_fields_declaration : ( field_declaration_wrapper )+ -> ^( FIELDS ( field_declaration_wrapper )+ ) ;
    public final ObjchParser.simple_fields_declaration_return simple_fields_declaration() throws RecognitionException {
        ObjchParser.simple_fields_declaration_return retval = new ObjchParser.simple_fields_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper173 =null;


        RewriteRuleSubtreeStream stream_field_declaration_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration_wrapper");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:285:2: ( ( field_declaration_wrapper )+ -> ^( FIELDS ( field_declaration_wrapper )+ ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:285:4: ( field_declaration_wrapper )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:285:4: ( field_declaration_wrapper )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                switch ( input.LA(1) ) {
                case 77:
                    {
                    alt59=1;
                    }
                    break;
                case 92:
                    {
                    alt59=1;
                    }
                    break;
                case 85:
                    {
                    alt59=1;
                    }
                    break;
                case 79:
                    {
                    alt59=1;
                    }
                    break;
                case 82:
                    {
                    alt59=1;
                    }
                    break;
                case 95:
                    {
                    alt59=1;
                    }
                    break;
                case 97:
                    {
                    alt59=1;
                    }
                    break;
                case 86:
                    {
                    alt59=1;
                    }
                    break;
                case 87:
                    {
                    alt59=1;
                    }
                    break;
                case ID:
                    {
                    alt59=1;
                    }
                    break;

                }

                switch (alt59) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:285:4: field_declaration_wrapper
            	    {
            	    pushFollow(FOLLOW_field_declaration_wrapper_in_simple_fields_declaration1479);
            	    field_declaration_wrapper173=field_declaration_wrapper();

            	    state._fsp--;

            	    stream_field_declaration_wrapper.add(field_declaration_wrapper173.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);


            // AST REWRITE
            // elements: field_declaration_wrapper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 285:31: -> ^( FIELDS ( field_declaration_wrapper )+ )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:285:34: ^( FIELDS ( field_declaration_wrapper )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELDS, "FIELDS")
                , root_1);

                if ( !(stream_field_declaration_wrapper.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_field_declaration_wrapper.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_declaration_wrapper.nextTree());

                }
                stream_field_declaration_wrapper.reset();

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
    // $ANTLR end "simple_fields_declaration"


    public static class field_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:287:1: field_declaration : ( '__weak' )? ( static_prefix )? ( 'inline' )? type_declaration ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer ) ';' ;
    public final ObjchParser.field_declaration_return field_declaration() throws RecognitionException {
        ObjchParser.field_declaration_return retval = new ObjchParser.field_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal174=null;
        Token string_literal176=null;
        Token char_literal180=null;
        Token char_literal183=null;
        ObjchParser.static_prefix_return static_prefix175 =null;

        ObjchParser.type_declaration_return type_declaration177 =null;

        ObjchParser.field_name_return field_name178 =null;

        ObjchParser.classical_method_params_return classical_method_params179 =null;

        ObjchParser.field_name_return field_name181 =null;

        ObjchParser.func_pointer_return func_pointer182 =null;


        Object string_literal174_tree=null;
        Object string_literal176_tree=null;
        Object char_literal180_tree=null;
        Object char_literal183_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:2: ( ( '__weak' )? ( static_prefix )? ( 'inline' )? type_declaration ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer ) ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:4: ( '__weak' )? ( static_prefix )? ( 'inline' )? type_declaration ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer ) ';'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:4: ( '__weak' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==77) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:4: '__weak'
                    {
                    string_literal174=(Token)match(input,77,FOLLOW_77_in_field_declaration1499); 
                    string_literal174_tree = 
                    (Object)adaptor.create(string_literal174)
                    ;
                    adaptor.addChild(root_0, string_literal174_tree);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:14: ( static_prefix )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==92) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:14: static_prefix
                    {
                    pushFollow(FOLLOW_static_prefix_in_field_declaration1502);
                    static_prefix175=static_prefix();

                    state._fsp--;

                    adaptor.addChild(root_0, static_prefix175.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:29: ( 'inline' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==85) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:29: 'inline'
                    {
                    string_literal176=(Token)match(input,85,FOLLOW_85_in_field_declaration1505); 
                    string_literal176_tree = 
                    (Object)adaptor.create(string_literal176)
                    ;
                    adaptor.addChild(root_0, string_literal176_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_type_declaration_in_field_declaration1508);
            type_declaration177=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration177.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:56: ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ID) ) {
                alt65=1;
            }
            else if ( (LA65_0==47) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:57: ( field_name ( classical_method_params | ( ',' field_name )* ) )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:57: ( field_name ( classical_method_params | ( ',' field_name )* ) )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:58: field_name ( classical_method_params | ( ',' field_name )* )
                    {
                    pushFollow(FOLLOW_field_name_in_field_declaration1512);
                    field_name178=field_name();

                    state._fsp--;

                    adaptor.addChild(root_0, field_name178.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:69: ( classical_method_params | ( ',' field_name )* )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==47) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==51||LA64_0==55) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;

                    }
                    switch (alt64) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:70: classical_method_params
                            {
                            pushFollow(FOLLOW_classical_method_params_in_field_declaration1515);
                            classical_method_params179=classical_method_params();

                            state._fsp--;

                            adaptor.addChild(root_0, classical_method_params179.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:96: ( ',' field_name )*
                            {
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:96: ( ',' field_name )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==51) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:97: ',' field_name
                            	    {
                            	    char_literal180=(Token)match(input,51,FOLLOW_51_in_field_declaration1520); 
                            	    char_literal180_tree = 
                            	    (Object)adaptor.create(char_literal180)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal180_tree);


                            	    pushFollow(FOLLOW_field_name_in_field_declaration1522);
                            	    field_name181=field_name();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, field_name181.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop63;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:118: func_pointer
                    {
                    pushFollow(FOLLOW_func_pointer_in_field_declaration1530);
                    func_pointer182=func_pointer();

                    state._fsp--;

                    adaptor.addChild(root_0, func_pointer182.getTree());

                    }
                    break;

            }


            char_literal183=(Token)match(input,55,FOLLOW_55_in_field_declaration1533); 
            char_literal183_tree = 
            (Object)adaptor.create(char_literal183)
            ;
            adaptor.addChild(root_0, char_literal183_tree);


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
    // $ANTLR end "field_declaration"


    public static class classical_method_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classical_method_params"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:1: classical_method_params : '(' ( classical_param ( ',' classical_param )* )? ')' ( attribute )? ;
    public final ObjchParser.classical_method_params_return classical_method_params() throws RecognitionException {
        ObjchParser.classical_method_params_return retval = new ObjchParser.classical_method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal184=null;
        Token char_literal186=null;
        Token char_literal188=null;
        ObjchParser.classical_param_return classical_param185 =null;

        ObjchParser.classical_param_return classical_param187 =null;

        ObjchParser.attribute_return attribute189 =null;


        Object char_literal184_tree=null;
        Object char_literal186_tree=null;
        Object char_literal188_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:291:2: ( '(' ( classical_param ( ',' classical_param )* )? ')' ( attribute )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:291:4: '(' ( classical_param ( ',' classical_param )* )? ')' ( attribute )?
            {
            root_0 = (Object)adaptor.nil();


            char_literal184=(Token)match(input,47,FOLLOW_47_in_classical_method_params1543); 
            char_literal184_tree = 
            (Object)adaptor.create(char_literal184)
            ;
            adaptor.addChild(root_0, char_literal184_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:291:8: ( classical_param ( ',' classical_param )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==ID||LA67_0==53||LA67_0==79||LA67_0==82||(LA67_0 >= 86 && LA67_0 <= 87)||(LA67_0 >= 94 && LA67_0 <= 95)||LA67_0==97) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:291:9: classical_param ( ',' classical_param )*
                    {
                    pushFollow(FOLLOW_classical_param_in_classical_method_params1546);
                    classical_param185=classical_param();

                    state._fsp--;

                    adaptor.addChild(root_0, classical_param185.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:291:25: ( ',' classical_param )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==51) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:291:26: ',' classical_param
                    	    {
                    	    char_literal186=(Token)match(input,51,FOLLOW_51_in_classical_method_params1549); 
                    	    char_literal186_tree = 
                    	    (Object)adaptor.create(char_literal186)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal186_tree);


                    	    pushFollow(FOLLOW_classical_param_in_classical_method_params1551);
                    	    classical_param187=classical_param();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, classical_param187.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal188=(Token)match(input,48,FOLLOW_48_in_classical_method_params1557); 
            char_literal188_tree = 
            (Object)adaptor.create(char_literal188)
            ;
            adaptor.addChild(root_0, char_literal188_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:291:54: ( attribute )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==75) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:291:54: attribute
                    {
                    pushFollow(FOLLOW_attribute_in_classical_method_params1559);
                    attribute189=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute189.getTree());

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
    // $ANTLR end "classical_method_params"


    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:294:1: attribute : '__attribute__' '(' attribute_internal ')' ;
    public final ObjchParser.attribute_return attribute() throws RecognitionException {
        ObjchParser.attribute_return retval = new ObjchParser.attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal190=null;
        Token char_literal191=null;
        Token char_literal193=null;
        ObjchParser.attribute_internal_return attribute_internal192 =null;


        Object string_literal190_tree=null;
        Object char_literal191_tree=null;
        Object char_literal193_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:295:2: ( '__attribute__' '(' attribute_internal ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:295:4: '__attribute__' '(' attribute_internal ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal190=(Token)match(input,75,FOLLOW_75_in_attribute1573); 
            string_literal190_tree = 
            (Object)adaptor.create(string_literal190)
            ;
            adaptor.addChild(root_0, string_literal190_tree);


            char_literal191=(Token)match(input,47,FOLLOW_47_in_attribute1575); 
            char_literal191_tree = 
            (Object)adaptor.create(char_literal191)
            ;
            adaptor.addChild(root_0, char_literal191_tree);


            pushFollow(FOLLOW_attribute_internal_in_attribute1577);
            attribute_internal192=attribute_internal();

            state._fsp--;

            adaptor.addChild(root_0, attribute_internal192.getTree());

            char_literal193=(Token)match(input,48,FOLLOW_48_in_attribute1579); 
            char_literal193_tree = 
            (Object)adaptor.create(char_literal193)
            ;
            adaptor.addChild(root_0, char_literal193_tree);


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
    // $ANTLR end "attribute"


    public static class attribute_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:297:1: attribute_internal : attribute_internal1 ;
    public final ObjchParser.attribute_internal_return attribute_internal() throws RecognitionException {
        ObjchParser.attribute_internal_return retval = new ObjchParser.attribute_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.attribute_internal1_return attribute_internal1194 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:298:2: ( attribute_internal1 )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:298:4: attribute_internal1
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_attribute_internal1_in_attribute_internal1590);
            attribute_internal1194=attribute_internal1();

            state._fsp--;

            adaptor.addChild(root_0, attribute_internal1194.getTree());

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
    // $ANTLR end "attribute_internal"


    public static class attribute_internal1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_internal1"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:1: attribute_internal1 : '(' 'format' '(' ( format_item ( ',' format_item )* )? ')' ')' ;
    public final ObjchParser.attribute_internal1_return attribute_internal1() throws RecognitionException {
        ObjchParser.attribute_internal1_return retval = new ObjchParser.attribute_internal1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal195=null;
        Token string_literal196=null;
        Token char_literal197=null;
        Token char_literal199=null;
        Token char_literal201=null;
        Token char_literal202=null;
        ObjchParser.format_item_return format_item198 =null;

        ObjchParser.format_item_return format_item200 =null;


        Object char_literal195_tree=null;
        Object string_literal196_tree=null;
        Object char_literal197_tree=null;
        Object char_literal199_tree=null;
        Object char_literal201_tree=null;
        Object char_literal202_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:301:2: ( '(' 'format' '(' ( format_item ( ',' format_item )* )? ')' ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:301:4: '(' 'format' '(' ( format_item ( ',' format_item )* )? ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal195=(Token)match(input,47,FOLLOW_47_in_attribute_internal11600); 
            char_literal195_tree = 
            (Object)adaptor.create(char_literal195)
            ;
            adaptor.addChild(root_0, char_literal195_tree);


            string_literal196=(Token)match(input,84,FOLLOW_84_in_attribute_internal11602); 
            string_literal196_tree = 
            (Object)adaptor.create(string_literal196)
            ;
            adaptor.addChild(root_0, string_literal196_tree);


            char_literal197=(Token)match(input,47,FOLLOW_47_in_attribute_internal11604); 
            char_literal197_tree = 
            (Object)adaptor.create(char_literal197)
            ;
            adaptor.addChild(root_0, char_literal197_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:301:21: ( format_item ( ',' format_item )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ID||LA70_0==NUMBER) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:301:23: format_item ( ',' format_item )*
                    {
                    pushFollow(FOLLOW_format_item_in_attribute_internal11607);
                    format_item198=format_item();

                    state._fsp--;

                    adaptor.addChild(root_0, format_item198.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:301:35: ( ',' format_item )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==51) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:301:36: ',' format_item
                    	    {
                    	    char_literal199=(Token)match(input,51,FOLLOW_51_in_attribute_internal11610); 
                    	    char_literal199_tree = 
                    	    (Object)adaptor.create(char_literal199)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal199_tree);


                    	    pushFollow(FOLLOW_format_item_in_attribute_internal11612);
                    	    format_item200=format_item();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, format_item200.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal201=(Token)match(input,48,FOLLOW_48_in_attribute_internal11618); 
            char_literal201_tree = 
            (Object)adaptor.create(char_literal201)
            ;
            adaptor.addChild(root_0, char_literal201_tree);


            char_literal202=(Token)match(input,48,FOLLOW_48_in_attribute_internal11620); 
            char_literal202_tree = 
            (Object)adaptor.create(char_literal202)
            ;
            adaptor.addChild(root_0, char_literal202_tree);


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
    // $ANTLR end "attribute_internal1"


    public static class format_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "format_item"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:303:2: format_item : ( ID | NUMBER );
    public final ObjchParser.format_item_return format_item() throws RecognitionException {
        ObjchParser.format_item_return retval = new ObjchParser.format_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set203=null;

        Object set203_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:304:2: ( ID | NUMBER )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set203=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==NUMBER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set203)
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
    // $ANTLR end "format_item"


    public static class classical_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classical_param"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:1: classical_param : ( ( 'struct' )? type_declaration ID ( '[' ( NUMBER )? ']' )* | '...' );
    public final ObjchParser.classical_param_return classical_param() throws RecognitionException {
        ObjchParser.classical_param_return retval = new ObjchParser.classical_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal204=null;
        Token ID206=null;
        Token char_literal207=null;
        Token NUMBER208=null;
        Token char_literal209=null;
        Token string_literal210=null;
        ObjchParser.type_declaration_return type_declaration205 =null;


        Object string_literal204_tree=null;
        Object ID206_tree=null;
        Object char_literal207_tree=null;
        Object NUMBER208_tree=null;
        Object char_literal209_tree=null;
        Object string_literal210_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:307:2: ( ( 'struct' )? type_declaration ID ( '[' ( NUMBER )? ']' )* | '...' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==ID||LA74_0==79||LA74_0==82||(LA74_0 >= 86 && LA74_0 <= 87)||(LA74_0 >= 94 && LA74_0 <= 95)||LA74_0==97) ) {
                alt74=1;
            }
            else if ( (LA74_0==53) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }
            switch (alt74) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:307:4: ( 'struct' )? type_declaration ID ( '[' ( NUMBER )? ']' )*
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:307:4: ( 'struct' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==94) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:307:4: 'struct'
                            {
                            string_literal204=(Token)match(input,94,FOLLOW_94_in_classical_param1645); 
                            string_literal204_tree = 
                            (Object)adaptor.create(string_literal204)
                            ;
                            adaptor.addChild(root_0, string_literal204_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_type_declaration_in_classical_param1648);
                    type_declaration205=type_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, type_declaration205.getTree());

                    ID206=(Token)match(input,ID,FOLLOW_ID_in_classical_param1650); 
                    ID206_tree = 
                    (Object)adaptor.create(ID206)
                    ;
                    adaptor.addChild(root_0, ID206_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:307:34: ( '[' ( NUMBER )? ']' )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==72) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:307:35: '[' ( NUMBER )? ']'
                    	    {
                    	    char_literal207=(Token)match(input,72,FOLLOW_72_in_classical_param1653); 
                    	    char_literal207_tree = 
                    	    (Object)adaptor.create(char_literal207)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal207_tree);


                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:307:39: ( NUMBER )?
                    	    int alt72=2;
                    	    int LA72_0 = input.LA(1);

                    	    if ( (LA72_0==NUMBER) ) {
                    	        alt72=1;
                    	    }
                    	    switch (alt72) {
                    	        case 1 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:307:39: NUMBER
                    	            {
                    	            NUMBER208=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_classical_param1655); 
                    	            NUMBER208_tree = 
                    	            (Object)adaptor.create(NUMBER208)
                    	            ;
                    	            adaptor.addChild(root_0, NUMBER208_tree);


                    	            }
                    	            break;

                    	    }


                    	    char_literal209=(Token)match(input,73,FOLLOW_73_in_classical_param1658); 
                    	    char_literal209_tree = 
                    	    (Object)adaptor.create(char_literal209)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal209_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:308:4: '...'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal210=(Token)match(input,53,FOLLOW_53_in_classical_param1665); 
                    string_literal210_tree = 
                    (Object)adaptor.create(string_literal210)
                    ;
                    adaptor.addChild(root_0, string_literal210_tree);


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
    // $ANTLR end "classical_param"


    public static class type_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:310:1: type_declaration : type_declaration_internal -> ^( TYPE type_declaration_internal ) ;
    public final ObjchParser.type_declaration_return type_declaration() throws RecognitionException {
        ObjchParser.type_declaration_return retval = new ObjchParser.type_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.type_declaration_internal_return type_declaration_internal211 =null;


        RewriteRuleSubtreeStream stream_type_declaration_internal=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_internal");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:2: ( type_declaration_internal -> ^( TYPE type_declaration_internal ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:4: type_declaration_internal
            {
            pushFollow(FOLLOW_type_declaration_internal_in_type_declaration1676);
            type_declaration_internal211=type_declaration_internal();

            state._fsp--;

            stream_type_declaration_internal.add(type_declaration_internal211.getTree());

            // AST REWRITE
            // elements: type_declaration_internal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 311:30: -> ^( TYPE type_declaration_internal )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:33: ^( TYPE type_declaration_internal )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, stream_type_declaration_internal.nextTree());

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
    // $ANTLR end "type_declaration"


    public static class type_declaration_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_declaration_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:314:1: type_declaration_internal : ( 'const' )? ( 'enum' )? ( 'typedef' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )* ;
    public final ObjchParser.type_declaration_internal_return type_declaration_internal() throws RecognitionException {
        ObjchParser.type_declaration_internal_return retval = new ObjchParser.type_declaration_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal212=null;
        Token string_literal213=null;
        Token string_literal214=null;
        Token string_literal215=null;
        Token string_literal218=null;
        Token char_literal220=null;
        ObjchParser.type_dec_return type_dec216 =null;

        ObjchParser.type_dec_return type_dec217 =null;

        ObjchParser.generic_return generic219 =null;


        Object string_literal212_tree=null;
        Object string_literal213_tree=null;
        Object string_literal214_tree=null;
        Object string_literal215_tree=null;
        Object string_literal218_tree=null;
        Object char_literal220_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:2: ( ( 'const' )? ( 'enum' )? ( 'typedef' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:4: ( 'const' )? ( 'enum' )? ( 'typedef' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:4: ( 'const' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==79) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:4: 'const'
                    {
                    string_literal212=(Token)match(input,79,FOLLOW_79_in_type_declaration_internal1694); 
                    string_literal212_tree = 
                    (Object)adaptor.create(string_literal212)
                    ;
                    adaptor.addChild(root_0, string_literal212_tree);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:13: ( 'enum' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==82) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:13: 'enum'
                    {
                    string_literal213=(Token)match(input,82,FOLLOW_82_in_type_declaration_internal1697); 
                    string_literal213_tree = 
                    (Object)adaptor.create(string_literal213)
                    ;
                    adaptor.addChild(root_0, string_literal213_tree);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:21: ( 'typedef' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==95) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:21: 'typedef'
                    {
                    string_literal214=(Token)match(input,95,FOLLOW_95_in_type_declaration_internal1700); 
                    string_literal214_tree = 
                    (Object)adaptor.create(string_literal214)
                    ;
                    adaptor.addChild(root_0, string_literal214_tree);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:32: ( ( 'unsigned' ( type_dec )? ) | type_dec )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==97) ) {
                alt79=1;
            }
            else if ( (LA79_0==ID||(LA79_0 >= 86 && LA79_0 <= 87)) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:33: ( 'unsigned' ( type_dec )? )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:33: ( 'unsigned' ( type_dec )? )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:34: 'unsigned' ( type_dec )?
                    {
                    string_literal215=(Token)match(input,97,FOLLOW_97_in_type_declaration_internal1705); 
                    string_literal215_tree = 
                    (Object)adaptor.create(string_literal215)
                    ;
                    adaptor.addChild(root_0, string_literal215_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:45: ( type_dec )?
                    int alt78=2;
                    alt78 = dfa78.predict(input);
                    switch (alt78) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:45: type_dec
                            {
                            pushFollow(FOLLOW_type_dec_in_type_declaration_internal1707);
                            type_dec216=type_dec();

                            state._fsp--;

                            adaptor.addChild(root_0, type_dec216.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:58: type_dec
                    {
                    pushFollow(FOLLOW_type_dec_in_type_declaration_internal1713);
                    type_dec217=type_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, type_dec217.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:68: ( 'const' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==79) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:68: 'const'
                    {
                    string_literal218=(Token)match(input,79,FOLLOW_79_in_type_declaration_internal1716); 
                    string_literal218_tree = 
                    (Object)adaptor.create(string_literal218)
                    ;
                    adaptor.addChild(root_0, string_literal218_tree);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:77: ( generic )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==56) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:77: generic
                    {
                    pushFollow(FOLLOW_generic_in_type_declaration_internal1719);
                    generic219=generic();

                    state._fsp--;

                    adaptor.addChild(root_0, generic219.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:86: ( '*' )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==49) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:86: '*'
            	    {
            	    char_literal220=(Token)match(input,49,FOLLOW_49_in_type_declaration_internal1722); 
            	    char_literal220_tree = 
            	    (Object)adaptor.create(char_literal220)
            	    ;
            	    adaptor.addChild(root_0, char_literal220_tree);


            	    }
            	    break;

            	default :
            	    break loop82;
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
    // $ANTLR end "type_declaration_internal"


    public static class type_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_dec"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:317:1: type_dec : type_dec_internal ( '[' ']' )* ;
    public final ObjchParser.type_dec_return type_dec() throws RecognitionException {
        ObjchParser.type_dec_return retval = new ObjchParser.type_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal222=null;
        Token char_literal223=null;
        ObjchParser.type_dec_internal_return type_dec_internal221 =null;


        Object char_literal222_tree=null;
        Object char_literal223_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:317:9: ( type_dec_internal ( '[' ']' )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:317:11: type_dec_internal ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_dec_internal_in_type_dec1731);
            type_dec_internal221=type_dec_internal();

            state._fsp--;

            adaptor.addChild(root_0, type_dec_internal221.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:317:29: ( '[' ']' )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==72) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:317:30: '[' ']'
            	    {
            	    char_literal222=(Token)match(input,72,FOLLOW_72_in_type_dec1734); 
            	    char_literal222_tree = 
            	    (Object)adaptor.create(char_literal222)
            	    ;
            	    adaptor.addChild(root_0, char_literal222_tree);


            	    char_literal223=(Token)match(input,73,FOLLOW_73_in_type_dec1736); 
            	    char_literal223_tree = 
            	    (Object)adaptor.create(char_literal223)
            	    ;
            	    adaptor.addChild(root_0, char_literal223_tree);


            	    }
            	    break;

            	default :
            	    break loop83;
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
    // $ANTLR end "type_dec"


    public static class type_dec_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_dec_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:320:1: type_dec_internal : ( knownTypes | ID );
    public final ObjchParser.type_dec_internal_return type_dec_internal() throws RecognitionException {
        ObjchParser.type_dec_internal_return retval = new ObjchParser.type_dec_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID225=null;
        ObjchParser.knownTypes_return knownTypes224 =null;


        Object ID225_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:321:2: ( knownTypes | ID )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0 >= 86 && LA84_0 <= 87)) ) {
                alt84=1;
            }
            else if ( (LA84_0==ID) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:321:4: knownTypes
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_knownTypes_in_type_dec_internal1751);
                    knownTypes224=knownTypes();

                    state._fsp--;

                    adaptor.addChild(root_0, knownTypes224.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:322:5: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID225=(Token)match(input,ID,FOLLOW_ID_in_type_dec_internal1758); 
                    ID225_tree = 
                    (Object)adaptor.create(ID225)
                    ;
                    adaptor.addChild(root_0, ID225_tree);


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
    // $ANTLR end "type_dec_internal"


    public static class knownTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "knownTypes"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:1: knownTypes : ( 'int' | ( 'long' )+ ( 'int' )? );
    public final ObjchParser.knownTypes_return knownTypes() throws RecognitionException {
        ObjchParser.knownTypes_return retval = new ObjchParser.knownTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal226=null;
        Token string_literal227=null;
        Token string_literal228=null;

        Object string_literal226_tree=null;
        Object string_literal227_tree=null;
        Object string_literal228_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:326:2: ( 'int' | ( 'long' )+ ( 'int' )? )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==86) ) {
                alt87=1;
            }
            else if ( (LA87_0==87) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:326:4: 'int'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal226=(Token)match(input,86,FOLLOW_86_in_knownTypes1769); 
                    string_literal226_tree = 
                    (Object)adaptor.create(string_literal226)
                    ;
                    adaptor.addChild(root_0, string_literal226_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:4: ( 'long' )+ ( 'int' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:4: ( 'long' )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==87) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:4: 'long'
                    	    {
                    	    string_literal227=(Token)match(input,87,FOLLOW_87_in_knownTypes1774); 
                    	    string_literal227_tree = 
                    	    (Object)adaptor.create(string_literal227)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal227_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt85 >= 1 ) break loop85;
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:12: ( 'int' )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==86) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:12: 'int'
                            {
                            string_literal228=(Token)match(input,86,FOLLOW_86_in_knownTypes1777); 
                            string_literal228_tree = 
                            (Object)adaptor.create(string_literal228)
                            ;
                            adaptor.addChild(root_0, string_literal228_tree);


                            }
                            break;

                    }


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
    // $ANTLR end "knownTypes"


    public static class field_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:1: field_name : ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) ;
    public final ObjchParser.field_name_return field_name() throws RecognitionException {
        ObjchParser.field_name_return retval = new ObjchParser.field_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID229=null;
        ObjchParser.array_size_return array_size230 =null;

        ObjchParser.field_crap_return field_crap231 =null;


        Object ID229_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_array_size=new RewriteRuleSubtreeStream(adaptor,"rule array_size");
        RewriteRuleSubtreeStream stream_field_crap=new RewriteRuleSubtreeStream(adaptor,"rule field_crap");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:2: ( ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:4: ID ( array_size )? ( field_crap )?
            {
            ID229=(Token)match(input,ID,FOLLOW_ID_in_field_name1790);  
            stream_ID.add(ID229);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:7: ( array_size )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==72) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:7: array_size
                    {
                    pushFollow(FOLLOW_array_size_in_field_name1792);
                    array_size230=array_size();

                    state._fsp--;

                    stream_array_size.add(array_size230.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:19: ( field_crap )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==54) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:20: field_crap
                    {
                    pushFollow(FOLLOW_field_crap_in_field_name1796);
                    field_crap231=field_crap();

                    state._fsp--;

                    stream_field_crap.add(field_crap231.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: array_size, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 331:33: -> ^( FIELD_NAME ID ( array_size )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:36: ^( FIELD_NAME ID ( array_size )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_NAME, "FIELD_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:52: ( array_size )?
                if ( stream_array_size.hasNext() ) {
                    adaptor.addChild(root_1, stream_array_size.nextTree());

                }
                stream_array_size.reset();

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
    // $ANTLR end "field_name"


    public static class array_size_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_size"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:333:1: array_size : '[' ( NUMBER )? ']' ;
    public final ObjchParser.array_size_return array_size() throws RecognitionException {
        ObjchParser.array_size_return retval = new ObjchParser.array_size_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal232=null;
        Token NUMBER233=null;
        Token char_literal234=null;

        Object char_literal232_tree=null;
        Object NUMBER233_tree=null;
        Object char_literal234_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:334:2: ( '[' ( NUMBER )? ']' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:334:4: '[' ( NUMBER )? ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal232=(Token)match(input,72,FOLLOW_72_in_array_size1821); 
            char_literal232_tree = 
            (Object)adaptor.create(char_literal232)
            ;
            adaptor.addChild(root_0, char_literal232_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:334:8: ( NUMBER )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==NUMBER) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:334:8: NUMBER
                    {
                    NUMBER233=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_size1823); 
                    NUMBER233_tree = 
                    (Object)adaptor.create(NUMBER233)
                    ;
                    adaptor.addChild(root_0, NUMBER233_tree);


                    }
                    break;

            }


            char_literal234=(Token)match(input,73,FOLLOW_73_in_array_size1826); 
            char_literal234_tree = 
            (Object)adaptor.create(char_literal234)
            ;
            adaptor.addChild(root_0, char_literal234_tree);


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
    // $ANTLR end "array_size"


    public static class field_crap_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_crap"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:336:1: field_crap : ':' NUMBER ;
    public final ObjchParser.field_crap_return field_crap() throws RecognitionException {
        ObjchParser.field_crap_return retval = new ObjchParser.field_crap_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal235=null;
        Token NUMBER236=null;

        Object char_literal235_tree=null;
        Object NUMBER236_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:337:2: ( ':' NUMBER )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:337:4: ':' NUMBER
            {
            root_0 = (Object)adaptor.nil();


            char_literal235=(Token)match(input,54,FOLLOW_54_in_field_crap1835); 
            char_literal235_tree = 
            (Object)adaptor.create(char_literal235)
            ;
            adaptor.addChild(root_0, char_literal235_tree);


            NUMBER236=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_field_crap1837); 
            NUMBER236_tree = 
            (Object)adaptor.create(NUMBER236)
            ;
            adaptor.addChild(root_0, NUMBER236_tree);


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
    // $ANTLR end "field_crap"


    public static class method_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:339:1: method_declaration : method_modifier_wrapper method_declaration_variants ;
    public final ObjchParser.method_declaration_return method_declaration() throws RecognitionException {
        ObjchParser.method_declaration_return retval = new ObjchParser.method_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_wrapper_return method_modifier_wrapper237 =null;

        ObjchParser.method_declaration_variants_return method_declaration_variants238 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:2: ( method_modifier_wrapper method_declaration_variants )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:4: method_modifier_wrapper method_declaration_variants
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_method_modifier_wrapper_in_method_declaration1847);
            method_modifier_wrapper237=method_modifier_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, method_modifier_wrapper237.getTree());

            pushFollow(FOLLOW_method_declaration_variants_in_method_declaration1849);
            method_declaration_variants238=method_declaration_variants();

            state._fsp--;

            adaptor.addChild(root_0, method_declaration_variants238.getTree());

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
    // $ANTLR end "method_declaration"


    public static class method_modifier_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_modifier_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:342:1: method_modifier_wrapper : method_modifier -> ^( MODIFIER method_modifier ) ;
    public final ObjchParser.method_modifier_wrapper_return method_modifier_wrapper() throws RecognitionException {
        ObjchParser.method_modifier_wrapper_return retval = new ObjchParser.method_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_return method_modifier239 =null;


        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:343:2: ( method_modifier -> ^( MODIFIER method_modifier ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:343:4: method_modifier
            {
            pushFollow(FOLLOW_method_modifier_in_method_modifier_wrapper1859);
            method_modifier239=method_modifier();

            state._fsp--;

            stream_method_modifier.add(method_modifier239.getTree());

            // AST REWRITE
            // elements: method_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 343:20: -> ^( MODIFIER method_modifier )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:343:23: ^( MODIFIER method_modifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_1);

                adaptor.addChild(root_1, stream_method_modifier.nextTree());

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
    // $ANTLR end "method_modifier_wrapper"


    public static class method_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_modifier"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:345:1: method_modifier : ( '+' | '-' );
    public final ObjchParser.method_modifier_return method_modifier() throws RecognitionException {
        ObjchParser.method_modifier_return retval = new ObjchParser.method_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set240=null;

        Object set240_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:2: ( '+' | '-' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set240=(Token)input.LT(1);

            if ( input.LA(1)==50||input.LA(1)==52 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set240)
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
    // $ANTLR end "method_modifier"


    public static class method_declaration_variants_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration_variants"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:348:1: method_declaration_variants : method_declaration_common ;
    public final ObjchParser.method_declaration_variants_return method_declaration_variants() throws RecognitionException {
        ObjchParser.method_declaration_variants_return retval = new ObjchParser.method_declaration_variants_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_declaration_common_return method_declaration_common241 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:2: ( method_declaration_common )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:352:4: method_declaration_common
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_method_declaration_common_in_method_declaration_variants1897);
            method_declaration_common241=method_declaration_common();

            state._fsp--;

            adaptor.addChild(root_0, method_declaration_common241.getTree());

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
    // $ANTLR end "method_declaration_variants"


    public static class method_declaration_common_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration_common"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:354:1: method_declaration_common : ( '(' ( 'struct' )? type_declaration ')' )? method_name ( method_params )? ';' ;
    public final ObjchParser.method_declaration_common_return method_declaration_common() throws RecognitionException {
        ObjchParser.method_declaration_common_return retval = new ObjchParser.method_declaration_common_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal242=null;
        Token string_literal243=null;
        Token char_literal245=null;
        Token char_literal248=null;
        ObjchParser.type_declaration_return type_declaration244 =null;

        ObjchParser.method_name_return method_name246 =null;

        ObjchParser.method_params_return method_params247 =null;


        Object char_literal242_tree=null;
        Object string_literal243_tree=null;
        Object char_literal245_tree=null;
        Object char_literal248_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:355:2: ( ( '(' ( 'struct' )? type_declaration ')' )? method_name ( method_params )? ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:355:4: ( '(' ( 'struct' )? type_declaration ')' )? method_name ( method_params )? ';'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:355:4: ( '(' ( 'struct' )? type_declaration ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==47) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:355:5: '(' ( 'struct' )? type_declaration ')'
                    {
                    char_literal242=(Token)match(input,47,FOLLOW_47_in_method_declaration_common1908); 
                    char_literal242_tree = 
                    (Object)adaptor.create(char_literal242)
                    ;
                    adaptor.addChild(root_0, char_literal242_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:355:9: ( 'struct' )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==94) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:355:9: 'struct'
                            {
                            string_literal243=(Token)match(input,94,FOLLOW_94_in_method_declaration_common1910); 
                            string_literal243_tree = 
                            (Object)adaptor.create(string_literal243)
                            ;
                            adaptor.addChild(root_0, string_literal243_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_type_declaration_in_method_declaration_common1913);
                    type_declaration244=type_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, type_declaration244.getTree());

                    char_literal245=(Token)match(input,48,FOLLOW_48_in_method_declaration_common1915); 
                    char_literal245_tree = 
                    (Object)adaptor.create(char_literal245)
                    ;
                    adaptor.addChild(root_0, char_literal245_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_method_name_in_method_declaration_common1919);
            method_name246=method_name();

            state._fsp--;

            adaptor.addChild(root_0, method_name246.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:355:54: ( method_params )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==ID||LA93_0==51||LA93_0==54) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:355:54: method_params
                    {
                    pushFollow(FOLLOW_method_params_in_method_declaration_common1921);
                    method_params247=method_params();

                    state._fsp--;

                    adaptor.addChild(root_0, method_params247.getTree());

                    }
                    break;

            }


            char_literal248=(Token)match(input,55,FOLLOW_55_in_method_declaration_common1924); 
            char_literal248_tree = 
            (Object)adaptor.create(char_literal248)
            ;
            adaptor.addChild(root_0, char_literal248_tree);


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
    // $ANTLR end "method_declaration_common"


    public static class method_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:1: method_name : ( ID -> ^( METHOD_NAME ID ) | property_prefix_param -> ^( METHOD_NAME property_prefix_param ) );
    public final ObjchParser.method_name_return method_name() throws RecognitionException {
        ObjchParser.method_name_return retval = new ObjchParser.method_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID249=null;
        ObjchParser.property_prefix_param_return property_prefix_param250 =null;


        Object ID249_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_property_prefix_param=new RewriteRuleSubtreeStream(adaptor,"rule property_prefix_param");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:395:2: ( ID -> ^( METHOD_NAME ID ) | property_prefix_param -> ^( METHOD_NAME property_prefix_param ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ID) ) {
                alt94=1;
            }
            else if ( (LA94_0==78||LA94_0==80||(LA94_0 >= 88 && LA94_0 <= 91)||LA94_0==93) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }
            switch (alt94) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:395:4: ID
                    {
                    ID249=(Token)match(input,ID,FOLLOW_ID_in_method_name1938);  
                    stream_ID.add(ID249);


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
                    // 395:7: -> ^( METHOD_NAME ID )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:395:10: ^( METHOD_NAME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD_NAME, "METHOD_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:4: property_prefix_param
                    {
                    pushFollow(FOLLOW_property_prefix_param_in_method_name1952);
                    property_prefix_param250=property_prefix_param();

                    state._fsp--;

                    stream_property_prefix_param.add(property_prefix_param250.getTree());

                    // AST REWRITE
                    // elements: property_prefix_param
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 397:26: -> ^( METHOD_NAME property_prefix_param )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:29: ^( METHOD_NAME property_prefix_param )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD_NAME, "METHOD_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_property_prefix_param.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "method_name"


    public static class method_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_params"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:399:1: method_params : ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) ;
    public final ObjchParser.method_params_return method_params() throws RecognitionException {
        ObjchParser.method_params_return retval = new ObjchParser.method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_param_return method_param251 =null;


        RewriteRuleSubtreeStream stream_method_param=new RewriteRuleSubtreeStream(adaptor,"rule method_param");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:400:2: ( ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:400:4: ( method_param )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:400:4: ( method_param )+
            int cnt95=0;
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==ID||LA95_0==51||LA95_0==54) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:400:4: method_param
            	    {
            	    pushFollow(FOLLOW_method_param_in_method_params1971);
            	    method_param251=method_param();

            	    state._fsp--;

            	    stream_method_param.add(method_param251.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
            } while (true);


            // AST REWRITE
            // elements: method_param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 400:18: -> ^( METHOD_PARAMS ( method_param )+ )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:400:21: ^( METHOD_PARAMS ( method_param )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD_PARAMS, "METHOD_PARAMS")
                , root_1);

                if ( !(stream_method_param.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_method_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_param.nextTree());

                }
                stream_method_param.reset();

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
    // $ANTLR end "method_params"


    public static class method_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_param"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:402:1: method_param : ( ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) | ',' '...' 'NS_REQUIRES_NIL_TERMINATION' );
    public final ObjchParser.method_param_return method_param() throws RecognitionException {
        ObjchParser.method_param_return retval = new ObjchParser.method_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal253=null;
        Token char_literal254=null;
        Token char_literal256=null;
        Token char_literal258=null;
        Token string_literal259=null;
        Token string_literal260=null;
        ObjchParser.prefix_return prefix252 =null;

        ObjchParser.type_declaration_return type_declaration255 =null;

        ObjchParser.param_name_return param_name257 =null;


        Object char_literal253_tree=null;
        Object char_literal254_tree=null;
        Object char_literal256_tree=null;
        Object char_literal258_tree=null;
        Object string_literal259_tree=null;
        Object string_literal260_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_prefix=new RewriteRuleSubtreeStream(adaptor,"rule prefix");
        RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");
        RewriteRuleSubtreeStream stream_param_name=new RewriteRuleSubtreeStream(adaptor,"rule param_name");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:2: ( ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) | ',' '...' 'NS_REQUIRES_NIL_TERMINATION' )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==ID||LA98_0==54) ) {
                alt98=1;
            }
            else if ( (LA98_0==51) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }
            switch (alt98) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:4: ( prefix )? ':' ( '(' type_declaration ')' )? param_name
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:4: ( prefix )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==ID) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:4: prefix
                            {
                            pushFollow(FOLLOW_prefix_in_method_param1990);
                            prefix252=prefix();

                            state._fsp--;

                            stream_prefix.add(prefix252.getTree());

                            }
                            break;

                    }


                    char_literal253=(Token)match(input,54,FOLLOW_54_in_method_param1993);  
                    stream_54.add(char_literal253);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:16: ( '(' type_declaration ')' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==47) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:17: '(' type_declaration ')'
                            {
                            char_literal254=(Token)match(input,47,FOLLOW_47_in_method_param1996);  
                            stream_47.add(char_literal254);


                            pushFollow(FOLLOW_type_declaration_in_method_param1998);
                            type_declaration255=type_declaration();

                            state._fsp--;

                            stream_type_declaration.add(type_declaration255.getTree());

                            char_literal256=(Token)match(input,48,FOLLOW_48_in_method_param2000);  
                            stream_48.add(char_literal256);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_param_name_in_method_param2004);
                    param_name257=param_name();

                    state._fsp--;

                    stream_param_name.add(param_name257.getTree());

                    // AST REWRITE
                    // elements: 47, 54, prefix, param_name, 48, type_declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 403:55: -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:58: ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD_PARAM, "METHOD_PARAM")
                        , root_1);

                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:73: ( prefix )?
                        if ( stream_prefix.hasNext() ) {
                            adaptor.addChild(root_1, stream_prefix.nextTree());

                        }
                        stream_prefix.reset();

                        adaptor.addChild(root_1, 
                        stream_54.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_47.nextNode()
                        );

                        adaptor.addChild(root_1, stream_type_declaration.nextTree());

                        adaptor.addChild(root_1, 
                        stream_48.nextNode()
                        );

                        adaptor.addChild(root_1, stream_param_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:404:4: ',' '...' 'NS_REQUIRES_NIL_TERMINATION'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal258=(Token)match(input,51,FOLLOW_51_in_method_param2028); 
                    char_literal258_tree = 
                    (Object)adaptor.create(char_literal258)
                    ;
                    adaptor.addChild(root_0, char_literal258_tree);


                    string_literal259=(Token)match(input,53,FOLLOW_53_in_method_param2030); 
                    string_literal259_tree = 
                    (Object)adaptor.create(string_literal259)
                    ;
                    adaptor.addChild(root_0, string_literal259_tree);


                    string_literal260=(Token)match(input,71,FOLLOW_71_in_method_param2032); 
                    string_literal260_tree = 
                    (Object)adaptor.create(string_literal260)
                    ;
                    adaptor.addChild(root_0, string_literal260_tree);


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
    // $ANTLR end "method_param"


    public static class param_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:406:1: param_name : ( ID -> ^( PARAM_NAME ID ) | 'format' -> ^( PARAM_NAME 'format' ) );
    public final ObjchParser.param_name_return param_name() throws RecognitionException {
        ObjchParser.param_name_return retval = new ObjchParser.param_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID261=null;
        Token string_literal262=null;

        Object ID261_tree=null;
        Object string_literal262_tree=null;
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:407:2: ( ID -> ^( PARAM_NAME ID ) | 'format' -> ^( PARAM_NAME 'format' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==ID) ) {
                alt99=1;
            }
            else if ( (LA99_0==84) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }
            switch (alt99) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:407:4: ID
                    {
                    ID261=(Token)match(input,ID,FOLLOW_ID_in_param_name2043);  
                    stream_ID.add(ID261);


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
                    // 407:7: -> ^( PARAM_NAME ID )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:407:10: ^( PARAM_NAME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAM_NAME, "PARAM_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:408:4: 'format'
                    {
                    string_literal262=(Token)match(input,84,FOLLOW_84_in_param_name2056);  
                    stream_84.add(string_literal262);


                    // AST REWRITE
                    // elements: 84
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 408:13: -> ^( PARAM_NAME 'format' )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:408:16: ^( PARAM_NAME 'format' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAM_NAME, "PARAM_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_84.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "param_name"


    public static class prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefix"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:410:1: prefix : ID -> ^( PARAM_PREFIX ID ) ;
    public final ObjchParser.prefix_return prefix() throws RecognitionException {
        ObjchParser.prefix_return retval = new ObjchParser.prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID263=null;

        Object ID263_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:410:8: ( ID -> ^( PARAM_PREFIX ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:410:10: ID
            {
            ID263=(Token)match(input,ID,FOLLOW_ID_in_prefix2073);  
            stream_ID.add(ID263);


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
            // 410:13: -> ^( PARAM_PREFIX ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:410:16: ^( PARAM_PREFIX ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAM_PREFIX, "PARAM_PREFIX")
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
    // $ANTLR end "prefix"


    public static class extern_declatation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extern_declatation"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:412:1: extern_declatation : 'extern' field_declaration ;
    public final ObjchParser.extern_declatation_return extern_declatation() throws RecognitionException {
        ObjchParser.extern_declatation_return retval = new ObjchParser.extern_declatation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal264=null;
        ObjchParser.field_declaration_return field_declaration265 =null;


        Object string_literal264_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:413:2: ( 'extern' field_declaration )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:413:4: 'extern' field_declaration
            {
            root_0 = (Object)adaptor.nil();


            string_literal264=(Token)match(input,83,FOLLOW_83_in_extern_declatation2090); 
            string_literal264_tree = 
            (Object)adaptor.create(string_literal264)
            ;
            adaptor.addChild(root_0, string_literal264_tree);


            pushFollow(FOLLOW_field_declaration_in_extern_declatation2092);
            field_declaration265=field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, field_declaration265.getTree());

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
    // $ANTLR end "extern_declatation"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA2_eotS =
        "\u0086\uffff";
    static final String DFA2_eofS =
        "\27\uffff\1\26\13\uffff\1\26\1\137\141\uffff";
    static final String DFA2_minS =
        "\1\16\1\uffff\2\16\23\uffff\1\16\5\uffff\1\16\5\uffff\3\16\17\uffff"+
        "\1\16\120\uffff";
    static final String DFA2_maxS =
        "\1\141\1\uffff\1\141\1\142\23\uffff\1\141\5\uffff\1\142\5\uffff"+
        "\2\141\1\61\17\uffff\1\141\120\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\13\uffff\1\11\1\uffff"+
        "\1\2\7\uffff\1\3\46\uffff\2\2\26\uffff\1\2\1\uffff\1\2\26\uffff"+
        "\1\2\1\uffff\1\2\2\uffff\2\2\5\uffff\1\2\3\uffff";
    static final String DFA2_specialS =
        "\u0086\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\43\uffff\1\10\1\uffff\1\10\10\uffff\1\1\1\uffff\1\5\1"+
            "\10\1\uffff\1\10\1\uffff\1\4\1\uffff\1\10\3\uffff\1\24\1\uffff"+
            "\1\24\1\10\1\uffff\1\10\2\uffff\1\3\1\6\1\uffff\3\10\4\uffff"+
            "\1\10\1\uffff\1\7\1\2\1\uffff\1\10",
            "",
            "\1\27\103\uffff\1\26\3\uffff\2\10\6\uffff\1\26\1\uffff\1\26"+
            "\1\10",
            "\1\35\107\uffff\2\10\7\uffff\1\10\1\uffff\1\10\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\40\uffff\1\45\1\uffff\1\43\1\26\1\uffff\1\26\2\uffff"+
            "\1\26\1\10\4\uffff\1\26\1\uffff\2\26\1\uffff\1\26\1\uffff\1"+
            "\26\1\uffff\1\26\1\uffff\1\10\1\uffff\1\26\1\uffff\2\26\1\uffff"+
            "\1\65\2\uffff\2\26\1\uffff\3\26\4\uffff\1\26\1\uffff\2\26\1"+
            "\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "\1\10\40\uffff\1\10\1\uffff\1\10\6\uffff\1\10\17\uffff\1\10"+
            "\6\uffff\1\10\22\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "\1\105\40\uffff\1\106\1\uffff\1\135\1\26\1\uffff\1\26\2\uffff"+
            "\1\26\5\uffff\1\26\1\uffff\2\26\1\uffff\1\26\1\uffff\1\26\1"+
            "\uffff\1\26\3\uffff\1\26\1\uffff\2\26\1\uffff\1\26\2\uffff\2"+
            "\26\1\uffff\3\26\4\uffff\1\26\1\uffff\2\26\1\uffff\1\26",
            "\1\137\40\uffff\1\170\1\uffff\1\26\1\137\1\10\1\137\1\uffff"+
            "\1\10\2\137\4\uffff\1\137\1\uffff\2\137\1\uffff\1\137\1\uffff"+
            "\1\137\1\uffff\1\137\1\uffff\1\166\1\uffff\1\137\1\uffff\2\137"+
            "\1\uffff\1\137\2\uffff\2\137\1\uffff\3\137\4\uffff\1\137\1\uffff"+
            "\2\137\1\uffff\1\137",
            "\1\174\42\uffff\1\173",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0082\40\uffff\1\10\1\uffff\1\10\6\uffff\1\10\31\uffff\1"+
            "\137\3\uffff\2\137\7\uffff\1\137\1\uffff\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "59:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct_wrapper | declarations | garbage );";
        }
    }
    static final String DFA12_eotS =
        "\u0097\uffff";
    static final String DFA12_eofS =
        "\1\3\1\32\27\uffff\1\32\61\uffff\1\32\113\uffff";
    static final String DFA12_minS =
        "\2\16\27\uffff\1\16\17\uffff\1\16\3\uffff\1\16\31\uffff\1\16\3\uffff"+
        "\1\16\6\uffff\1\16\3\uffff\1\33\4\uffff\1\16\73\uffff";
    static final String DFA12_maxS =
        "\2\141\27\uffff\1\141\17\uffff\1\141\3\uffff\1\117\31\uffff\1\117"+
        "\3\uffff\1\141\6\uffff\1\117\3\uffff\1\111\4\uffff\1\141\73\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\26\uffff\1\1\104\uffff\1\1\4\uffff\1\1\26\uffff"+
        "\1\1\3\uffff\1\1\1\uffff\1\1\4\uffff\1\1\3\uffff\1\1\2\uffff\1\1"+
        "\11\uffff";
    static final String DFA12_specialS =
        "\u0097\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\40\uffff\1\2\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\5\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\3\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\1\3\2\uffff\2\3\1\uffff\3\3\4\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\1\3",
            "\1\55\40\uffff\1\3\1\uffff\1\31\1\32\1\uffff\1\32\2\uffff\1"+
            "\32\1\3\4\uffff\1\32\1\uffff\2\32\1\uffff\1\32\1\uffff\1\32"+
            "\1\uffff\1\32\1\uffff\1\3\1\uffff\1\32\1\uffff\2\32\1\uffff"+
            "\1\51\2\uffff\2\32\1\uffff\3\32\4\uffff\1\32\1\uffff\2\32\1"+
            "\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\40\uffff\1\3\1\uffff\1\113\1\32\1\uffff\1\32\2\uffff"+
            "\1\32\5\uffff\1\32\1\uffff\2\32\1\uffff\1\32\1\uffff\1\32\1"+
            "\uffff\1\32\3\uffff\1\32\1\uffff\2\32\1\uffff\1\32\2\uffff\2"+
            "\32\1\uffff\3\32\4\uffff\1\32\1\uffff\2\32\1\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122\40\uffff\1\3\1\uffff\1\3\6\uffff\1\3\31\uffff\1\32\3"+
            "\uffff\2\32\7\uffff\1\32\1\uffff\1\32",
            "",
            "",
            "",
            "\1\32\40\uffff\1\133\1\uffff\1\32\1\uffff\1\3\2\uffff\2\3\1"+
            "\32\17\uffff\1\126\6\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\40\uffff\1\144\1\uffff\1\32\1\uffff\1\3\2\uffff\2\3\1"+
            "\32\17\uffff\1\137\6\uffff\1\32",
            "",
            "",
            "",
            "\1\173\40\uffff\1\3\1\uffff\1\177\1\32\1\uffff\1\32\2\uffff"+
            "\1\32\5\uffff\1\32\1\uffff\2\32\1\uffff\1\32\1\uffff\1\32\1"+
            "\uffff\1\32\3\uffff\1\32\1\uffff\2\32\1\uffff\1\32\2\uffff\2"+
            "\32\1\uffff\3\32\4\uffff\1\32\1\uffff\2\32\1\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\40\uffff\1\u0086\1\uffff\1\32\1\uffff\1\3\2\uffff\2\3"+
            "\1\32\17\uffff\1\u0081\6\uffff\1\32",
            "",
            "",
            "",
            "\1\3\55\uffff\1\u008a",
            "",
            "",
            "",
            "",
            "\1\u008d\41\uffff\1\3\1\32\3\uffff\1\3\31\uffff\1\3\2\uffff"+
            "\1\3\3\uffff\2\3\6\uffff\2\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "125:31: ( typedef_name | func_pointer )?";
        }
    }
    static final String DFA55_eotS =
        "\u086e\uffff";
    static final String DFA55_eofS =
        "\u086e\uffff";
    static final String DFA55_minS =
        "\13\16\4\uffff\56\16\1\111\3\16\1\57\2\16\1\111\3\16\1\57\2\16\1"+
        "\111\3\16\1\57\46\16\1\111\3\16\1\57\2\16\1\111\3\16\1\57\2\16\1"+
        "\111\3\16\1\57\36\16\1\111\3\16\1\57\2\16\1\111\3\16\1\57\2\16\1"+
        "\111\3\16\1\57\27\16\1\111\3\16\1\57\2\16\1\111\3\16\1\57\2\16\1"+
        "\111\3\16\1\57\21\16\1\111\3\16\1\57\2\16\1\111\3\16\1\57\2\16\1"+
        "\111\3\16\1\57\14\16\1\111\3\16\1\57\2\16\1\111\3\16\1\57\2\16\1"+
        "\111\3\16\1\57\10\16\1\111\3\16\1\57\2\16\1\111\3\16\1\57\2\16\1"+
        "\111\3\16\1\57\1\16\1\111\3\16\1\57\2\16\1\111\3\16\1\57\2\16\1"+
        "\33\3\16\1\57\1\16\1\33\1\16\1\uffff\2\16\1\57\5\16\3\61\1\57\3"+
        "\16\1\60\3\16\1\57\5\16\3\61\1\57\2\16\2\33\2\16\1\uffff\1\16\1"+
        "\60\1\111\3\16\1\57\4\16\1\57\5\16\3\61\1\57\2\16\2\33\2\16\1\uffff"+
        "\1\16\1\60\1\16\1\111\3\16\1\57\5\16\1\57\5\16\3\61\1\57\2\16\2"+
        "\33\2\16\1\uffff\1\16\1\60\u06b4\uffff";
    static final String DFA55_maxS =
        "\1\144\6\141\1\127\1\117\1\127\1\117\4\uffff\5\141\1\127\1\117\1"+
        "\127\1\117\4\141\1\127\1\117\1\127\1\117\3\141\1\127\1\117\1\127"+
        "\1\117\2\141\1\127\1\117\1\127\1\117\1\141\1\127\1\117\1\127\1\117"+
        "\1\127\1\117\1\127\2\117\1\127\1\117\1\70\1\141\2\61\1\111\1\70"+
        "\1\141\1\61\1\110\1\61\1\117\1\111\1\70\1\141\1\61\1\110\1\61\1"+
        "\127\1\111\1\70\1\141\1\61\1\110\1\61\4\141\1\127\1\117\1\127\1"+
        "\117\3\141\1\127\1\117\1\127\1\117\2\141\1\127\1\117\1\127\1\117"+
        "\1\141\1\127\1\117\1\127\1\117\1\127\1\117\1\127\2\117\1\127\1\117"+
        "\1\70\1\141\2\61\1\111\1\70\1\141\1\61\1\110\1\61\1\117\1\111\1"+
        "\70\1\141\1\61\1\110\1\61\1\127\1\111\1\70\1\141\1\61\1\110\1\61"+
        "\3\141\1\127\1\117\1\127\1\117\2\141\1\127\1\117\1\127\1\117\1\141"+
        "\1\127\1\117\1\127\1\117\1\127\1\117\1\127\2\117\1\127\1\117\1\70"+
        "\1\141\2\61\1\111\1\70\1\141\1\61\1\110\1\61\1\117\1\111\1\70\1"+
        "\141\1\61\1\110\1\61\1\127\1\111\1\70\1\141\1\61\1\110\1\61\2\141"+
        "\1\127\1\117\1\127\1\117\1\141\1\127\1\117\1\127\1\117\1\127\1\117"+
        "\1\127\2\117\1\127\1\117\1\70\1\141\2\61\1\111\1\70\1\141\1\61\1"+
        "\110\1\61\1\117\1\111\1\70\1\141\1\61\1\110\1\61\1\127\1\111\1\70"+
        "\1\141\1\61\1\110\1\61\1\141\1\127\1\117\1\127\1\117\1\127\1\117"+
        "\1\127\2\117\1\127\1\117\1\70\1\141\2\61\1\111\1\70\1\141\1\61\1"+
        "\110\1\61\1\117\1\111\1\70\1\141\1\61\1\110\1\61\1\127\1\111\1\70"+
        "\1\141\1\61\1\110\1\61\1\127\1\117\1\127\2\117\1\127\1\117\1\70"+
        "\1\141\2\61\1\111\1\70\1\141\1\61\1\110\1\61\1\117\1\111\1\70\1"+
        "\141\1\61\1\110\1\61\1\127\1\111\1\70\1\141\1\61\1\110\1\61\1\117"+
        "\1\127\1\117\1\70\1\141\2\61\1\111\1\70\1\141\1\61\1\110\1\61\1"+
        "\117\1\111\1\70\1\141\1\61\1\110\1\61\1\127\1\111\1\70\1\141\1\61"+
        "\1\110\1\61\1\111\1\70\1\141\1\61\1\110\1\61\1\117\1\111\1\70\1"+
        "\141\1\61\1\110\1\61\1\127\1\111\1\70\1\141\1\61\1\110\1\141\1\33"+
        "\1\16\1\uffff\1\141\1\61\1\110\1\61\3\141\1\127\1\117\1\127\1\117"+
        "\1\110\3\61\1\60\1\117\1\141\1\61\1\110\1\61\3\141\1\127\1\117\1"+
        "\127\1\117\1\110\2\61\1\111\1\33\1\141\1\16\1\uffff\1\61\1\60\1"+
        "\111\1\70\1\141\1\61\1\110\1\61\1\117\1\141\1\61\1\110\1\61\3\141"+
        "\1\127\1\117\1\127\1\117\1\110\2\61\1\111\1\33\1\141\1\16\1\uffff"+
        "\1\61\1\60\1\117\1\111\1\70\1\141\1\61\1\110\1\61\1\127\1\117\1"+
        "\141\1\61\1\110\1\61\3\141\1\127\1\117\1\127\1\117\1\110\2\61\1"+
        "\111\1\33\1\141\1\16\1\uffff\1\61\1\60\u06b4\uffff";
    static final String DFA55_acceptS =
        "\13\uffff\1\2\u014d\uffff\1\1\43\uffff\1\1\33\uffff\1\1\35\uffff"+
        "\1\1\2\uffff\u06b4\1";
    static final String DFA55_specialS =
        "\u086e\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\12\62\uffff\1\13\1\uffff\1\13\1\uffff\1\13\7\uffff\1\1\1"+
            "\uffff\1\4\2\uffff\1\5\2\uffff\1\3\1\10\1\11\4\uffff\1\2\1\uffff"+
            "\1\13\1\6\1\13\1\7\2\uffff\1\13",
            "\1\27\100\uffff\1\21\2\uffff\1\22\2\uffff\1\20\1\25\1\26\4"+
            "\uffff\1\17\2\uffff\1\23\1\uffff\1\24",
            "\1\37\100\uffff\1\31\2\uffff\1\32\2\uffff\1\30\1\35\1\36\7"+
            "\uffff\1\33\1\uffff\1\34",
            "\1\46\100\uffff\1\40\2\uffff\1\41\3\uffff\1\44\1\45\7\uffff"+
            "\1\42\1\uffff\1\43",
            "\1\54\103\uffff\1\47\3\uffff\1\52\1\53\7\uffff\1\50\1\uffff"+
            "\1\51",
            "\1\61\107\uffff\1\57\1\60\7\uffff\1\55\1\uffff\1\56",
            "\1\65\107\uffff\1\63\1\64\11\uffff\1\62",
            "\1\70\40\uffff\1\74\1\uffff\1\73\6\uffff\1\72\26\uffff\1\71"+
            "\6\uffff\1\66\1\67",
            "\1\101\40\uffff\1\102\1\uffff\1\100\6\uffff\1\77\17\uffff\1"+
            "\75\6\uffff\1\76",
            "\1\110\40\uffff\1\111\1\uffff\1\107\6\uffff\1\106\17\uffff"+
            "\1\104\6\uffff\1\105\6\uffff\1\103\1\112",
            "\1\117\40\uffff\1\120\1\uffff\1\116\6\uffff\1\115\17\uffff"+
            "\1\113\6\uffff\1\114",
            "",
            "",
            "",
            "",
            "\1\130\100\uffff\1\122\2\uffff\1\123\2\uffff\1\121\1\126\1"+
            "\127\7\uffff\1\124\1\uffff\1\125",
            "\1\137\100\uffff\1\131\2\uffff\1\132\3\uffff\1\135\1\136\7"+
            "\uffff\1\133\1\uffff\1\134",
            "\1\145\103\uffff\1\140\3\uffff\1\143\1\144\7\uffff\1\141\1"+
            "\uffff\1\142",
            "\1\152\107\uffff\1\150\1\151\7\uffff\1\146\1\uffff\1\147",
            "\1\156\107\uffff\1\154\1\155\11\uffff\1\153",
            "\1\161\40\uffff\1\165\1\uffff\1\164\6\uffff\1\163\26\uffff"+
            "\1\162\6\uffff\1\157\1\160",
            "\1\172\40\uffff\1\173\1\uffff\1\171\6\uffff\1\170\17\uffff"+
            "\1\166\6\uffff\1\167",
            "\1\u0081\40\uffff\1\u0082\1\uffff\1\u0080\6\uffff\1\177\17"+
            "\uffff\1\175\6\uffff\1\176\6\uffff\1\174\1\u0083",
            "\1\u0088\40\uffff\1\u0089\1\uffff\1\u0087\6\uffff\1\u0086\17"+
            "\uffff\1\u0084\6\uffff\1\u0085",
            "\1\u0090\100\uffff\1\u008a\2\uffff\1\u008b\3\uffff\1\u008e"+
            "\1\u008f\7\uffff\1\u008c\1\uffff\1\u008d",
            "\1\u0096\103\uffff\1\u0091\3\uffff\1\u0094\1\u0095\7\uffff"+
            "\1\u0092\1\uffff\1\u0093",
            "\1\u009b\107\uffff\1\u0099\1\u009a\7\uffff\1\u0097\1\uffff"+
            "\1\u0098",
            "\1\u009f\107\uffff\1\u009d\1\u009e\11\uffff\1\u009c",
            "\1\u00a2\40\uffff\1\u00a6\1\uffff\1\u00a5\6\uffff\1\u00a4\26"+
            "\uffff\1\u00a3\6\uffff\1\u00a0\1\u00a1",
            "\1\u00ab\40\uffff\1\u00ac\1\uffff\1\u00aa\6\uffff\1\u00a9\17"+
            "\uffff\1\u00a7\6\uffff\1\u00a8",
            "\1\u00b2\40\uffff\1\u00b3\1\uffff\1\u00b1\6\uffff\1\u00b0\17"+
            "\uffff\1\u00ae\6\uffff\1\u00af\6\uffff\1\u00ad\1\u00b4",
            "\1\u00b9\40\uffff\1\u00ba\1\uffff\1\u00b8\6\uffff\1\u00b7\17"+
            "\uffff\1\u00b5\6\uffff\1\u00b6",
            "\1\u00c0\103\uffff\1\u00bb\3\uffff\1\u00be\1\u00bf\7\uffff"+
            "\1\u00bc\1\uffff\1\u00bd",
            "\1\u00c5\107\uffff\1\u00c3\1\u00c4\7\uffff\1\u00c1\1\uffff"+
            "\1\u00c2",
            "\1\u00c9\107\uffff\1\u00c7\1\u00c8\11\uffff\1\u00c6",
            "\1\u00cc\40\uffff\1\u00d0\1\uffff\1\u00cf\6\uffff\1\u00ce\26"+
            "\uffff\1\u00cd\6\uffff\1\u00ca\1\u00cb",
            "\1\u00d5\40\uffff\1\u00d6\1\uffff\1\u00d4\6\uffff\1\u00d3\17"+
            "\uffff\1\u00d1\6\uffff\1\u00d2",
            "\1\u00dc\40\uffff\1\u00dd\1\uffff\1\u00db\6\uffff\1\u00da\17"+
            "\uffff\1\u00d8\6\uffff\1\u00d9\6\uffff\1\u00d7\1\u00de",
            "\1\u00e3\40\uffff\1\u00e4\1\uffff\1\u00e2\6\uffff\1\u00e1\17"+
            "\uffff\1\u00df\6\uffff\1\u00e0",
            "\1\u00e9\107\uffff\1\u00e7\1\u00e8\7\uffff\1\u00e5\1\uffff"+
            "\1\u00e6",
            "\1\u00ed\107\uffff\1\u00eb\1\u00ec\11\uffff\1\u00ea",
            "\1\u00f0\40\uffff\1\u00f4\1\uffff\1\u00f3\6\uffff\1\u00f2\26"+
            "\uffff\1\u00f1\6\uffff\1\u00ee\1\u00ef",
            "\1\u00f9\40\uffff\1\u00fa\1\uffff\1\u00f8\6\uffff\1\u00f7\17"+
            "\uffff\1\u00f5\6\uffff\1\u00f6",
            "\1\u0100\40\uffff\1\u0101\1\uffff\1\u00ff\6\uffff\1\u00fe\17"+
            "\uffff\1\u00fc\6\uffff\1\u00fd\6\uffff\1\u00fb\1\u0102",
            "\1\u0107\40\uffff\1\u0108\1\uffff\1\u0106\6\uffff\1\u0105\17"+
            "\uffff\1\u0103\6\uffff\1\u0104",
            "\1\u010c\107\uffff\1\u010a\1\u010b\11\uffff\1\u0109",
            "\1\u010f\40\uffff\1\u0113\1\uffff\1\u0112\6\uffff\1\u0111\26"+
            "\uffff\1\u0110\6\uffff\1\u010d\1\u010e",
            "\1\u0118\40\uffff\1\u0119\1\uffff\1\u0117\6\uffff\1\u0116\17"+
            "\uffff\1\u0114\6\uffff\1\u0115",
            "\1\u011f\40\uffff\1\u0120\1\uffff\1\u011e\6\uffff\1\u011d\17"+
            "\uffff\1\u011b\6\uffff\1\u011c\6\uffff\1\u011a\1\u0121",
            "\1\u0126\40\uffff\1\u0127\1\uffff\1\u0125\6\uffff\1\u0124\17"+
            "\uffff\1\u0122\6\uffff\1\u0123",
            "\1\u012a\40\uffff\1\u012e\1\uffff\1\u012d\6\uffff\1\u012c\26"+
            "\uffff\1\u012b\6\uffff\1\u0128\1\u0129",
            "\1\u0133\40\uffff\1\u0134\1\uffff\1\u0132\6\uffff\1\u0131\17"+
            "\uffff\1\u012f\6\uffff\1\u0130",
            "\1\u013a\40\uffff\1\u013b\1\uffff\1\u0139\6\uffff\1\u0138\17"+
            "\uffff\1\u0136\6\uffff\1\u0137\6\uffff\1\u0135\1\u013c",
            "\1\u0141\40\uffff\1\u0142\1\uffff\1\u0140\6\uffff\1\u013f\17"+
            "\uffff\1\u013d\6\uffff\1\u013e",
            "\1\u0147\40\uffff\1\u0148\1\uffff\1\u0146\6\uffff\1\u0145\17"+
            "\uffff\1\u0143\6\uffff\1\u0144",
            "\1\u014e\40\uffff\1\u014f\1\uffff\1\u014d\6\uffff\1\u014c\17"+
            "\uffff\1\u014a\6\uffff\1\u014b\6\uffff\1\u0149\1\u0150",
            "\1\u0155\40\uffff\1\u0156\1\uffff\1\u0154\1\uffff\1\u0158\2"+
            "\uffff\1\u0157\1\u0159\1\u0153\17\uffff\1\u0151\6\uffff\1\u0152",
            "\1\u015c\40\uffff\1\u015d\1\uffff\1\u015b\6\uffff\1\u015a",
            "\1\u0164\100\uffff\1\u015e\2\uffff\1\u015f\3\uffff\1\u0162"+
            "\1\u0163\7\uffff\1\u0160\1\uffff\1\u0161",
            "\1\u0165\40\uffff\1\u0166\1\uffff\1\u0167",
            "\1\u0169\42\uffff\1\u0168",
            "\1\u016a",
            "\1\u016d\40\uffff\1\u016e\1\uffff\1\u016c\6\uffff\1\u016b",
            "\1\u0175\100\uffff\1\u016f\2\uffff\1\u0170\3\uffff\1\u0173"+
            "\1\u0174\7\uffff\1\u0171\1\uffff\1\u0172",
            "\1\u0176\40\uffff\1\u0177\1\uffff\1\u0178",
            "\1\u017b\3\uffff\1\u017c\2\uffff\1\u017a\1\u017d\20\uffff\1"+
            "\u0179",
            "\1\u017f\42\uffff\1\u017e",
            "\1\u0184\40\uffff\1\u0185\1\uffff\1\u0183\6\uffff\1\u0182\17"+
            "\uffff\1\u0180\6\uffff\1\u0181",
            "\1\u0186",
            "\1\u0189\40\uffff\1\u018a\1\uffff\1\u0188\6\uffff\1\u0187",
            "\1\u0191\100\uffff\1\u018b\2\uffff\1\u018c\3\uffff\1\u018f"+
            "\1\u0190\7\uffff\1\u018d\1\uffff\1\u018e",
            "\1\u0192\40\uffff\1\u0193\1\uffff\1\u0194",
            "\1\u0197\3\uffff\1\u0198\2\uffff\1\u0196\1\u0199\20\uffff\1"+
            "\u0195",
            "\1\u019b\42\uffff\1\u019a",
            "\1\u01a1\40\uffff\1\u01a2\1\uffff\1\u01a0\6\uffff\1\u019f\17"+
            "\uffff\1\u019d\6\uffff\1\u019e\6\uffff\1\u019c\1\u01a3",
            "\1\u01a4",
            "\1\u01a7\40\uffff\1\u01a8\1\uffff\1\u01a6\6\uffff\1\u01a5",
            "\1\u01af\100\uffff\1\u01a9\2\uffff\1\u01aa\3\uffff\1\u01ad"+
            "\1\u01ae\7\uffff\1\u01ab\1\uffff\1\u01ac",
            "\1\u01b0\40\uffff\1\u01b1\1\uffff\1\u01b2",
            "\1\u01b5\3\uffff\1\u01b6\2\uffff\1\u01b4\1\u01b7\20\uffff\1"+
            "\u01b3",
            "\1\u01b9\42\uffff\1\u01b8",
            "\1\u01c0\100\uffff\1\u01ba\2\uffff\1\u01bb\3\uffff\1\u01be"+
            "\1\u01bf\7\uffff\1\u01bc\1\uffff\1\u01bd",
            "\1\u01c6\103\uffff\1\u01c1\3\uffff\1\u01c4\1\u01c5\7\uffff"+
            "\1\u01c2\1\uffff\1\u01c3",
            "\1\u01cb\107\uffff\1\u01c9\1\u01ca\7\uffff\1\u01c7\1\uffff"+
            "\1\u01c8",
            "\1\u01cf\107\uffff\1\u01cd\1\u01ce\11\uffff\1\u01cc",
            "\1\u01d2\40\uffff\1\u01d6\1\uffff\1\u01d5\6\uffff\1\u01d4\26"+
            "\uffff\1\u01d3\6\uffff\1\u01d0\1\u01d1",
            "\1\u01db\40\uffff\1\u01dc\1\uffff\1\u01da\6\uffff\1\u01d9\17"+
            "\uffff\1\u01d7\6\uffff\1\u01d8",
            "\1\u01e2\40\uffff\1\u01e3\1\uffff\1\u01e1\6\uffff\1\u01e0\17"+
            "\uffff\1\u01de\6\uffff\1\u01df\6\uffff\1\u01dd\1\u01e4",
            "\1\u01e9\40\uffff\1\u01ea\1\uffff\1\u01e8\6\uffff\1\u01e7\17"+
            "\uffff\1\u01e5\6\uffff\1\u01e6",
            "\1\u01f0\103\uffff\1\u01eb\3\uffff\1\u01ee\1\u01ef\7\uffff"+
            "\1\u01ec\1\uffff\1\u01ed",
            "\1\u01f5\107\uffff\1\u01f3\1\u01f4\7\uffff\1\u01f1\1\uffff"+
            "\1\u01f2",
            "\1\u01f9\107\uffff\1\u01f7\1\u01f8\11\uffff\1\u01f6",
            "\1\u01fc\40\uffff\1\u0200\1\uffff\1\u01ff\6\uffff\1\u01fe\26"+
            "\uffff\1\u01fd\6\uffff\1\u01fa\1\u01fb",
            "\1\u0205\40\uffff\1\u0206\1\uffff\1\u0204\6\uffff\1\u0203\17"+
            "\uffff\1\u0201\6\uffff\1\u0202",
            "\1\u020c\40\uffff\1\u020d\1\uffff\1\u020b\6\uffff\1\u020a\17"+
            "\uffff\1\u0208\6\uffff\1\u0209\6\uffff\1\u0207\1\u020e",
            "\1\u0213\40\uffff\1\u0214\1\uffff\1\u0212\6\uffff\1\u0211\17"+
            "\uffff\1\u020f\6\uffff\1\u0210",
            "\1\u0219\107\uffff\1\u0217\1\u0218\7\uffff\1\u0215\1\uffff"+
            "\1\u0216",
            "\1\u021d\107\uffff\1\u021b\1\u021c\11\uffff\1\u021a",
            "\1\u0220\40\uffff\1\u0224\1\uffff\1\u0223\6\uffff\1\u0222\26"+
            "\uffff\1\u0221\6\uffff\1\u021e\1\u021f",
            "\1\u0229\40\uffff\1\u022a\1\uffff\1\u0228\6\uffff\1\u0227\17"+
            "\uffff\1\u0225\6\uffff\1\u0226",
            "\1\u0230\40\uffff\1\u0231\1\uffff\1\u022f\6\uffff\1\u022e\17"+
            "\uffff\1\u022c\6\uffff\1\u022d\6\uffff\1\u022b\1\u0232",
            "\1\u0237\40\uffff\1\u0238\1\uffff\1\u0236\6\uffff\1\u0235\17"+
            "\uffff\1\u0233\6\uffff\1\u0234",
            "\1\u023c\107\uffff\1\u023a\1\u023b\11\uffff\1\u0239",
            "\1\u023f\40\uffff\1\u0243\1\uffff\1\u0242\6\uffff\1\u0241\26"+
            "\uffff\1\u0240\6\uffff\1\u023d\1\u023e",
            "\1\u0248\40\uffff\1\u0249\1\uffff\1\u0247\6\uffff\1\u0246\17"+
            "\uffff\1\u0244\6\uffff\1\u0245",
            "\1\u024f\40\uffff\1\u0250\1\uffff\1\u024e\6\uffff\1\u024d\17"+
            "\uffff\1\u024b\6\uffff\1\u024c\6\uffff\1\u024a\1\u0251",
            "\1\u0256\40\uffff\1\u0257\1\uffff\1\u0255\6\uffff\1\u0254\17"+
            "\uffff\1\u0252\6\uffff\1\u0253",
            "\1\u025a\40\uffff\1\u025e\1\uffff\1\u025d\6\uffff\1\u025c\26"+
            "\uffff\1\u025b\6\uffff\1\u0258\1\u0259",
            "\1\u0263\40\uffff\1\u0264\1\uffff\1\u0262\6\uffff\1\u0261\17"+
            "\uffff\1\u025f\6\uffff\1\u0260",
            "\1\u026a\40\uffff\1\u026b\1\uffff\1\u0269\6\uffff\1\u0268\17"+
            "\uffff\1\u0266\6\uffff\1\u0267\6\uffff\1\u0265\1\u026c",
            "\1\u0271\40\uffff\1\u0272\1\uffff\1\u0270\6\uffff\1\u026f\17"+
            "\uffff\1\u026d\6\uffff\1\u026e",
            "\1\u0277\40\uffff\1\u0278\1\uffff\1\u0276\6\uffff\1\u0275\17"+
            "\uffff\1\u0273\6\uffff\1\u0274",
            "\1\u027e\40\uffff\1\u027f\1\uffff\1\u027d\6\uffff\1\u027c\17"+
            "\uffff\1\u027a\6\uffff\1\u027b\6\uffff\1\u0279\1\u0280",
            "\1\u0285\40\uffff\1\u0286\1\uffff\1\u0284\1\uffff\1\u0288\2"+
            "\uffff\1\u0287\1\u0289\1\u0283\17\uffff\1\u0281\6\uffff\1\u0282",
            "\1\u028c\40\uffff\1\u028d\1\uffff\1\u028b\6\uffff\1\u028a",
            "\1\u0294\100\uffff\1\u028e\2\uffff\1\u028f\3\uffff\1\u0292"+
            "\1\u0293\7\uffff\1\u0290\1\uffff\1\u0291",
            "\1\u0295\40\uffff\1\u0296\1\uffff\1\u0297",
            "\1\u0299\42\uffff\1\u0298",
            "\1\u029a",
            "\1\u029d\40\uffff\1\u029e\1\uffff\1\u029c\6\uffff\1\u029b",
            "\1\u02a5\100\uffff\1\u029f\2\uffff\1\u02a0\3\uffff\1\u02a3"+
            "\1\u02a4\7\uffff\1\u02a1\1\uffff\1\u02a2",
            "\1\u02a6\40\uffff\1\u02a7\1\uffff\1\u02a8",
            "\1\u02ab\3\uffff\1\u02ac\2\uffff\1\u02aa\1\u02ad\20\uffff\1"+
            "\u02a9",
            "\1\u02af\42\uffff\1\u02ae",
            "\1\u02b4\40\uffff\1\u02b5\1\uffff\1\u02b3\6\uffff\1\u02b2\17"+
            "\uffff\1\u02b0\6\uffff\1\u02b1",
            "\1\u02b6",
            "\1\u02b9\40\uffff\1\u02ba\1\uffff\1\u02b8\6\uffff\1\u02b7",
            "\1\u02c1\100\uffff\1\u02bb\2\uffff\1\u02bc\3\uffff\1\u02bf"+
            "\1\u02c0\7\uffff\1\u02bd\1\uffff\1\u02be",
            "\1\u02c2\40\uffff\1\u02c3\1\uffff\1\u02c4",
            "\1\u02c7\3\uffff\1\u02c8\2\uffff\1\u02c6\1\u02c9\20\uffff\1"+
            "\u02c5",
            "\1\u02cb\42\uffff\1\u02ca",
            "\1\u02d1\40\uffff\1\u02d2\1\uffff\1\u02d0\6\uffff\1\u02cf\17"+
            "\uffff\1\u02cd\6\uffff\1\u02ce\6\uffff\1\u02cc\1\u02d3",
            "\1\u02d4",
            "\1\u02d7\40\uffff\1\u02d8\1\uffff\1\u02d6\6\uffff\1\u02d5",
            "\1\u02df\100\uffff\1\u02d9\2\uffff\1\u02da\3\uffff\1\u02dd"+
            "\1\u02de\7\uffff\1\u02db\1\uffff\1\u02dc",
            "\1\u02e0\40\uffff\1\u02e1\1\uffff\1\u02e2",
            "\1\u02e5\3\uffff\1\u02e6\2\uffff\1\u02e4\1\u02e7\20\uffff\1"+
            "\u02e3",
            "\1\u02e9\42\uffff\1\u02e8",
            "\1\u02ef\103\uffff\1\u02ea\3\uffff\1\u02ed\1\u02ee\7\uffff"+
            "\1\u02eb\1\uffff\1\u02ec",
            "\1\u02f4\107\uffff\1\u02f2\1\u02f3\7\uffff\1\u02f0\1\uffff"+
            "\1\u02f1",
            "\1\u02f8\107\uffff\1\u02f6\1\u02f7\11\uffff\1\u02f5",
            "\1\u02fb\40\uffff\1\u02ff\1\uffff\1\u02fe\6\uffff\1\u02fd\26"+
            "\uffff\1\u02fc\6\uffff\1\u02f9\1\u02fa",
            "\1\u0304\40\uffff\1\u0305\1\uffff\1\u0303\6\uffff\1\u0302\17"+
            "\uffff\1\u0300\6\uffff\1\u0301",
            "\1\u030b\40\uffff\1\u030c\1\uffff\1\u030a\6\uffff\1\u0309\17"+
            "\uffff\1\u0307\6\uffff\1\u0308\6\uffff\1\u0306\1\u030d",
            "\1\u0312\40\uffff\1\u0313\1\uffff\1\u0311\6\uffff\1\u0310\17"+
            "\uffff\1\u030e\6\uffff\1\u030f",
            "\1\u0318\107\uffff\1\u0316\1\u0317\7\uffff\1\u0314\1\uffff"+
            "\1\u0315",
            "\1\u031c\107\uffff\1\u031a\1\u031b\11\uffff\1\u0319",
            "\1\u031f\40\uffff\1\u0323\1\uffff\1\u0322\6\uffff\1\u0321\26"+
            "\uffff\1\u0320\6\uffff\1\u031d\1\u031e",
            "\1\u0328\40\uffff\1\u0329\1\uffff\1\u0327\6\uffff\1\u0326\17"+
            "\uffff\1\u0324\6\uffff\1\u0325",
            "\1\u032f\40\uffff\1\u0330\1\uffff\1\u032e\6\uffff\1\u032d\17"+
            "\uffff\1\u032b\6\uffff\1\u032c\6\uffff\1\u032a\1\u0331",
            "\1\u0336\40\uffff\1\u0337\1\uffff\1\u0335\6\uffff\1\u0334\17"+
            "\uffff\1\u0332\6\uffff\1\u0333",
            "\1\u033b\107\uffff\1\u0339\1\u033a\11\uffff\1\u0338",
            "\1\u033e\40\uffff\1\u0342\1\uffff\1\u0341\6\uffff\1\u0340\26"+
            "\uffff\1\u033f\6\uffff\1\u033c\1\u033d",
            "\1\u0347\40\uffff\1\u0348\1\uffff\1\u0346\6\uffff\1\u0345\17"+
            "\uffff\1\u0343\6\uffff\1\u0344",
            "\1\u034e\40\uffff\1\u034f\1\uffff\1\u034d\6\uffff\1\u034c\17"+
            "\uffff\1\u034a\6\uffff\1\u034b\6\uffff\1\u0349\1\u0350",
            "\1\u0355\40\uffff\1\u0356\1\uffff\1\u0354\6\uffff\1\u0353\17"+
            "\uffff\1\u0351\6\uffff\1\u0352",
            "\1\u0359\40\uffff\1\u035d\1\uffff\1\u035c\6\uffff\1\u035b\26"+
            "\uffff\1\u035a\6\uffff\1\u0357\1\u0358",
            "\1\u0362\40\uffff\1\u0363\1\uffff\1\u0361\6\uffff\1\u0360\17"+
            "\uffff\1\u035e\6\uffff\1\u035f",
            "\1\u0369\40\uffff\1\u036a\1\uffff\1\u0368\6\uffff\1\u0367\17"+
            "\uffff\1\u0365\6\uffff\1\u0366\6\uffff\1\u0364\1\u036b",
            "\1\u0370\40\uffff\1\u0371\1\uffff\1\u036f\6\uffff\1\u036e\17"+
            "\uffff\1\u036c\6\uffff\1\u036d",
            "\1\u0376\40\uffff\1\u0377\1\uffff\1\u0375\6\uffff\1\u0374\17"+
            "\uffff\1\u0372\6\uffff\1\u0373",
            "\1\u037d\40\uffff\1\u037e\1\uffff\1\u037c\6\uffff\1\u037b\17"+
            "\uffff\1\u0379\6\uffff\1\u037a\6\uffff\1\u0378\1\u037f",
            "\1\u0384\40\uffff\1\u0385\1\uffff\1\u0383\1\uffff\1\u0387\2"+
            "\uffff\1\u0386\1\u0388\1\u0382\17\uffff\1\u0380\6\uffff\1\u0381",
            "\1\u038b\40\uffff\1\u038c\1\uffff\1\u038a\6\uffff\1\u0389",
            "\1\u0393\100\uffff\1\u038d\2\uffff\1\u038e\3\uffff\1\u0391"+
            "\1\u0392\7\uffff\1\u038f\1\uffff\1\u0390",
            "\1\u0394\40\uffff\1\u0395\1\uffff\1\u0396",
            "\1\u0398\42\uffff\1\u0397",
            "\1\u0399",
            "\1\u039c\40\uffff\1\u039d\1\uffff\1\u039b\6\uffff\1\u039a",
            "\1\u03a4\100\uffff\1\u039e\2\uffff\1\u039f\3\uffff\1\u03a2"+
            "\1\u03a3\7\uffff\1\u03a0\1\uffff\1\u03a1",
            "\1\u03a5\40\uffff\1\u03a6\1\uffff\1\u03a7",
            "\1\u03aa\3\uffff\1\u03ab\2\uffff\1\u03a9\1\u03ac\20\uffff\1"+
            "\u03a8",
            "\1\u03ae\42\uffff\1\u03ad",
            "\1\u03b3\40\uffff\1\u03b4\1\uffff\1\u03b2\6\uffff\1\u03b1\17"+
            "\uffff\1\u03af\6\uffff\1\u03b0",
            "\1\u03b5",
            "\1\u03b8\40\uffff\1\u03b9\1\uffff\1\u03b7\6\uffff\1\u03b6",
            "\1\u03c0\100\uffff\1\u03ba\2\uffff\1\u03bb\3\uffff\1\u03be"+
            "\1\u03bf\7\uffff\1\u03bc\1\uffff\1\u03bd",
            "\1\u03c1\40\uffff\1\u03c2\1\uffff\1\u03c3",
            "\1\u03c6\3\uffff\1\u03c7\2\uffff\1\u03c5\1\u03c8\20\uffff\1"+
            "\u03c4",
            "\1\u03ca\42\uffff\1\u03c9",
            "\1\u03d0\40\uffff\1\u03d1\1\uffff\1\u03cf\6\uffff\1\u03ce\17"+
            "\uffff\1\u03cc\6\uffff\1\u03cd\6\uffff\1\u03cb\1\u03d2",
            "\1\u03d3",
            "\1\u03d6\40\uffff\1\u03d7\1\uffff\1\u03d5\6\uffff\1\u03d4",
            "\1\u03de\100\uffff\1\u03d8\2\uffff\1\u03d9\3\uffff\1\u03dc"+
            "\1\u03dd\7\uffff\1\u03da\1\uffff\1\u03db",
            "\1\u03df\40\uffff\1\u03e0\1\uffff\1\u03e1",
            "\1\u03e4\3\uffff\1\u03e5\2\uffff\1\u03e3\1\u03e6\20\uffff\1"+
            "\u03e2",
            "\1\u03e8\42\uffff\1\u03e7",
            "\1\u03ed\107\uffff\1\u03eb\1\u03ec\7\uffff\1\u03e9\1\uffff"+
            "\1\u03ea",
            "\1\u03f1\107\uffff\1\u03ef\1\u03f0\11\uffff\1\u03ee",
            "\1\u03f4\40\uffff\1\u03f8\1\uffff\1\u03f7\6\uffff\1\u03f6\26"+
            "\uffff\1\u03f5\6\uffff\1\u03f2\1\u03f3",
            "\1\u03fd\40\uffff\1\u03fe\1\uffff\1\u03fc\6\uffff\1\u03fb\17"+
            "\uffff\1\u03f9\6\uffff\1\u03fa",
            "\1\u0404\40\uffff\1\u0405\1\uffff\1\u0403\6\uffff\1\u0402\17"+
            "\uffff\1\u0400\6\uffff\1\u0401\6\uffff\1\u03ff\1\u0406",
            "\1\u040b\40\uffff\1\u040c\1\uffff\1\u040a\6\uffff\1\u0409\17"+
            "\uffff\1\u0407\6\uffff\1\u0408",
            "\1\u0410\107\uffff\1\u040e\1\u040f\11\uffff\1\u040d",
            "\1\u0413\40\uffff\1\u0417\1\uffff\1\u0416\6\uffff\1\u0415\26"+
            "\uffff\1\u0414\6\uffff\1\u0411\1\u0412",
            "\1\u041c\40\uffff\1\u041d\1\uffff\1\u041b\6\uffff\1\u041a\17"+
            "\uffff\1\u0418\6\uffff\1\u0419",
            "\1\u0423\40\uffff\1\u0424\1\uffff\1\u0422\6\uffff\1\u0421\17"+
            "\uffff\1\u041f\6\uffff\1\u0420\6\uffff\1\u041e\1\u0425",
            "\1\u042a\40\uffff\1\u042b\1\uffff\1\u0429\6\uffff\1\u0428\17"+
            "\uffff\1\u0426\6\uffff\1\u0427",
            "\1\u042e\40\uffff\1\u0432\1\uffff\1\u0431\6\uffff\1\u0430\26"+
            "\uffff\1\u042f\6\uffff\1\u042c\1\u042d",
            "\1\u0437\40\uffff\1\u0438\1\uffff\1\u0436\6\uffff\1\u0435\17"+
            "\uffff\1\u0433\6\uffff\1\u0434",
            "\1\u043e\40\uffff\1\u043f\1\uffff\1\u043d\6\uffff\1\u043c\17"+
            "\uffff\1\u043a\6\uffff\1\u043b\6\uffff\1\u0439\1\u0440",
            "\1\u0445\40\uffff\1\u0446\1\uffff\1\u0444\6\uffff\1\u0443\17"+
            "\uffff\1\u0441\6\uffff\1\u0442",
            "\1\u044b\40\uffff\1\u044c\1\uffff\1\u044a\6\uffff\1\u0449\17"+
            "\uffff\1\u0447\6\uffff\1\u0448",
            "\1\u0452\40\uffff\1\u0453\1\uffff\1\u0451\6\uffff\1\u0450\17"+
            "\uffff\1\u044e\6\uffff\1\u044f\6\uffff\1\u044d\1\u0454",
            "\1\u0459\40\uffff\1\u045a\1\uffff\1\u0458\1\uffff\1\u045c\2"+
            "\uffff\1\u045b\1\u045d\1\u0457\17\uffff\1\u0455\6\uffff\1\u0456",
            "\1\u0460\40\uffff\1\u0461\1\uffff\1\u045f\6\uffff\1\u045e",
            "\1\u0468\100\uffff\1\u0462\2\uffff\1\u0463\3\uffff\1\u0466"+
            "\1\u0467\7\uffff\1\u0464\1\uffff\1\u0465",
            "\1\u0469\40\uffff\1\u046a\1\uffff\1\u046b",
            "\1\u046d\42\uffff\1\u046c",
            "\1\u046e",
            "\1\u0471\40\uffff\1\u0472\1\uffff\1\u0470\6\uffff\1\u046f",
            "\1\u0479\100\uffff\1\u0473\2\uffff\1\u0474\3\uffff\1\u0477"+
            "\1\u0478\7\uffff\1\u0475\1\uffff\1\u0476",
            "\1\u047a\40\uffff\1\u047b\1\uffff\1\u047c",
            "\1\u047f\3\uffff\1\u0480\2\uffff\1\u047e\1\u0481\20\uffff\1"+
            "\u047d",
            "\1\u0483\42\uffff\1\u0482",
            "\1\u0488\40\uffff\1\u0489\1\uffff\1\u0487\6\uffff\1\u0486\17"+
            "\uffff\1\u0484\6\uffff\1\u0485",
            "\1\u048a",
            "\1\u048d\40\uffff\1\u048e\1\uffff\1\u048c\6\uffff\1\u048b",
            "\1\u0495\100\uffff\1\u048f\2\uffff\1\u0490\3\uffff\1\u0493"+
            "\1\u0494\7\uffff\1\u0491\1\uffff\1\u0492",
            "\1\u0496\40\uffff\1\u0497\1\uffff\1\u0498",
            "\1\u049b\3\uffff\1\u049c\2\uffff\1\u049a\1\u049d\20\uffff\1"+
            "\u0499",
            "\1\u049f\42\uffff\1\u049e",
            "\1\u04a5\40\uffff\1\u04a6\1\uffff\1\u04a4\6\uffff\1\u04a3\17"+
            "\uffff\1\u04a1\6\uffff\1\u04a2\6\uffff\1\u04a0\1\u04a7",
            "\1\u04a8",
            "\1\u04ab\40\uffff\1\u04ac\1\uffff\1\u04aa\6\uffff\1\u04a9",
            "\1\u04b3\100\uffff\1\u04ad\2\uffff\1\u04ae\3\uffff\1\u04b1"+
            "\1\u04b2\7\uffff\1\u04af\1\uffff\1\u04b0",
            "\1\u04b4\40\uffff\1\u04b5\1\uffff\1\u04b6",
            "\1\u04b9\3\uffff\1\u04ba\2\uffff\1\u04b8\1\u04bb\20\uffff\1"+
            "\u04b7",
            "\1\u04bd\42\uffff\1\u04bc",
            "\1\u04c1\107\uffff\1\u04bf\1\u04c0\11\uffff\1\u04be",
            "\1\u04c4\40\uffff\1\u04c8\1\uffff\1\u04c7\6\uffff\1\u04c6\26"+
            "\uffff\1\u04c5\6\uffff\1\u04c2\1\u04c3",
            "\1\u04cd\40\uffff\1\u04ce\1\uffff\1\u04cc\6\uffff\1\u04cb\17"+
            "\uffff\1\u04c9\6\uffff\1\u04ca",
            "\1\u04d4\40\uffff\1\u04d5\1\uffff\1\u04d3\6\uffff\1\u04d2\17"+
            "\uffff\1\u04d0\6\uffff\1\u04d1\6\uffff\1\u04cf\1\u04d6",
            "\1\u04db\40\uffff\1\u04dc\1\uffff\1\u04da\6\uffff\1\u04d9\17"+
            "\uffff\1\u04d7\6\uffff\1\u04d8",
            "\1\u04df\40\uffff\1\u04e3\1\uffff\1\u04e2\6\uffff\1\u04e1\26"+
            "\uffff\1\u04e0\6\uffff\1\u04dd\1\u04de",
            "\1\u04e8\40\uffff\1\u04e9\1\uffff\1\u04e7\6\uffff\1\u04e6\17"+
            "\uffff\1\u04e4\6\uffff\1\u04e5",
            "\1\u04ef\40\uffff\1\u04f0\1\uffff\1\u04ee\6\uffff\1\u04ed\17"+
            "\uffff\1\u04eb\6\uffff\1\u04ec\6\uffff\1\u04ea\1\u04f1",
            "\1\u04f6\40\uffff\1\u04f7\1\uffff\1\u04f5\6\uffff\1\u04f4\17"+
            "\uffff\1\u04f2\6\uffff\1\u04f3",
            "\1\u04fc\40\uffff\1\u04fd\1\uffff\1\u04fb\6\uffff\1\u04fa\17"+
            "\uffff\1\u04f8\6\uffff\1\u04f9",
            "\1\u0503\40\uffff\1\u0504\1\uffff\1\u0502\6\uffff\1\u0501\17"+
            "\uffff\1\u04ff\6\uffff\1\u0500\6\uffff\1\u04fe\1\u0505",
            "\1\u050a\40\uffff\1\u050b\1\uffff\1\u0509\1\uffff\1\u050d\2"+
            "\uffff\1\u050c\1\u050e\1\u0508\17\uffff\1\u0506\6\uffff\1\u0507",
            "\1\u0511\40\uffff\1\u0512\1\uffff\1\u0510\6\uffff\1\u050f",
            "\1\u0519\100\uffff\1\u0513\2\uffff\1\u0514\3\uffff\1\u0517"+
            "\1\u0518\7\uffff\1\u0515\1\uffff\1\u0516",
            "\1\u051a\40\uffff\1\u051b\1\uffff\1\u051c",
            "\1\u051e\42\uffff\1\u051d",
            "\1\u051f",
            "\1\u0522\40\uffff\1\u0523\1\uffff\1\u0521\6\uffff\1\u0520",
            "\1\u052a\100\uffff\1\u0524\2\uffff\1\u0525\3\uffff\1\u0528"+
            "\1\u0529\7\uffff\1\u0526\1\uffff\1\u0527",
            "\1\u052b\40\uffff\1\u052c\1\uffff\1\u052d",
            "\1\u0530\3\uffff\1\u0531\2\uffff\1\u052f\1\u0532\20\uffff\1"+
            "\u052e",
            "\1\u0534\42\uffff\1\u0533",
            "\1\u0539\40\uffff\1\u053a\1\uffff\1\u0538\6\uffff\1\u0537\17"+
            "\uffff\1\u0535\6\uffff\1\u0536",
            "\1\u053b",
            "\1\u053e\40\uffff\1\u053f\1\uffff\1\u053d\6\uffff\1\u053c",
            "\1\u0546\100\uffff\1\u0540\2\uffff\1\u0541\3\uffff\1\u0544"+
            "\1\u0545\7\uffff\1\u0542\1\uffff\1\u0543",
            "\1\u0547\40\uffff\1\u0548\1\uffff\1\u0549",
            "\1\u054c\3\uffff\1\u054d\2\uffff\1\u054b\1\u054e\20\uffff\1"+
            "\u054a",
            "\1\u0550\42\uffff\1\u054f",
            "\1\u0556\40\uffff\1\u0557\1\uffff\1\u0555\6\uffff\1\u0554\17"+
            "\uffff\1\u0552\6\uffff\1\u0553\6\uffff\1\u0551\1\u0558",
            "\1\u0559",
            "\1\u055c\40\uffff\1\u055d\1\uffff\1\u055b\6\uffff\1\u055a",
            "\1\u0564\100\uffff\1\u055e\2\uffff\1\u055f\3\uffff\1\u0562"+
            "\1\u0563\7\uffff\1\u0560\1\uffff\1\u0561",
            "\1\u0565\40\uffff\1\u0566\1\uffff\1\u0567",
            "\1\u056a\3\uffff\1\u056b\2\uffff\1\u0569\1\u056c\20\uffff\1"+
            "\u0568",
            "\1\u056e\42\uffff\1\u056d",
            "\1\u0571\40\uffff\1\u0575\1\uffff\1\u0574\6\uffff\1\u0573\26"+
            "\uffff\1\u0572\6\uffff\1\u056f\1\u0570",
            "\1\u057a\40\uffff\1\u057b\1\uffff\1\u0579\6\uffff\1\u0578\17"+
            "\uffff\1\u0576\6\uffff\1\u0577",
            "\1\u0581\40\uffff\1\u0582\1\uffff\1\u0580\6\uffff\1\u057f\17"+
            "\uffff\1\u057d\6\uffff\1\u057e\6\uffff\1\u057c\1\u0583",
            "\1\u0588\40\uffff\1\u0589\1\uffff\1\u0587\6\uffff\1\u0586\17"+
            "\uffff\1\u0584\6\uffff\1\u0585",
            "\1\u058e\40\uffff\1\u058f\1\uffff\1\u058d\6\uffff\1\u058c\17"+
            "\uffff\1\u058a\6\uffff\1\u058b",
            "\1\u0595\40\uffff\1\u0596\1\uffff\1\u0594\6\uffff\1\u0593\17"+
            "\uffff\1\u0591\6\uffff\1\u0592\6\uffff\1\u0590\1\u0597",
            "\1\u059c\40\uffff\1\u059d\1\uffff\1\u059b\1\uffff\1\u059f\2"+
            "\uffff\1\u059e\1\u05a0\1\u059a\17\uffff\1\u0598\6\uffff\1\u0599",
            "\1\u05a3\40\uffff\1\u05a4\1\uffff\1\u05a2\6\uffff\1\u05a1",
            "\1\u05ab\100\uffff\1\u05a5\2\uffff\1\u05a6\3\uffff\1\u05a9"+
            "\1\u05aa\7\uffff\1\u05a7\1\uffff\1\u05a8",
            "\1\u05ac\40\uffff\1\u05ad\1\uffff\1\u05ae",
            "\1\u05b0\42\uffff\1\u05af",
            "\1\u05b1",
            "\1\u05b4\40\uffff\1\u05b5\1\uffff\1\u05b3\6\uffff\1\u05b2",
            "\1\u05bc\100\uffff\1\u05b6\2\uffff\1\u05b7\3\uffff\1\u05ba"+
            "\1\u05bb\7\uffff\1\u05b8\1\uffff\1\u05b9",
            "\1\u05bd\40\uffff\1\u05be\1\uffff\1\u05bf",
            "\1\u05c2\3\uffff\1\u05c3\2\uffff\1\u05c1\1\u05c4\20\uffff\1"+
            "\u05c0",
            "\1\u05c6\42\uffff\1\u05c5",
            "\1\u05cb\40\uffff\1\u05cc\1\uffff\1\u05ca\6\uffff\1\u05c9\17"+
            "\uffff\1\u05c7\6\uffff\1\u05c8",
            "\1\u05cd",
            "\1\u05d0\40\uffff\1\u05d1\1\uffff\1\u05cf\6\uffff\1\u05ce",
            "\1\u05d8\100\uffff\1\u05d2\2\uffff\1\u05d3\3\uffff\1\u05d6"+
            "\1\u05d7\7\uffff\1\u05d4\1\uffff\1\u05d5",
            "\1\u05d9\40\uffff\1\u05da\1\uffff\1\u05db",
            "\1\u05de\3\uffff\1\u05df\2\uffff\1\u05dd\1\u05e0\20\uffff\1"+
            "\u05dc",
            "\1\u05e2\42\uffff\1\u05e1",
            "\1\u05e8\40\uffff\1\u05e9\1\uffff\1\u05e7\6\uffff\1\u05e6\17"+
            "\uffff\1\u05e4\6\uffff\1\u05e5\6\uffff\1\u05e3\1\u05ea",
            "\1\u05eb",
            "\1\u05ee\40\uffff\1\u05ef\1\uffff\1\u05ed\6\uffff\1\u05ec",
            "\1\u05f6\100\uffff\1\u05f0\2\uffff\1\u05f1\3\uffff\1\u05f4"+
            "\1\u05f5\7\uffff\1\u05f2\1\uffff\1\u05f3",
            "\1\u05f7\40\uffff\1\u05f8\1\uffff\1\u05f9",
            "\1\u05fc\3\uffff\1\u05fd\2\uffff\1\u05fb\1\u05fe\20\uffff\1"+
            "\u05fa",
            "\1\u0600\42\uffff\1\u05ff",
            "\1\u0605\40\uffff\1\u0606\1\uffff\1\u0604\6\uffff\1\u0603\17"+
            "\uffff\1\u0601\6\uffff\1\u0602",
            "\1\u060c\40\uffff\1\u060d\1\uffff\1\u060b\6\uffff\1\u060a\17"+
            "\uffff\1\u0608\6\uffff\1\u0609\6\uffff\1\u0607\1\u060e",
            "\1\u0613\40\uffff\1\u0614\1\uffff\1\u0612\1\uffff\1\u0616\2"+
            "\uffff\1\u0615\1\u0617\1\u0611\17\uffff\1\u060f\6\uffff\1\u0610",
            "\1\u061a\40\uffff\1\u061b\1\uffff\1\u0619\6\uffff\1\u0618",
            "\1\u0622\100\uffff\1\u061c\2\uffff\1\u061d\3\uffff\1\u0620"+
            "\1\u0621\7\uffff\1\u061e\1\uffff\1\u061f",
            "\1\u0623\40\uffff\1\u0624\1\uffff\1\u0625",
            "\1\u0627\42\uffff\1\u0626",
            "\1\u0628",
            "\1\u062b\40\uffff\1\u062c\1\uffff\1\u062a\6\uffff\1\u0629",
            "\1\u0633\100\uffff\1\u062d\2\uffff\1\u062e\3\uffff\1\u0631"+
            "\1\u0632\7\uffff\1\u062f\1\uffff\1\u0630",
            "\1\u0634\40\uffff\1\u0635\1\uffff\1\u0636",
            "\1\u0639\3\uffff\1\u063a\2\uffff\1\u0638\1\u063b\20\uffff\1"+
            "\u0637",
            "\1\u063d\42\uffff\1\u063c",
            "\1\u0642\40\uffff\1\u0643\1\uffff\1\u0641\6\uffff\1\u0640\17"+
            "\uffff\1\u063e\6\uffff\1\u063f",
            "\1\u0644",
            "\1\u0647\40\uffff\1\u0648\1\uffff\1\u0646\6\uffff\1\u0645",
            "\1\u064f\100\uffff\1\u0649\2\uffff\1\u064a\3\uffff\1\u064d"+
            "\1\u064e\7\uffff\1\u064b\1\uffff\1\u064c",
            "\1\u0650\40\uffff\1\u0651\1\uffff\1\u0652",
            "\1\u0655\3\uffff\1\u0656\2\uffff\1\u0654\1\u0657\20\uffff\1"+
            "\u0653",
            "\1\u0659\42\uffff\1\u0658",
            "\1\u065f\40\uffff\1\u0660\1\uffff\1\u065e\6\uffff\1\u065d\17"+
            "\uffff\1\u065b\6\uffff\1\u065c\6\uffff\1\u065a\1\u0661",
            "\1\u0662",
            "\1\u0665\40\uffff\1\u0666\1\uffff\1\u0664\6\uffff\1\u0663",
            "\1\u066d\100\uffff\1\u0667\2\uffff\1\u0668\3\uffff\1\u066b"+
            "\1\u066c\7\uffff\1\u0669\1\uffff\1\u066a",
            "\1\u066e\40\uffff\1\u066f\1\uffff\1\u0670",
            "\1\u0673\3\uffff\1\u0674\2\uffff\1\u0672\1\u0675\20\uffff\1"+
            "\u0671",
            "\1\u0677\42\uffff\1\u0676",
            "\1\u0678",
            "\1\u067b\40\uffff\1\u067c\1\uffff\1\u067a\6\uffff\1\u0679",
            "\1\u0683\100\uffff\1\u067d\2\uffff\1\u067e\3\uffff\1\u0681"+
            "\1\u0682\7\uffff\1\u067f\1\uffff\1\u0680",
            "\1\u0684\40\uffff\1\u0685\1\uffff\1\u0686",
            "\1\u0689\3\uffff\1\u068a\2\uffff\1\u0688\1\u068b\20\uffff\1"+
            "\u0687",
            "\1\u068d\42\uffff\1\u068c",
            "\1\u0692\40\uffff\1\u0693\1\uffff\1\u0691\6\uffff\1\u0690\17"+
            "\uffff\1\u068e\6\uffff\1\u068f",
            "\1\u0694",
            "\1\u0697\40\uffff\1\u0698\1\uffff\1\u0696\6\uffff\1\u0695",
            "\1\u069f\100\uffff\1\u0699\2\uffff\1\u069a\3\uffff\1\u069d"+
            "\1\u069e\7\uffff\1\u069b\1\uffff\1\u069c",
            "\1\u06a0\40\uffff\1\u06a1\1\uffff\1\u06a2",
            "\1\u06a5\3\uffff\1\u06a6\2\uffff\1\u06a4\1\u06a7\20\uffff\1"+
            "\u06a3",
            "\1\u06a9\42\uffff\1\u06a8",
            "\1\u06af\40\uffff\1\u06b0\1\uffff\1\u06ae\6\uffff\1\u06ad\17"+
            "\uffff\1\u06ab\6\uffff\1\u06ac\6\uffff\1\u06aa\1\u06b1",
            "\1\u06b3\55\uffff\1\u06b2",
            "\1\u06b6\40\uffff\1\u06b7\1\uffff\1\u06b5\6\uffff\1\u06b4",
            "\1\u06be\100\uffff\1\u06b8\2\uffff\1\u06b9\3\uffff\1\u06bc"+
            "\1\u06bd\7\uffff\1\u06ba\1\uffff\1\u06bb",
            "\1\u06bf\40\uffff\1\u06c0\1\uffff\1\u06c1",
            "\1\u06c4\3\uffff\1\u06c5\2\uffff\1\u06c3\1\u06c6\20\uffff\1"+
            "\u06c2",
            "\1\u06c8\41\uffff\1\u06d1\1\u06c7\3\uffff\1\u06d0\31\uffff"+
            "\1\u06ca\2\uffff\1\u06cb\3\uffff\1\u06ce\1\u06cf\6\uffff\1\u06c9"+
            "\1\u06cc\1\uffff\1\u06cd",
            "\1\u06d2",
            "\1\u06d3",
            "",
            "\1\u06da\100\uffff\1\u06d4\2\uffff\1\u06d5\3\uffff\1\u06d8"+
            "\1\u06d9\7\uffff\1\u06d6\1\uffff\1\u06d7",
            "\1\u06db\40\uffff\1\u06dc\1\uffff\1\u06dd",
            "\1\u06e0\3\uffff\1\u06e1\2\uffff\1\u06df\1\u06e2\20\uffff\1"+
            "\u06de",
            "\1\u06e4\42\uffff\1\u06e3",
            "\1\u06ea\103\uffff\1\u06e5\3\uffff\1\u06e8\1\u06e9\7\uffff"+
            "\1\u06e6\1\uffff\1\u06e7",
            "\1\u06ef\107\uffff\1\u06ed\1\u06ee\7\uffff\1\u06eb\1\uffff"+
            "\1\u06ec",
            "\1\u06f3\107\uffff\1\u06f1\1\u06f2\11\uffff\1\u06f0",
            "\1\u06f6\42\uffff\1\u06f9\1\uffff\1\u06fa\4\uffff\1\u06f8\2"+
            "\uffff\1\u06fb\23\uffff\1\u06f7\6\uffff\1\u06f4\1\u06f5",
            "\1\u06ff\1\uffff\1\u0700\4\uffff\1\u06fe\2\uffff\1\u0701\14"+
            "\uffff\1\u06fc\6\uffff\1\u06fd",
            "\1\u0706\1\uffff\1\u0707\4\uffff\1\u0705\2\uffff\1\u0708\14"+
            "\uffff\1\u0703\6\uffff\1\u0704\6\uffff\1\u0702\1\u0709",
            "\1\u070d\1\uffff\1\u070e\4\uffff\1\u070c\2\uffff\1\u070f\14"+
            "\uffff\1\u070a\6\uffff\1\u070b",
            "\1\u0712\3\uffff\1\u0713\2\uffff\1\u0711\1\u0714\20\uffff\1"+
            "\u0710",
            "\1\u0716\42\uffff\1\u0715",
            "\1\u0717\40\uffff\1\u0718\1\uffff\1\u0719",
            "\1\u071a\42\uffff\1\u071b",
            "\1\u071c",
            "\1\u0720\40\uffff\1\u0721\1\uffff\1\u071f\6\uffff\1\u071e\17"+
            "\uffff\1\u0722\6\uffff\1\u071d",
            "\1\u0729\100\uffff\1\u0723\2\uffff\1\u0724\3\uffff\1\u0727"+
            "\1\u0728\7\uffff\1\u0725\1\uffff\1\u0726",
            "\1\u072a\40\uffff\1\u072b\1\uffff\1\u072c",
            "\1\u072f\3\uffff\1\u0730\2\uffff\1\u072e\1\u0731\20\uffff\1"+
            "\u072d",
            "\1\u0733\42\uffff\1\u0732",
            "\1\u0739\103\uffff\1\u0734\3\uffff\1\u0737\1\u0738\7\uffff"+
            "\1\u0735\1\uffff\1\u0736",
            "\1\u073e\107\uffff\1\u073c\1\u073d\7\uffff\1\u073a\1\uffff"+
            "\1\u073b",
            "\1\u0742\107\uffff\1\u0740\1\u0741\11\uffff\1\u073f",
            "\1\u0745\42\uffff\1\u0748\1\uffff\1\u0749\4\uffff\1\u0747\2"+
            "\uffff\1\u074a\23\uffff\1\u0746\6\uffff\1\u0743\1\u0744",
            "\1\u074e\1\uffff\1\u074f\4\uffff\1\u074d\2\uffff\1\u0750\14"+
            "\uffff\1\u074b\6\uffff\1\u074c",
            "\1\u0755\1\uffff\1\u0756\4\uffff\1\u0754\2\uffff\1\u0757\14"+
            "\uffff\1\u0752\6\uffff\1\u0753\6\uffff\1\u0751\1\u0758",
            "\1\u075c\1\uffff\1\u075d\4\uffff\1\u075b\2\uffff\1\u075e\14"+
            "\uffff\1\u0759\6\uffff\1\u075a",
            "\1\u0761\3\uffff\1\u0762\2\uffff\1\u0760\1\u0763\20\uffff\1"+
            "\u075f",
            "\1\u0765\42\uffff\1\u0764",
            "\1\u0766\40\uffff\1\u0767\1\uffff\1\u0768",
            "\1\u0769\55\uffff\1\u076a",
            "\1\u076b",
            "\1\u0773\41\uffff\1\u0775\4\uffff\1\u0774\31\uffff\1\u076d"+
            "\2\uffff\1\u076e\3\uffff\1\u0771\1\u0772\6\uffff\1\u076c\1\u076f"+
            "\1\uffff\1\u0770",
            "\1\u0776",
            "",
            "\1\u0777\42\uffff\1\u0778",
            "\1\u0779",
            "\1\u077a",
            "\1\u077d\40\uffff\1\u077e\1\uffff\1\u077c\6\uffff\1\u077b",
            "\1\u0785\100\uffff\1\u077f\2\uffff\1\u0780\3\uffff\1\u0783"+
            "\1\u0784\7\uffff\1\u0781\1\uffff\1\u0782",
            "\1\u0786\40\uffff\1\u0787\1\uffff\1\u0788",
            "\1\u078b\3\uffff\1\u078c\2\uffff\1\u078a\1\u078d\20\uffff\1"+
            "\u0789",
            "\1\u078f\42\uffff\1\u078e",
            "\1\u0793\40\uffff\1\u0794\1\uffff\1\u0792\6\uffff\1\u0791\17"+
            "\uffff\1\u0795\6\uffff\1\u0790",
            "\1\u079c\100\uffff\1\u0796\2\uffff\1\u0797\3\uffff\1\u079a"+
            "\1\u079b\7\uffff\1\u0798\1\uffff\1\u0799",
            "\1\u079d\40\uffff\1\u079e\1\uffff\1\u079f",
            "\1\u07a2\3\uffff\1\u07a3\2\uffff\1\u07a1\1\u07a4\20\uffff\1"+
            "\u07a0",
            "\1\u07a6\42\uffff\1\u07a5",
            "\1\u07ac\103\uffff\1\u07a7\3\uffff\1\u07aa\1\u07ab\7\uffff"+
            "\1\u07a8\1\uffff\1\u07a9",
            "\1\u07b1\107\uffff\1\u07af\1\u07b0\7\uffff\1\u07ad\1\uffff"+
            "\1\u07ae",
            "\1\u07b5\107\uffff\1\u07b3\1\u07b4\11\uffff\1\u07b2",
            "\1\u07b8\42\uffff\1\u07bb\1\uffff\1\u07bc\4\uffff\1\u07ba\2"+
            "\uffff\1\u07bd\23\uffff\1\u07b9\6\uffff\1\u07b6\1\u07b7",
            "\1\u07c1\1\uffff\1\u07c2\4\uffff\1\u07c0\2\uffff\1\u07c3\14"+
            "\uffff\1\u07be\6\uffff\1\u07bf",
            "\1\u07c8\1\uffff\1\u07c9\4\uffff\1\u07c7\2\uffff\1\u07ca\14"+
            "\uffff\1\u07c5\6\uffff\1\u07c6\6\uffff\1\u07c4\1\u07cb",
            "\1\u07cf\1\uffff\1\u07d0\4\uffff\1\u07ce\2\uffff\1\u07d1\14"+
            "\uffff\1\u07cc\6\uffff\1\u07cd",
            "\1\u07d4\3\uffff\1\u07d5\2\uffff\1\u07d3\1\u07d6\20\uffff\1"+
            "\u07d2",
            "\1\u07d8\42\uffff\1\u07d7",
            "\1\u07d9\40\uffff\1\u07da\1\uffff\1\u07db",
            "\1\u07dc\55\uffff\1\u07dd",
            "\1\u07de",
            "\1\u07e6\41\uffff\1\u07e8\4\uffff\1\u07e7\31\uffff\1\u07e0"+
            "\2\uffff\1\u07e1\3\uffff\1\u07e4\1\u07e5\6\uffff\1\u07df\1\u07e2"+
            "\1\uffff\1\u07e3",
            "\1\u07e9",
            "",
            "\1\u07ea\42\uffff\1\u07eb",
            "\1\u07ec",
            "\1\u07f1\40\uffff\1\u07f2\1\uffff\1\u07f0\6\uffff\1\u07ef\17"+
            "\uffff\1\u07ed\6\uffff\1\u07ee",
            "\1\u07f3",
            "\1\u07f6\40\uffff\1\u07f7\1\uffff\1\u07f5\6\uffff\1\u07f4",
            "\1\u07fe\100\uffff\1\u07f8\2\uffff\1\u07f9\3\uffff\1\u07fc"+
            "\1\u07fd\7\uffff\1\u07fa\1\uffff\1\u07fb",
            "\1\u07ff\40\uffff\1\u0800\1\uffff\1\u0801",
            "\1\u0804\3\uffff\1\u0805\2\uffff\1\u0803\1\u0806\20\uffff\1"+
            "\u0802",
            "\1\u0808\42\uffff\1\u0807",
            "\1\u080e\40\uffff\1\u080f\1\uffff\1\u080d\6\uffff\1\u080c\17"+
            "\uffff\1\u080a\6\uffff\1\u080b\6\uffff\1\u0809\1\u0810",
            "\1\u0814\40\uffff\1\u0815\1\uffff\1\u0813\6\uffff\1\u0812\17"+
            "\uffff\1\u0816\6\uffff\1\u0811",
            "\1\u081d\100\uffff\1\u0817\2\uffff\1\u0818\3\uffff\1\u081b"+
            "\1\u081c\7\uffff\1\u0819\1\uffff\1\u081a",
            "\1\u081e\40\uffff\1\u081f\1\uffff\1\u0820",
            "\1\u0823\3\uffff\1\u0824\2\uffff\1\u0822\1\u0825\20\uffff\1"+
            "\u0821",
            "\1\u0827\42\uffff\1\u0826",
            "\1\u082d\103\uffff\1\u0828\3\uffff\1\u082b\1\u082c\7\uffff"+
            "\1\u0829\1\uffff\1\u082a",
            "\1\u0832\107\uffff\1\u0830\1\u0831\7\uffff\1\u082e\1\uffff"+
            "\1\u082f",
            "\1\u0836\107\uffff\1\u0834\1\u0835\11\uffff\1\u0833",
            "\1\u0839\42\uffff\1\u083c\1\uffff\1\u083d\4\uffff\1\u083b\2"+
            "\uffff\1\u083e\23\uffff\1\u083a\6\uffff\1\u0837\1\u0838",
            "\1\u0842\1\uffff\1\u0843\4\uffff\1\u0841\2\uffff\1\u0844\14"+
            "\uffff\1\u083f\6\uffff\1\u0840",
            "\1\u0849\1\uffff\1\u084a\4\uffff\1\u0848\2\uffff\1\u084b\14"+
            "\uffff\1\u0846\6\uffff\1\u0847\6\uffff\1\u0845\1\u084c",
            "\1\u0850\1\uffff\1\u0851\4\uffff\1\u084f\2\uffff\1\u0852\14"+
            "\uffff\1\u084d\6\uffff\1\u084e",
            "\1\u0855\3\uffff\1\u0856\2\uffff\1\u0854\1\u0857\20\uffff\1"+
            "\u0853",
            "\1\u0859\42\uffff\1\u0858",
            "\1\u085a\40\uffff\1\u085b\1\uffff\1\u085c",
            "\1\u085d\55\uffff\1\u085e",
            "\1\u085f",
            "\1\u0867\41\uffff\1\u0869\4\uffff\1\u0868\31\uffff\1\u0861"+
            "\2\uffff\1\u0862\3\uffff\1\u0865\1\u0866\6\uffff\1\u0860\1\u0863"+
            "\1\uffff\1\u0864",
            "\1\u086a",
            "",
            "\1\u086b\42\uffff\1\u086c",
            "\1\u086d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "261:27: ( simple_fields_declaration )?";
        }
    }
    static final String DFA78_eotS =
        "\162\uffff";
    static final String DFA78_eofS =
        "\162\uffff";
    static final String DFA78_minS =
        "\1\16\2\uffff\1\16\7\uffff\1\33\4\uffff\1\16\1\uffff\2\16\2\uffff"+
        "\1\16\1\uffff\7\16\3\uffff\1\16\117\uffff";
    static final String DFA78_maxS =
        "\1\127\2\uffff\1\117\7\uffff\1\111\4\uffff\1\141\1\uffff\1\141\1"+
        "\135\2\uffff\1\117\1\uffff\3\141\1\127\1\117\1\127\1\117\3\uffff"+
        "\1\117\117\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\60\uffff\1\1\1\uffff\3\1\2\uffff\25\1\2"+
        "\uffff\4\1\3\uffff\5\1\2\uffff\1\1\1\uffff\4\1\1\uffff\1\1\11\uffff";
    static final String DFA78_specialS =
        "\162\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\3\40\uffff\3\4\1\uffff\1\4\4\uffff\1\4\2\uffff\1\4\23\uffff"+
            "\1\4\6\uffff\2\1",
            "",
            "",
            "\1\1\40\uffff\1\22\1\23\1\1\1\uffff\1\20\2\uffff\2\4\1\1\2"+
            "\uffff\1\1\14\uffff\1\13\6\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\55\uffff\1\26",
            "",
            "",
            "",
            "",
            "\1\36\46\uffff\1\4\31\uffff\1\30\2\uffff\1\31\3\uffff\1\34"+
            "\1\35\6\uffff\1\4\1\32\1\uffff\1\33",
            "",
            "\1\42\41\uffff\1\4\1\1\3\uffff\1\4\31\uffff\1\4\2\uffff\1\4"+
            "\3\uffff\2\4\6\uffff\2\4\1\uffff\1\4",
            "\1\1\50\uffff\1\4\23\uffff\1\4\2\uffff\1\1\1\uffff\1\1\3\uffff"+
            "\1\1\3\uffff\4\1\1\uffff\1\1",
            "",
            "",
            "\1\1\40\uffff\1\67\1\70\1\1\1\uffff\1\65\2\uffff\2\4\1\1\2"+
            "\uffff\1\1\14\uffff\1\71\6\uffff\1\1",
            "",
            "\1\101\103\uffff\1\74\3\uffff\1\77\1\100\7\uffff\1\75\1\uffff"+
            "\1\76",
            "\1\106\107\uffff\1\104\1\105\7\uffff\1\102\1\uffff\1\103",
            "\1\112\107\uffff\1\110\1\111\11\uffff\1\107",
            "\1\115\42\uffff\1\120\1\uffff\1\1\4\uffff\1\117\2\uffff\1\1"+
            "\23\uffff\1\116\6\uffff\1\113\1\114",
            "\1\4\42\uffff\1\126\1\uffff\1\1\4\uffff\1\125\2\uffff\1\1\14"+
            "\uffff\1\123\6\uffff\1\124",
            "\1\4\42\uffff\1\136\1\uffff\1\1\4\uffff\1\135\2\uffff\1\1\14"+
            "\uffff\1\133\6\uffff\1\134\6\uffff\1\132\1\141",
            "\1\4\42\uffff\1\146\1\uffff\1\150\2\uffff\2\4\1\145\2\uffff"+
            "\1\1\14\uffff\1\143\6\uffff\1\144",
            "",
            "",
            "",
            "\1\4\41\uffff\1\1\1\4\6\uffff\1\4\17\uffff\1\4\6\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "315:45: ( type_dec )?";
        }
    }
 

    public static final BitSet FOLLOW_code_internal_in_code186 = new BitSet(new long[]{0xA014000000004002L,0x00000002D0ECB455L});
    public static final BitSet FOLLOW_class_declaration_in_code_internal199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_wrapper_in_code_internal206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_wrapper_in_code_internal213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_wrapper_in_code_internal218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_wrapper_in_code_internal224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declarations_in_code_internal230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_code_internal235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_code_internal240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_garbage_in_code_internal245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_garbage257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_garbage262 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_garbage264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_garbage266 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_garbage268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_enum_wrapper282 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_enum_wrapper284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declatation_in_extern_declarations304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations325 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_method_declaration_wrapper_in_declarations328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_prefix_in_declarations333 = new BitSet(new long[]{0x0000000000004000L,0x0000000290E4A001L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations336 = new BitSet(new long[]{0x0000000000004000L,0x0000000290E4A000L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_declarations339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ns_inline_in_declarations344 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001BFFFFFFFFL});
    public static final BitSet FOLLOW_100_in_declarations354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_static_prefix367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_in_method_declaration_wrapper386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_in_field_declaration_wrapper404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_property_prefix422 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_property_prefix424 = new BitSet(new long[]{0x0000000000000000L,0x000000002F014000L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix426 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_property_prefix429 = new BitSet(new long[]{0x0000000000000000L,0x000000002F014000L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix431 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_property_prefix435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_optional_prefix446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ns_inline456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_in_interface_declaration_wrapper509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_in_protocol_declaration_wrapper527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_in_typedef_declaration_wrapper544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_typedef_declaration561 = new BitSet(new long[]{0x0000000000004000L,0x0000000140040000L});
    public static final BitSet FOLLOW_typedef_internal_in_typedef_declaration563 = new BitSet(new long[]{0x0080800000004002L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_declaration566 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_func_pointer_in_typedef_declaration570 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_typedef_declaration574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_func_pointer585 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_49_in_func_pointer587 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer590 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_func_pointer592 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_func_pointer594 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer597 = new BitSet(new long[]{0x000B000000000000L});
    public static final BitSet FOLLOW_49_in_func_pointer600 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer603 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_func_pointer608 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer612 = new BitSet(new long[]{0x000B000000000000L});
    public static final BitSet FOLLOW_49_in_func_pointer615 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer618 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_53_in_func_pointer625 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_func_pointer633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_enum_wrapper2_in_typedef_internal645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_rename_in_typedef_internal652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_typedef_internal659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_wrapper_in_typedef_internal664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_in_union_declaration_wrapper676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_union_declaration695 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_union_declaration700 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_typedef_struct_in_union_declaration705 = new BitSet(new long[]{0x0000000000000000L,0x0000001040000000L});
    public static final BitSet FOLLOW_100_in_union_declaration710 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_union_name_in_union_declaration712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_union_internal726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_union_internal731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_rename742 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_typedef_rename744 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_typedef_enum_wrapper2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_enum_declaration787 = new BitSet(new long[]{0x0000000000004000L,0x0000000400000000L});
    public static final BitSet FOLLOW_struct_name_in_enum_declaration789 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_enum_declaration792 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration794 = new BitSet(new long[]{0x0008000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_51_in_enum_declaration797 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration799 = new BitSet(new long[]{0x0008000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_51_in_enum_declaration803 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_enum_declaration806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_typedef_struct_wrapper817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_typedef_struct835 = new BitSet(new long[]{0x0080000000004002L,0x0000000400000000L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_struct837 = new BitSet(new long[]{0x0080000000004002L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_typedef_struct843 = new BitSet(new long[]{0x0000000000004000L,0x00000002C0C48000L});
    public static final BitSet FOLLOW_struct_field_wrapper_in_typedef_struct848 = new BitSet(new long[]{0x0000000000004000L,0x00000012C0C48000L});
    public static final BitSet FOLLOW_100_in_typedef_struct853 = new BitSet(new long[]{0x0080000000004002L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct858 = new BitSet(new long[]{0x0088000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_array_size_in_typedef_struct860 = new BitSet(new long[]{0x0088000000000002L});
    public static final BitSet FOLLOW_51_in_typedef_struct864 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct866 = new BitSet(new long[]{0x0088000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_array_size_in_typedef_struct868 = new BitSet(new long[]{0x0088000000000002L});
    public static final BitSet FOLLOW_55_in_typedef_struct875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_struct_name888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field_in_struct_field_wrapper906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field1_in_struct_field924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field2_in_struct_field929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_struct_field1941 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1943 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_51_in_struct_field1946 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1948 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_55_in_struct_field1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_struct_field2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_name973 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_typedef_name975 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_declaration_element1013 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_typedef_declaration_element1016 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element1025 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_typedef_declaration_element1028 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression_in_element_value1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression1065 = new BitSet(new long[]{0x1200600000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_op2_in_simple_expression1069 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression1071 = new BitSet(new long[]{0x1200600000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_simple_expression21085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_expression21090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_simple_expression21095 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_simple_expression_in_simple_expression21097 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_simple_expression21099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_class_declaration1134 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_class_declaration1136 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_51_in_class_declaration1139 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_class_declaration1141 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_55_in_class_declaration1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_protocol_declaration1155 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_protocol_name_in_protocol_declaration1157 = new BitSet(new long[]{0x4194000000004000L,0x0000000290E4A045L});
    public static final BitSet FOLLOW_generic_in_protocol_declaration1159 = new BitSet(new long[]{0x4094000000004000L,0x0000000290E4A045L});
    public static final BitSet FOLLOW_protocol_end_in_protocol_declaration1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end1_in_protocol_end1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end2_in_protocol_end1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_protocol_end11191 = new BitSet(new long[]{0x4014000000004000L,0x0000000290E4A045L});
    public static final BitSet FOLLOW_62_in_protocol_end11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_protocol_end21208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_generic1221 = new BitSet(new long[]{0x0000000000004000L,0x0000000280C48000L});
    public static final BitSet FOLLOW_generic_internal_in_generic1223 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_generic1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1234 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_generic_internal1237 = new BitSet(new long[]{0x0000000000004000L,0x0000000280C48000L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1239 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ID_in_protocol_name1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_interface_declaration1271 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_interface_name_in_interface_declaration1273 = new BitSet(new long[]{0x4054000000004000L,0x0000000690E4A045L});
    public static final BitSet FOLLOW_54_in_interface_declaration1276 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_superclass_name_in_interface_declaration1278 = new BitSet(new long[]{0x4014000000004000L,0x0000000690E4A045L});
    public static final BitSet FOLLOW_interface_body_in_interface_declaration1283 = new BitSet(new long[]{0x4014000000004000L,0x0000000290E4A045L});
    public static final BitSet FOLLOW_declarations_in_interface_declaration1287 = new BitSet(new long[]{0x4014000000004000L,0x0000000290E4A045L});
    public static final BitSet FOLLOW_62_in_interface_declaration1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_interface_body1304 = new BitSet(new long[]{0x0000000000004000L,0x00000013D0E4A02AL});
    public static final BitSet FOLLOW_interface_body_item_in_interface_body1308 = new BitSet(new long[]{0x0000000000004000L,0x00000013D0E4A02AL});
    public static final BitSet FOLLOW_100_in_interface_body1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_modifier_wrapper_in_interface_body_item1324 = new BitSet(new long[]{0x0000000000004002L,0x0000000290E4A000L});
    public static final BitSet FOLLOW_simple_fields_declaration_in_interface_body_item1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_fields_declaration_in_interface_body_item1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_wrapper_in_interface_body_item1337 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_interface_body_item1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_interface_body_item1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_union_name1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_modifier_in_group_modifier_wrapper1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_interface_name1413 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_category_in_interface_name1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_category1434 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_category1436 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_category1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_superclass_name1455 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_generic_in_superclass_name1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_simple_fields_declaration1479 = new BitSet(new long[]{0x0000000000004002L,0x0000000290E4A000L});
    public static final BitSet FOLLOW_77_in_field_declaration1499 = new BitSet(new long[]{0x0000000000004000L,0x0000000290E48000L});
    public static final BitSet FOLLOW_static_prefix_in_field_declaration1502 = new BitSet(new long[]{0x0000000000004000L,0x0000000280E48000L});
    public static final BitSet FOLLOW_85_in_field_declaration1505 = new BitSet(new long[]{0x0000000000004000L,0x0000000280C48000L});
    public static final BitSet FOLLOW_type_declaration_in_field_declaration1508 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1512 = new BitSet(new long[]{0x0088800000000000L});
    public static final BitSet FOLLOW_classical_method_params_in_field_declaration1515 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_51_in_field_declaration1520 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1522 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_func_pointer_in_field_declaration1530 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_field_declaration1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_classical_method_params1543 = new BitSet(new long[]{0x0021000000004000L,0x00000002C0C48000L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1546 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_classical_method_params1549 = new BitSet(new long[]{0x0020000000004000L,0x00000002C0C48000L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1551 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_classical_method_params1557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_attribute_in_classical_method_params1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_attribute1573 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_attribute1575 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_attribute_internal_in_attribute1577 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_attribute1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_internal1_in_attribute_internal1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_attribute_internal11600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_attribute_internal11602 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_attribute_internal11604 = new BitSet(new long[]{0x0001000008004000L});
    public static final BitSet FOLLOW_format_item_in_attribute_internal11607 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_attribute_internal11610 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_format_item_in_attribute_internal11612 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_attribute_internal11618 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_attribute_internal11620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_classical_param1645 = new BitSet(new long[]{0x0000000000004000L,0x0000000280C48000L});
    public static final BitSet FOLLOW_type_declaration_in_classical_param1648 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_classical_param1650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_classical_param1653 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_classical_param1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_classical_param1658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_53_in_classical_param1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_internal_in_type_declaration1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_type_declaration_internal1694 = new BitSet(new long[]{0x0000000000004000L,0x0000000280C40000L});
    public static final BitSet FOLLOW_82_in_type_declaration_internal1697 = new BitSet(new long[]{0x0000000000004000L,0x0000000280C00000L});
    public static final BitSet FOLLOW_95_in_type_declaration_internal1700 = new BitSet(new long[]{0x0000000000004000L,0x0000000200C00000L});
    public static final BitSet FOLLOW_97_in_type_declaration_internal1705 = new BitSet(new long[]{0x0102000000004002L,0x0000000000C08000L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration_internal1707 = new BitSet(new long[]{0x0102000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration_internal1713 = new BitSet(new long[]{0x0102000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_type_declaration_internal1716 = new BitSet(new long[]{0x0102000000000002L});
    public static final BitSet FOLLOW_generic_in_type_declaration_internal1719 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_type_declaration_internal1722 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_type_dec_internal_in_type_dec1731 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_type_dec1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_type_dec1736 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_knownTypes_in_type_dec_internal1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_dec_internal1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_knownTypes1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_knownTypes1774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_86_in_knownTypes1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_name1790 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_array_size_in_field_name1792 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_field_crap_in_field_name1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_array_size1821 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_array_size1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_array_size1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_crap1835 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NUMBER_in_field_crap1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_wrapper_in_method_declaration1847 = new BitSet(new long[]{0x0000800000004000L,0x000000002F014000L});
    public static final BitSet FOLLOW_method_declaration_variants_in_method_declaration1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_in_method_modifier_wrapper1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_common_in_method_declaration_variants1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_method_declaration_common1908 = new BitSet(new long[]{0x0000000000004000L,0x00000002C0C48000L});
    public static final BitSet FOLLOW_94_in_method_declaration_common1910 = new BitSet(new long[]{0x0000000000004000L,0x0000000280C48000L});
    public static final BitSet FOLLOW_type_declaration_in_method_declaration_common1913 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_method_declaration_common1915 = new BitSet(new long[]{0x0000000000004000L,0x000000002F014000L});
    public static final BitSet FOLLOW_method_name_in_method_declaration_common1919 = new BitSet(new long[]{0x00C8000000004000L});
    public static final BitSet FOLLOW_method_params_in_method_declaration_common1921 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_method_declaration_common1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method_name1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_prefix_param_in_method_name1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_param_in_method_params1971 = new BitSet(new long[]{0x0048000000004002L});
    public static final BitSet FOLLOW_prefix_in_method_param1990 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_method_param1993 = new BitSet(new long[]{0x0000800000004000L,0x0000000000100000L});
    public static final BitSet FOLLOW_47_in_method_param1996 = new BitSet(new long[]{0x0000000000004000L,0x0000000280C48000L});
    public static final BitSet FOLLOW_type_declaration_in_method_param1998 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_method_param2000 = new BitSet(new long[]{0x0000000000004000L,0x0000000000100000L});
    public static final BitSet FOLLOW_param_name_in_method_param2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_method_param2028 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_method_param2030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_method_param2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param_name2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_param_name2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_prefix2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_extern_declatation2090 = new BitSet(new long[]{0x0000000000004000L,0x0000000290E4A000L});
    public static final BitSet FOLLOW_field_declaration_in_extern_declatation2092 = new BitSet(new long[]{0x0000000000000002L});

}