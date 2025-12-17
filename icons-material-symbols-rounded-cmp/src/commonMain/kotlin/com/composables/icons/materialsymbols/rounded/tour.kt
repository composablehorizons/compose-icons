package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tour: ImageVector
    get() {
        if (_Tour != null) return _Tour!!
        
        _Tour = ImageVector.Builder(
            name = "tour",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 560f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(501f)
                quadToRelative(21f, 0f, 33f, 17.5f)
                reflectiveQuadToRelative(4f, 37.5f)
                lineToRelative(-58f, 145f)
                lineToRelative(58f, 145f)
                quadToRelative(8f, 20f, -4f, 37.5f)
                reflectiveQuadTo(781f, 560f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(240f)
                verticalLineToRelative(-240f)
                close()
                moveToRelative(220f, 200f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(580f, 360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(500f, 280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(420f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(500f, 440f)
                close()
                moveToRelative(-220f, 40f)
                horizontalLineToRelative(442f)
                lineToRelative(-48f, -120f)
                lineToRelative(48f, -120f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Tour!!
    }

private var _Tour: ImageVector? = null

