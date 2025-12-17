package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Thumbs_up_down: ImageVector
    get() {
        if (_Thumbs_up_down != null) return _Thumbs_up_down!!
        
        _Thumbs_up_down = ImageVector.Builder(
            name = "thumbs_up_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 560f)
                verticalLineToRelative(-344f)
                lineToRelative(216f, -216f)
                lineToRelative(49f, 49f)
                lineToRelative(-33f, 151f)
                horizontalLineToRelative(248f)
                verticalLineToRelative(103f)
                lineTo(371f, 560f)
                horizontalLineTo(0f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(238f)
                lineToRelative(82f, -194f)
                verticalLineToRelative(-6f)
                horizontalLineTo(134f)
                lineToRelative(24f, -108f)
                lineToRelative(-78f, 76f)
                verticalLineToRelative(232f)
                close()
                moveTo(744f, 960f)
                lineToRelative(-49f, -49f)
                lineToRelative(33f, -151f)
                horizontalLineTo(480f)
                verticalLineToRelative(-103f)
                lineToRelative(109f, -257f)
                horizontalLineToRelative(371f)
                verticalLineToRelative(344f)
                lineTo(744f, 960f)
                close()
                moveToRelative(58f, -172f)
                lineToRelative(78f, -76f)
                verticalLineToRelative(-232f)
                horizontalLineTo(642f)
                lineToRelative(-82f, 194f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(266f)
                lineToRelative(-24f, 108f)
                close()
                moveTo(80f, 480f)
                verticalLineToRelative(-232f)
                verticalLineToRelative(232f)
                close()
                moveToRelative(800f, 232f)
                verticalLineToRelative(-232f)
                verticalLineToRelative(232f)
                close()
            }
        }.build()
        
        return _Thumbs_up_down!!
    }

private var _Thumbs_up_down: ImageVector? = null

