package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Check: ImageVector
    get() {
        if (_Check != null) return _Check!!
        
        _Check = ImageVector.Builder(
            name = "check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.704f, 4.153f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.143f, 1.052f)
                lineToRelative(-8f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.127f, 0.075f)
                lineToRelative(-4.5f, -4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(3.894f, 3.893f)
                lineToRelative(7.48f, -9.817f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.05f, -0.143f)
                close()
            }
        }.build()
        
        return _Check!!
    }

private var _Check: ImageVector? = null

