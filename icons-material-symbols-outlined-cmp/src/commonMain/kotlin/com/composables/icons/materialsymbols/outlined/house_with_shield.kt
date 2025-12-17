package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.House_with_shield: ImageVector
    get() {
        if (_House_with_shield != null) return _House_with_shield!!
        
        _House_with_shield = ImageVector.Builder(
            name = "house_with_shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(69f, -17f, 114.5f, -79.5f)
                reflectiveQuadTo(640f, 502f)
                verticalLineToRelative(-102f)
                lineToRelative(-160f, -80f)
                lineToRelative(-160f, 80f)
                verticalLineToRelative(102f)
                quadToRelative(0f, 76f, 45.5f, 138.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                lineTo(480f, 220f)
                lineTo(240f, 400f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(240f, -270f)
                close()
            }
        }.build()
        
        return _House_with_shield!!
    }

private var _House_with_shield: ImageVector? = null

