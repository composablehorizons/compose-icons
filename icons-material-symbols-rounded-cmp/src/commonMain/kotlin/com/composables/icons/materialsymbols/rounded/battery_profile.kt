package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_profile: ImageVector
    get() {
        if (_Battery_profile != null) return _Battery_profile!!
        
        _Battery_profile = ImageVector.Builder(
            name = "battery_profile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                close()
                moveToRelative(-40f, 80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 360f)
                verticalLineToRelative(-120f)
                horizontalLineTo(360f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 880f)
                horizontalLineTo(320f)
                close()
                moveToRelative(336f, 0f)
                quadToRelative(-8f, 0f, -12.5f, -4.5f)
                reflectiveQuadTo(637f, 864f)
                lineToRelative(-9f, -44f)
                quadToRelative(-12f, -5f, -22.5f, -11f)
                reflectiveQuadTo(585f, 795f)
                lineToRelative(-42f, 15f)
                quadToRelative(-7f, 2f, -13.5f, -0.5f)
                reflectiveQuadTo(519f, 801f)
                lineToRelative(-24f, -41f)
                quadToRelative(-4f, -6f, -2.5f, -13f)
                reflectiveQuadToRelative(6.5f, -12f)
                lineToRelative(33f, -29f)
                quadToRelative(-2f, -15f, -2f, -25.5f)
                reflectiveQuadToRelative(2f, -25.5f)
                lineToRelative(-33f, -29f)
                quadToRelative(-5f, -5f, -6.5f, -12f)
                reflectiveQuadToRelative(2.5f, -13f)
                lineToRelative(24f, -41f)
                quadToRelative(4f, -6f, 10.5f, -8.5f)
                reflectiveQuadToRelative(13.5f, -0.5f)
                lineToRelative(42f, 15f)
                quadToRelative(10f, -8f, 20.5f, -14.5f)
                reflectiveQuadTo(628f, 540f)
                lineToRelative(9f, -44f)
                quadToRelative(2f, -7f, 6.5f, -11.5f)
                reflectiveQuadTo(656f, 480f)
                horizontalLineToRelative(48f)
                quadToRelative(8f, 0f, 12.5f, 4.5f)
                reflectiveQuadTo(723f, 496f)
                lineToRelative(9f, 44f)
                quadToRelative(12f, 5f, 22.5f, 11f)
                reflectiveQuadToRelative(20.5f, 14f)
                lineToRelative(42f, -15f)
                quadToRelative(7f, -2f, 13.5f, 0.5f)
                reflectiveQuadTo(841f, 559f)
                lineToRelative(24f, 41f)
                quadToRelative(4f, 6f, 2.5f, 13f)
                reflectiveQuadToRelative(-6.5f, 12f)
                lineToRelative(-33f, 29f)
                quadToRelative(2f, 15f, 2f, 25.5f)
                reflectiveQuadToRelative(-2f, 25.5f)
                lineToRelative(33f, 29f)
                quadToRelative(5f, 5f, 6.5f, 12f)
                reflectiveQuadToRelative(-2.5f, 13f)
                lineToRelative(-24f, 41f)
                quadToRelative(-4f, 6f, -10f, 8.5f)
                reflectiveQuadToRelative(-13f, 0.5f)
                lineToRelative(-43f, -14f)
                quadToRelative(-10f, 8f, -20.5f, 14f)
                reflectiveQuadTo(732f, 820f)
                lineToRelative(-9f, 44f)
                quadToRelative(-2f, 7f, -6.5f, 11.5f)
                reflectiveQuadTo(704f, 880f)
                horizontalLineToRelative(-48f)
                close()
                moveToRelative(24f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(680f, 760f)
                close()
            }
        }.build()
        
        return _Battery_profile!!
    }

private var _Battery_profile: ImageVector? = null

