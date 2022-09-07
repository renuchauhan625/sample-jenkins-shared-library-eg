#!/usr/bin/env groovy

def call(String name = 'default',String=dayOfWeek) {
  echo "Hello, ${name}. Today is ${dayOfWeek}"
}
