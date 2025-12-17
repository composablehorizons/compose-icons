package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Dns: ImageVector
    get() {
        if (_Dns != null) return _Dns!!
        
        _Dns = ImageVector.Builder(
            name = "dns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 360f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(360f, 300f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 240f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 300f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 360f)
                close()
                moveToRelative(0f, 400f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(360f, 700f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 640f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 700f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 760f)
                close()
                moveTo(120f, 480f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(360f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(360f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Dns!!
    }

private var _Dns: ImageVector? = null

