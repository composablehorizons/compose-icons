package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CirclePile: ImageVector
    get() {
        if (_CirclePile != null) return _CirclePile!!
        
        _CirclePile = ImageVector.Builder(
            name = "circle-pile",
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
                moveTo(14f, 19f)
                arcTo(2f, 2f, 0f, false, true, 12f, 21f)
                arcTo(2f, 2f, 0f, false, true, 10f, 19f)
                arcTo(2f, 2f, 0f, false, true, 14f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 5f)
                arcTo(2f, 2f, 0f, false, true, 12f, 7f)
                arcTo(2f, 2f, 0f, false, true, 10f, 5f)
                arcTo(2f, 2f, 0f, false, true, 14f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                arcTo(2f, 2f, 0f, false, true, 16f, 14f)
                arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                arcTo(2f, 2f, 0f, false, true, 18f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 19f)
                arcTo(2f, 2f, 0f, false, true, 20f, 21f)
                arcTo(2f, 2f, 0f, false, true, 18f, 19f)
                arcTo(2f, 2f, 0f, false, true, 22f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 19f)
                arcTo(2f, 2f, 0f, false, true, 4f, 21f)
                arcTo(2f, 2f, 0f, false, true, 2f, 19f)
                arcTo(2f, 2f, 0f, false, true, 6f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                arcTo(2f, 2f, 0f, false, true, 8f, 14f)
                arcTo(2f, 2f, 0f, false, true, 6f, 12f)
                arcTo(2f, 2f, 0f, false, true, 10f, 12f)
                close()
            }
        }.build()
        
        return _CirclePile!!
    }

private var _CirclePile: ImageVector? = null

