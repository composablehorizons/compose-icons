package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignHorizontalJustifyEnd: ImageVector
    get() {
        if (_AlignHorizontalJustifyEnd != null) return _AlignHorizontalJustifyEnd!!
        
        _AlignHorizontalJustifyEnd = ImageVector.Builder(
            name = "align-horizontal-justify-end",
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
                moveTo(4f, 5f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 8f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 6f, 19f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 4f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 7f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 18f, 9f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 16f, 17f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, false, true, 12f, 15f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 14f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                verticalLineToRelative(20f)
            }
        }.build()
        
        return _AlignHorizontalJustifyEnd!!
    }

private var _AlignHorizontalJustifyEnd: ImageVector? = null

