package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowLeftCircle: ImageVector
    get() {
        if (_ArrowLeftCircle != null) return _ArrowLeftCircle!!
        
        _ArrowLeftCircle = ImageVector.Builder(
            name = "arrow-left-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.707f, 8.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-1.292f, 1.293f)
                horizontalLineToRelative(10.756f)
                arcToRelative(3.001f, 3.001f, 0f, true, true, 0f, 2f)
                horizontalLineToRelative(-10.756f)
                lineToRelative(1.292f, 1.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.097f, -0.112f)
                lineToRelative(-0.071f, -0.11f)
                lineToRelative(-0.054f, -0.114f)
                lineToRelative(-0.035f, -0.105f)
                lineToRelative(-0.025f, -0.118f)
                lineToRelative(-0.007f, -0.058f)
                lineToRelative(-0.004f, -0.09f)
                lineToRelative(0.003f, -0.075f)
                lineToRelative(0.017f, -0.126f)
                lineToRelative(0.03f, -0.111f)
                lineToRelative(0.044f, -0.111f)
                lineToRelative(0.052f, -0.098f)
                lineToRelative(0.067f, -0.096f)
                lineToRelative(0.08f, -0.09f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
            }
        }.build()
        
        return _ArrowLeftCircle!!
    }

private var _ArrowLeftCircle: ImageVector? = null

