EWS-For-Android
===============

For Exchange Server calendar sync

This library used only for Exchange calendar sync. Dont know whether it will work perfectly for Exchange mail . The source code got from following url

http://stackoverflow.com/questions/9203073/problems-using-the-ews-java-api-on-android

Add jars from LibsToadd folder to your android project for working.

Source code for the above is in EWS Android folder


Sample  code

ExchangeService service = new ExchangeService();
ExchangeCredentials credentials = new WebCredentials(email, password);
service.setCredentials(credentials);
service.setUrl(new URI("htttps://server url/EWS/Exchange.asmx"));
FolderView view = new FolderView(10);
PropertySet set = new PropertySet(BasePropertySet.IdOnly);
set.add(FolderSchema.DisplayName);
view.setPropertySet(set);
SearchFilter searchFilter = new SearchFilter.IsGreaterThan(FolderSchema.TotalCount, 0);
view.setTraversal(FolderTraversal.Deep);
FindFoldersResults findFolderResults = service.findFolders(WellKnownFolderName.Root, searchFilter, view);
for (Folder folder : findFolderResults) {
if (folder instanceof CalendarFolder) {
System.out.println("Calendar folder: " + folder.getDisplayName());
calendarNames.add(folder.getDisplayName() + "," + folder.getId());
}
}


