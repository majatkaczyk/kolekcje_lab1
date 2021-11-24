package kolekcje;

import java.util.*;

/**
 * Program: Aplikacja działająca w oknie konsoli, która umożliwia testowanie 
 *          operacji wykonywanych na obiektach klasy Person.
 *
 *    Plik: PersonConsoleApp.java
 *
 */
public class PersonConsoleApp {


	private static final String MENU =
			"    M E N U   G Ł Ó W N E  \n" +
			"1 - Uzyj ArrayList \n" +
			"2 - Uzyj LinkedList        \n" +
			"3 - Uzyj HashSet   \n" +
			"4 - Uzyj TreeSet   \n" +
			"5 - Uzyj HashMap   \n" +
			"6 - Uzyj TreeMap   \n" +
			"0 - Zakończ program        \n";

	/**
	 * ConsoleUserDialog to pomocnicza klasa zawierająca zestaw
	 * prostych metod do realizacji dialogu z użytkownikiem
	 * w oknie konsoli tekstowej.
	 */
	private static final ConsoleUserDialog UI = new ConsoleUserDialog();
	
	
	public static void main(String[] args) {
		// Utworzenie obiektu aplikacji konsolowej
		// oraz uruchomienie głównej pętli aplikacji.
		PersonConsoleApp application = new PersonConsoleApp();
		application.runMainLoop();
	}
	/*
	 *  Metoda runMainLoop wykonuje główną pętlę aplikacji.
	 *  UWAGA: Ta metoda zawiera nieskończoną pętlę,
	 *         w której program się zatrzymuje aż do zakończenia
	 *         działania za pomocą metody System.exit(0); 
	 */
	public void runMainLoop() {


		while (true) {
			UI.clearConsole();

			try {
				//obiekty klasy, w której nie są zdefiniowane metody equals() i hashCode()
				Person person1 = new Person("Jan", "Kojciech", 2001);
				person1.setJob("Gość");
				Person person2 = new Person("Janusz", "Jatryk",1999);
				person2.setJob("Student");
				Person person3 = new Person("Alicja", "Manusz", 2008);
				person3.setJob("Nauczyciel");
				Person person4 = new Person("Wojciech", "Ulicja",1988);
				person4.setJob("Kierownik");
				Person person5 = new Person("Patryk", "Wan",1999);
				person5.setJob("Dyrektor");
				Person person6 = new Person("Janusz", "Jatryk",1987);
				person6.setJob("Gość");
				Person person7 = new Person("Janusz", "Jatryk", 1987);
				person7.setJob("Student");

				//obiekty klasy, w której są zdefiniowane metody equals() i hashCode()
				ImprovedPerson person11 = new ImprovedPerson("Jan", "Kojciech", 2001);
				person11.setJob("Gość");
				ImprovedPerson person22 = new ImprovedPerson("Janusz", "Jatryk",1999);
				person22.setJob("Student");
				ImprovedPerson person33 = new ImprovedPerson("Alicja", "Manusz", 2008);
				person33.setJob("Nauczyciel");
				ImprovedPerson person44 = new ImprovedPerson("Wojciech", "Ulicja",1988);
				person44.setJob("Kierownik");
				ImprovedPerson person55 = new ImprovedPerson("Patryk", "Wan",1999);
				person55.setJob("Dyrektor");
				ImprovedPerson person66 = new ImprovedPerson("Janusz", "Jatryk",1987);
				person66.setJob("Gość");
				ImprovedPerson person77 = new ImprovedPerson("Janusz", "Jatryk", 1987);
				person77.setJob("Student");

				switch (UI.enterInt(MENU + "==>> ")) {
				case 1:
					System.out.println("Przyklad uzycia ArrayList");
					List<Person> personList = new ArrayList<>();
					List<ImprovedPerson> improvedpersonList = new ArrayList<>();
					//dodawanie tych samych i takich samych obiektów do listy
					personList.add(person1);
					personList.add(person2);
					personList.add(person1);
					personList.add(person6);
					personList.add(person7);
					personList.add(person5);

					improvedpersonList.add(person11);
					improvedpersonList.add(person22);
					improvedpersonList.add(person11);
					improvedpersonList.add(person66);
					improvedpersonList.add(person77);
					improvedpersonList.add(person55);

					//usuwanie obiektu z listy
					personList.remove(person2);
					improvedpersonList.remove(person22);

					//iteracja po elementach
					System.out.println("Lista obiektów klasy bez zdefiniowanych metod equals() i hashCode()");
					for (Person person: personList) {
						System.out.println(person);
					}
					System.out.println("Lista obiektów klasy ze zdefiniowanymi metodami equals() i hashCode()");
					for (ImprovedPerson person: improvedpersonList) {
						System.out.println(person);
					}
					System.out.println("Roznica przy zdefiniowanych i niezdefiniowanych metodach equals() i hashCode()");
					//brak zdefiniowanych metod equals() i hashCode()
					System.out.println("Dane osoby nr 3 na liscie");
					System.out.println(personList.get(2));
					System.out.println((personList.get(2)).getBirthYear());
					System.out.println("Dane osoby nr 4 na liscie");
					System.out.println(personList.get(3));
					System.out.println((personList.get(3)).getBirthYear());
					if((personList.get(2)).equals(personList.get(3)))
					{
						System.out.println("Osoby maja takie samo imie, nazwisko oraz rok urodzenia wiec sa takie same");
					}
					else
						System.out.println("Pomimo tego, ze osoby maja takie samo imie, nazwisko oraz rok urodzenia, nie sa takie same");
					//zdefiniowane metody equals() i hashCode()
					System.out.println("Dane ulepszonej osoby nr 3 na liscie");
					System.out.println(improvedpersonList.get(2));
					System.out.println((improvedpersonList.get(2)).getBirthYear());
					System.out.println("Dane ulepszonej osoby nr 4 na liscie");
					System.out.println(improvedpersonList.get(3));
					System.out.println((improvedpersonList.get(3)).getBirthYear());
					if((improvedpersonList.get(2)).equals(improvedpersonList.get(3)))
					{
						System.out.println("Osoby maja takie samo imie, nazwisko oraz rok urodzenia wiec sa takie same");
					}
					else
						System.out.println("Pomimo tego, ze osoby maja takie samo imie, nazwisko oraz rok urodzenia, nie sa takie same");

					break;
				case 2:
					System.out.println("Przyklad uzycia LinkedList");
					List<Person> personLinkedList = new LinkedList<>();
					List<ImprovedPerson> improvedPersonLinkedList = new LinkedList<>();
					//dodawanie tych samych i takich samych obiektów do listy
					personLinkedList.add(person3);
					personLinkedList.add(person4);
					personLinkedList.add(person3);
					personLinkedList.add(person6);
					personLinkedList.add(person7);
					personLinkedList.add(person5);

					improvedPersonLinkedList.add(person33);
					improvedPersonLinkedList.add(person44);
					improvedPersonLinkedList.add(person33);
					improvedPersonLinkedList.add(person66);
					improvedPersonLinkedList.add(person77);
					improvedPersonLinkedList.add(person55);

					//usuwanie obiektów
					personLinkedList.remove(person4);
					improvedPersonLinkedList.remove(person44);
					//iteracja po elementach
					System.out.println("Lista obiektów klasy bez zdefiniowanych metod equals() i hashCode()");
					for (Person person: personLinkedList) {
						System.out.println(person);
					}
					System.out.println("Lista obiektów klasy ze zdefiniowanymi metodami equals() i hashCode()");
					for (ImprovedPerson person: improvedPersonLinkedList) {
						System.out.println(person);
					}
					System.out.println("Roznica przy zdefiniowanych i niezdefiniowanych metodach equals() i hashCode()");
					//brak zdefiniowanych metod equals() i hashCode()
					System.out.println("Dane osoby nr 3 na liscie");
					System.out.println(personLinkedList.get(2));
					System.out.println((personLinkedList.get(2)).getBirthYear());
					System.out.println("Dane osoby nr 4 na liscie");
					System.out.println(personLinkedList.get(3));
					System.out.println((personLinkedList.get(3)).getBirthYear());
					if((personLinkedList.get(2)).equals(personLinkedList.get(3)))
					{
						System.out.println("Osoby maja takie samo imie, nazwisko oraz rok urodzenia wiec sa takie same");
					}
					else
						System.out.println("Pomimo tego, ze osoby maja takie samo imie, nazwisko oraz rok urodzenia, nie sa takie same");
					//zdefiniowane metody equals() i hashCode()
					System.out.println("Dane ulepszonej osoby nr 3 na liscie");
					System.out.println(improvedPersonLinkedList.get(2));
					System.out.println((improvedPersonLinkedList.get(2)).getBirthYear());
					System.out.println("Dane ulepszonej osoby nr 4 na liscie");
					System.out.println(improvedPersonLinkedList.get(3));
					System.out.println((improvedPersonLinkedList.get(3)).getBirthYear());
					if((improvedPersonLinkedList.get(2)).equals(improvedPersonLinkedList.get(3)))
					{
						System.out.println("Osoby maja takie samo imie, nazwisko oraz rok urodzenia wiec sa takie same");
					}
					else
						System.out.println("Pomimo tego, ze osoby maja takie samo imie, nazwisko oraz rok urodzenia, nie sa takie same");
					break;
				case 3:
					System.out.println("Przyklad uzycia HashSet");
					Set<Person> personSet = new HashSet<>();
					Set<ImprovedPerson> improvedPersonSet = new HashSet<>();
					//dodawanie tych samych i takich samych obiektów
					personSet.add(person1);
					personSet.add(person2);
					personSet.add(person1);
					personSet.add(person6);
					personSet.add(person7);
					personSet.add(person5);

					improvedPersonSet.add(person11);
					improvedPersonSet.add(person22);
					improvedPersonSet.add(person11);
					improvedPersonSet.add(person66);
					improvedPersonSet.add(person77);
					improvedPersonSet.add(person55);

					//usuwanie obiektów
					personSet.remove(person2);
					improvedPersonSet.remove(person22);

					//iteracja po elementach
					System.out.println("Zestaw obiektów klasy bez zdefiniowanych metod equals() i hashCode()");
					for (Person person: personSet) {
						System.out.println(person);
						System.out.println(person.getBirthYear());
					}
					System.out.println("Zestaw obiektów klasy ze zdefiniowanymi metodami equals() i hashCode()");
					for (ImprovedPerson person: improvedPersonSet) {
						System.out.println(person);
						System.out.println(person.getBirthYear());
					}
					System.out.println("Widac roznice dla zdefiniowanych i niezdefiniowanych metod equals() i hashCode(), poniewaz ");
					System.out.println("zbiory przyjmuja rozne obiekty, w zestawie pierwszym osoby o identycznym imieniu, nazwisku i roku urodzenia " +
							"sie powtarzaja, a w drugim zestawie nie");
					break;
				case 4:
					System.out.println("Przyklad uzycia TreeSet");
					Set<Person> personTreeSet = new TreeSet<>();
					//dodawanie tych samych i takich samych obiektów
					//obiekty klasy bez zdefiniowanych metod equals() i hashCode()
					personTreeSet.add(person1);
					personTreeSet.add(person2);
					personTreeSet.add(person1);
					personTreeSet.add(person6);
					personTreeSet.add(person7);
					personTreeSet.add(person5);
					personTreeSet.add(person6);
					personTreeSet.add(person3);
					personTreeSet.add(person4);

					//usuwanie obiektu
					personTreeSet.remove(person2);
					//iteracja po elementach
					System.out.println("Zestaw obiektów");
					for (Person person: personTreeSet) {
						System.out.println(person);
						System.out.println(person.getBirthYear());
						System.out.println(person.getJob());
					}
					break;
				case 5: System.out.println("Przyklad uzycia HashMap");
					Map<Integer,Person> personMap = new HashMap<>();
					Map<Integer, ImprovedPerson> improvedPersonMap = new HashMap<>();
					//dodawanie tych samych i takich samych obiektów
					personMap.put(1,person1);
					personMap.put(2,person5);
					personMap.put(3,person1);
					personMap.put(4,person6);
					personMap.put(5,person7);
					personMap.put(6,person4);

					improvedPersonMap.put(1,person11);
					improvedPersonMap.put(2,person55);
					improvedPersonMap.put(3,person11);
					improvedPersonMap.put(4,person66);
					improvedPersonMap.put(5,person77);
					improvedPersonMap.put(6,person44);

					//usuwanie obiektów
					personMap.remove(3);
					improvedPersonMap.remove(3);
					//iteracja po elementach
					System.out.println("Mapa obiektów klasy bez zdefiniowanych metod equals() i hashCode()");
					for (Person person: personMap.values()) {
						System.out.println(person);
						System.out.println(person.getBirthYear());
					}
					System.out.println("Mapa obiektów klasy ze zdefiniowanymi metodami equals() i hashCode()");
					for (ImprovedPerson person: improvedPersonMap.values()) {
						System.out.println(person);
						System.out.println(person.getBirthYear());
					}
					System.out.println("Roznica przy zdefiniowanych i niezdefiniowanych metodach equals() i hashCode()");
					//brak zdefiniowanych metod equals() i hashCode()
					System.out.println("Dane osoby nr 3 ");
					System.out.println(personMap.get(4));
					System.out.println((personMap.get(4)).getBirthYear());
					System.out.println("Dane osoby nr 4 na liscie");
					System.out.println(personMap.get(5));
					System.out.println((personMap.get(5)).getBirthYear());
					if(personMap.get(4).equals(personMap.get(5)))
					{
						System.out.println("Osoby maja takie samo imie, nazwisko oraz rok urodzenia wiec sa takie same");
					}
					else
						System.out.println("Pomimo tego, ze osoby maja takie samo imie, nazwisko oraz rok urodzenia, nie sa takie same");
					//zdefiniowane metody equals() i hashCode()
					System.out.println("Dane ulepszonej osoby nr 3 ");
					System.out.println(improvedPersonMap.get(4));
					System.out.println((improvedPersonMap.get(4)).getBirthYear());
					System.out.println("Dane ulepszonej osoby nr 4 ");
					System.out.println(improvedPersonMap.get(5));
					System.out.println((improvedPersonMap.get(5)).getBirthYear());
					if((improvedPersonMap.get(4)).equals(improvedPersonMap.get(5)))
					{
						System.out.println("Osoby maja takie samo imie, nazwisko oraz rok urodzenia wiec sa takie same");
					}
					else
						System.out.println("Pomimo tego, ze osoby maja takie samo imie, nazwisko oraz rok urodzenia, nie sa takie same");

					break;
				case 6:
					System.out.println("Przyklad uzycia TreeMap");
					Map<Integer,Person> personTreeMap = new TreeMap<>();
					//dodawanie tych samych i takich samych obiektów
					//obiekty klasy bez zdefiniowanych metod equals() i hashCode()
					personTreeMap.put(1, person1);
					personTreeMap.put(2, person2);
					personTreeMap.put(3, person1);
					personTreeMap.put(4, person6);
					personTreeMap.put(5, person7);
					personTreeMap.put(6, person2);
					personTreeMap.put(7, person5);

					//usuwanie obiektów
					personTreeMap.remove(3);

					//iteracja po elementach
					System.out.println("Mapa obiektów ");
					for (Person person: personTreeMap.values()) {
						System.out.println(person);
						System.out.println(person.getBirthYear());
						System.out.println(person.getJob());
					}
					break;
				case 0:
					// zakończenie działania programu
					UI.printInfoMessage("\nProgram zakończył działanie!");
					System.exit(0);
				} // koniec instrukcji switch
			} catch (PersonException e) { 
				// Tu są wychwytywane wyjątki zgłaszane przez metody klasy Person,
				// gdy nie są spełnione ograniczenia nałożone na dopuszczalne wartości
				// poszczególnych atrybutów.
				// Drukowanie komunikatu o błędzie zgłoszonym za pomocą wyjątku PersonException.
				UI.printErrorMessage(e.getMessage());
			}
		} // koniec pętli while
	}
}  // koniec klasy PersonConsoleApp
