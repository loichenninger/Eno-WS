package fr.insee.eno.ws.transform ;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import fr.insee.eno.utils.Xpath2VTLParser;

public class TestXpath2VTLParser {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestXpath2VTLParser.class);

    @Test
    public void parseToVTL(){
        String xpath = "concat(A,B,C)";
        String expectedVTL = "A || B || C";
        String vtl = Xpath2VTLParser.parseToVTL(xpath);
        LOGGER.info("Xpath parse to " + vtl);
        Assert.assertEquals(expectedVTL,vtl);
    }



}
