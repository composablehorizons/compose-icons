package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Format_text_wrap: ImageVector
    get() {
        if (_Format_text_wrap != null) return _Format_text_wrap!!
        
        _Format_text_wrap = ImageVector.Builder(
            name = "format_text_wrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(560f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-296f, -98f)
                lineTo(282f, 560f)
                lineToRelative(142f, -141f)
                lineToRelative(56f, 56f)
                lineToRelative(-45f, 45f)
                horizontalLineToRelative(85f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(600f, 440f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(520f, 360f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineToRelative(-85f)
                lineToRelative(45f, 45f)
                lineToRelative(-56f, 57f)
                close()
            }
        }.build()
        
        return _Format_text_wrap!!
    }

private var _Format_text_wrap: ImageVector? = null

