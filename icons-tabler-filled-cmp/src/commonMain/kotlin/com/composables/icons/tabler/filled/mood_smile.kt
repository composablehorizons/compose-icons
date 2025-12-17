package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MoodSmile: ImageVector
    get() {
        if (_MoodSmile != null) return _MoodSmile!!
        
        _MoodSmile = ImageVector.Builder(
            name = "mood-smile",
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
                moveToRelative(-1.8f, 10.946f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0.014f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.572f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.428f, 1.4f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 6.428f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -0.014f, -1.414f)
                close()
                moveToRelative(-6.19f, -5.286f)
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
        
        return _MoodSmile!!
    }

private var _MoodSmile: ImageVector? = null

