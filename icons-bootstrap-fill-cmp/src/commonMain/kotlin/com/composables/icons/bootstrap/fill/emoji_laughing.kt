package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EmojiLaughing: ImageVector
    get() {
        if (_EmojiLaughing != null) return _EmojiLaughing!!
        
        _EmojiLaughing = ImageVector.Builder(
            name = "emoji-laughing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveTo(7f, 6.5f)
                curveToRelative(0f, 0.501f, -0.164f, 0.396f, -0.415f, 0.235f)
                curveTo(6.42f, 6.629f, 6.218f, 6.5f, 6f, 6.5f)
                reflectiveCurveToRelative(-0.42f, 0.13f, -0.585f, 0.235f)
                curveTo(5.164f, 6.896f, 5f, 7f, 5f, 6.5f)
                curveTo(5f, 5.672f, 5.448f, 5f, 6f, 5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
                moveToRelative(5.331f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1f)
                arcTo(5f, 5f, 0f, false, true, 8f, 13f)
                arcToRelative(5f, 5f, 0f, false, true, -4.33f, -2.5f)
                arcTo(1f, 1f, 0f, false, true, 4.535f, 9f)
                horizontalLineToRelative(6.93f)
                arcToRelative(1f, 1f, 0f, false, true, 0.866f, 0.5f)
                moveToRelative(-1.746f, -2.765f)
                curveTo(10.42f, 6.629f, 10.218f, 6.5f, 10f, 6.5f)
                reflectiveCurveToRelative(-0.42f, 0.13f, -0.585f, 0.235f)
                curveTo(9.164f, 6.896f, 9f, 7f, 9f, 6.5f)
                curveToRelative(0f, -0.828f, 0.448f, -1.5f, 1f, -1.5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
                curveToRelative(0f, 0.501f, -0.164f, 0.396f, -0.415f, 0.235f)
            }
        }.build()
        
        return _EmojiLaughing!!
    }

private var _EmojiLaughing: ImageVector? = null

