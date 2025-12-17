package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DeviceComputerCameraOff: ImageVector
    get() {
        if (_DeviceComputerCameraOff != null) return _DeviceComputerCameraOff!!
        
        _DeviceComputerCameraOff = ImageVector.Builder(
            name = "device-computer-camera-off",
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
                moveTo(6.15f, 6.153f)
                arcToRelative(7f, 7f, 0f, false, false, 9.696f, 9.696f)
                moveToRelative(2f, -2f)
                arcToRelative(7f, 7f, 0f, false, false, -9.699f, -9.695f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.13f, 9.122f)
                arcToRelative(3f, 3f, 0f, false, false, 3.743f, 3.749f)
                moveToRelative(2f, -2f)
                arcToRelative(3f, 3f, 0f, false, false, -3.737f, -3.736f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                lineToRelative(-2.091f, 3.486f)
                arcToRelative(1f, 1f, 0f, false, false, 0.857f, 1.514f)
                horizontalLineToRelative(10.468f)
                arcToRelative(1f, 1f, 0f, false, false, 0.857f, -1.514f)
                lineToRelative(-2.091f, -3.486f)
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
        
        return _DeviceComputerCameraOff!!
    }

private var _DeviceComputerCameraOff: ImageVector? = null

