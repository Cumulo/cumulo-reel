
{} (:host |cumulo.org)
  :uploads $ []
    {} (:from |dist/*) (:to |/web-assets/cdn/cumulo-reel/)
    {} (:from |dist/{index.html,manifest.json}) (:to |/web-assets/repo/Cumulo/cumulo-reel/)
    {} (:from |dist/{server.js,package.json}) (:to |/servers/cumulo-reel/)
