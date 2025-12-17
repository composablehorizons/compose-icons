package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Notifications_active: ImageVector
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
                quadToRelative(80f, 20f, 130f, 84.5f)
                reflectiveQuadTo(720f, 400f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -300f)
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
                moveTo(120f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -13f)
                reflectiveQuadTo(82f, 357f)
                quadToRelative(8f, -75f, 42f, -139.5f)
                reflectiveQuadTo(211f, 105f)
                quadToRelative(13f, -11f, 29.5f, -10f)
                reflectiveQuadToRelative(26.5f, 15f)
                quadToRelative(10f, 14f, 8f, 30f)
                reflectiveQuadToRelative(-15f, 28f)
                quadToRelative(-39f, 37f, -64f, 86f)
                reflectiveQuadToRelative(-33f, 106f)
                quadToRelative(-2f, 17f, -14f, 28.5f)
                reflectiveQuadTo(120f, 400f)
                close()
                moveToRelative(720f, 0f)
                quadToRelative(-17f, 0f, -29f, -11.5f)
                reflectiveQuadTo(797f, 360f)
                quadToRelative(-8f, -57f, -33f, -106f)
                reflectiveQuadToRelative(-64f, -86f)
                quadToRelative(-13f, -12f, -15f, -28f)
                reflectiveQuadToRelative(8f, -30f)
                quadToRelative(10f, -14f, 26.5f, -15f)
                reflectiveQuadToRelative(29.5f, 10f)
                quadToRelative(53f, 48f, 87f, 112.5f)
                reflectiveQuadTo(878f, 357f)
                quadToRelative(2f, 17f, -9.5f, 30f)
                reflectiveQuadTo(840f, 400f)
                close()
            }
        }.build()
        
        return _Notifications_active!!
    }

private var _Notifications_active: ImageVector? = null

