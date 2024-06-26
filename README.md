# 软件工程大作业
### 一、背景介绍
随着互联网智能终端设备数量的急剧增加，以及5G和物联网时代的到来，传统云计算中心集中存储、计算的模式已经无法满足终端设备对于时效、容量、算力的需求，将云计算的能力下沉到边缘侧、设备侧，并通过中心进行统一交付、运维、管控，将是云计算的重要发展趋势。边缘计算模型是指在网络边缘执行计算的一种新型计算模型，边缘计算模型中边缘设备具有执行计算和数据分析的处理能力，将原有云计算模型执行的部分或全部计算任务迁移到网络边缘设备上，降低云服务器的计算负载，减缓网络带宽的压力，提高万物互联时代数据的处理效率。

另一方面，以Kubernetes(k8s)为代表的云原生技术(Cloud Native)是最近几年云计算领域发展最快的方向之一，k8s也已经成为容器应用编排的事实标准，并以非常快的发展速度扩大在云计算领域的覆盖范围，云原生技术和边缘计算相结合，可以大大提升云技术向边缘拓展的效率。

一个优秀的学校管理系统能够提高学生和老师的学习工作效率，提升学校的教学信息化水平。华南理工大学的校园管理系统存在着访问延迟高、并发性低、不支持大流量访问等不足，本课程设计尝试将校园管理系统容器化并部署在边缘环境中来解决以上不足。

## 二、系统要求
1. 设计并开发一个校园管理系统（包括但不限于：学生管理、教师管理、教务管理、图书管理等等，可自由发挥）；
2. 系统要求使用微服务架构，实现前后端分离。每个微服务模块实现独立的功能，并利用Docker容器技术将各个模块打包为容器镜像；
3. 使用Linux服务器模拟一个边缘平台（校内服务器、主机模拟、虚拟机模拟皆可），有多台服务器模拟边缘集群效果更佳；
4. 在服务器上部署Kubernetes，并利用k8s来部署和管理上述的容器化系统；
5. 使用wrk等压力测试工具对系统性能进行压测。

### 文档要求
模板请使用华南理工课设专用模板

    1、绪论
        1.1 选题目的及意义
        1.2 系统概述
    2、可行性研究报告
    3、需求规格说明书
    4、总体设计说明书
    5、数据库设计说明书
    6、详细设计说明书
    7、系统实现
    8、测试分析报告

### 中期
材料提交 文档1-5

ddl 5月3号

[助教邮箱](511910703@qq.com) 

### 最终要求
文档：课设报告、系统代码、演示视频及相关文档

ddl：第17周周五20：00

格式要求：以压缩包的格式发到助教邮箱，命名为：第X小组。

### 项目分工
前端：starstraws

后端：庞千石、HuuIris

部署：

### 项目日程安排
