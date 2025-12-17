package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Emergency_heat: ImageVector
    get() {
        if (_Emergency_heat != null) return _Emergency_heat!!
        
        _Emergency_heat = ImageVector.Builder(
            name = "emergency_heat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -113f, 67f, -217f)
                reflectiveQuadToRelative(184f, -182f)
                quadToRelative(22f, -15f, 45.5f, -1.5f)
                reflectiveQuadTo(440f, 200f)
                verticalLineToRelative(52f)
                quadToRelative(0f, 34f, 23.5f, 57f)
                reflectiveQuadToRelative(57.5f, 23f)
                quadToRelative(17f, 0f, 32.5f, -7.5f)
                reflectiveQuadTo(581f, 303f)
                quadToRelative(8f, -10f, 20.5f, -12.5f)
                reflectiveQuadTo(625f, 296f)
                quadToRelative(63f, 45f, 99f, 115f)
                reflectiveQuadToRelative(36f, 149f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadTo(440f, 880f)
                close()
                moveTo(200f, 560f)
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
                reflectiveQuadTo(608f, 386f)
                quadToRelative(-20f, 13f, -42f, 19.5f)
                reflectiveQuadToRelative(-45f, 6.5f)
                quadToRelative(-62f, 0f, -107.5f, -41f)
                reflectiveQuadTo(361f, 270f)
                quadToRelative(-78f, 66f, -119.5f, 140.5f)
                reflectiveQuadTo(200f, 560f)
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
                reflectiveQuadTo(497f, 668f)
                lineToRelative(-57f, -56f)
                close()
                moveToRelative(400f, -172f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 440f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 280f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 320f)
                close()
            }
        }.build()
        
        return _Emergency_heat!!
    }

private var _Emergency_heat: ImageVector? = null

