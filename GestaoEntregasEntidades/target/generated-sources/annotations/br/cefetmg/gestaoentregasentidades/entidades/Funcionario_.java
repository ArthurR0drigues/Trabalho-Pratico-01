package br.cefetmg.gestaoentregasentidades.entidades;

import br.cefetmg.gestaoentregasentidades.entidades.Empresa;
import br.cefetmg.gestaoentregasentidades.entidades.Pedido;
import br.cefetmg.gestaoentregasentidades.entidades.Perfil;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-09T03:13:17", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile ListAttribute<Funcionario, Perfil> perfis;
    public static volatile SingularAttribute<Funcionario, String> senha;
    public static volatile SingularAttribute<Funcionario, String> telefone;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, Integer> id;
    public static volatile ListAttribute<Funcionario, Pedido> pedidos;
    public static volatile SingularAttribute<Funcionario, Empresa> empresa;

}