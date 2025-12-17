package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Speed_camera: ImageVector
    get() {
        if (_Speed_camera != null) return _Speed_camera!!
        
        _Speed_camera = ImageVector.Builder(
            name = "speed_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(701f, 600f)
                lineToRelative(-87f, -50f)
                lineToRelative(140f, -104f)
                lineToRelative(86f, 50f)
                lineToRelative(-139f, 104f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-238f)
                lineToRelative(-120f, -69f)
                quadToRelative(-29f, -17f, -37.5f, -48.5f)
                reflectiveQuadTo(211f, 304f)
                lineToRelative(60f, -104f)
                quadToRelative(17f, -29f, 48.5f, -37.5f)
                reflectiveQuadTo(380f, 171f)
                lineToRelative(381f, 220f)
                lineToRelative(-244f, 182f)
                lineToRelative(-77f, -44f)
                verticalLineToRelative(191f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Speed_camera!!
    }

private var _Speed_camera: ImageVector? = null

