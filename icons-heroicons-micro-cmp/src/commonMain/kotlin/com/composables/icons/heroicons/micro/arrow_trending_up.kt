package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowTrendingUp: ImageVector
    get() {
        if (_ArrowTrendingUp != null) return _ArrowTrendingUp!!
        
        _ArrowTrendingUp = ImageVector.Builder(
            name = "arrow-trending-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.808f, 4.057f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.92f, -0.527f)
                lineToRelative(3.116f, 0.849f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.528f, 0.915f)
                lineToRelative(-0.823f, 3.121f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.45f, -0.382f)
                lineToRelative(0.337f, -1.281f)
                arcToRelative(23.484f, 23.484f, 0f, false, false, -3.609f, 3.056f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.07f, 0.01f)
                lineTo(6f, 8.06f)
                lineToRelative(-3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.061f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(1.756f, 1.755f)
                arcToRelative(25.015f, 25.015f, 0f, false, true, 3.508f, -2.85f)
                lineToRelative(-1.46f, -0.398f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.526f, -0.92f)
                close()
            }
        }.build()
        
        return _ArrowTrendingUp!!
    }

private var _ArrowTrendingUp: ImageVector? = null

