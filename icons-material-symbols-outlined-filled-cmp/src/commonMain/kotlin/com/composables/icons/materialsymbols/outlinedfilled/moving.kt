package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Moving: ImageVector
    get() {
        if (_Moving != null) return _Moving!!
        
        _Moving = ImageVector.Builder(
            name = "moving",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(136f, 720f)
                lineToRelative(-56f, -56f)
                lineToRelative(212f, -212f)
                quadToRelative(35f, -35f, 85f, -35f)
                reflectiveQuadToRelative(85f, 35f)
                lineToRelative(46f, 46f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                lineToRelative(178f, -178f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-103f)
                lineTo(621f, 555f)
                quadToRelative(-35f, 35f, -85f, 35f)
                reflectiveQuadToRelative(-85f, -35f)
                lineToRelative(-47f, -47f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineTo(136f, 720f)
                close()
            }
        }.build()
        
        return _Moving!!
    }

private var _Moving: ImageVector? = null

