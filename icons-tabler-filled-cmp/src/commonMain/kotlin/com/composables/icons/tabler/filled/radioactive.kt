package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Radioactive: ImageVector
    get() {
        if (_Radioactive != null) return _Radioactive!!
        
        _Radioactive = ImageVector.Builder(
            name = "radioactive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 11f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(10f, 10f, 0f, false, true, -5f, 8.656f)
                arcToRelative(1f, 1f, 0f, false, true, -1.302f, -0.268f)
                lineToRelative(-0.064f, -0.098f)
                lineToRelative(-3f, -5.19f)
                arcToRelative(0.995f, 0.995f, 0f, false, true, -0.133f, -0.542f)
                lineToRelative(0.01f, -0.11f)
                lineToRelative(0.023f, -0.106f)
                lineToRelative(0.034f, -0.106f)
                lineToRelative(0.046f, -0.1f)
                lineToRelative(0.056f, -0.094f)
                lineToRelative(0.067f, -0.089f)
                arcToRelative(0.994f, 0.994f, 0f, false, true, 0.165f, -0.155f)
                lineToRelative(0.098f, -0.064f)
                arcToRelative(2f, 2f, 0f, false, false, 0.993f, -1.57f)
                lineToRelative(0.007f, -0.163f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.994f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 3.344f)
                arcToRelative(10f, 10f, 0f, false, true, 10f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0.418f, 1.262f)
                lineToRelative(-0.052f, 0.104f)
                lineToRelative(-3f, 5.19f)
                lineToRelative(-0.064f, 0.098f)
                arcToRelative(0.994f, 0.994f, 0f, false, true, -0.155f, 0.165f)
                lineToRelative(-0.089f, 0.067f)
                arcToRelative(1f, 1f, 0f, false, true, -0.195f, 0.102f)
                lineToRelative(-0.105f, 0.034f)
                lineToRelative(-0.107f, 0.022f)
                arcToRelative(1.003f, 1.003f, 0f, false, true, -0.547f, -0.07f)
                lineToRelative(-0.104f, -0.052f)
                arcToRelative(2f, 2f, 0f, false, false, -1.842f, -0.082f)
                lineToRelative(-0.158f, 0.082f)
                arcToRelative(1f, 1f, 0f, false, true, -1.302f, -0.268f)
                lineToRelative(-0.064f, -0.098f)
                lineToRelative(-3f, -5.19f)
                arcToRelative(1f, 1f, 0f, false, true, 0.366f, -1.366f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 11f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.884f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(2f, 2f, 0f, false, false, 0.861f, 1.645f)
                lineToRelative(0.237f, 0.152f)
                arcToRelative(0.994f, 0.994f, 0f, false, true, 0.165f, 0.155f)
                lineToRelative(0.067f, 0.089f)
                lineToRelative(0.056f, 0.095f)
                lineToRelative(0.045f, 0.099f)
                curveToRelative(0.014f, 0.036f, 0.026f, 0.07f, 0.035f, 0.106f)
                lineToRelative(0.022f, 0.107f)
                lineToRelative(0.011f, 0.11f)
                arcToRelative(0.994f, 0.994f, 0f, false, true, -0.08f, 0.437f)
                lineToRelative(-0.053f, 0.104f)
                lineToRelative(-3f, 5.19f)
                arcToRelative(1f, 1f, 0f, false, true, -1.366f, 0.366f)
                arcToRelative(10f, 10f, 0f, false, true, -5f, -8.656f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Radioactive!!
    }

private var _Radioactive: ImageVector? = null

