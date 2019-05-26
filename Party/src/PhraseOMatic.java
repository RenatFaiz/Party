public class PhraseOMatic {
	public static void main (String[] args) {
	String[] wordListOne = {"лакшери", "премиум", "самые сочные", "красивые девочки", "у меня"};
    String[] wordListTwo = {"хип-хоп", "студия", "дэнсить", "вокал", "биты"};
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
String phrase = wordListOne[rand1] + " " + wordListTwo[rand2];
	System.out.println("Всё, что нам нужно - это " + phrase);
}
}
