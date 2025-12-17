package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ClosedCaption: ImageVector
    get() {
        if (_ClosedCaption != null) return _ClosedCaption!!
        
        _ClosedCaption = ImageVector.Builder(
            name = "closed-caption",
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
                moveTo(10f, 9.17f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 5.66f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 9.17f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 5.66f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 5f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 20f, 19f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 4f, 5f)
                close()
            }
        }.build()
        
        return _ClosedCaption!!
    }

private var _ClosedCaption: ImageVector? = null

