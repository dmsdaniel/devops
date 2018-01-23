package MeusForms;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daniel
 */
public class Parametros {

    String ip;
    String senhaservidor;
    String cliente;
    String senhagestor;
    String unikey;
    String usuario;
    String smb;
    String usrgestor;
    
    public Parametros buscaParametros() {
        Properties prop = new Properties();
        InputStream input = null;
        try {

            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            this.setSenhaservidor(prop.getProperty("senha servidor"));
            this.setCliente(prop.getProperty("cliente"));
            this.senhagestor = prop.getProperty("senha gestor");
            this.unikey = prop.getProperty("unikey");
            this.ip = prop.getProperty("ip");
            this.usuario = prop.getProperty("dbuser");
            this.smb = prop.getProperty("pasta warewin");
            this.usrgestor = prop.getProperty("usuario gestor");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return this;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSenhaservidor() {
        return senhaservidor;
    }

    public void setSenhaservidor(String senhaservidor) {
        this.senhaservidor = senhaservidor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getSenhagestor() {
        return senhagestor;
    }

    public void setSenhagestor(String senhagestor) {
        this.senhagestor = senhagestor;
    }

    public String getUnikey() {
        return unikey;
    }

    public void setUnikey(String unikey) {
        this.unikey = unikey;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSmb() {
        return smb;
    }

    public void setSmb(String smb) {
        this.smb = smb;
    }

    public String getUsrgestor() {
        return usrgestor;
    }

    public void setUsrgestor(String usrgestor) {
        this.usrgestor = usrgestor;
    }

}
