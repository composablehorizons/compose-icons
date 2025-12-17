package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Texture: ImageVector
    get() {
        if (_Texture != null) return _Texture!!
        
        _Texture = ImageVector.Builder(
            name = "texture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(176f, 840f)
                quadToRelative(-19f, -4f, -35.5f, -20.5f)
                reflectiveQuadTo(120f, 784f)
                lineToRelative(664f, -664f)
                quadToRelative(21f, 5f, 36f, 20.5f)
                reflectiveQuadToRelative(21f, 35.5f)
                lineTo(176f, 840f)
                close()
                moveToRelative(-56f, -252f)
                verticalLineToRelative(-112f)
                lineToRelative(356f, -356f)
                horizontalLineToRelative(112f)
                lineTo(120f, 588f)
                close()
                moveToRelative(0f, -308f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(80f)
                lineTo(120f, 280f)
                close()
                moveToRelative(560f, 560f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-308f, 0f)
                lineToRelative(468f, -468f)
                verticalLineToRelative(112f)
                lineTo(484f, 840f)
                horizontalLineTo(372f)
                close()
            }
        }.build()
        
        return _Texture!!
    }

private var _Texture: ImageVector? = null

