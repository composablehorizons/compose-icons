package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Pointer: ImageVector
    get() {
        if (_Pointer != null) return _Pointer!!
        
        _Pointer = ImageVector.Builder(
            name = "pointer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.039f, 4.277f)
                lineToRelative(3.904f, 13.563f)
                curveToRelative(0.185f, 0.837f, 0.92f, 1.516f, 1.831f, 1.642f)
                lineToRelative(0.17f, 0.016f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, 1.982f, -1.006f)
                lineToRelative(0.045f, -0.078f)
                lineToRelative(1.4f, -2.072f)
                lineToRelative(4.05f, 4.05f)
                arcToRelative(2.067f, 2.067f, 0f, false, false, 2.924f, 0f)
                lineToRelative(1.047f, -1.047f)
                curveToRelative(0.388f, -0.388f, 0.606f, -0.913f, 0.606f, -1.461f)
                lineToRelative(-0.008f, -0.182f)
                arcToRelative(2.067f, 2.067f, 0f, false, false, -0.598f, -1.28f)
                lineToRelative(-4.047f, -4.048f)
                lineToRelative(2.103f, -1.412f)
                curveToRelative(0.726f, -0.385f, 1.18f, -1.278f, 1.053f, -2.189f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -1.701f, -1.845f)
                lineToRelative(-13.524f, -3.89f)
                arcToRelative(1f, 1f, 0f, false, false, -1.236f, 1.24f)
                close()
            }
        }.build()
        
        return _Pointer!!
    }

private var _Pointer: ImageVector? = null

