package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Emergency_heat: ImageVector
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
                quadToRelative(-39f, 33f, -69f, 68.5f)
                reflectiveQuadToRelative(-50.5f, 72f)
                quadTo(221f, 447f, 210.5f, 485f)
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
                moveToRelative(0f, -492f)
                verticalLineToRelative(132f)
                quadToRelative(0f, 34f, 23.5f, 57f)
                reflectiveQuadToRelative(57.5f, 23f)
                quadToRelative(18f, 0f, 33.5f, -7.5f)
                reflectiveQuadTo(582f, 302f)
                lineToRelative(18f, -22f)
                quadToRelative(74f, 42f, 117f, 117f)
                reflectiveQuadToRelative(43f, 163f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadTo(440f, 880f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -129f, 86.5f, -245f)
                reflectiveQuadTo(440f, 120f)
                close()
                moveToRelative(400f, 320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 440f)
                close()
                moveToRelative(-40f, -120f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Emergency_heat!!
    }

private var _Emergency_heat: ImageVector? = null

