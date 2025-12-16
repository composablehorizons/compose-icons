package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BetweenVerticalEnd: ImageVector
    get() {
        if (_BetweenVerticalEnd != null) return _BetweenVerticalEnd!!
        
        _BetweenVerticalEnd = ImageVector.Builder(
            name = "between-vertical-end",
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
                moveTo(4f, 3f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 10f, 4f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 9f, 16f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 15f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 4f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 20f, 16f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 14f, 15f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 15f, 3f)
                close()
            }
        }.build()
        
        return _BetweenVerticalEnd!!
    }

private var _BetweenVerticalEnd: ImageVector? = null

