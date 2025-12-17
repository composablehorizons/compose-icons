package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Cube: ImageVector
    get() {
        if (_Cube != null) return _Cube!!
        
        _Cube = ImageVector.Builder(
            name = "cube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(239.1f, 6.3f)
                lineToRelative(-208f, 78f)
                curveToRelative(-18.7f, 7f, -31.1f, 25f, -31.1f, 45f)
                verticalLineToRelative(225.1f)
                curveToRelative(0f, 18.2f, 10.3f, 34.8f, 26.5f, 42.9f)
                lineToRelative(208f, 104f)
                curveToRelative(13.5f, 6.8f, 29.4f, 6.8f, 42.9f, 0f)
                lineToRelative(208f, -104f)
                curveToRelative(16.3f, -8.1f, 26.5f, -24.8f, 26.5f, -42.9f)
                verticalLineTo(129.3f)
                curveToRelative(0f, -20f, -12.4f, -37.9f, -31.1f, -44.9f)
                lineToRelative(-208f, -78f)
                curveTo(262f, 2.2f, 250f, 2.2f, 239.1f, 6.3f)
                close()
                moveTo(256f, 68.4f)
                lineToRelative(192f, 72f)
                verticalLineToRelative(1.1f)
                lineToRelative(-192f, 78f)
                lineToRelative(-192f, -78f)
                verticalLineToRelative(-1.1f)
                lineToRelative(192f, -72f)
                close()
                moveToRelative(32f, 356f)
                verticalLineTo(275.5f)
                lineToRelative(160f, -65f)
                verticalLineToRelative(133.9f)
                lineToRelative(-160f, 80f)
                close()
            }
        }.build()
        
        return _Cube!!
    }

private var _Cube: ImageVector? = null

