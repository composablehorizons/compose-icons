package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Euro: ImageVector
    get() {
        if (_Euro != null) return _Euro!!
        
        _Euro = ImageVector.Builder(
            name = "euro",
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
                moveTo(4f, 10f)
                horizontalLineToRelative(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 14f)
                horizontalLineToRelative(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 6f)
                arcToRelative(7.7f, 7.7f, 0f, false, false, -5.2f, -2f)
                arcTo(7.9f, 7.9f, 0f, false, false, 6f, 12f)
                curveToRelative(0f, 4.4f, 3.5f, 8f, 7.8f, 8f)
                curveToRelative(2f, 0f, 3.8f, -0.8f, 5.2f, -2f)
            }
        }.build()
        
        return _Euro!!
    }

private var _Euro: ImageVector? = null

