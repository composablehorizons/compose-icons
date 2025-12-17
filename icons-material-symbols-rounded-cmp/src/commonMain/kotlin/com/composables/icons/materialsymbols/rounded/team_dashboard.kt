package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Team_dashboard: ImageVector
    get() {
        if (_Team_dashboard != null) return _Team_dashboard!!
        
        _Team_dashboard = ImageVector.Builder(
            name = "team_dashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(200f, -80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(200f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-240f)
                horizontalLineTo(480f)
                verticalLineToRelative(240f)
                close()
                moveTo(200f, 440f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Team_dashboard!!
    }

private var _Team_dashboard: ImageVector? = null

