package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChartFunnel: ImageVector
    get() {
        if (_ChartFunnel != null) return _ChartFunnel!!
        
        _ChartFunnel = ImageVector.Builder(
            name = "chart-funnel",
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
                moveTo(4.387f, 3f)
                horizontalLineToRelative(15.226f)
                arcToRelative(1f, 1f, 0f, false, true, 0.948f, 1.316f)
                lineToRelative(-5.105f, 15.316f)
                arcToRelative(2f, 2f, 0f, false, true, -1.898f, 1.368f)
                horizontalLineToRelative(-3.116f)
                arcToRelative(2f, 2f, 0f, false, true, -1.898f, -1.368f)
                lineToRelative(-5.104f, -15.316f)
                arcToRelative(1f, 1f, 0f, false, true, 0.947f, -1.316f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 9f)
                horizontalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15f)
                horizontalLineToRelative(10f)
            }
        }.build()
        
        return _ChartFunnel!!
    }

private var _ChartFunnel: ImageVector? = null

