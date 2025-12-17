package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mobile_gear: ImageVector
    get() {
        if (_Mobile_gear != null) return _Mobile_gear!!
        
        _Mobile_gear = ImageVector.Builder(
            name = "mobile_gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(404f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-720f)
                horizontalLineTo(280f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-720f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(158f, -218f)
                quadToRelative(1f, 8f, 6.5f, 13f)
                reflectiveQuadToRelative(13.5f, 5f)
                horizontalLineToRelative(44f)
                quadToRelative(8f, 0f, 13.5f, -5f)
                reflectiveQuadToRelative(6.5f, -13f)
                lineToRelative(4f, -32f)
                quadToRelative(8f, -3f, 14f, -6.5f)
                reflectiveQuadToRelative(12f, -9.5f)
                lineToRelative(30f, 13f)
                quadToRelative(7f, 3f, 14f, 0.5f)
                reflectiveQuadToRelative(11f, -9.5f)
                lineToRelative(22f, -39f)
                quadToRelative(4f, -7f, 2.5f, -14f)
                reflectiveQuadToRelative(-7.5f, -12f)
                lineToRelative(-26f, -19f)
                quadToRelative(2f, -8f, 2f, -15f)
                reflectiveQuadToRelative(-2f, -15f)
                lineToRelative(25f, -19f)
                quadToRelative(6f, -5f, 7.5f, -12.5f)
                reflectiveQuadTo(628f, 418f)
                lineToRelative(-23f, -38f)
                quadToRelative(-4f, -6f, -11f, -8.5f)
                reflectiveQuadToRelative(-14f, 0.5f)
                lineToRelative(-28f, 12f)
                quadToRelative(-6f, -5f, -12f, -8f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-4f, -32f)
                quadToRelative(-1f, -8f, -6.5f, -13f)
                reflectiveQuadToRelative(-13.5f, -5f)
                horizontalLineToRelative(-44f)
                quadToRelative(-8f, 0f, -13.5f, 5f)
                reflectiveQuadToRelative(-6.5f, 13f)
                lineToRelative(-4f, 32f)
                quadToRelative(-8f, 3f, -14f, 6f)
                reflectiveQuadToRelative(-12f, 8f)
                lineToRelative(-28f, -12f)
                quadToRelative(-7f, -3f, -14f, -0.5f)
                reflectiveQuadToRelative(-11f, 8.5f)
                lineToRelative(-23f, 38f)
                quadToRelative(-4f, 7f, -2.5f, 14.5f)
                reflectiveQuadTo(337f, 445f)
                lineToRelative(25f, 19f)
                quadToRelative(-2f, 8f, -2f, 15f)
                reflectiveQuadToRelative(2f, 15f)
                lineToRelative(-26f, 19f)
                quadToRelative(-6f, 5f, -7.5f, 12f)
                reflectiveQuadToRelative(2.5f, 14f)
                lineToRelative(22f, 39f)
                quadToRelative(4f, 7f, 11f, 9.5f)
                reflectiveQuadToRelative(14f, -0.5f)
                lineToRelative(30f, -13f)
                quadToRelative(6f, 6f, 12f, 9.5f)
                reflectiveQuadToRelative(14f, 6.5f)
                lineToRelative(4f, 32f)
                close()
                moveToRelative(42f, -82f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
            }
        }.build()
        
        return _Mobile_gear!!
    }

private var _Mobile_gear: ImageVector? = null

