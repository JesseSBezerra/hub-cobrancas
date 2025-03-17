variable "region" { default = "sa-east-1" }
variable "app_name" { default = "hub-cobrancas" }
variable "ecr_image_url" { default = "397685870114.dkr.ecr.sa-east-1.amazonaws.com/hub-cobrancas:latest" }
variable "container_port" { default = 8012 }
variable "ecr_repo_name" { default = "hub-cobrancas" }
variable "desired_count" { default = 1 }