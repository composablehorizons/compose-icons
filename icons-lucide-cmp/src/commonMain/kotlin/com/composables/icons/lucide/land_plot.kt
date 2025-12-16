package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LandPlot: ImageVector
    get() {
        if (_LandPlot != null) return _LandPlot!!
        
        _LandPlot = ImageVector.Builder(
            name = "land-plot",
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
                moveTo(12f, 8f)
                lineToRelative(6f, -3f)
                lineToRelative(-6f, -3f)
                verticalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 11.99f)
                lineToRelative(-5.5f, 3.14f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.74f)
                lineToRelative(8.5f, 4.86f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 0f)
                lineToRelative(8.5f, -4.86f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.74f)
                lineTo(16f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.49f, 12.85f)
                lineToRelative(11.02f, 6.3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.51f, 12.85f)
                lineTo(6.5f, 19.15f)
            }
        }.build()
        
        return _LandPlot!!
    }

private var _LandPlot: ImageVector? = null

