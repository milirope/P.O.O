package Greenhouse;

	import java.util.ArrayList;

	public  class Main{
	
		public static void main(String[] args) {

			
			Plant p1 = new Plant();
			p1.settype("Gimnospermas");
			p1.setname("Cipreses");
			p1.setcolor("Green");
			p1.setflower("Yes");
			p1.setseed("Yes");
			p1.setfruit("No");
			p1.setspore("No");


			
			
			Plant p2 = new Plant();
			p2.settype("Gimnospermas");
			p2.setname("Araucaria");
			p2.setcolor("Green");
			p2.setflower("Yes");
			p2.setseed("Yes");
			p2.setfruit("No");
			p2.setspore("No");


			
			
			
			Plant p3 = new Plant();
			p3.settype("Gimnospermas");
			p3.setname("Sequoias");
			p3.setcolor("Green");
			p3.setflower("Yes");
			p3.setseed("Yes");
			p3.setfruit("No");
			p3.setspore("No");


			
			
			
			Plant p4 = new Plant();
			p4.settype("Gimnospermas");
			p4.setname("Tsuga");
			p4.setcolor("Green");
			p4.setflower("Yes");
			p4.setseed("Yes");
			p4.setfruit("No");
			p4.setspore("No");

			
			Plant p5 = new Plant();
			p5.settype("Angiospermas");
			p5.setname("Orquidea");
			p5.setcolor("Purple");
			p5.setflower("Yes");
			p5.setseed("Yes");
			p5.setfruit("Yes");
			p5.setspore("No");


			
			
			
			Plant p6 = new Plant();
			p6.settype("Angiospermas");
			p6.setname("Lirios");
			p6.setcolor("Red");
			p6.setflower("Yes");
			p6.setseed("Yes");
			p6.setfruit("Yes");
			p6.setspore("No");


			
			
			
			
			Plant p7 = new Plant();
			p7.settype("Angiospermas");
			p7.setname("Margaritas");
			p7.setcolor("White");
			p7.setflower("Yes");
			p7.setseed("Yes");
			p7.setfruit("Yes");
			p7.setspore("No");


			
			
			
			
			Plant p8 = new Plant();
			p8.settype("Angiospermas");
			p8.setname("Rosas");
			p8.setcolor("Red");
			p8.setflower("Yes");
			p8.setseed("Yes");
			p8.setfruit("Yes");
			p8.setspore("No");


			
				
			Plant p9 = new Plant();
			p9.settype("Briofitas (musgos)");
			p9.setname("Hylocomium splenders");
			p9.setcolor("Green");
			p9.setflower("No");
			p9.setseed("No");
			p9.setfruit("No");
			p9.setspore("Yes");


				
				
			Plant p10= new Plant();
			p10.settype("Briofitas (musgos)");
			p10.setname("Tortula muralis");
			p10.setcolor("Green");
			p10.setflower("No");
			p10.setseed("No");
			p10.setfruit("No");
			p10.setspore("Yes");


				Plant p11= new Plant();
			p11.settype("Briofitas (musgos)");
			p11.setname("Eriopus remotifolius");
			p11.setcolor("Green");
			p11.setflower("No");
			p11.setseed("No");
			p11.setfruit("No");
			p11.setspore("Yes");
				
				
			Plant p12= new Plant();
			p12.settype("Briofitas (musgos)");
			p12.setname("Zygodon menziessii");
			p12.setcolor("Green");
			p12.setflower("No");
			p12.setseed("No");
			p12.setfruit("No");
			p12.setspore("Yes");

				
			Plant p13= new Plant();
			p13.settype("Pteridofitos (helechos)");
			p13.setname("Asplenium nidus");
			p13.setcolor("Green");
			p13.setflower("No");
			p13.setseed("No");
			p13.setfruit("No");
			p13.setspore("Yes");


			Plant p14= new Plant();
			p14.settype("Pteridofitos (helechos)");
			p14.setname("Blechnum gibbum");
			p14.setcolor("Green");
			p14.setflower("No");
			p14.setseed("No");
			p14.setfruit("No");
			p14.setspore("Yes");

				
			Plant p15= new Plant();
			p15.settype("Pteridofitos (helechos)");
			p15.setname("Cyrtomium falcatum");
			p15.setcolor("Green");
			p15.setflower("No");
			p15.setseed("No");
			p15.setfruit("No");
			p15.setspore("Yes");

				
			Plant p16= new Plant();
			p16.settype("Pteridofitos (helechos)");
			p16.setname("Selaginella willdenowii");
			p16.setcolor("Green");
			p16.setflower("No");
			p16.setseed("No");
			p16.setfruit("No");
			p16.setspore("Yes");

				
				
		ArrayList<Plant> Plants = new ArrayList<>();

		Plants.add(p1);
		Plants.add(p2);
		Plants.add(p3);
		Plants.add(p4);
		Plants.add(p5);
		Plants.add(p6);
		Plants.add(p7);
		Plants.add(p8);
		Plants.add(p9);
		Plants.add(p10);
		Plants.add(p11);
		Plants.add(p12);
		Plants.add(p13);
		Plants.add(p14);
		Plants.add(p15);
		Plants.add(p16);
		


		System.out.println("\n" + p1);
		System.out.println("\n"+ p2 + "\n");
		System.out.println("\n"+ p3 + "\n");
		System.out.println("\n"+ p4 + "\n");
		System.out.println("\n"+ p5 + "\n");
		System.out.println("\n"+ p6 + "\n");
		System.out.println("\n"+ p7 + "\n");
		System.out.println("\n"+ p8 + "\n");
		System.out.println("\n"+ p9 + "\n");
		System.out.println("\n"+ p10 + "\n");
		System.out.println("\n"+ p11 + "\n");
		System.out.println("\n"+ p12 + "\n");
		System.out.println("\n"+ p13 + "\n");
		System.out.println("\n"+ p14 + "\n");
		System.out.println("\n"+ p15 + "\n");
		System.out.println("\n"+ p16 + "\n");
		
		


	}}
