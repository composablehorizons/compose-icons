package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChartDonut: ImageVector
    get() {
        if (_ChartDonut != null) return _ChartDonut!!
        
        _ChartDonut = ImageVector.Builder(
            name = "chart-donut",
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
                moveTo(10f, 3.2f)
                arcToRelative(9f, 9f, 0f, true, false, 10.8f, 10.8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-3.8f)
                arcToRelative(4.1f, 4.1f, 0f, true, true, -5f, -5f)
                verticalLineToRelative(-4f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, -1f, -0.8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3.5f)
                arcToRelative(9f, 9f, 0f, false, true, 5.5f, 5.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(9f, 9f, 0f, false, false, -1f, -1f)
                verticalLineToRelative(-4.5f)
            }
        }.build()
        
        return _ChartDonut!!
    }

private var _ChartDonut: ImageVector? = null

