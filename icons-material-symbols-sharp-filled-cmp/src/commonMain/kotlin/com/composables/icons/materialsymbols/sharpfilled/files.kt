package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Files: ImageVector
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
                verticalLineToRelative(-200f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
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

