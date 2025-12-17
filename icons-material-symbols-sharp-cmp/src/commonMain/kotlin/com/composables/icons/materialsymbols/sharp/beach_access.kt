package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Beach_access: ImageVector
    get() {
        if (_Beach_access != null) return _Beach_access!!
        
        _Beach_access = ImageVector.Builder(
            name = "beach_access",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(784f, 840f)
                lineTo(530f, 586f)
                lineToRelative(56f, -56f)
                lineToRelative(254f, 254f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-546f, -28f)
                quadToRelative(-60f, -60f, -89f, -135f)
                reflectiveQuadToRelative(-29f, -153f)
                quadToRelative(0f, -78f, 29f, -152f)
                reflectiveQuadToRelative(89f, -134f)
                quadToRelative(60f, -60f, 134.5f, -89.5f)
                reflectiveQuadTo(525f, 119f)
                quadToRelative(78f, 0f, 152.5f, 29.5f)
                reflectiveQuadTo(812f, 238f)
                lineTo(238f, 812f)
                close()
                moveToRelative(8f, -122f)
                lineToRelative(54f, -54f)
                quadToRelative(-16f, -21f, -30.5f, -43f)
                reflectiveQuadTo(243f, 549f)
                quadToRelative(-12f, -22f, -21f, -44f)
                reflectiveQuadToRelative(-16f, -43f)
                quadToRelative(-11f, 59f, -1.5f, 118f)
                reflectiveQuadTo(246f, 690f)
                close()
                moveToRelative(112f, -110f)
                lineToRelative(222f, -224f)
                quadToRelative(-43f, -33f, -86.5f, -53.5f)
                reflectiveQuadToRelative(-81.5f, -28f)
                quadToRelative(-38f, -7.5f, -68.5f, -2.5f)
                reflectiveQuadTo(296f, 294f)
                quadToRelative(-17f, 18f, -22f, 48.5f)
                reflectiveQuadToRelative(2.5f, 69f)
                quadToRelative(7.5f, 38.5f, 28f, 81.5f)
                reflectiveQuadToRelative(53.5f, 87f)
                close()
                moveToRelative(278f, -280f)
                lineToRelative(56f, -54f)
                quadToRelative(-53f, -32f, -112f, -42f)
                reflectiveQuadToRelative(-118f, 2f)
                quadToRelative(22f, 7f, 44f, 16f)
                reflectiveQuadToRelative(44f, 20.5f)
                quadToRelative(22f, 11.5f, 43.5f, 26f)
                reflectiveQuadTo(636f, 300f)
                close()
            }
        }.build()
        
        return _Beach_access!!
    }

private var _Beach_access: ImageVector? = null

