public class App {
    public static void main(String[] args) throws Exception {
        //criando array multidimensional
        /*Formas de cria-lo */
        int [] [] tabela;
        int [][] cubo[];
        int [][] hipercubo[][];

        tabela = new int[10][5];
        cubo = new int[10][][];

        int [][] teste = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
                                   //0 //123
                                   //1 //456
                                   //2 //789

        System.out.println(teste[0][1]);  


        int[][] estranho = new int[2][];
        estranho[0] = new int[20]; //primeira linha do meu array tem 19 colunas
        estranho[1] = new int[10]; //segunda linha do meu array tem 9 colunas

        //percorrendo o array
        for(int i =0; i < estranho.length; i++){
            System.out.println(estranho[i].length); //imprime 20 e 10
        }
    }
}
