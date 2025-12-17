package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stylus_fountain_pen: ImageVector
    get() {
        if (_Stylus_fountain_pen != null) return _Stylus_fountain_pen!!
        
        _Stylus_fountain_pen = ImageVector.Builder(
            name = "stylus_fountain_pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(307f, 640f)
                lineToRelative(-87f, -360f)
                lineToRelative(260f, -240f)
                lineToRelative(260f, 240f)
                lineToRelative(-87f, 360f)
                horizontalLineTo(307f)
                close()
                moveToRelative(63f, -80f)
                horizontalLineToRelative(220f)
                lineToRelative(61f, -253f)
                lineToRelative(-131f, -121f)
                verticalLineToRelative(106f)
                quadToRelative(14f, 10f, 22f, 25f)
                reflectiveQuadToRelative(8f, 33f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(410f, 350f)
                quadToRelative(0f, -18f, 8f, -33f)
                reflectiveQuadToRelative(22f, -25f)
                verticalLineToRelative(-106f)
                lineTo(309f, 307f)
                lineToRelative(61f, 253f)
                close()
                moveTo(160f, 840f)
                lineToRelative(22f, -65f)
                quadToRelative(8f, -25f, 29f, -40f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(444f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 40f)
                lineToRelative(22f, 65f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Stylus_fountain_pen!!
    }

private var _Stylus_fountain_pen: ImageVector? = null

