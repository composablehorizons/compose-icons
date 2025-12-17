package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EmojiSurprise: ImageVector
    get() {
        if (_EmojiSurprise != null) return _EmojiSurprise!!
        
        _EmojiSurprise = ImageVector.Builder(
            name = "emoji-surprise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(7f, 5.5f)
                curveTo(7f, 4.672f, 6.552f, 4f, 6f, 4f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveTo(5.448f, 7f, 6f, 7f)
                reflectiveCurveToRelative(1f, -0.672f, 1f, -1.5f)
                moveToRelative(4f, 0f)
                curveToRelative(0f, -0.828f, -0.448f, -1.5f, -1f, -1.5f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveTo(9.448f, 7f, 10f, 7f)
                reflectiveCurveToRelative(1f, -0.672f, 1f, -1.5f)
                moveTo(8f, 13f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
            }
        }.build()
        
        return _EmojiSurprise!!
    }

private var _EmojiSurprise: ImageVector? = null

