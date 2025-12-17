package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Oval: ImageVector
    get() {
        if (_Oval != null) return _Oval!!
        
        _Oval = ImageVector.Builder(
            name = "oval",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(3.972f, 0f, 7f, 4.542f, 7f, 10f)
                reflectiveCurveToRelative(-3.028f, 10f, -7f, 10f)
                curveToRelative(-3.9f, 0f, -6.89f, -4.379f, -6.997f, -9.703f)
                lineToRelative(-0.003f, -0.297f)
                lineToRelative(0.003f, -0.297f)
                curveToRelative(0.107f, -5.323f, 3.097f, -9.703f, 6.997f, -9.703f)
                close()
            }
        }.build()
        
        return _Oval!!
    }

private var _Oval: ImageVector? = null

