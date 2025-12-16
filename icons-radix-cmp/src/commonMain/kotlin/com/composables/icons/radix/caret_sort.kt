package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CaretSort: ImageVector
    get() {
        if (_CaretSort != null) return _CaretSort!!
        
        _CaretSort = ImageVector.Builder(
            name = "caret-sort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.93186f, 8.93182f)
                curveTo(5.10759f, 8.75609f, 5.39284f, 8.75609f, 5.56858f, 8.93182f)
                lineTo(7.50022f, 10.8635f)
                lineTo(9.43186f, 8.93182f)
                lineTo(9.50217f, 8.87421f)
                curveTo(9.67686f, 8.75873f, 9.91475f, 8.77799f, 10.0686f, 8.93182f)
                curveTo(10.2222f, 9.08567f, 10.2417f, 9.32361f, 10.1262f, 9.49823f)
                lineTo(10.0686f, 9.56854f)
                lineTo(7.81858f, 11.8185f)
                lineTo(7.74826f, 11.8762f)
                curveTo(7.57364f, 11.9916f, 7.33571f, 11.9722f, 7.18186f, 11.8185f)
                lineTo(4.93186f, 9.56854f)
                curveTo(4.75612f, 9.39281f, 4.75612f, 9.10756f, 4.93186f, 8.93182f)
                close()
                moveTo(7.50022f, 3.04999f)
                curveTo(7.61949f, 3.05004f, 7.73423f, 3.09748f, 7.81858f, 3.18182f)
                lineTo(10.0686f, 5.43182f)
                curveTo(10.2441f, 5.60758f, 10.2442f, 5.89287f, 10.0686f, 6.06854f)
                curveTo(9.8929f, 6.24421f, 9.60761f, 6.24408f, 9.43186f, 6.06854f)
                lineTo(7.50022f, 4.1369f)
                lineTo(5.56858f, 6.06854f)
                lineTo(5.49826f, 6.12616f)
                curveTo(5.32364f, 6.24162f, 5.08571f, 6.22221f, 4.93186f, 6.06854f)
                curveTo(4.77803f, 5.91471f, 4.75876f, 5.67682f, 4.87424f, 5.50214f)
                lineTo(4.93186f, 5.43182f)
                lineTo(7.18186f, 3.18182f)
                curveTo(7.26625f, 3.09743f, 7.38087f, 3.04999f, 7.50022f, 3.04999f)
                close()
            }
        }.build()
        
        return _CaretSort!!
    }

private var _CaretSort: ImageVector? = null

