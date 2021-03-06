/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalMusicDslParser;
import org.xtext.example.mydsl.services.MusicDslGrammarAccess;

public class MusicDslParser extends AbstractAntlrParser {

	@Inject
	private MusicDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMusicDslParser createParser(XtextTokenStream stream) {
		return new InternalMusicDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Composition";
	}

	public MusicDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MusicDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
