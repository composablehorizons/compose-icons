package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bungalow: ImageVector
    get() {
        if (_Bungalow != null) return _Bungalow!!
        
        _Bungalow = ImageVector.Builder(
            name = "bungalow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-248f)
                lineToRelative(-44f, 70f)
                lineToRelative(-68f, -42f)
                lineToRelative(312f, -500f)
                lineToRelative(312f, 500f)
                lineToRelative(-68f, 42f)
                lineToRelative(-44f, -70f)
                verticalLineToRelative(248f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-296f)
                lineTo(480f, 272f)
                lineTo(360f, 464f)
                verticalLineToRelative(296f)
                close()
                moveToRelative(80f, -200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, 200f)
                horizontalLineToRelative(240f)
                horizontalLineToRelative(-240f)
                close()
            }
        }.build()
        
        return _Bungalow!!
    }

private var _Bungalow: ImageVector? = null

