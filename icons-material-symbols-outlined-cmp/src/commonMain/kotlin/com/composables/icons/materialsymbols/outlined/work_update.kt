package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Work_update: ImageVector
    get() {
        if (_Work_update != null) return _Work_update!!
        
        _Work_update = ImageVector.Builder(
            name = "work_update",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-15f)
                verticalLineToRelative(15f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(171f)
                quadToRelative(-18f, -13f, -38f, -22.5f)
                reflectiveQuadTo(800f, 452f)
                verticalLineToRelative(-132f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(283f)
                quadToRelative(3f, 21f, 9f, 41f)
                reflectiveQuadToRelative(15f, 39f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, -600f)
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
                moveToRelative(0f, -80f)
                lineToRelative(120f, -120f)
                lineToRelative(-28f, -28f)
                lineToRelative(-72f, 72f)
                verticalLineToRelative(-164f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(164f)
                lineToRelative(-72f, -72f)
                lineToRelative(-28f, 28f)
                lineToRelative(120f, 120f)
                close()
            }
        }.build()
        
        return _Work_update!!
    }

private var _Work_update: ImageVector? = null

