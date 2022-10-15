public class CalculadoraCasoDeUso {
    public double calcular(int a, String inicio, String fim){
        double resultado = 0;

        if("Kelvin".equals(inicio) && "Celsius".equals(fim)){
            resultado = a - 273;
        }else  if("Kelvin".equals(inicio) && "Fahrenheit".equals(fim)){
            resultado = (a - 273) * 1.8 + 32;
        }else if("Celsius".equals(inicio) && "Kelvin".equals(fim)){
            resultado = a + 273;
        }else if("Celsius".equals(inicio) && "Fahrenheit".equals(fim)){
            resultado = a * 1.8 + 32;
        }else if("Fahrenheit".equals(inicio) && "Celsius".equals(fim)){
            resultado = (a-32)/1.8;
        }else if("Fahrenheit".equals(inicio) && "Kelvin".equals(fim)) {
            resultado = (a - 32) * 5 / 9 + 273;
        }


        return resultado;
    }

}
