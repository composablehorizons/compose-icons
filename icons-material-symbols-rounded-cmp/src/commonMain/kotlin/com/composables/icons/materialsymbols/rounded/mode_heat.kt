package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mode_heat: ImageVector
    get() {
        if (_Mode_heat != null) return _Mode_heat!!
        
        _Mode_heat = ImageVector.Builder(
            name = "mode_heat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -113f, 67f, -217f)
                reflectiveQuadToRelative(184f, -182f)
                quadToRelative(22f, -15f, 45.5f, -1.5f)
                reflectiveQuadTo(480f, 200f)
                verticalLineToRelative(52f)
                quadToRelative(0f, 34f, 23.5f, 57f)
                reflectiveQuadToRelative(57.5f, 23f)
                quadToRelative(17f, 0f, 32.5f, -7.5f)
                reflectiveQuadTo(621f, 303f)
                quadToRelative(8f, -10f, 20.5f, -12.5f)
                reflectiveQuadTo(665f, 296f)
                quadToRelative(63f, 45f, 99f, 115f)
                reflectiveQuadToRelative(36f, 149f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(240f, 560f)
                quadToRelative(0f, 52f, 21f, 98.5f)
                reflectiveQuadToRelative(60f, 81.5f)
                quadToRelative(-1f, -5f, -1f, -9f)
                verticalLineToRelative(-9f)
                quadToRelative(0f, -32f, 12f, -60f)
                reflectiveQuadToRelative(35f, -51f)
                lineToRelative(113f, -111f)
                lineToRelative(113f, 111f)
                quadToRelative(23f, 23f, 35f, 51f)
                reflectiveQuadToRelative(12f, 60f)
                verticalLineToRelative(9f)
                quadToRelative(0f, 4f, -1f, 9f)
                quadToRelative(39f, -35f, 60f, -81.5f)
                reflectiveQuadToRelative(21f, -98.5f)
                quadToRelative(0f, -50f, -18.5f, -94.5f)
                reflectiveQuadTo(648f, 386f)
                quadToRelative(-20f, 13f, -42f, 19.5f)
                reflectiveQuadToRelative(-45f, 6.5f)
                quadToRelative(-62f, 0f, -107.5f, -41f)
                reflectiveQuadTo(401f, 270f)
                quadToRelative(-78f, 66f, -119.5f, 140.5f)
                reflectiveQuadTo(240f, 560f)
                close()
                moveToRelative(240f, 52f)
                lineToRelative(-57f, 56f)
                quadToRelative(-11f, 11f, -17f, 25f)
                reflectiveQuadToRelative(-6f, 29f)
                quadToRelative(0f, 32f, 23.5f, 55f)
                reflectiveQuadToRelative(56.5f, 23f)
                quadToRelative(33f, 0f, 56.5f, -23f)
                reflectiveQuadToRelative(23.5f, -55f)
                quadToRelative(0f, -16f, -6f, -29.5f)
                reflectiveQuadTo(537f, 668f)
                lineToRelative(-57f, -56f)
                close()
            }
        }.build()
        
        return _Mode_heat!!
    }

private var _Mode_heat: ImageVector? = null

