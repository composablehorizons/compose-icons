package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Upload_file: ImageVector
    get() {
        if (_Upload_file != null) return _Upload_file!!
        
        _Upload_file = ImageVector.Builder(
            name = "upload_file",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-167f)
                lineToRelative(64f, 64f)
                lineToRelative(56f, -57f)
                lineToRelative(-160f, -160f)
                lineToRelative(-160f, 160f)
                lineToRelative(57f, 56f)
                lineToRelative(63f, -63f)
                verticalLineToRelative(167f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(560f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, -520f)
                horizontalLineToRelative(200f)
                lineTo(520f, 160f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Upload_file!!
    }

private var _Upload_file: ImageVector? = null

