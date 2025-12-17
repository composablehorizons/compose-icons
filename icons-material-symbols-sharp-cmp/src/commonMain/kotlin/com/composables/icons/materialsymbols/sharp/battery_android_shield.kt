package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_android_shield: ImageVector
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
                moveTo(160f, 670f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-380f)
                horizontalLineTo(160f)
                verticalLineToRelative(380f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-540f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(170f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(170f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-380f)
                verticalLineToRelative(380f)
                close()
            }
        }.build()
        
        return _Battery_android_shield!!
    }

private var _Battery_android_shield: ImageVector? = null

