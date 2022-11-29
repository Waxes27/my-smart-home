import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { generateWifiQRCode } from 'wifi-qr-code-generator';

@Component({
  selector: 'app-wifi',
  templateUrl: './wifi.component.html',
  styleUrls: ['./wifi.component.sass']
})
export class WifiComponent implements OnInit {
  data : any = '';


  constructor(private sanitizer: DomSanitizer) { }


  ngOnInit(): void {
    // var wifi = this.http.get(
    //   "http://localhost:8080/wifi"
    //   )
    //   console.log(wifi);

  }

  generateWifi(){
    this.data = generateWifiQRCode({
      ssid: 'Waxes27',
      password: 'test',
      encryption: 'WPA',
      hiddenSSID: false,
      outputFormat: { type: 'svg' }
    })


    return this.data['__zone_symbol__value'];
  }

}
