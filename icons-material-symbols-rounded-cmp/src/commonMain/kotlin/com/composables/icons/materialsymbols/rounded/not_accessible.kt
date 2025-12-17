package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Not_accessible: ImageVector
    get() {
        if (_Not_accessible != null) return _Not_accessible!!
        
        _Not_accessible = ImageVector.Builder(
            name = "not_accessible",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineTo(567f, 680f)
                horizontalLineToRelative(-87f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 600f)
                verticalLineToRelative(-87f)
                lineTo(84f, 197f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 679f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveToRelative(-363f, 4f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(0f, -73f, 45.5f, -127.5f)
                reflectiveQuadTo(360f, 484f)
                verticalLineToRelative(83f)
                quadToRelative(-35f, 13f, -57.5f, 43.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(39f, 0f, 70f, -22.5f)
                reflectiveQuadToRelative(43f, -57.5f)
                horizontalLineToRelative(83f)
                quadToRelative(-14f, 69f, -68.5f, 114.5f)
                reflectiveQuadTo(400f, 880f)
                close()
                moveToRelative(80f, -640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(280f, 240f)
                quadToRelative(0f, 17f, -12.5f, 28f)
                reflectiveQuadToRelative(-28.5f, 8f)
                quadToRelative(-44f, -8f, -85.5f, -28f)
                reflectiveQuadTo(560f, 442f)
                lineTo(423f, 305f)
                quadToRelative(10f, -11f, 23f, -17.5f)
                reflectiveQuadToRelative(34f, -6.5f)
                quadToRelative(15f, 0f, 33f, 7f)
                reflectiveQuadToRelative(33f, 22f)
                lineToRelative(51f, 57f)
                quadToRelative(23f, 26f, 55f, 44f)
                reflectiveQuadToRelative(67f, 25f)
                quadToRelative(17f, 3f, 29f, 15f)
                reflectiveQuadToRelative(12f, 29f)
                close()
            }
        }.build()
        
        return _Not_accessible!!
    }

private var _Not_accessible: ImageVector? = null

