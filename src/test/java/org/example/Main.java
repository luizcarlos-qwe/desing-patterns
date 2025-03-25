package icms;

import icms.modelo.Orcamento;
import icms.proxy.OrcamentoProxy;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sem Proxy (demora a cada chamada):");
        Orcamento orcamentoNormal = new Orcamento(new BigDecimal("1000"), new BigDecimal("50"));
        System.out.println("Primeira chamada: " + orcamentoNormal.getDescontoOrcamento());
        System.out.println("Segunda chamada: " + orcamentoNormal.getDescontoOrcamento());

        System.out.println("\nCom Proxy (demora só na primeira vez):");
        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(new BigDecimal("1000"), new BigDecimal("50"));
        System.out.println("Primeira chamada: " + orcamentoProxy.getDescontoOrcamento());
        System.out.println("Segunda chamada: " + orcamentoProxy.getDescontoOrcamento());
    }
}
