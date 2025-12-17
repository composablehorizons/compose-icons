package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Folder_off: ImageVector
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
                moveTo(871f, 758f)
                lineTo(274f, 160f)
                horizontalLineToRelative(114f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(332f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 11f, -2f, 20.5f)
                reflectiveQuadToRelative(-7f, 17.5f)
                close()
                moveTo(819f, 932f)
                lineTo(687f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineTo(128f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                close()
            }
        }.build()
        
        return _Folder_off!!
    }

private var _Folder_off: ImageVector? = null

