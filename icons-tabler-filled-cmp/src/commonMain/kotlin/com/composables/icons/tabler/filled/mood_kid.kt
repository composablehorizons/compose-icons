package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MoodKid: ImageVector
    get() {
        if (_MoodKid != null) return _MoodKid!!
        
        _MoodKid = ImageVector.Builder(
            name = "mood-kid",
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
                arcToRelative(10f, 10f, 0f, false, true, 7.046f, -9.232f)
                arcToRelative(3f, 3f, 0f, false, false, 2.949f, 3.556f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, -1.993f)
                curveToRelative(1.726f, 0f, 3.453f, 0.447f, 5f, 1.34f)
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
        
        return _MoodKid!!
    }

private var _MoodKid: ImageVector? = null

