package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CommentDiscussionQuote: ImageVector
    get() {
        if (_CommentDiscussionQuote != null) return _CommentDiscussionQuote!!
        
        _CommentDiscussionQuote = ImageVector.Builder(
            name = "comment-discussion-quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4.5f)
                curveTo(1f, 3.119f, 2.119f, 2f, 3.5f, 2f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 2f, 15f, 3.119f, 15f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(15f, 10.881f, 13.881f, 12f, 12.5f, 12f)
                horizontalLineTo(8.688f)
                lineTo(5.625f, 14.68f)
                curveTo(4.991f, 15.234f, 4f, 14.784f, 4f, 13.942f)
                verticalLineTo(12f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 12f, 1f, 10.881f, 1f, 9.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(3.5f, 3f)
                curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(2f, 10.328f, 2.672f, 11f, 3.5f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13.898f)
                lineTo(8.312f, 11f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 11f, 14f, 10.328f, 14f, 9.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.672f, 13.328f, 3f, 12.5f, 3f)
                horizontalLineTo(3.5f)
                close()
                moveTo(12f, 5.5f)
                curveTo(12f, 5.224f, 11.776f, 5f, 11.5f, 5f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 5f, 4f, 5.224f, 4f, 5.5f)
                curveTo(4f, 5.776f, 4.224f, 6f, 4.5f, 6f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 6f, 12f, 5.776f, 12f, 5.5f)
                close()
                moveTo(10f, 8.5f)
                curveTo(10f, 8.224f, 9.776f, 8f, 9.5f, 8f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 8f, 4f, 8.224f, 4f, 8.5f)
                curveTo(4f, 8.776f, 4.224f, 9f, 4.5f, 9f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 9f, 10f, 8.776f, 10f, 8.5f)
                close()
            }
        }.build()
        
        return _CommentDiscussionQuote!!
    }

private var _CommentDiscussionQuote: ImageVector? = null

