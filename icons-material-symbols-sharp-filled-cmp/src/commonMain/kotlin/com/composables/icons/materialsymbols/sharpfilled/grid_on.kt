package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Grid_on: ImageVector
    get() {
        if (_Grid_on != null) return _Grid_on!!
        
        _Grid_on = ImageVector.Builder(
            name = "grid_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(-187f)
                horizontalLineTo(120f)
                verticalLineToRelative(187f)
                close()
                moveToRelative(267f, 0f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(-187f)
                horizontalLineTo(387f)
                verticalLineToRelative(187f)
                close()
                moveToRelative(266f, 0f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(-187f)
                horizontalLineTo(653f)
                verticalLineToRelative(187f)
                close()
                moveTo(120f, 573f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(-186f)
                horizontalLineTo(120f)
                verticalLineToRelative(186f)
                close()
                moveToRelative(267f, 0f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(-186f)
                horizontalLineTo(387f)
                verticalLineToRelative(186f)
                close()
                moveToRelative(266f, 0f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(-186f)
                horizontalLineTo(653f)
                verticalLineToRelative(186f)
                close()
                moveTo(120f, 307f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(-187f)
                horizontalLineTo(120f)
                verticalLineToRelative(187f)
                close()
                moveToRelative(267f, 0f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(-187f)
                horizontalLineTo(387f)
                verticalLineToRelative(187f)
                close()
                moveToRelative(266f, 0f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(-187f)
                horizontalLineTo(653f)
                verticalLineToRelative(187f)
                close()
            }
        }.build()
        
        return _Grid_on!!
    }

private var _Grid_on: ImageVector? = null

