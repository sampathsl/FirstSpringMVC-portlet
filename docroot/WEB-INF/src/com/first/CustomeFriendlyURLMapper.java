package com.first;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;

public class CustomeFriendlyURLMapper extends DefaultFriendlyURLMapper{

	@Override
	public boolean isCheckMappingWithPrefix() {
		return false;
	}
	
}