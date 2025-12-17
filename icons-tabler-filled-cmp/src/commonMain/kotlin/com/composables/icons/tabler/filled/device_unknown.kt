package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DeviceUnknown: ImageVector
    get() {
        if (_DeviceUnknown != null) return _DeviceUnknown!!
        
        _DeviceUnknown = ImageVector.Builder(
            name = "device-unknown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-5f, 13f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(1.368f, -6.673f)
                arcToRelative(2.98f, 2.98f, 0f, false, false, -3.631f, 0.728f)
                arcToRelative(1f, 1f, 0f, false, false, 1.526f, 1.292f)
                arcToRelative(0.98f, 0.98f, 0f, false, true, 1.195f, -0.239f)
                arcToRelative(1f, 1f, 0f, false, true, -0.455f, 1.892f)
                arcToRelative(1f, 1f, 0f, false, false, -0.006f, 2f)
                arcToRelative(3f, 3f, 0f, false, false, 1.371f, -5.673f)
            }
        }.build()
        
        return _DeviceUnknown!!
    }

private var _DeviceUnknown: ImageVector? = null

