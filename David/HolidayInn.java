public class HolidayInn{

	private static void main(String []args){
		Hotel hotelito = new Hotel(5,5);
		hotelito.reforma(5);
		hotelito.reforma(3);
		hotelito.reforma(0); //no se puede pq va de 1 a n;

		hotelito.aloja(5);/* Sacar todas los println*/
		hotelito.aloja(5);
		hotelito.aloja(5);
		hotelito.aloja(3);
		hotelito.aloja(3);
		hotelito.aloja(3);
		hotelito.aloja(0);
		hotelito.aloja(0);
		hotelito.aloja(0);

		System.out.println(hotelito.getReformas);
		System.out.println(hotelito.getHabitaciones);

	}
}