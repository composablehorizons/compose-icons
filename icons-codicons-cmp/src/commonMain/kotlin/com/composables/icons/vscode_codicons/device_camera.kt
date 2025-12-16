package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DeviceCamera: ImageVector
    get() {
        if (_DeviceCamera != null) return _DeviceCamera!!
        
        _DeviceCamera = ImageVector.Builder(
            name = "device-camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 8f)
                curveTo(11f, 9.65685f, 9.65685f, 11f, 8f, 11f)
                curveTo(6.34315f, 11f, 5f, 9.65685f, 5f, 8f)
                curveTo(5f, 6.34315f, 6.34315f, 5f, 8f, 5f)
                curveTo(9.65685f, 5f, 11f, 6.34315f, 11f, 8f)
                close()
                moveTo(10f, 8f)
                curveTo(10f, 6.89543f, 9.10457f, 6f, 8f, 6f)
                curveTo(6.89543f, 6f, 6f, 6.89543f, 6f, 8f)
                curveTo(6f, 9.10457f, 6.89543f, 10f, 8f, 10f)
                curveTo(9.10457f, 10f, 10f, 9.10457f, 10f, 8f)
                close()
                moveTo(6.61803f, 2f)
                curveTo(6.04988f, 2f, 5.53048f, 2.321f, 5.27639f, 2.82918f)
                lineTo(4.69098f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89543f, 4f, 2f, 4.89543f, 2f, 6f)
                verticalLineTo(11f)
                curveTo(2f, 12.1046f, 2.89543f, 13f, 4f, 13f)
                horizontalLineTo(12f)
                curveTo(13.1046f, 13f, 14f, 12.1046f, 14f, 11f)
                verticalLineTo(6f)
                curveTo(14f, 4.89543f, 13.1046f, 4f, 12f, 4f)
                horizontalLineTo(11.309f)
                lineTo(10.7236f, 2.82918f)
                curveTo(10.4695f, 2.321f, 9.95012f, 2f, 9.38197f, 2f)
                horizontalLineTo(6.61803f)
                close()
                moveTo(6.17082f, 3.27639f)
                curveTo(6.25552f, 3.107f, 6.42865f, 3f, 6.61803f, 3f)
                horizontalLineTo(9.38197f)
                curveTo(9.57135f, 3f, 9.74448f, 3.107f, 9.82918f, 3.27639f)
                lineTo(10.5528f, 4.72361f)
                curveTo(10.6375f, 4.893f, 10.8106f, 5f, 11f, 5f)
                horizontalLineTo(12f)
                curveTo(12.5523f, 5f, 13f, 5.44772f, 13f, 6f)
                verticalLineTo(11f)
                curveTo(13f, 11.5523f, 12.5523f, 12f, 12f, 12f)
                horizontalLineTo(4f)
                curveTo(3.44772f, 12f, 3f, 11.5523f, 3f, 11f)
                verticalLineTo(6f)
                curveTo(3f, 5.44772f, 3.44772f, 5f, 4f, 5f)
                horizontalLineTo(5f)
                curveTo(5.18939f, 5f, 5.36252f, 4.893f, 5.44721f, 4.72361f)
                lineTo(6.17082f, 3.27639f)
                close()
            }
        }.build()
        
        return _DeviceCamera!!
    }

private var _DeviceCamera: ImageVector? = null

