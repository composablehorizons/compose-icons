package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Texture_minus: ImageVector
    get() {
        if (_Texture_minus != null) return _Texture_minus!!
        
        _Texture_minus = ImageVector.Builder(
            name = "texture_minus",
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
                moveToRelative(196f, 0f)
                lineToRelative(108f, -108f)
                verticalLineToRelative(108f)
                horizontalLineTo(372f)
                close()
                moveToRelative(188f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveTo(120f, 588f)
                verticalLineToRelative(-112f)
                lineToRelative(356f, -356f)
                horizontalLineToRelative(112f)
                lineTo(120f, 588f)
                close()
                moveToRelative(492f, 12f)
                lineToRelative(228f, -228f)
                verticalLineToRelative(112f)
                lineTo(724f, 600f)
                horizontalLineTo(612f)
                close()
                moveTo(120f, 280f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(80f)
                lineTo(120f, 280f)
                close()
            }
        }.build()
        
        return _Texture_minus!!
    }

private var _Texture_minus: ImageVector? = null

