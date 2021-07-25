package com.example.selenideFw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ModuleAccess {
  private String name;
  private List<SubModule> subModules;
}
