package blog.simpleFactory;

public class OperationDiv implements Operation {

    @Override
    public Double getResult(Double number_1, Double number_2) {
        if (number_2 != 0) {
            return number_1 / number_2;
        }
        return 0.0;
    }
}