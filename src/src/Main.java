public class Main {

    public static void main(String[] args)
    {
        GFG quest = new GFG();
        int[][] adj = {{0, 20, 42, 35}, {20, 0, 30, 34}, {42, 30, 0, 12}, {35, 34, 12, 0}};

        GFG.TSP(adj);

        System.out.printf("Стоимость : %d\n", GFG.final_res);
        System.out.print("Путь : ");
        for (int i = 0; i <= GFG.N; i++){
            System.out.print(GFG.final_path[i]);
            if (i!= GFG.N)
                System.out.print(" → ");
        }

    }
}
