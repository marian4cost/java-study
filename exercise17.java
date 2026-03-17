public class exercise17 {
    public void main(String[] args){
        int[] values = {30, 50, 10, 40, 20};
        int menor = 1000;
        int maior = 0;

        int size = values.length;

        for(int i = 0; i < size; i++){
            if(values[i] <= menor){
                menor = values[i];
            }
            if(values[i] >= maior){
                maior = values[i];
            }
        }

        System.out.println("o menor é " + menor);
        System.out.println("o maior é " + maior);
    }
}
