import java.util.Scanner;

public class AreaFigurasGeometricas{
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        System.out.println("Este programa realiza o cálculo da área figura geométrica, de acordo com a figura escolhida!");
        System.out.println("Essas são as figuras disponíveis para calcular:");
        System.out.println();
        System.out.println("1-Triângulo(Fórmula Geral");
        System.out.println("2-Triângulo Retângulo");
        System.out.println("3-Triangulo Equilátero");
        System.out.println("4-Triângulo(Dado um Ângulo)");
        System.out.println("5-Paralelogramo");
        System.out.println("6-Retângulo");
        System.out.println("7-Losango");
        System.out.println("8-Quadrado");
        System.out.println("9-Trapézio");
        System.out.println("10-Círculo");
        System.out.println();
        System.out.print("Qual a figura selecionada: ");
        byte fig = entradas.nextByte();

        switch (fig) {
            case 1 :
                System.out.println("Triângulo(Fórmula Geral):");
                System.out.print("Digite a base: ");
                float base1 = entradas.nextFloat();
                System.out.print("Digite a altura: ");
                float altura1 = entradas.nextFloat();
                float area1 = (base1*altura1)/2;
                System.out.println("A área da figura selecionada é: "+area1);
                break;
            case 2 :
                System.out.println("Triângulo Retângulo:");
                System.out.print("Digite o primeiro cateto: ");
                float cateto1 = entradas.nextFloat();
                System.out.print("Digite o segundo cateto: ");
                float cateto2 = entradas.nextFloat();
                float area2 = (cateto1*cateto2)/2;
                System.out.println("A área da figura selecionada é: "+area2);
                break;
            case 3 :
                System.out.println("Triângulo Equilátero:");
                System.out.print("Digite o lado: ");
                float lado1 = entradas.nextFloat();
                float area3 = (float) (((lado1*lado1)*1.73)/4);
                System.out.println("A área da figura selecionada é: "+area3);
                break;
            case 4 :
                System.out.println("Triângulo(Dado um âbgulo):");
                System.out.print("Digite o primeiro lado: ");
                float ladot1 = entradas.nextFloat();
                System.out.print("Digite o segundo lado: ");
                float ladot2 = entradas.nextFloat();
                System.out.print("Digite o valor do seno: ");
                float seno = entradas.nextFloat();
                float area4 = (ladot1*ladot2*seno)/2;
                System.out.println("A área da figura selecionada é: "+area4);
                break;
            case 5 :
                System.out.println("Paralelogramo:");
                System.out.print("Digite a base: ");
                float base2 = entradas.nextFloat();
                System.out.print("Digite a altura: ");
                float altura2 = entradas.nextFloat();
                float area5 = base2*altura2;
                System.out.println("A área da figura selecionada é: "+area5);
                break;
            case 6 :
                System.out.println("Retângulo:");
                System.out.print("Digite a base: ");
                float base3 = entradas.nextFloat();
                System.out.print("Digite a altura: ");
                float altura3 = entradas.nextFloat();
                float area6 = base3*altura3;
                System.out.println("A área da figura selecionada é: "+area6);
                break;
            case 7 :
                System.out.println("Losango:");
                System.out.print("Digite a diagonal maior: ");
                float diagonalM1 = entradas.nextFloat();
                System.out.print("Digite a diagonal menor: ");
                float diagonalm1 = entradas.nextFloat();
                float area7 = (diagonalM1*diagonalm1)/2;
                System.out.println("A área da figura selecionada é: "+area7);
                break;
            case 8 :
                System.out.println("Quadrado:");
                System.out.print("Digite o lado: ");
                float lado2 = entradas.nextFloat();
                float area8 = lado2*lado2;
                System.out.println("A área da figura selecionada é: "+area8);
                break;
            case 9 :
                System.out.println("Trapézio:");
                System.out.print("Digite a base maior: ");
                float baseM1 = entradas.nextFloat();
                System.out.print("Digite a base menor: ");
                float basem1 = entradas.nextFloat();
                System.out.print("Digite a altura: ");
                float altura4 = entradas.nextFloat();
                float area9 = ((baseM1+basem1)*altura4)/2;
                System.out.println("A área da figura selecionada é: "+area9);
                break;
            case 10 :
                System.out.println("Círculo:");
                System.out.print("Digite o raio: ");
                float raio = entradas.nextFloat();
                float area10 = (float) (3.14*(raio*raio));
                System.out.println("A área da figura selecionada é: "+area10);
                break;
            default:
                System.out.println("Opção Inválida!");

        }

    }
}