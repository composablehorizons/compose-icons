package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Donut: ImageVector
    get() {
        if (_Donut != null) return _Donut!!
        
        _Donut = ImageVector.Builder(
            name = "donut",
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
                moveTo(20.5f, 10f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.4f, -3f)
                horizontalLineTo(18f)
                arcToRelative(2.95f, 2.95f, 0f, false, true, -2.6f, -4.4f)
                arcToRelative(10f, 10f, 0f, true, false, 6.3f, 7.1f)
                curveToRelative(-0.3f, 0.2f, -0.8f, 0.3f, -1.2f, 0.3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                arcTo(3f, 3f, 0f, false, true, 12f, 15f)
                arcTo(3f, 3f, 0f, false, true, 9f, 12f)
                arcTo(3f, 3f, 0f, false, true, 15f, 12f)
                close()
            }
        }.build()
        
        return _Donut!!
    }

private var _Donut: ImageVector? = null

