package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DeviceImac: ImageVector
    get() {
        if (_DeviceImac != null) return _DeviceImac!!
        
        _DeviceImac = ImageVector.Builder(
            name = "device-imac",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 22f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(0.616f)
                lineToRelative(0.25f, -2f)
                horizontalLineToRelative(-4.866f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-4.867f)
                lineToRelative(0.25f, 2f)
                horizontalLineToRelative(0.617f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                close()
                moveToRelative(5.116f, -4f)
                horizontalLineToRelative(-2.233f)
                lineToRelative(-0.25f, 2f)
                horizontalLineToRelative(2.733f)
                close()
            }
        }.build()
        
        return _DeviceImac!!
    }

private var _DeviceImac: ImageVector? = null

