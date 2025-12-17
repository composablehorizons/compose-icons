package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Upload_2: ImageVector
    get() {
        if (_Upload_2 != null) return _Upload_2!!
        
        _Upload_2 = ImageVector.Builder(
            name = "upload_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(200f, -160f)
                verticalLineToRelative(-280f)
                horizontalLineTo(200f)
                lineToRelative(280f, -360f)
                lineToRelative(280f, 360f)
                horizontalLineTo(600f)
                verticalLineToRelative(280f)
                horizontalLineTo(360f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(76f)
                lineTo(480f, 210f)
                lineTo(364f, 360f)
                horizontalLineToRelative(76f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(40f, -280f)
                close()
            }
        }.build()
        
        return _Upload_2!!
    }

private var _Upload_2: ImageVector? = null

