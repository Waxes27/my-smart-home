import os
import secrets
import string
from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import selenium.common.exceptions as exeption
import urllib
import wifi_qrcode_generator


PATH = "/home/waxes27/binaries/chromedriver"

browser = webdriver.Chrome(executable_path=PATH)

browser.get('http://192.168.0.1/')
def login():
    try:
        browser.find_element(By.ID,"txtPwd").send_keys("TBQ58VRR")
    except exeption.NoSuchElementException as e:
        sleep(2)
        browser.find_element(By.ID,"txtPwd").send_keys("TBQ58VRR")

    try:
        browser.find_element(By.ID,"btnLogin").click()
    except exeption.NoSuchElementException as e:
        print(e.msg)




def changePassword():
    password = ''.join(secrets.choice(string.ascii_uppercase + string.digits) for _ in range(63))
    print(password)
    try:
        browser.find_element(By.ID,"h_wifi_setting_btn").click()
    except exeption.NoSuchElementException as e:
        sleep(2)
        browser.find_element(By.ID,"h_wifi_setting_btn").click()
    try:
        browser.find_element(By.ID,"pass").clear()
        browser.find_element(By.ID,"pass").send_keys(password)
    except exeption.NoSuchElementException as e:
        sleep(2)
        browser.find_element(By.ID,"pass").clear()
        browser.find_element(By.ID,"pass").send_keys(password)
    return password
    

    

def apply(password):
    browser.find_element(By.ID,"ssid1_apply_5G").click()
    browser.find_element(By.ID,"yesbtn").click()
    sleep(5)
    os.system(f"nmcli dev wifi connect Waxes27 password {password}")

def generateWifiPass(password):
    wifi_qrcode_generator.wifi_qrcode('Waxes27', False, 'WPA', password).save("../frontend/wifi.png")



login()
password = changePassword()
apply(password)

sleep(20)
generateWifiPass(password)


