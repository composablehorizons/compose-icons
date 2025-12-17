package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTrendingDown: ImageVector
    get() {
        if (_ArrowTrendingDown != null) return _ArrowTrendingDown!!
        
        _ArrowTrendingDown = ImageVector.Builder(
            name = "arrow-trending-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.22f, 5.222f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineTo(7f, 9.942f)
                lineToRelative(3.768f, -3.769f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.113f, 0.058f)
                arcToRelative(20.908f, 20.908f, 0f, false, true, 3.813f, 7.254f)
                lineToRelative(1.574f, -2.727f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.3f, 0.75f)
                lineToRelative(-2.475f, 4.286f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.025f, 0.275f)
                lineToRelative(-4.287f, -2.475f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -1.3f)
                lineToRelative(2.71f, 1.565f)
                arcToRelative(19.422f, 19.422f, 0f, false, false, -3.013f, -6.024f)
                lineTo(7.53f, 11.533f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-5.25f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _ArrowTrendingDown!!
    }

private var _ArrowTrendingDown: ImageVector? = null

