package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AlarmSmoke: ImageVector
    get() {
        if (_AlarmSmoke != null) return _AlarmSmoke!!
        
        _AlarmSmoke = ImageVector.Builder(
            name = "alarm-smoke",
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
                moveTo(18f, 8f)
                lineToRelative(-0.8f, 3f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, -1.2f, 1f)
                horizontalLineToRelative(-8f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, -1.2f, -1f)
                lineToRelative(-0.8f, -3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 4f)
                moveToRelative(0f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-16f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                curveToRelative(0.643f, 0.288f, 1.017f, 0.756f, 1f, 1.25f)
                curveToRelative(0.017f, 0.494f, -0.357f, 0.962f, -1f, 1.25f)
                reflectiveCurveToRelative(-1.017f, 0.756f, -1f, 1.25f)
                curveToRelative(-0.017f, 0.494f, 0.357f, 0.962f, 1f, 1.25f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16f)
                curveToRelative(0.643f, 0.288f, 1.017f, 0.756f, 1f, 1.25f)
                curveToRelative(0.017f, 0.494f, -0.357f, 0.962f, -1f, 1.25f)
                reflectiveCurveToRelative(-1.017f, 0.756f, -1f, 1.25f)
                curveToRelative(-0.017f, 0.494f, 0.357f, 0.962f, 1f, 1.25f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16f)
                curveToRelative(0.643f, 0.288f, 1.017f, 0.756f, 1f, 1.25f)
                curveToRelative(0.017f, 0.494f, -0.357f, 0.962f, -1f, 1.25f)
                reflectiveCurveToRelative(-1.017f, 0.756f, -1f, 1.25f)
                curveToRelative(-0.017f, 0.494f, 0.357f, 0.962f, 1f, 1.25f)
            }
        }.build()
        
        return _AlarmSmoke!!
    }

private var _AlarmSmoke: ImageVector? = null

