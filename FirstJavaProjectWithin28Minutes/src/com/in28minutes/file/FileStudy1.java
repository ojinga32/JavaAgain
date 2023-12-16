package com.in28minutes.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FileStudy1 {

	public static void main(String[] args) throws IOException{
		/*
			1.Paths
				특정 디렉토리에 접근 가능
				get을 통해 변수에 디렉토리 경로를 받을 수 있다
				. -> 현재 위치
		
			2.Files.list(path)
				Stream 반환
				현재 디렉토리를 반환할 뿐 현재 디렉토리 내의 디렉토리들은 반환하지 않는다
				재귀가 아님
		
			3.Files.walk(start, maxDepth)
				시작 위치로부터 하위 디렉토리에 접근
				maxDepth에 따라 불러올 디렉토리의 깊이가 정해진다
				2단계부터 하위 디렉토리에 접근
				현재 디렉토리의 파일 및 디렉토리와 하위 디렉토리의 파일 및 디렉토리를 모두 가져 온다
		
			3.시작 위치로부터 하위 디렉토리에 접근
			4.matcher는 BiPredicate 인터페이스의 변수
				함수형 인터페이스
				제네릭 타입의 두 개의 매개 변수를 전달받아 특정 작업 수행 후, boolean 타입의 값 반환
				path와 attribute 인자 두 개를 사용한다
				람다 식을 통해 filter할 내용을 적는다
				attribute를 활용하면 파일의 특성에 따라 필터 가능
		*/
		
		Files.list(Paths.get(".")).forEach(System.out::println);
		Path currentDirectory = Paths.get(".");	
		
		Files.walk(currentDirectory, 3).forEach(System.out::println);
		
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		
		BiPredicate<Path, BasicFileAttributes> javaMatacher
		= (path, attribute) -> String.valueOf(path).contains(".java");
		
		Files.find(currentDirectory, 1, javaMatacher).forEach(System.out::println);;
		
		Files.write(Paths.get(".\\src\\File"), "replaced 될 예정".getBytes());
	}

}
