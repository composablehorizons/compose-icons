package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.View_list: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _View_list!!
    }

private var _View_list: ImageVector? = null

