package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Delete: ImageVector
    get() {
        if (_Delete != null) return _Delete!!
        
        _Delete = ImageVector.Builder(
            name = "delete",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(600f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-520f)
                horizontalLineTo(280f)
                verticalLineToRelative(520f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                close()
                moveTo(280f, 240f)
                verticalLineToRelative(520f)
                verticalLineToRelative(-520f)
                close()
            }
        }.build()
        
        return _Delete!!
    }

private var _Delete: ImageVector? = null

