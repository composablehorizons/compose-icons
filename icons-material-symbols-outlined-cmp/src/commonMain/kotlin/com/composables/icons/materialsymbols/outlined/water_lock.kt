package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Water_lock: ImageVector
    get() {
        if (_Water_lock != null) return _Water_lock!!
        
        _Water_lock = ImageVector.Builder(
            name = "water_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-15f)
                verticalLineToRelative(15f)
                close()
                moveToRelative(120f, -480f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(80f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 320f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(164f)
                quadToRelative(-11f, -2f, -21f, -3f)
                reflectiveQuadToRelative(-21f, -1f)
                quadToRelative(-10f, 0f, -19.5f, 1f)
                reflectiveQuadToRelative(-18.5f, 3f)
                verticalLineToRelative(-164f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(324f)
                quadToRelative(5f, 23f, 14f, 43f)
                reflectiveQuadToRelative(23f, 37f)
                horizontalLineTo(240f)
                close()
                moveToRelative(520f, 0f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -20f, 7f, -36.5f)
                reflectiveQuadToRelative(19f, -30.5f)
                lineToRelative(74f, -83f)
                lineToRelative(74f, 83f)
                quadToRelative(12f, 14f, 19f, 30.5f)
                reflectiveQuadToRelative(7f, 36.5f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(480f, 680f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Water_lock!!
    }

private var _Water_lock: ImageVector? = null

