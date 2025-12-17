package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Auto_awesome_mosaic: ImageVector
    get() {
        if (_Auto_awesome_mosaic != null) return _Auto_awesome_mosaic!!
        
        _Auto_awesome_mosaic = ImageVector.Builder(
            name = "auto_awesome_mosaic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(-80f, -80f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(160f)
                close()
                moveToRelative(160f, -320f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-80f, 480f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(160f)
                close()
                moveTo(360f, 480f)
                close()
                moveToRelative(240f, -120f)
                close()
                moveToRelative(0f, 240f)
                close()
            }
        }.build()
        
        return _Auto_awesome_mosaic!!
    }

private var _Auto_awesome_mosaic: ImageVector? = null

