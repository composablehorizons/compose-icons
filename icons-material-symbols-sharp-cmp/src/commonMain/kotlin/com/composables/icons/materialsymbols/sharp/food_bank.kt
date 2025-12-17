package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Food_bank: ImageVector
    get() {
        if (_Food_bank != null) return _Food_bank!!
        
        _Food_bank = ImageVector.Builder(
            name = "food_bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 720f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(500f, 500f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(400f, 560f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-340f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(520f, 460f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(140f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                lineTo(480f, 220f)
                lineTo(240f, 400f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(240f, -270f)
                close()
            }
        }.build()
        
        return _Food_bank!!
    }

private var _Food_bank: ImageVector? = null

