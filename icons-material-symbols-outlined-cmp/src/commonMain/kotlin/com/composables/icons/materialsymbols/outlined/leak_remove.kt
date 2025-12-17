package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Leak_remove: ImageVector
    get() {
        if (_Leak_remove != null) return _Leak_remove!!
        
        _Leak_remove = ImageVector.Builder(
            name = "leak_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(790f, 904f)
                lineTo(654f, 766f)
                quadToRelative(-6f, 18f, -10f, 36f)
                reflectiveQuadToRelative(-4f, 38f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -36f, 8.5f, -70f)
                reflectiveQuadToRelative(25.5f, -64f)
                lineToRelative(-58f, -58f)
                quadToRelative(-27f, 42f, -41.5f, 90.5f)
                reflectiveQuadTo(480f, 840f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -69f, 20f, -132.5f)
                reflectiveQuadTo(478f, 590f)
                lineTo(370f, 482f)
                quadToRelative(-54f, 36f, -117.5f, 57f)
                reflectiveQuadTo(120f, 560f)
                verticalLineToRelative(-80f)
                quadToRelative(53f, 0f, 101.5f, -14.5f)
                reflectiveQuadTo(312f, 424f)
                lineToRelative(-58f, -58f)
                quadToRelative(-30f, 17f, -64f, 25.5f)
                reflectiveQuadToRelative(-70f, 8.5f)
                verticalLineToRelative(-80f)
                quadToRelative(20f, 0f, 37.5f, -4f)
                reflectiveQuadToRelative(34.5f, -10f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-58f, 56f)
                close()
                moveToRelative(-22f, -250f)
                lineToRelative(-62f, -60f)
                quadToRelative(30f, -17f, 64f, -25.5f)
                reflectiveQuadToRelative(70f, -8.5f)
                verticalLineToRelative(80f)
                quadToRelative(-20f, 0f, -37.5f, 3f)
                reflectiveQuadTo(768f, 654f)
                close()
                moveTo(648f, 536f)
                lineToRelative(-58f, -58f)
                quadToRelative(54f, -38f, 117.5f, -58f)
                reflectiveQuadTo(840f, 400f)
                verticalLineToRelative(80f)
                quadToRelative(-53f, 0f, -101.5f, 14.5f)
                reflectiveQuadTo(648f, 536f)
                close()
                moveTo(482f, 368f)
                lineToRelative(-58f, -58f)
                quadToRelative(27f, -41f, 41.5f, -89f)
                reflectiveQuadTo(480f, 120f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 69f, -20f, 132f)
                reflectiveQuadToRelative(-58f, 116f)
                close()
                moveTo(366f, 252f)
                lineToRelative(-60f, -60f)
                quadToRelative(6f, -17f, 10f, -34.5f)
                reflectiveQuadToRelative(4f, -37.5f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 36f, -8.5f, 69.5f)
                reflectiveQuadTo(366f, 252f)
                close()
            }
        }.build()
        
        return _Leak_remove!!
    }

private var _Leak_remove: ImageVector? = null

