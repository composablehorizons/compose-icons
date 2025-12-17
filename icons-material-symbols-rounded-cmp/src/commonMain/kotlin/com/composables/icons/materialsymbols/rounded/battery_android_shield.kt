package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_android_shield: ImageVector
    get() {
        if (_Battery_android_shield != null) return _Battery_android_shield!!
        
        _Battery_android_shield = ImageVector.Builder(
            name = "battery_android_shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 620f)
                quadToRelative(9f, 0f, 18f, -3f)
                reflectiveQuadToRelative(17f, -9f)
                quadToRelative(20f, -15f, 35.5f, -35.5f)
                reflectiveQuadTo(537f, 529f)
                quadToRelative(12f, -25f, 19f, -52.5f)
                reflectiveQuadToRelative(11f, -56.5f)
                quadToRelative(2f, -15f, -7f, -26.5f)
                reflectiveQuadTo(537f, 377f)
                quadToRelative(-22f, -8f, -42f, -18f)
                reflectiveQuadToRelative(-40f, -21f)
                quadToRelative(-8f, -4f, -15f, -4f)
                reflectiveQuadToRelative(-15f, 4f)
                quadToRelative(-20f, 11f, -40.5f, 21f)
                reflectiveQuadTo(343f, 377f)
                quadToRelative(-14f, 5f, -23f, 17f)
                reflectiveQuadToRelative(-7f, 26f)
                quadToRelative(3f, 29f, 10.5f, 56.5f)
                reflectiveQuadTo(343f, 529f)
                quadToRelative(11f, 23f, 26.5f, 43f)
                reflectiveQuadToRelative(35.5f, 36f)
                quadToRelative(8f, 6f, 17f, 9f)
                reflectiveQuadToRelative(18f, 3f)
                close()
                moveToRelative(0f, -60f)
                verticalLineToRelative(-160f)
                quadToRelative(16f, 10f, 32.5f, 18f)
                reflectiveQuadToRelative(33.5f, 14f)
                quadToRelative(-6f, 37f, -21.5f, 70.5f)
                reflectiveQuadTo(440f, 560f)
                close()
                moveTo(160f, 670f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-380f)
                horizontalLineTo(160f)
                verticalLineToRelative(380f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 670f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 210f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 290f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(20f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(820f, 580f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 750f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-380f)
                verticalLineToRelative(380f)
                close()
            }
        }.build()
        
        return _Battery_android_shield!!
    }

private var _Battery_android_shield: ImageVector? = null

