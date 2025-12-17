package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MoodHappy: ImageVector
    get() {
        if (_MoodHappy != null) return _MoodHappy!!
        
        _MoodHappy = ImageVector.Builder(
            name = "mood-happy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                close()
                moveToRelative(-2f, 9.66f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(0.05f)
                arcToRelative(3.975f, 3.975f, 0f, false, false, 3.777f, 3.97f)
                lineToRelative(0.227f, 0.005f)
                arcToRelative(4.026f, 4.026f, 0f, false, false, 3.99f, -3.79f)
                lineToRelative(0.006f, -0.206f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1.029f)
                close()
                moveToRelative(-5.99f, -5f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                close()
                moveToRelative(6f, 0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                close()
            }
        }.build()
        
        return _MoodHappy!!
    }

private var _MoodHappy: ImageVector? = null

