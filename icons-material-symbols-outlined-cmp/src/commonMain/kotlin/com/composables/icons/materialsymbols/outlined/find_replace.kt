package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Find_replace: ImageVector
    get() {
        if (_Find_replace != null) return _Find_replace!!
        
        _Find_replace = ImageVector.Builder(
            name = "find_replace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(164f, 400f)
                quadToRelative(14f, -103f, 91.5f, -171.5f)
                reflectiveQuadTo(440f, 160f)
                quadToRelative(59f, 0f, 110.5f, 22.5f)
                reflectiveQuadTo(640f, 244f)
                verticalLineToRelative(-84f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                quadToRelative(-29f, -36f, -69.5f, -58f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(-72f, 0f, -127f, 45.5f)
                reflectiveQuadTo(244f, 400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(620f, 440f)
                lineTo(608f, 664f)
                quadToRelative(-36f, 27f, -78.5f, 41.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(-59f, 0f, -110.5f, -22.5f)
                reflectiveQuadTo(240f, 636f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                quadToRelative(29f, 36f, 69.5f, 58f)
                reflectiveQuadToRelative(90.5f, 22f)
                quadToRelative(72f, 0f, 127f, -45.5f)
                reflectiveQuadTo(636f, 480f)
                horizontalLineToRelative(80f)
                quadToRelative(-5f, 36f, -18f, 67.5f)
                reflectiveQuadTo(664f, 608f)
                lineToRelative(176f, 176f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Find_replace!!
    }

private var _Find_replace: ImageVector? = null

