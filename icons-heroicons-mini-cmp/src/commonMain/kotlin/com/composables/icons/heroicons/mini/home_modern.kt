package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.HomeModern: ImageVector
    get() {
        if (_HomeModern != null) return _HomeModern!!
        
        _HomeModern = ImageVector.Builder(
            name = "home-modern",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.916f, 2.404f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.32f, 1.011f)
                lineToRelative(-0.596f, 0.31f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-2.26f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(2f)
                verticalLineTo(9.957f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.596f, -1.372f)
                lineTo(2f, 8.275f)
                verticalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(1.745f)
                lineToRelative(10.404f, -5.41f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.012f, 0.319f)
                close()
                moveTo(15.861f, 8.57f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.736f, -0.025f)
                lineToRelative(1.999f, 1.04f)
                arcTo(0.75f, 0.75f, 0f, false, true, 18f, 10.957f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(9.21f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.361f, -0.64f)
                close()
            }
        }.build()
        
        return _HomeModern!!
    }

private var _HomeModern: ImageVector? = null

