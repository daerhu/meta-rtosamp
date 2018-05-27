ifconfig wlan0 up
wpa_supplicant -d -D nl80211 -c /etc/wpa_supplicant.conf -i wlan0 -B
dhclient wlan0
