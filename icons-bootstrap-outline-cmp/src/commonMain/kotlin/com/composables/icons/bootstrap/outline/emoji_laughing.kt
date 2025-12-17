package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EmojiLaughing: ImageVector
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
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.331f, 9.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1f)
                arcTo(5f, 5f, 0f, false, true, 8f, 13f)
                arcToRelative(5f, 5f, 0f, false, true, -4.33f, -2.5f)
                arcTo(1f, 1f, 0f, false, true, 4.535f, 9f)
                horizontalLineToRelative(6.93f)
                arcToRelative(1f, 1f, 0f, false, true, 0.866f, 0.5f)
                moveTo(7f, 6.5f)
                curveToRelative(0f, 0.828f, -0.448f, 0f, -1f, 0f)
                reflectiveCurveToRelative(-1f, 0.828f, -1f, 0f)
                reflectiveCurveTo(5.448f, 5f, 6f, 5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
                moveToRelative(4f, 0f)
                curveToRelative(0f, 0.828f, -0.448f, 0f, -1f, 0f)
                reflectiveCurveToRelative(-1f, 0.828f, -1f, 0f)
                reflectiveCurveTo(9.448f, 5f, 10f, 5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
            }
        }.build()
        
        return _EmojiLaughing!!
    }

private var _EmojiLaughing: ImageVector? = null

