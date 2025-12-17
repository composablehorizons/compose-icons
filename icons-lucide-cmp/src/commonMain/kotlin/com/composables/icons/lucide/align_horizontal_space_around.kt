package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignHorizontalSpaceAround: ImageVector
    get() {
        if (_AlignHorizontalSpaceAround != null) return _AlignHorizontalSpaceAround!!
        
        _AlignHorizontalSpaceAround = ImageVector.Builder(
            name = "align-horizontal-space-around",
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
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, false, true, 15f, 9f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 13f, 17f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, false, true, 9f, 15f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 11f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 22f)
                verticalLineTo(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 22f)
                verticalLineTo(2f)
            }
        }.build()
        
        return _AlignHorizontalSpaceAround!!
    }

private var _AlignHorizontalSpaceAround: ImageVector? = null

