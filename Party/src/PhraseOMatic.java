public class PhraseOMatic {
	public static void main (String[] args) {
	String[] wordListOne = {"�������", "�������", "����� ������", "�������� �������", "� ����"};
    String[] wordListTwo = {"���-���", "������", "�������", "�����", "����"};
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
String phrase = wordListOne[rand1] + " " + wordListTwo[rand2];
	System.out.println("��, ��� ��� ����� - ��� " + phrase);
}
}
