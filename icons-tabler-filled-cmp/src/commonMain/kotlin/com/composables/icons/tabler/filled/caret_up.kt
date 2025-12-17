package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) return _CaretUp!!
        
        _CaretUp = ImageVector.Builder(
            name = "caret-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.293f, 7.293f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(6f, 6f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(0.054f, 0.077f)
                lineToRelative(0.054f, 0.096f)
                lineToRelative(0.017f, 0.036f)
                lineToRelative(0.027f, 0.067f)
                lineToRelative(0.032f, 0.108f)
                lineToRelative(0.01f, 0.053f)
                lineToRelative(0.01f, 0.06f)
                lineToRelative(0.004f, 0.057f)
                lineToRelative(0.002f, 0.059f)
                lineToRelative(-0.002f, 0.059f)
                lineToRelative(-0.005f, 0.058f)
                lineToRelative(-0.009f, 0.06f)
                lineToRelative(-0.01f, 0.052f)
                lineToRelative(-0.032f, 0.108f)
                lineToRelative(-0.027f, 0.067f)
                lineToRelative(-0.07f, 0.132f)
                lineToRelative(-0.065f, 0.09f)
                lineToRelative(-0.073f, 0.081f)
                lineToRelative(-0.094f, 0.083f)
                lineToRelative(-0.077f, 0.054f)
                lineToRelative(-0.096f, 0.054f)
                lineToRelative(-0.036f, 0.017f)
                lineToRelative(-0.067f, 0.027f)
                lineToRelative(-0.108f, 0.032f)
                lineToRelative(-0.053f, 0.01f)
                lineToRelative(-0.06f, 0.01f)
                lineToRelative(-0.057f, 0.004f)
                lineToRelative(-0.059f, 0.002f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.852f, 0f, -1.297f, -0.986f, -0.783f, -1.623f)
                lineToRelative(0.076f, -0.084f)
                lineToRelative(6f, -6f)
                close()
            }
        }.build()
        
        return _CaretUp!!
    }

private var _CaretUp: ImageVector? = null

