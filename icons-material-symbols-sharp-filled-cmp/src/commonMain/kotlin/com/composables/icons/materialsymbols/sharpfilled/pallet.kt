package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pallet: ImageVector
    get() {
        if (_Pallet != null) return _Pallet!!
        
        _Pallet = ImageVector.Builder(
            name = "pallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(160f)
                horizontalLineTo(760f)
                verticalLineToRelative(-80f)
                horizontalLineTo(540f)
                verticalLineToRelative(80f)
                horizontalLineTo(420f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(120f, -240f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(560f)
                horizontalLineTo(200f)
                close()
                moveToRelative(160f, -320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Pallet!!
    }

private var _Pallet: ImageVector? = null

