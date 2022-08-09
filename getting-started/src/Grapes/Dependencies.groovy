@Grapes(
        @Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.4')
)

/* quando formos executar isso ele sera baixado para nos */

import org.apache.commons.lang3.text.WordUtils

String name = "Daniel Anthony"
WordUtils wordUtils =   new WordUtils()

println wordUtils.initals(name) //imprime somente as iniciais: DA
