package bg.tues.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDidiLexer extends Lexer {
    public static final int RULE_HEX=7;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
    public static final int RULE_NUMBER_LITERAL=6;
    public static final int RULE_DECIMAL=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalDidiLexer() {;} 
    public InternalDidiLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDidiLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:11:7: ( 'true' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:12:7: ( 'false' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:13:7: ( '--' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:13:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:14:7: ( '++' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:14:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:15:7: ( '+' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:15:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:16:7: ( '-' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:16:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:17:7: ( '*' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:18:7: ( '/' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:18:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:19:7: ( '%' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:19:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:20:7: ( '=' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:21:7: ( '&&' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:21:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:22:7: ( '||' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:22:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:23:7: ( '>' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:23:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:24:7: ( '<' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:24:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:25:7: ( '==' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:25:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:26:7: ( '<=' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:26:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:27:7: ( '>=' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:27:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:28:7: ( '!=' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:28:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:29:7: ( ';' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:29:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:30:7: ( '(' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:31:7: ( ')' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:32:7: ( ',' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:32:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:33:7: ( '{' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:33:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:34:7: ( '}' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:34:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:35:7: ( 'global' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:35:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:36:7: ( 'query' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:36:9: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:37:7: ( 'update' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:37:9: 'update'
            {
            match("update"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:38:7: ( 'print' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:38:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:39:7: ( 'println' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:39:9: 'println'
            {
            match("println"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:40:7: ( 'func' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:40:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:41:7: ( 'if' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:41:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:42:7: ( 'else' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:42:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:43:7: ( 'while' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:43:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:44:7: ( 'for' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:44:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:45:7: ( 'return' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:45:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:46:7: ( '+=' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:46:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:47:7: ( '-=' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:47:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:48:7: ( '*=' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:48:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:49:7: ( '/=' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:49:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:50:7: ( '%=' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:50:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:51:7: ( '===' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:51:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:52:7: ( '!==' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:52:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:53:7: ( 'instanceof' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:53:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:54:7: ( '->' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:54:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:55:7: ( '..<' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:55:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:56:7: ( '..' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:56:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:57:7: ( '=>' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:57:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:58:7: ( '<>' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:58:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:59:7: ( '?:' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:59:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:60:7: ( '**' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:60:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:61:7: ( '!' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:61:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:62:7: ( 'as' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:62:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:63:7: ( '.' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:63:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:64:7: ( '::' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:64:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:65:7: ( '?.' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:65:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:66:7: ( '#' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:66:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:67:7: ( '[' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:67:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:68:7: ( ']' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:68:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:69:7: ( '|' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:69:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:70:7: ( 'switch' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:70:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:71:7: ( ':' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:71:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:72:7: ( 'default' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:72:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:73:7: ( 'case' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:73:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:74:7: ( 'do' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:74:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:75:7: ( 'var' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:75:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:76:7: ( 'val' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:76:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:77:7: ( 'extends' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:77:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:78:7: ( 'static' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:78:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:79:7: ( 'import' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:79:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:80:7: ( 'extension' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:80:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:81:7: ( 'super' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:81:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:82:7: ( 'new' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:82:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:83:7: ( 'null' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:83:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:84:7: ( 'typeof' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:84:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:85:7: ( 'throw' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:85:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:86:7: ( 'try' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:86:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:87:7: ( 'finally' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:87:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:88:7: ( 'synchronized' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:88:9: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:89:7: ( 'catch' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:89:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:90:7: ( '?' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:90:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:91:7: ( '&' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:91:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "RULE_NUMBER_LITERAL"
    public final void mRULE_NUMBER_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_NUMBER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:21: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )* )? ) )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:23: ( '0' | '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )* )? )
            {
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:23: ( '0' | '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )* )? )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:24: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:28: '1' .. '9' ( '0' .. '9' )* ( '.' ( '0' .. '9' )* )?
                    {
                    matchRange('1','9'); 
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:37: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:38: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:49: ( '.' ( '0' .. '9' )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='.') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:50: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:54: ( '0' .. '9' )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8942:55: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER_LITERAL"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8944:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8944:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8944:43: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:12: ( '0x' | '0X' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='0') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='x') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='X') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='#') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='B'||LA8_0=='b') ) {
                        alt8=1;
                    }
                    else if ( (LA8_0=='L'||LA8_0=='l') ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8946:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8948:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8948:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8948:21: ( '0' .. '9' | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8950:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8950:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8950:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='E'||LA12_0=='e') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8950:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8950:36: ( '+' | '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='+'||LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8950:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='B'||LA13_0=='b') ) {
                alt13=1;
            }
            else if ( (LA13_0=='D'||LA13_0=='F'||LA13_0=='L'||LA13_0=='d'||LA13_0=='f'||LA13_0=='l') ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8950:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8950:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8952:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8952:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8952:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8952:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8952:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='$'||(LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:44: ( '\"' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\"') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:62: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:79: ( '\\'' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\'') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8954:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8956:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8956:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8956:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8956:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8958:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8958:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8958:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8958:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8958:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8958:41: ( '\\r' )? '\\n'
                    {
                    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8958:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8958:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8960:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8960:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8960:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8962:16: ( . )
            // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:8962:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_NUMBER_LITERAL | RULE_IDENTIFIER | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt26=92;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:484: T__94
                {
                mT__94(); 

                }
                break;
            case 81 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:490: T__95
                {
                mT__95(); 

                }
                break;
            case 82 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:496: RULE_NUMBER_LITERAL
                {
                mRULE_NUMBER_LITERAL(); 

                }
                break;
            case 83 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:516: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 84 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:532: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 85 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:541: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 86 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:550: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 87 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:563: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 88 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:571: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 89 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:583: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 90 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:599: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 91 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:615: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 92 :
                // ../bg.tues/src-gen/bg/tues/parser/antlr/internal/InternalDidi.g:1:623: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\1\uffff\2\65\1\76\1\101\1\104\1\110\1\112\1\115\1\117\1\121\1"+
        "\123\1\126\1\130\6\uffff\10\65\1\153\1\156\1\65\1\161\3\uffff\5"+
        "\65\2\u0080\1\65\1\60\5\uffff\4\65\2\uffff\4\65\20\uffff\1\u008f"+
        "\13\uffff\1\u0091\7\uffff\4\65\1\u0096\6\65\1\u009e\4\uffff\1\u009f"+
        "\5\uffff\5\65\1\u00a5\4\65\2\uffff\1\u00ac\1\uffff\1\u0080\2\uffff"+
        "\1\65\1\u00ae\4\65\1\u00b3\1\65\4\uffff\4\65\1\uffff\6\65\3\uffff"+
        "\5\65\1\uffff\2\65\1\u00c6\1\u00c7\1\u00c8\1\65\1\uffff\1\u00ca"+
        "\1\uffff\3\65\1\u00ce\1\uffff\7\65\1\u00d6\10\65\1\u00df\1\65\3"+
        "\uffff\1\u00e1\1\uffff\1\65\1\u00e3\1\u00e4\1\uffff\2\65\1\u00e7"+
        "\1\65\1\u00ea\2\65\1\uffff\1\65\1\u00ef\3\65\1\u00f3\2\65\1\uffff"+
        "\1\u00f6\1\uffff\1\u00f7\2\uffff\1\65\1\u00f9\1\uffff\1\u00fa\1"+
        "\65\1\uffff\1\65\1\u00fd\2\65\1\uffff\1\u0100\1\u0101\1\u0102\1"+
        "\uffff\2\65\2\uffff\1\u0105\2\uffff\1\u0106\1\65\1\uffff\1\u0108"+
        "\1\65\3\uffff\1\65\1\u010b\2\uffff\1\65\1\uffff\2\65\1\uffff\1\65"+
        "\1\u0110\1\65\1\u0112\1\uffff\1\65\1\uffff\1\65\1\u0115\1\uffff";
    static final String DFA26_eofS =
        "\u0116\uffff";
    static final String DFA26_minS =
        "\1\0\2\44\1\55\1\53\2\52\2\75\1\46\1\174\3\75\6\uffff\10\44\2\56"+
        "\1\44\1\72\3\uffff\5\44\2\60\2\44\5\uffff\4\44\2\uffff\4\44\20\uffff"+
        "\1\75\13\uffff\1\75\7\uffff\13\44\1\74\4\uffff\1\44\5\uffff\12\44"+
        "\2\uffff\1\60\1\uffff\1\60\2\uffff\10\44\4\uffff\4\44\1\uffff\6"+
        "\44\3\uffff\5\44\1\uffff\6\44\1\uffff\1\44\1\uffff\4\44\1\uffff"+
        "\22\44\3\uffff\1\44\1\uffff\3\44\1\uffff\7\44\1\uffff\10\44\1\uffff"+
        "\1\44\1\uffff\1\44\2\uffff\2\44\1\uffff\2\44\1\uffff\4\44\1\uffff"+
        "\3\44\1\uffff\2\44\2\uffff\1\44\2\uffff\2\44\1\uffff\2\44\3\uffff"+
        "\2\44\2\uffff\1\44\1\uffff\2\44\1\uffff\4\44\1\uffff\1\44\1\uffff"+
        "\2\44\1\uffff";
    static final String DFA26_maxS =
        "\1\uffff\2\172\1\76\4\75\1\76\1\46\1\174\1\75\1\76\1\75\6\uffff"+
        "\10\172\1\56\1\72\1\172\1\72\3\uffff\5\172\1\170\1\154\2\172\5\uffff"+
        "\4\172\2\uffff\4\172\20\uffff\1\75\13\uffff\1\75\7\uffff\13\172"+
        "\1\74\4\uffff\1\172\5\uffff\12\172\2\uffff\1\154\1\uffff\1\154\2"+
        "\uffff\10\172\4\uffff\4\172\1\uffff\6\172\3\uffff\5\172\1\uffff"+
        "\6\172\1\uffff\1\172\1\uffff\4\172\1\uffff\22\172\3\uffff\1\172"+
        "\1\uffff\3\172\1\uffff\7\172\1\uffff\10\172\1\uffff\1\172\1\uffff"+
        "\1\172\2\uffff\2\172\1\uffff\2\172\1\uffff\4\172\1\uffff\3\172\1"+
        "\uffff\2\172\2\uffff\1\172\2\uffff\2\172\1\uffff\2\172\3\uffff\2"+
        "\172\2\uffff\1\172\1\uffff\2\172\1\uffff\4\172\1\uffff\1\172\1\uffff"+
        "\2\172\1\uffff";
    static final String DFA26_acceptS =
        "\16\uffff\1\23\1\24\1\25\1\26\1\27\1\30\14\uffff\1\70\1\71\1\72"+
        "\11\uffff\1\127\2\130\1\133\1\134\4\uffff\1\123\1\127\4\uffff\1"+
        "\3\1\45\1\54\1\6\1\4\1\44\1\5\1\46\1\62\1\7\1\47\1\131\1\132\1\10"+
        "\1\50\1\11\1\uffff\1\57\1\12\1\13\1\121\1\14\1\73\1\21\1\15\1\20"+
        "\1\60\1\16\1\uffff\1\63\1\23\1\24\1\25\1\26\1\27\1\30\14\uffff\1"+
        "\65\1\61\1\67\1\120\1\uffff\1\66\1\75\1\70\1\71\1\72\12\uffff\1"+
        "\124\1\122\1\uffff\1\126\1\uffff\1\130\1\133\10\uffff\1\51\1\17"+
        "\1\52\1\22\4\uffff\1\37\6\uffff\1\55\1\56\1\64\5\uffff\1\100\6\uffff"+
        "\1\125\1\uffff\1\114\4\uffff\1\42\22\uffff\1\101\1\102\1\110\1\uffff"+
        "\1\1\3\uffff\1\36\7\uffff\1\40\10\uffff\1\77\1\uffff\1\111\1\uffff"+
        "\1\113\1\2\2\uffff\1\32\2\uffff\1\34\4\uffff\1\41\3\uffff\1\107"+
        "\2\uffff\1\117\1\112\1\uffff\1\31\1\33\2\uffff\1\105\2\uffff\1\43"+
        "\1\74\1\104\2\uffff\1\115\1\35\1\uffff\1\103\2\uffff\1\76\4\uffff"+
        "\1\106\1\uffff\1\53\2\uffff\1\116";
    static final String DFA26_specialS =
        "\1\0\u0115\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\15\1\55\1\40\1\54\1\7\1"+
            "\11\1\56\1\17\1\20\1\5\1\4\1\21\1\3\1\34\1\6\1\50\11\51\1\37"+
            "\1\16\1\14\1\10\1\13\1\35\1\60\32\52\1\41\1\60\1\42\1\53\1\52"+
            "\1\60\1\36\1\52\1\45\1\44\1\31\1\2\1\24\1\52\1\30\4\52\1\47"+
            "\1\52\1\27\1\25\1\33\1\43\1\1\1\26\1\46\1\32\3\52\1\22\1\12"+
            "\1\23\uff82\60",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7"+
            "\64\1\63\11\64\1\61\6\64\1\62\1\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\67\7\64\1\72\5\64\1\71\5\64\1\70\5\64",
            "\1\73\17\uffff\1\74\1\75",
            "\1\77\21\uffff\1\100",
            "\1\103\22\uffff\1\102",
            "\1\106\4\uffff\1\107\15\uffff\1\105",
            "\1\111",
            "\1\113\1\114",
            "\1\116",
            "\1\120",
            "\1\122",
            "\1\124\1\125",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\137\16\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24"+
            "\64\1\140\5\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17"+
            "\64\1\141\12\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21"+
            "\64\1\142\10\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5"+
            "\64\1\143\6\64\1\145\1\144\14\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\146\13\64\1\147\2\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7"+
            "\64\1\150\22\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\151\25\64",
            "\1\152",
            "\1\155\13\uffff\1\154",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22"+
            "\64\1\157\7\64",
            "\1\160",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\166\1\167\1\64\1\165\1\64\1\170\1\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\171\11\64\1\172\13\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\173\31\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\174\31\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\175\17\64\1\176\5\64",
            "\12\u0081\10\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082"+
            "\13\uffff\1\177\6\uffff\1\u0081\2\uffff\1\u0082\1\uffff\3\u0082"+
            "\5\uffff\1\u0082\13\uffff\1\177",
            "\12\u0083\10\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082"+
            "\22\uffff\1\u0081\2\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1"+
            "\u0082",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\34\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24"+
            "\64\1\u0086\3\64\1\u0087\1\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17"+
            "\64\1\u0088\12\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21"+
            "\64\1\u0089\10\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u008a\16\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u008b\14\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21"+
            "\64\1\u008c\10\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u008d\14\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16"+
            "\64\1\u0092\13\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u0093\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3"+
            "\64\1\u0094\26\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10"+
            "\64\1\u0095\21\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22"+
            "\64\1\u0097\7\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17"+
            "\64\1\u0098\12\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22"+
            "\64\1\u0099\7\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u009a\6\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10"+
            "\64\1\u009b\21\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u009c\6\64",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10"+
            "\64\1\u00a0\21\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\u00a1\31\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17"+
            "\64\1\u00a2\12\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u00a3\14\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5"+
            "\64\1\u00a4\24\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22"+
            "\64\1\u00a6\1\u00a7\6\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u00a9\5\64\1\u00a8\10\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\26"+
            "\64\1\u00aa\3\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u00ab\16\64",
            "",
            "",
            "\12\u0081\10\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082"+
            "\22\uffff\1\u0081\2\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1"+
            "\u0082",
            "",
            "\12\u0083\10\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082"+
            "\22\uffff\1\u0081\2\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1"+
            "\u0082",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u00ad\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u00af\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16"+
            "\64\1\u00b0\13\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22"+
            "\64\1\u00b1\7\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2"+
            "\64\1\u00b2\27\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\u00b4\31\64",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\64\1\u00b5\30\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21"+
            "\64\1\u00b6\10\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\u00b7\31\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u00b8\14\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u00b9\6\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16"+
            "\64\1\u00ba\13\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u00bb\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u00bc\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u00bd\16\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24"+
            "\64\1\u00be\5\64",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u00bf\6\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u00c0\6\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u00c1\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2"+
            "\64\1\u00c2\27\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\u00c3\31\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u00c4\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2"+
            "\64\1\u00c5\27\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u00c9\16\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16"+
            "\64\1\u00cb\13\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\26"+
            "\64\1\u00cc\3\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u00cd\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u00cf\16\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\u00d0\31\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30"+
            "\64\1\u00d1\1\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u00d2\6\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u00d3\6\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1"+
            "\u00d4\31\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21"+
            "\64\1\u00d5\10\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u00d7\14\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u00d8\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21"+
            "\64\1\u00d9\10\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2"+
            "\64\1\u00da\27\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10"+
            "\64\1\u00db\21\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21"+
            "\64\1\u00dc\10\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7"+
            "\64\1\u00dd\22\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24"+
            "\64\1\u00de\5\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7"+
            "\64\1\u00e0\22\64",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5"+
            "\64\1\u00e2\24\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u00e5\16\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u00e6\16\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u00e8\25\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u00e9\16\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u00eb\14\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u00ec\6\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3"+
            "\64\1\u00ed\16\64\1\u00ee\7\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u00f0\14\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7"+
            "\64\1\u00f1\22\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2"+
            "\64\1\u00f2\27\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21"+
            "\64\1\u00f4\10\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u00f5\16\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30"+
            "\64\1\u00f8\1\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u00fb\14\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2"+
            "\64\1\u00fc\27\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22"+
            "\64\1\u00fe\7\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10"+
            "\64\1\u00ff\21\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16"+
            "\64\1\u0103\13\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23"+
            "\64\1\u0104\6\64",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u0107\25\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16"+
            "\64\1\u0109\13\64",
            "",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u010a\14\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16"+
            "\64\1\u010c\13\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u010d\14\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10"+
            "\64\1\u010e\21\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5"+
            "\64\1\u010f\24\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\31"+
            "\64\1\u0111",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\u0113\25\64",
            "",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3"+
            "\64\1\u0114\26\64",
            "\1\66\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
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
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_NUMBER_LITERAL | RULE_IDENTIFIER | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='t') ) {s = 1;}

                        else if ( (LA26_0=='f') ) {s = 2;}

                        else if ( (LA26_0=='-') ) {s = 3;}

                        else if ( (LA26_0=='+') ) {s = 4;}

                        else if ( (LA26_0=='*') ) {s = 5;}

                        else if ( (LA26_0=='/') ) {s = 6;}

                        else if ( (LA26_0=='%') ) {s = 7;}

                        else if ( (LA26_0=='=') ) {s = 8;}

                        else if ( (LA26_0=='&') ) {s = 9;}

                        else if ( (LA26_0=='|') ) {s = 10;}

                        else if ( (LA26_0=='>') ) {s = 11;}

                        else if ( (LA26_0=='<') ) {s = 12;}

                        else if ( (LA26_0=='!') ) {s = 13;}

                        else if ( (LA26_0==';') ) {s = 14;}

                        else if ( (LA26_0=='(') ) {s = 15;}

                        else if ( (LA26_0==')') ) {s = 16;}

                        else if ( (LA26_0==',') ) {s = 17;}

                        else if ( (LA26_0=='{') ) {s = 18;}

                        else if ( (LA26_0=='}') ) {s = 19;}

                        else if ( (LA26_0=='g') ) {s = 20;}

                        else if ( (LA26_0=='q') ) {s = 21;}

                        else if ( (LA26_0=='u') ) {s = 22;}

                        else if ( (LA26_0=='p') ) {s = 23;}

                        else if ( (LA26_0=='i') ) {s = 24;}

                        else if ( (LA26_0=='e') ) {s = 25;}

                        else if ( (LA26_0=='w') ) {s = 26;}

                        else if ( (LA26_0=='r') ) {s = 27;}

                        else if ( (LA26_0=='.') ) {s = 28;}

                        else if ( (LA26_0=='?') ) {s = 29;}

                        else if ( (LA26_0=='a') ) {s = 30;}

                        else if ( (LA26_0==':') ) {s = 31;}

                        else if ( (LA26_0=='#') ) {s = 32;}

                        else if ( (LA26_0=='[') ) {s = 33;}

                        else if ( (LA26_0==']') ) {s = 34;}

                        else if ( (LA26_0=='s') ) {s = 35;}

                        else if ( (LA26_0=='d') ) {s = 36;}

                        else if ( (LA26_0=='c') ) {s = 37;}

                        else if ( (LA26_0=='v') ) {s = 38;}

                        else if ( (LA26_0=='n') ) {s = 39;}

                        else if ( (LA26_0=='0') ) {s = 40;}

                        else if ( ((LA26_0>='1' && LA26_0<='9')) ) {s = 41;}

                        else if ( ((LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||LA26_0=='b'||LA26_0=='h'||(LA26_0>='j' && LA26_0<='m')||LA26_0=='o'||(LA26_0>='x' && LA26_0<='z')) ) {s = 42;}

                        else if ( (LA26_0=='^') ) {s = 43;}

                        else if ( (LA26_0=='$') ) {s = 44;}

                        else if ( (LA26_0=='\"') ) {s = 45;}

                        else if ( (LA26_0=='\'') ) {s = 46;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 47;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||LA26_0=='@'||LA26_0=='\\'||LA26_0=='`'||(LA26_0>='~' && LA26_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}