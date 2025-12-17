package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sticky_note: ImageVector
    get() {
        if (_Sticky_note != null) return _Sticky_note!!
        
        _Sticky_note = ImageVector.Builder(
            name = "sticky_note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(440f)
                lineTo(640f, 840f)
                close()
                moveToRelative(-40f, -80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(680f, 600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(400f)
                close()
                moveTo(440f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(160f, 120f)
                close()
                moveToRelative(-400f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Sticky_note!!
    }

private var _Sticky_note: ImageVector? = null

