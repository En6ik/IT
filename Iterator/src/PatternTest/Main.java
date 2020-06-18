package PatternTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main<T> implements Iterable<T> {

	public static void main(String[] args) {

		/*
		 * iter�tor je n�vrhov� vzor kter� slou�� k vytvo�en� rozhran�, kter� umo��uje
		 * proch�zet objekty ulo�en� ve slo�it� struktu�e(kontejner).
		 */

		ArrayList<String> Valorant = new ArrayList<String>();

		Valorant.add("Sage");
		Valorant.add("Phoenix");
		Valorant.add("Jett");
		Valorant.add("Viper");
		Valorant.add("Sova");
		Valorant.add("Breach");
		Valorant.add("Omen");
		Valorant.add("Cypher");
		Valorant.add("Brimstone");
		Valorant.add("Raze");

		// Tohle jsem na�el na internetu a p�i�lo mi to docela dobr�
		ListIterator iterator = Valorant.listIterator();

		System.out.println("Vypisov�n� postav dop�edn�: ");
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println("\n");
		
		System.out.println("Vypisov�n� postav pozp�tku : ");
		while (iterator.hasPrevious())
			System.out.print(iterator.previous() + " ");
		System.out.println("\n");

		ArrayList<Integer> kills = new ArrayList<Integer>();

		kills.add(12);
		kills.add(20);
		kills.add(15);
		kills.add(12);
		kills.add(21);
		kills.add(26);
		kills.add(31);
		kills.add(15);
		kills.add(20);
		kills.add(29);

		Iterator<Integer> ite2 = kills.iterator();

		while (ite2.hasNext()) {
			System.out.println("Killy postav: " + ite2.next());
		}
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

}