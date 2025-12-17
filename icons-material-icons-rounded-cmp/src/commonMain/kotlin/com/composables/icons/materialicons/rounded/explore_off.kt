package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Explore_off: ImageVector
    get() {
        if (_Explore_off != null) return _Explore_off!!
        
        _Explore_off = ImageVector.Builder(
            name = "explore_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 6f)
                lineToRelative(-2.91f, 6.26f)
                lineToRelative(5.25f, 5.25f)
                curveTo(21.39f, 15.93f, 22f, 14.04f, 22f, 12f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                curveToRelative(-2.04f, 0f, -3.93f, 0.61f, -5.51f, 1.66f)
                lineToRelative(5.25f, 5.25f)
                lineTo(18f, 6f)
                close()
                moveTo(2.81f, 5.64f)
                lineToRelative(0.85f, 0.85f)
                curveToRelative(-1.37f, 2.07f, -2f, 4.68f, -1.48f, 7.45f)
                curveToRelative(0.75f, 3.95f, 3.92f, 7.13f, 7.88f, 7.88f)
                curveToRelative(2.77f, 0.52f, 5.38f, -0.1f, 7.45f, -1.48f)
                lineToRelative(0.85f, 0.85f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(4.22f, 4.22f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                close()
                moveToRelative(6.1f, 6.1f)
                lineToRelative(3.35f, 3.35f)
                lineTo(6f, 18f)
                lineToRelative(2.91f, -6.26f)
                close()
            }
        }.build()
        
        return _Explore_off!!
    }

private var _Explore_off: ImageVector? = null

