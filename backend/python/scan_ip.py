import subprocess
import threading


def ip(i):
    ip = subprocess.getoutput(f"ping -c 1 192.168.0.{i}")
    if "64 bytes from" in ip:
        print(ip.splitlines()[0].split()[1])
        subprocess.getoutput(f"{ip} >> .ip")
    
    
    
for i in range(255):
    threading.Thread(target=ip,args=(i,)).start()
    