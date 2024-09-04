result1=$(curl -X GET --header "Accept: */*" "http://127.0.0.1:56858/hello")
result2=$(curl -X GET --header "Accept: */*" "http://127.0.0.1:56862/world")

echo "Response from server"
echo "$result1 $result2"
exit