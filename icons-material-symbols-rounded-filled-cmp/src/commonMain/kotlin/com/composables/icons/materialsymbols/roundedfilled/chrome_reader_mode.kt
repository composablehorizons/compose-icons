package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chrome_reader_mode: ImageVector
    get() {
        if (_Chrome_reader_mode != null) return _Chrome_reader_mode!!
        
        _Chrome_reader_mode = ImageVector.Builder(
            name = "chrome_reader_mode",
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
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-480f)
                horizontalLineTo(520f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(210f, -120f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(760f, 570f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(730f, 540f)
                horizontalLineTo(590f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(560f, 570f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(590f, 600f)
                horizontalLineToRelative(140f)
                close()
                moveToRelative(0f, -100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(760f, 470f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(730f, 440f)
                horizontalLineTo(590f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(560f, 470f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(590f, 500f)
                horizontalLineToRelative(140f)
                close()
                moveToRelative(0f, -100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(760f, 370f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(730f, 340f)
                horizontalLineTo(590f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(560f, 370f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(590f, 400f)
                horizontalLineToRelative(140f)
                close()
            }
        }.build()
        
        return _Chrome_reader_mode!!
    }

private var _Chrome_reader_mode: ImageVector? = null

