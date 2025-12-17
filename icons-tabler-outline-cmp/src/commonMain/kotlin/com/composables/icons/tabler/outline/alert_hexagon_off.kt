package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AlertHexagonOff: ImageVector
    get() {
        if (_AlertHexagonOff != null) return _AlertHexagonOff!!
        
        _AlertHexagonOff = ImageVector.Builder(
            name = "alert-hexagon-off",
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
                moveTo(18.36f, 18.387f)
                lineToRelative(-5.268f, 3.333f)
                arcToRelative(2.269f, 2.269f, 0f, false, true, -2.184f, 0f)
                lineToRelative(-6.75f, -4.27f)
                arcToRelative(2.225f, 2.225f, 0f, false, true, -1.158f, -1.948f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0f, -0.809f, 0.443f, -1.554f, 1.158f, -1.947f)
                lineToRelative(1.317f, -0.777f)
                moveToRelative(2.535f, -1.493f)
                lineToRelative(2.898f, -1.709f)
                arcToRelative(2.33f, 2.33f, 0f, false, true, 2.25f, 0f)
                lineToRelative(6.75f, 3.98f)
                horizontalLineToRelative(-0.033f)
                curveToRelative(0.7f, 0.398f, 1.13f, 1.143f, 1.125f, 1.948f)
                verticalLineToRelative(7.284f)
                curveToRelative(0f, 0.414f, -0.116f, 0.812f, -0.326f, 1.155f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                verticalLineToRelative(1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                verticalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _AlertHexagonOff!!
    }

private var _AlertHexagonOff: ImageVector? = null

