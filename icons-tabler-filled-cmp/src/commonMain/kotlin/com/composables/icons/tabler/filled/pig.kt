package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Pig: ImageVector
    get() {
        if (_Pig != null) return _Pig!!
        
        _Pig = ImageVector.Builder(
            name = "pig",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.999f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1.001f, 1f)
                verticalLineToRelative(3.255f)
                lineToRelative(0.026f, 0.018f)
                arcToRelative(7f, 7f, 0f, false, true, 2.204f, 2.537f)
                lineToRelative(0.092f, 0.19f)
                horizontalLineToRelative(0.676f)
                arcToRelative(2f, 2f, 0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-0.676f)
                lineToRelative(-0.104f, 0.213f)
                arcToRelative(7f, 7f, 0f, false, true, -1.097f, 1.558f)
                lineToRelative(-0.123f, 0.125f)
                verticalLineToRelative(1.604f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.336f, 2.495f)
                lineToRelative(-0.162f, 0.005f)
                curveToRelative(-1.16f, 0f, -2.135f, -0.79f, -2.418f, -1.86f)
                lineToRelative(-0.032f, -0.141f)
                lineToRelative(-4.05f, 0.001f)
                lineToRelative(-0.05f, -0.002f)
                lineToRelative(-0.032f, 0.141f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.254f, 1.856f)
                lineToRelative(-0.164f, 0.005f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-1.602f)
                lineToRelative(-0.056f, -0.055f)
                arcToRelative(7f, 7f, 0f, false, true, -1.576f, -7.085f)
                lineToRelative(0.092f, -0.256f)
                arcToRelative(7f, 7f, 0f, false, true, 6.539f, -4.502f)
                horizontalLineToRelative(2.196f)
                lineToRelative(4.25f, -2.832f)
                arcToRelative(1f, 1f, 0f, false, true, 0.436f, -0.161f)
                close()
                moveToRelative(-0.999f, 8f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, 0.117f)
                lineToRelative(0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _Pig!!
    }

private var _Pig: ImageVector? = null

