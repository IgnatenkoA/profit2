
Scenario: Forward to About

Given Starting from the Maine page
When Press about link to this page About
Then link to this page About

Scenario: Forward to Recipirs

When Press about link to this page Recipirs
Then link to this page Recipirs

Scenario: Create a Breakfast

Given Starting from the Menu page
When add Ukrainian Dishes
Then Breakfast is complit

Scenario: Check the structure of Japanese Recipes

Given Starting from the page Recipes
When open Japan cuisine and clic Pirojoks
Then Show Pirojoks Recipe

