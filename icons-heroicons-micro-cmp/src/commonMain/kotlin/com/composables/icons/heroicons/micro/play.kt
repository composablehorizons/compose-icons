package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Play: ImageVector
    get() {
        if (_Play != null) return _Play!!
        
        _Play = ImageVector.Builder(
            name = "play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3.732f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.305f, -1.265f)
                lineToRelative(6.706f, 4.267f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 2.531f)
                lineToRelative(-6.706f, 4.268f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 12.267f)
                verticalLineTo(3.732f)
                close()
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

