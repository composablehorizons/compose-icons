package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Buttons_alt: ImageVector
    get() {
        if (_Buttons_alt != null) return _Buttons_alt!!
        
        _Buttons_alt = ImageVector.Builder(
            name = "buttons_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(130f, -120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(90f)
                close()
            }
        }.build()
        
        return _Buttons_alt!!
    }

private var _Buttons_alt: ImageVector? = null

