package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BetweenHorizontalStart: ImageVector
    get() {
        if (_BetweenHorizontalStart != null) return _BetweenHorizontalStart!!
        
        _BetweenHorizontalStart = ImageVector.Builder(
            name = "between-horizontal-start",
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
                moveTo(9f, 3f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 20f, 10f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 9f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 9f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 14f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 15f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 20f, 21f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 20f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 9f, 14f)
                close()
            }
        }.build()
        
        return _BetweenHorizontalStart!!
    }

private var _BetweenHorizontalStart: ImageVector? = null

