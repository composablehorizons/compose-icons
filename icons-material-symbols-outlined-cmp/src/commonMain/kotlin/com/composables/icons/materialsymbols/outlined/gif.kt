package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Gif: ImageVector
    get() {
        if (_Gif != null) return _Gif!!
        
        _Gif = ImageVector.Builder(
            name = "gif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-220f, 0f)
                quadToRelative(-18f, 0f, -29f, -12.5f)
                reflectiveQuadTo(200f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -15f, 11f, -27.5f)
                reflectiveQuadToRelative(29f, -12.5f)
                horizontalLineToRelative(120f)
                quadToRelative(18f, 0f, 29f, 12.5f)
                reflectiveQuadToRelative(11f, 27.5f)
                verticalLineToRelative(20f)
                horizontalLineTo(260f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 15f, -11f, 27.5f)
                reflectiveQuadTo(360f, 600f)
                horizontalLineTo(240f)
                close()
                moveToRelative(340f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(60f)
                horizontalLineTo(640f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Gif!!
    }

private var _Gif: ImageVector? = null

