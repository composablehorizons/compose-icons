package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Citrus: ImageVector
    get() {
        if (_Citrus != null) return _Citrus!!
        
        _Citrus = ImageVector.Builder(
            name = "citrus",
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
                moveTo(21.66f, 17.67f)
                arcToRelative(1.08f, 1.08f, 0f, false, true, -0.04f, 1.6f)
                arcTo(12f, 12f, 0f, false, true, 4.73f, 2.38f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, 1.61f, -0.04f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.65f, 15.66f)
                arcTo(8f, 8f, 0f, false, true, 8.35f, 4.34f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                lineToRelative(-5.5f, 5.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 17.85f)
                verticalLineTo(10f)
                horizontalLineTo(6.15f)
            }
        }.build()
        
        return _Citrus!!
    }

private var _Citrus: ImageVector? = null

