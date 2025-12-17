package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignHorizontalJustifyStart: ImageVector
    get() {
        if (_AlignHorizontalJustifyStart != null) return _AlignHorizontalJustifyStart!!
        
        _AlignHorizontalJustifyStart = ImageVector.Builder(
            name = "align-horizontal-justify-start",
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
                moveTo(8f, 5f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, false, true, 12f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 10f, 19f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 6f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 8f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 7f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 9f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 20f, 17f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 16f, 15f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 18f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                verticalLineToRelative(20f)
            }
        }.build()
        
        return _AlignHorizontalJustifyStart!!
    }

private var _AlignHorizontalJustifyStart: ImageVector? = null

