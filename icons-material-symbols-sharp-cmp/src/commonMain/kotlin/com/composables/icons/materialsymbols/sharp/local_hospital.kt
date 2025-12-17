package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Local_hospital: ImageVector
    get() {
        if (_Local_hospital != null) return _Local_hospital!!
        
        _Local_hospital = ImageVector.Builder(
            name = "local_hospital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 680f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-120f)
                horizontalLineTo(540f)
                verticalLineToRelative(-140f)
                horizontalLineTo(420f)
                verticalLineToRelative(140f)
                horizontalLineTo(280f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(140f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Local_hospital!!
    }

private var _Local_hospital: ImageVector? = null

