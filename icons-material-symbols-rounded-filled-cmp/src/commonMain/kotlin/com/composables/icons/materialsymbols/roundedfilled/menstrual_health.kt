package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Menstrual_health: ImageVector
    get() {
        if (_Menstrual_health != null) return _Menstrual_health!!
        
        _Menstrual_health = ImageVector.Builder(
            name = "menstrual_health",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(146f, 661f)
                quadToRelative(-7f, 3f, -14.5f, 1.5f)
                reflectiveQuadTo(119f, 654f)
                quadToRelative(-20f, -41f, -29.5f, -85f)
                reflectiveQuadTo(80f, 480f)
                verticalLineToRelative(-300f)
                quadToRelative(0f, -25f, 22f, -36f)
                reflectiveQuadToRelative(42f, 4f)
                lineToRelative(124f, 93f)
                quadToRelative(11f, 8f, 12.5f, 20.5f)
                reflectiveQuadTo(275f, 285f)
                quadToRelative(-47f, 72f, -81f, 150.5f)
                reflectiveQuadTo(160f, 600f)
                verticalLineToRelative(15.5f)
                quadToRelative(0f, 7.5f, 1f, 15.5f)
                quadToRelative(1f, 11f, -3.5f, 19f)
                reflectiveQuadTo(146f, 661f)
                close()
                moveToRelative(334f, 179f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -65f, 43f, -165f)
                reflectiveQuadToRelative(148f, -237f)
                quadToRelative(19f, -24f, 49f, -24f)
                reflectiveQuadToRelative(49f, 24f)
                quadToRelative(104f, 136f, 147.5f, 236.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(333f, -177f)
                quadToRelative(-8f, -3f, -12.5f, -11.5f)
                reflectiveQuadTo(799f, 631f)
                quadToRelative(1f, -8f, 1f, -15.5f)
                verticalLineTo(600f)
                quadToRelative(0f, -86f, -34f, -164.5f)
                reflectiveQuadTo(685f, 285f)
                quadToRelative(-7f, -11f, -5.5f, -23.5f)
                reflectiveQuadTo(692f, 241f)
                lineToRelative(124f, -93f)
                quadToRelative(20f, -15f, 42f, -4f)
                reflectiveQuadToRelative(22f, 36f)
                verticalLineToRelative(300f)
                quadToRelative(0f, 45f, -9.5f, 89f)
                reflectiveQuadTo(841f, 654f)
                quadToRelative(-4f, 8f, -12f, 10f)
                reflectiveQuadToRelative(-16f, -1f)
                close()
            }
        }.build()
        
        return _Menstrual_health!!
    }

private var _Menstrual_health: ImageVector? = null

