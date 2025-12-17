package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Radiology: ImageVector
    get() {
        if (_Radiology != null) return _Radiology!!
        
        _Radiology = ImageVector.Builder(
            name = "radiology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(160f, -80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-83f)
                quadToRelative(0f, -6f, -7f, -19f)
                lineToRelative(-80f, -94f)
                quadToRelative(-7f, -8f, -10f, -17f)
                reflectiveQuadToRelative(-3f, -18f)
                quadToRelative(11f, 5f, 22.5f, 8f)
                reflectiveQuadToRelative(23.5f, 3f)
                quadToRelative(20f, 0f, 39.5f, -8.5f)
                reflectiveQuadTo(440f, 547f)
                quadToRelative(8f, -8f, 18.5f, -12f)
                reflectiveQuadToRelative(21.5f, -4f)
                quadToRelative(12f, 0f, 22.5f, 4f)
                reflectiveQuadToRelative(17.5f, 12f)
                quadToRelative(15f, 16f, 35f, 24.5f)
                reflectiveQuadToRelative(40f, 8.5f)
                quadToRelative(12f, 0f, 23f, -3f)
                reflectiveQuadToRelative(22f, -8f)
                quadToRelative(0f, 9f, -3f, 18f)
                reflectiveQuadToRelative(-10f, 17f)
                lineToRelative(-80f, 94f)
                quadToRelative(-3f, 5f, -5f, 9.5f)
                reflectiveQuadToRelative(-2f, 9.5f)
                verticalLineToRelative(83f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-72f)
                lineToRelative(72f, -84f)
                quadToRelative(11f, -11f, 19.5f, -30f)
                reflectiveQuadToRelative(8.5f, -44f)
                quadToRelative(0f, -13f, -3f, -25.5f)
                reflectiveQuadToRelative(-9f, -24.5f)
                quadToRelative(5f, -11f, 8.5f, -23.5f)
                reflectiveQuadTo(700f, 471f)
                quadToRelative(0f, -20f, -6.5f, -38.5f)
                reflectiveQuadTo(673f, 398f)
                lineToRelative(-73f, -86f)
                verticalLineToRelative(-72f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(83f)
                quadToRelative(0f, 5f, 1.5f, 10f)
                reflectiveQuadToRelative(5.5f, 9f)
                lineToRelative(80f, 95f)
                quadToRelative(6f, 8f, 9.5f, 16.5f)
                reflectiveQuadTo(640f, 471f)
                quadToRelative(0f, 19f, -12.5f, 33.5f)
                reflectiveQuadTo(595f, 519f)
                quadToRelative(-8f, 0f, -16.5f, -3f)
                reflectiveQuadTo(563f, 506f)
                quadToRelative(-17f, -17f, -38.5f, -26f)
                reflectiveQuadToRelative(-44.5f, -9f)
                quadToRelative(-23f, 0f, -44.5f, 9f)
                reflectiveQuadTo(397f, 506f)
                quadToRelative(-6f, 7f, -14f, 10f)
                reflectiveQuadToRelative(-17f, 3f)
                quadToRelative(-20f, 0f, -33f, -14.5f)
                reflectiveQuadTo(320f, 470f)
                quadToRelative(0f, -9f, 3f, -17.5f)
                reflectiveQuadToRelative(10f, -16.5f)
                lineToRelative(80f, -94f)
                quadToRelative(3f, -5f, 5f, -9.5f)
                reflectiveQuadToRelative(2f, -9.5f)
                verticalLineToRelative(-83f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(72f)
                lineToRelative(-72f, 84f)
                quadToRelative(-11f, 11f, -19.5f, 30f)
                reflectiveQuadToRelative(-8.5f, 44f)
                quadToRelative(0f, 14f, 3f, 26.5f)
                reflectiveQuadToRelative(8f, 23.5f)
                quadToRelative(-6f, 12f, -8.5f, 24.5f)
                reflectiveQuadTo(260f, 570f)
                quadToRelative(0f, 25f, 8.5f, 44f)
                reflectiveQuadToRelative(19.5f, 30f)
                lineToRelative(72f, 84f)
                verticalLineToRelative(72f)
                close()
            }
        }.build()
        
        return _Radiology!!
    }

private var _Radiology: ImageVector? = null

