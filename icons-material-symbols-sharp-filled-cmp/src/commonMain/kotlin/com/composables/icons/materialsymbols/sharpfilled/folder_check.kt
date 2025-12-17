package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Folder_check: ImageVector
    get() {
        if (_Folder_check != null) return _Folder_check!!
        
        _Folder_check = ImageVector.Builder(
            name = "folder_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(434f, 663f)
                lineToRelative(226f, -227f)
                lineToRelative(-56f, -56f)
                lineToRelative(-170f, 170f)
                lineToRelative(-85f, -85f)
                lineToRelative(-57f, 57f)
                lineToRelative(142f, 141f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(560f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Folder_check!!
    }

private var _Folder_check: ImageVector? = null

