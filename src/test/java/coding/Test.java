package coding;

public class Test {

	public static void main(String[] args) {

		class a {
			public void show() {
				System.out.println("aaaaaa");
			}
		}

		class b extends a {
			@Override
			public void show() {
				System.out.println("bbbbbbbbb");
			}
		}


		b obj = (b) new a();
		obj.show();

	}


}
