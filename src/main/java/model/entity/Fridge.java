/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author johanericsson
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Fridge implements Serializable{
    	@Id private String license;
	private String name;
        
}
