package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Notification_sound: ImageVector
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
                moveTo(700f, 428f)
                quadToRelative(0f, 17f, -3f, 34f)
                reflectiveQuadToRelative(-10f, 33f)
                quadToRelative(-7f, 17f, -23f, 24f)
                reflectiveQuadToRelative(-32f, -1f)
                quadToRelative(-15f, -7f, -21f, -23f)
                reflectiveQuadToRelative(2f, -30f)
                quadToRelative(5f, -9f, 6f, -18f)
                reflectiveQuadToRelative(1f, -19f)
                quadToRelative(0f, -10f, -1.5f, -19.5f)
                reflectiveQuadTo(613f, 390f)
                quadToRelative(-6f, -14f, 0f, -28f)
                reflectiveQuadToRelative(20f, -21f)
                quadToRelative(15f, -7f, 30.5f, -0.5f)
                reflectiveQuadTo(687f, 362f)
                quadToRelative(8f, 16f, 10.5f, 32.5f)
                reflectiveQuadTo(700f, 428f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(0f, 50f, -15f, 97f)
                reflectiveQuadToRelative(-45f, 87f)
                quadToRelative(-9f, 12f, -25.5f, 11.5f)
                reflectiveQuadTo(727f, 612f)
                quadToRelative(-11f, -11f, -12f, -27f)
                reflectiveQuadToRelative(8f, -30f)
                quadToRelative(19f, -28f, 28f, -60.5f)
                reflectiveQuadToRelative(9f, -66.5f)
                quadToRelative(0f, -34f, -9f, -66.5f)
                reflectiveQuadTo(723f, 301f)
                quadToRelative(-9f, -14f, -8f, -30f)
                reflectiveQuadToRelative(12f, -27f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(780f, 244f)
                quadToRelative(30f, 40f, 45f, 87f)
                reflectiveQuadToRelative(15f, 97f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(200f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -83f, 50f, -147.5f)
                reflectiveQuadTo(420f, 168f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                quadToRelative(14f, 4f, 27.5f, 9f)
                reflectiveQuadToRelative(26.5f, 12f)
                quadToRelative(19f, 11f, 20.5f, 32f)
                reflectiveQuadTo(600f, 258f)
                lineToRelative(-56f, 57f)
                quadToRelative(-11f, 11f, -17.5f, 25.5f)
                reflectiveQuadTo(520f, 371f)
                verticalLineToRelative(114f)
                quadToRelative(0f, 16f, 6f, 30.5f)
                reflectiveQuadToRelative(17f, 25.5f)
                lineToRelative(151f, 151f)
                quadToRelative(19f, 19f, 8.5f, 43.5f)
                reflectiveQuadTo(665f, 760f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Notification_sound!!
    }

private var _Notification_sound: ImageVector? = null

