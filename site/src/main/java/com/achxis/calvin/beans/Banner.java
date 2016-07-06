package com.achxis.calvin.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import com.achxis.calvin.beans.Calvinimageset;

@HippoEssentialsGenerated(internalName = "calvinwebsite:bannerdocument")
@Node(jcrType = "calvinwebsite:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "calvinwebsite:title")
    public String getTitle() {
        return getProperty("calvinwebsite:title");
    }

    @HippoEssentialsGenerated(internalName = "calvinwebsite:content")
    public HippoHtml getContent() {
        return getHippoHtml("calvinwebsite:content");
    }

    @HippoEssentialsGenerated(internalName = "calvinwebsite:link")
    public HippoBean getLink() {
        return getLinkedBean("calvinwebsite:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "calvinwebsite:image")
    public Calvinimageset getImage() {
        return getLinkedBean("calvinwebsite:image", Calvinimageset.class);
    }
}
