package cz.juzna.intellij.neon.lexer;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.psi.tree.IElementType;
import com.intellij.testFramework.UsefulTestCase;
import com.sun.tools.javac.util.Pair;
import org.jetbrains.annotations.NonNls;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static cz.juzna.intellij.neon.lexer.NeonTokenTypes.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 *
 */
public class LexerTest extends UsefulTestCase {

	/*** helpers ***/

	/**
	 * Test that lexing a given piece of code will give particular tokens
	 *
	 * @param text Sample piece of neon code
	 * @param expectedTokens List of tokens expected from lexer
	 */
	protected static void doTest(@NonNls String text, @NonNls Pair<IElementType, String>[] expectedTokens) {
		Lexer lexer = new NeonLexer();
		doTest(text, expectedTokens, lexer);
	}

	private static void doTest(String text, Pair<IElementType, String>[] expectedTokens, Lexer lexer) {
		lexer.start(text);
		int idx = 0;
		while (lexer.getTokenType() != null) {
			if (idx >= expectedTokens.length) fail("Too many tokens from lexer; unexpected " + lexer.getTokenType());

			Pair expected = expectedTokens[idx++];
			assertEquals("Wrong token", expected.fst, lexer.getTokenType());

			String tokenText = lexer.getBufferSequence().subSequence(lexer.getTokenStart(), lexer.getTokenEnd()).toString();
			assertEquals(expected.snd, tokenText);
			lexer.advance();
		}

		if (idx < expectedTokens.length) fail("Not enough tokens from lexer");
	}



	/*** tests here ***/

	@Test
	public void testSimple() throws Exception {
		doTest("name: Jan", new Pair[] {
				Pair.of(NEON_KEY, "name"),
				Pair.of(NEON_ASSIGNMENT, ":"),
				Pair.of(NEON_WHITESPACE, " "),
				Pair.of(NEON_IDENTIFIER, "Jan"),
		});
	}

	@Test
	public void test01() throws Exception {
		doTestFromFile();
	}

	@Test
	public void test02() throws Exception {
		doTestFromFile();
	}

	@Test
	public void test03() throws Exception {
		doTestFromFile();
	}

	public void doTestFromFile() throws Exception {
		String code = doLoadFile("src/test/data/parser", getTestName(false) + ".neon");

		Lexer lexer = new NeonLexer();
		StringBuilder sb = new StringBuilder();

		lexer.start(code);
		while (lexer.getTokenType() != null) {
			sb.append(lexer.getTokenType().toString());
			sb.append("\n");
			lexer.advance();
		}

//		System.out.println(sb);

		// Match to original
		String lexed = doLoadFile("src/test/data/parser", getTestName(false) + ".lexed");
		assertEquals(lexed, sb.toString());
	}

	private static String doLoadFile(String myFullDataPath, String name) throws IOException {
		String fullName = myFullDataPath + File.separatorChar + name;
		String text = FileUtil.loadFile(new File(fullName), CharsetToolkit.UTF8).trim();
		text = StringUtil.convertLineSeparators(text);
		return text;
	}

}
