package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AlphabetThai: ImageVector
    get() {
        if (_AlphabetThai != null) return _AlphabetThai!!
        
        _AlphabetThai = ImageVector.Builder(
            name = "alphabet-thai",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 18f)
                verticalLineToRelative(-3.444f)
                curveToRelative(0f, -0.49f, 0.165f, -0.924f, 0.494f, -1.363f)
                curveToRelative(0.326f, -0.449f, 1.009f, -0.76f, 1.506f, -0.934f)
                curveToRelative(0.032f, -0.011f, 0.035f, -0.079f, 0.004f, -0.095f)
                curveToRelative(-0.434f, -0.22f, -1.294f, -0.52f, -1.626f, -1.032f)
                lineToRelative(-0.014f, -0.021f)
                lineToRelative(-0.083f, -0.125f)
                curveToRelative(-0.281f, -0.42f, -0.281f, -1.246f, -0.281f, -1.246f)
                curveToRelative(0f, -1.456f, 0.849f, -2.62f, 1.837f, -3.199f)
                quadToRelative(0.9f, -0.54f, 2.137f, -0.541f)
                quadToRelative(1.077f, 0f, 1.995f, 0.47f)
                curveToRelative(1.328f, 0.647f, 2.031f, 2.202f, 2.031f, 3.976f)
                verticalLineToRelative(7.554f)
            }
        }.build()
        
        return _AlphabetThai!!
    }

private var _AlphabetThai: ImageVector? = null

