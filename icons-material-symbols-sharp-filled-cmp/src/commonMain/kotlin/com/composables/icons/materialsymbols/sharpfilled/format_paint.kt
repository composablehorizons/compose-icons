package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Format_paint: ImageVector
    get() {
        if (_Format_paint != null) return _Format_paint!!
        
        _Format_paint = ImageVector.Builder(
            name = "format_paint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(520f)
                horizontalLineTo(600f)
                verticalLineToRelative(240f)
                horizontalLineTo(360f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 280f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Format_paint!!
    }

private var _Format_paint: ImageVector? = null

