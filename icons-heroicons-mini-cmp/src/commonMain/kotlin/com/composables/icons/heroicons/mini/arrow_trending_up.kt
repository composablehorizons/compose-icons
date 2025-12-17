package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTrendingUp: ImageVector
    get() {
        if (_ArrowTrendingUp != null) return _ArrowTrendingUp!!
        
        _ArrowTrendingUp = ImageVector.Builder(
            name = "arrow-trending-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.577f, 4.878f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.919f, -0.53f)
                lineToRelative(4.78f, 1.281f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.531f, 0.919f)
                lineToRelative(-1.281f, 4.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.449f, -0.387f)
                lineToRelative(0.81f, -3.022f)
                arcToRelative(19.407f, 19.407f, 0f, false, false, -5.594f, 5.203f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.139f, 0.093f)
                lineTo(7f, 10.06f)
                lineToRelative(-4.72f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.061f)
                lineToRelative(5.25f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(3.074f, 3.073f)
                arcToRelative(20.923f, 20.923f, 0f, false, true, 5.545f, -4.931f)
                lineToRelative(-3.042f, -0.815f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.53f, -0.919f)
                close()
            }
        }.build()
        
        return _ArrowTrendingUp!!
    }

private var _ArrowTrendingUp: ImageVector? = null

