package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shrub: ImageVector
    get() {
        if (_Shrub != null) return _Shrub!!
        
        _Shrub = ImageVector.Builder(
            name = "shrub",
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
                moveTo(12f, 22f)
                verticalLineToRelative(-5.172f)
                arcToRelative(2f, 2f, 0f, false, false, -0.586f, -1.414f)
                lineTo(9.5f, 13.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 14.5f)
                lineTo(12f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 8.8f)
                arcTo(6f, 6f, 0f, false, true, 13.8f, 20f)
                horizontalLineTo(10f)
                arcTo(6.5f, 6.5f, 0f, false, true, 7f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, 10f, 0f)
                close()
            }
        }.build()
        
        return _Shrub!!
    }

private var _Shrub: ImageVector? = null

