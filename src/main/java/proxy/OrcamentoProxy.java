package icms.proxy;

import icms.modelo.Orcamento;
import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {
    private BigDecimal descontoCache = null;
    private Orcamento orcamento;

    public OrcamentoProxy(BigDecimal valorOrcamento, BigDecimal descontoOrcamento) {
        super(valorOrcamento, descontoOrcamento);
        this.orcamento = new Orcamento(valorOrcamento, descontoOrcamento);
    }

    @Override
    public BigDecimal getDescontoOrcamento() {
        if (descontoCache == null) {
            System.out.println("Buscando desconto do banco de dados...");
            this.descontoCache = orcamento.getDescontoOrcamento();
        } else {
            System.out.println("Usando desconto em cache!");
        }
        return this.descontoCache;
    }
}
