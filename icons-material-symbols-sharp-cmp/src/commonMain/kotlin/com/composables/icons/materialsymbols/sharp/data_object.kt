package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Data_object: ImageVector
    get() {
        if (_Data_object != null) return _Data_object!!
        
        _Data_object = ImageVector.Builder(
            name = "data_object",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-227f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-26f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-227f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(234f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(172f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(234f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-400f, 0f)
                verticalLineToRelative(-234f)
                horizontalLineTo(80f)
                verticalLineToRelative(-172f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-234f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(227f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(26f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(227f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Data_object!!
    }

private var _Data_object: ImageVector? = null

