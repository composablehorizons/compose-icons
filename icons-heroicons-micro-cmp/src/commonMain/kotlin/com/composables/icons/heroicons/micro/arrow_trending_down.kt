package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowTrendingDown: ImageVector
    get() {
        if (_ArrowTrendingDown != null) return _ArrowTrendingDown!!
        
        _ArrowTrendingDown = ImageVector.Builder(
            name = "arrow-trending-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.22f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineTo(6f, 7.94f)
                lineToRelative(2.761f, -2.762f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.158f, 0.12f)
                arcToRelative(24.9f, 24.9f, 0f, false, true, 2.718f, 5.556f)
                lineToRelative(0.729f, -1.261f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.299f, 0.75f)
                lineToRelative(-1.591f, 2.755f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.025f, 0.275f)
                lineToRelative(-2.756f, -1.591f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.75f, -1.3f)
                lineToRelative(1.097f, 0.634f)
                arcToRelative(23.417f, 23.417f, 0f, false, false, -1.984f, -4.211f)
                lineTo(6.53f, 9.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineTo(1.22f, 5.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _ArrowTrendingDown!!
    }

private var _ArrowTrendingDown: ImageVector? = null

