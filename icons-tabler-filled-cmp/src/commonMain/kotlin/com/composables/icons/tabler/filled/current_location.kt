package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CurrentLocation: ImageVector
    get() {
        if (_CurrentLocation != null) return _CurrentLocation!!
        
        _CurrentLocation = ImageVector.Builder(
            name = "current-location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1.055f)
                arcToRelative(9.004f, 9.004f, 0f, false, true, 7.946f, 7.945f)
                horizontalLineToRelative(1.054f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-1.055f)
                arcToRelative(9.004f, 9.004f, 0f, false, true, -7.944f, 7.945f)
                lineToRelative(-0.001f, 1.055f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-1.055f)
                arcToRelative(9.004f, 9.004f, 0f, false, true, -7.945f, -7.944f)
                lineToRelative(-1.055f, -0.001f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(1.055f)
                arcToRelative(9.004f, 9.004f, 0f, false, true, 7.945f, -7.945f)
                verticalLineToRelative(-1.055f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(0f, 4f)
                arcToRelative(7f, 7f, 0f, true, false, 0f, 14f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, -14f)
                moveToRelative(0f, 3f)
                arcToRelative(4f, 4f, 0f, true, true, -4f, 4f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, -3.8f)
            }
        }.build()
        
        return _CurrentLocation!!
    }

private var _CurrentLocation: ImageVector? = null

