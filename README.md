# PhotositeDataAPI
API to get data on posts and users

Created by James Berthoud

# Endpoints
## /users  

  /total-likes/{username}  

  /total-comments/{username} 

  /total-interactions/{username}



  /most-liked-posts/{username}?count={count}

  /most-commented-posts/{username}?count={count}

  /most-interacted-posts/{username}?count={count}



  /liked-by-most/{username}?count={count}

  /commented-on-most/{username}?count={count}

  /interacted-with-most/{username}?count={count}


## /posts

  /total-likes/{post_id}

  /total-comments/{post_id}

  /total-interactions/{post_id}



  /most-liked?count={count}

  /most-commented?count={count}

  /most-interacted?count={count}


## Note:

  1 interaction = 1 like or 1 comment on a post

  count defaults to 1


