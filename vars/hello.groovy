#!/usr/bin/env groovy
//String name = 'default',String dayOfWeek
def call(Map config=[:]) {
  echo "Hello, ${config.name}. Today is ${config.dayOfWeek}"
}
