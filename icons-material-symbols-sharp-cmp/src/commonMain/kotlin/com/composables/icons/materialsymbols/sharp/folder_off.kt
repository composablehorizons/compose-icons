package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Folder_off: ImageVector
    get() {
        if (_Folder_off != null) return _Folder_off!!
        
        _Folder_off = ImageVector.Builder(
            name = "folder_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 767f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-367f)
                horizontalLineTo(434f)
                lineToRelative(-80f, -80f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(114f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(412f)
                verticalLineToRelative(527f)
                close()
                moveTo(819f, 932f)
                lineTo(687f, 800f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(447f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(368f, 480f)
                close()
                moveToRelative(209f, -17f)
                close()
            }
        }.build()
        
        return _Folder_off!!
    }

private var _Folder_off: ImageVector? = null

