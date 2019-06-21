package com.objis.formationtest.service;

import com.objis.formationtest.domaine.Person;
import com.objis.formationtest.dao.PersonDao;


public class PersonService
{
    private final PersonDao personDao;
    public PersonService( PersonDao personDao )
    {
        this.personDao = personDao;
    }
    public boolean update( Integer personId, String name )
    {
        Person person = personDao.fetchPerson( personId );
        if( person != null )
        {
            Person updatedPerson = new Person( person.getPersonID(), name );
            personDao.update( updatedPerson );
            return true;
        }
        else
        {
            return false;
        }
    }
}