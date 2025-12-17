package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HandCoins: ImageVector
    get() {
        if (_HandCoins != null) return _HandCoins!!
        
        _HandCoins = ImageVector.Builder(
            name = "hand-coins",
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
                moveTo(11f, 15f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.6f, 0f, -1.1f, 0.2f, -1.4f, 0.6f)
                lineTo(3f, 17f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 21f)
                lineToRelative(1.6f, -1.4f)
                curveToRelative(0.3f, -0.4f, 0.8f, -0.6f, 1.4f, -0.6f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2.1f, -0.4f, 2.8f, -1.2f)
                lineToRelative(4.6f, -4.4f)
                arcToRelative(2f, 2f, 0f, false, false, -2.75f, -2.91f)
                lineToRelative(-4.2f, 3.9f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 16f)
                lineToRelative(6f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.9f, 9f)
                arcTo(2.9f, 2.9f, 0f, false, true, 16f, 11.9f)
                arcTo(2.9f, 2.9f, 0f, false, true, 13.1f, 9f)
                arcTo(2.9f, 2.9f, 0f, false, true, 18.9f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 5f)
                arcTo(3f, 3f, 0f, false, true, 6f, 8f)
                arcTo(3f, 3f, 0f, false, true, 3f, 5f)
                arcTo(3f, 3f, 0f, false, true, 9f, 5f)
                close()
            }
        }.build()
        
        return _HandCoins!!
    }

private var _HandCoins: ImageVector? = null

