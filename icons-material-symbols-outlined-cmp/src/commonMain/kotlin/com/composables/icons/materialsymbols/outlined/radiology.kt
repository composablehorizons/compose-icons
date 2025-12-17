package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Radiology: ImageVector
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-72f)
                lineToRelative(-72f, -84f)
                quadToRelative(-11f, -11f, -19.5f, -30f)
                reflectiveQuadToRelative(-8.5f, -44f)
                quadToRelative(0f, -13f, 2.5f, -25.5f)
                reflectiveQuadTo(271f, 520f)
                quadToRelative(-5f, -11f, -8f, -23.5f)
                reflectiveQuadToRelative(-3f, -26.5f)
                quadToRelative(0f, -25f, 8.5f, -44f)
                reflectiveQuadToRelative(19.5f, -30f)
                lineToRelative(72f, -84f)
                verticalLineToRelative(-72f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(83f)
                quadToRelative(0f, 5f, -7f, 19f)
                lineToRelative(-80f, 94f)
                quadToRelative(-7f, 8f, -10f, 16.5f)
                reflectiveQuadToRelative(-3f, 17.5f)
                quadToRelative(0f, 20f, 13f, 34.5f)
                reflectiveQuadToRelative(33f, 14.5f)
                quadToRelative(9f, 0f, 17f, -3f)
                reflectiveQuadToRelative(14f, -10f)
                quadToRelative(17f, -17f, 38.5f, -26f)
                reflectiveQuadToRelative(44.5f, -9f)
                quadToRelative(23f, 0f, 44.5f, 9f)
                reflectiveQuadToRelative(38.5f, 26f)
                quadToRelative(7f, 7f, 15f, 10f)
                reflectiveQuadToRelative(16f, 3f)
                quadToRelative(20f, 0f, 33f, -14.5f)
                reflectiveQuadToRelative(13f, -33.5f)
                quadToRelative(0f, -9f, -3.5f, -17.5f)
                reflectiveQuadTo(627f, 437f)
                lineToRelative(-80f, -95f)
                quadToRelative(-4f, -4f, -5.5f, -9f)
                reflectiveQuadToRelative(-1.5f, -10f)
                verticalLineToRelative(-83f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(72f)
                lineToRelative(73f, 86f)
                quadToRelative(14f, 16f, 20.5f, 34.5f)
                reflectiveQuadTo(700f, 471f)
                quadToRelative(0f, 13f, -3.5f, 25.5f)
                reflectiveQuadTo(688f, 520f)
                quadToRelative(6f, 12f, 9f, 24.5f)
                reflectiveQuadToRelative(3f, 25.5f)
                quadToRelative(0f, 25f, -8.5f, 44f)
                reflectiveQuadTo(672f, 644f)
                lineToRelative(-72f, 84f)
                verticalLineToRelative(72f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-83f)
                quadToRelative(0f, -6f, 7f, -19f)
                lineToRelative(80f, -94f)
                quadToRelative(7f, -8f, 10f, -17f)
                reflectiveQuadToRelative(3f, -18f)
                quadToRelative(-11f, 5f, -22f, 7.5f)
                reflectiveQuadToRelative(-23f, 2.5f)
                quadToRelative(-20f, 0f, -40f, -8f)
                reflectiveQuadToRelative(-35f, -24f)
                quadToRelative(-7f, -8f, -17.5f, -12f)
                reflectiveQuadToRelative(-22.5f, -4f)
                quadToRelative(-11f, 0f, -21.5f, 4f)
                reflectiveQuadTo(440f, 547f)
                quadToRelative(-15f, 16f, -34.5f, 24f)
                reflectiveQuadToRelative(-39.5f, 8f)
                quadToRelative(-12f, 0f, -23.5f, -2.5f)
                reflectiveQuadTo(320f, 569f)
                quadToRelative(0f, 9f, 3f, 18f)
                reflectiveQuadToRelative(10f, 17f)
                lineToRelative(80f, 94f)
                quadToRelative(3f, 5f, 5f, 9.5f)
                reflectiveQuadToRelative(2f, 9.5f)
                verticalLineToRelative(83f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-160f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Radiology!!
    }

private var _Radiology: ImageVector? = null

