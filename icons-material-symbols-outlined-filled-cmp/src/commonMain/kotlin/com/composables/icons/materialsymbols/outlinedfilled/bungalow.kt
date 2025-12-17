package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bungalow: ImageVector
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
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(280f)
                close()
                moveToRelative(160f, -280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Bungalow!!
    }

private var _Bungalow: ImageVector? = null

