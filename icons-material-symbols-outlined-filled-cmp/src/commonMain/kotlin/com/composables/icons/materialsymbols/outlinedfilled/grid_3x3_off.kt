package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Grid_3x3_off: ImageVector
    get() {
        if (_Grid_3x3_off != null) return _Grid_3x3_off!!
        
        _Grid_3x3_off = ImageVector.Builder(
            name = "grid_3x3_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(753f, 640f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(127f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-47f)
                close()
                moveTo(640f, 527f)
                lineTo(433f, 320f)
                horizontalLineToRelative(127f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                verticalLineToRelative(127f)
                close()
                moveTo(400f, 287f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(127f)
                close()
                moveTo(791f, 904f)
                lineTo(640f, 753f)
                verticalLineToRelative(47f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-127f)
                lineToRelative(-33f, -33f)
                horizontalLineTo(400f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-127f)
                lineToRelative(-33f, -33f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(47f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
            }
        }.build()
        
        return _Grid_3x3_off!!
    }

private var _Grid_3x3_off: ImageVector? = null

