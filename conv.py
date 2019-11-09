def ip_decode(ip):
    ip=int(ip)
    decode=[]
    final=''
    if ip==0:
        decode.insert(0,'0')
    else:
        while ip!=0:
            if int(ip) % 2 !=0:
                decode.insert(0,'1')
            else:
                decode.insert(0,'0')
            ip=int(ip/2)
    while len(decode) !=8:
        decode.insert(0,'0')
    for n in decode:
        final+=n
    return final

def codo(ip):
    partes=[]
    ip = ip
    final_ip=''
    ip = list(ip)
    numero=''
    for caracter in ip:
        if caracter != '.':
            numero+=caracter
        else:
            partes.append(numero)
            numero=''
    partes.append(numero)
    for cosa in partes:
        final_ip+=ip_decode(cosa)

    print(final_ip)

codo("192.254.1.28")
codo("192.254.1.33")
codo("192.254.1.100")