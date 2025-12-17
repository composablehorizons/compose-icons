package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Slash: ImageVector
    get() {
        if (_Slash != null) return _Slash!!
        
        _Slash = ImageVector.Builder(
            name = "slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.256f, 3.042f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.449f, 0.962f)
                lineToRelative(-6f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.41f, -0.513f)
                lineToRelative(6f, -16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.961f, -0.449f)
                close()
            }
        }.build()
        
        return _Slash!!
    }

private var _Slash: ImageVector? = null

