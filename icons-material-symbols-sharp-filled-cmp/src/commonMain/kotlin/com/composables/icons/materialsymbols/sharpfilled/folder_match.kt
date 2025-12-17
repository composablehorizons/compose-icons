package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Folder_match: ImageVector
    get() {
        if (_Folder_match != null) return _Folder_match!!
        
        _Folder_match = ImageVector.Builder(
            name = "folder_match",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 776f)
                quadToRelative(-81f, -32f, -133.5f, -100.5f)
                reflectiveQuadTo(163f, 520f)
                horizontalLineToRelative(81f)
                quadToRelative(9f, 53f, 39f, 97f)
                reflectiveQuadToRelative(77f, 71f)
                verticalLineToRelative(88f)
                close()
                moveToRelative(80f, 104f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(180f)
                lineToRelative(40f, 60f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(300f)
                horizontalLineTo(440f)
                close()
                moveTo(80f, 440f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(180f)
                lineToRelative(40f, 60f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(300f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, 40f)
                quadToRelative(0f, -65f, -32f, -120.5f)
                reflectiveQuadTo(600f, 272f)
                verticalLineToRelative(-88f)
                quadToRelative(91f, 37f, 145.5f, 117.5f)
                reflectiveQuadTo(800f, 480f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Folder_match!!
    }

private var _Folder_match: ImageVector? = null

