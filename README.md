For Exchange Server calendar sync

The Java source code got from following url. The original source code doesnot support directly in Android. So we add modifications to the source code to support in Android too. Since we used this library only for Calendar Sync, We dont know how it will work for other tasks like, email etc.

http://stackoverflow.com/questions/9203073/problems-using-the-ews-java-api-on-android

Add jars from LibsToadd folder to your android project for working.

Sample code taking the calendars is below.

ExchangeService service = new ExchangeService(); ExchangeCredentials credentials = new WebCredentials(email, password); service.setCredentials(credentials); service.setUrl(new URI("htttps://server url/EWS/Exchange.asmx")); FolderView view = new FolderView(10); PropertySet set = new PropertySet(BasePropertySet.IdOnly); set.add(FolderSchema.DisplayName); view.setPropertySet(set); SearchFilter searchFilter = new SearchFilter.IsGreaterThan(FolderSchema.TotalCount, 0); view.setTraversal(FolderTraversal.Deep); FindFoldersResults findFolderResults = service.findFolders(WellKnownFolderName.Root, searchFilter, view); for (Folder folder : findFolderResults) { if (folder instanceof CalendarFolder) { System.out.println("Calendar folder: " + folder.getDisplayName()); calendarNames.add(folder.getDisplayName() + "," + folder.getId()); } }
