package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Grid_off: ImageVector
    get() {
        if (_Grid_off != null) return _Grid_off!!
        
        _Grid_off = ImageVector.Builder(
            name = "grid_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineToRelative(-92f, -92f)
                horizontalLineToRelative(-74f)
                verticalLineToRelative(-74f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(154f)
                horizontalLineTo(387f)
                verticalLineToRelative(-187f)
                horizontalLineToRelative(153f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-73f)
                verticalLineToRelative(-74f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(154f)
                horizontalLineTo(120f)
                verticalLineToRelative(-186f)
                horizontalLineToRelative(155f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-75f)
                verticalLineToRelative(-75f)
                lineToRelative(-92f, -92f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(-699f, -92f)
                verticalLineToRelative(-187f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(187f)
                horizontalLineTo(120f)
                close()
                moveToRelative(720f, -116f)
                lineToRelative(-71f, -71f)
                horizontalLineToRelative(71f)
                verticalLineToRelative(71f)
                close()
                moveTo(689f, 573f)
                lineToRelative(-36f, -36f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(186f)
                horizontalLineTo(689f)
                close()
                moveTo(573f, 457f)
                lineToRelative(-70f, -70f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(70f)
                close()
                moveTo(423f, 307f)
                lineToRelative(-36f, -36f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(187f)
                horizontalLineTo(423f)
                close()
                moveToRelative(230f, 0f)
                verticalLineToRelative(-187f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(187f)
                horizontalLineTo(653f)
                close()
                moveTo(307f, 191f)
                lineToRelative(-71f, -71f)
                horizontalLineToRelative(71f)
                verticalLineToRelative(71f)
                close()
            }
        }.build()
        
        return _Grid_off!!
    }

private var _Grid_off: ImageVector? = null

