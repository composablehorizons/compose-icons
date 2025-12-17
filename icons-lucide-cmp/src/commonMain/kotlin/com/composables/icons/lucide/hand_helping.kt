package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HandHelping: ImageVector
    get() {
        if (_HandHelping != null) return _HandHelping!!
        
        _HandHelping = ImageVector.Builder(
            name = "hand-helping",
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
                moveTo(11f, 12f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.6f, 0f, -1.1f, 0.2f, -1.4f, 0.6f)
                lineTo(3f, 14f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 18f)
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
                moveTo(2f, 13f)
                lineToRelative(6f, 6f)
            }
        }.build()
        
        return _HandHelping!!
    }

private var _HandHelping: ImageVector? = null

