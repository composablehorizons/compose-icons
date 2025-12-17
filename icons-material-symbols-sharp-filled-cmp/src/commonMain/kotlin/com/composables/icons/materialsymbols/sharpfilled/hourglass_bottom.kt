package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hourglass_bottom: ImageVector
    get() {
        if (_Hourglass_bottom != null) return _Hourglass_bottom!!
        
        _Hourglass_bottom = ImageVector.Builder(
            name = "hourglass_bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 440f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -61f, 28.5f, -114.5f)
                reflectiveQuadTo(348f, 480f)
                quadToRelative(-51f, -32f, -79.5f, -85.5f)
                reflectiveQuadTo(240f, 280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 61f, -28.5f, 114.5f)
                reflectiveQuadTo(612f, 480f)
                quadToRelative(51f, 32f, 79.5f, 85.5f)
                reflectiveQuadTo(720f, 680f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Hourglass_bottom!!
    }

private var _Hourglass_bottom: ImageVector? = null

