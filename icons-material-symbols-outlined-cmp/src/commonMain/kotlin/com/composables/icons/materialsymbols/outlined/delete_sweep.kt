package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Delete_sweep: ImageVector
    get() {
        if (_Delete_sweep != null) return _Delete_sweep!!
        
        _Delete_sweep = ImageVector.Builder(
            name = "delete_sweep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveTo(120f, 320f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(440f, 760f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-360f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(360f)
                verticalLineToRelative(-360f)
                close()
            }
        }.build()
        
        return _Delete_sweep!!
    }

private var _Delete_sweep: ImageVector? = null

