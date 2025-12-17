package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Folder_code: ImageVector
    get() {
        if (_Folder_code != null) return _Folder_code!!
        
        _Folder_code = ImageVector.Builder(
            name = "folder_code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(520f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveTo(584f, 904f)
                lineTo(440f, 760f)
                lineToRelative(144f, -144f)
                lineToRelative(56f, 57f)
                lineToRelative(-87f, 87f)
                lineToRelative(87f, 87f)
                lineToRelative(-56f, 57f)
                close()
                moveToRelative(192f, 0f)
                lineToRelative(-56f, -57f)
                lineToRelative(87f, -87f)
                lineToRelative(-87f, -87f)
                lineToRelative(56f, -57f)
                lineToRelative(144f, 144f)
                lineTo(776f, 904f)
                close()
            }
        }.build()
        
        return _Folder_code!!
    }

private var _Folder_code: ImageVector? = null

