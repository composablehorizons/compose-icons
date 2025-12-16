package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Clock: ImageVector
    get() {
        if (_Clock != null) return _Clock!!
        
        _Clock = ImageVector.Builder(
            name = "clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49933f, 0.877014f)
                curveTo(11.1567f, 0.877014f, 14.122f, 3.84175f, 14.1224f, 7.49908f)
                curveTo(14.1224f, 11.1567f, 11.157f, 14.1221f, 7.49933f, 14.1221f)
                curveTo(3.84199f, 14.1217f, 0.877258f, 11.1565f, 0.877258f, 7.49908f)
                curveTo(0.877669f, 3.842f, 3.84225f, 0.877426f, 7.49933f, 0.877014f)
                close()
                moveTo(7.49933f, 1.82623f)
                curveTo(4.36692f, 1.82664f, 1.82689f, 4.36667f, 1.82648f, 7.49908f)
                curveTo(1.82648f, 10.6318f, 4.36667f, 13.1715f, 7.49933f, 13.1719f)
                curveTo(10.6323f, 13.1719f, 13.1722f, 10.6321f, 13.1722f, 7.49908f)
                curveTo(13.1718f, 4.36642f, 10.6321f, 1.82623f, 7.49933f, 1.82623f)
                close()
                moveTo(7.50031f, 4.00006f)
                curveTo(7.77631f, 4.00023f, 8.00031f, 4.22402f, 8.00031f, 4.50006f)
                verticalLineTo(7.29303f)
                lineTo(9.85382f, 9.14655f)
                lineTo(9.91827f, 9.22467f)
                curveTo(10.0463f, 9.41868f, 10.0245f, 9.68276f, 9.85382f, 9.85358f)
                curveTo(9.68303f, 10.0244f, 9.41897f, 10.046f, 9.22491f, 9.91803f)
                lineTo(9.14679f, 9.85358f)
                lineTo(7.14679f, 7.85358f)
                curveTo(7.05303f, 7.75982f, 7.00032f, 7.63265f, 7.00031f, 7.50006f)
                verticalLineTo(4.50006f)
                curveTo(7.00031f, 4.22392f, 7.22416f, 4.00006f, 7.50031f, 4.00006f)
                close()
            }
        }.build()
        
        return _Clock!!
    }

private var _Clock: ImageVector? = null

