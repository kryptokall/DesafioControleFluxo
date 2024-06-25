import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		sc.close();
	}
    
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        else {
            //realizar o for para imprimir os números com base na variável contagem
            int contagem = parametroDois - parametroUm;
            System.out.println();
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo a interação " + (i+1));
            }
        }
		    
	}
}