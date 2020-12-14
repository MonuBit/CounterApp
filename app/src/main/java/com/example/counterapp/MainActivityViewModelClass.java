package com.example.counterapp;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModelClass extends ViewModel {
    private int number = 0;
  public int DecreaseValue() {
     return number--;
  }

  public int IncreaseValue() {
   return    number++;
  }

  public int Current(){
      return number;
  }
}

