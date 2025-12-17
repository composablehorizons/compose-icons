package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Map_pin_review: ImageVector
    get() {
        if (_Map_pin_review != null) return _Map_pin_review!!
        
        _Map_pin_review = ImageVector.Builder(
            name = "map_pin_review",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(138f)
                quadToRelative(-28f, -26f, -59f, -59f)
                reflectiveQuadToRelative(-57f, -71f)
                quadToRelative(-26f, -38f, -44f, -78f)
                reflectiveQuadToRelative(-18f, -82f)
                quadToRelative(0f, -98f, 64f, -164f)
                reflectiveQuadToRelative(160f, -66f)
                quadToRelative(96f, 0f, 160f, 66f)
                reflectiveQuadToRelative(64f, 164f)
                quadToRelative(0f, 42f, -18f, 82f)
                reflectiveQuadToRelative(-44f, 78f)
                quadToRelative(-26f, 38f, -57f, 71f)
                reflectiveQuadToRelative(-59f, 59f)
                horizontalLineToRelative(570f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(184f, -320f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(324f, 500f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(264f, 440f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(204f, 500f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(264f, 560f)
                close()
                moveToRelative(336f, 160f)
                lineToRelative(-58f, -93f)
                quadToRelative(12f, -29f, 19f, -58.5f)
                reflectiveQuadToRelative(7f, -58.5f)
                quadToRelative(0f, -23f, -3f, -46f)
                reflectiveQuadToRelative(-9f, -44f)
                lineToRelative(48f, -29f)
                lineToRelative(81f, 49f)
                lineToRelative(-21f, -92f)
                lineToRelative(72f, -63f)
                lineToRelative(-95f, -8f)
                lineToRelative(-37f, -87f)
                lineToRelative(-37f, 87f)
                lineToRelative(-91f, 8f)
                quadToRelative(-32f, -31f, -71f, -51.5f)
                reflectiveQuadTo(320f, 205f)
                verticalLineToRelative(-45f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 600f)
                horizontalLineTo(675f)
                lineToRelative(-75f, 120f)
                close()
            }
        }.build()
        
        return _Map_pin_review!!
    }

private var _Map_pin_review: ImageVector? = null

