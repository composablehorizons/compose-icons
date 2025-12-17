package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Cycle: ImageVector
    get() {
        if (_Cycle != null) return _Cycle!!
        
        _Cycle = ImageVector.Builder(
            name = "cycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 481f)
                quadToRelative(0f, 85f, 42.5f, 158f)
                reflectiveQuadTo(318f, 756f)
                quadToRelative(14f, 9f, 19.5f, 24.5f)
                reflectiveQuadTo(335f, 810f)
                quadToRelative(-8f, 15f, -24.5f, 19.5f)
                reflectiveQuadTo(279f, 826f)
                quadToRelative(-93f, -54f, -146f, -146f)
                reflectiveQuadTo(80f, 481f)
                quadToRelative(0f, -26f, 3.5f, -51f)
                reflectiveQuadToRelative(9.5f, -50f)
                lineToRelative(-13f, 8f)
                quadToRelative(-14f, 9f, -30f, 4.5f)
                reflectiveQuadTo(26f, 374f)
                quadToRelative(-8f, -14f, -3.5f, -30.5f)
                reflectiveQuadTo(41f, 319f)
                lineToRelative(121f, -70f)
                quadToRelative(14f, -8f, 30.5f, -3.5f)
                reflectiveQuadTo(217f, 264f)
                lineToRelative(70f, 120f)
                quadToRelative(8f, 14f, 3.5f, 30.5f)
                reflectiveQuadTo(272f, 439f)
                quadToRelative(-14f, 8f, -30.5f, 3.5f)
                reflectiveQuadTo(217f, 424f)
                lineToRelative(-34f, -59f)
                quadToRelative(-11f, 28f, -17f, 57f)
                reflectiveQuadToRelative(-6f, 59f)
                close()
                moveToRelative(320f, -321f)
                quadToRelative(-41f, 0f, -81f, 10.5f)
                reflectiveQuadTo(323f, 201f)
                quadToRelative(-15f, 8f, -31.5f, 5.5f)
                reflectiveQuadTo(267f, 190f)
                quadToRelative(-9f, -16f, -4f, -32.5f)
                reflectiveQuadToRelative(21f, -25.5f)
                quadToRelative(45f, -26f, 94.5f, -39f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(79f, 0f, 151.5f, 29.5f)
                reflectiveQuadTo(761f, 195f)
                verticalLineToRelative(-15f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(801f, 140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(841f, 180f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(801f, 360f)
                horizontalLineTo(661f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(621f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(661f, 280f)
                horizontalLineToRelative(69f)
                quadToRelative(-46f, -57f, -111f, -88.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveToRelative(242f, 531f)
                quadToRelative(38f, -44f, 58f, -97f)
                reflectiveQuadToRelative(20f, -111f)
                quadToRelative(0f, -17f, 11.5f, -30f)
                reflectiveQuadToRelative(28.5f, -13f)
                quadToRelative(17f, 0f, 28.5f, 13f)
                reflectiveQuadToRelative(11.5f, 30f)
                quadToRelative(0f, 65f, -20.5f, 125.5f)
                reflectiveQuadTo(800f, 721f)
                quadToRelative(-39f, 52f, -92.5f, 89f)
                reflectiveQuadTo(591f, 865f)
                lineToRelative(10f, 6f)
                quadToRelative(14f, 8f, 18f, 24.5f)
                reflectiveQuadTo(615f, 926f)
                quadToRelative(-8f, 14f, -24f, 18f)
                reflectiveQuadToRelative(-30f, -4f)
                lineTo(439f, 870f)
                quadToRelative(-14f, -8f, -18.5f, -24.5f)
                reflectiveQuadTo(424f, 815f)
                lineToRelative(70f, -121f)
                quadToRelative(8f, -14f, 24f, -18f)
                reflectiveQuadToRelative(30f, 4f)
                quadToRelative(14f, 8f, 18.5f, 24.5f)
                reflectiveQuadTo(563f, 735f)
                lineToRelative(-37f, 63f)
                quadToRelative(57f, -8f, 107.5f, -35.5f)
                reflectiveQuadTo(722f, 691f)
                close()
            }
        }.build()
        
        return _Cycle!!
    }

private var _Cycle: ImageVector? = null

