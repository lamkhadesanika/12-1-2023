package com_awt;

public class TestApartmentOwner {

 
		public static void main (String[] args) {
		ApartmentOwner p = new ApartmentOwner("Aruna Lamkhade");
		p.setApartment("Sobha empire, 29", 0);
		p.setApartment("Lotus apartment, 42", 1);
		p.setApartment("Shkti empire, 9", 2);
		p.setApartment("Desai apartment, 30", 3);
		p.setApartment("anuradha Apartments, 2500", 4);
		p.setApartment("Rhea apartments, 45", 5);
		p.setApartment("Anushka Apartments, 67", 6);
		p.setApartment("Namarata Apartment, 35", 7);
		p.setApartment("Sona Apartment, 87", 8);
		p.setApartment("Prakash Apartment, 49", 9);
		System.out.println(p);
		System.out.println();
		System.out.println(p.getOwner() + " has " +
		p.countApartments() + " apartments");
		System.out.println("Apartment 2: " + p.getApartment(2));
		System.out.println("Apartment 8: " + p.getApartment(8));
		System.out.println();
		p.reorganizeApartments();
		System.out.println(p);
		}
		}
