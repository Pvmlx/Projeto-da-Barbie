/* Bug 1: validar o percentual
public double precoComDesconto(double preco, double percentual) {
    if (!(percentual >= 0 && percentual <= 100)) {
        throw new IllegalArgumentException(
                "Desconto deve estar entre 0 e 100, mas foi: " + percentual);
    }
    return preco - (preco * percentual / 100);
}

// Bug 2: o orçamento inclui o valor exato
public boolean cabeNoOrcamento(double preco) {
    return preco <= orcamento;
}

// Bug 3: gala é ACIMA de 200
public boolean ehDeGala(double preco) {
    return preco > 200.0;
}*/