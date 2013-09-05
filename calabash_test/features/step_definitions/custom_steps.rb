require 'calabash-android/calabash_steps'

When (/^I touch "(.*?)"$/) do |buttonText|
	macro %[I press "#{buttonText}"]
end

When (/^I enter text "(.*?)" into field with hint "(.*?)"$/) do |textValue, hintValue|
	# Let's get the ID that belongs to the edit text that contains our specified hint text
	view_id = query("edittext hint:'"+hintValue+"'")[0]['id']
	
	if view_id
		performAction('enter_text_into_id_field', textValue, view_id)
	else
		raise "No input field containing the hint text 'hintValue' was found"
	end

end