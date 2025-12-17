package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stethoscope_check: ImageVector
    get() {
        if (_Stethoscope_check != null) return _Stethoscope_check!!
        
        _Stethoscope_check = ImageVector.Builder(
            name = "stethoscope_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(665f, 812f)
                lineToRelative(-85f, -85f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(57f, 57f)
                lineToRelative(141f, -142f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(892f, 642f)
                lineTo(722f, 812f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(665f, 812f)
                close()
                moveTo(520f, 880f)
                quadToRelative(-103f, 0f, -171.5f, -77f)
                reflectiveQuadTo(280f, 620f)
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
                quadToRelative(0f, 72f, 45.5f, 126f)
                reflectiveQuadTo(520f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 880f)
                close()
            }
        }.build()
        
        return _Stethoscope_check!!
    }

private var _Stethoscope_check: ImageVector? = null

