package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Notifications_off: ImageVector
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
                moveTo(646f, 760f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 8.5f, -65f)
                reflectiveQuadToRelative(25.5f, -61f)
                lineToRelative(60f, 60f)
                quadToRelative(-7f, 16f, -10.5f, 32.5f)
                reflectiveQuadTo(320f, 400f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(248f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(820f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(646f, 760f)
                close()
                moveTo(540f, 168f)
                quadToRelative(80f, 20f, 130f, 84.5f)
                reflectiveQuadTo(720f, 400f)
                verticalLineToRelative(110f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(680f, 550f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(640f, 509f)
                verticalLineToRelative(-109f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-16f, 0f, -34f, 4f)
                reflectiveQuadToRelative(-32f, 10f)
                quadToRelative(-17f, 7f, -33.5f, 3f)
                reflectiveQuadTo(355f, 238f)
                quadToRelative(-8f, -13f, -5.5f, -27.5f)
                reflectiveQuadTo(365f, 189f)
                quadToRelative(13f, -7f, 27f, -12f)
                reflectiveQuadToRelative(28f, -9f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                close()
                moveToRelative(-96f, 388f)
                close()
                moveToRelative(36f, 324f)
                quadToRelative(-30f, 0f, -53.5f, -16.5f)
                reflectiveQuadTo(403f, 819f)
                quadToRelative(0f, -8f, 6.5f, -13.5f)
                reflectiveQuadTo(424f, 800f)
                horizontalLineToRelative(112f)
                quadToRelative(8f, 0f, 14.5f, 5.5f)
                reflectiveQuadTo(557f, 819f)
                quadToRelative(0f, 28f, -23.5f, 44.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(33f, -481f)
                close()
            }
        }.build()
        
        return _Notifications_off!!
    }

private var _Notifications_off: ImageVector? = null

