package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_unknown: ImageVector
    get() {
        if (_Battery_unknown != null) return _Battery_unknown!!
        
        _Battery_unknown = ImageVector.Builder(
            name = "battery_unknown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(656f, 778f)
                quadToRelative(0f, -14f, 0.5f, -27.5f)
                reflectiveQuadTo(664f, 725f)
                quadToRelative(10f, -17f, 25.5f, -29f)
                reflectiveQuadToRelative(26.5f, -28f)
                quadToRelative(3f, -4f, 7f, -23f)
                quadToRelative(0f, -17f, -13f, -28f)
                reflectiveQuadToRelative(-30f, -11f)
                quadToRelative(-17f, 0f, -30f, 11f)
                reflectiveQuadToRelative(-18f, 28f)
                lineToRelative(-44f, -19f)
                quadToRelative(10f, -30f, 35f, -48f)
                reflectiveQuadToRelative(57f, -18f)
                quadToRelative(37f, 0f, 64.5f, 24f)
                reflectiveQuadToRelative(27.5f, 60f)
                quadToRelative(0f, 11f, -3f, 20.5f)
                reflectiveQuadToRelative(-9f, 17.5f)
                quadToRelative(-11f, 16f, -26f, 28.5f)
                reflectiveQuadTo(710f, 740f)
                quadToRelative(-6f, 11f, -6f, 38f)
                horizontalLineToRelative(-48f)
                close()
                moveToRelative(24f, 102f)
                quadToRelative(-14f, 0f, -24f, -9.5f)
                reflectiveQuadTo(646f, 847f)
                quadToRelative(0f, -14f, 10f, -24f)
                reflectiveQuadToRelative(24f, -10f)
                quadToRelative(14f, 0f, 23.5f, 10f)
                reflectiveQuadToRelative(9.5f, 24f)
                quadToRelative(0f, 14f, -9.5f, 23.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(-320f, -80f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                quadToRelative(-21f, 0f, -41f, 3.5f)
                reflectiveQuadTo(600f, 494f)
                verticalLineToRelative(-254f)
                horizontalLineTo(360f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(94f)
                quadToRelative(8f, 23f, 19.5f, 43f)
                reflectiveQuadTo(501f, 880f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Battery_unknown!!
    }

private var _Battery_unknown: ImageVector? = null

