class Darts {
    int score(double xOfDart, double yOfDart) {
    double distanceSquared = xOfDart * xOfDart + yOfDart * yOfDart;

    if (distanceSquared > 100) return 0;
    if (distanceSquared > 25)  return 1;
    if (distanceSquared > 1)   return 5;
    return 10;
}

}
