package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_list: ImageVector
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
                moveTo(360f, 800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-160f)
                horizontalLineTo(360f)
                verticalLineToRelative(160f)
                close()
                moveTo(80f, 320f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(280f, -240f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-160f)
                horizontalLineTo(360f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-160f)
                horizontalLineTo(360f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _View_list!!
    }

private var _View_list: ImageVector? = null

