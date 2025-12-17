package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_quilt: ImageVector
    get() {
        if (_View_quilt != null) return _View_quilt!!
        
        _View_quilt = ImageVector.Builder(
            name = "view_quilt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(373f, 460f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(467f)
                verticalLineToRelative(260f)
                horizontalLineTo(373f)
                close()
                moveToRelative(254f, 300f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(627f)
                close()
                moveToRelative(-254f, 0f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(214f)
                verticalLineToRelative(260f)
                horizontalLineTo(373f)
                close()
                moveToRelative(-253f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(560f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _View_quilt!!
    }

private var _View_quilt: ImageVector? = null

