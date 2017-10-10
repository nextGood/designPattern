package blog.simpleFactory;

public class OperationAdd implements Operation {

    @Override
    public Double getResult(Double number_1, Double number_2) {
        return number_1 + number_2;
    }
}