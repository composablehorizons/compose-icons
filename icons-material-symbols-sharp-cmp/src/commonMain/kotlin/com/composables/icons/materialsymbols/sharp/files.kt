package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Files: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(153f, -280f)
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
                verticalLineToRelative(360f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, -160f)
                close()
            }
        }.build()
        
        return _Files!!
    }

private var _Files: ImageVector? = null

