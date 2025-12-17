package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Team_dashboard: ImageVector
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
                moveTo(400f, 840f)
                verticalLineToRelative(-330f)
                horizontalLineTo(120f)
                verticalLineToRelative(330f)
                horizontalLineToRelative(280f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-330f)
                horizontalLineTo(480f)
                verticalLineToRelative(330f)
                close()
                moveTo(120f, 430f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-310f)
                horizontalLineTo(120f)
                verticalLineToRelative(310f)
                close()
            }
        }.build()
        
        return _Team_dashboard!!
    }

private var _Team_dashboard: ImageVector? = null

