
package com.karaca.jsf2internationalization;

import java.io.Serializable;
import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LanguageBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Locale locale = FacesContext.getCurrentInstance()
                                        .getViewRoot().getLocale();

    /**
     * @return the locale
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * @param locale the locale to set
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void switchLanguages(String language){
        
        switch (language){
            case "tr":
                locale = new Locale("tr");
                break;
            default:
                locale = new Locale("en");
                break;
        }
        
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }
    
}

