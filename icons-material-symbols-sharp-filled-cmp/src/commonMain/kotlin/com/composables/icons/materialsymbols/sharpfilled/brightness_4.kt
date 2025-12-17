package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Brightness_4: ImageVector
    get() {
        if (_Brightness_4 != null) return _Brightness_4!!
        
        _Brightness_4 = ImageVector.Builder(
            name = "brightness_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(492f, 680f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(692f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(492f, 280f)
                quadToRelative(-22f, 0f, -43f, 4.5f)
                reflectiveQuadTo(408f, 298f)
                quadToRelative(54f, 25f, 85.5f, 74f)
                reflectiveQuadTo(525f, 480f)
                quadToRelative(0f, 59f, -31.5f, 108f)
                reflectiveQuadTo(408f, 662f)
                quadToRelative(20f, 9f, 41f, 13.5f)
                reflectiveQuadToRelative(43f, 4.5f)
                close()
                moveTo(480f, 932f)
                lineTo(346f, 800f)
                horizontalLineTo(160f)
                verticalLineToRelative(-186f)
                lineTo(28f, 480f)
                lineToRelative(132f, -134f)
                verticalLineToRelative(-186f)
                horizontalLineToRelative(186f)
                lineToRelative(134f, -132f)
                lineToRelative(134f, 132f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(186f)
                lineToRelative(132f, 134f)
                lineToRelative(-132f, 134f)
                verticalLineToRelative(186f)
                horizontalLineTo(614f)
                lineTo(480f, 932f)
                close()
            }
        }.build()
        
        return _Brightness_4!!
    }

private var _Brightness_4: ImageVector? = null

