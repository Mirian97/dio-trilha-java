package dio.spring_boot.app.beans_vs_components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

/*
 * Se torna um @Component quando criamos a classse
 */
@Component
public class ConversorJson {
    /*
     * Aqui, o Spring injeta automaticamente uma instância da classe Gson no campo gson. 
     * Essa injeção acontece por meio da anotação @Autowired.
     */
    @Autowired
    private Gson gson;

    public ViaCepResponse convert(String json){
        return gson.fromJson(json, ViaCepResponse.class);
    }
}
