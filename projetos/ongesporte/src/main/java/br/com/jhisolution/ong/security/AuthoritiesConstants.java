package br.com.jhisolution.ong.security;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

	public static final String DIRETOR   = "ROLE_DIRETOR";
	
	public static final String SUP_ADMIN = "ROLE_SUP_ADMIN";
	
	public static final String SUP_PROF  = "ROLE_SUP_PROF";
	
	public static final String SUP_FUNC  = "ROLE_SUP_FUNC";
	
	public static final String PROFESSOR = "ROLE_PROF";
	
	public static final String FUNCIONARIO = "ROLE_FUNC";
	
	public static final String ADMINISTRATIVO = "ROLE_ADMINIST";
	
	public static final String ALUNO = "ROLE_ALUNO";
	
    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";

    private AuthoritiesConstants() {
    }
}
