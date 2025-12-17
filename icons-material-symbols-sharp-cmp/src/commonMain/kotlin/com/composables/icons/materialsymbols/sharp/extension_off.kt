package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Extension_off: ImageVector
    get() {
        if (_Extension_off != null) return _Extension_off!!
        
        _Extension_off = ImageVector.Builder(
            name = "extension_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-232f)
                quadToRelative(48f, 0f, 84f, -30.5f)
                reflectiveQuadToRelative(36f, -77.5f)
                quadToRelative(0f, -47f, -36f, -77.5f)
                reflectiveQuadTo(120f, 392f)
                verticalLineToRelative(-232f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(88f)
                quadToRelative(54f, 20f, 87f, 67f)
                reflectiveQuadToRelative(33f, 105f)
                quadToRelative(0f, 57f, -33f, 104f)
                reflectiveQuadToRelative(-87f, 68f)
                verticalLineToRelative(88f)
                horizontalLineToRelative(88f)
                quadToRelative(21f, -54f, 68f, -87f)
                reflectiveQuadToRelative(104f, -33f)
                quadToRelative(57f, 0f, 104f, 33f)
                reflectiveQuadToRelative(68f, 87f)
                horizontalLineToRelative(88f)
                lineToRelative(80f, 80f)
                horizontalLineTo(568f)
                quadToRelative(0f, -48f, -30.5f, -84f)
                reflectiveQuadTo(460f, 720f)
                quadToRelative(-47f, 0f, -77.5f, 36f)
                reflectiveQuadTo(352f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(680f, -154f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(480f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-86f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(86f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                verticalLineToRelative(86f)
                close()
                moveToRelative(-9f, 219f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(537f, 423f)
                close()
                moveToRelative(-77f, 77f)
                close()
            }
        }.build()
        
        return _Extension_off!!
    }

private var _Extension_off: ImageVector? = null

