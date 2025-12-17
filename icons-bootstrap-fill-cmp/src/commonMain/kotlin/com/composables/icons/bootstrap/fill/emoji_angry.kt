package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EmojiAngry: ImageVector
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
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveTo(4.053f, 4.276f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.67f, -0.223f)
                lineToRelative(2f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.166f, 0.76f)
                curveToRelative(0.071f, 0.206f, 0.111f, 0.44f, 0.111f, 0.687f)
                curveTo(7f, 7.328f, 6.552f, 8f, 6f, 8f)
                reflectiveCurveToRelative(-1f, -0.672f, -1f, -1.5f)
                curveToRelative(0f, -0.408f, 0.109f, -0.778f, 0.285f, -1.049f)
                lineToRelative(-1.009f, -0.504f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.223f, -0.67f)
                close()
                moveToRelative(0.232f, 8.157f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.183f, -0.683f)
                arcTo(4.5f, 4.5f, 0f, false, true, 8f, 9.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 3.898f, 2.25f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.866f, 0.5f)
                arcTo(3.5f, 3.5f, 0f, false, false, 8f, 10.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -3.032f, 1.75f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.683f, 0.183f)
                moveTo(10f, 8f)
                curveToRelative(-0.552f, 0f, -1f, -0.672f, -1f, -1.5f)
                curveToRelative(0f, -0.247f, 0.04f, -0.48f, 0.11f, -0.686f)
                arcToRelative(0.502f, 0.502f, 0f, false, true, 0.166f, -0.761f)
                lineToRelative(2f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.448f, 0.894f)
                lineToRelative(-1.009f, 0.504f)
                curveToRelative(0.176f, 0.27f, 0.285f, 0.64f, 0.285f, 1.049f)
                curveToRelative(0f, 0.828f, -0.448f, 1.5f, -1f, 1.5f)
            }
        }.build()
        
        return _EmojiAngry!!
    }

private var _EmojiAngry: ImageVector? = null

