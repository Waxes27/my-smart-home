import os
import secrets
import string
from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import selenium.common.exceptions as exeption
import urllib


PATH = "/home/waxes27/binaries/chromedriver"

browser = webdriver.Chrome(executable_path=PATH)

browser.get('http://1.1.1.1/')
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
    password = ''.join(secrets.choice(string.ascii_uppercase + string.digits) for _ in range(64))
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
    
def downloadPicture():
    img = browser.find_element(By.XPATH,'//*[@id="frmSSID1_24G5G"]/div[3]/div/div[7]/div/img')
    src = img.get_attribute("src")
    browser.get(src)
    os.system(f"wget {src} -O password.png")
    
    

login()
changePassword()
downloadPicture()