package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Elderly_woman: ImageVector
    get() {
        if (_Elderly_woman != null) return _Elderly_woman!!
        
        _Elderly_woman = ImageVector.Builder(
            name = "elderly_woman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(540f, 220f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, -8f, 4f, -24f)
                quadToRelative(-11f, -5f, -17.5f, -14.5f)
                reflectiveQuadTo(440f, 80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(12f, 0f, 21.5f, 6.5f)
                reflectiveQuadTo(516f, 64f)
                quadToRelative(6f, -2f, 12f, -3f)
                reflectiveQuadToRelative(12f, -1f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 220f)
                close()
                moveToRelative(160f, 350f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-19f)
                quadToRelative(-38f, -21f, -78f, -54.5f)
                reflectiveQuadTo(543f, 403f)
                lineToRelative(-23f, 117f)
                lineToRelative(80f, 239f)
                verticalLineToRelative(161f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                lineTo(344f, 888f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -8f)
                quadToRelative(-14f, -10f, -16f, -26f)
                reflectiveQuadToRelative(8f, -30f)
                lineToRelative(60f, -80f)
                horizontalLineToRelative(-49f)
                quadToRelative(-18f, 0f, -28.5f, -15f)
                reflectiveQuadTo(252f, 710f)
                quadToRelative(0f, -35f, 13.5f, -95.5f)
                reflectiveQuadTo(313f, 465f)
                quadToRelative(34f, -90f, 80.5f, -157.5f)
                reflectiveQuadTo(494f, 240f)
                quadToRelative(37f, 0f, 51.5f, 23f)
                reflectiveQuadToRelative(41.5f, 69f)
                quadToRelative(32f, 54f, 58f, 81f)
                reflectiveQuadToRelative(56f, 41f)
                quadToRelative(11f, -8f, 19f, -11f)
                reflectiveQuadToRelative(19f, -3f)
                quadToRelative(25f, 0f, 43f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                close()
            }
        }.build()
        
        return _Elderly_woman!!
    }

private var _Elderly_woman: ImageVector? = null

