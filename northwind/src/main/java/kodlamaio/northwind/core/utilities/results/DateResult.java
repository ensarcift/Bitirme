package kodlamaio.northwind.core.utilities.results;

public class DateResult<T> extends Result {

	private T data;
	public DateResult(T data,boolean success, String message) {
		super(success, message); //super base sınıfın constructrını çalıştırıyor
		this.data=data;
		
	}
	public DateResult(T data,boolean success) {
		super(success); //super base sınıfın constructrını çalıştırıyor
		this.data=data;
		
	}

	public T getData() {
		return this.data;
	}

}
