package bot.discord.dbsk;

import discord.Discord;

public class App 
{
	//Declare the variable discord, making it static so we can use it in other methods.
	static Discord discord;
	
    public static void main( String[] args ){
    	
    	/* Replace TOKEN in line 26 with your Discord Bot's token. You can get a token by following these steps:
    	 * 
    	 * PREREQUISITES:
    	 * -You must have a Discord account.
    	 * 
    	 * INSTRUCTIONS:
    	 * 1. Go to the website: https://discordapp.com/developers/applications/
    	 * 2. Go to the Applications tab on the top of the page and click 'Create an application'
    	 * 3. Customise your application, then go to the Bot section by clicking on 'Bot' on the menu on the left
    	 * 4. Click 'Add Bot' and confirm by clicking 'Yes, do it!'
    	 * 5. Click 'Copy' under where it says 'Click to Reveal Token' 
    	 * */
    	
    	//Initialise the Discord Bot with your token.
    	discord = new Discord("TOKEN");
		
    	//Set name
    	discord.setName("Discord Bot Starter Kit");
    	
		//Send a message.
		discord.sendMessage(discord.getStatusMessage());
    }
}
