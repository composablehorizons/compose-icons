package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.UserCircle: ImageVector
    get() {
        if (_UserCircle != null) return _UserCircle!!
        
        _UserCircle = ImageVector.Builder(
            name = "user-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.685f, 19.097f)
                arcTo(9.723f, 9.723f, 0f, false, false, 21.75f, 12f)
                curveToRelative(0f, -5.385f, -4.365f, -9.75f, -9.75f, -9.75f)
                reflectiveCurveTo(2.25f, 6.615f, 2.25f, 12f)
                arcToRelative(9.723f, 9.723f, 0f, false, false, 3.065f, 7.097f)
                arcTo(9.716f, 9.716f, 0f, false, false, 12f, 21.75f)
                arcToRelative(9.716f, 9.716f, 0f, false, false, 6.685f, -2.653f)
                close()
                moveToRelative(-12.54f, -1.285f)
                arcTo(7.486f, 7.486f, 0f, false, true, 12f, 15f)
                arcToRelative(7.486f, 7.486f, 0f, false, true, 5.855f, 2.812f)
                arcTo(8.224f, 8.224f, 0f, false, true, 12f, 20.25f)
                arcToRelative(8.224f, 8.224f, 0f, false, true, -5.855f, -2.438f)
                close()
                moveTo(15.75f, 9f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, -7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 7.5f, 0f)
                close()
            }
        }.build()
        
        return _UserCircle!!
    }

private var _UserCircle: ImageVector? = null

