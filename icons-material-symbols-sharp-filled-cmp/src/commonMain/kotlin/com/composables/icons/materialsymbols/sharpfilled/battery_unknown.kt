package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_unknown: ImageVector
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
                moveToRelative(-360f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(280f)
                quadToRelative(-100f, 1f, -170f, 70.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 46f, 16f, 87f)
                reflectiveQuadToRelative(45f, 73f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Battery_unknown!!
    }

private var _Battery_unknown: ImageVector? = null

