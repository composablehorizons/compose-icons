package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pip: ImageVector
    get() {
        if (_Pip != null) return _Pip!!
        
        _Pip = ImageVector.Builder(
            name = "pip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(144f)
                lineTo(52f, 188f)
                lineToRelative(56f, -56f)
                lineToRelative(172f, 172f)
                verticalLineToRelative(-144f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, 360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(640f, -280f)
                verticalLineToRelative(-280f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(560f, 800f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineTo(560f)
                close()
            }
        }.build()
        
        return _Pip!!
    }

private var _Pip: ImageVector? = null

