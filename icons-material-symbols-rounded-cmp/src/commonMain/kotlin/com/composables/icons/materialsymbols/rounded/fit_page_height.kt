package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fit_page_height: ImageVector
    get() {
        if (_Fit_page_height != null) return _Fit_page_height!!
        
        _Fit_page_height = ImageVector.Builder(
            name = "fit_page_height",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(480f, -80f)
                verticalLineToRelative(-640f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                close()
                moveToRelative(0f, -640f)
                horizontalLineTo(240f)
                horizontalLineToRelative(480f)
                close()
                moveTo(408f, 360f)
                horizontalLineToRelative(144f)
                quadToRelative(14f, 0f, 19f, -12f)
                reflectiveQuadToRelative(-5f, -22f)
                lineToRelative(-58f, -58f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineToRelative(-58f, 58f)
                quadToRelative(-10f, 10f, -5f, 22f)
                reflectiveQuadToRelative(19f, 12f)
                close()
                moveToRelative(100f, 332f)
                lineToRelative(58f, -58f)
                quadToRelative(10f, -10f, 5f, -22f)
                reflectiveQuadToRelative(-19f, -12f)
                horizontalLineTo(408f)
                quadToRelative(-14f, 0f, -19f, 12f)
                reflectiveQuadToRelative(5f, 22f)
                lineToRelative(58f, 58f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                close()
            }
        }.build()
        
        return _Fit_page_height!!
    }

private var _Fit_page_height: ImageVector? = null

