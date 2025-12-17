package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Relax: ImageVector
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
                moveTo(480f, 840f)
                quadToRelative(-18f, 0f, -34.5f, -6.5f)
                reflectiveQuadTo(416f, 814f)
                lineTo(148f, 545f)
                quadToRelative(-14f, -14f, -25.5f, -30.5f)
                reflectiveQuadTo(103f, 480f)
                horizontalLineToRelative(372f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(515f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(475f, 560f)
                quadToRelative(-14f, 0f, -25f, -7.5f)
                reflectiveQuadTo(436f, 531f)
                lineToRelative(-77f, 21f)
                quadToRelative(11f, 39f, 43f, 63.5f)
                reflectiveQuadToRelative(73f, 24.5f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -11f, -2f, -20.5f)
                reflectiveQuadToRelative(-5f, -19.5f)
                horizontalLineToRelative(47f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-41f, 0f, -73f, 24.5f)
                reflectiveQuadTo(519f, 328f)
                lineToRelative(77f, 21f)
                quadToRelative(3f, -14f, 14f, -21.5f)
                reflectiveQuadToRelative(25f, -7.5f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(675f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(635f, 400f)
                horizontalLineTo(82f)
                quadToRelative(-1f, -8f, -1.5f, -14.5f)
                reflectiveQuadTo(80f, 371f)
                quadToRelative(0f, -103f, 67f, -177f)
                reflectiveQuadToRelative(167f, -74f)
                quadToRelative(48f, 0f, 90.5f, 19f)
                reflectiveQuadToRelative(75.5f, 53f)
                quadToRelative(32f, -34f, 74.5f, -53f)
                reflectiveQuadToRelative(90.5f, -19f)
                quadToRelative(100f, 0f, 167.5f, 74f)
                reflectiveQuadTo(880f, 370f)
                quadToRelative(0f, 49f, -17f, 94f)
                reflectiveQuadToRelative(-51f, 80f)
                lineTo(543f, 814f)
                quadToRelative(-13f, 13f, -29f, 19.5f)
                reflectiveQuadToRelative(-34f, 6.5f)
                close()
            }
        }.build()
        
        return _Relax!!
    }

private var _Relax: ImageVector? = null

