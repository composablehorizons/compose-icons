package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Jamboard_kiosk: ImageVector
    get() {
        if (_Jamboard_kiosk != null) return _Jamboard_kiosk!!
        
        _Jamboard_kiosk = ImageVector.Builder(
            name = "jamboard_kiosk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(520f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-80f, -280f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-360f)
                horizontalLineTo(160f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-360f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Jamboard_kiosk!!
    }

private var _Jamboard_kiosk: ImageVector? = null

