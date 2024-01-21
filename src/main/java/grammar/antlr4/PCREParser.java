// Generated from D:/MyWorkDir/RegexProfile/src/main/java/grammar/antlr4\PCRE.g4 by ANTLR 4.12.0
package grammar.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PCREParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Quoted=1, BlockQuoted=2, BellChar=3, ControlChar=4, EscapeChar=5, FormFeed=6, 
		NewLine=7, CarriageReturn=8, Tab=9, Backslash=10, HexChar=11, Dot=12, 
		OneDataUnit=13, DecimalDigit=14, NotDecimalDigit=15, HorizontalWhiteSpace=16, 
		NotHorizontalWhiteSpace=17, NotNewLine=18, CharWithProperty=19, CharWithoutProperty=20, 
		NewLineSequence=21, WhiteSpace=22, NotWhiteSpace=23, VerticalWhiteSpace=24, 
		NotVerticalWhiteSpace=25, WordChar=26, NotWordChar=27, ExtendedUnicodeChar=28, 
		CharacterClassStart=29, CharacterClassEnd=30, Caret=31, Hyphen=32, POSIXNamedSet=33, 
		POSIXNegatedNamedSet=34, QuestionMark=35, Plus=36, Star=37, OpenBrace=38, 
		CloseBrace=39, Comma=40, WordBoundary=41, NonWordBoundary=42, StartOfSubject=43, 
		EndOfSubjectOrLine=44, EndOfSubjectOrLineEndOfSubject=45, EndOfSubject=46, 
		PreviousMatchInSubject=47, ResetStartMatch=48, SubroutineOrNamedReferenceStartG=49, 
		NamedReferenceStartK=50, Pipe=51, OpenParen=52, CloseParen=53, LessThan=54, 
		GreaterThan=55, SingleQuote=56, Underscore=57, Colon=58, Hash=59, Equals=60, 
		Exclamation=61, Ampersand=62, ALC=63, BLC=64, CLC=65, DLC=66, ELC=67, 
		FLC=68, GLC=69, HLC=70, ILC=71, JLC=72, KLC=73, LLC=74, MLC=75, NLC=76, 
		OLC=77, PLC=78, QLC=79, RLC=80, SLC=81, TLC=82, ULC=83, VLC=84, WLC=85, 
		XLC=86, YLC=87, ZLC=88, AUC=89, BUC=90, CUC=91, DUC=92, EUC=93, FUC=94, 
		GUC=95, HUC=96, IUC=97, JUC=98, KUC=99, LUC=100, MUC=101, NUC=102, OUC=103, 
		PUC=104, QUC=105, RUC=106, SUC=107, TUC=108, UUC=109, VUC=110, WUC=111, 
		XUC=112, YUC=113, ZUC=114, D1=115, D2=116, D3=117, D4=118, D5=119, D6=120, 
		D7=121, D8=122, D9=123, D0=124, OtherChar=125;
	public static final int
		RULE_parse = 0, RULE_alternation = 1, RULE_expr = 2, RULE_element = 3, 
		RULE_quantifier = 4, RULE_quantifier_type = 5, RULE_character_class = 6, 
		RULE_backreference = 7, RULE_backreference_or_octal = 8, RULE_capture = 9, 
		RULE_non_capture = 10, RULE_comment = 11, RULE_option = 12, RULE_option_flags = 13, 
		RULE_option_flag = 14, RULE_lookaround = 15, RULE_subroutine_reference = 16, 
		RULE_conditional = 17, RULE_backtrack_control = 18, RULE_newline_convention = 19, 
		RULE_callout = 20, RULE_atom = 21, RULE_cc_atom = 22, RULE_shared_atom = 23, 
		RULE_literal = 24, RULE_cc_literal = 25, RULE_shared_literal = 26, RULE_number = 27, 
		RULE_octal_char = 28, RULE_octal_digit = 29, RULE_digits = 30, RULE_digit = 31, 
		RULE_name = 32, RULE_alpha_nums = 33, RULE_non_close_parens = 34, RULE_non_close_paren = 35, 
		RULE_letter = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "alternation", "expr", "element", "quantifier", "quantifier_type", 
			"character_class", "backreference", "backreference_or_octal", "capture", 
			"non_capture", "comment", "option", "option_flags", "option_flag", "lookaround", 
			"subroutine_reference", "conditional", "backtrack_control", "newline_convention", 
			"callout", "atom", "cc_atom", "shared_atom", "literal", "cc_literal", 
			"shared_literal", "number", "octal_char", "octal_digit", "digits", "digit", 
			"name", "alpha_nums", "non_close_parens", "non_close_paren", "letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'\\a'", null, "'\\e'", "'\\f'", "'\\n'", "'\\r'", 
			"'\\t'", "'\\'", null, "'.'", "'\\C'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", 
			"'\\N'", null, null, "'\\R'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", "'\\w'", 
			"'\\W'", "'\\X'", "'['", "']'", "'^'", "'-'", null, null, "'?'", "'+'", 
			"'*'", "'{'", "'}'", "','", "'\\b'", "'\\B'", "'\\A'", "'$'", "'\\Z'", 
			"'\\z'", "'\\G'", "'\\K'", "'\\g'", "'\\k'", "'|'", "'('", "')'", "'<'", 
			"'>'", "'''", "'_'", "':'", "'#'", "'='", "'!'", "'&'", "'a'", "'b'", 
			"'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", 
			"'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", 
			"'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", 
			"'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", 
			"'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", 
			"'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Quoted", "BlockQuoted", "BellChar", "ControlChar", "EscapeChar", 
			"FormFeed", "NewLine", "CarriageReturn", "Tab", "Backslash", "HexChar", 
			"Dot", "OneDataUnit", "DecimalDigit", "NotDecimalDigit", "HorizontalWhiteSpace", 
			"NotHorizontalWhiteSpace", "NotNewLine", "CharWithProperty", "CharWithoutProperty", 
			"NewLineSequence", "WhiteSpace", "NotWhiteSpace", "VerticalWhiteSpace", 
			"NotVerticalWhiteSpace", "WordChar", "NotWordChar", "ExtendedUnicodeChar", 
			"CharacterClassStart", "CharacterClassEnd", "Caret", "Hyphen", "POSIXNamedSet", 
			"POSIXNegatedNamedSet", "QuestionMark", "Plus", "Star", "OpenBrace", 
			"CloseBrace", "Comma", "WordBoundary", "NonWordBoundary", "StartOfSubject", 
			"EndOfSubjectOrLine", "EndOfSubjectOrLineEndOfSubject", "EndOfSubject", 
			"PreviousMatchInSubject", "ResetStartMatch", "SubroutineOrNamedReferenceStartG", 
			"NamedReferenceStartK", "Pipe", "OpenParen", "CloseParen", "LessThan", 
			"GreaterThan", "SingleQuote", "Underscore", "Colon", "Hash", "Equals", 
			"Exclamation", "Ampersand", "ALC", "BLC", "CLC", "DLC", "ELC", "FLC", 
			"GLC", "HLC", "ILC", "JLC", "KLC", "LLC", "MLC", "NLC", "OLC", "PLC", 
			"QLC", "RLC", "SLC", "TLC", "ULC", "VLC", "WLC", "XLC", "YLC", "ZLC", 
			"AUC", "BUC", "CUC", "DUC", "EUC", "FUC", "GUC", "HUC", "IUC", "JUC", 
			"KUC", "LUC", "MUC", "NUC", "OUC", "PUC", "QUC", "RUC", "SUC", "TUC", 
			"UUC", "VUC", "WUC", "XUC", "YUC", "ZUC", "D1", "D2", "D3", "D4", "D5", 
			"D6", "D7", "D8", "D9", "D0", "OtherChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PCRE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PCREParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PCREParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			alternation();
			setState(75);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlternationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(PCREParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(PCREParser.Pipe, i);
		}
		public AlternationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterAlternation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitAlternation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitAlternation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternationContext alternation() throws RecognitionException {
		AlternationContext _localctx = new AlternationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alternation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			expr();
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					match(Pipe);
					setState(79);
					expr();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -11259239586594822L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0)) {
				{
				{
				setState(85);
				element();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			atom();
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(92);
				quantifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierContext extends ParserRuleContext {
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	 
		public QuantifierContext() { }
		public void copyFrom(QuantifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Quantifier6Context extends QuantifierContext {
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode Comma() { return getToken(PCREParser.Comma, 0); }
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public Quantifier_typeContext quantifier_type() {
			return getRuleContext(Quantifier_typeContext.class,0);
		}
		public Quantifier6Context(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier6(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Quantifier1Context extends QuantifierContext {
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public Quantifier_typeContext quantifier_type() {
			return getRuleContext(Quantifier_typeContext.class,0);
		}
		public Quantifier1Context(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Quantifier3Context extends QuantifierContext {
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public Quantifier_typeContext quantifier_type() {
			return getRuleContext(Quantifier_typeContext.class,0);
		}
		public Quantifier3Context(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Quantifier2Context extends QuantifierContext {
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public Quantifier_typeContext quantifier_type() {
			return getRuleContext(Quantifier_typeContext.class,0);
		}
		public Quantifier2Context(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Quantifier5Context extends QuantifierContext {
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PCREParser.Comma, 0); }
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public Quantifier_typeContext quantifier_type() {
			return getRuleContext(Quantifier_typeContext.class,0);
		}
		public Quantifier5Context(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier5(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Quantifier4Context extends QuantifierContext {
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public Quantifier_typeContext quantifier_type() {
			return getRuleContext(Quantifier_typeContext.class,0);
		}
		public Quantifier4Context(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quantifier);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Quantifier1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(QuestionMark);
				setState(96);
				quantifier_type();
				}
				break;
			case 2:
				_localctx = new Quantifier2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(Plus);
				setState(98);
				quantifier_type();
				}
				break;
			case 3:
				_localctx = new Quantifier3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(Star);
				setState(100);
				quantifier_type();
				}
				break;
			case 4:
				_localctx = new Quantifier4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(OpenBrace);
				setState(102);
				number();
				setState(103);
				match(CloseBrace);
				setState(104);
				quantifier_type();
				}
				break;
			case 5:
				_localctx = new Quantifier5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(OpenBrace);
				setState(107);
				number();
				setState(108);
				match(Comma);
				setState(109);
				match(CloseBrace);
				setState(110);
				quantifier_type();
				}
				break;
			case 6:
				_localctx = new Quantifier6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				match(OpenBrace);
				setState(113);
				number();
				setState(114);
				match(Comma);
				setState(115);
				number();
				setState(116);
				match(CloseBrace);
				setState(117);
				quantifier_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Quantifier_typeContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public Quantifier_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterQuantifier_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitQuantifier_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitQuantifier_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_typeContext quantifier_type() throws RecognitionException {
		Quantifier_typeContext _localctx = new Quantifier_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_quantifier_type);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(Plus);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(QuestionMark);
				}
				break;
			case EOF:
			case Quoted:
			case BellChar:
			case ControlChar:
			case EscapeChar:
			case FormFeed:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case HexChar:
			case Dot:
			case OneDataUnit:
			case DecimalDigit:
			case NotDecimalDigit:
			case HorizontalWhiteSpace:
			case NotHorizontalWhiteSpace:
			case NotNewLine:
			case CharWithProperty:
			case CharWithoutProperty:
			case NewLineSequence:
			case WhiteSpace:
			case NotWhiteSpace:
			case VerticalWhiteSpace:
			case NotVerticalWhiteSpace:
			case WordChar:
			case NotWordChar:
			case ExtendedUnicodeChar:
			case CharacterClassStart:
			case CharacterClassEnd:
			case Caret:
			case Hyphen:
			case POSIXNamedSet:
			case POSIXNegatedNamedSet:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case WordBoundary:
			case NonWordBoundary:
			case StartOfSubject:
			case EndOfSubjectOrLine:
			case EndOfSubjectOrLineEndOfSubject:
			case EndOfSubject:
			case PreviousMatchInSubject:
			case ResetStartMatch:
			case SubroutineOrNamedReferenceStartG:
			case NamedReferenceStartK:
			case Pipe:
			case OpenParen:
			case CloseParen:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case ALC:
			case BLC:
			case CLC:
			case DLC:
			case ELC:
			case FLC:
			case GLC:
			case HLC:
			case ILC:
			case JLC:
			case KLC:
			case LLC:
			case MLC:
			case NLC:
			case OLC:
			case PLC:
			case QLC:
			case RLC:
			case SLC:
			case TLC:
			case ULC:
			case VLC:
			case WLC:
			case XLC:
			case YLC:
			case ZLC:
			case AUC:
			case BUC:
			case CUC:
			case DUC:
			case EUC:
			case FUC:
			case GUC:
			case HUC:
			case IUC:
			case JUC:
			case KUC:
			case LUC:
			case MUC:
			case NUC:
			case OUC:
			case PUC:
			case QUC:
			case RUC:
			case SUC:
			case TUC:
			case UUC:
			case VUC:
			case WUC:
			case XUC:
			case YUC:
			case ZUC:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
			case OtherChar:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Character_classContext extends ParserRuleContext {
		public TerminalNode CharacterClassStart() { return getToken(PCREParser.CharacterClassStart, 0); }
		public TerminalNode Caret() { return getToken(PCREParser.Caret, 0); }
		public List<TerminalNode> CharacterClassEnd() { return getTokens(PCREParser.CharacterClassEnd); }
		public TerminalNode CharacterClassEnd(int i) {
			return getToken(PCREParser.CharacterClassEnd, i);
		}
		public List<Cc_atomContext> cc_atom() {
			return getRuleContexts(Cc_atomContext.class);
		}
		public Cc_atomContext cc_atom(int i) {
			return getRuleContext(Cc_atomContext.class,i);
		}
		public Character_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCharacter_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCharacter_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCharacter_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_classContext character_class() throws RecognitionException {
		Character_classContext _localctx = new Character_classContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_character_class);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(CharacterClassStart);
				setState(127);
				match(Caret);
				setState(128);
				match(CharacterClassEnd);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2229810923315206L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0)) {
					{
					{
					setState(129);
					cc_atom();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(CharacterClassEnd);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(CharacterClassStart);
				setState(137);
				match(Caret);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					cc_atom();
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2229810923315206L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) );
				setState(143);
				match(CharacterClassEnd);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(CharacterClassStart);
				setState(146);
				match(CharacterClassEnd);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2229810923315206L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0)) {
					{
					{
					setState(147);
					cc_atom();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(CharacterClassEnd);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(CharacterClassStart);
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					cc_atom();
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2229810923315206L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) );
				setState(160);
				match(CharacterClassEnd);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackreferenceContext extends ParserRuleContext {
		public BackreferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backreference; }
	 
		public BackreferenceContext() { }
		public void copyFrom(BackreferenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Backreference6Context extends BackreferenceContext {
		public TerminalNode NamedReferenceStartK() { return getToken(PCREParser.NamedReferenceStartK, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(PCREParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(PCREParser.SingleQuote, i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Backreference6Context(BackreferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference6(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Backreference7Context extends BackreferenceContext {
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(PCREParser.SubroutineOrNamedReferenceStartG, 0); }
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public Backreference7Context(BackreferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference7(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Backreference4Context extends BackreferenceContext {
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(PCREParser.SubroutineOrNamedReferenceStartG, 0); }
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public Backreference4Context(BackreferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Backreference5Context extends BackreferenceContext {
		public TerminalNode NamedReferenceStartK() { return getToken(PCREParser.NamedReferenceStartK, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public Backreference5Context(BackreferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference5(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Backreference8Context extends BackreferenceContext {
		public TerminalNode NamedReferenceStartK() { return getToken(PCREParser.NamedReferenceStartK, 0); }
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public Backreference8Context(BackreferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference8(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Backreference9Context extends BackreferenceContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode Equals() { return getToken(PCREParser.Equals, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Backreference9Context(BackreferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference9(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Backreference2Context extends BackreferenceContext {
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(PCREParser.SubroutineOrNamedReferenceStartG, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Backreference2Context(BackreferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Backreference3Context extends BackreferenceContext {
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(PCREParser.SubroutineOrNamedReferenceStartG, 0); }
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public Backreference3Context(BackreferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Backreference1Context extends BackreferenceContext {
		public Backreference_or_octalContext backreference_or_octal() {
			return getRuleContext(Backreference_or_octalContext.class,0);
		}
		public Backreference1Context(BackreferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackreferenceContext backreference() throws RecognitionException {
		BackreferenceContext _localctx = new BackreferenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_backreference);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Backreference1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				backreference_or_octal();
				}
				break;
			case 2:
				_localctx = new Backreference2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(SubroutineOrNamedReferenceStartG);
				setState(166);
				number();
				}
				break;
			case 3:
				_localctx = new Backreference3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(SubroutineOrNamedReferenceStartG);
				setState(168);
				match(OpenBrace);
				setState(169);
				number();
				setState(170);
				match(CloseBrace);
				}
				break;
			case 4:
				_localctx = new Backreference4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(SubroutineOrNamedReferenceStartG);
				setState(173);
				match(OpenBrace);
				setState(174);
				match(Hyphen);
				setState(175);
				number();
				setState(176);
				match(CloseBrace);
				}
				break;
			case 5:
				_localctx = new Backreference5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(NamedReferenceStartK);
				setState(179);
				match(LessThan);
				setState(180);
				name();
				setState(181);
				match(GreaterThan);
				}
				break;
			case 6:
				_localctx = new Backreference6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(NamedReferenceStartK);
				setState(184);
				match(SingleQuote);
				setState(185);
				name();
				setState(186);
				match(SingleQuote);
				}
				break;
			case 7:
				_localctx = new Backreference7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				match(SubroutineOrNamedReferenceStartG);
				setState(189);
				match(OpenBrace);
				setState(190);
				name();
				setState(191);
				match(CloseBrace);
				}
				break;
			case 8:
				_localctx = new Backreference8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
				match(NamedReferenceStartK);
				setState(194);
				match(OpenBrace);
				setState(195);
				name();
				setState(196);
				match(CloseBrace);
				}
				break;
			case 9:
				_localctx = new Backreference9Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(198);
				match(OpenParen);
				setState(199);
				match(QuestionMark);
				setState(200);
				match(PUC);
				setState(201);
				match(Equals);
				setState(202);
				name();
				setState(203);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Backreference_or_octalContext extends ParserRuleContext {
		public Octal_charContext octal_char() {
			return getRuleContext(Octal_charContext.class,0);
		}
		public TerminalNode Backslash() { return getToken(PCREParser.Backslash, 0); }
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Backreference_or_octalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backreference_or_octal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBackreference_or_octal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBackreference_or_octal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBackreference_or_octal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backreference_or_octalContext backreference_or_octal() throws RecognitionException {
		Backreference_or_octalContext _localctx = new Backreference_or_octalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_backreference_or_octal);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				octal_char();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(Backslash);
				setState(209);
				digit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaptureContext extends ParserRuleContext {
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
	 
		public CaptureContext() { }
		public void copyFrom(CaptureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Capture1Context extends CaptureContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Capture1Context(CaptureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCapture1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCapture1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCapture1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Capture3Context extends CaptureContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Capture3Context(CaptureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCapture3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCapture3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCapture3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Capture2Context extends CaptureContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(PCREParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(PCREParser.SingleQuote, i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Capture2Context(CaptureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCapture2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCapture2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCapture2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Capture4Context extends CaptureContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Capture4Context(CaptureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCapture4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCapture4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCapture4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_capture);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Capture1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(OpenParen);
				setState(213);
				match(QuestionMark);
				setState(214);
				match(LessThan);
				setState(215);
				name();
				setState(216);
				match(GreaterThan);
				setState(217);
				alternation();
				setState(218);
				match(CloseParen);
				}
				break;
			case 2:
				_localctx = new Capture2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(OpenParen);
				setState(221);
				match(QuestionMark);
				setState(222);
				match(SingleQuote);
				setState(223);
				name();
				setState(224);
				match(SingleQuote);
				setState(225);
				alternation();
				setState(226);
				match(CloseParen);
				}
				break;
			case 3:
				_localctx = new Capture3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(OpenParen);
				setState(229);
				match(QuestionMark);
				setState(230);
				match(PUC);
				setState(231);
				match(LessThan);
				setState(232);
				name();
				setState(233);
				match(GreaterThan);
				setState(234);
				alternation();
				setState(235);
				match(CloseParen);
				}
				break;
			case 4:
				_localctx = new Capture4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(OpenParen);
				setState(238);
				alternation();
				setState(239);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Non_captureContext extends ParserRuleContext {
		public Non_captureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_capture; }
	 
		public Non_captureContext() { }
		public void copyFrom(Non_captureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Non_capture3Context extends Non_captureContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Non_capture3Context(Non_captureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNon_capture3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNon_capture3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNon_capture3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Non_capture2Context extends Non_captureContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Pipe() { return getToken(PCREParser.Pipe, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Non_capture2Context(Non_captureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNon_capture2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNon_capture2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNon_capture2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Non_capture1Context extends Non_captureContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(PCREParser.Colon, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Non_capture1Context(Non_captureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNon_capture1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNon_capture1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNon_capture1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Non_capture4Context extends Non_captureContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public Option_flagsContext option_flags() {
			return getRuleContext(Option_flagsContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PCREParser.Colon, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Non_capture4Context(Non_captureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNon_capture4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNon_capture4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNon_capture4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_captureContext non_capture() throws RecognitionException {
		Non_captureContext _localctx = new Non_captureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_non_capture);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Non_capture1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(OpenParen);
				setState(244);
				match(QuestionMark);
				setState(245);
				match(Colon);
				setState(246);
				alternation();
				setState(247);
				match(CloseParen);
				}
				break;
			case 2:
				_localctx = new Non_capture2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(OpenParen);
				setState(250);
				match(QuestionMark);
				setState(251);
				match(Pipe);
				setState(252);
				alternation();
				setState(253);
				match(CloseParen);
				}
				break;
			case 3:
				_localctx = new Non_capture3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(OpenParen);
				setState(256);
				match(QuestionMark);
				setState(257);
				match(GreaterThan);
				setState(258);
				alternation();
				setState(259);
				match(CloseParen);
				}
				break;
			case 4:
				_localctx = new Non_capture4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(OpenParen);
				setState(262);
				match(QuestionMark);
				setState(263);
				option_flags();
				setState(264);
				match(Colon);
				setState(265);
				alternation();
				setState(266);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Hash() { return getToken(PCREParser.Hash, 0); }
		public Non_close_parensContext non_close_parens() {
			return getRuleContext(Non_close_parensContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(OpenParen);
			setState(271);
			match(QuestionMark);
			setState(272);
			match(Hash);
			setState(273);
			non_close_parens();
			setState(274);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public List<Option_flagsContext> option_flags() {
			return getRuleContexts(Option_flagsContext.class);
		}
		public Option_flagsContext option_flags(int i) {
			return getRuleContext(Option_flagsContext.class,i);
		}
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public TerminalNode NUC() { return getToken(PCREParser.NUC, 0); }
		public List<TerminalNode> OUC() { return getTokens(PCREParser.OUC); }
		public TerminalNode OUC(int i) {
			return getToken(PCREParser.OUC, i);
		}
		public List<TerminalNode> Underscore() { return getTokens(PCREParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(PCREParser.Underscore, i);
		}
		public TerminalNode SUC() { return getToken(PCREParser.SUC, 0); }
		public List<TerminalNode> TUC() { return getTokens(PCREParser.TUC); }
		public TerminalNode TUC(int i) {
			return getToken(PCREParser.TUC, i);
		}
		public TerminalNode AUC() { return getToken(PCREParser.AUC, 0); }
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode D8() { return getToken(PCREParser.D8, 0); }
		public TerminalNode D1() { return getToken(PCREParser.D1, 0); }
		public TerminalNode D6() { return getToken(PCREParser.D6, 0); }
		public TerminalNode CUC() { return getToken(PCREParser.CUC, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_option);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(OpenParen);
				setState(277);
				match(QuestionMark);
				setState(278);
				option_flags();
				setState(279);
				match(Hyphen);
				setState(280);
				option_flags();
				setState(281);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(OpenParen);
				setState(284);
				match(QuestionMark);
				setState(285);
				option_flags();
				setState(286);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(OpenParen);
				setState(289);
				match(QuestionMark);
				setState(290);
				match(Hyphen);
				setState(291);
				option_flags();
				setState(292);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(OpenParen);
				setState(295);
				match(Star);
				setState(296);
				match(NUC);
				setState(297);
				match(OUC);
				setState(298);
				match(Underscore);
				setState(299);
				match(SUC);
				setState(300);
				match(TUC);
				setState(301);
				match(AUC);
				setState(302);
				match(RUC);
				setState(303);
				match(TUC);
				setState(304);
				match(Underscore);
				setState(305);
				match(OUC);
				setState(306);
				match(PUC);
				setState(307);
				match(TUC);
				setState(308);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(OpenParen);
				setState(310);
				match(Star);
				setState(311);
				match(UUC);
				setState(312);
				match(TUC);
				setState(313);
				match(FUC);
				setState(314);
				match(D8);
				setState(315);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				match(OpenParen);
				setState(317);
				match(Star);
				setState(318);
				match(UUC);
				setState(319);
				match(TUC);
				setState(320);
				match(FUC);
				setState(321);
				match(D1);
				setState(322);
				match(D6);
				setState(323);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(324);
				match(OpenParen);
				setState(325);
				match(Star);
				setState(326);
				match(UUC);
				setState(327);
				match(CUC);
				setState(328);
				match(PUC);
				setState(329);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Option_flagsContext extends ParserRuleContext {
		public List<Option_flagContext> option_flag() {
			return getRuleContexts(Option_flagContext.class);
		}
		public Option_flagContext option_flag(int i) {
			return getRuleContext(Option_flagContext.class,i);
		}
		public Option_flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOption_flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOption_flags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOption_flags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_flagsContext option_flags() throws RecognitionException {
		Option_flagsContext _localctx = new Option_flagsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_option_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				option_flag();
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 275012158481L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Option_flagContext extends ParserRuleContext {
		public TerminalNode ILC() { return getToken(PCREParser.ILC, 0); }
		public TerminalNode JUC() { return getToken(PCREParser.JUC, 0); }
		public TerminalNode MLC() { return getToken(PCREParser.MLC, 0); }
		public TerminalNode SLC() { return getToken(PCREParser.SLC, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode XLC() { return getToken(PCREParser.XLC, 0); }
		public Option_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOption_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOption_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOption_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_flagContext option_flag() throws RecognitionException {
		Option_flagContext _localctx = new Option_flagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_option_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 275012158481L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LookaroundContext extends ParserRuleContext {
		public LookaroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookaround; }
	 
		public LookaroundContext() { }
		public void copyFrom(LookaroundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lookaround1Context extends LookaroundContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Equals() { return getToken(PCREParser.Equals, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Lookaround1Context(LookaroundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLookaround1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLookaround1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLookaround1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lookaround3Context extends LookaroundContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public TerminalNode Equals() { return getToken(PCREParser.Equals, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Lookaround3Context(LookaroundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLookaround3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLookaround3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLookaround3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lookaround2Context extends LookaroundContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Exclamation() { return getToken(PCREParser.Exclamation, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Lookaround2Context(LookaroundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLookaround2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLookaround2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLookaround2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lookaround4Context extends LookaroundContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public TerminalNode Exclamation() { return getToken(PCREParser.Exclamation, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Lookaround4Context(LookaroundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLookaround4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLookaround4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLookaround4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookaroundContext lookaround() throws RecognitionException {
		LookaroundContext _localctx = new LookaroundContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lookaround);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Lookaround1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(OpenParen);
				setState(340);
				match(QuestionMark);
				setState(341);
				match(Equals);
				setState(342);
				alternation();
				setState(343);
				match(CloseParen);
				}
				break;
			case 2:
				_localctx = new Lookaround2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(OpenParen);
				setState(346);
				match(QuestionMark);
				setState(347);
				match(Exclamation);
				setState(348);
				alternation();
				setState(349);
				match(CloseParen);
				}
				break;
			case 3:
				_localctx = new Lookaround3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(OpenParen);
				setState(352);
				match(QuestionMark);
				setState(353);
				match(LessThan);
				setState(354);
				match(Equals);
				setState(355);
				alternation();
				setState(356);
				match(CloseParen);
				}
				break;
			case 4:
				_localctx = new Lookaround4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				match(OpenParen);
				setState(359);
				match(QuestionMark);
				setState(360);
				match(LessThan);
				setState(361);
				match(Exclamation);
				setState(362);
				alternation();
				setState(363);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subroutine_referenceContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public TerminalNode Ampersand() { return getToken(PCREParser.Ampersand, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(PCREParser.SubroutineOrNamedReferenceStartG, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(PCREParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(PCREParser.SingleQuote, i);
		}
		public Subroutine_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterSubroutine_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitSubroutine_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitSubroutine_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subroutine_referenceContext subroutine_reference() throws RecognitionException {
		Subroutine_referenceContext _localctx = new Subroutine_referenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subroutine_reference);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(OpenParen);
				setState(368);
				match(QuestionMark);
				setState(369);
				match(RUC);
				setState(370);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(OpenParen);
				setState(372);
				match(QuestionMark);
				setState(373);
				number();
				setState(374);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(OpenParen);
				setState(377);
				match(QuestionMark);
				setState(378);
				match(Plus);
				setState(379);
				number();
				setState(380);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				match(OpenParen);
				setState(383);
				match(QuestionMark);
				setState(384);
				match(Hyphen);
				setState(385);
				number();
				setState(386);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				match(OpenParen);
				setState(389);
				match(QuestionMark);
				setState(390);
				match(Ampersand);
				setState(391);
				name();
				setState(392);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
				match(OpenParen);
				setState(395);
				match(QuestionMark);
				setState(396);
				match(PUC);
				setState(397);
				match(GreaterThan);
				setState(398);
				name();
				setState(399);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(401);
				match(SubroutineOrNamedReferenceStartG);
				setState(402);
				match(LessThan);
				setState(403);
				name();
				setState(404);
				match(GreaterThan);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(406);
				match(SubroutineOrNamedReferenceStartG);
				setState(407);
				match(SingleQuote);
				setState(408);
				name();
				setState(409);
				match(SingleQuote);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(411);
				match(SubroutineOrNamedReferenceStartG);
				setState(412);
				match(LessThan);
				setState(413);
				number();
				setState(414);
				match(GreaterThan);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(416);
				match(SubroutineOrNamedReferenceStartG);
				setState(417);
				match(SingleQuote);
				setState(418);
				number();
				setState(419);
				match(SingleQuote);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(421);
				match(SubroutineOrNamedReferenceStartG);
				setState(422);
				match(LessThan);
				setState(423);
				match(Plus);
				setState(424);
				number();
				setState(425);
				match(GreaterThan);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(427);
				match(SubroutineOrNamedReferenceStartG);
				setState(428);
				match(SingleQuote);
				setState(429);
				match(Plus);
				setState(430);
				number();
				setState(431);
				match(SingleQuote);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(433);
				match(SubroutineOrNamedReferenceStartG);
				setState(434);
				match(LessThan);
				setState(435);
				match(Hyphen);
				setState(436);
				number();
				setState(437);
				match(GreaterThan);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(439);
				match(SubroutineOrNamedReferenceStartG);
				setState(440);
				match(SingleQuote);
				setState(441);
				match(Hyphen);
				setState(442);
				number();
				setState(443);
				match(SingleQuote);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public List<TerminalNode> OpenParen() { return getTokens(PCREParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(PCREParser.OpenParen, i);
		}
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> CloseParen() { return getTokens(PCREParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(PCREParser.CloseParen, i);
		}
		public List<AlternationContext> alternation() {
			return getRuleContexts(AlternationContext.class);
		}
		public AlternationContext alternation(int i) {
			return getRuleContext(AlternationContext.class,i);
		}
		public TerminalNode Pipe() { return getToken(PCREParser.Pipe, 0); }
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(PCREParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(PCREParser.SingleQuote, i);
		}
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode Ampersand() { return getToken(PCREParser.Ampersand, 0); }
		public TerminalNode DUC() { return getToken(PCREParser.DUC, 0); }
		public List<TerminalNode> EUC() { return getTokens(PCREParser.EUC); }
		public TerminalNode EUC(int i) {
			return getToken(PCREParser.EUC, i);
		}
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode IUC() { return getToken(PCREParser.IUC, 0); }
		public TerminalNode NUC() { return getToken(PCREParser.NUC, 0); }
		public TerminalNode ALC() { return getToken(PCREParser.ALC, 0); }
		public List<TerminalNode> SLC() { return getTokens(PCREParser.SLC); }
		public TerminalNode SLC(int i) {
			return getToken(PCREParser.SLC, i);
		}
		public TerminalNode ELC() { return getToken(PCREParser.ELC, 0); }
		public TerminalNode RLC() { return getToken(PCREParser.RLC, 0); }
		public TerminalNode TLC() { return getToken(PCREParser.TLC, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditional);
		int _la;
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(OpenParen);
				setState(448);
				match(QuestionMark);
				setState(449);
				match(OpenParen);
				setState(450);
				number();
				setState(451);
				match(CloseParen);
				setState(452);
				alternation();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(453);
					match(Pipe);
					setState(454);
					alternation();
					}
				}

				setState(457);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(OpenParen);
				setState(460);
				match(QuestionMark);
				setState(461);
				match(OpenParen);
				setState(462);
				match(Plus);
				setState(463);
				number();
				setState(464);
				match(CloseParen);
				setState(465);
				alternation();
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(466);
					match(Pipe);
					setState(467);
					alternation();
					}
				}

				setState(470);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				match(OpenParen);
				setState(473);
				match(QuestionMark);
				setState(474);
				match(OpenParen);
				setState(475);
				match(Hyphen);
				setState(476);
				number();
				setState(477);
				match(CloseParen);
				setState(478);
				alternation();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(479);
					match(Pipe);
					setState(480);
					alternation();
					}
				}

				setState(483);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(OpenParen);
				setState(486);
				match(QuestionMark);
				setState(487);
				match(OpenParen);
				setState(488);
				match(LessThan);
				setState(489);
				name();
				setState(490);
				match(GreaterThan);
				setState(491);
				match(CloseParen);
				setState(492);
				alternation();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(493);
					match(Pipe);
					setState(494);
					alternation();
					}
				}

				setState(497);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				match(OpenParen);
				setState(500);
				match(QuestionMark);
				setState(501);
				match(OpenParen);
				setState(502);
				match(SingleQuote);
				setState(503);
				name();
				setState(504);
				match(SingleQuote);
				setState(505);
				match(CloseParen);
				setState(506);
				alternation();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(507);
					match(Pipe);
					setState(508);
					alternation();
					}
				}

				setState(511);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(513);
				match(OpenParen);
				setState(514);
				match(QuestionMark);
				setState(515);
				match(OpenParen);
				setState(516);
				match(RUC);
				setState(517);
				number();
				setState(518);
				match(CloseParen);
				setState(519);
				alternation();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(520);
					match(Pipe);
					setState(521);
					alternation();
					}
				}

				setState(524);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(526);
				match(OpenParen);
				setState(527);
				match(QuestionMark);
				setState(528);
				match(OpenParen);
				setState(529);
				match(RUC);
				setState(530);
				match(CloseParen);
				setState(531);
				alternation();
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(532);
					match(Pipe);
					setState(533);
					alternation();
					}
				}

				setState(536);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(538);
				match(OpenParen);
				setState(539);
				match(QuestionMark);
				setState(540);
				match(OpenParen);
				setState(541);
				match(RUC);
				setState(542);
				match(Ampersand);
				setState(543);
				name();
				setState(544);
				match(CloseParen);
				setState(545);
				alternation();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(546);
					match(Pipe);
					setState(547);
					alternation();
					}
				}

				setState(550);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(552);
				match(OpenParen);
				setState(553);
				match(QuestionMark);
				setState(554);
				match(OpenParen);
				setState(555);
				match(DUC);
				setState(556);
				match(EUC);
				setState(557);
				match(FUC);
				setState(558);
				match(IUC);
				setState(559);
				match(NUC);
				setState(560);
				match(EUC);
				setState(561);
				match(CloseParen);
				setState(562);
				alternation();
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(563);
					match(Pipe);
					setState(564);
					alternation();
					}
				}

				setState(567);
				match(CloseParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(569);
				match(OpenParen);
				setState(570);
				match(QuestionMark);
				setState(571);
				match(OpenParen);
				setState(572);
				match(ALC);
				setState(573);
				match(SLC);
				setState(574);
				match(SLC);
				setState(575);
				match(ELC);
				setState(576);
				match(RLC);
				setState(577);
				match(TLC);
				setState(578);
				match(CloseParen);
				setState(579);
				alternation();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(580);
					match(Pipe);
					setState(581);
					alternation();
					}
				}

				setState(584);
				match(CloseParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(586);
				match(OpenParen);
				setState(587);
				match(QuestionMark);
				setState(588);
				match(OpenParen);
				setState(589);
				name();
				setState(590);
				match(CloseParen);
				setState(591);
				alternation();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(592);
					match(Pipe);
					setState(593);
					alternation();
					}
				}

				setState(596);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Backtrack_controlContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public List<TerminalNode> AUC() { return getTokens(PCREParser.AUC); }
		public TerminalNode AUC(int i) {
			return getToken(PCREParser.AUC, i);
		}
		public List<TerminalNode> CUC() { return getTokens(PCREParser.CUC); }
		public TerminalNode CUC(int i) {
			return getToken(PCREParser.CUC, i);
		}
		public List<TerminalNode> EUC() { return getTokens(PCREParser.EUC); }
		public TerminalNode EUC(int i) {
			return getToken(PCREParser.EUC, i);
		}
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode TUC() { return getToken(PCREParser.TUC, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode IUC() { return getToken(PCREParser.IUC, 0); }
		public TerminalNode LUC() { return getToken(PCREParser.LUC, 0); }
		public TerminalNode Colon() { return getToken(PCREParser.Colon, 0); }
		public List<TerminalNode> NUC() { return getTokens(PCREParser.NUC); }
		public TerminalNode NUC(int i) {
			return getToken(PCREParser.NUC, i);
		}
		public List<TerminalNode> MUC() { return getTokens(PCREParser.MUC); }
		public TerminalNode MUC(int i) {
			return getToken(PCREParser.MUC, i);
		}
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode KUC() { return getToken(PCREParser.KUC, 0); }
		public TerminalNode OUC() { return getToken(PCREParser.OUC, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode SUC() { return getToken(PCREParser.SUC, 0); }
		public TerminalNode HUC() { return getToken(PCREParser.HUC, 0); }
		public Backtrack_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backtrack_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterBacktrack_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitBacktrack_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitBacktrack_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backtrack_controlContext backtrack_control() throws RecognitionException {
		Backtrack_controlContext _localctx = new Backtrack_controlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_backtrack_control);
		int _la;
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				match(OpenParen);
				setState(601);
				match(Star);
				setState(602);
				match(AUC);
				setState(603);
				match(CUC);
				setState(604);
				match(CUC);
				setState(605);
				match(EUC);
				setState(606);
				match(PUC);
				setState(607);
				match(TUC);
				setState(608);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				match(OpenParen);
				setState(610);
				match(Star);
				setState(611);
				match(FUC);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUC) {
					{
					setState(612);
					match(AUC);
					setState(613);
					match(IUC);
					setState(614);
					match(LUC);
					}
				}

				setState(617);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				match(OpenParen);
				setState(619);
				match(Star);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUC) {
					{
					setState(620);
					match(MUC);
					setState(621);
					match(AUC);
					setState(622);
					match(RUC);
					setState(623);
					match(KUC);
					}
				}

				setState(626);
				match(Colon);
				setState(627);
				match(NUC);
				setState(628);
				match(AUC);
				setState(629);
				match(MUC);
				setState(630);
				match(EUC);
				setState(631);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				match(OpenParen);
				setState(633);
				match(Star);
				setState(634);
				match(CUC);
				setState(635);
				match(OUC);
				setState(636);
				match(MUC);
				setState(637);
				match(MUC);
				setState(638);
				match(IUC);
				setState(639);
				match(TUC);
				setState(640);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(641);
				match(OpenParen);
				setState(642);
				match(Star);
				setState(643);
				match(PUC);
				setState(644);
				match(RUC);
				setState(645);
				match(UUC);
				setState(646);
				match(NUC);
				setState(647);
				match(EUC);
				setState(648);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(649);
				match(OpenParen);
				setState(650);
				match(Star);
				setState(651);
				match(PUC);
				setState(652);
				match(RUC);
				setState(653);
				match(UUC);
				setState(654);
				match(NUC);
				setState(655);
				match(EUC);
				setState(656);
				match(Colon);
				setState(657);
				match(NUC);
				setState(658);
				match(AUC);
				setState(659);
				match(MUC);
				setState(660);
				match(EUC);
				setState(661);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(662);
				match(OpenParen);
				setState(663);
				match(Star);
				setState(664);
				match(SUC);
				setState(665);
				match(KUC);
				setState(666);
				match(IUC);
				setState(667);
				match(PUC);
				setState(668);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(669);
				match(OpenParen);
				setState(670);
				match(Star);
				setState(671);
				match(SUC);
				setState(672);
				match(KUC);
				setState(673);
				match(IUC);
				setState(674);
				match(PUC);
				setState(675);
				match(Colon);
				setState(676);
				match(NUC);
				setState(677);
				match(AUC);
				setState(678);
				match(MUC);
				setState(679);
				match(EUC);
				setState(680);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(681);
				match(OpenParen);
				setState(682);
				match(Star);
				setState(683);
				match(TUC);
				setState(684);
				match(HUC);
				setState(685);
				match(EUC);
				setState(686);
				match(NUC);
				setState(687);
				match(CloseParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(688);
				match(OpenParen);
				setState(689);
				match(Star);
				setState(690);
				match(TUC);
				setState(691);
				match(HUC);
				setState(692);
				match(EUC);
				setState(693);
				match(NUC);
				setState(694);
				match(Colon);
				setState(695);
				match(NUC);
				setState(696);
				match(AUC);
				setState(697);
				match(MUC);
				setState(698);
				match(EUC);
				setState(699);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Newline_conventionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public TerminalNode CUC() { return getToken(PCREParser.CUC, 0); }
		public List<TerminalNode> RUC() { return getTokens(PCREParser.RUC); }
		public TerminalNode RUC(int i) {
			return getToken(PCREParser.RUC, i);
		}
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public TerminalNode LUC() { return getToken(PCREParser.LUC, 0); }
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode AUC() { return getToken(PCREParser.AUC, 0); }
		public TerminalNode NUC() { return getToken(PCREParser.NUC, 0); }
		public TerminalNode YUC() { return getToken(PCREParser.YUC, 0); }
		public TerminalNode BUC() { return getToken(PCREParser.BUC, 0); }
		public TerminalNode SUC() { return getToken(PCREParser.SUC, 0); }
		public TerminalNode Underscore() { return getToken(PCREParser.Underscore, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode IUC() { return getToken(PCREParser.IUC, 0); }
		public TerminalNode OUC() { return getToken(PCREParser.OUC, 0); }
		public TerminalNode DUC() { return getToken(PCREParser.DUC, 0); }
		public TerminalNode EUC() { return getToken(PCREParser.EUC, 0); }
		public Newline_conventionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline_convention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNewline_convention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNewline_convention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNewline_convention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Newline_conventionContext newline_convention() throws RecognitionException {
		Newline_conventionContext _localctx = new Newline_conventionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newline_convention);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				match(OpenParen);
				setState(703);
				match(Star);
				setState(704);
				match(CUC);
				setState(705);
				match(RUC);
				setState(706);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(OpenParen);
				setState(708);
				match(Star);
				setState(709);
				match(LUC);
				setState(710);
				match(FUC);
				setState(711);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				match(OpenParen);
				setState(713);
				match(Star);
				setState(714);
				match(CUC);
				setState(715);
				match(RUC);
				setState(716);
				match(LUC);
				setState(717);
				match(FUC);
				setState(718);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(719);
				match(OpenParen);
				setState(720);
				match(Star);
				setState(721);
				match(AUC);
				setState(722);
				match(NUC);
				setState(723);
				match(YUC);
				setState(724);
				match(CUC);
				setState(725);
				match(RUC);
				setState(726);
				match(LUC);
				setState(727);
				match(FUC);
				setState(728);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(729);
				match(OpenParen);
				setState(730);
				match(Star);
				setState(731);
				match(AUC);
				setState(732);
				match(NUC);
				setState(733);
				match(YUC);
				setState(734);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(735);
				match(OpenParen);
				setState(736);
				match(Star);
				setState(737);
				match(BUC);
				setState(738);
				match(SUC);
				setState(739);
				match(RUC);
				setState(740);
				match(Underscore);
				setState(741);
				match(AUC);
				setState(742);
				match(NUC);
				setState(743);
				match(YUC);
				setState(744);
				match(CUC);
				setState(745);
				match(RUC);
				setState(746);
				match(LUC);
				setState(747);
				match(FUC);
				setState(748);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(749);
				match(OpenParen);
				setState(750);
				match(Star);
				setState(751);
				match(BUC);
				setState(752);
				match(SUC);
				setState(753);
				match(RUC);
				setState(754);
				match(Underscore);
				setState(755);
				match(UUC);
				setState(756);
				match(NUC);
				setState(757);
				match(IUC);
				setState(758);
				match(CUC);
				setState(759);
				match(OUC);
				setState(760);
				match(DUC);
				setState(761);
				match(EUC);
				setState(762);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalloutContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode CUC() { return getToken(PCREParser.CUC, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CalloutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCallout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCallout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCallout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalloutContext callout() throws RecognitionException {
		CalloutContext _localctx = new CalloutContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_callout);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				match(OpenParen);
				setState(766);
				match(QuestionMark);
				setState(767);
				match(CUC);
				setState(768);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(OpenParen);
				setState(770);
				match(QuestionMark);
				setState(771);
				match(CUC);
				setState(772);
				number();
				setState(773);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public Subroutine_referenceContext subroutine_reference() {
			return getRuleContext(Subroutine_referenceContext.class,0);
		}
		public BackreferenceContext backreference() {
			return getRuleContext(BackreferenceContext.class,0);
		}
		public Shared_atomContext shared_atom() {
			return getRuleContext(Shared_atomContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Character_classContext character_class() {
			return getRuleContext(Character_classContext.class,0);
		}
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public Non_captureContext non_capture() {
			return getRuleContext(Non_captureContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public LookaroundContext lookaround() {
			return getRuleContext(LookaroundContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Backtrack_controlContext backtrack_control() {
			return getRuleContext(Backtrack_controlContext.class,0);
		}
		public Newline_conventionContext newline_convention() {
			return getRuleContext(Newline_conventionContext.class,0);
		}
		public CalloutContext callout() {
			return getRuleContext(CalloutContext.class,0);
		}
		public TerminalNode Dot() { return getToken(PCREParser.Dot, 0); }
		public TerminalNode Caret() { return getToken(PCREParser.Caret, 0); }
		public TerminalNode StartOfSubject() { return getToken(PCREParser.StartOfSubject, 0); }
		public TerminalNode WordBoundary() { return getToken(PCREParser.WordBoundary, 0); }
		public TerminalNode NonWordBoundary() { return getToken(PCREParser.NonWordBoundary, 0); }
		public TerminalNode EndOfSubjectOrLine() { return getToken(PCREParser.EndOfSubjectOrLine, 0); }
		public TerminalNode EndOfSubjectOrLineEndOfSubject() { return getToken(PCREParser.EndOfSubjectOrLineEndOfSubject, 0); }
		public TerminalNode EndOfSubject() { return getToken(PCREParser.EndOfSubject, 0); }
		public TerminalNode PreviousMatchInSubject() { return getToken(PCREParser.PreviousMatchInSubject, 0); }
		public TerminalNode ResetStartMatch() { return getToken(PCREParser.ResetStartMatch, 0); }
		public TerminalNode OneDataUnit() { return getToken(PCREParser.OneDataUnit, 0); }
		public TerminalNode ExtendedUnicodeChar() { return getToken(PCREParser.ExtendedUnicodeChar, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				subroutine_reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				backreference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				shared_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(781);
				character_class();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(782);
				capture();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(783);
				non_capture();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(784);
				comment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(785);
				option();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(786);
				lookaround();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(787);
				conditional();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(788);
				backtrack_control();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(789);
				newline_convention();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(790);
				callout();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(791);
				match(Dot);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(792);
				match(Caret);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(793);
				match(StartOfSubject);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(794);
				match(WordBoundary);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(795);
				match(NonWordBoundary);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(796);
				match(EndOfSubjectOrLine);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(797);
				match(EndOfSubjectOrLineEndOfSubject);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(798);
				match(EndOfSubject);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(799);
				match(PreviousMatchInSubject);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(800);
				match(ResetStartMatch);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(801);
				match(OneDataUnit);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(802);
				match(ExtendedUnicodeChar);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cc_atomContext extends ParserRuleContext {
		public Cc_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc_atom; }
	 
		public Cc_atomContext() { }
		public void copyFrom(Cc_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cc_atom2Context extends Cc_atomContext {
		public Shared_atomContext shared_atom() {
			return getRuleContext(Shared_atomContext.class,0);
		}
		public Cc_atom2Context(Cc_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCc_atom2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCc_atom2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCc_atom2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cc_atom3Context extends Cc_atomContext {
		public Cc_literalContext cc_literal() {
			return getRuleContext(Cc_literalContext.class,0);
		}
		public Cc_atom3Context(Cc_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCc_atom3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCc_atom3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCc_atom3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cc_atom1Context extends Cc_atomContext {
		public List<Cc_literalContext> cc_literal() {
			return getRuleContexts(Cc_literalContext.class);
		}
		public Cc_literalContext cc_literal(int i) {
			return getRuleContext(Cc_literalContext.class,i);
		}
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public Cc_atom1Context(Cc_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCc_atom1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCc_atom1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCc_atom1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cc_atomContext cc_atom() throws RecognitionException {
		Cc_atomContext _localctx = new Cc_atomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cc_atom);
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new Cc_atom1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				cc_literal();
				setState(806);
				match(Hyphen);
				setState(807);
				cc_literal();
				}
				break;
			case 2:
				_localctx = new Cc_atom2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				shared_atom();
				}
				break;
			case 3:
				_localctx = new Cc_atom3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				cc_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shared_atomContext extends ParserRuleContext {
		public TerminalNode POSIXNamedSet() { return getToken(PCREParser.POSIXNamedSet, 0); }
		public TerminalNode POSIXNegatedNamedSet() { return getToken(PCREParser.POSIXNegatedNamedSet, 0); }
		public TerminalNode ControlChar() { return getToken(PCREParser.ControlChar, 0); }
		public TerminalNode DecimalDigit() { return getToken(PCREParser.DecimalDigit, 0); }
		public TerminalNode NotDecimalDigit() { return getToken(PCREParser.NotDecimalDigit, 0); }
		public TerminalNode HorizontalWhiteSpace() { return getToken(PCREParser.HorizontalWhiteSpace, 0); }
		public TerminalNode NotHorizontalWhiteSpace() { return getToken(PCREParser.NotHorizontalWhiteSpace, 0); }
		public TerminalNode NotNewLine() { return getToken(PCREParser.NotNewLine, 0); }
		public TerminalNode CharWithProperty() { return getToken(PCREParser.CharWithProperty, 0); }
		public TerminalNode CharWithoutProperty() { return getToken(PCREParser.CharWithoutProperty, 0); }
		public TerminalNode NewLineSequence() { return getToken(PCREParser.NewLineSequence, 0); }
		public TerminalNode WhiteSpace() { return getToken(PCREParser.WhiteSpace, 0); }
		public TerminalNode NotWhiteSpace() { return getToken(PCREParser.NotWhiteSpace, 0); }
		public TerminalNode VerticalWhiteSpace() { return getToken(PCREParser.VerticalWhiteSpace, 0); }
		public TerminalNode NotVerticalWhiteSpace() { return getToken(PCREParser.NotVerticalWhiteSpace, 0); }
		public TerminalNode WordChar() { return getToken(PCREParser.WordChar, 0); }
		public TerminalNode NotWordChar() { return getToken(PCREParser.NotWordChar, 0); }
		public TerminalNode Backslash() { return getToken(PCREParser.Backslash, 0); }
		public Shared_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterShared_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitShared_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitShared_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shared_atomContext shared_atom() throws RecognitionException {
		Shared_atomContext _localctx = new Shared_atomContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_shared_atom);
		try {
			setState(832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSIXNamedSet:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(POSIXNamedSet);
				}
				break;
			case POSIXNegatedNamedSet:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				match(POSIXNegatedNamedSet);
				}
				break;
			case ControlChar:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				match(ControlChar);
				}
				break;
			case DecimalDigit:
				enterOuterAlt(_localctx, 4);
				{
				setState(816);
				match(DecimalDigit);
				}
				break;
			case NotDecimalDigit:
				enterOuterAlt(_localctx, 5);
				{
				setState(817);
				match(NotDecimalDigit);
				}
				break;
			case HorizontalWhiteSpace:
				enterOuterAlt(_localctx, 6);
				{
				setState(818);
				match(HorizontalWhiteSpace);
				}
				break;
			case NotHorizontalWhiteSpace:
				enterOuterAlt(_localctx, 7);
				{
				setState(819);
				match(NotHorizontalWhiteSpace);
				}
				break;
			case NotNewLine:
				enterOuterAlt(_localctx, 8);
				{
				setState(820);
				match(NotNewLine);
				}
				break;
			case CharWithProperty:
				enterOuterAlt(_localctx, 9);
				{
				setState(821);
				match(CharWithProperty);
				}
				break;
			case CharWithoutProperty:
				enterOuterAlt(_localctx, 10);
				{
				setState(822);
				match(CharWithoutProperty);
				}
				break;
			case NewLineSequence:
				enterOuterAlt(_localctx, 11);
				{
				setState(823);
				match(NewLineSequence);
				}
				break;
			case WhiteSpace:
				enterOuterAlt(_localctx, 12);
				{
				setState(824);
				match(WhiteSpace);
				}
				break;
			case NotWhiteSpace:
				enterOuterAlt(_localctx, 13);
				{
				setState(825);
				match(NotWhiteSpace);
				}
				break;
			case VerticalWhiteSpace:
				enterOuterAlt(_localctx, 14);
				{
				setState(826);
				match(VerticalWhiteSpace);
				}
				break;
			case NotVerticalWhiteSpace:
				enterOuterAlt(_localctx, 15);
				{
				setState(827);
				match(NotVerticalWhiteSpace);
				}
				break;
			case WordChar:
				enterOuterAlt(_localctx, 16);
				{
				setState(828);
				match(WordChar);
				}
				break;
			case NotWordChar:
				enterOuterAlt(_localctx, 17);
				{
				setState(829);
				match(NotWordChar);
				}
				break;
			case Backslash:
				enterOuterAlt(_localctx, 18);
				{
				setState(830);
				match(Backslash);
				setState(831);
				matchWildcard();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public Shared_literalContext shared_literal() {
			return getRuleContext(Shared_literalContext.class,0);
		}
		public TerminalNode CharacterClassEnd() { return getToken(PCREParser.CharacterClassEnd, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Quoted:
			case BellChar:
			case EscapeChar:
			case FormFeed:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case HexChar:
			case Hyphen:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case ALC:
			case BLC:
			case CLC:
			case DLC:
			case ELC:
			case FLC:
			case GLC:
			case HLC:
			case ILC:
			case JLC:
			case KLC:
			case LLC:
			case MLC:
			case NLC:
			case OLC:
			case PLC:
			case QLC:
			case RLC:
			case SLC:
			case TLC:
			case ULC:
			case VLC:
			case WLC:
			case XLC:
			case YLC:
			case ZLC:
			case AUC:
			case BUC:
			case CUC:
			case DUC:
			case EUC:
			case FUC:
			case GUC:
			case HUC:
			case IUC:
			case JUC:
			case KUC:
			case LUC:
			case MUC:
			case NUC:
			case OUC:
			case PUC:
			case QUC:
			case RUC:
			case SUC:
			case TUC:
			case UUC:
			case VUC:
			case WUC:
			case XUC:
			case YUC:
			case ZUC:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
			case OtherChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				shared_literal();
				}
				break;
			case CharacterClassEnd:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(CharacterClassEnd);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cc_literalContext extends ParserRuleContext {
		public Shared_literalContext shared_literal() {
			return getRuleContext(Shared_literalContext.class,0);
		}
		public TerminalNode Dot() { return getToken(PCREParser.Dot, 0); }
		public TerminalNode CharacterClassStart() { return getToken(PCREParser.CharacterClassStart, 0); }
		public TerminalNode Caret() { return getToken(PCREParser.Caret, 0); }
		public TerminalNode QuestionMark() { return getToken(PCREParser.QuestionMark, 0); }
		public TerminalNode Plus() { return getToken(PCREParser.Plus, 0); }
		public TerminalNode Star() { return getToken(PCREParser.Star, 0); }
		public TerminalNode WordBoundary() { return getToken(PCREParser.WordBoundary, 0); }
		public TerminalNode EndOfSubjectOrLine() { return getToken(PCREParser.EndOfSubjectOrLine, 0); }
		public TerminalNode Pipe() { return getToken(PCREParser.Pipe, 0); }
		public TerminalNode OpenParen() { return getToken(PCREParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Cc_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterCc_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitCc_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitCc_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cc_literalContext cc_literal() throws RecognitionException {
		Cc_literalContext _localctx = new Cc_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cc_literal);
		try {
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Quoted:
			case BellChar:
			case EscapeChar:
			case FormFeed:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case HexChar:
			case Hyphen:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case ALC:
			case BLC:
			case CLC:
			case DLC:
			case ELC:
			case FLC:
			case GLC:
			case HLC:
			case ILC:
			case JLC:
			case KLC:
			case LLC:
			case MLC:
			case NLC:
			case OLC:
			case PLC:
			case QLC:
			case RLC:
			case SLC:
			case TLC:
			case ULC:
			case VLC:
			case WLC:
			case XLC:
			case YLC:
			case ZLC:
			case AUC:
			case BUC:
			case CUC:
			case DUC:
			case EUC:
			case FUC:
			case GUC:
			case HUC:
			case IUC:
			case JUC:
			case KUC:
			case LUC:
			case MUC:
			case NUC:
			case OUC:
			case PUC:
			case QUC:
			case RUC:
			case SUC:
			case TUC:
			case UUC:
			case VUC:
			case WUC:
			case XUC:
			case YUC:
			case ZUC:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
			case OtherChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				shared_literal();
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(Dot);
				}
				break;
			case CharacterClassStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				match(CharacterClassStart);
				}
				break;
			case Caret:
				enterOuterAlt(_localctx, 4);
				{
				setState(841);
				match(Caret);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 5);
				{
				setState(842);
				match(QuestionMark);
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 6);
				{
				setState(843);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 7);
				{
				setState(844);
				match(Star);
				}
				break;
			case WordBoundary:
				enterOuterAlt(_localctx, 8);
				{
				setState(845);
				match(WordBoundary);
				}
				break;
			case EndOfSubjectOrLine:
				enterOuterAlt(_localctx, 9);
				{
				setState(846);
				match(EndOfSubjectOrLine);
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 10);
				{
				setState(847);
				match(Pipe);
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 11);
				{
				setState(848);
				match(OpenParen);
				}
				break;
			case CloseParen:
				enterOuterAlt(_localctx, 12);
				{
				setState(849);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shared_literalContext extends ParserRuleContext {
		public Octal_charContext octal_char() {
			return getRuleContext(Octal_charContext.class,0);
		}
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public TerminalNode BellChar() { return getToken(PCREParser.BellChar, 0); }
		public TerminalNode EscapeChar() { return getToken(PCREParser.EscapeChar, 0); }
		public TerminalNode FormFeed() { return getToken(PCREParser.FormFeed, 0); }
		public TerminalNode NewLine() { return getToken(PCREParser.NewLine, 0); }
		public TerminalNode CarriageReturn() { return getToken(PCREParser.CarriageReturn, 0); }
		public TerminalNode Tab() { return getToken(PCREParser.Tab, 0); }
		public TerminalNode HexChar() { return getToken(PCREParser.HexChar, 0); }
		public TerminalNode Quoted() { return getToken(PCREParser.Quoted, 0); }
		public TerminalNode OpenBrace() { return getToken(PCREParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(PCREParser.CloseBrace, 0); }
		public TerminalNode Comma() { return getToken(PCREParser.Comma, 0); }
		public TerminalNode Hyphen() { return getToken(PCREParser.Hyphen, 0); }
		public TerminalNode LessThan() { return getToken(PCREParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(PCREParser.GreaterThan, 0); }
		public TerminalNode SingleQuote() { return getToken(PCREParser.SingleQuote, 0); }
		public TerminalNode Underscore() { return getToken(PCREParser.Underscore, 0); }
		public TerminalNode Colon() { return getToken(PCREParser.Colon, 0); }
		public TerminalNode Hash() { return getToken(PCREParser.Hash, 0); }
		public TerminalNode Equals() { return getToken(PCREParser.Equals, 0); }
		public TerminalNode Exclamation() { return getToken(PCREParser.Exclamation, 0); }
		public TerminalNode Ampersand() { return getToken(PCREParser.Ampersand, 0); }
		public TerminalNode OtherChar() { return getToken(PCREParser.OtherChar, 0); }
		public Shared_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterShared_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitShared_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitShared_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shared_literalContext shared_literal() throws RecognitionException {
		Shared_literalContext _localctx = new Shared_literalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_shared_literal);
		try {
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Backslash:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				octal_char();
				}
				break;
			case ALC:
			case BLC:
			case CLC:
			case DLC:
			case ELC:
			case FLC:
			case GLC:
			case HLC:
			case ILC:
			case JLC:
			case KLC:
			case LLC:
			case MLC:
			case NLC:
			case OLC:
			case PLC:
			case QLC:
			case RLC:
			case SLC:
			case TLC:
			case ULC:
			case VLC:
			case WLC:
			case XLC:
			case YLC:
			case ZLC:
			case AUC:
			case BUC:
			case CUC:
			case DUC:
			case EUC:
			case FUC:
			case GUC:
			case HUC:
			case IUC:
			case JUC:
			case KUC:
			case LUC:
			case MUC:
			case NUC:
			case OUC:
			case PUC:
			case QUC:
			case RUC:
			case SUC:
			case TUC:
			case UUC:
			case VUC:
			case WUC:
			case XUC:
			case YUC:
			case ZUC:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				letter();
				}
				break;
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				digit();
				}
				break;
			case BellChar:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				match(BellChar);
				}
				break;
			case EscapeChar:
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				match(EscapeChar);
				}
				break;
			case FormFeed:
				enterOuterAlt(_localctx, 6);
				{
				setState(857);
				match(FormFeed);
				}
				break;
			case NewLine:
				enterOuterAlt(_localctx, 7);
				{
				setState(858);
				match(NewLine);
				}
				break;
			case CarriageReturn:
				enterOuterAlt(_localctx, 8);
				{
				setState(859);
				match(CarriageReturn);
				}
				break;
			case Tab:
				enterOuterAlt(_localctx, 9);
				{
				setState(860);
				match(Tab);
				}
				break;
			case HexChar:
				enterOuterAlt(_localctx, 10);
				{
				setState(861);
				match(HexChar);
				}
				break;
			case Quoted:
				enterOuterAlt(_localctx, 11);
				{
				setState(862);
				match(Quoted);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 12);
				{
				setState(863);
				match(OpenBrace);
				}
				break;
			case CloseBrace:
				enterOuterAlt(_localctx, 13);
				{
				setState(864);
				match(CloseBrace);
				}
				break;
			case Comma:
				enterOuterAlt(_localctx, 14);
				{
				setState(865);
				match(Comma);
				}
				break;
			case Hyphen:
				enterOuterAlt(_localctx, 15);
				{
				setState(866);
				match(Hyphen);
				}
				break;
			case LessThan:
				enterOuterAlt(_localctx, 16);
				{
				setState(867);
				match(LessThan);
				}
				break;
			case GreaterThan:
				enterOuterAlt(_localctx, 17);
				{
				setState(868);
				match(GreaterThan);
				}
				break;
			case SingleQuote:
				enterOuterAlt(_localctx, 18);
				{
				setState(869);
				match(SingleQuote);
				}
				break;
			case Underscore:
				enterOuterAlt(_localctx, 19);
				{
				setState(870);
				match(Underscore);
				}
				break;
			case Colon:
				enterOuterAlt(_localctx, 20);
				{
				setState(871);
				match(Colon);
				}
				break;
			case Hash:
				enterOuterAlt(_localctx, 21);
				{
				setState(872);
				match(Hash);
				}
				break;
			case Equals:
				enterOuterAlt(_localctx, 22);
				{
				setState(873);
				match(Equals);
				}
				break;
			case Exclamation:
				enterOuterAlt(_localctx, 23);
				{
				setState(874);
				match(Exclamation);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 24);
				{
				setState(875);
				match(Ampersand);
				}
				break;
			case OtherChar:
				enterOuterAlt(_localctx, 25);
				{
				setState(876);
				match(OtherChar);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public DigitsContext digits() {
			return getRuleContext(DigitsContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			digits();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Octal_charContext extends ParserRuleContext {
		public TerminalNode Backslash() { return getToken(PCREParser.Backslash, 0); }
		public List<Octal_digitContext> octal_digit() {
			return getRuleContexts(Octal_digitContext.class);
		}
		public Octal_digitContext octal_digit(int i) {
			return getRuleContext(Octal_digitContext.class,i);
		}
		public TerminalNode D0() { return getToken(PCREParser.D0, 0); }
		public TerminalNode D1() { return getToken(PCREParser.D1, 0); }
		public TerminalNode D2() { return getToken(PCREParser.D2, 0); }
		public TerminalNode D3() { return getToken(PCREParser.D3, 0); }
		public Octal_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOctal_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOctal_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOctal_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octal_charContext octal_char() throws RecognitionException {
		Octal_charContext _localctx = new Octal_charContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_octal_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(881);
				match(Backslash);
				setState(882);
				_la = _input.LA(1);
				if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 519L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(883);
				octal_digit();
				setState(884);
				octal_digit();
				}
				break;
			case 2:
				{
				setState(886);
				match(Backslash);
				setState(887);
				octal_digit();
				setState(888);
				octal_digit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Octal_digitContext extends ParserRuleContext {
		public TerminalNode D0() { return getToken(PCREParser.D0, 0); }
		public TerminalNode D1() { return getToken(PCREParser.D1, 0); }
		public TerminalNode D2() { return getToken(PCREParser.D2, 0); }
		public TerminalNode D3() { return getToken(PCREParser.D3, 0); }
		public TerminalNode D4() { return getToken(PCREParser.D4, 0); }
		public TerminalNode D5() { return getToken(PCREParser.D5, 0); }
		public TerminalNode D6() { return getToken(PCREParser.D6, 0); }
		public TerminalNode D7() { return getToken(PCREParser.D7, 0); }
		public Octal_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterOctal_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitOctal_digit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitOctal_digit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octal_digitContext octal_digit() throws RecognitionException {
		Octal_digitContext _localctx = new Octal_digitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_octal_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 639L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DigitsContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitDigits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_digits);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(895); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(894);
					digit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(897); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DigitContext extends ParserRuleContext {
		public TerminalNode D0() { return getToken(PCREParser.D0, 0); }
		public TerminalNode D1() { return getToken(PCREParser.D1, 0); }
		public TerminalNode D2() { return getToken(PCREParser.D2, 0); }
		public TerminalNode D3() { return getToken(PCREParser.D3, 0); }
		public TerminalNode D4() { return getToken(PCREParser.D4, 0); }
		public TerminalNode D5() { return getToken(PCREParser.D5, 0); }
		public TerminalNode D6() { return getToken(PCREParser.D6, 0); }
		public TerminalNode D7() { return getToken(PCREParser.D7, 0); }
		public TerminalNode D8() { return getToken(PCREParser.D8, 0); }
		public TerminalNode D9() { return getToken(PCREParser.D9, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 1023L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Alpha_numsContext alpha_nums() {
			return getRuleContext(Alpha_numsContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			alpha_nums();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alpha_numsContext extends ParserRuleContext {
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
		}
		public List<TerminalNode> Underscore() { return getTokens(PCREParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(PCREParser.Underscore, i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Alpha_numsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_nums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterAlpha_nums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitAlpha_nums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitAlpha_nums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alpha_numsContext alpha_nums() throws RecognitionException {
		Alpha_numsContext _localctx = new Alpha_numsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_alpha_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALC:
			case BLC:
			case CLC:
			case DLC:
			case ELC:
			case FLC:
			case GLC:
			case HLC:
			case ILC:
			case JLC:
			case KLC:
			case LLC:
			case MLC:
			case NLC:
			case OLC:
			case PLC:
			case QLC:
			case RLC:
			case SLC:
			case TLC:
			case ULC:
			case VLC:
			case WLC:
			case XLC:
			case YLC:
			case ZLC:
			case AUC:
			case BUC:
			case CUC:
			case DUC:
			case EUC:
			case FUC:
			case GUC:
			case HUC:
			case IUC:
			case JUC:
			case KUC:
			case LUC:
			case MUC:
			case NUC:
			case OUC:
			case PUC:
			case QUC:
			case RUC:
			case SUC:
			case TUC:
			case UUC:
			case VUC:
			case WUC:
			case XUC:
			case YUC:
			case ZUC:
				{
				setState(903);
				letter();
				}
				break;
			case Underscore:
				{
				setState(904);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Underscore || _la==ALC || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2305843009213693951L) != 0)) {
				{
				setState(910);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALC:
				case BLC:
				case CLC:
				case DLC:
				case ELC:
				case FLC:
				case GLC:
				case HLC:
				case ILC:
				case JLC:
				case KLC:
				case LLC:
				case MLC:
				case NLC:
				case OLC:
				case PLC:
				case QLC:
				case RLC:
				case SLC:
				case TLC:
				case ULC:
				case VLC:
				case WLC:
				case XLC:
				case YLC:
				case ZLC:
				case AUC:
				case BUC:
				case CUC:
				case DUC:
				case EUC:
				case FUC:
				case GUC:
				case HUC:
				case IUC:
				case JUC:
				case KUC:
				case LUC:
				case MUC:
				case NUC:
				case OUC:
				case PUC:
				case QUC:
				case RUC:
				case SUC:
				case TUC:
				case UUC:
				case VUC:
				case WUC:
				case XUC:
				case YUC:
				case ZUC:
					{
					setState(907);
					letter();
					}
					break;
				case Underscore:
					{
					setState(908);
					match(Underscore);
					}
					break;
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(909);
					digit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Non_close_parensContext extends ParserRuleContext {
		public List<Non_close_parenContext> non_close_paren() {
			return getRuleContexts(Non_close_parenContext.class);
		}
		public Non_close_parenContext non_close_paren(int i) {
			return getRuleContext(Non_close_parenContext.class,i);
		}
		public Non_close_parensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_close_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNon_close_parens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNon_close_parens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNon_close_parens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_close_parensContext non_close_parens() throws RecognitionException {
		Non_close_parensContext _localctx = new Non_close_parensContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_non_close_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(915);
				non_close_paren();
				}
				}
				setState(918); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9007199254740994L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387903L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Non_close_parenContext extends ParserRuleContext {
		public TerminalNode CloseParen() { return getToken(PCREParser.CloseParen, 0); }
		public Non_close_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_close_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterNon_close_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitNon_close_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitNon_close_paren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_close_parenContext non_close_paren() throws RecognitionException {
		Non_close_parenContext _localctx = new Non_close_parenContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_non_close_paren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==CloseParen) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetterContext extends ParserRuleContext {
		public TerminalNode ALC() { return getToken(PCREParser.ALC, 0); }
		public TerminalNode BLC() { return getToken(PCREParser.BLC, 0); }
		public TerminalNode CLC() { return getToken(PCREParser.CLC, 0); }
		public TerminalNode DLC() { return getToken(PCREParser.DLC, 0); }
		public TerminalNode ELC() { return getToken(PCREParser.ELC, 0); }
		public TerminalNode FLC() { return getToken(PCREParser.FLC, 0); }
		public TerminalNode GLC() { return getToken(PCREParser.GLC, 0); }
		public TerminalNode HLC() { return getToken(PCREParser.HLC, 0); }
		public TerminalNode ILC() { return getToken(PCREParser.ILC, 0); }
		public TerminalNode JLC() { return getToken(PCREParser.JLC, 0); }
		public TerminalNode KLC() { return getToken(PCREParser.KLC, 0); }
		public TerminalNode LLC() { return getToken(PCREParser.LLC, 0); }
		public TerminalNode MLC() { return getToken(PCREParser.MLC, 0); }
		public TerminalNode NLC() { return getToken(PCREParser.NLC, 0); }
		public TerminalNode OLC() { return getToken(PCREParser.OLC, 0); }
		public TerminalNode PLC() { return getToken(PCREParser.PLC, 0); }
		public TerminalNode QLC() { return getToken(PCREParser.QLC, 0); }
		public TerminalNode RLC() { return getToken(PCREParser.RLC, 0); }
		public TerminalNode SLC() { return getToken(PCREParser.SLC, 0); }
		public TerminalNode TLC() { return getToken(PCREParser.TLC, 0); }
		public TerminalNode ULC() { return getToken(PCREParser.ULC, 0); }
		public TerminalNode VLC() { return getToken(PCREParser.VLC, 0); }
		public TerminalNode WLC() { return getToken(PCREParser.WLC, 0); }
		public TerminalNode XLC() { return getToken(PCREParser.XLC, 0); }
		public TerminalNode YLC() { return getToken(PCREParser.YLC, 0); }
		public TerminalNode ZLC() { return getToken(PCREParser.ZLC, 0); }
		public TerminalNode AUC() { return getToken(PCREParser.AUC, 0); }
		public TerminalNode BUC() { return getToken(PCREParser.BUC, 0); }
		public TerminalNode CUC() { return getToken(PCREParser.CUC, 0); }
		public TerminalNode DUC() { return getToken(PCREParser.DUC, 0); }
		public TerminalNode EUC() { return getToken(PCREParser.EUC, 0); }
		public TerminalNode FUC() { return getToken(PCREParser.FUC, 0); }
		public TerminalNode GUC() { return getToken(PCREParser.GUC, 0); }
		public TerminalNode HUC() { return getToken(PCREParser.HUC, 0); }
		public TerminalNode IUC() { return getToken(PCREParser.IUC, 0); }
		public TerminalNode JUC() { return getToken(PCREParser.JUC, 0); }
		public TerminalNode KUC() { return getToken(PCREParser.KUC, 0); }
		public TerminalNode LUC() { return getToken(PCREParser.LUC, 0); }
		public TerminalNode MUC() { return getToken(PCREParser.MUC, 0); }
		public TerminalNode NUC() { return getToken(PCREParser.NUC, 0); }
		public TerminalNode OUC() { return getToken(PCREParser.OUC, 0); }
		public TerminalNode PUC() { return getToken(PCREParser.PUC, 0); }
		public TerminalNode QUC() { return getToken(PCREParser.QUC, 0); }
		public TerminalNode RUC() { return getToken(PCREParser.RUC, 0); }
		public TerminalNode SUC() { return getToken(PCREParser.SUC, 0); }
		public TerminalNode TUC() { return getToken(PCREParser.TUC, 0); }
		public TerminalNode UUC() { return getToken(PCREParser.UUC, 0); }
		public TerminalNode VUC() { return getToken(PCREParser.VUC, 0); }
		public TerminalNode WUC() { return getToken(PCREParser.WUC, 0); }
		public TerminalNode XUC() { return getToken(PCREParser.XUC, 0); }
		public TerminalNode YUC() { return getToken(PCREParser.YUC, 0); }
		public TerminalNode ZUC() { return getToken(PCREParser.ZUC, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PCREListener ) ((PCREListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCREVisitor ) return ((PCREVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 4503599627370495L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001}\u039d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001Q\b\u0001\n\u0001\f\u0001T\t\u0001"+
		"\u0001\u0002\u0005\u0002W\b\u0002\n\u0002\f\u0002Z\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003^\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0083\b\u0006\n\u0006\f\u0006\u0086"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u008c"+
		"\b\u0006\u000b\u0006\f\u0006\u008d\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0095\b\u0006\n\u0006\f\u0006\u0098"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u009d\b\u0006"+
		"\u000b\u0006\f\u0006\u009e\u0001\u0006\u0001\u0006\u0003\u0006\u00a3\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00ce\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00d3\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00f2\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u010d\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u014b\b\f\u0001\r\u0004\r\u014e"+
		"\b\r\u000b\r\f\r\u014f\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u016e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u01be\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u01c8\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u01d5\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u01e2\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01f0\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u01fe\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u020b\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0217\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0225\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0236\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0247\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0253\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0257\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0268\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0271\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u02bd\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u02fc\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0308\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0324\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u032c\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0341\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0345\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0353\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u036e\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u037b\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0004\u001e\u0380\b\u001e\u000b\u001e\f"+
		"\u001e\u0381\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0003"+
		"!\u038a\b!\u0001!\u0001!\u0001!\u0005!\u038f\b!\n!\f!\u0392\t!\u0001\""+
		"\u0004\"\u0395\b\"\u000b\"\f\"\u0396\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0006\u0006\u0000"+
		"GGKKQQVVbbmm\u0002\u0000su||\u0002\u0000sy||\u0001\u0000s|\u0001\u0000"+
		"55\u0001\u0000?r\u042c\u0000J\u0001\u0000\u0000\u0000\u0002M\u0001\u0000"+
		"\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000"+
		"\bw\u0001\u0000\u0000\u0000\n|\u0001\u0000\u0000\u0000\f\u00a2\u0001\u0000"+
		"\u0000\u0000\u000e\u00cd\u0001\u0000\u0000\u0000\u0010\u00d2\u0001\u0000"+
		"\u0000\u0000\u0012\u00f1\u0001\u0000\u0000\u0000\u0014\u010c\u0001\u0000"+
		"\u0000\u0000\u0016\u010e\u0001\u0000\u0000\u0000\u0018\u014a\u0001\u0000"+
		"\u0000\u0000\u001a\u014d\u0001\u0000\u0000\u0000\u001c\u0151\u0001\u0000"+
		"\u0000\u0000\u001e\u016d\u0001\u0000\u0000\u0000 \u01bd\u0001\u0000\u0000"+
		"\u0000\"\u0256\u0001\u0000\u0000\u0000$\u02bc\u0001\u0000\u0000\u0000"+
		"&\u02fb\u0001\u0000\u0000\u0000(\u0307\u0001\u0000\u0000\u0000*\u0323"+
		"\u0001\u0000\u0000\u0000,\u032b\u0001\u0000\u0000\u0000.\u0340\u0001\u0000"+
		"\u0000\u00000\u0344\u0001\u0000\u0000\u00002\u0352\u0001\u0000\u0000\u0000"+
		"4\u036d\u0001\u0000\u0000\u00006\u036f\u0001\u0000\u0000\u00008\u037a"+
		"\u0001\u0000\u0000\u0000:\u037c\u0001\u0000\u0000\u0000<\u037f\u0001\u0000"+
		"\u0000\u0000>\u0383\u0001\u0000\u0000\u0000@\u0385\u0001\u0000\u0000\u0000"+
		"B\u0389\u0001\u0000\u0000\u0000D\u0394\u0001\u0000\u0000\u0000F\u0398"+
		"\u0001\u0000\u0000\u0000H\u039a\u0001\u0000\u0000\u0000JK\u0003\u0002"+
		"\u0001\u0000KL\u0005\u0000\u0000\u0001L\u0001\u0001\u0000\u0000\u0000"+
		"MR\u0003\u0004\u0002\u0000NO\u00053\u0000\u0000OQ\u0003\u0004\u0002\u0000"+
		"PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000S\u0003\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000UW\u0003\u0006\u0003\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\u0005\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0003"+
		"*\u0015\u0000\\^\u0003\b\u0004\u0000]\\\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^\u0007\u0001\u0000\u0000\u0000_`\u0005#\u0000\u0000"+
		"`x\u0003\n\u0005\u0000ab\u0005$\u0000\u0000bx\u0003\n\u0005\u0000cd\u0005"+
		"%\u0000\u0000dx\u0003\n\u0005\u0000ef\u0005&\u0000\u0000fg\u00036\u001b"+
		"\u0000gh\u0005\'\u0000\u0000hi\u0003\n\u0005\u0000ix\u0001\u0000\u0000"+
		"\u0000jk\u0005&\u0000\u0000kl\u00036\u001b\u0000lm\u0005(\u0000\u0000"+
		"mn\u0005\'\u0000\u0000no\u0003\n\u0005\u0000ox\u0001\u0000\u0000\u0000"+
		"pq\u0005&\u0000\u0000qr\u00036\u001b\u0000rs\u0005(\u0000\u0000st\u0003"+
		"6\u001b\u0000tu\u0005\'\u0000\u0000uv\u0003\n\u0005\u0000vx\u0001\u0000"+
		"\u0000\u0000w_\u0001\u0000\u0000\u0000wa\u0001\u0000\u0000\u0000wc\u0001"+
		"\u0000\u0000\u0000we\u0001\u0000\u0000\u0000wj\u0001\u0000\u0000\u0000"+
		"wp\u0001\u0000\u0000\u0000x\t\u0001\u0000\u0000\u0000y}\u0005$\u0000\u0000"+
		"z}\u0005#\u0000\u0000{}\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u000b\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u001d\u0000\u0000\u007f\u0080\u0005\u001f\u0000"+
		"\u0000\u0080\u0084\u0005\u001e\u0000\u0000\u0081\u0083\u0003,\u0016\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u00a3\u0005\u001e\u0000\u0000\u0088\u0089\u0005\u001d\u0000\u0000"+
		"\u0089\u008b\u0005\u001f\u0000\u0000\u008a\u008c\u0003,\u0016\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001e\u0000\u0000\u0090"+
		"\u00a3\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u001d\u0000\u0000\u0092"+
		"\u0096\u0005\u001e\u0000\u0000\u0093\u0095\u0003,\u0016\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u00a3"+
		"\u0005\u001e\u0000\u0000\u009a\u009c\u0005\u001d\u0000\u0000\u009b\u009d"+
		"\u0003,\u0016\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"\u001e\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2~\u0001\u0000"+
		"\u0000\u0000\u00a2\u0088\u0001\u0000\u0000\u0000\u00a2\u0091\u0001\u0000"+
		"\u0000\u0000\u00a2\u009a\u0001\u0000\u0000\u0000\u00a3\r\u0001\u0000\u0000"+
		"\u0000\u00a4\u00ce\u0003\u0010\b\u0000\u00a5\u00a6\u00051\u0000\u0000"+
		"\u00a6\u00ce\u00036\u001b\u0000\u00a7\u00a8\u00051\u0000\u0000\u00a8\u00a9"+
		"\u0005&\u0000\u0000\u00a9\u00aa\u00036\u001b\u0000\u00aa\u00ab\u0005\'"+
		"\u0000\u0000\u00ab\u00ce\u0001\u0000\u0000\u0000\u00ac\u00ad\u00051\u0000"+
		"\u0000\u00ad\u00ae\u0005&\u0000\u0000\u00ae\u00af\u0005 \u0000\u0000\u00af"+
		"\u00b0\u00036\u001b\u0000\u00b0\u00b1\u0005\'\u0000\u0000\u00b1\u00ce"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u00052\u0000\u0000\u00b3\u00b4\u0005"+
		"6\u0000\u0000\u00b4\u00b5\u0003@ \u0000\u00b5\u00b6\u00057\u0000\u0000"+
		"\u00b6\u00ce\u0001\u0000\u0000\u0000\u00b7\u00b8\u00052\u0000\u0000\u00b8"+
		"\u00b9\u00058\u0000\u0000\u00b9\u00ba\u0003@ \u0000\u00ba\u00bb\u0005"+
		"8\u0000\u0000\u00bb\u00ce\u0001\u0000\u0000\u0000\u00bc\u00bd\u00051\u0000"+
		"\u0000\u00bd\u00be\u0005&\u0000\u0000\u00be\u00bf\u0003@ \u0000\u00bf"+
		"\u00c0\u0005\'\u0000\u0000\u00c0\u00ce\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u00052\u0000\u0000\u00c2\u00c3\u0005&\u0000\u0000\u00c3\u00c4\u0003@"+
		" \u0000\u00c4\u00c5\u0005\'\u0000\u0000\u00c5\u00ce\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u00054\u0000\u0000\u00c7\u00c8\u0005#\u0000\u0000\u00c8"+
		"\u00c9\u0005h\u0000\u0000\u00c9\u00ca\u0005<\u0000\u0000\u00ca\u00cb\u0003"+
		"@ \u0000\u00cb\u00cc\u00055\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cd\u00a4\u0001\u0000\u0000\u0000\u00cd\u00a5\u0001\u0000\u0000"+
		"\u0000\u00cd\u00a7\u0001\u0000\u0000\u0000\u00cd\u00ac\u0001\u0000\u0000"+
		"\u0000\u00cd\u00b2\u0001\u0000\u0000\u0000\u00cd\u00b7\u0001\u0000\u0000"+
		"\u0000\u00cd\u00bc\u0001\u0000\u0000\u0000\u00cd\u00c1\u0001\u0000\u0000"+
		"\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000\u00ce\u000f\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d3\u00038\u001c\u0000\u00d0\u00d1\u0005\n\u0000\u0000"+
		"\u00d1\u00d3\u0003>\u001f\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u0011\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u00054\u0000\u0000\u00d5\u00d6\u0005#\u0000\u0000\u00d6\u00d7\u0005"+
		"6\u0000\u0000\u00d7\u00d8\u0003@ \u0000\u00d8\u00d9\u00057\u0000\u0000"+
		"\u00d9\u00da\u0003\u0002\u0001\u0000\u00da\u00db\u00055\u0000\u0000\u00db"+
		"\u00f2\u0001\u0000\u0000\u0000\u00dc\u00dd\u00054\u0000\u0000\u00dd\u00de"+
		"\u0005#\u0000\u0000\u00de\u00df\u00058\u0000\u0000\u00df\u00e0\u0003@"+
		" \u0000\u00e0\u00e1\u00058\u0000\u0000\u00e1\u00e2\u0003\u0002\u0001\u0000"+
		"\u00e2\u00e3\u00055\u0000\u0000\u00e3\u00f2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u00054\u0000\u0000\u00e5\u00e6\u0005#\u0000\u0000\u00e6\u00e7\u0005"+
		"h\u0000\u0000\u00e7\u00e8\u00056\u0000\u0000\u00e8\u00e9\u0003@ \u0000"+
		"\u00e9\u00ea\u00057\u0000\u0000\u00ea\u00eb\u0003\u0002\u0001\u0000\u00eb"+
		"\u00ec\u00055\u0000\u0000\u00ec\u00f2\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u00054\u0000\u0000\u00ee\u00ef\u0003\u0002\u0001\u0000\u00ef\u00f0\u0005"+
		"5\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00d4\u0001\u0000"+
		"\u0000\u0000\u00f1\u00dc\u0001\u0000\u0000\u0000\u00f1\u00e4\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f2\u0013\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u00054\u0000\u0000\u00f4\u00f5\u0005#\u0000\u0000"+
		"\u00f5\u00f6\u0005:\u0000\u0000\u00f6\u00f7\u0003\u0002\u0001\u0000\u00f7"+
		"\u00f8\u00055\u0000\u0000\u00f8\u010d\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u00054\u0000\u0000\u00fa\u00fb\u0005#\u0000\u0000\u00fb\u00fc\u00053"+
		"\u0000\u0000\u00fc\u00fd\u0003\u0002\u0001\u0000\u00fd\u00fe\u00055\u0000"+
		"\u0000\u00fe\u010d\u0001\u0000\u0000\u0000\u00ff\u0100\u00054\u0000\u0000"+
		"\u0100\u0101\u0005#\u0000\u0000\u0101\u0102\u00057\u0000\u0000\u0102\u0103"+
		"\u0003\u0002\u0001\u0000\u0103\u0104\u00055\u0000\u0000\u0104\u010d\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u00054\u0000\u0000\u0106\u0107\u0005#\u0000"+
		"\u0000\u0107\u0108\u0003\u001a\r\u0000\u0108\u0109\u0005:\u0000\u0000"+
		"\u0109\u010a\u0003\u0002\u0001\u0000\u010a\u010b\u00055\u0000\u0000\u010b"+
		"\u010d\u0001\u0000\u0000\u0000\u010c\u00f3\u0001\u0000\u0000\u0000\u010c"+
		"\u00f9\u0001\u0000\u0000\u0000\u010c\u00ff\u0001\u0000\u0000\u0000\u010c"+
		"\u0105\u0001\u0000\u0000\u0000\u010d\u0015\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u00054\u0000\u0000\u010f\u0110\u0005#\u0000\u0000\u0110\u0111\u0005"+
		";\u0000\u0000\u0111\u0112\u0003D\"\u0000\u0112\u0113\u00055\u0000\u0000"+
		"\u0113\u0017\u0001\u0000\u0000\u0000\u0114\u0115\u00054\u0000\u0000\u0115"+
		"\u0116\u0005#\u0000\u0000\u0116\u0117\u0003\u001a\r\u0000\u0117\u0118"+
		"\u0005 \u0000\u0000\u0118\u0119\u0003\u001a\r\u0000\u0119\u011a\u0005"+
		"5\u0000\u0000\u011a\u014b\u0001\u0000\u0000\u0000\u011b\u011c\u00054\u0000"+
		"\u0000\u011c\u011d\u0005#\u0000\u0000\u011d\u011e\u0003\u001a\r\u0000"+
		"\u011e\u011f\u00055\u0000\u0000\u011f\u014b\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u00054\u0000\u0000\u0121\u0122\u0005#\u0000\u0000\u0122\u0123\u0005"+
		" \u0000\u0000\u0123\u0124\u0003\u001a\r\u0000\u0124\u0125\u00055\u0000"+
		"\u0000\u0125\u014b\u0001\u0000\u0000\u0000\u0126\u0127\u00054\u0000\u0000"+
		"\u0127\u0128\u0005%\u0000\u0000\u0128\u0129\u0005f\u0000\u0000\u0129\u012a"+
		"\u0005g\u0000\u0000\u012a\u012b\u00059\u0000\u0000\u012b\u012c\u0005k"+
		"\u0000\u0000\u012c\u012d\u0005l\u0000\u0000\u012d\u012e\u0005Y\u0000\u0000"+
		"\u012e\u012f\u0005j\u0000\u0000\u012f\u0130\u0005l\u0000\u0000\u0130\u0131"+
		"\u00059\u0000\u0000\u0131\u0132\u0005g\u0000\u0000\u0132\u0133\u0005h"+
		"\u0000\u0000\u0133\u0134\u0005l\u0000\u0000\u0134\u014b\u00055\u0000\u0000"+
		"\u0135\u0136\u00054\u0000\u0000\u0136\u0137\u0005%\u0000\u0000\u0137\u0138"+
		"\u0005m\u0000\u0000\u0138\u0139\u0005l\u0000\u0000\u0139\u013a\u0005^"+
		"\u0000\u0000\u013a\u013b\u0005z\u0000\u0000\u013b\u014b\u00055\u0000\u0000"+
		"\u013c\u013d\u00054\u0000\u0000\u013d\u013e\u0005%\u0000\u0000\u013e\u013f"+
		"\u0005m\u0000\u0000\u013f\u0140\u0005l\u0000\u0000\u0140\u0141\u0005^"+
		"\u0000\u0000\u0141\u0142\u0005s\u0000\u0000\u0142\u0143\u0005x\u0000\u0000"+
		"\u0143\u014b\u00055\u0000\u0000\u0144\u0145\u00054\u0000\u0000\u0145\u0146"+
		"\u0005%\u0000\u0000\u0146\u0147\u0005m\u0000\u0000\u0147\u0148\u0005["+
		"\u0000\u0000\u0148\u0149\u0005h\u0000\u0000\u0149\u014b\u00055\u0000\u0000"+
		"\u014a\u0114\u0001\u0000\u0000\u0000\u014a\u011b\u0001\u0000\u0000\u0000"+
		"\u014a\u0120\u0001\u0000\u0000\u0000\u014a\u0126\u0001\u0000\u0000\u0000"+
		"\u014a\u0135\u0001\u0000\u0000\u0000\u014a\u013c\u0001\u0000\u0000\u0000"+
		"\u014a\u0144\u0001\u0000\u0000\u0000\u014b\u0019\u0001\u0000\u0000\u0000"+
		"\u014c\u014e\u0003\u001c\u000e\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u001b\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0007\u0000\u0000\u0000\u0152\u001d\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u00054\u0000\u0000\u0154\u0155\u0005#\u0000\u0000\u0155\u0156"+
		"\u0005<\u0000\u0000\u0156\u0157\u0003\u0002\u0001\u0000\u0157\u0158\u0005"+
		"5\u0000\u0000\u0158\u016e\u0001\u0000\u0000\u0000\u0159\u015a\u00054\u0000"+
		"\u0000\u015a\u015b\u0005#\u0000\u0000\u015b\u015c\u0005=\u0000\u0000\u015c"+
		"\u015d\u0003\u0002\u0001\u0000\u015d\u015e\u00055\u0000\u0000\u015e\u016e"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u00054\u0000\u0000\u0160\u0161\u0005"+
		"#\u0000\u0000\u0161\u0162\u00056\u0000\u0000\u0162\u0163\u0005<\u0000"+
		"\u0000\u0163\u0164\u0003\u0002\u0001\u0000\u0164\u0165\u00055\u0000\u0000"+
		"\u0165\u016e\u0001\u0000\u0000\u0000\u0166\u0167\u00054\u0000\u0000\u0167"+
		"\u0168\u0005#\u0000\u0000\u0168\u0169\u00056\u0000\u0000\u0169\u016a\u0005"+
		"=\u0000\u0000\u016a\u016b\u0003\u0002\u0001\u0000\u016b\u016c\u00055\u0000"+
		"\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u0153\u0001\u0000\u0000"+
		"\u0000\u016d\u0159\u0001\u0000\u0000\u0000\u016d\u015f\u0001\u0000\u0000"+
		"\u0000\u016d\u0166\u0001\u0000\u0000\u0000\u016e\u001f\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u00054\u0000\u0000\u0170\u0171\u0005#\u0000\u0000\u0171"+
		"\u0172\u0005j\u0000\u0000\u0172\u01be\u00055\u0000\u0000\u0173\u0174\u0005"+
		"4\u0000\u0000\u0174\u0175\u0005#\u0000\u0000\u0175\u0176\u00036\u001b"+
		"\u0000\u0176\u0177\u00055\u0000\u0000\u0177\u01be\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u00054\u0000\u0000\u0179\u017a\u0005#\u0000\u0000\u017a\u017b"+
		"\u0005$\u0000\u0000\u017b\u017c\u00036\u001b\u0000\u017c\u017d\u00055"+
		"\u0000\u0000\u017d\u01be\u0001\u0000\u0000\u0000\u017e\u017f\u00054\u0000"+
		"\u0000\u017f\u0180\u0005#\u0000\u0000\u0180\u0181\u0005 \u0000\u0000\u0181"+
		"\u0182\u00036\u001b\u0000\u0182\u0183\u00055\u0000\u0000\u0183\u01be\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u00054\u0000\u0000\u0185\u0186\u0005#\u0000"+
		"\u0000\u0186\u0187\u0005>\u0000\u0000\u0187\u0188\u0003@ \u0000\u0188"+
		"\u0189\u00055\u0000\u0000\u0189\u01be\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u00054\u0000\u0000\u018b\u018c\u0005#\u0000\u0000\u018c\u018d\u0005h"+
		"\u0000\u0000\u018d\u018e\u00057\u0000\u0000\u018e\u018f\u0003@ \u0000"+
		"\u018f\u0190\u00055\u0000\u0000\u0190\u01be\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u00051\u0000\u0000\u0192\u0193\u00056\u0000\u0000\u0193\u0194\u0003"+
		"@ \u0000\u0194\u0195\u00057\u0000\u0000\u0195\u01be\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u00051\u0000\u0000\u0197\u0198\u00058\u0000\u0000\u0198"+
		"\u0199\u0003@ \u0000\u0199\u019a\u00058\u0000\u0000\u019a\u01be\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u00051\u0000\u0000\u019c\u019d\u00056\u0000"+
		"\u0000\u019d\u019e\u00036\u001b\u0000\u019e\u019f\u00057\u0000\u0000\u019f"+
		"\u01be\u0001\u0000\u0000\u0000\u01a0\u01a1\u00051\u0000\u0000\u01a1\u01a2"+
		"\u00058\u0000\u0000\u01a2\u01a3\u00036\u001b\u0000\u01a3\u01a4\u00058"+
		"\u0000\u0000\u01a4\u01be\u0001\u0000\u0000\u0000\u01a5\u01a6\u00051\u0000"+
		"\u0000\u01a6\u01a7\u00056\u0000\u0000\u01a7\u01a8\u0005$\u0000\u0000\u01a8"+
		"\u01a9\u00036\u001b\u0000\u01a9\u01aa\u00057\u0000\u0000\u01aa\u01be\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u00051\u0000\u0000\u01ac\u01ad\u00058\u0000"+
		"\u0000\u01ad\u01ae\u0005$\u0000\u0000\u01ae\u01af\u00036\u001b\u0000\u01af"+
		"\u01b0\u00058\u0000\u0000\u01b0\u01be\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u00051\u0000\u0000\u01b2\u01b3\u00056\u0000\u0000\u01b3\u01b4\u0005 "+
		"\u0000\u0000\u01b4\u01b5\u00036\u001b\u0000\u01b5\u01b6\u00057\u0000\u0000"+
		"\u01b6\u01be\u0001\u0000\u0000\u0000\u01b7\u01b8\u00051\u0000\u0000\u01b8"+
		"\u01b9\u00058\u0000\u0000\u01b9\u01ba\u0005 \u0000\u0000\u01ba\u01bb\u0003"+
		"6\u001b\u0000\u01bb\u01bc\u00058\u0000\u0000\u01bc\u01be\u0001\u0000\u0000"+
		"\u0000\u01bd\u016f\u0001\u0000\u0000\u0000\u01bd\u0173\u0001\u0000\u0000"+
		"\u0000\u01bd\u0178\u0001\u0000\u0000\u0000\u01bd\u017e\u0001\u0000\u0000"+
		"\u0000\u01bd\u0184\u0001\u0000\u0000\u0000\u01bd\u018a\u0001\u0000\u0000"+
		"\u0000\u01bd\u0191\u0001\u0000\u0000\u0000\u01bd\u0196\u0001\u0000\u0000"+
		"\u0000\u01bd\u019b\u0001\u0000\u0000\u0000\u01bd\u01a0\u0001\u0000\u0000"+
		"\u0000\u01bd\u01a5\u0001\u0000\u0000\u0000\u01bd\u01ab\u0001\u0000\u0000"+
		"\u0000\u01bd\u01b1\u0001\u0000\u0000\u0000\u01bd\u01b7\u0001\u0000\u0000"+
		"\u0000\u01be!\u0001\u0000\u0000\u0000\u01bf\u01c0\u00054\u0000\u0000\u01c0"+
		"\u01c1\u0005#\u0000\u0000\u01c1\u01c2\u00054\u0000\u0000\u01c2\u01c3\u0003"+
		"6\u001b\u0000\u01c3\u01c4\u00055\u0000\u0000\u01c4\u01c7\u0003\u0002\u0001"+
		"\u0000\u01c5\u01c6\u00053\u0000\u0000\u01c6\u01c8\u0003\u0002\u0001\u0000"+
		"\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u00055\u0000\u0000\u01ca"+
		"\u0257\u0001\u0000\u0000\u0000\u01cb\u01cc\u00054\u0000\u0000\u01cc\u01cd"+
		"\u0005#\u0000\u0000\u01cd\u01ce\u00054\u0000\u0000\u01ce\u01cf\u0005$"+
		"\u0000\u0000\u01cf\u01d0\u00036\u001b\u0000\u01d0\u01d1\u00055\u0000\u0000"+
		"\u01d1\u01d4\u0003\u0002\u0001\u0000\u01d2\u01d3\u00053\u0000\u0000\u01d3"+
		"\u01d5\u0003\u0002\u0001\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u00055\u0000\u0000\u01d7\u0257\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u00054\u0000\u0000\u01d9\u01da\u0005#\u0000\u0000\u01da\u01db\u00054"+
		"\u0000\u0000\u01db\u01dc\u0005 \u0000\u0000\u01dc\u01dd\u00036\u001b\u0000"+
		"\u01dd\u01de\u00055\u0000\u0000\u01de\u01e1\u0003\u0002\u0001\u0000\u01df"+
		"\u01e0\u00053\u0000\u0000\u01e0\u01e2\u0003\u0002\u0001\u0000\u01e1\u01df"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u00055\u0000\u0000\u01e4\u0257\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u00054\u0000\u0000\u01e6\u01e7\u0005#\u0000"+
		"\u0000\u01e7\u01e8\u00054\u0000\u0000\u01e8\u01e9\u00056\u0000\u0000\u01e9"+
		"\u01ea\u0003@ \u0000\u01ea\u01eb\u00057\u0000\u0000\u01eb\u01ec\u0005"+
		"5\u0000\u0000\u01ec\u01ef\u0003\u0002\u0001\u0000\u01ed\u01ee\u00053\u0000"+
		"\u0000\u01ee\u01f0\u0003\u0002\u0001\u0000\u01ef\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u00055\u0000\u0000\u01f2\u0257\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u00054\u0000\u0000\u01f4\u01f5\u0005#\u0000\u0000\u01f5\u01f6"+
		"\u00054\u0000\u0000\u01f6\u01f7\u00058\u0000\u0000\u01f7\u01f8\u0003@"+
		" \u0000\u01f8\u01f9\u00058\u0000\u0000\u01f9\u01fa\u00055\u0000\u0000"+
		"\u01fa\u01fd\u0003\u0002\u0001\u0000\u01fb\u01fc\u00053\u0000\u0000\u01fc"+
		"\u01fe\u0003\u0002\u0001\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u00055\u0000\u0000\u0200\u0257\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u00054\u0000\u0000\u0202\u0203\u0005#\u0000\u0000\u0203\u0204\u00054"+
		"\u0000\u0000\u0204\u0205\u0005j\u0000\u0000\u0205\u0206\u00036\u001b\u0000"+
		"\u0206\u0207\u00055\u0000\u0000\u0207\u020a\u0003\u0002\u0001\u0000\u0208"+
		"\u0209\u00053\u0000\u0000\u0209\u020b\u0003\u0002\u0001\u0000\u020a\u0208"+
		"\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u00055\u0000\u0000\u020d\u0257\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u00054\u0000\u0000\u020f\u0210\u0005#\u0000"+
		"\u0000\u0210\u0211\u00054\u0000\u0000\u0211\u0212\u0005j\u0000\u0000\u0212"+
		"\u0213\u00055\u0000\u0000\u0213\u0216\u0003\u0002\u0001\u0000\u0214\u0215"+
		"\u00053\u0000\u0000\u0215\u0217\u0003\u0002\u0001\u0000\u0216\u0214\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0001"+
		"\u0000\u0000\u0000\u0218\u0219\u00055\u0000\u0000\u0219\u0257\u0001\u0000"+
		"\u0000\u0000\u021a\u021b\u00054\u0000\u0000\u021b\u021c\u0005#\u0000\u0000"+
		"\u021c\u021d\u00054\u0000\u0000\u021d\u021e\u0005j\u0000\u0000\u021e\u021f"+
		"\u0005>\u0000\u0000\u021f\u0220\u0003@ \u0000\u0220\u0221\u00055\u0000"+
		"\u0000\u0221\u0224\u0003\u0002\u0001\u0000\u0222\u0223\u00053\u0000\u0000"+
		"\u0223\u0225\u0003\u0002\u0001\u0000\u0224\u0222\u0001\u0000\u0000\u0000"+
		"\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u00055\u0000\u0000\u0227\u0257\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u00054\u0000\u0000\u0229\u022a\u0005#\u0000\u0000\u022a\u022b\u0005"+
		"4\u0000\u0000\u022b\u022c\u0005\\\u0000\u0000\u022c\u022d\u0005]\u0000"+
		"\u0000\u022d\u022e\u0005^\u0000\u0000\u022e\u022f\u0005a\u0000\u0000\u022f"+
		"\u0230\u0005f\u0000\u0000\u0230\u0231\u0005]\u0000\u0000\u0231\u0232\u0005"+
		"5\u0000\u0000\u0232\u0235\u0003\u0002\u0001\u0000\u0233\u0234\u00053\u0000"+
		"\u0000\u0234\u0236\u0003\u0002\u0001\u0000\u0235\u0233\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u00055\u0000\u0000\u0238\u0257\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u00054\u0000\u0000\u023a\u023b\u0005#\u0000\u0000\u023b\u023c"+
		"\u00054\u0000\u0000\u023c\u023d\u0005?\u0000\u0000\u023d\u023e\u0005Q"+
		"\u0000\u0000\u023e\u023f\u0005Q\u0000\u0000\u023f\u0240\u0005C\u0000\u0000"+
		"\u0240\u0241\u0005P\u0000\u0000\u0241\u0242\u0005R\u0000\u0000\u0242\u0243"+
		"\u00055\u0000\u0000\u0243\u0246\u0003\u0002\u0001\u0000\u0244\u0245\u0005"+
		"3\u0000\u0000\u0245\u0247\u0003\u0002\u0001\u0000\u0246\u0244\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u00055\u0000\u0000\u0249\u0257\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u00054\u0000\u0000\u024b\u024c\u0005#\u0000\u0000\u024c"+
		"\u024d\u00054\u0000\u0000\u024d\u024e\u0003@ \u0000\u024e\u024f\u0005"+
		"5\u0000\u0000\u024f\u0252\u0003\u0002\u0001\u0000\u0250\u0251\u00053\u0000"+
		"\u0000\u0251\u0253\u0003\u0002\u0001\u0000\u0252\u0250\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u00055\u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000"+
		"\u0256\u01bf\u0001\u0000\u0000\u0000\u0256\u01cb\u0001\u0000\u0000\u0000"+
		"\u0256\u01d8\u0001\u0000\u0000\u0000\u0256\u01e5\u0001\u0000\u0000\u0000"+
		"\u0256\u01f3\u0001\u0000\u0000\u0000\u0256\u0201\u0001\u0000\u0000\u0000"+
		"\u0256\u020e\u0001\u0000\u0000\u0000\u0256\u021a\u0001\u0000\u0000\u0000"+
		"\u0256\u0228\u0001\u0000\u0000\u0000\u0256\u0239\u0001\u0000\u0000\u0000"+
		"\u0256\u024a\u0001\u0000\u0000\u0000\u0257#\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u00054\u0000\u0000\u0259\u025a\u0005%\u0000\u0000\u025a\u025b\u0005"+
		"Y\u0000\u0000\u025b\u025c\u0005[\u0000\u0000\u025c\u025d\u0005[\u0000"+
		"\u0000\u025d\u025e\u0005]\u0000\u0000\u025e\u025f\u0005h\u0000\u0000\u025f"+
		"\u0260\u0005l\u0000\u0000\u0260\u02bd\u00055\u0000\u0000\u0261\u0262\u0005"+
		"4\u0000\u0000\u0262\u0263\u0005%\u0000\u0000\u0263\u0267\u0005^\u0000"+
		"\u0000\u0264\u0265\u0005Y\u0000\u0000\u0265\u0266\u0005a\u0000\u0000\u0266"+
		"\u0268\u0005d\u0000\u0000\u0267\u0264\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u02bd"+
		"\u00055\u0000\u0000\u026a\u026b\u00054\u0000\u0000\u026b\u0270\u0005%"+
		"\u0000\u0000\u026c\u026d\u0005e\u0000\u0000\u026d\u026e\u0005Y\u0000\u0000"+
		"\u026e\u026f\u0005j\u0000\u0000\u026f\u0271\u0005c\u0000\u0000\u0270\u026c"+
		"\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0001\u0000\u0000\u0000\u0272\u0273\u0005:\u0000\u0000\u0273\u0274\u0005"+
		"f\u0000\u0000\u0274\u0275\u0005Y\u0000\u0000\u0275\u0276\u0005e\u0000"+
		"\u0000\u0276\u0277\u0005]\u0000\u0000\u0277\u02bd\u00055\u0000\u0000\u0278"+
		"\u0279\u00054\u0000\u0000\u0279\u027a\u0005%\u0000\u0000\u027a\u027b\u0005"+
		"[\u0000\u0000\u027b\u027c\u0005g\u0000\u0000\u027c\u027d\u0005e\u0000"+
		"\u0000\u027d\u027e\u0005e\u0000\u0000\u027e\u027f\u0005a\u0000\u0000\u027f"+
		"\u0280\u0005l\u0000\u0000\u0280\u02bd\u00055\u0000\u0000\u0281\u0282\u0005"+
		"4\u0000\u0000\u0282\u0283\u0005%\u0000\u0000\u0283\u0284\u0005h\u0000"+
		"\u0000\u0284\u0285\u0005j\u0000\u0000\u0285\u0286\u0005m\u0000\u0000\u0286"+
		"\u0287\u0005f\u0000\u0000\u0287\u0288\u0005]\u0000\u0000\u0288\u02bd\u0005"+
		"5\u0000\u0000\u0289\u028a\u00054\u0000\u0000\u028a\u028b\u0005%\u0000"+
		"\u0000\u028b\u028c\u0005h\u0000\u0000\u028c\u028d\u0005j\u0000\u0000\u028d"+
		"\u028e\u0005m\u0000\u0000\u028e\u028f\u0005f\u0000\u0000\u028f\u0290\u0005"+
		"]\u0000\u0000\u0290\u0291\u0005:\u0000\u0000\u0291\u0292\u0005f\u0000"+
		"\u0000\u0292\u0293\u0005Y\u0000\u0000\u0293\u0294\u0005e\u0000\u0000\u0294"+
		"\u0295\u0005]\u0000\u0000\u0295\u02bd\u00055\u0000\u0000\u0296\u0297\u0005"+
		"4\u0000\u0000\u0297\u0298\u0005%\u0000\u0000\u0298\u0299\u0005k\u0000"+
		"\u0000\u0299\u029a\u0005c\u0000\u0000\u029a\u029b\u0005a\u0000\u0000\u029b"+
		"\u029c\u0005h\u0000\u0000\u029c\u02bd\u00055\u0000\u0000\u029d\u029e\u0005"+
		"4\u0000\u0000\u029e\u029f\u0005%\u0000\u0000\u029f\u02a0\u0005k\u0000"+
		"\u0000\u02a0\u02a1\u0005c\u0000\u0000\u02a1\u02a2\u0005a\u0000\u0000\u02a2"+
		"\u02a3\u0005h\u0000\u0000\u02a3\u02a4\u0005:\u0000\u0000\u02a4\u02a5\u0005"+
		"f\u0000\u0000\u02a5\u02a6\u0005Y\u0000\u0000\u02a6\u02a7\u0005e\u0000"+
		"\u0000\u02a7\u02a8\u0005]\u0000\u0000\u02a8\u02bd\u00055\u0000\u0000\u02a9"+
		"\u02aa\u00054\u0000\u0000\u02aa\u02ab\u0005%\u0000\u0000\u02ab\u02ac\u0005"+
		"l\u0000\u0000\u02ac\u02ad\u0005`\u0000\u0000\u02ad\u02ae\u0005]\u0000"+
		"\u0000\u02ae\u02af\u0005f\u0000\u0000\u02af\u02bd\u00055\u0000\u0000\u02b0"+
		"\u02b1\u00054\u0000\u0000\u02b1\u02b2\u0005%\u0000\u0000\u02b2\u02b3\u0005"+
		"l\u0000\u0000\u02b3\u02b4\u0005`\u0000\u0000\u02b4\u02b5\u0005]\u0000"+
		"\u0000\u02b5\u02b6\u0005f\u0000\u0000\u02b6\u02b7\u0005:\u0000\u0000\u02b7"+
		"\u02b8\u0005f\u0000\u0000\u02b8\u02b9\u0005Y\u0000\u0000\u02b9\u02ba\u0005"+
		"e\u0000\u0000\u02ba\u02bb\u0005]\u0000\u0000\u02bb\u02bd\u00055\u0000"+
		"\u0000\u02bc\u0258\u0001\u0000\u0000\u0000\u02bc\u0261\u0001\u0000\u0000"+
		"\u0000\u02bc\u026a\u0001\u0000\u0000\u0000\u02bc\u0278\u0001\u0000\u0000"+
		"\u0000\u02bc\u0281\u0001\u0000\u0000\u0000\u02bc\u0289\u0001\u0000\u0000"+
		"\u0000\u02bc\u0296\u0001\u0000\u0000\u0000\u02bc\u029d\u0001\u0000\u0000"+
		"\u0000\u02bc\u02a9\u0001\u0000\u0000\u0000\u02bc\u02b0\u0001\u0000\u0000"+
		"\u0000\u02bd%\u0001\u0000\u0000\u0000\u02be\u02bf\u00054\u0000\u0000\u02bf"+
		"\u02c0\u0005%\u0000\u0000\u02c0\u02c1\u0005[\u0000\u0000\u02c1\u02c2\u0005"+
		"j\u0000\u0000\u02c2\u02fc\u00055\u0000\u0000\u02c3\u02c4\u00054\u0000"+
		"\u0000\u02c4\u02c5\u0005%\u0000\u0000\u02c5\u02c6\u0005d\u0000\u0000\u02c6"+
		"\u02c7\u0005^\u0000\u0000\u02c7\u02fc\u00055\u0000\u0000\u02c8\u02c9\u0005"+
		"4\u0000\u0000\u02c9\u02ca\u0005%\u0000\u0000\u02ca\u02cb\u0005[\u0000"+
		"\u0000\u02cb\u02cc\u0005j\u0000\u0000\u02cc\u02cd\u0005d\u0000\u0000\u02cd"+
		"\u02ce\u0005^\u0000\u0000\u02ce\u02fc\u00055\u0000\u0000\u02cf\u02d0\u0005"+
		"4\u0000\u0000\u02d0\u02d1\u0005%\u0000\u0000\u02d1\u02d2\u0005Y\u0000"+
		"\u0000\u02d2\u02d3\u0005f\u0000\u0000\u02d3\u02d4\u0005q\u0000\u0000\u02d4"+
		"\u02d5\u0005[\u0000\u0000\u02d5\u02d6\u0005j\u0000\u0000\u02d6\u02d7\u0005"+
		"d\u0000\u0000\u02d7\u02d8\u0005^\u0000\u0000\u02d8\u02fc\u00055\u0000"+
		"\u0000\u02d9\u02da\u00054\u0000\u0000\u02da\u02db\u0005%\u0000\u0000\u02db"+
		"\u02dc\u0005Y\u0000\u0000\u02dc\u02dd\u0005f\u0000\u0000\u02dd\u02de\u0005"+
		"q\u0000\u0000\u02de\u02fc\u00055\u0000\u0000\u02df\u02e0\u00054\u0000"+
		"\u0000\u02e0\u02e1\u0005%\u0000\u0000\u02e1\u02e2\u0005Z\u0000\u0000\u02e2"+
		"\u02e3\u0005k\u0000\u0000\u02e3\u02e4\u0005j\u0000\u0000\u02e4\u02e5\u0005"+
		"9\u0000\u0000\u02e5\u02e6\u0005Y\u0000\u0000\u02e6\u02e7\u0005f\u0000"+
		"\u0000\u02e7\u02e8\u0005q\u0000\u0000\u02e8\u02e9\u0005[\u0000\u0000\u02e9"+
		"\u02ea\u0005j\u0000\u0000\u02ea\u02eb\u0005d\u0000\u0000\u02eb\u02ec\u0005"+
		"^\u0000\u0000\u02ec\u02fc\u00055\u0000\u0000\u02ed\u02ee\u00054\u0000"+
		"\u0000\u02ee\u02ef\u0005%\u0000\u0000\u02ef\u02f0\u0005Z\u0000\u0000\u02f0"+
		"\u02f1\u0005k\u0000\u0000\u02f1\u02f2\u0005j\u0000\u0000\u02f2\u02f3\u0005"+
		"9\u0000\u0000\u02f3\u02f4\u0005m\u0000\u0000\u02f4\u02f5\u0005f\u0000"+
		"\u0000\u02f5\u02f6\u0005a\u0000\u0000\u02f6\u02f7\u0005[\u0000\u0000\u02f7"+
		"\u02f8\u0005g\u0000\u0000\u02f8\u02f9\u0005\\\u0000\u0000\u02f9\u02fa"+
		"\u0005]\u0000\u0000\u02fa\u02fc\u00055\u0000\u0000\u02fb\u02be\u0001\u0000"+
		"\u0000\u0000\u02fb\u02c3\u0001\u0000\u0000\u0000\u02fb\u02c8\u0001\u0000"+
		"\u0000\u0000\u02fb\u02cf\u0001\u0000\u0000\u0000\u02fb\u02d9\u0001\u0000"+
		"\u0000\u0000\u02fb\u02df\u0001\u0000\u0000\u0000\u02fb\u02ed\u0001\u0000"+
		"\u0000\u0000\u02fc\'\u0001\u0000\u0000\u0000\u02fd\u02fe\u00054\u0000"+
		"\u0000\u02fe\u02ff\u0005#\u0000\u0000\u02ff\u0300\u0005[\u0000\u0000\u0300"+
		"\u0308\u00055\u0000\u0000\u0301\u0302\u00054\u0000\u0000\u0302\u0303\u0005"+
		"#\u0000\u0000\u0303\u0304\u0005[\u0000\u0000\u0304\u0305\u00036\u001b"+
		"\u0000\u0305\u0306\u00055\u0000\u0000\u0306\u0308\u0001\u0000\u0000\u0000"+
		"\u0307\u02fd\u0001\u0000\u0000\u0000\u0307\u0301\u0001\u0000\u0000\u0000"+
		"\u0308)\u0001\u0000\u0000\u0000\u0309\u0324\u0003 \u0010\u0000\u030a\u0324"+
		"\u0003\u000e\u0007\u0000\u030b\u0324\u0003.\u0017\u0000\u030c\u0324\u0003"+
		"0\u0018\u0000\u030d\u0324\u0003\f\u0006\u0000\u030e\u0324\u0003\u0012"+
		"\t\u0000\u030f\u0324\u0003\u0014\n\u0000\u0310\u0324\u0003\u0016\u000b"+
		"\u0000\u0311\u0324\u0003\u0018\f\u0000\u0312\u0324\u0003\u001e\u000f\u0000"+
		"\u0313\u0324\u0003\"\u0011\u0000\u0314\u0324\u0003$\u0012\u0000\u0315"+
		"\u0324\u0003&\u0013\u0000\u0316\u0324\u0003(\u0014\u0000\u0317\u0324\u0005"+
		"\f\u0000\u0000\u0318\u0324\u0005\u001f\u0000\u0000\u0319\u0324\u0005+"+
		"\u0000\u0000\u031a\u0324\u0005)\u0000\u0000\u031b\u0324\u0005*\u0000\u0000"+
		"\u031c\u0324\u0005,\u0000\u0000\u031d\u0324\u0005-\u0000\u0000\u031e\u0324"+
		"\u0005.\u0000\u0000\u031f\u0324\u0005/\u0000\u0000\u0320\u0324\u00050"+
		"\u0000\u0000\u0321\u0324\u0005\r\u0000\u0000\u0322\u0324\u0005\u001c\u0000"+
		"\u0000\u0323\u0309\u0001\u0000\u0000\u0000\u0323\u030a\u0001\u0000\u0000"+
		"\u0000\u0323\u030b\u0001\u0000\u0000\u0000\u0323\u030c\u0001\u0000\u0000"+
		"\u0000\u0323\u030d\u0001\u0000\u0000\u0000\u0323\u030e\u0001\u0000\u0000"+
		"\u0000\u0323\u030f\u0001\u0000\u0000\u0000\u0323\u0310\u0001\u0000\u0000"+
		"\u0000\u0323\u0311\u0001\u0000\u0000\u0000\u0323\u0312\u0001\u0000\u0000"+
		"\u0000\u0323\u0313\u0001\u0000\u0000\u0000\u0323\u0314\u0001\u0000\u0000"+
		"\u0000\u0323\u0315\u0001\u0000\u0000\u0000\u0323\u0316\u0001\u0000\u0000"+
		"\u0000\u0323\u0317\u0001\u0000\u0000\u0000\u0323\u0318\u0001\u0000\u0000"+
		"\u0000\u0323\u0319\u0001\u0000\u0000\u0000\u0323\u031a\u0001\u0000\u0000"+
		"\u0000\u0323\u031b\u0001\u0000\u0000\u0000\u0323\u031c\u0001\u0000\u0000"+
		"\u0000\u0323\u031d\u0001\u0000\u0000\u0000\u0323\u031e\u0001\u0000\u0000"+
		"\u0000\u0323\u031f\u0001\u0000\u0000\u0000\u0323\u0320\u0001\u0000\u0000"+
		"\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0323\u0322\u0001\u0000\u0000"+
		"\u0000\u0324+\u0001\u0000\u0000\u0000\u0325\u0326\u00032\u0019\u0000\u0326"+
		"\u0327\u0005 \u0000\u0000\u0327\u0328\u00032\u0019\u0000\u0328\u032c\u0001"+
		"\u0000\u0000\u0000\u0329\u032c\u0003.\u0017\u0000\u032a\u032c\u00032\u0019"+
		"\u0000\u032b\u0325\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000\u0000"+
		"\u0000\u032b\u032a\u0001\u0000\u0000\u0000\u032c-\u0001\u0000\u0000\u0000"+
		"\u032d\u0341\u0005!\u0000\u0000\u032e\u0341\u0005\"\u0000\u0000\u032f"+
		"\u0341\u0005\u0004\u0000\u0000\u0330\u0341\u0005\u000e\u0000\u0000\u0331"+
		"\u0341\u0005\u000f\u0000\u0000\u0332\u0341\u0005\u0010\u0000\u0000\u0333"+
		"\u0341\u0005\u0011\u0000\u0000\u0334\u0341\u0005\u0012\u0000\u0000\u0335"+
		"\u0341\u0005\u0013\u0000\u0000\u0336\u0341\u0005\u0014\u0000\u0000\u0337"+
		"\u0341\u0005\u0015\u0000\u0000\u0338\u0341\u0005\u0016\u0000\u0000\u0339"+
		"\u0341\u0005\u0017\u0000\u0000\u033a\u0341\u0005\u0018\u0000\u0000\u033b"+
		"\u0341\u0005\u0019\u0000\u0000\u033c\u0341\u0005\u001a\u0000\u0000\u033d"+
		"\u0341\u0005\u001b\u0000\u0000\u033e\u033f\u0005\n\u0000\u0000\u033f\u0341"+
		"\t\u0000\u0000\u0000\u0340\u032d\u0001\u0000\u0000\u0000\u0340\u032e\u0001"+
		"\u0000\u0000\u0000\u0340\u032f\u0001\u0000\u0000\u0000\u0340\u0330\u0001"+
		"\u0000\u0000\u0000\u0340\u0331\u0001\u0000\u0000\u0000\u0340\u0332\u0001"+
		"\u0000\u0000\u0000\u0340\u0333\u0001\u0000\u0000\u0000\u0340\u0334\u0001"+
		"\u0000\u0000\u0000\u0340\u0335\u0001\u0000\u0000\u0000\u0340\u0336\u0001"+
		"\u0000\u0000\u0000\u0340\u0337\u0001\u0000\u0000\u0000\u0340\u0338\u0001"+
		"\u0000\u0000\u0000\u0340\u0339\u0001\u0000\u0000\u0000\u0340\u033a\u0001"+
		"\u0000\u0000\u0000\u0340\u033b\u0001\u0000\u0000\u0000\u0340\u033c\u0001"+
		"\u0000\u0000\u0000\u0340\u033d\u0001\u0000\u0000\u0000\u0340\u033e\u0001"+
		"\u0000\u0000\u0000\u0341/\u0001\u0000\u0000\u0000\u0342\u0345\u00034\u001a"+
		"\u0000\u0343\u0345\u0005\u001e\u0000\u0000\u0344\u0342\u0001\u0000\u0000"+
		"\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u03451\u0001\u0000\u0000\u0000"+
		"\u0346\u0353\u00034\u001a\u0000\u0347\u0353\u0005\f\u0000\u0000\u0348"+
		"\u0353\u0005\u001d\u0000\u0000\u0349\u0353\u0005\u001f\u0000\u0000\u034a"+
		"\u0353\u0005#\u0000\u0000\u034b\u0353\u0005$\u0000\u0000\u034c\u0353\u0005"+
		"%\u0000\u0000\u034d\u0353\u0005)\u0000\u0000\u034e\u0353\u0005,\u0000"+
		"\u0000\u034f\u0353\u00053\u0000\u0000\u0350\u0353\u00054\u0000\u0000\u0351"+
		"\u0353\u00055\u0000\u0000\u0352\u0346\u0001\u0000\u0000\u0000\u0352\u0347"+
		"\u0001\u0000\u0000\u0000\u0352\u0348\u0001\u0000\u0000\u0000\u0352\u0349"+
		"\u0001\u0000\u0000\u0000\u0352\u034a\u0001\u0000\u0000\u0000\u0352\u034b"+
		"\u0001\u0000\u0000\u0000\u0352\u034c\u0001\u0000\u0000\u0000\u0352\u034d"+
		"\u0001\u0000\u0000\u0000\u0352\u034e\u0001\u0000\u0000\u0000\u0352\u034f"+
		"\u0001\u0000\u0000\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0351"+
		"\u0001\u0000\u0000\u0000\u03533\u0001\u0000\u0000\u0000\u0354\u036e\u0003"+
		"8\u001c\u0000\u0355\u036e\u0003H$\u0000\u0356\u036e\u0003>\u001f\u0000"+
		"\u0357\u036e\u0005\u0003\u0000\u0000\u0358\u036e\u0005\u0005\u0000\u0000"+
		"\u0359\u036e\u0005\u0006\u0000\u0000\u035a\u036e\u0005\u0007\u0000\u0000"+
		"\u035b\u036e\u0005\b\u0000\u0000\u035c\u036e\u0005\t\u0000\u0000\u035d"+
		"\u036e\u0005\u000b\u0000\u0000\u035e\u036e\u0005\u0001\u0000\u0000\u035f"+
		"\u036e\u0005&\u0000\u0000\u0360\u036e\u0005\'\u0000\u0000\u0361\u036e"+
		"\u0005(\u0000\u0000\u0362\u036e\u0005 \u0000\u0000\u0363\u036e\u00056"+
		"\u0000\u0000\u0364\u036e\u00057\u0000\u0000\u0365\u036e\u00058\u0000\u0000"+
		"\u0366\u036e\u00059\u0000\u0000\u0367\u036e\u0005:\u0000\u0000\u0368\u036e"+
		"\u0005;\u0000\u0000\u0369\u036e\u0005<\u0000\u0000\u036a\u036e\u0005="+
		"\u0000\u0000\u036b\u036e\u0005>\u0000\u0000\u036c\u036e\u0005}\u0000\u0000"+
		"\u036d\u0354\u0001\u0000\u0000\u0000\u036d\u0355\u0001\u0000\u0000\u0000"+
		"\u036d\u0356\u0001\u0000\u0000\u0000\u036d\u0357\u0001\u0000\u0000\u0000"+
		"\u036d\u0358\u0001\u0000\u0000\u0000\u036d\u0359\u0001\u0000\u0000\u0000"+
		"\u036d\u035a\u0001\u0000\u0000\u0000\u036d\u035b\u0001\u0000\u0000\u0000"+
		"\u036d\u035c\u0001\u0000\u0000\u0000\u036d\u035d\u0001\u0000\u0000\u0000"+
		"\u036d\u035e\u0001\u0000\u0000\u0000\u036d\u035f\u0001\u0000\u0000\u0000"+
		"\u036d\u0360\u0001\u0000\u0000\u0000\u036d\u0361\u0001\u0000\u0000\u0000"+
		"\u036d\u0362\u0001\u0000\u0000\u0000\u036d\u0363\u0001\u0000\u0000\u0000"+
		"\u036d\u0364\u0001\u0000\u0000\u0000\u036d\u0365\u0001\u0000\u0000\u0000"+
		"\u036d\u0366\u0001\u0000\u0000\u0000\u036d\u0367\u0001\u0000\u0000\u0000"+
		"\u036d\u0368\u0001\u0000\u0000\u0000\u036d\u0369\u0001\u0000\u0000\u0000"+
		"\u036d\u036a\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000"+
		"\u036d\u036c\u0001\u0000\u0000\u0000\u036e5\u0001\u0000\u0000\u0000\u036f"+
		"\u0370\u0003<\u001e\u0000\u03707\u0001\u0000\u0000\u0000\u0371\u0372\u0005"+
		"\n\u0000\u0000\u0372\u0373\u0007\u0001\u0000\u0000\u0373\u0374\u0003:"+
		"\u001d\u0000\u0374\u0375\u0003:\u001d\u0000\u0375\u037b\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0005\n\u0000\u0000\u0377\u0378\u0003:\u001d\u0000"+
		"\u0378\u0379\u0003:\u001d\u0000\u0379\u037b\u0001\u0000\u0000\u0000\u037a"+
		"\u0371\u0001\u0000\u0000\u0000\u037a\u0376\u0001\u0000\u0000\u0000\u037b"+
		"9\u0001\u0000\u0000\u0000\u037c\u037d\u0007\u0002\u0000\u0000\u037d;\u0001"+
		"\u0000\u0000\u0000\u037e\u0380\u0003>\u001f\u0000\u037f\u037e\u0001\u0000"+
		"\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u037f\u0001\u0000"+
		"\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382=\u0001\u0000\u0000"+
		"\u0000\u0383\u0384\u0007\u0003\u0000\u0000\u0384?\u0001\u0000\u0000\u0000"+
		"\u0385\u0386\u0003B!\u0000\u0386A\u0001\u0000\u0000\u0000\u0387\u038a"+
		"\u0003H$\u0000\u0388\u038a\u00059\u0000\u0000\u0389\u0387\u0001\u0000"+
		"\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u038a\u0390\u0001\u0000"+
		"\u0000\u0000\u038b\u038f\u0003H$\u0000\u038c\u038f\u00059\u0000\u0000"+
		"\u038d\u038f\u0003>\u001f\u0000\u038e\u038b\u0001\u0000\u0000\u0000\u038e"+
		"\u038c\u0001\u0000\u0000\u0000\u038e\u038d\u0001\u0000\u0000\u0000\u038f"+
		"\u0392\u0001\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0390"+
		"\u0391\u0001\u0000\u0000\u0000\u0391C\u0001\u0000\u0000\u0000\u0392\u0390"+
		"\u0001\u0000\u0000\u0000\u0393\u0395\u0003F#\u0000\u0394\u0393\u0001\u0000"+
		"\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0394\u0001\u0000"+
		"\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397E\u0001\u0000\u0000"+
		"\u0000\u0398\u0399\b\u0004\u0000\u0000\u0399G\u0001\u0000\u0000\u0000"+
		"\u039a\u039b\u0007\u0005\u0000\u0000\u039bI\u0001\u0000\u0000\u0000/R"+
		"X]w|\u0084\u008d\u0096\u009e\u00a2\u00cd\u00d2\u00f1\u010c\u014a\u014f"+
		"\u016d\u01bd\u01c7\u01d4\u01e1\u01ef\u01fd\u020a\u0216\u0224\u0235\u0246"+
		"\u0252\u0256\u0267\u0270\u02bc\u02fb\u0307\u0323\u032b\u0340\u0344\u0352"+
		"\u036d\u037a\u0381\u0389\u038e\u0390\u0396";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}