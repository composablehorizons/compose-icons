package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleDollarSign: ImageVector
    get() {
        if (_CircleDollarSign != null) return _CircleDollarSign!!
        
        _CircleDollarSign = ImageVector.Builder(
            name = "circle-dollar-sign",
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
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, false, true, 12f, 22f)
                arcTo(10f, 10f, 0f, false, true, 2f, 12f)
                arcTo(10f, 10f, 0f, false, true, 22f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                horizontalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                verticalLineTo(6f)
            }
        }.build()
        
        return _CircleDollarSign!!
    }

private var _CircleDollarSign: ImageVector? = null

