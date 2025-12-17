package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Files: ImageVector
    get() {
        if (_Files != null) return _Files!!
        
        _Files = ImageVector.Builder(
            name = "files",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(240f)
                lineToRelative(80f, -80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(73f, -280f)
                horizontalLineToRelative(207f)
                verticalLineToRelative(-207f)
                lineTo(233f, 520f)
                close()
                moveToRelative(-73f, -40f)
                lineToRelative(160f, -160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(520f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(440f, 600f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, -160f)
                close()
            }
        }.build()
        
        return _Files!!
    }

private var _Files: ImageVector? = null

