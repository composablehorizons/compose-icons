package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Gem: ImageVector
    get() {
        if (_Gem != null) return _Gem!!
        
        _Gem = ImageVector.Builder(
            name = "gem",
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
                moveTo(10.5f, 3f)
                lineTo(8f, 9f)
                lineToRelative(4f, 13f)
                lineToRelative(4f, -13f)
                lineToRelative(-2.5f, -6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 1.6f, 0.8f)
                lineToRelative(3f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 0.013f, 2.382f)
                lineToRelative(-7.99f, 10.986f)
                arcToRelative(2f, 2f, 0f, false, true, -3.247f, 0f)
                lineToRelative(-7.99f, -10.986f)
                arcTo(2f, 2f, 0f, false, true, 2.4f, 7.8f)
                lineToRelative(2.998f, -3.997f)
                arcTo(2f, 2f, 0f, false, true, 7f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                horizontalLineToRelative(20f)
            }
        }.build()
        
        return _Gem!!
    }

private var _Gem: ImageVector? = null

