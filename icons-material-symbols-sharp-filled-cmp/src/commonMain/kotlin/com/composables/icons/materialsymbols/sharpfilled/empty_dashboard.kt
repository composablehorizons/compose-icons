package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Empty_dashboard: ImageVector
    get() {
        if (_Empty_dashboard != null) return _Empty_dashboard!!
        
        _Empty_dashboard = ImageVector.Builder(
            name = "empty_dashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -200f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(-280f)
                horizontalLineTo(240f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(260f, 200f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(-280f)
                horizontalLineTo(500f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(-160f)
                horizontalLineTo(500f)
                verticalLineToRelative(160f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Empty_dashboard!!
    }

private var _Empty_dashboard: ImageVector? = null

