package com.ncepu.yun.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author:huangyunyi
 **/
@Data
public class User implements Serializable {
   public static final long serialVersionUID = -1L;

   private String username;
   private String accountName;
   private String description;
}
