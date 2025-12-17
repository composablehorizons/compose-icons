package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.View_list: ImageVector
    get() {
        if (_View_list != null) return _View_list!!
        
        _View_list = ImageVector.Builder(
            name = "view_list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 720f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-107f)
                horizontalLineTo(360f)
                verticalLineToRelative(107f)
                close()
                moveTo(160f, 347f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-107f)
                horizontalLineTo(160f)
                verticalLineToRelative(107f)
                close()
                moveToRelative(0f, 187f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-107f)
                horizontalLineTo(160f)
                verticalLineToRelative(107f)
                close()
                moveToRelative(0f, 186f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-107f)
                horizontalLineTo(160f)
                verticalLineToRelative(107f)
                close()
                moveToRelative(200f, -186f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-107f)
                horizontalLineTo(360f)
                verticalLineToRelative(107f)
                close()
                moveToRelative(0f, -187f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-107f)
                horizontalLineTo(360f)
                verticalLineToRelative(107f)
                close()
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
            }
        }.build()
        
        return _View_list!!
    }

private var _View_list: ImageVector? = null

