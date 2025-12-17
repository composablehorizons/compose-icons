package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stairs_2: ImageVector
    get() {
        if (_Stairs_2 != null) return _Stairs_2!!
        
        _Stairs_2 = ImageVector.Builder(
            name = "stairs_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                verticalLineToRelative(240f)
                horizontalLineTo(400f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Stairs_2!!
    }

private var _Stairs_2: ImageVector? = null

