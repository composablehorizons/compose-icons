package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.AutomaticGearbox: ImageVector
    get() {
        if (_AutomaticGearbox != null) return _AutomaticGearbox!!
        
        _AutomaticGearbox = ImageVector.Builder(
            name = "automatic-gearbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 16f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(0f, 4f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                close()
                moveToRelative(0.5f, -13f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, 5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(-0.5f, 3f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                horizontalLineToRelative(-0.5f)
                close()
                moveToRelative(-5f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-2.17f)
                arcToRelative(3f, 3f, 0f, false, true, -2f, -2.83f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, true, true, 3.996f, 3.005f)
                lineToRelative(-0.001f, 2.171f)
                close()
            }
        }.build()
        
        return _AutomaticGearbox!!
    }

private var _AutomaticGearbox: ImageVector? = null

