package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SunLow: ImageVector
    get() {
        if (_SunLow != null) return _SunLow!!
        
        _SunLow = ImageVector.Builder(
            name = "sun-low",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.407f, 16.993f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
                moveToRelative(-11.4f, 0f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
                moveToRelative(4.993f, -9.993f)
                arcToRelative(5f, 5f, 0f, true, true, -5f, 5f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, false, true, 4.995f, -4.783f)
                moveToRelative(-4.993f, -1.407f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
                moveToRelative(11.4f, 0f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1f, 1f, 0f, true, true, 1.414f, -1.414f)
                moveToRelative(-14.397f, 5.407f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                close()
                moveToRelative(7.99f, -8f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(8.01f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                close()
                moveToRelative(-8.01f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _SunLow!!
    }

private var _SunLow: ImageVector? = null

