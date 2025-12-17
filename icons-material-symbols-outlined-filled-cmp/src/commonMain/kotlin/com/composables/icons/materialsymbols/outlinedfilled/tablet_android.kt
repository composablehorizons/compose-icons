package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Tablet_android: ImageVector
    get() {
        if (_Tablet_android != null) return _Tablet_android!!
        
        _Tablet_android = ImageVector.Builder(
            name = "tablet_android",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 40f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 920f)
                horizontalLineTo(200f)
                close()
                moveToRelative(200f, -120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                verticalLineToRelative(40f)
                close()
                moveTo(200f, 640f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Tablet_android!!
    }

private var _Tablet_android: ImageVector? = null

