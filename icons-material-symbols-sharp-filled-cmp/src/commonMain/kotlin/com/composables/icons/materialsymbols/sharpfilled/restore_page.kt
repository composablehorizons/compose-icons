package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Restore_page: ImageVector
    get() {
        if (_Restore_page != null) return _Restore_page!!
        
        _Restore_page = ImageVector.Builder(
            name = "restore_page",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 710f)
                quadToRelative(78f, 0f, 134f, -56f)
                reflectiveQuadToRelative(56f, -134f)
                quadToRelative(0f, -78f, -56f, -134f)
                reflectiveQuadToRelative(-134f, -56f)
                quadToRelative(-38f, 0f, -71f, 14f)
                reflectiveQuadToRelative(-59f, 38f)
                verticalLineToRelative(-62f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(170f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-72f)
                quadToRelative(17f, -18f, 41f, -29f)
                reflectiveQuadToRelative(51f, -11f)
                quadToRelative(54f, 0f, 92f, 38f)
                reflectiveQuadToRelative(38f, 92f)
                quadToRelative(0f, 54f, -38f, 92f)
                reflectiveQuadToRelative(-92f, 38f)
                quadToRelative(-44f, 0f, -77f, -25.5f)
                reflectiveQuadTo(356f, 560f)
                horizontalLineToRelative(-62f)
                quadToRelative(14f, 65f, 65.5f, 107.5f)
                reflectiveQuadTo(480f, 710f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(560f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Restore_page!!
    }

private var _Restore_page: ImageVector? = null

