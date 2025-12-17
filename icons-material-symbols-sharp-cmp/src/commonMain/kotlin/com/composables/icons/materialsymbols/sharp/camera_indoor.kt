package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Camera_indoor: ImageVector
    get() {
        if (_Camera_indoor != null) return _Camera_indoor!!
        
        _Camera_indoor = ImageVector.Builder(
            name = "camera_indoor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 680f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, 42f)
                verticalLineToRelative(-164f)
                lineToRelative(-80f, 42f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                lineTo(480f, 220f)
                lineTo(240f, 400f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(240f, -270f)
                close()
            }
        }.build()
        
        return _Camera_indoor!!
    }

private var _Camera_indoor: ImageVector? = null

