package mnRegistraduria;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

public class EncriptacionSocial {

    public String encriptacion(String ingreso) {
        String encriptacion = "";

        try {
            MessageDigest x = MessageDigest.getInstance("MD5");
            byte[] llave = x.digest(ingreso.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llave, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);

            byte[] samuel = ingreso.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(samuel);
            byte[] sa = Base64.encodeBase64(buf);
            encriptacion = new String(sa);
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            JOptionPane.showMessageDialog(null, "algo salio mal"+e);
        }

        return encriptacion;
    }

    
    

}
