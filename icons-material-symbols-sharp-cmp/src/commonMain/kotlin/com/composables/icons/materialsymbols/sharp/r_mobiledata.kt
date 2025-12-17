package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.R_mobiledata: ImageVector
    get() {
        if (_R_mobiledata != null) return _R_mobiledata!!
        
        _R_mobiledata = ImageVector.Builder(
            name = "r_mobiledata",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(208f)
                horizontalLineToRelative(-48f)
                lineToRelative(48f, 112f)
                horizontalLineToRelative(-80f)
                lineToRelative(-46f, -106f)
                horizontalLineToRelative(-74f)
                verticalLineToRelative(106f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -186f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-54f)
                horizontalLineTo(160f)
                verticalLineToRelative(54f)
                close()
            }
        }.build()
        
        return _R_mobiledata!!
    }

private var _R_mobiledata: ImageVector? = null

