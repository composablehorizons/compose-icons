package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Team_dashboard: ImageVector
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
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(280f, -80f)
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

