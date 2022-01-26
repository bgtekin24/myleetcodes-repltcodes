/*
Write a custom class TV that has 4 instance variables:

int channel=1, int volumeLevel=0, boolean on = false, String brand = "undefined".
Create one no arguments constructor that prints message: "Creating TV object using no args-constructor".

Also, create one more constructor that defines instance variable brand, and displays message:"Creating TV object using 1 arg - constructor".

Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.
Create isOn(), turnOn() and turnOff() methods for on instance variable. If tv is already on, no need to turn it on again, display message: "TV is already ON". If tv is already off, then no need to turn it off again, display message: "TV is already OFF".
Value of a variable channel cannot be negative or zero, and cannot be higher than 120. If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
Volume can only be in the range between 0 and 7. You may change volume only if TV is on. Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level". Use isOn() method that will check tv status.
*/


public class TV {
  int channel=1; 
  int volumeLevel=0; 
  boolean on = false; 
  String brand = "undefined";
  public TV () {
    System.out.println("Creating TV object using no args-constructor"); }
  public TV (String bf) {
    this.brand=bf;
    System.out.println("Creating TV object using 1 arg - constructor");   }
public int getVolumeLevel () {
   return volumeLevel; }
public void setVolumeLevel (int vol) {
   if (isOn(on)) {
     if (vol>0 && vol<7) {
       volumeLevel=vol;} else {
System.out.println("ERROR: TV is either OFF or invalid Volume level");   } }
        else {
System.out.println("ERROR: TV is either OFF or invalid Volume level");   } }
public int getChannel () {
  return channel;}
public void setChannel (int cha) {
  if (isOn(on)) {
  if (cha>=0 && cha<120) {
  channel=cha;
  }
  else {
    System.out.println("ERROR: TV is either OFF or invalid Channel");
  } } else {
    System.out.println("ERROR: TV is either OFF or invalid Channel");
  }  }
public String getBrand () {
return brand;   }
public void setBrand (String bra) {
brand=bra;   }
public void channelUp() {
  channel+=1; }
public void channelDown() {
  channel-=1; }
public void volumeUp() {
  volumeLevel+=1; }
public void volumeDown() {
  volumeLevel-=1; }
public boolean isOn(boolean on) {
 if (on) {
 return on;} else return false;}
public void turnOn() {
  if (on==true) {
  System.out.println("TV is already ON");}
  else {on=true;}}
public void turnOff() {
  if (on==false) {
  System.out.println("TV is already OFF");}
  else {on=false;} } }
