package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Spoof: ImageVector
    get() {
        if (_Spoof != null) return _Spoof!!
        
        _Spoof = ImageVector.Builder(
            name = "spoof",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 876f)
                quadToRelative(-131f, 0f, -243f, -66.5f)
                reflectiveQuadTo(63f, 627f)
                quadToRelative(-6f, -12f, -9f, -25f)
                reflectiveQuadToRelative(-3f, -26f)
                quadToRelative(0f, -13f, 3f, -26f)
                reflectiveQuadToRelative(9f, -25f)
                quadToRelative(62f, -116f, 174f, -182.5f)
                reflectiveQuadTo(480f, 276f)
                quadToRelative(131f, 0f, 243f, 66.5f)
                reflectiveQuadTo(897f, 525f)
                quadToRelative(6f, 12f, 9f, 25f)
                reflectiveQuadToRelative(3f, 26f)
                quadToRelative(0f, 13f, -3f, 26f)
                reflectiveQuadToRelative(-9f, 25f)
                quadToRelative(-62f, 116f, -174f, 182.5f)
                reflectiveQuadTo(480f, 876f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(96f, 0f, 178.5f, -42.5f)
                reflectiveQuadTo(796f, 636f)
                quadToRelative(-29f, -41f, -66f, -71.5f)
                reflectiveQuadTo(649f, 514f)
                quadToRelative(5f, 14f, 8f, 29.5f)
                reflectiveQuadToRelative(3f, 32.5f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(480f, 756f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(300f, 576f)
                quadToRelative(0f, -17f, 3f, -32.5f)
                reflectiveQuadToRelative(8f, -29.5f)
                quadToRelative(-44f, 20f, -81f, 51f)
                reflectiveQuadToRelative(-66f, 71f)
                quadToRelative(55f, 75f, 137.5f, 117.5f)
                reflectiveQuadTo(480f, 796f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(160f, 521f)
                quadToRelative(66f, -60f, 148.5f, -92.5f)
                reflectiveQuadTo(480f, 396f)
                quadToRelative(89f, 0f, 171.5f, 32.5f)
                reflectiveQuadTo(800f, 521f)
                quadToRelative(-54f, -77f, -138.5f, -121f)
                reflectiveQuadTo(480f, 356f)
                quadToRelative(-97f, 0f, -181.5f, 44f)
                reflectiveQuadTo(160f, 521f)
                close()
            }
        }.build()
        
        return _Spoof!!
    }

private var _Spoof: ImageVector? = null

