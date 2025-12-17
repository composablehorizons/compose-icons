package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Moon: ImageVector
    get() {
        if (_Moon != null) return _Moon!!
        
        _Moon = ImageVector.Builder(
            name = "moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.528f, 1.718f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.162f, 0.819f)
                arcTo(8.97f, 8.97f, 0f, false, false, 9f, 6f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, 9f)
                arcToRelative(8.97f, 8.97f, 0f, false, false, 3.463f, -0.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.981f, 0.98f)
                arcToRelative(10.503f, 10.503f, 0f, false, true, -9.694f, 6.46f)
                curveToRelative(-5.799f, 0f, -10.5f, -4.7f, -10.5f, -10.5f)
                curveToRelative(0f, -4.368f, 2.667f, -8.112f, 6.46f, -9.694f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.818f, 0.162f)
                close()
            }
        }.build()
        
        return _Moon!!
    }

private var _Moon: ImageVector? = null

