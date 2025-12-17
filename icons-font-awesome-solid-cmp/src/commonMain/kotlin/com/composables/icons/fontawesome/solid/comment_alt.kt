package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CommentAlt: ImageVector
    get() {
        if (_CommentAlt != null) return _CommentAlt!!
        
        _CommentAlt = ImageVector.Builder(
            name = "comment-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 0f)
                horizontalLineTo(64f)
                curveTo(28.7f, 0f, 0f, 28.7f, 0f, 64f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 35.3f, 28.7f, 64f, 64f, 64f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(84f)
                curveToRelative(0f, 9.8f, 11.2f, 15.5f, 19.1f, 9.7f)
                lineTo(304f, 416f)
                horizontalLineToRelative(144f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                verticalLineTo(64f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                close()
            }
        }.build()
        
        return _CommentAlt!!
    }

private var _CommentAlt: ImageVector? = null

