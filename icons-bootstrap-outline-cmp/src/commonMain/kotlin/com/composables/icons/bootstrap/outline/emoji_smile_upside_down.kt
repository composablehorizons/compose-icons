package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EmojiSmileUpsideDown: ImageVector
    get() {
        if (_EmojiSmileUpsideDown != null) return _EmojiSmileUpsideDown!!
        
        _EmojiSmileUpsideDown = ImageVector.Builder(
            name = "emoji-smile-upside-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(7f, 7f, 0f, true, false, 0f, 14f)
                arcTo(7f, 7f, 0f, false, false, 8f, 1f)
                moveToRelative(0f, -1f)
                arcToRelative(8f, 8f, 0f, true, true, 0f, 16f)
                arcTo(8f, 8f, 0f, false, true, 8f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.285f, 6.433f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.683f, -0.183f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8f, 4.5f)
                curveToRelative(1.295f, 0f, 2.426f, 0.703f, 3.032f, 1.75f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.866f, -0.5f)
                arcTo(4.5f, 4.5f, 0f, false, false, 8f, 3.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -3.898f, 2.25f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.183f, 0.683f)
                moveTo(7f, 9.5f)
                curveTo(7f, 8.672f, 6.552f, 8f, 6f, 8f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveToRelative(0.448f, 1.5f, 1f, 1.5f)
                reflectiveCurveToRelative(1f, -0.672f, 1f, -1.5f)
                moveToRelative(4f, 0f)
                curveToRelative(0f, -0.828f, -0.448f, -1.5f, -1f, -1.5f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveToRelative(0.448f, 1.5f, 1f, 1.5f)
                reflectiveCurveToRelative(1f, -0.672f, 1f, -1.5f)
            }
        }.build()
        
        return _EmojiSmileUpsideDown!!
    }

private var _EmojiSmileUpsideDown: ImageVector? = null

