package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Work_history: ImageVector
    get() {
        if (_Work_history != null) return _Work_history!!
        
        _Work_history = ImageVector.Builder(
            name = "work_history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                verticalLineToRelative(-15f)
                verticalLineToRelative(15f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(251f)
                quadToRelative(-18f, -13f, -38.5f, -22.5f)
                reflectiveQuadTo(800f, 452f)
                verticalLineToRelative(-132f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(283f)
                quadToRelative(3f, 21f, 9f, 41f)
                reflectiveQuadToRelative(15f, 39f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(20f, -208f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(86f, 86f)
                lineToRelative(28f, -28f)
                lineToRelative(-74f, -74f)
                close()
            }
        }.build()
        
        return _Work_history!!
    }

private var _Work_history: ImageVector? = null

