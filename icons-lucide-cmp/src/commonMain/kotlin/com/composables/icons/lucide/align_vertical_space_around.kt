package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignVerticalSpaceAround: ImageVector
    get() {
        if (_AlignVerticalSpaceAround != null) return _AlignVerticalSpaceAround!!
        
        _AlignVerticalSpaceAround = ImageVector.Builder(
            name = "align-vertical-space-around",
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
                moveTo(9f, 9f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 17f, 11f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, false, true, 15f, 15f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, false, true, 7f, 13f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, false, true, 9f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 20f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 4f)
                horizontalLineTo(2f)
            }
        }.build()
        
        return _AlignVerticalSpaceAround!!
    }

private var _AlignVerticalSpaceAround: ImageVector? = null

