package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Shield_watch: ImageVector
    get() {
        if (_Shield_watch != null) return _Shield_watch!!
        
        _Shield_watch = ImageVector.Builder(
            name = "shield_watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, 400f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-65f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                quadToRelative(7f, -2f, 13f, -4f)
                reflectiveQuadToRelative(12f, -5f)
                quadToRelative(12f, 17f, 27f, 32.5f)
                reflectiveQuadToRelative(32f, 28.5f)
                quadToRelative(-20f, 11f, -41f, 19f)
                reflectiveQuadToRelative(-43f, 13f)
                close()
                moveToRelative(160f, 0f)
                lineToRelative(-23f, -92f)
                quadToRelative(-36f, -26f, -56.5f, -64.5f)
                reflectiveQuadTo(540f, 640f)
                quadToRelative(0f, -45f, 20.5f, -83.5f)
                reflectiveQuadTo(617f, 492f)
                lineToRelative(23f, -92f)
                horizontalLineToRelative(160f)
                lineToRelative(23f, 92f)
                quadToRelative(36f, 26f, 56.5f, 64.5f)
                reflectiveQuadTo(900f, 640f)
                quadToRelative(0f, 45f, -20.5f, 83.5f)
                reflectiveQuadTo(823f, 788f)
                lineToRelative(-23f, 92f)
                horizontalLineTo(640f)
                close()
                moveToRelative(80f, -140f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
            }
        }.build()
        
        return _Shield_watch!!
    }

private var _Shield_watch: ImageVector? = null

