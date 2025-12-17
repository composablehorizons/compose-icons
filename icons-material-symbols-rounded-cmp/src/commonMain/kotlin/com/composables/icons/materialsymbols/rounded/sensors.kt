package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sensors: ImageVector
    get() {
        if (_Sensors != null) return _Sensors!!
        
        _Sensors = ImageVector.Builder(
            name = "sensors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 480f)
                quadToRelative(0f, 56f, 17f, 105.5f)
                reflectiveQuadToRelative(49f, 89.5f)
                quadToRelative(11f, 14f, 11f, 30.5f)
                reflectiveQuadTo(225f, 734f)
                quadToRelative(-12f, 12f, -29f, 11.5f)
                reflectiveQuadTo(168f, 731f)
                quadToRelative(-42f, -52f, -65f, -115.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -72f, 23f, -136f)
                reflectiveQuadToRelative(65f, -115f)
                quadToRelative(11f, -14f, 28f, -14.5f)
                reflectiveQuadToRelative(29f, 11.5f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(226f, 285f)
                quadToRelative(-32f, 41f, -49f, 90.5f)
                reflectiveQuadTo(160f, 480f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, 23f, 6f, 43.5f)
                reflectiveQuadToRelative(17f, 38.5f)
                quadToRelative(9f, 14f, 8.5f, 31f)
                reflectiveQuadTo(339f, 622f)
                quadToRelative(-12f, 12f, -29f, 11.5f)
                reflectiveQuadTo(284f, 619f)
                quadToRelative(-21f, -29f, -32.5f, -65f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -39f, 11.5f, -74.5f)
                reflectiveQuadTo(284f, 341f)
                quadToRelative(10f, -14f, 26.5f, -14f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12.5f, 28.5f)
                reflectiveQuadTo(343f, 398f)
                quadToRelative(-11f, 18f, -17f, 38.5f)
                reflectiveQuadToRelative(-6f, 43.5f)
                close()
                moveToRelative(160f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(160f, -80f)
                quadToRelative(0f, -23f, -6f, -43.5f)
                reflectiveQuadTo(617f, 398f)
                quadToRelative(-9f, -14f, -8f, -31f)
                reflectiveQuadToRelative(13f, -29f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(26f, 14.5f)
                quadToRelative(21f, 29f, 32.5f, 64.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, 38f, -11.5f, 74f)
                reflectiveQuadTo(676f, 619f)
                quadToRelative(-9f, 14f, -26f, 14f)
                reflectiveQuadToRelative(-29f, -12f)
                quadToRelative(-12f, -12f, -12.5f, -28.5f)
                reflectiveQuadTo(617f, 562f)
                quadToRelative(11f, -18f, 17f, -38.5f)
                reflectiveQuadToRelative(6f, -43.5f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -56f, -17f, -105.5f)
                reflectiveQuadTo(734f, 285f)
                quadToRelative(-11f, -14f, -11.5f, -30.5f)
                reflectiveQuadTo(734f, 226f)
                quadToRelative(12f, -12f, 29.5f, -11.5f)
                reflectiveQuadTo(792f, 229f)
                quadToRelative(42f, 51f, 65f, 115f)
                reflectiveQuadToRelative(23f, 136f)
                quadToRelative(0f, 72f, -23f, 135.5f)
                reflectiveQuadTo(792f, 731f)
                quadToRelative(-11f, 14f, -28f, 14.5f)
                reflectiveQuadTo(735f, 734f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(11f, -30.5f)
                quadToRelative(32f, -41f, 49f, -90.5f)
                reflectiveQuadTo(800f, 480f)
                close()
            }
        }.build()
        
        return _Sensors!!
    }

private var _Sensors: ImageVector? = null

