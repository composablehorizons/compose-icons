package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Elderly: ImageVector
    get() {
        if (_Elderly != null) return _Elderly!!
        
        _Elderly = ImageVector.Builder(
            name = "elderly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 920f)
                lineToRelative(-64f, -48f)
                lineToRelative(104f, -139f)
                verticalLineToRelative(-213f)
                quadToRelative(0f, -31f, 5f, -67.5f)
                reflectiveQuadToRelative(15f, -67.5f)
                lineToRelative(-60f, 33f)
                verticalLineToRelative(142f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-188f)
                lineToRelative(176f, -100f)
                quadToRelative(25f, -14f, 43.5f, -21.5f)
                reflectiveQuadTo(494f, 243f)
                quadToRelative(25f, 0f, 45.5f, 21.5f)
                reflectiveQuadTo(587f, 332f)
                quadToRelative(32f, 54f, 58f, 81f)
                reflectiveQuadToRelative(56f, 41f)
                quadToRelative(11f, -8f, 19f, -11f)
                reflectiveQuadToRelative(19f, -3f)
                quadToRelative(25f, 0f, 43f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(420f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-420f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-19f)
                quadToRelative(-54f, -23f, -84f, -51.5f)
                reflectiveQuadTo(543f, 403f)
                quadToRelative(-11f, 28f, -17.5f, 68.5f)
                reflectiveQuadTo(521f, 548f)
                lineToRelative(79f, 112f)
                verticalLineToRelative(260f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                lineToRelative(-71f, -102f)
                lineToRelative(-9f, 142f)
                lineTo(320f, 920f)
                close()
                moveToRelative(220f, -700f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 220f)
                close()
            }
        }.build()
        
        return _Elderly!!
    }

private var _Elderly: ImageVector? = null

