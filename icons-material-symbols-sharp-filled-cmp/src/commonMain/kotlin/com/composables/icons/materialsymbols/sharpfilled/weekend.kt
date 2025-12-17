package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Weekend: ImageVector
    get() {
        if (_Weekend != null) return _Weekend!!
        
        _Weekend = ImageVector.Builder(
            name = "weekend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(400f)
                horizontalLineTo(40f)
                close()
                moveToRelative(240f, -240f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(160f)
                horizontalLineTo(680f)
                verticalLineToRelative(240f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Weekend!!
    }

private var _Weekend: ImageVector? = null

