package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Add_row_above: ImageVector
    get() {
        if (_Add_row_above != null) return _Add_row_above!!
        
        _Add_row_above = ImageVector.Builder(
            name = "add_row_above",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(640f, 80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(720f)
                close()
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(-40f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Add_row_above!!
    }

private var _Add_row_above: ImageVector? = null

