package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Buttons_alt: ImageVector
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
                moveTo(80f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(480f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(130f, -40f)
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
                moveToRelative(-130f, 40f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Buttons_alt!!
    }

private var _Buttons_alt: ImageVector? = null

