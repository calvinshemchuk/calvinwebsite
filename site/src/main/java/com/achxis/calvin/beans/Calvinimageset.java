package com.achxis.calvin.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "calvinwebsite:calvinimageset")
@Node(jcrType = "calvinwebsite:calvinimageset")
public class Calvinimageset extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "calvinwebsite:banner")
    public HippoGalleryImageBean getBanner() {
        return getBean("calvinwebsite:banner", HippoGalleryImageBean.class);
    }
}
