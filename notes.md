Working Directory → Staging Area → Repository

git add . -> add the changes to the Staging area
git commit -m -> it permanately save the new changes and also add a message of the changes which have been done;
 git push -> it backs up the saved changes into Githud

 git commit -a -m -> if combines both git add . and git commit -m make it much faster and easy
 rember that git commit -a is not a replacement for git add . 

 git status-> it tells you what is happening  in your project right now
 What files are changed
What files are staged
What files are untracked
What branch you are on

git log -> What happened in this project before?(the commit that occured , when and how did them)

git pull -> get the latest chnajes that where made


// the Stating process 
-> get the repo from your repository using git clone https://github.com/username/my-project.git
->This download the files and all its commits intp local repo in a folder my-project
******git push -u origin main*****
-> git push sends your local commits to the  repository(online)
->origin this is just the nickname given to the online repository
-> main is the branch your push your commits in
-> -u i tell git to always remember the connection between local repo and the origin main hence no need to use(git push origin main ot git pull origin main) we will just use git push and git pull


