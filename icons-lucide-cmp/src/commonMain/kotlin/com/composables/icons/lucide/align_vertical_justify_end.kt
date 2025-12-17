package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignVerticalJustifyEnd: ImageVector
    get() {
        if (_AlignVerticalJustifyEnd != null) return _AlignVerticalJustifyEnd!!
        
        _AlignVerticalJustifyEnd = ImageVector.Builder(
            name = "align-vertical-justify-end",
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
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 19f, 14f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 17f, 18f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 5f, 16f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, false, true, 7f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 2f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 17f, 4f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 15f, 8f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 7f, 6f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 9f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 22f)
                horizontalLineToRelative(20f)
            }
        }.build()
        
        return _AlignVerticalJustifyEnd!!
    }

private var _AlignVerticalJustifyEnd: ImageVector? = null

