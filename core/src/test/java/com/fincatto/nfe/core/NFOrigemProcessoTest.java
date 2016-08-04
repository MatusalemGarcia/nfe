package com.fincatto.nfe.core;

import org.junit.Assert;
import org.junit.Test;

public class NFOrigemProcessoTest {

    @Test
    public void deveRepresentarOCodigoCorretamente() {
        Assert.assertEquals("0", NFOrigemProcesso.SEFAZ.getCodigo());
        Assert.assertEquals("1", NFOrigemProcesso.JUSTICA_FEDERAL.getCodigo());
        Assert.assertEquals("2", NFOrigemProcesso.JUSTICA_ESTADUAL.getCodigo());
        Assert.assertEquals("3", NFOrigemProcesso.SECEX_RFB.getCodigo());
    }
}