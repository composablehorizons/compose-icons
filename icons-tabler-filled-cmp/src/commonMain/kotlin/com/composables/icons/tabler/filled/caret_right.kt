package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CaretRight: ImageVector
    get() {
        if (_CaretRight != null) return _CaretRight!!
        
        _CaretRight = ImageVector.Builder(
            name = "caret-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 6f)
                curveToRelative(0f, -0.852f, 0.986f, -1.297f, 1.623f, -0.783f)
                lineToRelative(0.084f, 0.076f)
                lineToRelative(6f, 6f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-6f, 6f)
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
                lineToRelative(-0.059f, -0.002f)
                lineToRelative(-0.058f, -0.005f)
                lineToRelative(-0.06f, -0.009f)
                lineToRelative(-0.052f, -0.01f)
                lineToRelative(-0.108f, -0.032f)
                lineToRelative(-0.067f, -0.027f)
                lineToRelative(-0.132f, -0.07f)
                lineToRelative(-0.09f, -0.065f)
                lineToRelative(-0.081f, -0.073f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-0.054f, -0.077f)
                lineToRelative(-0.054f, -0.096f)
                lineToRelative(-0.017f, -0.036f)
                lineToRelative(-0.027f, -0.067f)
                lineToRelative(-0.032f, -0.108f)
                lineToRelative(-0.01f, -0.053f)
                lineToRelative(-0.01f, -0.06f)
                lineToRelative(-0.004f, -0.057f)
                lineToRelative(-0.002f, -12.059f)
                close()
            }
        }.build()
        
        return _CaretRight!!
    }

private var _CaretRight: ImageVector? = null

