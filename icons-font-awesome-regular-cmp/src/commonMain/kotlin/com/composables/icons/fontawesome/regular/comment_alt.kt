package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.CommentAlt: ImageVector
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
                curveToRelative(0f, 7.1f, 5.8f, 12f, 12f, 12f)
                curveToRelative(2.4f, 0f, 4.9f, -0.7f, 7.1f, -2.4f)
                lineTo(304f, 416f)
                horizontalLineToRelative(144f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                verticalLineTo(64f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                close()
                moveToRelative(16f, 352f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                horizontalLineTo(288f)
                lineToRelative(-12.8f, 9.6f)
                lineTo(208f, 428f)
                verticalLineToRelative(-60f)
                horizontalLineTo(64f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                verticalLineTo(64f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(384f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                verticalLineToRelative(288f)
                close()
            }
        }.build()
        
        return _CommentAlt!!
    }

private var _CommentAlt: ImageVector? = null

