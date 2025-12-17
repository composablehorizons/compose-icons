package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Laundry: ImageVector
    get() {
        if (_Laundry != null) return _Laundry!!
        
        _Laundry = ImageVector.Builder(
            name = "laundry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(195f, 372f)
                lineToRelative(125f, -69f)
                verticalLineToRelative(237f)
                quadToRelative(-21f, 2f, -41f, 6.5f)
                reflectiveQuadTo(240f, 559f)
                verticalLineToRelative(-120f)
                lineToRelative(-41f, 22f)
                quadToRelative(-14f, 8f, -30f, 3.5f)
                reflectiveQuadTo(145f, 446f)
                lineTo(65f, 307f)
                quadToRelative(-8f, -14f, -3.5f, -30.5f)
                reflectiveQuadTo(80f, 252f)
                lineToRelative(199f, -115f)
                quadToRelative(12f, -7f, 25f, -12f)
                reflectiveQuadToRelative(27f, -5f)
                quadToRelative(14f, 0f, 24f, 8.5f)
                reflectiveQuadToRelative(15f, 21.5f)
                quadToRelative(14f, 38f, 36.5f, 64f)
                reflectiveQuadToRelative(73.5f, 26f)
                quadToRelative(51f, 0f, 73.5f, -26f)
                reflectiveQuadToRelative(36.5f, -64f)
                quadToRelative(5f, -13f, 15.5f, -21.5f)
                reflectiveQuadTo(630f, 120f)
                quadToRelative(14f, 0f, 26.5f, 5f)
                reflectiveQuadToRelative(24.5f, 12f)
                lineToRelative(199f, 115f)
                quadToRelative(14f, 8f, 18f, 24f)
                reflectiveQuadToRelative(-4f, 30f)
                lineToRelative(-79f, 140f)
                quadToRelative(-8f, 14f, -24f, 18.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                lineToRelative(-41f, -22f)
                verticalLineToRelative(192f)
                lineToRelative(-63f, 55f)
                quadToRelative(-4f, 3f, -8f, 5.5f)
                reflectiveQuadToRelative(-9f, 4.5f)
                verticalLineToRelative(-393f)
                lineToRelative(125f, 69f)
                lineToRelative(40f, -70f)
                lineToRelative(-153f, -89f)
                quadToRelative(-24f, 49f, -70.5f, 78f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-55f, 0f, -101.5f, -29f)
                reflectiveQuadTo(308f, 213f)
                lineToRelative(-154f, 89f)
                lineToRelative(41f, 70f)
                close()
                moveToRelative(285f, -52f)
                close()
                moveTo(160f, 745f)
                quadToRelative(-11f, -13f, -9.5f, -29.5f)
                reflectiveQuadTo(165f, 688f)
                lineToRelative(56f, -48f)
                quadToRelative(23f, -20f, 52.5f, -30.5f)
                reflectiveQuadTo(335f, 599f)
                quadToRelative(32f, 0f, 61f, 10.5f)
                reflectiveQuadToRelative(52f, 30.5f)
                lineToRelative(116f, 99f)
                quadToRelative(12f, 10f, 28.5f, 15.5f)
                reflectiveQuadTo(626f, 760f)
                quadToRelative(18f, 0f, 33.5f, -5f)
                reflectiveQuadToRelative(27.5f, -16f)
                lineToRelative(56f, -48f)
                quadToRelative(13f, -11f, 29.5f, -10f)
                reflectiveQuadToRelative(27.5f, 14f)
                quadToRelative(11f, 13f, 9.5f, 29.5f)
                reflectiveQuadTo(795f, 752f)
                lineToRelative(-56f, 48f)
                quadToRelative(-23f, 20f, -52f, 30f)
                reflectiveQuadToRelative(-61f, 10f)
                quadToRelative(-32f, 0f, -61.5f, -10f)
                reflectiveQuadTo(512f, 800f)
                lineToRelative(-116f, -99f)
                quadToRelative(-12f, -10f, -27.5f, -15.5f)
                reflectiveQuadTo(335f, 680f)
                quadToRelative(-17f, 0f, -33.5f, 5.5f)
                reflectiveQuadTo(273f, 701f)
                lineToRelative(-57f, 48f)
                quadToRelative(-13f, 11f, -29f, 10f)
                reflectiveQuadToRelative(-27f, -14f)
                close()
            }
        }.build()
        
        return _Laundry!!
    }

private var _Laundry: ImageVector? = null

