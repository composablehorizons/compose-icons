package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Shield_with_heart: ImageVector
    get() {
        if (_Shield_with_heart != null) return _Shield_with_heart!!
        
        _Shield_with_heart = ImageVector.Builder(
            name = "shield_with_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(102f, -92f, 131f, -129.5f)
                reflectiveQuadToRelative(29f, -74.5f)
                quadToRelative(0f, -36f, -26f, -62f)
                reflectiveQuadToRelative(-62f, -26f)
                quadToRelative(-21f, 0f, -40.5f, 8.5f)
                reflectiveQuadTo(480f, 380f)
                quadToRelative(-12f, -15f, -31f, -23.5f)
                reflectiveQuadToRelative(-41f, -8.5f)
                quadToRelative(-36f, 0f, -62f, 26f)
                reflectiveQuadToRelative(-26f, 62f)
                quadToRelative(0f, 19f, 5f, 35f)
                reflectiveQuadToRelative(22f, 37.5f)
                quadToRelative(17f, 21.5f, 48.5f, 52.5f)
                reflectiveQuadToRelative(84.5f, 79f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Shield_with_heart!!
    }

private var _Shield_with_heart: ImageVector? = null

