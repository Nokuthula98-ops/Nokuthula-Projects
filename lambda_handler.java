import json
import urllib.parse
import boto3

def lambda_handler(event, context):
        //Get the S3 bucket and object key from the event
        s3 = boto3.client('s3')
        for record in event['Records']:
        bucket = record['s3']['bucket']['name']
        key = urllib.parse.unquote_plus(record['s3']['object']['key'])
        print(f"Object {key} was uploaded to bucket {bucket}")
        # Add your data processing code here

        return {
        "statusCode": 200,
        "body": json.dumps("Function executed successfully")
        }





