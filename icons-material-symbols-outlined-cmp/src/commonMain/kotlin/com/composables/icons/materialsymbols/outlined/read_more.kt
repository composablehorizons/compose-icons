package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Read_more: ImageVector
    get() {
        if (_Read_more != null) return _Read_more!!
        
        _Read_more = ImageVector.Builder(
            name = "read_more",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(298f, 698f)
                lineToRelative(-56f, -56f)
                lineToRelative(121f, -122f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(283f)
                lineTo(242f, 318f)
                lineToRelative(56f, -56f)
                lineToRelative(218f, 218f)
                lineToRelative(-218f, 218f)
                close()
                moveToRelative(222f, -18f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                close()
                moveToRelative(120f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Read_more!!
    }

private var _Read_more: ImageVector? = null

