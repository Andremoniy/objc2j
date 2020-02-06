import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import ru.andremoniy.objctojavacnv.Converter;
import ru.andremoniy.objctojavacnv.context.ProjectContext;

import java.io.IOException;

/**
 * User: Andremoniy
 * Date: 12.06.12
 * Time: 1:49
 */
public class TestConverter {

    @Test
    public void convert() throws IOException, RecognitionException {
        new Converter().convert("C:\\Work\\igor\\dia\\diagrammix2\\src\\", false);
    }

    @Test
    public void convertSDK() throws IOException, RecognitionException {
        ProjectContext pj = new Converter().convert("C:\\Work\\JavaCocoa\\src\\", true); // true - skip SDK
        pj.dump();
    }

}
