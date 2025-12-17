package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) return _PlayCircle!!
        
        _PlayCircle = ImageVector.Builder(
            name = "play-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, -16f, 0f)
                close()
                moveToRelative(6.39f, -2.908f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.766f, 0.027f)
                lineToRelative(3.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.262f)
                lineToRelative(-3.5f, 2.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 12.25f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.39f, -0.658f)
                close()
            }
        }.build()
        
        return _PlayCircle!!
    }

private var _PlayCircle: ImageVector? = null

