package org.sopt.artoo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.sopt.artoo.dto.Comment;

import java.util.List;

@Mapper
public interface CommentMapper {

    @Select("SELECT * FROM comment")
    List<Comment> findAllComments();

    @Select("SELECT * FROM comment WHERE c_idx = #{c_idx}")
    Comment findCommentByCommentIdx(@Param("c_idx") final int c_idx);

    @Select("SELECT * FROM comment WHERE a_idx = #{a_idx}")
    List<Comment> findAllCommentByArtIdx(@Param("a_idx") final int a_idx);

    @Select("SELECT * FROM comment WHERE u_idx = #{u_idx}")
    List<Comment> findAllCommentByUserIdx(@Param("u_idx") final int u_idx);


}
