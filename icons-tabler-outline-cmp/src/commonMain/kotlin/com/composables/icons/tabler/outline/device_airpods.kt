package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DeviceAirpods: ImageVector
    get() {
        if (_DeviceAirpods != null) return _DeviceAirpods!!
        
        _DeviceAirpods = ImageVector.Builder(
            name = "device-airpods",
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
                moveTo(6f, 4f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 3.8f)
                lineToRelative(0f, 0.2f)
                verticalLineToRelative(10.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -3.8f)
                lineToRelative(0f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 4f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 3.8f)
                lineToRelative(0f, 0.2f)
                verticalLineToRelative(10.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -3.8f)
                lineToRelative(0f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                close()
            }
        }.build()
        
        return _DeviceAirpods!!
    }

private var _DeviceAirpods: ImageVector? = null

