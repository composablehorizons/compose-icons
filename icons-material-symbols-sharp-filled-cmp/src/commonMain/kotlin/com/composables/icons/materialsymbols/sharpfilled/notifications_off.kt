package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Notifications_off: ImageVector
    get() {
        if (_Notifications_off != null) return _Notifications_off!!
        
        _Notifications_off = ImageVector.Builder(
            name = "notifications_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 8.5f, -65f)
                reflectiveQuadToRelative(25.5f, -61f)
                lineToRelative(126f, 126f)
                horizontalLineTo(288f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                lineToRelative(-146f, -144f)
                horizontalLineTo(160f)
                close()
                moveToRelative(560f, -154f)
                lineTo(328f, 214f)
                quadToRelative(20f, -16f, 43f, -28f)
                reflectiveQuadToRelative(49f, -18f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(88f)
                quadToRelative(80f, 20f, 130f, 84.5f)
                reflectiveQuadTo(720f, 400f)
                verticalLineToRelative(206f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Notifications_off!!
    }

private var _Notifications_off: ImageVector? = null

