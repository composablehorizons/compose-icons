package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleStop: ImageVector
    get() {
        if (_CircleStop != null) return _CircleStop!!
        
        _CircleStop = ImageVector.Builder(
            name = "circle-stop",
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
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, false, true, 12f, 22f)
                arcTo(10f, 10f, 0f, false, true, 2f, 12f)
                arcTo(10f, 10f, 0f, false, true, 22f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 9f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, false, true, 15f, 10f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, false, true, 14f, 15f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, false, true, 9f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, false, true, 10f, 9f)
                close()
            }
        }.build()
        
        return _CircleStop!!
    }

private var _CircleStop: ImageVector? = null

