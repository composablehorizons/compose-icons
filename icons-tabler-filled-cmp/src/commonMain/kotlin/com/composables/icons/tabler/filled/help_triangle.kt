package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.HelpTriangle: ImageVector
    get() {
        if (_HelpTriangle != null) return _HelpTriangle!!
        
        _HelpTriangle = ImageVector.Builder(
            name = "help-triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1.67f)
                curveToRelative(0.955f, 0f, 1.845f, 0.467f, 2.39f, 1.247f)
                lineToRelative(0.105f, 0.16f)
                lineToRelative(8.114f, 13.548f)
                arcToRelative(2.914f, 2.914f, 0f, false, true, -2.307f, 4.363f)
                lineToRelative(-0.195f, 0.008f)
                horizontalLineToRelative(-16.225f)
                arcToRelative(2.914f, 2.914f, 0f, false, true, -2.582f, -4.2f)
                lineToRelative(0.099f, -0.185f)
                lineToRelative(8.11f, -13.538f)
                arcToRelative(2.914f, 2.914f, 0f, false, true, 2.491f, -1.403f)
                close()
                moveToRelative(0f, 13.33f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(1.368f, -6.673f)
                arcToRelative(2.98f, 2.98f, 0f, false, false, -3.631f, 0.728f)
                arcToRelative(1f, 1f, 0f, false, false, 1.44f, 1.383f)
                lineToRelative(0.171f, -0.18f)
                arcToRelative(0.98f, 0.98f, 0f, false, true, 1.11f, -0.15f)
                arcToRelative(1f, 1f, 0f, false, true, -0.34f, 1.886f)
                lineToRelative(-0.232f, 0.012f)
                arcToRelative(1f, 1f, 0f, false, false, 0.111f, 1.994f)
                arcToRelative(3f, 3f, 0f, false, false, 1.371f, -5.673f)
                close()
            }
        }.build()
        
        return _HelpTriangle!!
    }

private var _HelpTriangle: ImageVector? = null

