package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Notifications_active: ImageVector
    get() {
        if (_Notifications_active != null) return _Notifications_active!!
        
        _Notifications_active = ImageVector.Builder(
            name = "notifications_active",
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
                quadToRelative(0f, -83f, 50f, -147.5f)
                reflectiveQuadTo(420f, 168f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(88f)
                quadToRelative(80f, 20f, 130f, 84.5f)
                reflectiveQuadTo(720f, 400f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -300f)
                close()
                moveToRelative(0f, 420f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(320f, 680f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(280f)
                close()
                moveTo(80f, 400f)
                quadToRelative(0f, -100f, 44.5f, -183.5f)
                reflectiveQuadTo(244f, 78f)
                lineToRelative(47f, 64f)
                quadToRelative(-60f, 44f, -95.5f, 111f)
                reflectiveQuadTo(160f, 400f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, 0f)
                quadToRelative(0f, -80f, -35.5f, -147f)
                reflectiveQuadTo(669f, 142f)
                lineToRelative(47f, -64f)
                quadToRelative(75f, 55f, 119.5f, 138.5f)
                reflectiveQuadTo(880f, 400f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Notifications_active!!
    }

private var _Notifications_active: ImageVector? = null

