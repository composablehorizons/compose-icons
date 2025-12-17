package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Notification_sound: ImageVector
    get() {
        if (_Notification_sound != null) return _Notification_sound!!
        
        _Notification_sound = ImageVector.Builder(
            name = "notification_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(501f, 460f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(160f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -83f, 50f, -147.5f)
                reflectiveQuadTo(420f, 168f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                quadToRelative(29f, 7f, 53.5f, 20.5f)
                reflectiveQuadTo(639f, 220f)
                lineToRelative(-57f, 57f)
                quadToRelative(-21f, -17f, -47f, -27f)
                reflectiveQuadToRelative(-55f, -10f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(496f, -219f)
                lineToRelative(-56f, -57f)
                quadToRelative(10f, -10f, 15f, -24f)
                reflectiveQuadToRelative(5f, -32f)
                quadToRelative(0f, -18f, -5f, -32.5f)
                reflectiveQuadTo(600f, 371f)
                lineToRelative(56f, -56f)
                quadToRelative(21f, 21f, 32.5f, 50f)
                reflectiveQuadToRelative(11.5f, 63f)
                quadToRelative(0f, 34f, -11.5f, 63f)
                reflectiveQuadTo(656f, 541f)
                close()
                moveToRelative(43f, 43f)
                quadToRelative(29f, -29f, 45f, -70f)
                reflectiveQuadToRelative(16f, -86f)
                quadToRelative(0f, -45f, -16f, -86f)
                reflectiveQuadToRelative(-45f, -70f)
                lineToRelative(57f, -56f)
                quadToRelative(41f, 41f, 62.5f, 95.5f)
                reflectiveQuadTo(840f, 428f)
                quadToRelative(0f, 62f, -21.5f, 116.5f)
                reflectiveQuadTo(756f, 640f)
                lineToRelative(-57f, -56f)
                close()
            }
        }.build()
        
        return _Notification_sound!!
    }

private var _Notification_sound: ImageVector? = null

