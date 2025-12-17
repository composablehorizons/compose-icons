package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Balloon: ImageVector
    get() {
        if (_Balloon != null) return _Balloon!!
        
        _Balloon = ImageVector.Builder(
            name = "balloon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 7f, 7f)
                curveToRelative(0f, 5.457f, -3.028f, 10f, -7f, 10f)
                curveToRelative(-3.9f, 0f, -6.89f, -4.379f, -6.997f, -9.703f)
                lineToRelative(-0.003f, -0.297f)
                lineToRelative(0.004f, -0.24f)
                arcToRelative(7f, 7f, 0f, false, true, 6.996f, -6.76f)
                close()
                moveToRelative(0f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, 0.993f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 16f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Balloon!!
    }

private var _Balloon: ImageVector? = null

