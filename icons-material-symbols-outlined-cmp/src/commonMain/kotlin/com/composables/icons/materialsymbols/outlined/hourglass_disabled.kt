package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Hourglass_disabled: ImageVector
    get() {
        if (_Hourglass_disabled != null) return _Hourglass_disabled!!
        
        _Hourglass_disabled = ImageVector.Builder(
            name = "hourglass_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineToRelative(-52f, -52f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -61f, 28.5f, -114.5f)
                reflectiveQuadTo(348f, 480f)
                quadToRelative(-32f, -20f, -54.5f, -48f)
                reflectiveQuadTo(257f, 370f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(602f, 486f)
                lineToRelative(-60f, -59f)
                quadToRelative(45f, -19f, 71.5f, -59f)
                reflectiveQuadToRelative(26.5f, -88f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(45f)
                lineToRelative(-45f, -45f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(605f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 64f, -31f, 119f)
                reflectiveQuadToRelative(-87f, 87f)
                close()
                moveTo(320f, 800f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-47f)
                lineTo(419f, 532f)
                quadToRelative(-45f, 19f, -72f, 59f)
                reflectiveQuadToRelative(-27f, 89f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(400f, 0f)
                close()
            }
        }.build()
        
        return _Hourglass_disabled!!
    }

private var _Hourglass_disabled: ImageVector? = null

