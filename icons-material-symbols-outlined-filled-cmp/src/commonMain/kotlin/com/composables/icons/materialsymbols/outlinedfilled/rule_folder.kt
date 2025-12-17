package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Rule_folder: ImageVector
    get() {
        if (_Rule_folder != null) return _Rule_folder!!
        
        _Rule_folder = ImageVector.Builder(
            name = "rule_folder",
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
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(240f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(153f, -145f)
                lineToRelative(198f, -198f)
                lineToRelative(-57f, -57f)
                lineToRelative(-141f, 142f)
                lineToRelative(-57f, -57f)
                lineToRelative(-56f, 57f)
                lineToRelative(113f, 113f)
                close()
                moveToRelative(263f, 0f)
                lineToRelative(64f, -64f)
                lineToRelative(64f, 64f)
                lineToRelative(56f, -56f)
                lineToRelative(-64f, -64f)
                lineToRelative(64f, -64f)
                lineToRelative(-56f, -56f)
                lineToRelative(-64f, 64f)
                lineToRelative(-64f, -64f)
                lineToRelative(-56f, 56f)
                lineToRelative(64f, 64f)
                lineToRelative(-64f, 64f)
                lineToRelative(56f, 56f)
                close()
            }
        }.build()
        
        return _Rule_folder!!
    }

private var _Rule_folder: ImageVector? = null

