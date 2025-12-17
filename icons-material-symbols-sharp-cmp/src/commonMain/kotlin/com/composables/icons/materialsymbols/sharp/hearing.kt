package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hearing: ImageVector
    get() {
        if (_Hearing != null) return _Hearing!!
        
        _Hearing = ImageVector.Builder(
            name = "hearing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                quadToRelative(-62f, 0f, -101.5f, -31f)
                reflectiveQuadTo(518f, 758f)
                quadToRelative(-17f, -50f, -32.5f, -70f)
                reflectiveQuadTo(414f, 624f)
                quadToRelative(-62f, -50f, -98f, -113f)
                reflectiveQuadToRelative(-36f, -151f)
                quadToRelative(0f, -119f, 80.5f, -199.5f)
                reflectiveQuadTo(560f, 80f)
                quadToRelative(119f, 0f, 199.5f, 80.5f)
                reflectiveQuadTo(840f, 360f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -85f, -57.5f, -142.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(-85f, 0f, -142.5f, 57.5f)
                reflectiveQuadTo(360f, 360f)
                quadToRelative(0f, 68f, 27f, 116f)
                reflectiveQuadToRelative(77f, 86f)
                quadToRelative(52f, 38f, 81f, 74f)
                reflectiveQuadToRelative(43f, 78f)
                quadToRelative(14f, 44f, 33.5f, 65f)
                reflectiveQuadToRelative(58.5f, 21f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 720f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(248f, 670f)
                quadToRelative(-59f, -60f, -93.5f, -139.5f)
                reflectiveQuadTo(120f, 360f)
                quadToRelative(0f, -92f, 34.5f, -172f)
                reflectiveQuadTo(248f, 48f)
                lineToRelative(58f, 56f)
                quadToRelative(-50f, 50f, -78f, 115.5f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(0f, 74f, 28f, 139f)
                reflectiveQuadToRelative(78f, 115f)
                lineToRelative(-58f, 56f)
                close()
                moveToRelative(312f, -210f)
                quadToRelative(-42f, 0f, -71f, -29.5f)
                reflectiveQuadTo(460f, 360f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 41f, -29f, 70.5f)
                reflectiveQuadTo(560f, 460f)
                close()
            }
        }.build()
        
        return _Hearing!!
    }

private var _Hearing: ImageVector? = null

