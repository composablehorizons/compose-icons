package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Files: ImageVector
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
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(520f, 520f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(280f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveTo(80f, 560f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(240f)
                lineTo(80f, 560f)
                close()
                moveToRelative(153f, -40f)
                lineToRelative(207f, -207f)
                verticalLineToRelative(207f)
                horizontalLineTo(233f)
                close()
            }
        }.build()
        
        return _Files!!
    }

private var _Files: ImageVector? = null

