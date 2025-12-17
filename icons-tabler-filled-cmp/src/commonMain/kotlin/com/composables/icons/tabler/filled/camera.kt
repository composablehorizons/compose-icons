package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                arcToRelative(2f, 2f, 0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(6f)
                close()
                moveToRelative(-3f, 7f)
                arcToRelative(3f, 3f, 0f, false, false, -2.985f, 2.698f)
                lineToRelative(-0.011f, 0.152f)
                lineToRelative(-0.004f, 0.15f)
                lineToRelative(0.004f, 0.15f)
                arcToRelative(3f, 3f, 0f, true, false, 2.996f, -3.15f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

