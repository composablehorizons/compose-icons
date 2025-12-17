package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CommentSlash: ImageVector
    get() {
        if (_CommentSlash != null) return _CommentSlash!!
        
        _CommentSlash = ImageVector.Builder(
            name = "comment-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(64f, 240f)
                curveToRelative(0f, 49.6f, 21.4f, 95f, 57f, 130.7f)
                curveToRelative(-12.6f, 50.3f, -54.3f, 95.2f, -54.8f, 95.8f)
                curveToRelative(-2.2f, 2.3f, -2.8f, 5.7f, -1.5f, 8.7f)
                curveToRelative(1.3f, 2.9f, 4.1f, 4.8f, 7.3f, 4.8f)
                curveToRelative(66.3f, 0f, 116f, -31.8f, 140.6f, -51.4f)
                curveToRelative(32.7f, 12.3f, 69f, 19.4f, 107.4f, 19.4f)
                curveToRelative(27.4f, 0f, 53.7f, -3.6f, 78.4f, -10f)
                lineTo(72.9f, 186.4f)
                curveToRelative(-5.6f, 17.1f, -8.9f, 35f, -8.9f, 53.6f)
                close()
                moveToRelative(569.8f, 218.1f)
                lineToRelative(-114.4f, -88.4f)
                curveTo(554.6f, 334.1f, 576f, 289.2f, 576f, 240f)
                curveToRelative(0f, -114.9f, -114.6f, -208f, -256f, -208f)
                curveToRelative(-65.1f, 0f, -124.2f, 20.1f, -169.4f, 52.7f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2f, 28.5f, -0.8f, 23f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7f, -4.2f, 17f, 2.8f, 22.4f)
                lineToRelative(588.4f, 454.7f)
                curveToRelative(7f, 5.4f, 17f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.4f, -6.8f, 4.1f, -16.9f, -2.9f, -22.3f)
                close()
            }
        }.build()
        
        return _CommentSlash!!
    }

private var _CommentSlash: ImageVector? = null

