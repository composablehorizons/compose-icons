package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ManualGearbox: ImageVector
    get() {
        if (_ManualGearbox != null) return _ManualGearbox!!
        
        _ManualGearbox = ImageVector.Builder(
            name = "manual-gearbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 1f, 5.829f)
                verticalLineToRelative(1.171f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.001f, 3.001f, 0f, true, true, -4f, 2.829f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-2.17f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.001f, 3.001f, 0f, true, true, -4f, 2.829f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-6.341f)
                arcToRelative(3f, 3f, 0f, false, true, -2f, -2.829f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, true, true, 3.996f, 3.005f)
                lineToRelative(-0.001f, 2.171f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.17f)
                arcToRelative(3f, 3f, 0f, false, true, -2f, -2.83f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, true, true, 3.996f, 3.005f)
                lineToRelative(-0.001f, 2.171f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1.17f)
                arcToRelative(3f, 3f, 0f, false, true, -2f, -2.83f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, -2.824f)
            }
        }.build()
        
        return _ManualGearbox!!
    }

private var _ManualGearbox: ImageVector? = null

