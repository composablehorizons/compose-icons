package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.UserPlus: ImageVector
    get() {
        if (_UserPlus != null) return _UserPlus!!
        
        _UserPlus = ImageVector.Builder(
            name = "user-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
                moveTo(1.615f, 16.428f)
                arcToRelative(1.224f, 1.224f, 0f, false, true, -0.569f, -1.175f)
                arcToRelative(6.002f, 6.002f, 0f, false, true, 11.908f, 0f)
                curveToRelative(0.058f, 0.467f, -0.172f, 0.92f, -0.57f, 1.174f)
                arcTo(9.953f, 9.953f, 0f, false, true, 7f, 18f)
                arcToRelative(9.953f, 9.953f, 0f, false, true, -5.385f, -1.572f)
                close()
                moveTo(16.25f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _UserPlus!!
    }

private var _UserPlus: ImageVector? = null

