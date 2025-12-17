package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stethoscope: ImageVector
    get() {
        if (_Stethoscope != null) return _Stethoscope!!
        
        _Stethoscope = ImageVector.Builder(
            name = "stethoscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(540f, 880f)
                quadToRelative(-108f, 0f, -184f, -76f)
                reflectiveQuadToRelative(-76f, -184f)
                verticalLineToRelative(-23f)
                quadToRelative(-86f, -14f, -143f, -80.5f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 120f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 120f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 200f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 120f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 160f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 90f, -57f, 156.5f)
                reflectiveQuadTo(360f, 597f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(540f, 800f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(720f, 620f)
                verticalLineToRelative(-67f)
                quadToRelative(-35f, -13f, -57.5f, -43.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 39f, -22.5f, 69.5f)
                reflectiveQuadTo(800f, 553f)
                verticalLineToRelative(67f)
                quadToRelative(0f, 108f, -76f, 184f)
                reflectiveQuadTo(540f, 880f)
                close()
            }
        }.build()
        
        return _Stethoscope!!
    }

private var _Stethoscope: ImageVector? = null

