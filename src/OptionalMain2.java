import java.util.Optional;

public class OptionalMain2 {
	
	public static void main(String[] args) {
	
		Optional<String> os1 = Optional.of("Optional String");
		
		Optional<String> os2 = os1.map(s->s.toUpperCase());
		
		System.out.println(os2.get());

	}

}
