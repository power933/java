import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.util.Scanner;

/*
 	���� ��ɾ� ���� : read(), readLine(),next(),nextLine();
 */

//BufferReader : output
public class file7 {
	
	public static void main(String[] args)throws IOException {
		String dir = "C:\\java5\\File_Stream\\src\\Buffer.txt";
//		File f = new File(dir);
//		f.createNewFile();
//		FileWriter fw = new FileWriter(dir,true);
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		fw.write(a+"\n");
//		fw.close();
		try {
		
		FileReader fr = new FileReader(dir,Charset.forName("UTF8"));
		//bufferReader : temp(�ӽ� �����) -ȿ�������� ������ ������ ������ �� ����
		FileReader fr1 = new FileReader(dir,Charset.forName("UTF8"));
			BufferedReader bf = new BufferedReader(fr);	//readLine()���� �ش簪�� ������
			BufferedReader bf1 = new BufferedReader(fr1);	//readLine()���� �ش簪�� ������
//			System.out.println(bf.readLine());	//�ش� �ӽ�����ҿ��� ����� ������ �Ѱ��� �������� �ε��ϰ� �˴ϴ�
			/*
			 	buffer�� ���� ���� ����Ͽ��� ��� ������ ���� ������ ���� ����ϰ� �˴ϴ�.
			 */
			
			if(bf.readLine() !=null) {	//���⼭�� �����¼��� ���� ����
				
				int w = 0;
				while(w<2) {
					System.out.println(bf.readLine());	
					//bf.readline���� ���� ���θ��� ���پ� ��Ƽ� �¿�����
					//������ ����. ���Ÿ� �ݺ����� ����ϰ� �� �¿���� �ƴϸ� ����Լ�,�޼ҵ�� �̿�
					w++;
				}
			}
//			 	������ ������ ���� ������ Ȯ�� �ϴ� ���
			LineNumberReader li = new LineNumberReader(fr1);
			int ea = 0;
			while(li.readLine()!=null) {
				ea = li.getLineNumber();
			}
			System.out.println(ea);
			
			//Buffer�� �ӵ��� ���� ��� ��� �κп� ������ ���� �Ǵ� �迭�� ���� �� ó���� ����
			String line = "";
			while((line=bf1.readLine())!=null) {
				System.out.println(line);
			}
			fr.close();
			fr1.close();
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}






