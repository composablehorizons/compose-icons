package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Zap: ImageVector
    get() {
        if (_Zap != null) return _Zap!!
        
        _Zap = ImageVector.Builder(
            name = "zap",
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
                moveTo(4f, 14f)
                arcToRelative(1f, 1f, 0f, false, true, -0.78f, -1.63f)
                lineToRelative(9.9f, -10.2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.86f, 0.46f)
                lineToRelative(-1.92f, 6.02f)
                arcTo(1f, 1f, 0f, false, false, 13f, 10f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, 0.78f, 1.63f)
                lineToRelative(-9.9f, 10.2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.86f, -0.46f)
                lineToRelative(1.92f, -6.02f)
                arcTo(1f, 1f, 0f, false, false, 11f, 14f)
                close()
            }
        }.build()
        
        return _Zap!!
    }

private var _Zap: ImageVector? = null

