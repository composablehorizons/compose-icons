package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Water_lock: ImageVector
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
                moveTo(760f, 880f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -20f, 7f, -36.5f)
                reflectiveQuadToRelative(19f, -30.5f)
                lineToRelative(52f, -58f)
                quadToRelative(9f, -10f, 22f, -10f)
                reflectiveQuadToRelative(22f, 10f)
                lineToRelative(52f, 58f)
                quadToRelative(12f, 14f, 19f, 30.5f)
                reflectiveQuadToRelative(7f, 36.5f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(360f, 320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(120f, 360f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 680f)
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
                verticalLineToRelative(134f)
                quadToRelative(0f, 12f, -9f, 19.5f)
                reflectiveQuadToRelative(-21f, 6.5f)
                quadToRelative(-54f, -3f, -101f, 21f)
                reflectiveQuadToRelative(-76f, 69f)
                quadToRelative(-29f, 45f, -33f, 97.5f)
                reflectiveQuadTo(580f, 848f)
                quadToRelative(5f, 11f, 0f, 21.5f)
                reflectiveQuadTo(564f, 880f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Water_lock!!
    }

private var _Water_lock: ImageVector? = null

