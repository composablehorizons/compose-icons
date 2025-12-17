package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.KeyframeAlignHorizontal: ImageVector
    get() {
        if (_KeyframeAlignHorizontal != null) return _KeyframeAlignHorizontal!!
        
        _KeyframeAlignHorizontal = ImageVector.Builder(
            name = "keyframe-align-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(5f, 11f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 11f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _KeyframeAlignHorizontal!!
    }

private var _KeyframeAlignHorizontal: ImageVector? = null

