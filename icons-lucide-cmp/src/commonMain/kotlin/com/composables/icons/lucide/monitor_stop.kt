package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MonitorStop: ImageVector
    get() {
        if (_MonitorStop != null) return _MonitorStop!!
        
        _MonitorStop = ImageVector.Builder(
            name = "monitor-stop",
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
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 20f, 17f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 4f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 7f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, false, true, 15f, 8f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, false, true, 14f, 13f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, false, true, 9f, 12f)
                verticalLineTo(8f)
                arcTo(1f, 1f, 0f, false, true, 10f, 7f)
                close()
            }
        }.build()
        
        return _MonitorStop!!
    }

private var _MonitorStop: ImageVector? = null

