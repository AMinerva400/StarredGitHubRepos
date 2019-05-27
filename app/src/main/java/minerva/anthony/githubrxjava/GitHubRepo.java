package minerva.anthony.githubrxjava;

public class GitHubRepo {
    public final int id;
    public final String name;
    public final String htmlUrl;
    public final String description;
    public final String language;
    public final int stargazersCount;

    public GitHubRepo(int id, String name, String htmlUrl, String desc, String lang, int star){
        this.id = id;
        this.name = name;
        this.htmlUrl = htmlUrl;
        this.description = desc;
        this.language = lang;
        this.stargazersCount = star;
    }
}
