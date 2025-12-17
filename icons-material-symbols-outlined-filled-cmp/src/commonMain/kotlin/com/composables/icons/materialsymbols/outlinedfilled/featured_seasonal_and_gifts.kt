package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Featured_seasonal_and_gifts: ImageVector
    get() {
        if (_Featured_seasonal_and_gifts != null) return _Featured_seasonal_and_gifts!!
        
        _Featured_seasonal_and_gifts = ImageVector.Builder(
            name = "featured_seasonal_and_gifts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineTo(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(208f)
                quadToRelative(-5f, -9f, -6.5f, -19f)
                reflectiveQuadToRelative(-1.5f, -21f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(23f, 0f, 43f, 8.5f)
                reflectiveQuadToRelative(37f, 23.5f)
                quadToRelative(17f, -16f, 37f, -24f)
                reflectiveQuadToRelative(43f, -8f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 11f, -2f, 20.5f)
                reflectiveQuadToRelative(-6f, 19.5f)
                horizontalLineToRelative(208f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(440f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, -760f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 120f)
                close()
                moveToRelative(-200f, 40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 160f)
                close()
                moveTo(160f, 280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, 520f)
                verticalLineToRelative(-360f)
                horizontalLineTo(240f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(200f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-360f)
                horizontalLineTo(520f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(280f, -440f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Featured_seasonal_and_gifts!!
    }

private var _Featured_seasonal_and_gifts: ImageVector? = null

