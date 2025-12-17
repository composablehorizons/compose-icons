package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChartPieOff: ImageVector
    get() {
        if (_ChartPieOff != null) return _ChartPieOff!!
        
        _ChartPieOff = ImageVector.Builder(
            name = "chart-pie-off",
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
                moveTo(5.63f, 5.643f)
                arcToRelative(9f, 9f, 0f, false, false, 12.742f, 12.715f)
                moveToRelative(1.674f, -2.29f)
                arcToRelative(9.03f, 9.03f, 0f, false, false, 0.754f, -2.068f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2.8f)
                moveToRelative(-4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(-3f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, -1f, -0.8f)
                arcToRelative(9f, 9f, 0f, false, false, -2.057f, 0.749f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3.5f)
                arcToRelative(9f, 9f, 0f, false, true, 5.5f, 5.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _ChartPieOff!!
    }

private var _ChartPieOff: ImageVector? = null

