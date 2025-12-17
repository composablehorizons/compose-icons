package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shield_with_house: ImageVector
    get() {
        if (_Shield_with_house != null) return _Shield_with_house!!
        
        _Shield_with_house = ImageVector.Builder(
            name = "shield_with_house",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 600f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 640f)
                verticalLineToRelative(184f)
                quadToRelative(0f, 8f, 7f, 13f)
                reflectiveQuadToRelative(15f, 1f)
                quadToRelative(68f, -38f, 117f, -97.5f)
                reflectiveQuadTo(772f, 607f)
                lineTo(480f, 381f)
                lineTo(188f, 607f)
                quadToRelative(24f, 73f, 72.5f, 132f)
                reflectiveQuadTo(376f, 836f)
                quadToRelative(8f, 5f, 16f, 0f)
                reflectiveQuadToRelative(8f, -14f)
                verticalLineToRelative(-182f)
                close()
                moveTo(160f, 255f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 18f, 1.5f, 40f)
                reflectiveQuadToRelative(5.5f, 39f)
                lineToRelative(264f, -205f)
                quadToRelative(22f, -17f, 49f, -17f)
                reflectiveQuadToRelative(49f, 17f)
                lineToRelative(264f, 205f)
                quadToRelative(4f, -17f, 5.5f, -39f)
                reflectiveQuadToRelative(1.5f, -40f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, -14.5f, -45f)
                reflectiveQuadTo(748f, 181f)
                lineToRelative(-240f, -90f)
                quadToRelative(-14f, -5f, -28f, -5f)
                reflectiveQuadToRelative(-28f, 5f)
                lineToRelative(-240f, 90f)
                quadToRelative(-23f, 9f, -37.5f, 29f)
                reflectiveQuadTo(160f, 255f)
                close()
            }
        }.build()
        
        return _Shield_with_house!!
    }

private var _Shield_with_house: ImageVector? = null

