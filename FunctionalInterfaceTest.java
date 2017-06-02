interface Converter <F, T>{
	T convert(F s);
	
}

class Something{
	String startsWith(String s){
		return String.valueOf(s.charAt(0));
	}
}

class FunctionalInterfaceTest{

	public static void main (String[] args){
		Converter<String, Integer> c = s -> Integer.parseInt(s);
		
		int age = c.convert("29");
		System.out.println(age);

		Something some = new Something();
		Converter<String, String> c2 = some::startsWith;
		String firstLetter = c2.convert("Vanessa");
		System.out.println(firstLetter);

	}

}
