package br.com.chubbytech.passgen;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Console console = System.console();
        if (console == null) {
            System.out.println("Não foi possível abrir o console");
            System.exit(1);
        }

        console.printf("%n");
        console.printf("------------------------------------------------------------------------------------%n");
        console.printf("  Aplicação para criptografar senhas - Utilitário do NFe-sendmail - ChubbyTech%n");
        console.printf("------------------------------------------------------------------------------------%n");
        console.printf("%n");
        
        char passwordArray[] = console.readPassword("Entre com a senha a ser criptografada: ");
        
        try {
        	
			String encrypt = new EncryptDecrypt().encrypt(new String(passwordArray));
			console.printf("A senha criptografada é: %s%n", encrypt);
			System.exit(0);
			
		} catch (Exception e) {
			console.printf("Ocorreu um erro na tentativa de criptografar a senha");
			System.exit(2);
		}
    	
    }
}
