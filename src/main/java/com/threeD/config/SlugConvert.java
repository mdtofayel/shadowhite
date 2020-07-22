package com.threeD.config;

public class SlugConvert {

	
	  public static String nameToSlug(String itemTitleName){
	        String replaceAllCharacterWithSpace  =  itemTitleName.replaceAll("[^\\w]"," ").toLowerCase();
	        String afterSpaceRemoveDuplicateSpace = replaceAllCharacterWithSpace.replaceAll("\\s+"," ");
	        String replaceSpaceFinal = afterSpaceRemoveDuplicateSpace.replaceAll("[^\\w]","-");
	        return replaceSpaceFinal;
	    }
}
