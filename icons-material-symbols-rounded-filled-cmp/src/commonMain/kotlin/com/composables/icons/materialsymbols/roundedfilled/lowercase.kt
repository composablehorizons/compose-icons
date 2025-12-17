package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Lowercase: ImageVector
    get() {
        if (_Lowercase != null) return _Lowercase!!
        
        _Lowercase = ImageVector.Builder(
            name = "lowercase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 720f)
                quadToRelative(-51f, 0f, -81f, -27.5f)
                reflectiveQuadTo(189f, 620f)
                quadToRelative(0f, -44f, 34.5f, -72.5f)
                reflectiveQuadTo(312f, 519f)
                quadToRelative(23f, 0f, 45f, 4f)
                reflectiveQuadToRelative(38f, 11f)
                verticalLineToRelative(-12f)
                quadToRelative(0f, -29f, -20.5f, -47f)
                reflectiveQuadTo(320f, 457f)
                quadToRelative(-15f, 0f, -29.5f, 4.5f)
                reflectiveQuadTo(264f, 475f)
                quadToRelative(-13f, 10f, -24.5f, 7f)
                reflectiveQuadTo(221f, 471f)
                quadToRelative(-7f, -8f, -7f, -19f)
                reflectiveQuadToRelative(11f, -19f)
                quadToRelative(20f, -16f, 45f, -23.5f)
                reflectiveQuadToRelative(51f, -7.5f)
                quadToRelative(69f, 0f, 103f, 32.5f)
                reflectiveQuadToRelative(34f, 97.5f)
                verticalLineToRelative(147f)
                quadToRelative(0f, 13f, -9.5f, 22f)
                reflectiveQuadToRelative(-22.5f, 9f)
                quadToRelative(-13f, 0f, -22f, -9.5f)
                reflectiveQuadToRelative(-9f, -22.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-4f)
                quadToRelative(-14f, 23f, -38f, 35f)
                reflectiveQuadToRelative(-53f, 12f)
                close()
                moveToRelative(12f, -54f)
                quadToRelative(35f, 0f, 59.5f, -24f)
                reflectiveQuadToRelative(24.5f, -56f)
                quadToRelative(-14f, -8f, -33.5f, -12.5f)
                reflectiveQuadTo(324f, 569f)
                quadToRelative(-32f, 0f, -50f, 14f)
                reflectiveQuadToRelative(-18f, 37f)
                quadToRelative(0f, 20f, 16f, 33f)
                reflectiveQuadToRelative(40f, 13f)
                close()
                moveToRelative(348f, -98f)
                verticalLineToRelative(-208f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(700f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(740f, 360f)
                verticalLineToRelative(208f)
                lineToRelative(36f, -36f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(728f, 692f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(568f, 588f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(36f, 36f)
                close()
            }
        }.build()
        
        return _Lowercase!!
    }

private var _Lowercase: ImageVector? = null

