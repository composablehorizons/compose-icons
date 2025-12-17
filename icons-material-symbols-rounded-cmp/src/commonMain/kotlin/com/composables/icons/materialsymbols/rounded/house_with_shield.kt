package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.House_with_shield: ImageVector
    get() {
        if (_House_with_shield != null) return _House_with_shield!!
        
        _House_with_shield = ImageVector.Builder(
            name = "house_with_shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 502f)
                quadToRelative(0f, 66f, 38f, 128f)
                reflectiveQuadToRelative(103f, 84f)
                quadToRelative(5f, 2f, 9.5f, 2.5f)
                reflectiveQuadToRelative(9.5f, 0.5f)
                quadToRelative(5f, 0f, 9.5f, -0.5f)
                reflectiveQuadToRelative(9.5f, -2.5f)
                quadToRelative(65f, -22f, 103f, -84f)
                reflectiveQuadToRelative(38f, -128f)
                verticalLineToRelative(-65f)
                quadToRelative(0f, -17f, -9f, -31.5f)
                reflectiveQuadTo(607f, 383f)
                lineToRelative(-100f, -50f)
                quadToRelative(-13f, -6f, -27f, -6f)
                reflectiveQuadToRelative(-27f, 6f)
                lineToRelative(-100f, 50f)
                quadToRelative(-15f, 8f, -24f, 22.5f)
                reflectiveQuadToRelative(-9f, 31.5f)
                verticalLineToRelative(65f)
                close()
                moveToRelative(-80f, 338f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -19f, 8.5f, -36f)
                reflectiveQuadToRelative(23.5f, -28f)
                lineToRelative(240f, -180f)
                quadToRelative(21f, -16f, 48f, -16f)
                reflectiveQuadToRelative(48f, 16f)
                lineToRelative(240f, 180f)
                quadToRelative(15f, 11f, 23.5f, 28f)
                reflectiveQuadToRelative(8.5f, 36f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                lineTo(480f, 220f)
                lineTo(240f, 400f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(240f, -270f)
                close()
            }
        }.build()
        
        return _House_with_shield!!
    }

private var _House_with_shield: ImageVector? = null

