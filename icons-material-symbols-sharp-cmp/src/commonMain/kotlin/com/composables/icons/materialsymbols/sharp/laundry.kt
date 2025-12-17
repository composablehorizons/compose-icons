package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Laundry: ImageVector
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
                moveTo(165f, 480f)
                lineTo(45f, 272f)
                lineToRelative(264f, -152f)
                horizontalLineToRelative(51f)
                quadToRelative(16f, 48f, 38f, 84f)
                reflectiveQuadToRelative(82f, 36f)
                quadToRelative(60f, 0f, 82f, -36f)
                reflectiveQuadToRelative(38f, -84f)
                horizontalLineToRelative(51f)
                lineToRelative(263f, 153f)
                lineToRelative(-119f, 207f)
                lineToRelative(-75f, -41f)
                verticalLineToRelative(192f)
                lineToRelative(-63f, 55f)
                quadToRelative(-3f, 2f, -8f, 5f)
                reflectiveQuadToRelative(-9f, 5f)
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
                lineToRelative(125f, -69f)
                verticalLineToRelative(237f)
                quadToRelative(-21f, 2f, -41f, 6.5f)
                reflectiveQuadTo(240f, 559f)
                verticalLineToRelative(-120f)
                lineToRelative(-75f, 41f)
                close()
                moveToRelative(21f, 295f)
                lineToRelative(-52f, -61f)
                lineToRelative(87f, -74f)
                quadToRelative(23f, -20f, 52.5f, -30.5f)
                reflectiveQuadTo(335f, 599f)
                quadToRelative(32f, 0f, 61f, 10.5f)
                reflectiveQuadToRelative(52f, 30.5f)
                lineToRelative(116f, 99f)
                quadToRelative(12f, 10f, 28.5f, 15.5f)
                reflectiveQuadTo(626f, 760f)
                quadToRelative(18f, 0f, 33.5f, -5f)
                reflectiveQuadToRelative(27.5f, -16f)
                lineToRelative(87f, -75f)
                lineToRelative(52f, 62f)
                lineToRelative(-87f, 74f)
                quadToRelative(-23f, 20f, -52f, 30f)
                reflectiveQuadToRelative(-61f, 10f)
                quadToRelative(-32f, 0f, -61.5f, -10f)
                reflectiveQuadTo(512f, 800f)
                lineToRelative(-116f, -99f)
                quadToRelative(-12f, -10f, -27.5f, -15.5f)
                reflectiveQuadTo(335f, 680f)
                quadToRelative(-17f, 0f, -33.5f, 5.5f)
                reflectiveQuadTo(273f, 701f)
                lineToRelative(-87f, 74f)
                close()
                moveToRelative(294f, -455f)
                close()
            }
        }.build()
        
        return _Laundry!!
    }

private var _Laundry: ImageVector? = null

