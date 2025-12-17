package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Grid_off: ImageVector
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
                moveTo(791f, 904f)
                lineToRelative(-64f, -64f)
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
                lineToRelative(-64f, -64f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(847f, 904f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(791f, 904f)
                close()
                moveToRelative(-591f, -64f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-107f)
                horizontalLineToRelative(187f)
                verticalLineToRelative(187f)
                horizontalLineTo(200f)
                close()
                moveToRelative(640f, -116f)
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
                horizontalLineToRelative(107f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(107f)
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

