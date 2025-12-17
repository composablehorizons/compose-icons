package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Route: ImageVector
    get() {
        if (_Route != null) return _Route!!
        
        _Route = ImageVector.Builder(
            name = "route",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-487f)
                quadToRelative(-35f, -13f, -57.5f, -43.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 39f, -22.5f, 69.5f)
                reflectiveQuadTo(280f, 353f)
                verticalLineToRelative(407f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(487f)
                quadToRelative(35f, 13f, 57.5f, 43.5f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -70f)
                reflectiveQuadToRelative(57.5f, -43f)
                verticalLineToRelative(-407f)
                horizontalLineTo(520f)
                verticalLineToRelative(640f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Route!!
    }

private var _Route: ImageVector? = null

