package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Folder_code: ImageVector
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
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                verticalLineToRelative(40f)
                horizontalLineTo(160f)
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

