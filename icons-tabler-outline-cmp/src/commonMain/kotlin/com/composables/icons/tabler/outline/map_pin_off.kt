package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MapPinOff: ImageVector
    get() {
        if (_MapPinOff != null) return _MapPinOff!!
        
        _MapPinOff = ImageVector.Builder(
            name = "map-pin-off",
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
                moveTo(9.442f, 9.432f)
                arcToRelative(3f, 3f, 0f, false, false, 4.113f, 4.134f)
                moveToRelative(1.445f, -2.566f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.152f, 17.162f)
                lineToRelative(-3.738f, 3.738f)
                arcToRelative(2f, 2f, 0f, false, true, -2.827f, 0f)
                lineToRelative(-4.244f, -4.243f)
                arcToRelative(8f, 8f, 0f, false, true, -0.476f, -10.794f)
                moveToRelative(2.18f, -1.82f)
                arcToRelative(8.003f, 8.003f, 0f, false, true, 10.91f, 10.912f)
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
        
        return _MapPinOff!!
    }

private var _MapPinOff: ImageVector? = null

