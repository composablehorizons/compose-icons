package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Droplets: ImageVector
    get() {
        if (_Droplets != null) return _Droplets!!
        
        _Droplets = ImageVector.Builder(
            name = "droplets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12.003f)
                curveToRelative(0.541f, 0f, 1.045f, 0.273f, 1.342f, 0.727f)
                lineToRelative(2.122f, 3.273f)
                arcToRelative(3.999f, 3.999f, 0f, false, true, -6.035f, 5.063f)
                curveToRelative(-1.487f, -1.248f, -1.864f, -3.382f, -0.867f, -5.11f)
                lineToRelative(2.098f, -3.226f)
                arcToRelative(1.6f, 1.6f, 0f, false, true, 1.34f, -0.727f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 12.003f)
                curveToRelative(0.541f, 0f, 1.045f, 0.273f, 1.342f, 0.727f)
                lineToRelative(2.122f, 3.273f)
                arcToRelative(3.999f, 3.999f, 0f, false, true, -6.035f, 5.063f)
                curveToRelative(-1.487f, -1.248f, -1.864f, -3.382f, -0.867f, -5.11f)
                lineToRelative(2.098f, -3.227f)
                arcToRelative(1.6f, 1.6f, 0f, false, true, 1.34f, -0.726f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.003f)
                curveToRelative(0.541f, 0f, 1.045f, 0.273f, 1.342f, 0.727f)
                lineToRelative(2.122f, 3.273f)
                arcToRelative(3.999f, 3.999f, 0f, false, true, -6.035f, 5.063f)
                curveToRelative(-1.487f, -1.248f, -1.864f, -3.382f, -0.867f, -5.11f)
                lineToRelative(2.098f, -3.226f)
                arcToRelative(1.6f, 1.6f, 0f, false, true, 1.34f, -0.727f)
            }
        }.build()
        
        return _Droplets!!
    }

private var _Droplets: ImageVector? = null

