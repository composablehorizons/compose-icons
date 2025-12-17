package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Keyframes: ImageVector
    get() {
        if (_Keyframes != null) return _Keyframes!!
        
        _Keyframes = ImageVector.Builder(
            name = "keyframes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4f)
                arcToRelative(2.599f, 2.599f, 0f, false, false, -2f, 0.957f)
                lineToRelative(-4.355f, 5.24f)
                arcToRelative(2.847f, 2.847f, 0f, false, false, -0.007f, 3.598f)
                lineToRelative(4.368f, 5.256f)
                curveToRelative(0.499f, 0.6f, 1.224f, 0.949f, 1.994f, 0.949f)
                arcToRelative(2.599f, 2.599f, 0f, false, false, 2f, -0.957f)
                lineToRelative(4.355f, -5.24f)
                arcToRelative(2.847f, 2.847f, 0f, false, false, 0.007f, -3.598f)
                lineToRelative(-4.368f, -5.256f)
                arcToRelative(2.593f, 2.593f, 0f, false, false, -1.994f, -0.949f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.382f, 4.214f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, 0.074f)
                lineToRelative(0.084f, 0.094f)
                lineToRelative(4.576f, 5.823f)
                curveToRelative(0.808f, 0.993f, 0.848f, 2.396f, 0.13f, 3.419f)
                lineToRelative(-0.12f, 0.158f)
                lineToRelative(-4.586f, 5.836f)
                arcToRelative(1f, 1f, 0f, false, true, -1.644f, -1.132f)
                lineToRelative(0.072f, -0.104f)
                lineToRelative(4.596f, -5.85f)
                arcToRelative(0.845f, 0.845f, 0f, false, false, 0.06f, -0.978f)
                lineToRelative(-0.07f, -0.1f)
                lineToRelative(-4.586f, -5.836f)
                arcToRelative(1f, 1f, 0f, false, true, 0.168f, -1.404f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.382f, 4.214f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, 0.074f)
                lineToRelative(0.084f, 0.094f)
                lineToRelative(4.576f, 5.823f)
                curveToRelative(0.808f, 0.993f, 0.848f, 2.396f, 0.13f, 3.419f)
                lineToRelative(-0.12f, 0.158f)
                lineToRelative(-4.586f, 5.836f)
                arcToRelative(1f, 1f, 0f, false, true, -1.644f, -1.132f)
                lineToRelative(0.072f, -0.104f)
                lineToRelative(4.596f, -5.85f)
                arcToRelative(0.845f, 0.845f, 0f, false, false, 0.06f, -0.978f)
                lineToRelative(-0.07f, -0.1f)
                lineToRelative(-4.586f, -5.836f)
                arcToRelative(1f, 1f, 0f, false, true, 0.168f, -1.404f)
                close()
            }
        }.build()
        
        return _Keyframes!!
    }

private var _Keyframes: ImageVector? = null

