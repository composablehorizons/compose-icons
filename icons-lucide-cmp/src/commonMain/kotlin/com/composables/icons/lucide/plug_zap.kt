package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PlugZap: ImageVector
    get() {
        if (_PlugZap != null) return _PlugZap!!
        
        _PlugZap = ImageVector.Builder(
            name = "plug-zap",
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
                moveTo(6.3f, 20.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 3.4f, 0f)
                lineTo(12f, 18f)
                lineToRelative(-6f, -6f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 0f, 3.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 22f)
                lineToRelative(3f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 13.5f)
                lineTo(10f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 16.5f)
                lineTo(13f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 3f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(6f)
                lineToRelative(-4f, 4f)
            }
        }.build()
        
        return _PlugZap!!
    }

private var _PlugZap: ImageVector? = null

