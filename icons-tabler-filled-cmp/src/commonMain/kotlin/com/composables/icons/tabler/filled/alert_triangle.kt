package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.AlertTriangle: ImageVector
    get() {
        if (_AlertTriangle != null) return _AlertTriangle!!
        
        _AlertTriangle = ImageVector.Builder(
            name = "alert-triangle",
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
                moveToRelative(0.01f, 13.33f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveToRelative(-0.01f, -7f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(4f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-4f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _AlertTriangle!!
    }

private var _AlertTriangle: ImageVector? = null

