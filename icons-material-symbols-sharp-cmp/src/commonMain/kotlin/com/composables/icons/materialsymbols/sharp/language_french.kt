package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Language_french: ImageVector
    get() {
        if (_Language_french != null) return _Language_french!!
        
        _Language_french = ImageVector.Builder(
            name = "language_french",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(240f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(160f)
                lineToRelative(-40f, 40f)
                horizontalLineToRelative(-34f)
                lineToRelative(74f, 160f)
                horizontalLineToRelative(-84f)
                lineToRelative(-75f, -160f)
                horizontalLineToRelative(-41f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Language_french!!
    }

private var _Language_french: ImageVector? = null

