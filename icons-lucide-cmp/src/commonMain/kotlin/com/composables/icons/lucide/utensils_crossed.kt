package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UtensilsCrossed: ImageVector
    get() {
        if (_UtensilsCrossed != null) return _UtensilsCrossed!!
        
        _UtensilsCrossed = ImageVector.Builder(
            name = "utensils-crossed",
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
                moveTo(16f, 2f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 4.2f)
                lineToRelative(1.8f, 1.8f)
                arcToRelative(3f, 3f, 0f, false, false, 4.2f, 0f)
                lineTo(22f, 8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                lineTo(3.3f, 3.3f)
                arcToRelative(4.2f, 4.2f, 0f, false, false, 0f, 6f)
                lineToRelative(7.3f, 7.3f)
                curveToRelative(0.7f, 0.7f, 2f, 0.7f, 2.8f, 0f)
                lineTo(15f, 15f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(7f, 7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.1f, 21.8f)
                lineToRelative(6.4f, -6.3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 5f)
                lineToRelative(-7f, 7f)
            }
        }.build()
        
        return _UtensilsCrossed!!
    }

private var _UtensilsCrossed: ImageVector? = null

