// $ANTLR 3.4 C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g 2013-09-30 13:19:28

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ObjcmLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__171=171;
    public static final int T__172=172;
    public static final int T__173=173;
    public static final int T__174=174;
    public static final int T__175=175;
    public static final int T__176=176;
    public static final int T__177=177;
    public static final int T__178=178;
    public static final int T__179=179;
    public static final int T__180=180;
    public static final int T__181=181;
    public static final int T__182=182;
    public static final int T__183=183;
    public static final int T__184=184;
    public static final int T__185=185;
    public static final int T__186=186;
    public static final int T__187=187;
    public static final int T__188=188;
    public static final int T__189=189;
    public static final int T__190=190;
    public static final int T__191=191;
    public static final int T__192=192;
    public static final int T__193=193;
    public static final int T__194=194;
    public static final int T__195=195;
    public static final int T__196=196;
    public static final int T__197=197;
    public static final int T__198=198;
    public static final int T__199=199;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int T__202=202;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int T__210=210;
    public static final int T__211=211;
    public static final int ARRAY_INIT=4;
    public static final int ASSIGN=5;
    public static final int ASTERISK=6;
    public static final int BLOCK=7;
    public static final int BREAK=8;
    public static final int BREAK_WORD=9;
    public static final int CASE_BODY=10;
    public static final int CASE_EXPR=11;
    public static final int CASE_STMT=12;
    public static final int CATCH_STMT=13;
    public static final int CATEGORY=14;
    public static final int CLASSICAL_EXPR=15;
    public static final int CLASSICAL_EXPR_2=16;
    public static final int COLON=17;
    public static final int COMMA=18;
    public static final int CONST_EXPR=19;
    public static final int CONST_EXPR2=20;
    public static final int CONST_PREFIX=21;
    public static final int DEFAULT_BODY=22;
    public static final int DEFAULT_STMT=23;
    public static final int DIGIT=24;
    public static final int DOT=25;
    public static final int ENCODE=26;
    public static final int ENUM=27;
    public static final int ENUM_PREFIX=28;
    public static final int ESC=29;
    public static final int EXC_TYPE=30;
    public static final int EXPR=31;
    public static final int EXPR_ADD=32;
    public static final int EXPR_AND=33;
    public static final int EXPR_AND_AND=34;
    public static final int EXPR_ASSIGN=35;
    public static final int EXPR_COND=36;
    public static final int EXPR_EQ=37;
    public static final int EXPR_FULL=38;
    public static final int EXPR_MOV=39;
    public static final int EXPR_MULT=40;
    public static final int EXPR_NOT=41;
    public static final int EXPR_OR=42;
    public static final int EXPR_OR_OR=43;
    public static final int EXPR_QUESTION=44;
    public static final int EXPR_UNNAME=45;
    public static final int EXPR_XOR=46;
    public static final int EXTERN=47;
    public static final int FIELD=48;
    public static final int FIELD_ACCESS=49;
    public static final int FIELD_TYPE_STARTED=50;
    public static final int FINALLY_BLOCK=51;
    public static final int FOR_IN_STMT=52;
    public static final int FOR_STMT=53;
    public static final int FOR_STMT_EXPR=54;
    public static final int FUNCTION=55;
    public static final int GENERIC=56;
    public static final int GOTO=57;
    public static final int ID=58;
    public static final int IF_BLOCK=59;
    public static final int IF_EXPR=60;
    public static final int IF_STMT=61;
    public static final int IMPLEMENTATION=62;
    public static final int INCOMPLETE_PREFIX=63;
    public static final int INDEX=64;
    public static final int INDEX_NUMBER=65;
    public static final int INTERFACE=66;
    public static final int LETTER=67;
    public static final int L_AND=68;
    public static final int L_AND_AND=69;
    public static final int L_AND_EQ=70;
    public static final int L_BR=71;
    public static final int L_BR_TOKEN=72;
    public static final int L_DIV=73;
    public static final int L_DIV_EQ=74;
    public static final int L_EQ=75;
    public static final int L_EQ_EQ=76;
    public static final int L_FBR=77;
    public static final int L_KBR=78;
    public static final int L_LEFT=79;
    public static final int L_LEFT_EQ=80;
    public static final int L_LESS=81;
    public static final int L_LESS_EQ=82;
    public static final int L_MINUS=83;
    public static final int L_MINUS_EQ=84;
    public static final int L_MINUS_MINUS=85;
    public static final int L_MORE=86;
    public static final int L_MORE_EQ=87;
    public static final int L_MULT_EQ=88;
    public static final int L_NEQ=89;
    public static final int L_NOT=90;
    public static final int L_OR=91;
    public static final int L_OR_EQ=92;
    public static final int L_OR_OR=93;
    public static final int L_PERC=94;
    public static final int L_PERC_EQ=95;
    public static final int L_PLUS=96;
    public static final int L_PLUS_EQ=97;
    public static final int L_PLUS_PLUS=98;
    public static final int L_QUESTION=99;
    public static final int L_RIGHT=100;
    public static final int L_RIGHT_EQ=101;
    public static final int L_TILDA=102;
    public static final int L_XOR=103;
    public static final int L_XOR_EQ=104;
    public static final int MESSAGE=105;
    public static final int METHOD=106;
    public static final int METHOD_CALL=107;
    public static final int METHOD_MSG=108;
    public static final int METHOD_NAME=109;
    public static final int MODIFIER=110;
    public static final int MSG_LIST=111;
    public static final int MULTI_COMMENT=112;
    public static final int M_IMPORT=113;
    public static final int M_TYPE_START=114;
    public static final int NAME=115;
    public static final int NOT=116;
    public static final int NUMBER=117;
    public static final int OBJECT=118;
    public static final int OP=119;
    public static final int OPER=120;
    public static final int OPERATOR=121;
    public static final int PARAM=122;
    public static final int PREFIX=123;
    public static final int PREPROCESSOR_DECLARATION=124;
    public static final int PROTOCOL=125;
    public static final int RETURN_STMT=126;
    public static final int R_BR=127;
    public static final int R_FBR=128;
    public static final int R_KBR=129;
    public static final int SELECTOR=130;
    public static final int SELECTOR_VALUE=131;
    public static final int SEMICOLON=132;
    public static final int SIMPLE_EXPR=133;
    public static final int SINGLE_COMMENT=134;
    public static final int SINGLE_OP=135;
    public static final int SIZEOF=136;
    public static final int STATIC=137;
    public static final int STATIC_METHOD=138;
    public static final int STATIC_PREFIX=139;
    public static final int STATIC_START=140;
    public static final int STATIC_TYPE=141;
    public static final int STRING=142;
    public static final int STRING_LITERAL=143;
    public static final int STRING_LITERAL2=144;
    public static final int STRING_LITERAL3=145;
    public static final int STRUCT_FIELD=146;
    public static final int STRUCT_INIT=147;
    public static final int STRUCT_PREFIX=148;
    public static final int STRUCT_VARIABLE=149;
    public static final int SUPER_CLASS=150;
    public static final int SWITCH=151;
    public static final int SWITCH_BODY=152;
    public static final int SWITCH_EXPRESSION=153;
    public static final int THROW_EXCEPTION=154;
    public static final int THROW_STMT=155;
    public static final int TRY_STMT=156;
    public static final int TYPE=157;
    public static final int TYPEDEF=158;
    public static final int TYPEDEF_ELEMENT=159;
    public static final int TYPEDEF_STRUCT=160;
    public static final int TYPE_CONVERTION=161;
    public static final int TYPE_CONVERTION2=162;
    public static final int TYPE_RENAME=163;
    public static final int VALUE=164;
    public static final int VARIABLE_INIT=165;
    public static final int VA_ARGS=166;
    public static final int VOID=167;
    public static final int WHILE_EXPR=168;
    public static final int WHILE_STMT=169;
    public static final int WS=170;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ObjcmLexer() {} 
    public ObjcmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ObjcmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g"; }

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:6:8: ( '\"C\"' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:6:10: '\"C\"'
            {
            match("\"C\""); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:7:8: ( '->' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:7:10: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:8:8: ( '...' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:8:10: '...'
            {
            match("..."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:9:8: ( '@catch' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:9:10: '@catch'
            {
            match("@catch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:10:8: ( '@encode' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:10:10: '@encode'
            {
            match("@encode"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:11:8: ( '@end' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:11:10: '@end'
            {
            match("@end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:12:8: ( '@finally' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:12:10: '@finally'
            {
            match("@finally"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:13:8: ( '@implementation' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:13:10: '@implementation'
            {
            match("@implementation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:14:8: ( '@interface' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:14:10: '@interface'
            {
            match("@interface"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:15:8: ( '@private' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:15:10: '@private'
            {
            match("@private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:16:8: ( '@property' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:16:10: '@property'
            {
            match("@property"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:17:8: ( '@protocol' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:17:10: '@protocol'
            {
            match("@protocol"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:18:8: ( '@public' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:18:10: '@public'
            {
            match("@public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:19:8: ( '@selector' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:19:10: '@selector'
            {
            match("@selector"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:20:8: ( '@synthesize' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:20:10: '@synthesize'
            {
            match("@synthesize"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:21:8: ( '@throw' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:21:10: '@throw'
            {
            match("@throw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:22:8: ( '@try' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:22:10: '@try'
            {
            match("@try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:23:8: ( 'Nil' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:23:10: 'Nil'
            {
            match("Nil"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:24:8: ( '__attribute__' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:24:10: '__attribute__'
            {
            match("__attribute__"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:25:8: ( '__typeof__' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:25:10: '__typeof__'
            {
            match("__typeof__"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:26:8: ( 'assign' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:26:10: 'assign'
            {
            match("assign"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:27:8: ( 'case' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:27:10: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "T__193"
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:28:8: ( 'constructor' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:28:10: 'constructor'
            {
            match("constructor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__193"

    // $ANTLR start "T__194"
    public final void mT__194() throws RecognitionException {
        try {
            int _type = T__194;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:29:8: ( 'copy' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:29:10: 'copy'
            {
            match("copy"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__194"

    // $ANTLR start "T__195"
    public final void mT__195() throws RecognitionException {
        try {
            int _type = T__195;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:30:8: ( 'default' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:30:10: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__195"

    // $ANTLR start "T__196"
    public final void mT__196() throws RecognitionException {
        try {
            int _type = T__196;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:31:8: ( 'do' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:31:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__196"

    // $ANTLR start "T__197"
    public final void mT__197() throws RecognitionException {
        try {
            int _type = T__197;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:32:8: ( 'else' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:32:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__197"

    // $ANTLR start "T__198"
    public final void mT__198() throws RecognitionException {
        try {
            int _type = T__198;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:33:8: ( 'extern' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:33:10: 'extern'
            {
            match("extern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__198"

    // $ANTLR start "T__199"
    public final void mT__199() throws RecognitionException {
        try {
            int _type = T__199;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:34:8: ( 'for' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:34:10: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__199"

    // $ANTLR start "T__200"
    public final void mT__200() throws RecognitionException {
        try {
            int _type = T__200;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:35:8: ( 'goto' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:35:10: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__200"

    // $ANTLR start "T__201"
    public final void mT__201() throws RecognitionException {
        try {
            int _type = T__201;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:36:8: ( 'if' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:36:10: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__201"

    // $ANTLR start "T__202"
    public final void mT__202() throws RecognitionException {
        try {
            int _type = T__202;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:37:8: ( 'in' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:37:10: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__202"

    // $ANTLR start "T__203"
    public final void mT__203() throws RecognitionException {
        try {
            int _type = T__203;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:38:8: ( 'inline' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:38:10: 'inline'
            {
            match("inline"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__203"

    // $ANTLR start "T__204"
    public final void mT__204() throws RecognitionException {
        try {
            int _type = T__204;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:39:8: ( 'nil' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:39:10: 'nil'
            {
            match("nil"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__204"

    // $ANTLR start "T__205"
    public final void mT__205() throws RecognitionException {
        try {
            int _type = T__205;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:40:8: ( 'readwrite' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:40:10: 'readwrite'
            {
            match("readwrite"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__205"

    // $ANTLR start "T__206"
    public final void mT__206() throws RecognitionException {
        try {
            int _type = T__206;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:41:8: ( 'return' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:41:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__206"

    // $ANTLR start "T__207"
    public final void mT__207() throws RecognitionException {
        try {
            int _type = T__207;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:42:8: ( 'switch' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:42:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__207"

    // $ANTLR start "T__208"
    public final void mT__208() throws RecognitionException {
        try {
            int _type = T__208;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:43:8: ( 'typedef' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:43:10: 'typedef'
            {
            match("typedef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__208"

    // $ANTLR start "T__209"
    public final void mT__209() throws RecognitionException {
        try {
            int _type = T__209;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:44:8: ( 'union' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:44:10: 'union'
            {
            match("union"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__209"

    // $ANTLR start "T__210"
    public final void mT__210() throws RecognitionException {
        try {
            int _type = T__210;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:45:8: ( 'unsigned' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:45:10: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__210"

    // $ANTLR start "T__211"
    public final void mT__211() throws RecognitionException {
        try {
            int _type = T__211;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:46:8: ( 'while' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:46:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__211"

    // $ANTLR start "L_FBR"
    public final void mL_FBR() throws RecognitionException {
        try {
            int _type = L_FBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1171:7: ( '{' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1171:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_FBR"

    // $ANTLR start "R_FBR"
    public final void mR_FBR() throws RecognitionException {
        try {
            int _type = R_FBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1172:7: ( '}' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1172:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_FBR"

    // $ANTLR start "L_BR"
    public final void mL_BR() throws RecognitionException {
        try {
            int _type = L_BR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1173:7: ( '(' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1173:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_BR"

    // $ANTLR start "R_BR"
    public final void mR_BR() throws RecognitionException {
        try {
            int _type = R_BR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1174:7: ( ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1174:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_BR"

    // $ANTLR start "L_KBR"
    public final void mL_KBR() throws RecognitionException {
        try {
            int _type = L_KBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1175:7: ( '[' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1175:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_KBR"

    // $ANTLR start "R_KBR"
    public final void mR_KBR() throws RecognitionException {
        try {
            int _type = R_KBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1176:7: ( ']' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1176:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_KBR"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1178:2: ( ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1178:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1179:7: ( ':' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1179:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "L_LEFT_EQ"
    public final void mL_LEFT_EQ() throws RecognitionException {
        try {
            int _type = L_LEFT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1181:11: ( '<<=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1181:13: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_LEFT_EQ"

    // $ANTLR start "L_RIGHT_EQ"
    public final void mL_RIGHT_EQ() throws RecognitionException {
        try {
            int _type = L_RIGHT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1182:12: ( '>>=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1182:14: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_RIGHT_EQ"

    // $ANTLR start "L_LESS_EQ"
    public final void mL_LESS_EQ() throws RecognitionException {
        try {
            int _type = L_LESS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1185:2: ( '<=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1185:4: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_LESS_EQ"

    // $ANTLR start "L_MORE_EQ"
    public final void mL_MORE_EQ() throws RecognitionException {
        try {
            int _type = L_MORE_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1187:2: ( '>=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1187:4: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_MORE_EQ"

    // $ANTLR start "L_LEFT"
    public final void mL_LEFT() throws RecognitionException {
        try {
            int _type = L_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1189:8: ( '<<' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1189:10: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_LEFT"

    // $ANTLR start "L_RIGHT"
    public final void mL_RIGHT() throws RecognitionException {
        try {
            int _type = L_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1190:9: ( '>>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1190:11: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_RIGHT"

    // $ANTLR start "L_LESS"
    public final void mL_LESS() throws RecognitionException {
        try {
            int _type = L_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1191:8: ( '<' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1191:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_LESS"

    // $ANTLR start "L_MORE"
    public final void mL_MORE() throws RecognitionException {
        try {
            int _type = L_MORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1192:8: ( '>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1192:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_MORE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1193:5: ( '.' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1193:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1194:7: ( ',' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1194:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "L_NEQ"
    public final void mL_NEQ() throws RecognitionException {
        try {
            int _type = L_NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1195:7: ( '!=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1195:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_NEQ"

    // $ANTLR start "L_NOT"
    public final void mL_NOT() throws RecognitionException {
        try {
            int _type = L_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1196:7: ( '!' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1196:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_NOT"

    // $ANTLR start "L_EQ_EQ"
    public final void mL_EQ_EQ() throws RecognitionException {
        try {
            int _type = L_EQ_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1197:9: ( '==' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1197:11: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_EQ_EQ"

    // $ANTLR start "L_PLUS_EQ"
    public final void mL_PLUS_EQ() throws RecognitionException {
        try {
            int _type = L_PLUS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1199:11: ( '+=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1199:13: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_PLUS_EQ"

    // $ANTLR start "L_MINUS_EQ"
    public final void mL_MINUS_EQ() throws RecognitionException {
        try {
            int _type = L_MINUS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1200:12: ( '-=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1200:14: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_MINUS_EQ"

    // $ANTLR start "L_MULT_EQ"
    public final void mL_MULT_EQ() throws RecognitionException {
        try {
            int _type = L_MULT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1201:11: ( '*=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1201:13: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_MULT_EQ"

    // $ANTLR start "L_DIV_EQ"
    public final void mL_DIV_EQ() throws RecognitionException {
        try {
            int _type = L_DIV_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1202:10: ( '/=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1202:12: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_DIV_EQ"

    // $ANTLR start "L_PERC_EQ"
    public final void mL_PERC_EQ() throws RecognitionException {
        try {
            int _type = L_PERC_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1203:11: ( '%=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1203:13: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_PERC_EQ"

    // $ANTLR start "L_AND_EQ"
    public final void mL_AND_EQ() throws RecognitionException {
        try {
            int _type = L_AND_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1204:10: ( '&=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1204:12: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_AND_EQ"

    // $ANTLR start "L_XOR_EQ"
    public final void mL_XOR_EQ() throws RecognitionException {
        try {
            int _type = L_XOR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1205:10: ( '^=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1205:12: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_XOR_EQ"

    // $ANTLR start "L_OR_EQ"
    public final void mL_OR_EQ() throws RecognitionException {
        try {
            int _type = L_OR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1206:10: ( '|=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1206:12: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_OR_EQ"

    // $ANTLR start "L_EQ"
    public final void mL_EQ() throws RecognitionException {
        try {
            int _type = L_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1208:7: ( '=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1208:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_EQ"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1210:2: ( '*' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1210:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "L_DIV"
    public final void mL_DIV() throws RecognitionException {
        try {
            int _type = L_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1211:7: ( '/' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1211:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_DIV"

    // $ANTLR start "L_PERC"
    public final void mL_PERC() throws RecognitionException {
        try {
            int _type = L_PERC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1212:8: ( '%' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1212:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_PERC"

    // $ANTLR start "L_PLUS_PLUS"
    public final void mL_PLUS_PLUS() throws RecognitionException {
        try {
            int _type = L_PLUS_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1214:2: ( '++' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1214:4: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_PLUS_PLUS"

    // $ANTLR start "L_MINUS_MINUS"
    public final void mL_MINUS_MINUS() throws RecognitionException {
        try {
            int _type = L_MINUS_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1216:2: ( '--' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1216:4: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_MINUS_MINUS"

    // $ANTLR start "L_PLUS"
    public final void mL_PLUS() throws RecognitionException {
        try {
            int _type = L_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1217:8: ( '+' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1217:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_PLUS"

    // $ANTLR start "L_MINUS"
    public final void mL_MINUS() throws RecognitionException {
        try {
            int _type = L_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1218:9: ( '-' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1218:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_MINUS"

    // $ANTLR start "L_OR_OR"
    public final void mL_OR_OR() throws RecognitionException {
        try {
            int _type = L_OR_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1220:9: ( '||' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1220:11: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_OR_OR"

    // $ANTLR start "L_AND_AND"
    public final void mL_AND_AND() throws RecognitionException {
        try {
            int _type = L_AND_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1222:2: ( '&&' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1222:4: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_AND_AND"

    // $ANTLR start "L_OR"
    public final void mL_OR() throws RecognitionException {
        try {
            int _type = L_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1223:6: ( '|' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1223:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_OR"

    // $ANTLR start "L_AND"
    public final void mL_AND() throws RecognitionException {
        try {
            int _type = L_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1224:7: ( '&' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1224:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_AND"

    // $ANTLR start "L_XOR"
    public final void mL_XOR() throws RecognitionException {
        try {
            int _type = L_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1225:7: ( '^' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1225:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_XOR"

    // $ANTLR start "L_TILDA"
    public final void mL_TILDA() throws RecognitionException {
        try {
            int _type = L_TILDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1226:9: ( '~' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1226:11: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_TILDA"

    // $ANTLR start "SIZEOF"
    public final void mSIZEOF() throws RecognitionException {
        try {
            int _type = SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1227:8: ( 'sizeof' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1227:10: 'sizeof'
            {
            match("sizeof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZEOF"

    // $ANTLR start "L_QUESTION"
    public final void mL_QUESTION() throws RecognitionException {
        try {
            int _type = L_QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1229:2: ( '?' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1229:4: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_QUESTION"

    // $ANTLR start "CONST_PREFIX"
    public final void mCONST_PREFIX() throws RecognitionException {
        try {
            int _type = CONST_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1232:3: ( 'const' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1232:5: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_PREFIX"

    // $ANTLR start "ENUM_PREFIX"
    public final void mENUM_PREFIX() throws RecognitionException {
        try {
            int _type = ENUM_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1235:2: ( 'enum' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1235:4: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENUM_PREFIX"

    // $ANTLR start "STRUCT_PREFIX"
    public final void mSTRUCT_PREFIX() throws RecognitionException {
        try {
            int _type = STRUCT_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1238:2: ( 'struct' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1238:4: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRUCT_PREFIX"

    // $ANTLR start "STATIC_PREFIX"
    public final void mSTATIC_PREFIX() throws RecognitionException {
        try {
            int _type = STATIC_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1241:2: ( 'static' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1241:4: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC_PREFIX"

    // $ANTLR start "SINGLE_COMMENT"
    public final void mSINGLE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1244:2: ( '//' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1244:4: '//' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )+
            {
            match("//"); 



            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1244:9: (~ ( '\\r' | '\\n' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1244:25: ( ( '\\r' )? '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1244:26: ( '\\r' )? '\\n'
            	    {
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1244:26: ( '\\r' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='\r') ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1244:26: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }


            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_COMMENT"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1247:3: ( '/*' ( . )* '*/' ( ( '\\r' )? '\\n' )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1247:5: '/*' ( . )* '*/' ( ( '\\r' )? '\\n' )?
            {
            match("/*"); 



            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1247:10: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1247:10: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("*/"); 



            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1247:18: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1247:19: ( '\\r' )? '\\n'
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1247:19: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1247:19: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;

            }


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTI_COMMENT"

    // $ANTLR start "PREPROCESSOR_DECLARATION"
    public final void mPREPROCESSOR_DECLARATION() throws RecognitionException {
        try {
            int _type = PREPROCESSOR_DECLARATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1250:2: ( '#' (~ ( '\\\\' | '\\r' | '\\n' ) )* ( '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+ )* ( '\\r' | '\\n' )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1250:5: '#' (~ ( '\\\\' | '\\r' | '\\n' ) )* ( '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+ )* ( '\\r' | '\\n' )+
            {
            match('#'); 

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1250:9: (~ ( '\\\\' | '\\r' | '\\n' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1250:32: ( '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1250:33: '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+
            	    {
            	    match('\\'); 

            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1250:38: ( '\\r' | '\\n' )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0=='\n'||LA8_0=='\r') ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
            	    	    {
            	    	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
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


            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1250:53: (~ ( '\\\\' | '\\r' | '\\n' ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
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


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1250:78: ( '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREPROCESSOR_DECLARATION"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1252:9: ( ( DIGIT )+ ( 'u' | 'U' )? | ( DIGIT )+ DOT ( DIGIT )* ( 'f' | 'F' )? | ( DIGIT )* DOT ( DIGIT )+ ( 'f' | 'F' )? | ( '0x' ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )* ( DOT ( DIGIT )+ )? )? | ( DIGIT )+ ( DOT ( DIGIT )+ )? 'e' ( '-' | '+' )? ( DIGIT )+ )
            int alt29=5;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1252:11: ( DIGIT )+ ( 'u' | 'U' )?
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1252:11: ( DIGIT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1252:18: ( 'u' | 'U' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='U'||LA13_0=='u') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1253:4: ( DIGIT )+ DOT ( DIGIT )* ( 'f' | 'F' )?
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1253:4: ( DIGIT )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    mDOT(); 


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1253:15: ( DIGIT )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1253:22: ( 'f' | 'F' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='F'||LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                            {
                            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1254:4: ( DIGIT )* DOT ( DIGIT )+ ( 'f' | 'F' )?
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1254:4: ( DIGIT )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    mDOT(); 


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1254:15: ( DIGIT )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1254:22: ( 'f' | 'F' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='F'||LA19_0=='f') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                            {
                            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1255:4: ( '0x' ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )* ( DOT ( DIGIT )+ )? )?
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1255:4: ( '0x' ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )* ( DOT ( DIGIT )+ )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='0') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1255:5: '0x' ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )* ( DOT ( DIGIT )+ )?
                            {
                            match("0x"); 



                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1255:11: ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( ((LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'F')||(LA20_0 >= 'a' && LA20_0 <= 'f')) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                            	    {
                            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                            	        input.consume();
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;
                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1255:37: ( DOT ( DIGIT )+ )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0=='.') ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1255:38: DOT ( DIGIT )+
                                    {
                                    mDOT(); 


                                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1255:42: ( DIGIT )+
                                    int cnt21=0;
                                    loop21:
                                    do {
                                        int alt21=2;
                                        int LA21_0 = input.LA(1);

                                        if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
                                            alt21=1;
                                        }


                                        switch (alt21) {
                                    	case 1 :
                                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                                    	    {
                                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                                    	        input.consume();
                                    	    }
                                    	    else {
                                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                                    	        recover(mse);
                                    	        throw mse;
                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt21 >= 1 ) break loop21;
                                                EarlyExitException eee =
                                                    new EarlyExitException(21, input);
                                                throw eee;
                                        }
                                        cnt21++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1256:4: ( DIGIT )+ ( DOT ( DIGIT )+ )? 'e' ( '-' | '+' )? ( DIGIT )+
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1256:4: ( DIGIT )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1256:11: ( DOT ( DIGIT )+ )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='.') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1256:12: DOT ( DIGIT )+
                            {
                            mDOT(); 


                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1256:16: ( DIGIT )+
                            int cnt25=0;
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( ((LA25_0 >= '0' && LA25_0 <= '9')) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                            	    {
                            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                            	        input.consume();
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;
                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt25 >= 1 ) break loop25;
                                        EarlyExitException eee =
                                            new EarlyExitException(25, input);
                                        throw eee;
                                }
                                cnt25++;
                            } while (true);


                            }
                            break;

                    }


                    match('e'); 

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1256:29: ( '-' | '+' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='+'||LA27_0=='-') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1256:40: ( DIGIT )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0 >= '0' && LA28_0 <= '9')) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1258:4: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1258:6: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1258:6: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= '\t' && LA30_0 <= '\n')||(LA30_0 >= '\f' && LA30_0 <= '\r')||LA30_0==' ') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SINGLE_OP"
    public final void mSINGLE_OP() throws RecognitionException {
        try {
            int _type = SINGLE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1261:2: ( 'continue' SEMICOLON )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1261:4: 'continue' SEMICOLON
            {
            match("continue"); 



            mSEMICOLON(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_OP"

    // $ANTLR start "BREAK_WORD"
    public final void mBREAK_WORD() throws RecognitionException {
        try {
            int _type = BREAK_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1265:2: ( 'break' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1265:4: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK_WORD"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1267:6: ( 'void' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1267:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1269:4: ( LETTER ( DIGIT | LETTER )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1269:6: LETTER ( DIGIT | LETTER )*
            {
            mLETTER(); 


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1269:13: ( DIGIT | LETTER )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0 >= '0' && LA31_0 <= '9')||(LA31_0 >= 'A' && LA31_0 <= 'Z')||LA31_0=='_'||(LA31_0 >= 'a' && LA31_0 <= 'z')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING_LITERAL2"
    public final void mSTRING_LITERAL2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1275:2: ( '\"' ( WS | ESC |~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1275:4: '\"' ( WS | ESC |~ ( '\\r' | '\\n' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1275:8: ( WS | ESC |~ ( '\\r' | '\\n' | '\"' ) )*
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= '\t' && LA32_0 <= '\n')||(LA32_0 >= '\f' && LA32_0 <= '\r')||LA32_0==' ') ) {
                    alt32=1;
                }
                else if ( (LA32_0=='\\') ) {
                    int LA32_3 = input.LA(2);

                    if ( (LA32_3=='\"') ) {
                        int LA32_5 = input.LA(3);

                        if ( ((LA32_5 >= '\u0000' && LA32_5 <= '\uFFFF')) ) {
                            alt32=2;
                        }

                        else {
                            alt32=3;
                        }


                    }
                    else if ( ((LA32_3 >= '\u0000' && LA32_3 <= '!')||(LA32_3 >= '#' && LA32_3 <= '\uFFFF')) ) {
                        alt32=3;
                    }


                }
                else if ( ((LA32_0 >= '\u0000' && LA32_0 <= '\b')||LA32_0=='\u000B'||(LA32_0 >= '\u000E' && LA32_0 <= '\u001F')||LA32_0=='!'||(LA32_0 >= '#' && LA32_0 <= '[')||(LA32_0 >= ']' && LA32_0 <= '\uFFFF')) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1275:9: WS
            	    {
            	    mWS(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1275:14: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 3 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1275:20: ~ ( '\\r' | '\\n' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL2"

    // $ANTLR start "STRING_LITERAL3"
    public final void mSTRING_LITERAL3() throws RecognitionException {
        try {
            int _type = STRING_LITERAL3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1278:2: ( '\\'' ( WS | ESC |~ ( '\\r' | '\\n' | '\\'' ) )* '\\'' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1278:4: '\\'' ( WS | ESC |~ ( '\\r' | '\\n' | '\\'' ) )* '\\''
            {
            match('\''); 

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1278:9: ( WS | ESC |~ ( '\\r' | '\\n' | '\\'' ) )*
            loop33:
            do {
                int alt33=4;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0 >= '\t' && LA33_0 <= '\n')||(LA33_0 >= '\f' && LA33_0 <= '\r')||LA33_0==' ') ) {
                    alt33=1;
                }
                else if ( (LA33_0=='\\') ) {
                    int LA33_3 = input.LA(2);

                    if ( (LA33_3=='\"') ) {
                        alt33=2;
                    }
                    else if ( ((LA33_3 >= '\u0000' && LA33_3 <= '!')||(LA33_3 >= '#' && LA33_3 <= '\uFFFF')) ) {
                        alt33=3;
                    }


                }
                else if ( ((LA33_0 >= '\u0000' && LA33_0 <= '\b')||LA33_0=='\u000B'||(LA33_0 >= '\u000E' && LA33_0 <= '\u001F')||(LA33_0 >= '!' && LA33_0 <= '&')||(LA33_0 >= '(' && LA33_0 <= '[')||(LA33_0 >= ']' && LA33_0 <= '\uFFFF')) ) {
                    alt33=3;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1278:10: WS
            	    {
            	    mWS(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1278:15: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 3 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1278:21: ~ ( '\\r' | '\\n' | '\\'' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL3"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1280:16: ( ( '`' )? '@' STRING_LITERAL2 )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1280:18: ( '`' )? '@' STRING_LITERAL2
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1280:18: ( '`' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='`') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1280:18: '`'
                    {
                    match('`'); 

                    }
                    break;

            }


            match('@'); 

            mSTRING_LITERAL2(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1282:17: ( '0' .. '9' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1283:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1285:2: ( '\\\\' '\"' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1285:4: '\\\\' '\"'
            {
            match('\\'); 

            match('\"'); 

             setText("\\\""); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC"

    public void mTokens() throws RecognitionException {
        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:8: ( T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | L_FBR | R_FBR | L_BR | R_BR | L_KBR | R_KBR | SEMICOLON | COLON | L_LEFT_EQ | L_RIGHT_EQ | L_LESS_EQ | L_MORE_EQ | L_LEFT | L_RIGHT | L_LESS | L_MORE | DOT | COMMA | L_NEQ | L_NOT | L_EQ_EQ | L_PLUS_EQ | L_MINUS_EQ | L_MULT_EQ | L_DIV_EQ | L_PERC_EQ | L_AND_EQ | L_XOR_EQ | L_OR_EQ | L_EQ | ASTERISK | L_DIV | L_PERC | L_PLUS_PLUS | L_MINUS_MINUS | L_PLUS | L_MINUS | L_OR_OR | L_AND_AND | L_OR | L_AND | L_XOR | L_TILDA | SIZEOF | L_QUESTION | CONST_PREFIX | ENUM_PREFIX | STRUCT_PREFIX | STATIC_PREFIX | SINGLE_COMMENT | MULTI_COMMENT | PREPROCESSOR_DECLARATION | NUMBER | WS | SINGLE_OP | BREAK_WORD | VOID | ID | STRING_LITERAL2 | STRING_LITERAL3 | STRING_LITERAL )
        int alt35=102;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:10: T__171
                {
                mT__171(); 


                }
                break;
            case 2 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:17: T__172
                {
                mT__172(); 


                }
                break;
            case 3 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:24: T__173
                {
                mT__173(); 


                }
                break;
            case 4 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:31: T__174
                {
                mT__174(); 


                }
                break;
            case 5 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:38: T__175
                {
                mT__175(); 


                }
                break;
            case 6 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:45: T__176
                {
                mT__176(); 


                }
                break;
            case 7 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:52: T__177
                {
                mT__177(); 


                }
                break;
            case 8 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:59: T__178
                {
                mT__178(); 


                }
                break;
            case 9 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:66: T__179
                {
                mT__179(); 


                }
                break;
            case 10 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:73: T__180
                {
                mT__180(); 


                }
                break;
            case 11 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:80: T__181
                {
                mT__181(); 


                }
                break;
            case 12 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:87: T__182
                {
                mT__182(); 


                }
                break;
            case 13 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:94: T__183
                {
                mT__183(); 


                }
                break;
            case 14 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:101: T__184
                {
                mT__184(); 


                }
                break;
            case 15 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:108: T__185
                {
                mT__185(); 


                }
                break;
            case 16 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:115: T__186
                {
                mT__186(); 


                }
                break;
            case 17 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:122: T__187
                {
                mT__187(); 


                }
                break;
            case 18 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:129: T__188
                {
                mT__188(); 


                }
                break;
            case 19 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:136: T__189
                {
                mT__189(); 


                }
                break;
            case 20 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:143: T__190
                {
                mT__190(); 


                }
                break;
            case 21 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:150: T__191
                {
                mT__191(); 


                }
                break;
            case 22 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:157: T__192
                {
                mT__192(); 


                }
                break;
            case 23 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:164: T__193
                {
                mT__193(); 


                }
                break;
            case 24 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:171: T__194
                {
                mT__194(); 


                }
                break;
            case 25 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:178: T__195
                {
                mT__195(); 


                }
                break;
            case 26 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:185: T__196
                {
                mT__196(); 


                }
                break;
            case 27 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:192: T__197
                {
                mT__197(); 


                }
                break;
            case 28 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:199: T__198
                {
                mT__198(); 


                }
                break;
            case 29 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:206: T__199
                {
                mT__199(); 


                }
                break;
            case 30 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:213: T__200
                {
                mT__200(); 


                }
                break;
            case 31 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:220: T__201
                {
                mT__201(); 


                }
                break;
            case 32 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:227: T__202
                {
                mT__202(); 


                }
                break;
            case 33 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:234: T__203
                {
                mT__203(); 


                }
                break;
            case 34 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:241: T__204
                {
                mT__204(); 


                }
                break;
            case 35 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:248: T__205
                {
                mT__205(); 


                }
                break;
            case 36 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:255: T__206
                {
                mT__206(); 


                }
                break;
            case 37 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:262: T__207
                {
                mT__207(); 


                }
                break;
            case 38 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:269: T__208
                {
                mT__208(); 


                }
                break;
            case 39 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:276: T__209
                {
                mT__209(); 


                }
                break;
            case 40 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:283: T__210
                {
                mT__210(); 


                }
                break;
            case 41 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:290: T__211
                {
                mT__211(); 


                }
                break;
            case 42 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:297: L_FBR
                {
                mL_FBR(); 


                }
                break;
            case 43 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:303: R_FBR
                {
                mR_FBR(); 


                }
                break;
            case 44 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:309: L_BR
                {
                mL_BR(); 


                }
                break;
            case 45 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:314: R_BR
                {
                mR_BR(); 


                }
                break;
            case 46 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:319: L_KBR
                {
                mL_KBR(); 


                }
                break;
            case 47 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:325: R_KBR
                {
                mR_KBR(); 


                }
                break;
            case 48 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:331: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 49 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:341: COLON
                {
                mCOLON(); 


                }
                break;
            case 50 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:347: L_LEFT_EQ
                {
                mL_LEFT_EQ(); 


                }
                break;
            case 51 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:357: L_RIGHT_EQ
                {
                mL_RIGHT_EQ(); 


                }
                break;
            case 52 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:368: L_LESS_EQ
                {
                mL_LESS_EQ(); 


                }
                break;
            case 53 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:378: L_MORE_EQ
                {
                mL_MORE_EQ(); 


                }
                break;
            case 54 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:388: L_LEFT
                {
                mL_LEFT(); 


                }
                break;
            case 55 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:395: L_RIGHT
                {
                mL_RIGHT(); 


                }
                break;
            case 56 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:403: L_LESS
                {
                mL_LESS(); 


                }
                break;
            case 57 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:410: L_MORE
                {
                mL_MORE(); 


                }
                break;
            case 58 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:417: DOT
                {
                mDOT(); 


                }
                break;
            case 59 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:421: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 60 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:427: L_NEQ
                {
                mL_NEQ(); 


                }
                break;
            case 61 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:433: L_NOT
                {
                mL_NOT(); 


                }
                break;
            case 62 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:439: L_EQ_EQ
                {
                mL_EQ_EQ(); 


                }
                break;
            case 63 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:447: L_PLUS_EQ
                {
                mL_PLUS_EQ(); 


                }
                break;
            case 64 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:457: L_MINUS_EQ
                {
                mL_MINUS_EQ(); 


                }
                break;
            case 65 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:468: L_MULT_EQ
                {
                mL_MULT_EQ(); 


                }
                break;
            case 66 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:478: L_DIV_EQ
                {
                mL_DIV_EQ(); 


                }
                break;
            case 67 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:487: L_PERC_EQ
                {
                mL_PERC_EQ(); 


                }
                break;
            case 68 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:497: L_AND_EQ
                {
                mL_AND_EQ(); 


                }
                break;
            case 69 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:506: L_XOR_EQ
                {
                mL_XOR_EQ(); 


                }
                break;
            case 70 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:515: L_OR_EQ
                {
                mL_OR_EQ(); 


                }
                break;
            case 71 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:523: L_EQ
                {
                mL_EQ(); 


                }
                break;
            case 72 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:528: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 73 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:537: L_DIV
                {
                mL_DIV(); 


                }
                break;
            case 74 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:543: L_PERC
                {
                mL_PERC(); 


                }
                break;
            case 75 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:550: L_PLUS_PLUS
                {
                mL_PLUS_PLUS(); 


                }
                break;
            case 76 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:562: L_MINUS_MINUS
                {
                mL_MINUS_MINUS(); 


                }
                break;
            case 77 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:576: L_PLUS
                {
                mL_PLUS(); 


                }
                break;
            case 78 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:583: L_MINUS
                {
                mL_MINUS(); 


                }
                break;
            case 79 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:591: L_OR_OR
                {
                mL_OR_OR(); 


                }
                break;
            case 80 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:599: L_AND_AND
                {
                mL_AND_AND(); 


                }
                break;
            case 81 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:609: L_OR
                {
                mL_OR(); 


                }
                break;
            case 82 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:614: L_AND
                {
                mL_AND(); 


                }
                break;
            case 83 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:620: L_XOR
                {
                mL_XOR(); 


                }
                break;
            case 84 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:626: L_TILDA
                {
                mL_TILDA(); 


                }
                break;
            case 85 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:634: SIZEOF
                {
                mSIZEOF(); 


                }
                break;
            case 86 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:641: L_QUESTION
                {
                mL_QUESTION(); 


                }
                break;
            case 87 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:652: CONST_PREFIX
                {
                mCONST_PREFIX(); 


                }
                break;
            case 88 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:665: ENUM_PREFIX
                {
                mENUM_PREFIX(); 


                }
                break;
            case 89 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:677: STRUCT_PREFIX
                {
                mSTRUCT_PREFIX(); 


                }
                break;
            case 90 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:691: STATIC_PREFIX
                {
                mSTATIC_PREFIX(); 


                }
                break;
            case 91 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:705: SINGLE_COMMENT
                {
                mSINGLE_COMMENT(); 


                }
                break;
            case 92 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:720: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 


                }
                break;
            case 93 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:734: PREPROCESSOR_DECLARATION
                {
                mPREPROCESSOR_DECLARATION(); 


                }
                break;
            case 94 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:759: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 95 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:766: WS
                {
                mWS(); 


                }
                break;
            case 96 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:769: SINGLE_OP
                {
                mSINGLE_OP(); 


                }
                break;
            case 97 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:779: BREAK_WORD
                {
                mBREAK_WORD(); 


                }
                break;
            case 98 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:790: VOID
                {
                mVOID(); 


                }
                break;
            case 99 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:795: ID
                {
                mID(); 


                }
                break;
            case 100 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:798: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 


                }
                break;
            case 101 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:814: STRING_LITERAL3
                {
                mSTRING_LITERAL3(); 


                }
                break;
            case 102 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objcm.g:1:830: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;

        }

    }


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA29_eotS =
        "\1\4\1\5\1\uffff\1\5\2\uffff\1\10\2\uffff\2\10";
    static final String DFA29_eofS =
        "\13\uffff";
    static final String DFA29_minS =
        "\2\56\1\uffff\1\56\2\uffff\1\60\2\uffff\2\60";
    static final String DFA29_maxS =
        "\1\71\1\170\1\uffff\1\145\2\uffff\1\71\2\uffff\2\145";
    static final String DFA29_acceptS =
        "\2\uffff\1\3\1\uffff\1\4\1\1\1\uffff\1\5\1\2\2\uffff";
    static final String DFA29_specialS =
        "\13\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\1\uffff\1\1\11\3",
            "\1\6\1\uffff\12\3\53\uffff\1\7\22\uffff\1\4",
            "",
            "\1\6\1\uffff\12\3\53\uffff\1\7",
            "",
            "",
            "\12\11",
            "",
            "",
            "\12\12\53\uffff\1\7",
            "\12\12\53\uffff\1\7"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1252:1: NUMBER : ( ( DIGIT )+ ( 'u' | 'U' )? | ( DIGIT )+ DOT ( DIGIT )* ( 'f' | 'F' )? | ( DIGIT )* DOT ( DIGIT )+ ( 'f' | 'F' )? | ( '0x' ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )* ( DOT ( DIGIT )+ )? )? | ( DIGIT )+ ( DOT ( DIGIT )+ )? 'e' ( '-' | '+' )? ( DIGIT )+ );";
        }
    }
    static final String DFA35_eotS =
        "\1\53\1\uffff\1\67\1\71\1\uffff\17\57\10\uffff\1\131\1\134\1\uffff"+
        "\1\136\1\140\1\143\1\145\1\151\1\153\1\156\1\160\1\163\5\uffff\2"+
        "\57\22\uffff\6\57\1\u0088\5\57\1\u008e\1\u0090\10\57\1\u009d\2\uffff"+
        "\1\u009f\31\uffff\2\57\12\uffff\1\u00a7\7\57\1\uffff\3\57\1\u00b3"+
        "\1\57\1\uffff\1\57\1\uffff\1\u00b6\12\57\4\uffff\2\57\6\uffff\3"+
        "\57\1\u00c8\2\57\1\u00cb\1\57\1\u00cd\1\57\1\u00cf\1\uffff\1\u00d0"+
        "\1\57\1\uffff\13\57\1\u00dd\2\uffff\3\57\1\uffff\1\u00e2\1\57\1"+
        "\uffff\1\57\1\uffff\1\57\2\uffff\10\57\1\u00ee\1\57\1\u00f0\1\u00f1"+
        "\1\uffff\2\57\1\u00f4\1\57\1\uffff\2\57\1\u00f8\1\u00f9\1\57\1\u00fb"+
        "\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\57\1\uffff\1\57\2\uffff\2\57"+
        "\1\uffff\2\57\1\u0106\2\uffff\1\57\5\uffff\1\u0108\5\57\1\uffff"+
        "\1\57\1\uffff\1\u010f\3\57\1\uffff\1\u0113\1\uffff\1\57\1\u0115"+
        "\1\57\1\uffff\1\57\1\uffff\1\u0118\1\57\1\uffff\1\u011a\1\uffff";
    static final String DFA35_eofS =
        "\u011b\uffff";
    static final String DFA35_minS =
        "\1\11\1\0\1\55\1\56\1\42\1\151\1\137\1\163\1\141\1\145\1\154\2\157"+
        "\1\146\1\151\1\145\1\151\1\171\1\156\1\150\10\uffff\1\74\1\75\1"+
        "\uffff\2\75\1\53\1\75\1\52\1\75\1\46\2\75\5\uffff\1\162\1\157\3"+
        "\uffff\1\0\10\uffff\1\156\1\uffff\1\155\1\162\1\145\1\150\1\154"+
        "\1\141\2\163\1\156\1\146\1\60\1\163\1\164\1\165\1\162\1\164\2\60"+
        "\1\154\1\141\1\151\1\172\1\141\1\160\2\151\1\75\2\uffff\1\75\31"+
        "\uffff\1\145\1\151\1\uffff\1\143\2\uffff\1\151\5\uffff\1\60\1\164"+
        "\1\171\1\151\1\145\1\163\1\171\1\141\1\uffff\2\145\1\155\1\60\1"+
        "\157\1\uffff\1\151\1\uffff\1\60\1\144\1\165\1\164\1\145\1\165\1"+
        "\164\1\145\1\157\1\151\1\154\4\uffff\1\141\1\144\4\uffff\1\160\1"+
        "\uffff\1\164\1\160\1\147\1\60\1\164\1\151\1\60\1\165\1\60\1\162"+
        "\1\60\1\uffff\1\60\1\156\1\uffff\1\167\1\162\1\143\1\157\1\143\1"+
        "\151\1\144\1\156\1\147\1\145\1\153\1\60\2\uffff\1\162\1\145\1\156"+
        "\1\uffff\1\60\1\156\1\uffff\1\154\1\uffff\1\156\2\uffff\1\145\1"+
        "\162\1\156\1\150\1\146\1\164\1\143\1\145\1\60\1\156\2\60\1\uffff"+
        "\1\151\1\157\1\60\1\165\1\uffff\1\165\1\164\2\60\1\151\5\60\1\146"+
        "\1\uffff\1\145\2\uffff\1\142\1\146\1\uffff\1\143\1\145\1\60\2\uffff"+
        "\1\164\5\uffff\1\60\1\144\1\165\1\137\1\164\1\73\1\uffff\1\145\1"+
        "\uffff\1\60\1\164\1\137\1\157\1\uffff\1\60\1\uffff\1\145\1\60\1"+
        "\162\1\uffff\1\137\1\uffff\1\60\1\137\1\uffff\1\60\1\uffff";
    static final String DFA35_maxS =
        "\1\176\1\uffff\1\76\1\71\1\164\1\151\1\137\1\163\2\157\1\170\2\157"+
        "\1\156\1\151\1\145\1\167\1\171\1\156\1\150\10\uffff\1\75\1\76\1"+
        "\uffff\10\75\1\174\5\uffff\1\162\1\157\3\uffff\1\uffff\10\uffff"+
        "\1\156\1\uffff\1\156\1\165\1\171\1\162\1\154\1\164\2\163\1\160\1"+
        "\146\1\172\1\163\1\164\1\165\1\162\1\164\2\172\1\154\1\164\1\151"+
        "\1\172\1\162\1\160\1\163\1\151\1\75\2\uffff\1\75\31\uffff\1\145"+
        "\1\151\1\uffff\1\144\2\uffff\1\157\5\uffff\1\172\1\164\1\171\1\151"+
        "\1\145\1\164\1\171\1\141\1\uffff\2\145\1\155\1\172\1\157\1\uffff"+
        "\1\151\1\uffff\1\172\1\144\1\165\1\164\1\145\1\165\1\164\1\145\1"+
        "\157\1\151\1\154\4\uffff\1\141\1\144\4\uffff\1\164\1\uffff\1\164"+
        "\1\160\1\147\1\172\1\164\1\151\1\172\1\165\1\172\1\162\1\172\1\uffff"+
        "\1\172\1\156\1\uffff\1\167\1\162\1\143\1\157\1\143\1\151\1\144\1"+
        "\156\1\147\1\145\1\153\1\172\2\uffff\1\162\1\145\1\156\1\uffff\1"+
        "\172\1\156\1\uffff\1\154\1\uffff\1\156\2\uffff\1\145\1\162\1\156"+
        "\1\150\1\146\1\164\1\143\1\145\1\172\1\156\2\172\1\uffff\1\151\1"+
        "\157\1\172\1\165\1\uffff\1\165\1\164\2\172\1\151\5\172\1\146\1\uffff"+
        "\1\145\2\uffff\1\142\1\146\1\uffff\1\143\1\145\1\172\2\uffff\1\164"+
        "\5\uffff\1\172\1\144\1\165\1\137\1\164\1\73\1\uffff\1\145\1\uffff"+
        "\1\172\1\164\1\137\1\157\1\uffff\1\172\1\uffff\1\145\1\172\1\162"+
        "\1\uffff\1\137\1\uffff\1\172\1\137\1\uffff\1\172\1\uffff";
    static final String DFA35_acceptS =
        "\24\uffff\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\2\uffff\1\73\11"+
        "\uffff\1\124\1\126\1\135\1\136\1\137\2\uffff\1\143\1\145\1\146\1"+
        "\uffff\1\144\1\2\1\100\1\114\1\116\1\3\1\72\1\4\1\uffff\1\7\33\uffff"+
        "\1\64\1\70\1\uffff\1\65\1\71\1\74\1\75\1\76\1\107\1\77\1\113\1\115"+
        "\1\101\1\110\1\102\1\133\1\134\1\111\1\103\1\112\1\104\1\120\1\122"+
        "\1\105\1\123\1\106\1\117\1\121\2\uffff\1\1\1\uffff\1\10\1\11\1\uffff"+
        "\1\15\1\16\1\17\1\20\1\21\10\uffff\1\32\5\uffff\1\37\1\uffff\1\40"+
        "\13\uffff\1\62\1\66\1\63\1\67\2\uffff\1\1\1\5\1\6\1\12\1\uffff\1"+
        "\22\13\uffff\1\35\2\uffff\1\42\14\uffff\1\13\1\14\3\uffff\1\26\2"+
        "\uffff\1\30\1\uffff\1\33\1\uffff\1\130\1\36\14\uffff\1\142\4\uffff"+
        "\1\127\13\uffff\1\47\1\uffff\1\51\1\141\2\uffff\1\25\3\uffff\1\34"+
        "\1\41\1\uffff\1\44\1\45\1\125\1\131\1\132\6\uffff\1\31\1\uffff\1"+
        "\46\4\uffff\1\140\1\uffff\1\50\3\uffff\1\43\1\uffff\1\24\2\uffff"+
        "\1\27\1\uffff\1\23";
    static final String DFA35_specialS =
        "\1\uffff\1\1\60\uffff\1\0\u00e8\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\54\1\uffff\2\54\22\uffff\1\54\1\37\1\1\1\52\1\uffff\1\44"+
            "\1\45\1\60\1\26\1\27\1\42\1\41\1\36\1\2\1\3\1\43\12\uffff\1"+
            "\33\1\32\1\34\1\40\1\35\1\51\1\4\15\57\1\5\14\57\1\30\1\uffff"+
            "\1\31\1\46\1\6\1\61\1\7\1\55\1\10\1\11\1\12\1\13\1\14\1\57\1"+
            "\15\4\57\1\16\3\57\1\17\1\20\1\21\1\22\1\56\1\23\3\57\1\24\1"+
            "\47\1\25\1\50",
            "\103\63\1\62\uffbc\63",
            "\1\66\17\uffff\1\65\1\64",
            "\1\70\1\uffff\12\53",
            "\1\61\100\uffff\1\72\1\uffff\1\73\1\74\2\uffff\1\75\6\uffff"+
            "\1\76\2\uffff\1\77\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104\15\uffff\1\105",
            "\1\106\11\uffff\1\107",
            "\1\110\1\uffff\1\112\11\uffff\1\111",
            "\1\113",
            "\1\114",
            "\1\115\7\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\122\12\uffff\1\123\2\uffff\1\121",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127\1\130",
            "\1\133\1\132",
            "",
            "\1\135",
            "\1\137",
            "\1\142\21\uffff\1\141",
            "\1\144",
            "\1\150\4\uffff\1\147\15\uffff\1\146",
            "\1\152",
            "\1\155\26\uffff\1\154",
            "\1\157",
            "\1\161\76\uffff\1\162",
            "",
            "",
            "",
            "",
            "",
            "\1\164",
            "\1\165",
            "",
            "",
            "",
            "\42\63\1\166\uffdd\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\167",
            "",
            "\1\170\1\171",
            "\1\172\2\uffff\1\173",
            "\1\174\23\uffff\1\175",
            "\1\176\11\uffff\1\177",
            "\1\u0080",
            "\1\u0081\22\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\1\uffff\1\u0086",
            "\1\u0087",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u008f\16"+
            "\57",
            "\1\u0091",
            "\1\u0092\22\uffff\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0097\20\uffff\1\u0096",
            "\1\u0098",
            "\1\u0099\11\uffff\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a3\1\u00a4",
            "",
            "",
            "\1\u00a5\5\uffff\1\u00a6",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "",
            "",
            "",
            "\1\u00c3\3\uffff\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c9",
            "\1\u00ca",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00cc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ce",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00e1\10"+
            "\57",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ef",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00fa",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0100",
            "",
            "\1\u0101",
            "",
            "",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0107",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "\1\u010e",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0114",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0116",
            "",
            "\1\u0117",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0119",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | L_FBR | R_FBR | L_BR | R_BR | L_KBR | R_KBR | SEMICOLON | COLON | L_LEFT_EQ | L_RIGHT_EQ | L_LESS_EQ | L_MORE_EQ | L_LEFT | L_RIGHT | L_LESS | L_MORE | DOT | COMMA | L_NEQ | L_NOT | L_EQ_EQ | L_PLUS_EQ | L_MINUS_EQ | L_MULT_EQ | L_DIV_EQ | L_PERC_EQ | L_AND_EQ | L_XOR_EQ | L_OR_EQ | L_EQ | ASTERISK | L_DIV | L_PERC | L_PLUS_PLUS | L_MINUS_MINUS | L_PLUS | L_MINUS | L_OR_OR | L_AND_AND | L_OR | L_AND | L_XOR | L_TILDA | SIZEOF | L_QUESTION | CONST_PREFIX | ENUM_PREFIX | STRUCT_PREFIX | STATIC_PREFIX | SINGLE_COMMENT | MULTI_COMMENT | PREPROCESSOR_DECLARATION | NUMBER | WS | SINGLE_OP | BREAK_WORD | VOID | ID | STRING_LITERAL2 | STRING_LITERAL3 | STRING_LITERAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_50 = input.LA(1);

                        s = -1;
                        if ( (LA35_50=='\"') ) {s = 118;}

                        else if ( ((LA35_50 >= '\u0000' && LA35_50 <= '!')||(LA35_50 >= '#' && LA35_50 <= '\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA35_1 = input.LA(1);

                        s = -1;
                        if ( (LA35_1=='C') ) {s = 50;}

                        else if ( ((LA35_1 >= '\u0000' && LA35_1 <= 'B')||(LA35_1 >= 'D' && LA35_1 <= '\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}