package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bubbles: ImageVector
    get() {
        if (_Bubbles != null) return _Bubbles!!
        
        _Bubbles = ImageVector.Builder(
            name = "bubbles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(402f, 306f)
                lineToRelative(118f, 117f)
                verticalLineToRelative(-89f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(226f)
                horizontalLineTo(374f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(90f)
                lineTo(346f, 362f)
                lineToRelative(56f, -56f)
                close()
                moveToRelative(358f, 494f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-680f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Bubbles!!
    }

private var _Bubbles: ImageVector? = null

