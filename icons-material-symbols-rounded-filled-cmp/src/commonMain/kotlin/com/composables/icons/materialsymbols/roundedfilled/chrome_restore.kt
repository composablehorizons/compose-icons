package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chrome_restore: ImageVector
    get() {
        if (_Chrome_restore != null) return _Chrome_restore!!
        
        _Chrome_restore = ImageVector.Builder(
            name = "chrome_restore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 736f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 656f)
                verticalLineTo(336f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 256f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 336f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 736f)
                horizontalLineTo(400f)
                close()
                moveTo(240f, 896f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 816f)
                verticalLineTo(477f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 437f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 477f)
                verticalLineToRelative(339f)
                horizontalLineToRelative(339f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(619f, 856f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(579f, 896f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Chrome_restore!!
    }

private var _Chrome_restore: ImageVector? = null

