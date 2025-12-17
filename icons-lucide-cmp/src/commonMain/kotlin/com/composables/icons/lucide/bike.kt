package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Bike: ImageVector
    get() {
        if (_Bike != null) return _Bike!!
        
        _Bike = ImageVector.Builder(
            name = "bike",
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
                moveTo(22f, 17.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 18.5f, 21f)
                arcTo(3.5f, 3.5f, 0f, false, true, 15f, 17.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 22f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 5.5f, 21f)
                arcTo(3.5f, 3.5f, 0f, false, true, 2f, 17.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 9f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 5f)
                arcTo(1f, 1f, 0f, false, true, 15f, 6f)
                arcTo(1f, 1f, 0f, false, true, 14f, 5f)
                arcTo(1f, 1f, 0f, false, true, 16f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17.5f)
                verticalLineTo(14f)
                lineToRelative(-3f, -3f)
                lineToRelative(4f, -3f)
                lineToRelative(2f, 3f)
                horizontalLineToRelative(2f)
            }
        }.build()
        
        return _Bike!!
    }

private var _Bike: ImageVector? = null

