package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Local_pharmacy: ImageVector
    get() {
        if (_Local_pharmacy != null) return _Local_pharmacy!!
        
        _Local_pharmacy = ImageVector.Builder(
            name = "local_pharmacy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(204f, 840f)
                quadToRelative(-42f, 0f, -65.5f, -33f)
                reflectiveQuadTo(128f, 735f)
                lineToRelative(72f, -215f)
                lineToRelative(-72f, -215f)
                quadToRelative(-13f, -39f, 10.5f, -72f)
                reflectiveQuadToRelative(65.5f, -33f)
                horizontalLineToRelative(424f)
                lineToRelative(41f, -113f)
                quadToRelative(7f, -20f, 25.5f, -28.5f)
                reflectiveQuadTo(733f, 57f)
                quadToRelative(20f, 7f, 28.5f, 25.5f)
                reflectiveQuadTo(763f, 121f)
                lineToRelative(-29f, 79f)
                horizontalLineToRelative(22f)
                quadToRelative(42f, 0f, 65.5f, 33f)
                reflectiveQuadToRelative(10.5f, 72f)
                lineToRelative(-72f, 215f)
                lineToRelative(72f, 215f)
                quadToRelative(13f, 39f, -10.5f, 72f)
                reflectiveQuadTo(756f, 840f)
                horizontalLineTo(204f)
                close()
                moveToRelative(236f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-236f, 80f)
                horizontalLineToRelative(552f)
                lineToRelative(-80f, -240f)
                lineToRelative(80f, -240f)
                horizontalLineTo(204f)
                lineToRelative(80f, 240f)
                lineToRelative(-80f, 240f)
                close()
                moveToRelative(276f, -240f)
                close()
            }
        }.build()
        
        return _Local_pharmacy!!
    }

private var _Local_pharmacy: ImageVector? = null

