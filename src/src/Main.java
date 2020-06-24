public class Main {

    public static void main(String[] args)
    {
        GFG quest = new GFG();
        int[][] adj = {{0, 82, 34, 90}, {32, 0, 46, 17}, {85, 32, 0, 35}, {37, 65, 76, 0}};

        GFG.TSP(adj);

        System.out.printf("Стоимость : %d\n", GFG.final_res);
        System.out.print("Путь : ");
        for (int i = 0; i <= GFG.N; i++){
            System.out.print(GFG.final_path[i]+1);
            if (i != GFG.N)
                System.out.print(" → ");
        }

    }
}
