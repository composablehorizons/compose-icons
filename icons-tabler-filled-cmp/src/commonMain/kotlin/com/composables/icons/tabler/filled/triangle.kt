package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Triangle: ImageVector
    get() {
        if (_Triangle != null) return _Triangle!!
        
        _Triangle = ImageVector.Builder(
            name = "triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1.67f)
                arcToRelative(2.914f, 2.914f, 0f, false, false, -2.492f, 1.403f)
                lineToRelative(-8.11f, 13.537f)
                arcToRelative(2.914f, 2.914f, 0f, false, false, 2.484f, 4.385f)
                horizontalLineToRelative(16.225f)
                arcToRelative(2.914f, 2.914f, 0f, false, false, 2.503f, -4.371f)
                lineToRelative(-8.116f, -13.546f)
                arcToRelative(2.917f, 2.917f, 0f, false, false, -2.494f, -1.408f)
                close()
            }
        }.build()
        
        return _Triangle!!
    }

private var _Triangle: ImageVector? = null

