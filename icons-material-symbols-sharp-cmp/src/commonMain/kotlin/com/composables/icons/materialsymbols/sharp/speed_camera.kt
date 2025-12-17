package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Speed_camera: ImageVector
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
                moveTo(512f, 478f)
                lineToRelative(104f, -79f)
                lineToRelative(-276f, -159f)
                lineToRelative(-60f, 104f)
                lineToRelative(232f, 134f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-238f)
                lineTo(171f, 373f)
                lineToRelative(140f, -242f)
                lineToRelative(450f, 260f)
                lineToRelative(-244f, 182f)
                lineToRelative(-77f, -44f)
                verticalLineToRelative(271f)
                horizontalLineTo(160f)
                close()
                moveToRelative(288f, -441f)
                close()
            }
        }.build()
        
        return _Speed_camera!!
    }

private var _Speed_camera: ImageVector? = null

