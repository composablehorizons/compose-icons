package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Folder_code: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(280f)
                horizontalLineTo(600f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                verticalLineToRelative(40f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Folder_code!!
    }

private var _Folder_code: ImageVector? = null

