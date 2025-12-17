package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.UserCircle: ImageVector
    get() {
        if (_UserCircle != null) return _UserCircle!!
        
        _UserCircle = ImageVector.Builder(
            name = "user-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                close()
                moveToRelative(-5.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                close()
                moveTo(10f, 12f)
                arcToRelative(5.99f, 5.99f, 0f, false, false, -4.793f, 2.39f)
                arcTo(6.483f, 6.483f, 0f, false, false, 10f, 16.5f)
                arcToRelative(6.483f, 6.483f, 0f, false, false, 4.793f, -2.11f)
                arcTo(5.99f, 5.99f, 0f, false, false, 10f, 12f)
                close()
            }
        }.build()
        
        return _UserCircle!!
    }

private var _UserCircle: ImageVector? = null

