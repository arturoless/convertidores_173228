function ip_decode(ip){
    var ip=parseInt(ip)
    var decode=[]
    var final=''
    if (ip==0){
        decode.unshift('0')
    }
    else{
        while (ip!=0){
            if (parseInt(ip) % 2 !=0){
                decode.unshift('1')
            } 
            else{
                decode.unshift('0')
            } 
            ip=parseInt(ip/2)
        }
    }
    while (decode.length !=8){
        decode.unshift('0')
    }
    decode.forEach(n => {
        final+=n
    });
    return final
}


function codo(ip){
    var partes=[]
    var final_ip=''
    var ip = ip.split('')
    var numero=''
    ip.forEach(caracter => {
        if (caracter != '.')
            numero+=caracter
        else{
            partes.push(numero)
            numero=''
        }
    });
    partes.push(numero);
    partes.forEach(cosa => {
        final_ip+=ip_decode(cosa)
    });
    console.log(final_ip)
}
codo("192.254.1.26")
codo("192.234.1.33")
codo("192.254.1.100")