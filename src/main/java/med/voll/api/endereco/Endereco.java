package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medico.DadosAtualizarMedico;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.paciente.DadosCadastrarPaciente;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;
    private String numero;
    private String uf;

    public Endereco(DadosCadastroMedico dados) {
        this.logradouro = dados.endereco().logradouro();
        this.bairro = dados.endereco().bairro();
        this.cep = dados.endereco().cep();
        this.cidade = dados.endereco().cidade();
        this.complemento = dados.endereco().complemento();
        this.numero = dados.endereco().numero();
        this.uf = dados.endereco().uf();
    }

    public Endereco(DadosCadastrarPaciente dados) {
        this.logradouro = dados.endereco().logradouro();
        this.bairro = dados.endereco().bairro();
        this.cep = dados.endereco().cep();
        this.cidade = dados.endereco().cidade();
        this.complemento = dados.endereco().complemento();
        this.numero = dados.endereco().numero();
        this.uf = dados.endereco().uf();
    }

    public void atualizarEndereco(DadosEndereco dados) {
        if(dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if(dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if(dados.cep() != null){
            this.cep = dados.cep();
        }
        if(dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if(dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if(dados.numero() != null){
            this.numero = dados.numero();
        }
        if(dados.uf() != null){
            this.uf = dados.uf();
        }
    }

}
