package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.KeyframeAlignVertical: ImageVector
    get() {
        if (_KeyframeAlignVertical != null) return _KeyframeAlignVertical!!
        
        _KeyframeAlignVertical = ImageVector.Builder(
            name = "keyframe-align-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6f)
                curveToRelative(-0.629f, 0f, -1.214f, 0.301f, -1.606f, 0.807f)
                lineToRelative(-2.908f, 3.748f)
                arcToRelative(2.395f, 2.395f, 0f, false, false, -0.011f, 2.876f)
                lineToRelative(2.919f, 3.762f)
                curveToRelative(0.39f, 0.505f, 0.977f, 0.807f, 1.606f, 0.807f)
                curveToRelative(0.629f, 0f, 1.214f, -0.301f, 1.606f, -0.807f)
                lineToRelative(2.908f, -3.748f)
                arcToRelative(2.395f, 2.395f, 0f, false, false, 0.011f, -2.876f)
                lineToRelative(-2.919f, -3.762f)
                arcToRelative(2.032f, 2.032f, 0f, false, false, -1.606f, -0.807f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 19f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _KeyframeAlignVertical!!
    }

private var _KeyframeAlignVertical: ImageVector? = null

