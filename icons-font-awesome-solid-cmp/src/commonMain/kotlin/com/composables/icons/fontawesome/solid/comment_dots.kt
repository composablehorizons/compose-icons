package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CommentDots: ImageVector
    get() {
        if (_CommentDots != null) return _CommentDots!!
        
        _CommentDots = ImageVector.Builder(
            name = "comment-dots",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 32f)
                curveTo(114.6f, 32f, 0f, 125.1f, 0f, 240f)
                curveToRelative(0f, 49.6f, 21.4f, 95f, 57f, 130.7f)
                curveTo(44.5f, 421.1f, 2.7f, 466f, 2.2f, 466.5f)
                curveToRelative(-2.2f, 2.3f, -2.8f, 5.7f, -1.5f, 8.7f)
                reflectiveCurveTo(4.8f, 480f, 8f, 480f)
                curveToRelative(66.3f, 0f, 116f, -31.8f, 140.6f, -51.4f)
                curveToRelative(32.7f, 12.3f, 69f, 19.4f, 107.4f, 19.4f)
                curveToRelative(141.4f, 0f, 256f, -93.1f, 256f, -208f)
                reflectiveCurveTo(397.4f, 32f, 256f, 32f)
                close()
                moveTo(128f, 272f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(128f, 0f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(128f, 0f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _CommentDots!!
    }

private var _CommentDots: ImageVector? = null

