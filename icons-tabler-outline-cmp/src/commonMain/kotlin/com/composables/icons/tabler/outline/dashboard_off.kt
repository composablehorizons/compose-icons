package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DashboardOff: ImageVector
    get() {
        if (_DashboardOff != null) return _DashboardOff!!
        
        _DashboardOff = ImageVector.Builder(
            name = "dashboard-off",
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
                moveTo(11.175f, 11.178f)
                arcToRelative(2f, 2f, 0f, true, false, 2.653f, 2.634f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 10.5f)
                lineToRelative(1f, -1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.621f, 4.612f)
                arcToRelative(9f, 9f, 0f, false, true, 11.721f, 11.72f)
                moveToRelative(-1.516f, 2.488f)
                arcToRelative(9.008f, 9.008f, 0f, false, true, -1.226f, 1.18f)
                horizontalLineToRelative(-11.2f)
                arcToRelative(9f, 9f, 0f, false, true, -0.268f, -13.87f)
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
        
        return _DashboardOff!!
    }

private var _DashboardOff: ImageVector? = null

