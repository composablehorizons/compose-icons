package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sports_handball: ImageVector
    get() {
        if (_Sports_handball != null) return _Sports_handball!!
        
        _Sports_handball = ImageVector.Builder(
            name = "sports_handball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 956f)
                lineToRelative(-70f, -40f)
                lineToRelative(120f, -208f)
                lineToRelative(-68f, -40f)
                lineToRelative(-60f, 104f)
                lineToRelative(-70f, -40f)
                lineToRelative(206f, -356f)
                quadToRelative(-38f, -39f, -57f, -89f)
                reflectiveQuadToRelative(-19f, -103f)
                quadToRelative(0f, -36f, 9f, -71.5f)
                reflectiveQuadToRelative(29f, -68.5f)
                lineToRelative(68f, 40f)
                quadToRelative(-14f, 23f, -20f, 47.5f)
                reflectiveQuadToRelative(-6f, 50.5f)
                quadToRelative(0f, 53f, 26f, 99.5f)
                reflectiveQuadToRelative(74f, 74.5f)
                lineToRelative(90f, 52f)
                quadToRelative(62f, 36f, 91f, 103.5f)
                reflectiveQuadTo(740f, 638f)
                quadToRelative(0f, 38f, -10f, 74f)
                reflectiveQuadToRelative(-28f, 68f)
                lineToRelative(-70f, -40f)
                quadToRelative(14f, -24f, 20f, -49f)
                reflectiveQuadToRelative(6f, -51f)
                quadToRelative(0f, -32f, -9f, -62f)
                reflectiveQuadToRelative(-29f, -56f)
                lineTo(368f, 956f)
                close()
                moveToRelative(272f, -596f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 360f)
                close()
                moveTo(540f, 160f)
                quadToRelative(-26f, 0f, -43f, -18f)
                reflectiveQuadToRelative(-17f, -42f)
                quadToRelative(0f, -26f, 18f, -43f)
                reflectiveQuadToRelative(42f, -17f)
                quadToRelative(26f, 0f, 43f, 18f)
                reflectiveQuadToRelative(17f, 42f)
                quadToRelative(0f, 26f, -18f, 43f)
                reflectiveQuadToRelative(-42f, 17f)
                close()
            }
        }.build()
        
        return _Sports_handball!!
    }

private var _Sports_handball: ImageVector? = null

