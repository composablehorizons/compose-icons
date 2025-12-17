package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ice_skating: ImageVector
    get() {
        if (_Ice_skating != null) return _Ice_skating!!
        
        _Ice_skating = ImageVector.Builder(
            name = "ice_skating",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(122f)
                verticalLineToRelative(40f)
                horizontalLineTo(320f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(136f)
                quadToRelative(14f, 23f, 35.5f, 39f)
                reflectiveQuadToRelative(47.5f, 24f)
                lineToRelative(221f, 61f)
                verticalLineToRelative(236f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Ice_skating!!
    }

private var _Ice_skating: ImageVector? = null

