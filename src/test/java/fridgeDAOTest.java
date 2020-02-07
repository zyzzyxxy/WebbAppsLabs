/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johanericsson
 */

import model.entity.Fridge;
import model.dao.FridgeDAO;
import javax.ejb.EJB;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class fridgeDAOTest {
    @Deployment
	public static WebArchive createDeployment() {
		return ShrinkWrap.create(WebArchive.class)
			.addClasses(FridgeDAO.class, FridgeDAO.class)
			.addAsResource("META-INF/persistence.xml")
			.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	}

	@EJB
	private	FridgeDAO fridgeDAO;

	@Before
	public void init() {
		fridgeDAO.create(new Fridge("IFF780", "Renault Clio"));
		fridgeDAO.create(new Fridge("LTP520", "Volvo 760GT"));
		fridgeDAO.create(new Fridge("XOL345", "Isuzu Traga"));
	}

	@Test
	public void checkThatFindCarsMatchingNameMatchesCorrectly() {
		Assert.assertTrue(true); /* Some better condition */
	}
    
}
