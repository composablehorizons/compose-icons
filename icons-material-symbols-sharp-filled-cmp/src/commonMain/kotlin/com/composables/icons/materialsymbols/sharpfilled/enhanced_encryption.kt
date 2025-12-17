package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Enhanced_encryption: ImageVector
    get() {
        if (_Enhanced_encryption != null) return _Enhanced_encryption!!
        
        _Enhanced_encryption = ImageVector.Builder(
            name = "enhanced_encryption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 640f)
                verticalLineToRelative(120f)
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
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(560f)
                horizontalLineTo(160f)
                close()
                moveToRelative(200f, -560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Enhanced_encryption!!
    }

private var _Enhanced_encryption: ImageVector? = null

