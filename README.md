# PhotositeDataAPI
API to get data on posts and users

Created by James Berthoud

# Endpoints
## /users  

  /total-likes/{user-id}  

  /total-comments/{user-id} 

  /total-interactions/{user-id}



  /most-liked-posts/{user-id}/top?=count={count}

  /most-commented-posts/{user-id}/top?=count={count}

  /most-interacted-posts/{user-id}/top?=count={count}



  /liked-by-most/{user-id}/top?=count={count}

  /commented-on-most/{user-id}/top?=count={count}

  /interacted-with/most//{user-id}/top?=count={count}


## /posts

  /total-likes/{post-id}

  /total-comments/{post-id}

  /total-interactions/{post-id}



  /most-liked

  /most-commented

  /most-interacted


## Note:

  1 interaction = 1 like or 1 comment on a post

  count defaults to 1


