package calc;

public class Calculadora {
	
	private String operacao;
	private Operations op;
	private int resultado;
	
	public Calculadora(String operacao, int numero1, int numero2){
		this.operacao = operacao;
		op = new Operations(numero1, numero2);
		
	}
	
	public Calculadora(String operacao, int numero1){
		this.operacao = operacao;
		op = new Operations(numero1);
		
	}
	
	
	public int getResultado(){
	
	switch (operacao) {
    case "add": resultado = op.add();
        break;
    case "sub": resultado = op.sub();
        break;
    case "mul": resultado = op.mul();
        break;
    case "div": resultado = op.div();
        break;
    case "mod": resultado = op.mod();
        break;
    case "neg": resultado = op.neg();
        break;
    case "lt": resultado = op.lessThan();
        break;
    case "gt": resultado = op.greaterThan();
        break;
}
	return resultado;
}

}
