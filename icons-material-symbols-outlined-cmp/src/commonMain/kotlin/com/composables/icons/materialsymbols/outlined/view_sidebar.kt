package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.View_sidebar: ImageVector
    get() {
        if (_View_sidebar != null) return _View_sidebar!!
        
        _View_sidebar = ImageVector.Builder(
            name = "view_sidebar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(540f, -453f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-107f)
                horizontalLineTo(700f)
                verticalLineToRelative(107f)
                close()
                moveToRelative(0f, 186f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-106f)
                horizontalLineTo(700f)
                verticalLineToRelative(106f)
                close()
                moveTo(160f, 720f)
                horizontalLineToRelative(460f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(540f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-107f)
                horizontalLineTo(700f)
                verticalLineToRelative(107f)
                close()
            }
        }.build()
        
        return _View_sidebar!!
    }

private var _View_sidebar: ImageVector? = null

