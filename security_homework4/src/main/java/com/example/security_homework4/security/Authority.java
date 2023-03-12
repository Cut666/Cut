package com.example.security_homework4.security;

public class Authority {
 private String name;
 private boolean canRead;
 private boolean canUpdate;
 private boolean canDelete;

 public Authority(String name, boolean canRead, boolean canUpdate, boolean canDelete) {
  this.name = name;
  this.canRead = canRead;
  this.canUpdate = canUpdate;
  this.canDelete = canDelete;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public boolean canRead() {
  return canRead;
 }

 public void setCanRead(boolean canRead) {
  this.canRead = canRead;
 }

 public boolean canUpdate() {
  return canUpdate;
 }

 public void setCanUpdate(boolean canUpdate) {
  this.canUpdate = canUpdate;
 }

 public boolean canDelete() {
  return canDelete;
 }

 public void setCanDelete(boolean canDelete) {
  this.canDelete = canDelete;
 }
}
