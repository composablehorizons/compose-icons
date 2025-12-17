package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Ghost2: ImageVector
    get() {
        if (_Ghost2 != null) return _Ghost2!!
        
        _Ghost2 = ImageVector.Builder(
            name = "ghost-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1.999f)
                lineToRelative(0.041f, 0.002f)
                lineToRelative(0.208f, 0.003f)
                arcToRelative(8f, 8f, 0f, false, true, 7.747f, 7.747f)
                lineToRelative(0.003f, 0.248f)
                lineToRelative(0.177f, 0.006f)
                arcToRelative(3f, 3f, 0f, false, true, 2.819f, 2.819f)
                lineToRelative(0.005f, 0.176f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                lineToRelative(-0.001f, 1.696f)
                lineToRelative(1.833f, 2.75f)
                arcToRelative(1f, 1f, 0f, false, true, -0.72f, 1.548f)
                lineToRelative(-0.112f, 0.006f)
                horizontalLineToRelative(-10f)
                curveToRelative(-3.445f, 0.002f, -6.327f, -2.49f, -6.901f, -5.824f)
                lineToRelative(-0.028f, -0.178f)
                lineToRelative(-0.071f, 0.001f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.175f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                lineToRelative(0.004f, -0.25f)
                arcToRelative(8f, 8f, 0f, false, true, 7.996f, -7.75f)
                close()
                moveToRelative(0f, 10.001f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(-1.99f, -4f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                close()
                moveToRelative(4f, 0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                close()
            }
        }.build()
        
        return _Ghost2!!
    }

private var _Ghost2: ImageVector? = null

