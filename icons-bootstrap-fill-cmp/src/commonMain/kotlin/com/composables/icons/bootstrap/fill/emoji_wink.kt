package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EmojiWink: ImageVector
    get() {
        if (_EmojiWink != null) return _EmojiWink!!
        
        _EmojiWink = ImageVector.Builder(
            name = "emoji-wink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(8f, 8f, 0f, true, true, 0f, 16f)
                arcTo(8f, 8f, 0f, false, true, 8f, 0f)
                moveTo(7f, 6.5f)
                curveTo(7f, 5.672f, 6.552f, 5f, 6f, 5f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveTo(5.448f, 8f, 6f, 8f)
                reflectiveCurveToRelative(1f, -0.672f, 1f, -1.5f)
                moveTo(4.285f, 9.567f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.183f, 0.683f)
                arcTo(4.5f, 4.5f, 0f, false, false, 8f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 3.898f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.866f, -0.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.032f, -1.75f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.683f, -0.183f)
                moveToRelative(5.152f, -3.31f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.874f, 0.486f)
                curveToRelative(0.33f, 0.595f, 0.958f, 1.007f, 1.687f, 1.007f)
                reflectiveCurveToRelative(1.356f, -0.412f, 1.687f, -1.007f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.874f, -0.486f)
                arcToRelative(0.93f, 0.93f, 0f, false, true, -0.813f, 0.493f)
                arcToRelative(0.93f, 0.93f, 0f, false, true, -0.813f, -0.493f)
            }
        }.build()
        
        return _EmojiWink!!
    }

private var _EmojiWink: ImageVector? = null

