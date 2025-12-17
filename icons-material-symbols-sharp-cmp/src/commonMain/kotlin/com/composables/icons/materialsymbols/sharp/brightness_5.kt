package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Brightness_5: ImageVector
    get() {
        if (_Brightness_5 != null) return _Brightness_5!!
        
        _Brightness_5 = ImageVector.Builder(
            name = "brightness_5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(0f, -252f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, 220f)
                lineToRelative(100f, -100f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                lineToRelative(100f, -100f)
                lineToRelative(-100f, -100f)
                verticalLineToRelative(-140f)
                horizontalLineTo(580f)
                lineTo(480f, 140f)
                lineTo(380f, 240f)
                horizontalLineTo(240f)
                verticalLineToRelative(140f)
                lineTo(140f, 480f)
                lineToRelative(100f, 100f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(140f)
                lineToRelative(100f, 100f)
                close()
                moveToRelative(0f, -340f)
                close()
            }
        }.build()
        
        return _Brightness_5!!
    }

private var _Brightness_5: ImageVector? = null

