package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Milk: ImageVector
    get() {
        if (_Milk != null) return _Milk!!
        
        _Milk = ImageVector.Builder(
            name = "milk",
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
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 2f)
                verticalLineToRelative(2.789f)
                arcToRelative(4f, 4f, 0f, false, true, -0.672f, 2.219f)
                lineToRelative(-0.656f, 0.984f)
                arcTo(4f, 4f, 0f, false, false, 7f, 10.212f)
                verticalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-9.789f)
                arcToRelative(4f, 4f, 0f, false, false, -0.672f, -2.219f)
                lineToRelative(-0.656f, -0.984f)
                arcTo(4f, 4f, 0f, false, true, 15f, 4.788f)
                verticalLineTo(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15f)
                arcToRelative(6.472f, 6.472f, 0f, false, true, 5f, 0f)
                arcToRelative(6.47f, 6.47f, 0f, false, false, 5f, 0f)
            }
        }.build()
        
        return _Milk!!
    }

private var _Milk: ImageVector? = null

