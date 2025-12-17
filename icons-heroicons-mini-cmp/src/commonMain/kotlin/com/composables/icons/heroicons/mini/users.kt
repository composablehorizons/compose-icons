package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Users: ImageVector
    get() {
        if (_Users != null) return _Users!!
        
        _Users = ImageVector.Builder(
            name = "users",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 8f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
                moveTo(14.5f, 9f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
                close()
                moveTo(1.615f, 16.428f)
                arcToRelative(1.224f, 1.224f, 0f, false, true, -0.569f, -1.175f)
                arcToRelative(6.002f, 6.002f, 0f, false, true, 11.908f, 0f)
                curveToRelative(0.058f, 0.467f, -0.172f, 0.92f, -0.57f, 1.174f)
                arcTo(9.953f, 9.953f, 0f, false, true, 7f, 18f)
                arcToRelative(9.953f, 9.953f, 0f, false, true, -5.385f, -1.572f)
                close()
                moveTo(14.5f, 16f)
                horizontalLineToRelative(-0.106f)
                curveToRelative(0.07f, -0.297f, 0.088f, -0.611f, 0.048f, -0.933f)
                arcToRelative(7.47f, 7.47f, 0f, false, false, -1.588f, -3.755f)
                arcToRelative(4.502f, 4.502f, 0f, false, true, 5.874f, 2.636f)
                arcToRelative(0.818f, 0.818f, 0f, false, true, -0.36f, 0.98f)
                arcTo(7.465f, 7.465f, 0f, false, true, 14.5f, 16f)
                close()
            }
        }.build()
        
        return _Users!!
    }

private var _Users: ImageVector? = null

