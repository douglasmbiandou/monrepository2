package com.objis.formationtest.dao;

import com.objis.formationtest.domaine.Person ;

public interface PersonDao
{
    public Person fetchPerson( Integer personID );
    public void update( Person person );
}