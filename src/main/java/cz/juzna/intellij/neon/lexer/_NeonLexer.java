/* The following code was generated by JFlex 1.4.3 on 11/24/12 8:30 PM */

package cz.juzna.intellij.neon.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static cz.juzna.intellij.neon.lexer.NeonTokenTypes.*;

/**
 * @author Jan Dolecek
 */

public class _NeonLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int IN_KEY = 4;
  public static final int YYINITIAL = 0;
  public static final int IN_BLOCK_HEADER = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\6\2\0\1\5\22\0\1\4\1\21\1\16\1\25"+
    "\1\40\1\23\1\0\1\15\1\36\1\26\1\0\1\10\1\33\1\32"+
    "\1\14\1\0\1\7\7\12\2\11\1\27\1\0\1\31\1\30\1\20"+
    "\1\0\1\24\1\3\3\3\1\2\1\3\5\1\1\1\1\1\1\1"+
    "\1\1\2\1\1\1\1\1\1\1\1\1\2\1\1\13\1\1\1\1"+
    "\1\34\1\17\1\37\1\0\1\1\1\0\1\3\3\3\1\2\1\3"+
    "\5\1\1\1\1\1\1\1\1\1\2\1\1\1\1\1\1\1\1\1"+
    "\2\1\1\13\1\1\1\1\1\35\1\0\1\22\1\0\67\1\4\0"+
    "\1\1\5\0\27\1\1\0\37\1\1\0\u013f\1\31\0\162\1\4\0"+
    "\14\1\16\0\5\1\11\0\1\1\213\0\1\1\13\0\1\1\1\0"+
    "\3\1\1\0\1\1\1\0\24\1\1\0\54\1\1\0\46\1\1\0"+
    "\5\1\4\0\202\1\10\0\105\1\1\0\46\1\2\0\2\1\6\0"+
    "\20\1\41\0\46\1\2\0\1\1\7\0\47\1\110\0\33\1\5\0"+
    "\3\1\56\0\32\1\5\0\13\1\25\0\12\20\4\0\2\1\1\0"+
    "\143\1\1\0\1\1\17\0\2\1\7\0\2\1\12\20\3\1\2\0"+
    "\1\1\20\0\1\1\1\0\36\1\35\0\3\1\60\0\46\1\13\0"+
    "\1\1\u0152\0\66\1\3\0\1\1\22\0\1\1\7\0\12\1\4\0"+
    "\12\20\25\0\10\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0"+
    "\1\1\3\0\4\1\3\0\1\1\36\0\2\1\1\0\3\1\4\0"+
    "\12\20\2\1\23\0\6\1\4\0\2\1\2\0\26\1\1\0\7\1"+
    "\1\0\2\1\1\0\2\1\1\0\2\1\37\0\4\1\1\0\1\1"+
    "\7\0\12\20\2\0\3\1\20\0\11\1\1\0\3\1\1\0\26\1"+
    "\1\0\7\1\1\0\2\1\1\0\5\1\3\0\1\1\22\0\1\1"+
    "\17\0\2\1\4\0\12\20\25\0\10\1\2\0\2\1\2\0\26\1"+
    "\1\0\7\1\1\0\2\1\1\0\5\1\3\0\1\1\36\0\2\1"+
    "\1\0\3\1\4\0\12\20\1\0\1\1\21\0\1\1\1\0\6\1"+
    "\3\0\3\1\1\0\4\1\3\0\2\1\1\0\1\1\1\0\2\1"+
    "\3\0\2\1\3\0\3\1\3\0\10\1\1\0\3\1\55\0\11\20"+
    "\25\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0\5\1"+
    "\46\0\2\1\4\0\12\20\25\0\10\1\1\0\3\1\1\0\27\1"+
    "\1\0\12\1\1\0\5\1\3\0\1\1\40\0\1\1\1\0\2\1"+
    "\4\0\12\20\25\0\10\1\1\0\3\1\1\0\27\1\1\0\20\1"+
    "\46\0\2\1\4\0\12\20\25\0\22\1\3\0\30\1\1\0\11\1"+
    "\1\0\1\1\2\0\7\1\72\0\60\1\1\0\2\1\14\0\7\1"+
    "\11\0\12\20\47\0\2\1\1\0\1\1\2\0\2\1\1\0\1\1"+
    "\2\0\1\1\6\0\4\1\1\0\7\1\1\0\3\1\1\0\1\1"+
    "\1\0\1\1\2\0\2\1\1\0\4\1\1\0\2\1\11\0\1\1"+
    "\2\0\5\1\1\0\1\1\11\0\12\20\2\0\2\1\42\0\1\1"+
    "\37\0\12\20\26\0\10\1\1\0\42\1\35\0\4\1\164\0\42\1"+
    "\1\0\5\1\1\0\2\1\25\0\12\20\6\0\6\1\112\0\46\1"+
    "\12\0\51\1\7\0\132\1\5\0\104\1\5\0\122\1\6\0\7\1"+
    "\1\0\77\1\1\0\1\1\1\0\4\1\2\0\7\1\1\0\1\1"+
    "\1\0\4\1\2\0\47\1\1\0\1\1\1\0\4\1\2\0\37\1"+
    "\1\0\1\1\1\0\4\1\2\0\7\1\1\0\1\1\1\0\4\1"+
    "\2\0\7\1\1\0\7\1\1\0\27\1\1\0\37\1\1\0\1\1"+
    "\1\0\4\1\2\0\7\1\1\0\47\1\1\0\23\1\16\0\11\20"+
    "\56\0\125\1\14\0\u026c\1\2\0\10\1\12\0\32\1\5\0\113\1"+
    "\25\0\15\1\1\0\4\1\16\0\22\1\16\0\22\1\16\0\15\1"+
    "\1\0\3\1\17\0\64\1\43\0\1\1\4\0\1\1\3\0\12\20"+
    "\46\0\12\20\6\0\130\1\10\0\51\1\127\0\35\1\51\0\12\20"+
    "\36\1\2\0\5\1\u038b\0\154\1\224\0\234\1\4\0\132\1\6\0"+
    "\26\1\2\0\6\1\2\0\46\1\2\0\6\1\2\0\10\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\37\1\2\0\65\1\1\0"+
    "\7\1\1\0\1\1\3\0\3\1\1\0\7\1\3\0\4\1\2\0"+
    "\6\1\4\0\15\1\5\0\3\1\1\0\7\1\164\0\1\1\15\0"+
    "\1\1\202\0\1\1\4\0\1\1\2\0\12\1\1\0\1\1\3\0"+
    "\5\1\6\0\1\1\1\0\1\1\1\0\1\1\1\0\4\1\1\0"+
    "\3\1\1\0\7\1\3\0\3\1\5\0\5\1\u0ebb\0\2\1\52\0"+
    "\5\1\5\0\2\1\4\0\126\1\6\0\3\1\1\0\132\1\1\0"+
    "\4\1\5\0\50\1\4\0\136\1\21\0\30\1\70\0\20\1\u0200\0"+
    "\u19b6\1\112\0\u51a6\1\132\0\u048d\1\u0773\0\u2ba4\1\u215c\0\u012e\1\2\0"+
    "\73\1\225\0\7\1\14\0\5\1\5\0\1\1\1\0\12\1\1\0"+
    "\15\1\1\0\5\1\1\0\1\1\1\0\2\1\1\0\2\1\1\0"+
    "\154\1\41\0\u016b\1\22\0\100\1\2\0\66\1\50\0\14\1\164\0"+
    "\5\1\1\0\207\1\23\0\12\20\7\0\32\1\6\0\32\1\13\0"+
    "\131\1\3\0\6\1\2\0\6\1\2\0\6\1\2\0\3\1\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\2\4\1\5\1\1\1\5"+
    "\3\1\1\6\1\1\1\7\1\10\1\11\1\1\1\12"+
    "\1\13\1\1\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\1\1\22\1\5\1\1\1\5\3\1\1\7\1\1"+
    "\1\13\1\1\1\21\1\1\1\23\2\0\2\24\1\0"+
    "\2\2\1\0\1\5\2\0\2\5\1\0\1\25\2\0"+
    "\1\26\2\27\3\30\1\31\3\32\1\22\1\0\1\5"+
    "\2\0\2\5\1\0\1\25\2\0\2\27\1\30\1\31"+
    "\1\32\3\33\2\0\1\2\2\0\1\5\1\0\1\26"+
    "\1\0\1\5\5\0\1\2\1\24\1\2\4\0\1\24"+
    "\1\0\3\34\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\102\0\143\0\204\0\245\0\306\0\347"+
    "\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c\0\u01ad\0\245\0\u01ce"+
    "\0\u01ef\0\u0210\0\245\0\u0231\0\245\0\143\0\u0252\0\245"+
    "\0\245\0\245\0\245\0\245\0\143\0\245\0\u0273\0\u0294"+
    "\0\u02b5\0\u02d6\0\u02f7\0\u0318\0\u0339\0\u035a\0\u037b\0\245"+
    "\0\u039c\0\245\0\u03bd\0\245\0\143\0\u03de\0\143\0\245"+
    "\0\u03ff\0\u0420\0\u0441\0\u0462\0\u0483\0\u04a4\0\u04c5\0\u04e6"+
    "\0\u0507\0\u018c\0\u03de\0\u0528\0\u0549\0\u056a\0\u058b\0\u05ac"+
    "\0\u05cd\0\u05ee\0\245\0\143\0\u060f\0\u0630\0\245\0\245"+
    "\0\u0651\0\u0672\0\u0693\0\u06b4\0\u06d5\0\u06f6\0\u0318\0\245"+
    "\0\u0717\0\u0738\0\u0759\0\u035a\0\u077a\0\245\0\u079b\0\u07bc"+
    "\0\u07dd\0\245\0\u07fe\0\u081f\0\u0840\0\u0861\0\u0507\0\u04c5"+
    "\0\u0882\0\245\0\u06f6\0\u06b4\0\u08a3\0\u08c4\0\u08e5\0\u0906"+
    "\0\u0927\0\u0948\0\u0969\0\u098a\0\u09ab\0\u09cc\0\u09ed\0\u0a0e"+
    "\0\u09cc\0\u0a2f\0\u0a50\0\245\0\u0a71\0\u0a92";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\3\5\1\6\1\7\1\10\1\11\1\12\2\13"+
    "\1\5\1\14\1\15\1\16\3\4\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\3\37\1\6\1\7"+
    "\1\10\1\40\1\41\2\42\1\37\1\43\1\44\1\45"+
    "\3\36\1\17\1\20\1\46\1\22\1\23\1\47\1\25"+
    "\1\50\1\51\1\30\1\31\1\32\1\33\1\34\1\52"+
    "\1\36\3\37\1\6\1\7\1\10\1\40\1\41\2\42"+
    "\1\37\1\43\1\44\1\45\3\36\1\17\1\20\1\46"+
    "\1\22\1\23\1\53\1\54\1\50\1\51\1\30\1\31"+
    "\1\32\1\33\1\34\1\52\4\55\1\56\2\0\6\55"+
    "\2\0\3\55\5\0\1\57\1\60\2\55\5\0\2\55"+
    "\3\5\1\61\2\0\1\5\1\55\4\5\2\0\2\5"+
    "\1\62\5\0\1\57\1\60\1\63\1\55\5\0\1\55"+
    "\45\0\1\10\1\0\1\10\36\0\1\10\34\0\2\55"+
    "\1\64\1\55\1\56\2\0\1\65\1\55\1\66\1\65"+
    "\1\67\1\70\2\0\3\55\5\0\1\57\1\60\2\55"+
    "\5\0\5\55\1\56\2\0\2\55\2\71\2\55\2\0"+
    "\3\55\5\0\1\57\1\60\2\55\5\0\3\55\1\64"+
    "\1\55\1\56\2\0\1\13\1\55\2\13\1\55\1\70"+
    "\2\0\3\55\5\0\1\57\1\60\2\55\5\0\5\55"+
    "\1\56\2\0\1\70\1\55\2\70\2\55\2\0\3\55"+
    "\5\0\1\57\1\60\2\55\5\0\1\55\5\72\2\0"+
    "\6\72\1\73\23\72\6\74\1\0\7\74\1\73\1\75"+
    "\21\74\4\76\3\0\6\76\2\0\3\76\5\0\1\76"+
    "\1\0\2\76\5\0\1\76\1\0\3\77\7\0\1\77"+
    "\3\0\1\100\21\0\5\22\2\0\17\22\1\0\12\22"+
    "\4\55\1\101\1\102\1\103\6\55\2\0\3\55\5\0"+
    "\1\104\1\60\2\55\5\0\5\55\1\105\1\106\1\107"+
    "\2\55\2\71\2\55\2\0\3\55\5\0\1\57\1\60"+
    "\2\55\5\0\1\55\1\0\3\37\3\0\1\37\1\0"+
    "\4\37\2\0\2\37\1\110\7\0\1\37\11\0\1\111"+
    "\4\0\1\112\1\0\1\113\1\112\1\114\1\115\35\0"+
    "\2\116\30\0\1\111\4\0\1\42\1\0\2\42\1\0"+
    "\1\115\33\0\1\115\1\0\2\115\26\0\5\117\2\0"+
    "\6\117\1\120\23\117\6\121\1\0\7\121\1\120\1\122"+
    "\21\121\1\0\3\123\7\0\1\123\3\0\1\124\25\0"+
    "\1\125\1\102\1\103\20\0\1\126\15\0\1\127\1\106"+
    "\1\107\2\0\2\116\32\0\1\130\1\131\1\132\20\0"+
    "\1\126\15\0\1\56\22\0\2\60\14\0\1\61\22\0"+
    "\2\60\1\133\7\0\4\55\1\61\2\0\6\55\2\0"+
    "\3\55\5\0\1\57\1\60\1\134\1\55\5\0\2\55"+
    "\3\135\1\136\2\0\1\5\1\55\2\5\1\135\1\5"+
    "\2\0\2\5\1\62\5\0\1\57\1\60\1\63\1\55"+
    "\5\0\5\55\1\56\2\0\1\71\1\137\2\71\2\55"+
    "\2\0\3\55\5\0\1\57\1\60\1\55\1\137\5\0"+
    "\3\55\1\64\1\55\1\56\2\0\1\65\1\55\1\66"+
    "\1\65\1\55\1\70\2\0\3\55\5\0\1\57\1\60"+
    "\2\55\5\0\3\55\1\64\1\55\1\56\2\0\1\66"+
    "\1\55\2\66\1\55\1\70\2\0\3\55\5\0\1\57"+
    "\1\60\2\55\5\0\3\55\2\140\1\56\2\0\1\140"+
    "\1\55\2\140\2\55\2\0\3\55\5\0\1\57\1\60"+
    "\2\55\5\0\3\55\1\64\1\55\1\56\2\0\1\70"+
    "\1\55\2\70\2\55\2\0\3\55\5\0\1\57\1\60"+
    "\2\55\5\0\5\55\1\56\2\0\1\71\1\55\2\71"+
    "\2\55\2\0\3\55\5\0\1\57\1\60\2\55\5\0"+
    "\1\55\6\74\1\0\7\74\1\73\1\0\21\74\6\141"+
    "\1\0\32\141\4\76\3\0\6\76\2\0\3\76\1\0"+
    "\1\142\3\0\1\76\1\0\2\76\5\0\1\76\1\0"+
    "\3\77\1\56\2\0\1\77\1\0\4\77\2\0\2\77"+
    "\1\100\5\0\2\60\1\77\10\0\3\77\1\56\6\0"+
    "\1\77\3\0\1\100\7\0\2\60\14\0\1\101\22\0"+
    "\2\60\16\0\1\103\36\0\1\105\22\0\2\60\16\0"+
    "\1\107\41\0\1\116\1\143\2\116\17\0\1\143\10\0"+
    "\1\111\4\0\1\112\1\0\1\113\1\112\1\0\1\115"+
    "\26\0\1\111\4\0\1\113\1\0\2\113\1\0\1\115"+
    "\26\0\2\144\3\0\1\144\1\0\2\144\30\0\1\111"+
    "\4\0\1\115\1\0\2\115\35\0\1\116\1\0\2\116"+
    "\26\0\6\121\1\0\7\121\1\120\1\0\21\121\6\145"+
    "\1\0\32\145\1\0\3\123\3\0\1\123\1\0\4\123"+
    "\2\0\2\123\1\124\7\0\1\123\13\0\1\125\40\0"+
    "\1\127\40\0\1\130\42\0\1\132\33\0\3\146\1\133"+
    "\6\0\1\146\25\0\1\55\3\147\1\150\2\0\4\55"+
    "\1\147\1\55\2\0\3\55\5\0\1\57\1\60\2\55"+
    "\5\0\2\55\3\135\1\151\2\0\1\135\1\55\4\135"+
    "\2\0\2\135\1\152\5\0\1\153\1\60\1\154\1\55"+
    "\5\0\1\55\1\0\3\146\1\136\6\0\1\146\13\0"+
    "\2\60\1\133\25\0\1\73\40\0\1\120\23\0\3\146"+
    "\1\155\2\0\1\146\1\0\4\146\2\0\2\146\1\155"+
    "\5\0\1\156\1\0\1\146\7\0\1\55\3\147\1\157"+
    "\2\0\1\147\1\55\4\147\2\0\2\147\1\160\5\0"+
    "\1\153\1\60\1\147\1\55\5\0\1\55\1\0\3\146"+
    "\1\150\6\0\1\146\13\0\2\60\14\0\1\151\22\0"+
    "\1\161\1\60\1\133\7\0\4\55\1\151\2\0\6\55"+
    "\2\0\3\55\5\0\1\153\1\60\1\134\1\55\5\0"+
    "\5\55\1\162\1\163\1\164\6\55\2\0\3\55\3\0"+
    "\1\165\1\0\1\57\1\60\2\55\5\0\2\55\3\135"+
    "\1\166\2\0\1\135\1\55\4\135\2\0\2\135\1\152"+
    "\5\0\1\153\1\60\1\154\1\55\5\0\1\55\4\0"+
    "\1\155\22\0\1\156\15\0\1\156\1\163\1\164\16\0"+
    "\1\165\17\0\1\157\22\0\1\161\1\60\10\0\4\55"+
    "\1\157\2\0\6\55\2\0\3\55\5\0\1\153\1\60"+
    "\2\55\5\0\1\55\4\0\1\162\1\163\1\164\16\0"+
    "\1\165\1\0\2\60\16\0\1\164\32\0\5\165\2\0"+
    "\17\165\1\0\12\165\1\0\3\146\1\166\6\0\1\146"+
    "\13\0\1\161\1\60\1\133\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2739];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\2\1\1\11\10\1\1\11\3\1\1\11\1\1"+
    "\1\11\2\1\5\11\1\1\1\11\11\1\1\11\1\1"+
    "\1\11\1\1\1\11\2\0\1\1\1\11\1\0\2\1"+
    "\1\0\1\1\2\0\2\1\1\0\1\1\2\0\5\1"+
    "\1\11\3\1\2\11\1\0\1\1\2\0\2\1\1\0"+
    "\1\11\2\0\3\1\1\11\3\1\1\11\2\0\1\1"+
    "\2\0\1\1\1\0\1\11\1\0\1\1\5\0\3\1"+
    "\4\0\1\1\1\0\1\1\1\11\1\1\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	private void retryInState(int newState) {
        yybegin(newState);
        yypushback(yylength());
	}


  public _NeonLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _NeonLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1320) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 25: 
          { return NEON_DOUBLE_COLON;
          }
        case 29: break;
        case 1: 
          { return NEON_UNKNOWN;
          }
        case 30: break;
        case 26: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return NEON_ARRAY_BULLET;
          }
        case 31: break;
        case 14: 
          { return NEON_LBRACE_CURLY;
          }
        case 32: break;
        case 13: 
          { return NEON_LBRACE_SQUARE;
          }
        case 33: break;
        case 8: 
          { return NEON_COMMENT;
          }
        case 34: break;
        case 18: 
          { return NEON_KEY;
          }
        case 35: break;
        case 17: 
          { return NEON_DOLLAR;
          }
        case 36: break;
        case 7: 
          { return NEON_AT;
          }
        case 37: break;
        case 22: 
          { return NEON_VARIABLE;
          }
        case 38: break;
        case 15: 
          { return NEON_LPAREN;
          }
        case 39: break;
        case 12: 
          { return NEON_ITEM_DELIMITER;
          }
        case 40: break;
        case 9: 
          { return NEON_RPAREN;
          }
        case 41: break;
        case 28: 
          { retryInState(IN_BLOCK_HEADER);
        // return NEON_BLOCK_HEADER;
          }
        case 42: break;
        case 2: 
          { return NEON_IDENTIFIER;
          }
        case 43: break;
        case 16: 
          { return NEON_RBRACE_SQUARE;
          }
        case 44: break;
        case 23: 
          { return NEON_REFERENCE;
          }
        case 45: break;
        case 21: 
          { return NEON_STRING;
          }
        case 46: break;
        case 6: 
          { return NEON_RBRACE_CURLY;
          }
        case 47: break;
        case 11: 
          { return NEON_BLOCK_INHERITENCE;
          }
        case 48: break;
        case 5: 
          { return NEON_NUMBER;
          }
        case 49: break;
        case 4: 
          { yybegin(YYINITIAL);
        return NEON_INDENT;
          }
        case 50: break;
        case 24: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return NEON_ASSIGNMENT;
          }
        case 51: break;
        case 10: 
          { return NEON_ASSIGNMENT;
          }
        case 52: break;
        case 3: 
          { return NEON_WHITESPACE;
          }
        case 53: break;
        case 27: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { yybegin(YYINITIAL);
        return NEON_ASSIGNMENT;
          }
        case 54: break;
        case 19: 
          { yybegin(YYINITIAL);
        return NEON_ASSIGNMENT;
          }
        case 55: break;
        case 20: 
          { retryInState(IN_KEY);
        // return NEON_KEY;
          }
        case 56: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
