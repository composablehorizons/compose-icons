package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignVerticalJustifyStart: ImageVector
    get() {
        if (_AlignVerticalJustifyStart != null) return _AlignVerticalJustifyStart!!
        
        _AlignVerticalJustifyStart = ImageVector.Builder(
            name = "align-vertical-justify-start",
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
                moveTo(7f, 16f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 19f, 18f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 17f, 22f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 5f, 20f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 7f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 17f, 8f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, false, true, 15f, 12f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 7f, 10f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 9f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                horizontalLineToRelative(20f)
            }
        }.build()
        
        return _AlignVerticalJustifyStart!!
    }

private var _AlignVerticalJustifyStart: ImageVector? = null

