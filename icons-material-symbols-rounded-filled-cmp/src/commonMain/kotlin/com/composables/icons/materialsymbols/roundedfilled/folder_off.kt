package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Folder_off: ImageVector
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
                moveTo(812f, 699f)
                lineTo(342f, 229f)
                quadToRelative(-19f, -19f, -8.5f, -44f)
                reflectiveQuadToRelative(37.5f, -25f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(13.5f, 9f)
                lineToRelative(68f, 68f)
                horizontalLineToRelative(332f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(350f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(812f, 699f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineTo(128f)
                lineToRelative(-72f, -72f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(847f, 904f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(791f, 904f)
                lineTo(687f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Folder_off!!
    }

private var _Folder_off: ImageVector? = null

