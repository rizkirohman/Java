class bintang {
	public static void main(String[] args) {
		int a, b;
		System.out.println();
		for (a = 5; a >= 1; a--) {
			for (b = 5; b >= a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
