package com.sanjay.nlp;

import java.util.Properties;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipeline {
	
	private static Properties prop;
	private static String propName="tokenize, ssplit, pos, lemma, ner, parse, sentiment";
	private static StanfordCoreNLP coreNLP;
	
	private Pipeline() {
		
	}
	
	public static StanfordCoreNLP fetchPipeline() {
		if(coreNLP==null) {
			coreNLP = new StanfordCoreNLP(prop);			
		}
		return coreNLP;
	}
	
	static {
		prop = new Properties();
		prop.setProperty("annotators", propName);
	}

}
