package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Back_to_tab: ImageVector
    get() {
        if (_Back_to_tab != null) return _Back_to_tab!!
        
        _Back_to_tab = ImageVector.Builder(
            name = "back_to_tab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(331f, 468f)
                lineTo(160f, 297f)
                verticalLineToRelative(143f)
                horizontalLineTo(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(216f)
                lineToRelative(172f, 171f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, -280f)
                verticalLineToRelative(-280f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 80f)
                verticalLineToRelative(200f)
                horizontalLineTo(560f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Back_to_tab!!
    }

private var _Back_to_tab: ImageVector? = null

