package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Luggage: ImageVector
    get() {
        if (_Luggage != null) return _Luggage!!
        
        _Luggage = ImageVector.Builder(
            name = "luggage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-440f)
                horizontalLineTo(280f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(80f, -40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(-80f, -480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, 300f)
                close()
            }
        }.build()
        
        return _Luggage!!
    }

private var _Luggage: ImageVector? = null

