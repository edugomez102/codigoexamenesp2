public class HolidayInn{
	public static void main(String[] args){
		Hotel hotel = new Hotel(5,5);
		System.out.println("Reforma 5: " + hotel.reforma(5));
		System.out.println("Reforma 3: " + hotel.reforma(3));
		System.out.println("Reforma 0: " + hotel.reforma(0));
		for(int i = 1; i <= 5; i++){
			System.out.println("Alojar ocupantes " + i + " 1º " + hotel.aloja(i));
			System.out.println("Alojar ocupantes " + i + " 2º " + hotel.aloja(i));
			System.out.println("Alojar ocupantes " + i + " 3º " + hotel.aloja(i));
		}
		System.out.println("Suites: " + hotel.getReformas());
		System.out.println("Habitaciones: " + hotel.getHabitaciones());
	}
}