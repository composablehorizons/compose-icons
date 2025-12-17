package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Tab_duplicate: ImageVector
    get() {
        if (_Tab_duplicate != null) return _Tab_duplicate!!
        
        _Tab_duplicate = ImageVector.Builder(
            name = "tab_duplicate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(320f)
                close()
                moveTo(240f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, -640f)
                horizontalLineTo(80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                verticalLineToRelative(80f)
                close()
                moveTo(400f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-400f, -80f)
                verticalLineToRelative(80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(-80f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, 400f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                verticalLineToRelative(-80f)
                close()
                moveTo(520f, 320f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Tab_duplicate!!
    }

private var _Tab_duplicate: ImageVector? = null

