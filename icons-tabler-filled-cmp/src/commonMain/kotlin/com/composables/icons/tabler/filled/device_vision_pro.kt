package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DeviceVisionPro: ImageVector
    get() {
        if (_DeviceVisionPro != null) return _DeviceVisionPro!!
        
        _DeviceVisionPro = ImageVector.Builder(
            name = "device-vision-pro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6f)
                quadToRelative(1.74f, 0f, 3.342f, 0.106f)
                quadToRelative(1.619f, 0.107f, 2.973f, 0.448f)
                quadToRelative(1.388f, 0.345f, 2.436f, 1.05f)
                arcToRelative(4.9f, 4.9f, 0f, false, true, 1.665f, 1.916f)
                curveToRelative(0.397f, 0.801f, 0.584f, 1.769f, 0.584f, 2.91f)
                curveToRelative(0f, 1.156f, -0.222f, 2.208f, -0.673f, 3.14f)
                curveToRelative(-0.45f, 0.934f, -1.073f, 1.685f, -1.868f, 2.236f)
                arcToRelative(4.7f, 4.7f, 0f, false, true, -2.73f, 0.839f)
                quadToRelative(-0.932f, 0.001f, -1.703f, -0.263f)
                arcToRelative(7f, 7f, 0f, false, true, -1.374f, -0.644f)
                arcToRelative(20f, 20f, 0f, false, true, -1.107f, -0.736f)
                arcToRelative(8f, 8f, 0f, false, false, -0.901f, -0.567f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, -0.643f, -0.174f)
                curveToRelative(-0.209f, 0f, -0.426f, 0.057f, -0.658f, 0.18f)
                quadToRelative(-0.42f, 0.226f, -0.893f, 0.564f)
                arcToRelative(20f, 20f, 0f, false, true, -1.105f, 0.733f)
                arcToRelative(6.8f, 6.8f, 0f, false, true, -1.366f, 0.642f)
                arcToRelative(5.2f, 5.2f, 0f, false, true, -1.688f, 0.264f)
                arcToRelative(4.7f, 4.7f, 0f, false, true, -2.75f, -0.838f)
                curveToRelative(-0.794f, -0.55f, -1.418f, -1.302f, -1.868f, -2.234f)
                quadToRelative(-0.675f, -1.407f, -0.673f, -3.14f)
                curveToRelative(-0.005f, -1.135f, 0.182f, -2.105f, 0.577f, -2.9f)
                arcToRelative(4.9f, 4.9f, 0f, false, true, 1.673f, -1.926f)
                curveToRelative(0.699f, -0.47f, 1.511f, -0.816f, 2.442f, -1.049f)
                arcToRelative(17f, 17f, 0f, false, true, 2.968f, -0.447f)
                quadToRelative(1.599f, -0.11f, 3.34f, -0.11f)
            }
        }.build()
        
        return _DeviceVisionPro!!
    }

private var _DeviceVisionPro: ImageVector? = null

