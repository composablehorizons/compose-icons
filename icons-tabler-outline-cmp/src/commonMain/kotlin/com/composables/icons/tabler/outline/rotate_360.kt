package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Rotate360: ImageVector
    get() {
        if (_Rotate360 != null) return _Rotate360!!
        
        _Rotate360 = ImageVector.Builder(
            name = "rotate-360",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.458f, 11.042f)
                curveToRelative(0.86f, -2.366f, 0.722f, -4.58f, -0.6f, -5.9f)
                curveToRelative(-2.272f, -2.274f, -7.185f, -1.045f, -10.973f, 2.743f)
                curveToRelative(-3.788f, 3.788f, -5.017f, 8.701f, -2.744f, 10.974f)
                curveToRelative(2.227f, 2.226f, 6.987f, 1.093f, 10.74f, -2.515f)
            }
        }.build()
        
        return _Rotate360!!
    }

private var _Rotate360: ImageVector? = null

