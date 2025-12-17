package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Vacuum: ImageVector
    get() {
        if (_Vacuum != null) return _Vacuum!!
        
        _Vacuum = ImageVector.Builder(
            name = "vacuum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(200f, 760f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 800f)
                close()
                moveToRelative(160f, 80f)
                quadToRelative(14f, -18f, 22.5f, -37.5f)
                reflectiveQuadTo(356f, 800f)
                horizontalLineToRelative(84f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 440f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                quadToRelative(-21f, 0f, -41.5f, 4f)
                reflectiveQuadTo(80f, 576f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-136f)
                quadToRelative(0f, -77f, 53.5f, -130.5f)
                reflectiveQuadTo(384f, 40f)
                quadToRelative(56f, 0f, 102f, 30.5f)
                reflectiveQuadToRelative(68f, 81.5f)
                lineToRelative(273f, 648f)
                horizontalLineToRelative(93f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(100f)
                lineTo(481f, 184f)
                quadToRelative(-12f, -29f, -38.5f, -46.5f)
                reflectiveQuadTo(384f, 120f)
                quadToRelative(-44f, 0f, -74f, 30f)
                reflectiveQuadToRelative(-30f, 74f)
                verticalLineToRelative(136f)
                horizontalLineToRelative(80f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(360f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-20f, -260f)
                close()
            }
        }.build()
        
        return _Vacuum!!
    }

private var _Vacuum: ImageVector? = null

