package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Edit_arrow_down: ImageVector
    get() {
        if (_Edit_arrow_down != null) return _Edit_arrow_down!!
        
        _Edit_arrow_down = ImageVector.Builder(
            name = "edit_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 800f)
                lineTo(640f, 660f)
                lineToRelative(57f, -56f)
                lineToRelative(43f, 43f)
                verticalLineToRelative(-487f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(488f)
                lineToRelative(44f, -44f)
                lineToRelative(56f, 56f)
                lineToRelative(-140f, 140f)
                close()
                moveToRelative(-660f, -80f)
                verticalLineToRelative(-163f)
                lineToRelative(295f, -294f)
                quadToRelative(24f, -24f, 57.5f, -23f)
                reflectiveQuadToRelative(56.5f, 25f)
                lineToRelative(48f, 50f)
                quadToRelative(23f, 23f, 22.5f, 56f)
                reflectiveQuadTo(576f, 427f)
                lineTo(283f, 720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(50f)
                lineToRelative(162f, -162f)
                lineToRelative(-25f, -25f)
                lineToRelative(-25f, -25f)
                lineToRelative(-162f, 162f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(269f, -219f)
                lineToRelative(-50f, -50f)
                lineToRelative(50f, 50f)
                close()
            }
        }.build()
        
        return _Edit_arrow_down!!
    }

private var _Edit_arrow_down: ImageVector? = null

