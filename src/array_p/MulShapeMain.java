package array_p;

public class MulShapeMain {

	public static void main(String[] args) {
		int [][] shapes = {
				   {5},
				   {5,6},
				   {5,6,8},
				   {10,4},
				   {8},
				   {10,6,13}
		};
		
		String [] pname = new String[shapes.length];
		int [][] res =  new int[shapes.length][2];
		
		final double PI = 3.141592;
		String [] title = {"","원","직사각형","직각삼각형"};
		
		for (int i = 0; i < shapes.length; i++) {
			int [] line = shapes[i];
			int [] myRes = res[i];
			
			pname[i] = title[line.length];
			
			switch (line.length) {
				case 1:
					//pname[i] = "원";
					myRes[0] = (int)(line[0] * line[0] * PI); 
					myRes[1] = (int)(line[0] * 2 * PI);
					break;
				case 2:
					//pname[i] = "직사각형";
					myRes[0] = line[0] * line[1];
					myRes[1] = (line[0] + line[1]) * 2;
					break;
				case 3:
					//pname[i] = "직각삼각형";
					myRes[0] = line[0] * line[1] / 2;
					myRes[1] = line[0] + line[1]+ line[2];
					break;
			}
			
		}
		
		for (int i = 0; i < shapes.length; i++) {
			String ttt = pname[i];
			
			for (int r : res[i]) {
				ttt += "\t" +r;
			}
			
			System.out.println(ttt);
		}

	}

}
