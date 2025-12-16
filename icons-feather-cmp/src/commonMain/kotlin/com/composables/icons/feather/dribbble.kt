package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Dribbble: ImageVector
    get() {
        if (_Dribbble != null) return _Dribbble!!
        
        _Dribbble = ImageVector.Builder(
            name = "dribbble",
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
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, false, true, 12f, 22f)
                arcTo(10f, 10f, 0f, false, true, 2f, 12f)
                arcTo(10f, 10f, 0f, false, true, 22f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.56f, 2.75f)
                curveToRelative(4.37f, 6.03f, 6.02f, 9.42f, 8.03f, 17.72f)
                moveToRelative(2.54f, -15.38f)
                curveToRelative(-3.72f, 4.35f, -8.94f, 5.66f, -16.88f, 5.85f)
                moveToRelative(19.5f, 1.9f)
                curveToRelative(-3.5f, -0.93f, -6.63f, -0.82f, -8.94f, 0f)
                curveToRelative(-2.58f, 0.92f, -5.01f, 2.86f, -7.44f, 6.32f)
            }
        }.build()
        
        return _Dribbble!!
    }

private var _Dribbble: ImageVector? = null

