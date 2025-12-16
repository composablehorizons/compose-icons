package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.TrendingDown: ImageVector
    get() {
        if (_TrendingDown != null) return _TrendingDown!!
        
        _TrendingDown = ImageVector.Builder(
            name = "trending-down",
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
                moveTo(23f, 18f)
                lineTo(13.5f, 8.5f)
                lineTo(8.5f, 13.5f)
                lineTo(1f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 18f)
                lineTo(23f, 18f)
                lineTo(23f, 12f)
            }
        }.build()
        
        return _TrendingDown!!
    }

private var _TrendingDown: ImageVector? = null

