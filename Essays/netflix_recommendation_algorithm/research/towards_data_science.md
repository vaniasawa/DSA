# Research

## [Deep Dive into Netflix's Recommender System](https://towardsdatascience.com/deep-dive-into-netflixs-recommender-system-341806ae3b48)

2000: Netflix introduced personalised movie recommendations

2006: Launch of **Netflix Prize**, a ML and data mining competition with a $1M prize money.

- Originally a regression problem predicting ratings for movies
- Netflix used *Cinematch*, a proprietary recommender system which had a RMSE of 0.9525, and challenged people to beat this benchmark by 10%
- In 2005, the winner of the Prize used a linear combination of SVD + RBM, achieving a RMSE of 0.88. Put into production.
- Company did not put algorithms with lower RMSE into product, due to scaling engineering efforts. Positive correlation between model improvements and engineering efforts.
- Introduced streaming in 2007 - Huge volume of data surge.

2020: Rating -> Ranking problem -> Page-generation problem -> Problem maximizing user experience (Maximizing number of hours streamed)

### Netflix as a Business
- Subscription-based model
- Revenue is a function of -
    - Acquisition rate of new users
    - Churn rate
    - Rate at which former members rejoined
- 80% stream time is achieved through Netflix's recommender system
- Creatin a user experience that will improve retention rate, translating to savings on customer acquisition ($1B per year as of 2016)

### Recommender System
- Two-tier row-based ranking system -
    - Within a row (strongest recommendations left to right)
        - Up to 75 items (Subject to device)
    - Across rows (strongest recommendation top to bottom)
        - Each row highlights a theme (generated using an algorithm)
        - Up to 40 rows (Subject to device)

### Algorithms

#### Personalised Video Rankings (PVR)

- Given a category (Drama, Crime etc), filter the catalog to that category and provide user recommendations, with side features including user features and popularity

#### Top-N Video Ranker

- Top Picks for Vani - Based on multiple categories
- Similar to PVR, but look at the heads of the rankings and look across all categories across the catalog - Optimised using metrics that look at the head of the catalog rankings (MAP@K, NDCG)

#### Trending Now Ranker

- Capture temporal trends which Netflix deduce to be a strong predictor, are short term and can range from a few minutes to a few days
- Typically -
    - Events that have a seasonal trend and repeat themselves (Valentines Day, Christmas)
    - One-off, short-term trends (Covid, Presidential Election 2020 etc)

#### Continue Watching Ranker

- Items that the member has consumed but not completed
    - Episodic content
    - Non-episodic content (movies, Black Mirror)
- Look at context-aware signals (Time elapsed since viewing, Point of abandonment, Device watched on etc)
- RNNs - Time Sensitive Sequence Prediction (Justin Basilico)

#### Video-Video similarity ranker

- Because you watched X
- Content-based filtering algorithm
- Compute other similar items and return the most similar ones

#### Row Generation Process
- Consider PVR looking at Suspense category
- Algorithm collects Evidence to support the presentation of a row - Previously watched suspense movies by the user, predicted star rating, synopsis, awards, cast, other metadata, thumbnail image

### Page Generation Process
- Which rows to display for a user, based on the 10K ranked rows created for a user?
- Originally - template based approach, based on specific rules
    - Hardware capabilities
    - Device Surface Area
    - What the users want to watch in a session
    - What the user has already watched in previous sessions and wants to resume
    - Fresh content based on trends in the geo

#### Row-Based approach

#### Stage-Wise approach

#### Machine Learning approach



