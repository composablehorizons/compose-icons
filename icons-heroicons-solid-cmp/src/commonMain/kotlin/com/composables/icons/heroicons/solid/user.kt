package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.User: ImageVector
    get() {
        if (_User != null) return _User!!
        
        _User = ImageVector.Builder(
            name = "user",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 6f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 9f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -9f, 0f)
                close()
                moveTo(3.751f, 20.105f)
                arcToRelative(8.25f, 8.25f, 0f, false, true, 16.498f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.437f, 0.695f)
                arcTo(18.683f, 18.683f, 0f, false, true, 12f, 22.5f)
                curveToRelative(-2.786f, 0f, -5.433f, -0.608f, -7.812f, -1.7f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.437f, -0.695f)
                close()
            }
        }.build()
        
        return _User!!
    }

private var _User: ImageVector? = null

