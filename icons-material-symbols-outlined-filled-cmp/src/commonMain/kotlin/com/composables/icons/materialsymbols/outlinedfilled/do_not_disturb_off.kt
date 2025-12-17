package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Do_not_disturb_off: ImageVector
    get() {
        if (_Do_not_disturb_off != null) return _Do_not_disturb_off!!
        
        _Do_not_disturb_off = ImageVector.Builder(
            name = "do_not_disturb_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineToRelative(-91f, -91f)
                quadToRelative(-49f, 32f, -104.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -60f, 17f, -115.5f)
                reflectiveQuadTo(146f, 260f)
                lineToRelative(-91f, -91f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(280f, 520f)
                horizontalLineToRelative(126f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(534f, 180f)
                lineTo(634f, 520f)
                horizontalLineToRelative(46f)
                verticalLineToRelative(-80f)
                horizontalLineTo(554f)
                lineTo(260f, 146f)
                quadToRelative(49f, -32f, 104.5f, -49f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 60f, -17f, 115.5f)
                reflectiveQuadTo(814f, 700f)
                close()
            }
        }.build()
        
        return _Do_not_disturb_off!!
    }

private var _Do_not_disturb_off: ImageVector? = null

