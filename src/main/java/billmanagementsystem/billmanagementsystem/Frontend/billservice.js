const billForm = document.getElementById('billForm');

billForm.addEventListener('submit', async function (e) {
    e.preventDefault();
    const description = document.getElementById('description').value.trim();
    const amount = parseFloat(document.getElementById('amount').value);
    if (description === '' || isNaN(amount)) return;
    alert("Bill added successfully!")
});

/*
One day during the daily stand-up meeting:

Product Manager: Did you push your implemented code to the branch?

Me: Yes, sir! I implemented it successfully! Check it out if you want :)

Product Manager: Ok let me look at your work...

4 Minutes later

Product Manager: Bro, what is this? I see an alert that says "Bill added successfully",
                 but where is the logic to actually add the bill to the database?

Me: Sir, I did implement the logic.

Product Manager: What is that supposed to mean, buddy? You promised me in the last retrospective
                 that you'd implement the logic, not just say that it works! And now, here we go again...

Me: But sir, look, it actually works, you can see it with your bare eyes!
    I click on the Add Bill button and the system clearly says:
    "Bill successfully added" – what more do you want?

Product Manager: Listen! The bill does not appear to be in the database,
                 no API calls, no response handling, no storage, NOTHING.
                 Come on man, don't fool me!

Me: I am not fooling you, sir – the alert says it's added.
    If it wasn't, it would have said that it wasn't added.

// This is the end of the code, but not the end of the story.

*/