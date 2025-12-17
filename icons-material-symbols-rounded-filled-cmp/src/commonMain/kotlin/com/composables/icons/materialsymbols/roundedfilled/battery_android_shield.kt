package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Battery_android_shield: ImageVector
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
                moveTo(440f, 630f)
                quadToRelative(67f, -32f, 97f, -100.5f)
                reflectiveQuadTo(570f, 386f)
                quadToRelative(-35f, -8f, -66.5f, -23.5f)
                reflectiveQuadTo(440f, 330f)
                quadToRelative(-32f, 17f, -63.5f, 32.5f)
                reflectiveQuadTo(310f, 386f)
                quadToRelative(3f, 75f, 33f, 143.5f)
                reflectiveQuadTo(440f, 630f)
                close()
                moveToRelative(0f, -70f)
                verticalLineToRelative(-160f)
                quadToRelative(16f, 10f, 32.5f, 18f)
                reflectiveQuadToRelative(33.5f, 14f)
                quadToRelative(-6f, 37f, -21.5f, 70.5f)
                reflectiveQuadTo(440f, 560f)
                close()
                moveTo(160f, 750f)
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
            }
        }.build()
        
        return _Battery_android_shield!!
    }

private var _Battery_android_shield: ImageVector? = null

