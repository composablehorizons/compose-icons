package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EmojiAngry: ImageVector
    get() {
        if (_EmojiAngry != null) return _EmojiAngry!!
        
        _EmojiAngry = ImageVector.Builder(
            name = "emoji-angry",
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
                moveTo(4.285f, 12.433f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.683f, -0.183f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8f, 10.5f)
                curveToRelative(1.295f, 0f, 2.426f, 0.703f, 3.032f, 1.75f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.866f, -0.5f)
                arcTo(4.5f, 4.5f, 0f, false, false, 8f, 9.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -3.898f, 2.25f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.183f, 0.683f)
                moveToRelative(6.991f, -8.38f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.448f, 0.894f)
                lineToRelative(-1.009f, 0.504f)
                curveToRelative(0.176f, 0.27f, 0.285f, 0.64f, 0.285f, 1.049f)
                curveToRelative(0f, 0.828f, -0.448f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.672f, -1f, -1.5f)
                curveToRelative(0f, -0.247f, 0.04f, -0.48f, 0.11f, -0.686f)
                arcToRelative(0.502f, 0.502f, 0f, false, true, 0.166f, -0.761f)
                close()
                moveToRelative(-6.552f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.448f, 0.894f)
                lineToRelative(1.009f, 0.504f)
                arcTo(1.94f, 1.94f, 0f, false, false, 5f, 6.5f)
                curveTo(5f, 7.328f, 5.448f, 8f, 6f, 8f)
                reflectiveCurveToRelative(1f, -0.672f, 1f, -1.5f)
                curveToRelative(0f, -0.247f, -0.04f, -0.48f, -0.11f, -0.686f)
                arcToRelative(0.502f, 0.502f, 0f, false, false, -0.166f, -0.761f)
                close()
            }
        }.build()
        
        return _EmojiAngry!!
    }

private var _EmojiAngry: ImageVector? = null

