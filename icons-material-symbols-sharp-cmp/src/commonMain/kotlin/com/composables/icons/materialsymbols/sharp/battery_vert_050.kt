package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_vert_050: ImageVector
    get() {
        if (_Battery_vert_050 != null) return _Battery_vert_050!!
        
        _Battery_vert_050 = ImageVector.Builder(
            name = "battery_vert_050",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 22f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(18f)
                close()
                moveToRelative(2f, -9f)
                horizontalLineToRelative(6f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _Battery_vert_050!!
    }

private var _Battery_vert_050: ImageVector? = null

