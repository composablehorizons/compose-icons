package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DeviceNintendoOff: ImageVector
    get() {
        if (_DeviceNintendoOff != null) return _DeviceNintendoOff!!
        
        _DeviceNintendoOff = ImageVector.Builder(
            name = "device-nintendo-off",
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
                moveTo(4.713f, 4.718f)
                arcToRelative(4f, 4f, 0f, false, false, -1.713f, 3.282f)
                verticalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-10f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.308f, -0.035f, 0.608f, -0.1f, 0.896f)
                moveToRelative(-1.62f, 2.39f)
                arcToRelative(3.982f, 3.982f, 0f, false, true, -2.28f, 0.714f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 8.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
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
        }.build()
        
        return _DeviceNintendoOff!!
    }

private var _DeviceNintendoOff: ImageVector? = null

