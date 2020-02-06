// $ANTLR 3.4 C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g 2013-09-11 09:48:45

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PreprocessorLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public PreprocessorLexer() {} 
    public PreprocessorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PreprocessorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g"; }

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:6:7: ( '&&' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:6:9: '&&'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:7:7: ( ',' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:7:9: ','
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:8:7: ( '.' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:8:9: '.'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:9:7: ( '/' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:9:9: '/'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:10:7: ( '<=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:10:9: '<='
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:11:7: ( '==' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:11:9: '=='
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:12:7: ( '>=' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:12:9: '>='
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:13:7: ( '\\'#\\'' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:13:9: '\\'#\\''
            {
            match("'#'"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:14:7: ( '||' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:14:9: '||'
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
    // $ANTLR end "T__73"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:253:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:253:12: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:253:17: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '.')||(LA1_1 >= '0' && LA1_1 <= '\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ')')||(LA1_0 >= '+' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:253:45: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match("*/"); 



              _channel = HIDDEN;  

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "SINGLE_COMMENT"
    public final void mSINGLE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:256:2: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:256:4: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 



            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:256:9: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
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
            	    break loop2;
                }
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
    // $ANTLR end "SINGLE_COMMENT"

    // $ANTLR start "IFNDEF"
    public final void mIFNDEF() throws RecognitionException {
        try {
            int _type = IFNDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:258:8: ( '#ifndef' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:258:10: '#ifndef'
            {
            match("#ifndef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IFNDEF"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:259:4: ( '#if' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:259:6: '#if'
            {
            match("#if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:260:6: ( '#elif' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:260:8: '#elif'
            {
            match("#elif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "IFDEF"
    public final void mIFDEF() throws RecognitionException {
        try {
            int _type = IFDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:261:7: ( '#ifdef' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:261:9: '#ifdef'
            {
            match("#ifdef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IFDEF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:262:6: ( '#else' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:262:8: '#else'
            {
            match("#else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:263:7: ( '#endif' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:263:9: '#endif'
            {
            match("#endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:264:8: ( '#define' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:264:10: '#define'
            {
            match("#define"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:265:9: ( '#include' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:265:11: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:266:8: ( '#import' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:266:10: '#import'
            {
            match("#import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "DEFINED"
    public final void mDEFINED() throws RecognitionException {
        try {
            int _type = DEFINED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:267:9: ( 'defined' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:267:11: 'defined'
            {
            match("defined"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFINED"

    // $ANTLR start "RESERVED_WORDS"
    public final void mRESERVED_WORDS() throws RecognitionException {
        try {
            int _type = RESERVED_WORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:270:2: ( '@try' | '@catch' | '@throw' | '@finally' )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='@') ) {
                switch ( input.LA(2) ) {
                case 't':
                    {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2=='r') ) {
                        alt3=1;
                    }
                    else if ( (LA3_2=='h') ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;

                    }
                    }
                    break;
                case 'c':
                    {
                    alt3=2;
                    }
                    break;
                case 'f':
                    {
                    alt3=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:270:4: '@try'
                    {
                    match("@try"); 



                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:270:13: '@catch'
                    {
                    match("@catch"); 



                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:270:24: '@throw'
                    {
                    match("@throw"); 



                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:270:35: '@finally'
                    {
                    match("@finally"); 



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
    // $ANTLR end "RESERVED_WORDS"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:273:2: ( '\\\\' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:273:4: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "POINTS3"
    public final void mPOINTS3() throws RecognitionException {
        try {
            int _type = POINTS3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:274:9: ( '...' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:274:11: '...'
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
    // $ANTLR end "POINTS3"

    // $ANTLR start "MATH_OP"
    public final void mMATH_OP() throws RecognitionException {
        try {
            int _type = MATH_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:276:9: ( '++' | '--' | '+=' | '-=' | '*=' | '/=' | '%=' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='+') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='=') ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
                }
                break;
            case '-':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='-') ) {
                    alt4=2;
                }
                else if ( (LA4_2=='=') ) {
                    alt4=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
                }
                break;
            case '*':
                {
                alt4=5;
                }
                break;
            case '/':
                {
                alt4=6;
                }
                break;
            case '%':
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:276:11: '++'
                    {
                    match("++"); 



                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:276:16: '--'
                    {
                    match("--"); 



                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:276:21: '+='
                    {
                    match("+="); 



                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:276:26: '-='
                    {
                    match("-="); 



                    }
                    break;
                case 5 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:276:31: '*='
                    {
                    match("*="); 



                    }
                    break;
                case 6 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:276:36: '/='
                    {
                    match("/="); 



                    }
                    break;
                case 7 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:276:41: '%='
                    {
                    match("%="); 



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
    // $ANTLR end "MATH_OP"

    // $ANTLR start "EXC"
    public final void mEXC() throws RecognitionException {
        try {
            int _type = EXC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:278:5: ( '!' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:278:7: '!'
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
    // $ANTLR end "EXC"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:279:6: ( '+' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:279:8: '+'
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
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:280:7: ( '-' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:280:9: '-'
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
    // $ANTLR end "MINUS"

    // $ANTLR start "L_BR"
    public final void mL_BR() throws RecognitionException {
        try {
            int _type = L_BR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:281:6: ( '(' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:281:8: '('
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
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:282:6: ( ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:282:8: ')'
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

    // $ANTLR start "R_SHFT"
    public final void mR_SHFT() throws RecognitionException {
        try {
            int _type = R_SHFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:283:8: ( '>>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:283:10: '>>'
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
    // $ANTLR end "R_SHFT"

    // $ANTLR start "L_SHFT"
    public final void mL_SHFT() throws RecognitionException {
        try {
            int _type = L_SHFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:284:8: ( '<<' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:284:10: '<<'
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
    // $ANTLR end "L_SHFT"

    // $ANTLR start "L_UBR"
    public final void mL_UBR() throws RecognitionException {
        try {
            int _type = L_UBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:285:7: ( '<' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:285:9: '<'
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
    // $ANTLR end "L_UBR"

    // $ANTLR start "R_UBR"
    public final void mR_UBR() throws RecognitionException {
        try {
            int _type = R_UBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:286:7: ( '>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:286:9: '>'
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
    // $ANTLR end "R_UBR"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:287:9: ( '*' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:287:11: '*'
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

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:288:7: ( '\"' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:288:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "RET"
    public final void mRET() throws RecognitionException {
        try {
            int _type = RET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:290:5: ( '\\r' | '\\n' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RET"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:292:4: ( LETTER ( DIGIT | LETTER )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:292:6: LETTER ( DIGIT | LETTER )*
            {
            mLETTER(); 


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:292:13: ( DIGIT | LETTER )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
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
            	    break loop5;
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

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:9: ( DIGIT ( ( ( DIGIT | '.' )* ( 'l' | 'L' | 'f' | 'F' | 'd' | 'D' )? ) | ( ( 'X' | 'x' ) ( DIGIT | LETTER )+ ) | ( ( 'e' | 'E' ) ( '-' | '+' ) ( DIGIT )+ ) ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:12: DIGIT ( ( ( DIGIT | '.' )* ( 'l' | 'L' | 'f' | 'F' | 'd' | 'D' )? ) | ( ( 'X' | 'x' ) ( DIGIT | LETTER )+ ) | ( ( 'e' | 'E' ) ( '-' | '+' ) ( DIGIT )+ ) )
            {
            mDIGIT(); 


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:18: ( ( ( DIGIT | '.' )* ( 'l' | 'L' | 'f' | 'F' | 'd' | 'D' )? ) | ( ( 'X' | 'x' ) ( DIGIT | LETTER )+ ) | ( ( 'e' | 'E' ) ( '-' | '+' ) ( DIGIT )+ ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 'X':
            case 'x':
                {
                alt10=2;
                }
                break;
            case 'E':
            case 'e':
                {
                alt10=3;
                }
                break;
            default:
                alt10=1;
            }

            switch (alt10) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:20: ( ( DIGIT | '.' )* ( 'l' | 'L' | 'f' | 'F' | 'd' | 'D' )? )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:20: ( ( DIGIT | '.' )* ( 'l' | 'L' | 'f' | 'F' | 'd' | 'D' )? )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:21: ( DIGIT | '.' )* ( 'l' | 'L' | 'f' | 'F' | 'd' | 'D' )?
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:21: ( DIGIT | '.' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='.'||(LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
                    	    {
                    	    if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
                    	    break loop6;
                        }
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:36: ( 'l' | 'L' | 'f' | 'F' | 'd' | 'D' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='D'||LA7_0=='F'||LA7_0=='L'||LA7_0=='d'||LA7_0=='f'||LA7_0=='l') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
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


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:66: ( ( 'X' | 'x' ) ( DIGIT | LETTER )+ )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:66: ( ( 'X' | 'x' ) ( DIGIT | LETTER )+ )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:67: ( 'X' | 'x' ) ( DIGIT | LETTER )+
                    {
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:77: ( DIGIT | LETTER )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:98: ( ( 'e' | 'E' ) ( '-' | '+' ) ( DIGIT )+ )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:98: ( ( 'e' | 'E' ) ( '-' | '+' ) ( DIGIT )+ )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:99: ( 'e' | 'E' ) ( '-' | '+' ) ( DIGIT )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:294:119: ( DIGIT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "SPECIAL_CHARS"
    public final void mSPECIAL_CHARS() throws RecognitionException {
        try {
            int _type = SPECIAL_CHARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:302:2: ( '%' | '?' | '|' | '&' | ';' | '[' | ']' | '{' | '}' | ':' | '/' | '#' | '=' | '@' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            {
            if ( input.LA(1)=='#'||(input.LA(1) >= '%' && input.LA(1) <= '&')||input.LA(1)=='/'||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='='||(input.LA(1) >= '?' && input.LA(1) <= '@')||input.LA(1)=='['||input.LA(1)==']'||(input.LA(1) >= '{' && input.LA(1) <= '}') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPECIAL_CHARS"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:304:6: ( ( '\\u000C' | ' ' | '\\t' )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:304:8: ( '\\u000C' | ' ' | '\\t' )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:304:8: ( '\\u000C' | ' ' | '\\t' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0=='\f'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:306:17: ( '0' .. '9' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
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
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:307:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
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

    public void mTokens() throws RecognitionException {
        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:8: ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | COMMENT | SINGLE_COMMENT | IFNDEF | IF | ELIF | IFDEF | ELSE | ENDIF | DEFINE | INCLUDE | IMPORT | DEFINED | RESERVED_WORDS | BACKSLASH | POINTS3 | MATH_OP | EXC | PLUS | MINUS | L_BR | R_BR | R_SHFT | L_SHFT | L_UBR | R_UBR | ASTERISK | QUOTE | RET | ID | NUMBER | SPECIAL_CHARS | WS )
        int alt12=41;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:10: T__65
                {
                mT__65(); 


                }
                break;
            case 2 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:16: T__66
                {
                mT__66(); 


                }
                break;
            case 3 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:22: T__67
                {
                mT__67(); 


                }
                break;
            case 4 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:28: T__68
                {
                mT__68(); 


                }
                break;
            case 5 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:34: T__69
                {
                mT__69(); 


                }
                break;
            case 6 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:40: T__70
                {
                mT__70(); 


                }
                break;
            case 7 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:46: T__71
                {
                mT__71(); 


                }
                break;
            case 8 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:52: T__72
                {
                mT__72(); 


                }
                break;
            case 9 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:58: T__73
                {
                mT__73(); 


                }
                break;
            case 10 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:64: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 11 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:72: SINGLE_COMMENT
                {
                mSINGLE_COMMENT(); 


                }
                break;
            case 12 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:87: IFNDEF
                {
                mIFNDEF(); 


                }
                break;
            case 13 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:94: IF
                {
                mIF(); 


                }
                break;
            case 14 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:97: ELIF
                {
                mELIF(); 


                }
                break;
            case 15 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:102: IFDEF
                {
                mIFDEF(); 


                }
                break;
            case 16 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:108: ELSE
                {
                mELSE(); 


                }
                break;
            case 17 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:113: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 18 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:119: DEFINE
                {
                mDEFINE(); 


                }
                break;
            case 19 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:126: INCLUDE
                {
                mINCLUDE(); 


                }
                break;
            case 20 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:134: IMPORT
                {
                mIMPORT(); 


                }
                break;
            case 21 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:141: DEFINED
                {
                mDEFINED(); 


                }
                break;
            case 22 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:149: RESERVED_WORDS
                {
                mRESERVED_WORDS(); 


                }
                break;
            case 23 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:164: BACKSLASH
                {
                mBACKSLASH(); 


                }
                break;
            case 24 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:174: POINTS3
                {
                mPOINTS3(); 


                }
                break;
            case 25 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:182: MATH_OP
                {
                mMATH_OP(); 


                }
                break;
            case 26 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:190: EXC
                {
                mEXC(); 


                }
                break;
            case 27 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:194: PLUS
                {
                mPLUS(); 


                }
                break;
            case 28 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:199: MINUS
                {
                mMINUS(); 


                }
                break;
            case 29 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:205: L_BR
                {
                mL_BR(); 


                }
                break;
            case 30 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:210: R_BR
                {
                mR_BR(); 


                }
                break;
            case 31 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:215: R_SHFT
                {
                mR_SHFT(); 


                }
                break;
            case 32 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:222: L_SHFT
                {
                mL_SHFT(); 


                }
                break;
            case 33 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:229: L_UBR
                {
                mL_UBR(); 


                }
                break;
            case 34 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:235: R_UBR
                {
                mR_UBR(); 


                }
                break;
            case 35 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:241: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 36 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:250: QUOTE
                {
                mQUOTE(); 


                }
                break;
            case 37 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:256: RET
                {
                mRET(); 


                }
                break;
            case 38 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:260: ID
                {
                mID(); 


                }
                break;
            case 39 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:263: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 40 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:270: SPECIAL_CHARS
                {
                mSPECIAL_CHARS(); 


                }
                break;
            case 41 :
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:284: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\31\1\uffff\1\35\1\41\1\44\1\31\1\50\1\uffff\2\31\1\27"+
        "\1\31\1\uffff\1\57\1\60\1\61\1\31\33\uffff\1\27\4\uffff\1\72\4\uffff"+
        "\1\27\5\uffff\3\27\1\101\1\uffff";
    static final String DFA12_eofS =
        "\102\uffff";
    static final String DFA12_minS =
        "\1\11\1\46\1\uffff\1\56\1\52\1\74\2\75\1\uffff\1\174\1\144\1\145"+
        "\1\143\1\uffff\1\53\1\55\2\75\30\uffff\1\146\1\154\1\uffff\1\146"+
        "\4\uffff\1\144\2\uffff\1\151\1\uffff\1\151\5\uffff\1\156\1\145\1"+
        "\144\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\175\1\46\1\uffff\1\56\3\75\1\76\1\uffff\1\174\1\151\1\145\1\164"+
        "\1\uffff\4\75\30\uffff\2\156\1\uffff\1\146\4\uffff\1\156\2\uffff"+
        "\1\163\1\uffff\1\151\5\uffff\1\156\1\145\1\144\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\5\uffff\1\10\4\uffff\1\27\4\uffff\1\32\1\35\1\36\1"+
        "\44\1\45\1\46\1\47\1\50\1\51\1\1\1\30\1\3\1\12\1\13\1\31\1\4\1\5"+
        "\1\40\1\41\1\6\1\7\1\37\1\42\1\11\2\uffff\1\22\1\uffff\1\26\1\33"+
        "\1\34\1\43\1\uffff\1\23\1\24\1\uffff\1\21\1\uffff\1\14\1\17\1\15"+
        "\1\16\1\20\4\uffff\1\25";
    static final String DFA12_specialS =
        "\102\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\32\1\26\1\uffff\1\32\1\26\22\uffff\1\32\1\22\1\25\1\12\1"+
            "\uffff\1\21\1\1\1\10\1\23\1\24\1\20\1\16\1\2\1\17\1\3\1\4\12"+
            "\30\2\31\1\5\1\6\1\7\1\31\1\14\32\27\1\31\1\15\1\31\1\uffff"+
            "\1\27\1\uffff\3\27\1\13\26\27\1\31\1\11\1\31",
            "\1\33",
            "",
            "\1\34",
            "\1\36\4\uffff\1\37\15\uffff\1\40",
            "\1\43\1\42",
            "\1\45",
            "\1\46\1\47",
            "",
            "\1\51",
            "\1\54\1\53\3\uffff\1\52",
            "\1\55",
            "\1\56\2\uffff\1\56\15\uffff\1\56",
            "",
            "\1\40\21\uffff\1\40",
            "\1\40\17\uffff\1\40",
            "\1\40",
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\6\uffff\1\64\1\63",
            "\1\65\1\uffff\1\66",
            "",
            "\1\67",
            "",
            "",
            "",
            "",
            "\1\71\11\uffff\1\70",
            "",
            "",
            "\1\73\11\uffff\1\74",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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
            return "1:1: Tokens : ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | COMMENT | SINGLE_COMMENT | IFNDEF | IF | ELIF | IFDEF | ELSE | ENDIF | DEFINE | INCLUDE | IMPORT | DEFINED | RESERVED_WORDS | BACKSLASH | POINTS3 | MATH_OP | EXC | PLUS | MINUS | L_BR | R_BR | R_SHFT | L_SHFT | L_UBR | R_UBR | ASTERISK | QUOTE | RET | ID | NUMBER | SPECIAL_CHARS | WS );";
        }
    }
 

}