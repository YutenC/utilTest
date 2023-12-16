package org.example.MenuId;

import java.util.List;

public class DeleteMenuId {

    public static final String usMenuItemLabel = "DELETE FROM TCG_ADMIN.US_MENU_ITEM_LABEL WHERE API_ID = ";
    public static final String getUsMenuItem = "DELETE FROM TCG_ADMIN.US_MENU_ITEM WHERE MENU_ID = ";
    public static final String usMenuItemAux = "DELETE FROM TCG_ADMIN.US_MENU_ITEM_AUX WHERE MENU_ID = ";
    public static final String usMenuCategoryMenu = "DELETE FROM TCG_ADMIN.US_MENU_CATEGORY_MENU WHERE MENU_ID = ";
    public static final String usRoleMenuPermission = "DELETE FROM TCG_ADMIN.US_ROLE_MENU_PERMISSION WHERE MENU_ID = ";
    public static final String systemHelper = "DELETE FROM TCG_ADMIN.SYSTEM_HELPER WHERE HELPER_MENU_ID = ";
    public static final String tacRelay = "DELETE FROM TCG_ADMIN.TAC_RELAY WHERE MENU_ID = ";
    public static final String systemHelperClickHistory = "DELETE FROM TCG_ADMIN.SYSTEM_HELPER_CLICK_HISTORY WHERE HELPER_MENU_ID = ";
    public static final String systemHelperTemp = "DELETE FROM TCG_ADMIN.SYSTEM_HELPER_TEMP WHERE HELPER_MENU_ID = ";
    public static final String semicolon = ";";

    public static void getDeleteStatement(String menuId) {
        System.out.println(usMenuItemLabel + menuId + semicolon);
        System.out.println(getUsMenuItem + menuId + semicolon);
        System.out.println(usMenuItemAux + menuId + semicolon);
        System.out.println(usMenuCategoryMenu + menuId + semicolon);
        System.out.println(usRoleMenuPermission + menuId + semicolon);
        System.out.println(systemHelper + menuId + semicolon);
        System.out.println(tacRelay + menuId + semicolon);
        System.out.println(systemHelperClickHistory + menuId + semicolon);
        System.out.println(systemHelperTemp + menuId + semicolon);
        System.out.println();
    }

    public static void getDeleteStatements(List<String> menuIdList) {
        for (String menuId : menuIdList) {
            getDeleteStatement(menuId);
        }
    }
}
