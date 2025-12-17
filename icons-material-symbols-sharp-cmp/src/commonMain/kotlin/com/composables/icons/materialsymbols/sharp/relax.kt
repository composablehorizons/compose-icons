package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Relax: ImageVector
    get() {
        if (_Relax != null) return _Relax!!
        
        _Relax = ImageVector.Builder(
            name = "relax",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(479f, 878f)
                lineTo(163f, 560f)
                horizontalLineToRelative(113f)
                lineToRelative(204f, 204f)
                lineToRelative(274f, -275f)
                quadToRelative(23f, -23f, 35f, -54.5f)
                reflectiveQuadToRelative(12f, -64.5f)
                quadToRelative(-2f, -69f, -46f, -118.5f)
                reflectiveQuadTo(645f, 202f)
                quadToRelative(-31f, 0f, -59.5f, 12f)
                reflectiveQuadTo(536f, 249f)
                lineToRelative(-56f, 61f)
                lineToRelative(-57f, -61f)
                quadToRelative(-21f, -23f, -49f, -36f)
                reflectiveQuadToRelative(-60f, -13f)
                quadToRelative(-54f, 0f, -93.5f, 34.5f)
                reflectiveQuadTo(167f, 320f)
                horizontalLineTo(85f)
                quadToRelative(17f, -85f, 79.5f, -142.5f)
                reflectiveQuadTo(314f, 120f)
                quadToRelative(48f, 0f, 90.5f, 19f)
                reflectiveQuadToRelative(75.5f, 53f)
                quadToRelative(32f, -34f, 74.5f, -53f)
                reflectiveQuadToRelative(90.5f, -19f)
                quadToRelative(100f, 0f, 167.5f, 74f)
                reflectiveQuadTo(880f, 370f)
                quadToRelative(0f, 49f, -17f, 94f)
                reflectiveQuadToRelative(-51f, 80f)
                lineTo(479f, 878f)
                close()
                moveToRelative(-4f, -398f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(555f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(675f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(635f, 320f)
                quadToRelative(-14f, 0f, -25f, 7.5f)
                reflectiveQuadTo(596f, 349f)
                lineToRelative(-77f, -21f)
                quadToRelative(11f, -39f, 43f, -63.5f)
                reflectiveQuadToRelative(73f, -24.5f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineToRelative(-47f)
                quadToRelative(3f, 10f, 5f, 19.5f)
                reflectiveQuadToRelative(2f, 20.5f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-41f, 0f, -73f, -24.5f)
                reflectiveQuadTo(359f, 552f)
                lineToRelative(77f, -21f)
                quadToRelative(3f, 14f, 14f, 21.5f)
                reflectiveQuadToRelative(25f, 7.5f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(515f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(475f, 480f)
                close()
                moveToRelative(6f, 2f)
                close()
            }
        }.build()
        
        return _Relax!!
    }

private var _Relax: ImageVector? = null

