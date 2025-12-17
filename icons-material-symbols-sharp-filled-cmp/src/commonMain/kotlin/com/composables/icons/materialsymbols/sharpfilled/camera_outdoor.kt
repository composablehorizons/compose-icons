package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Camera_outdoor: ImageVector
    get() {
        if (_Camera_outdoor != null) return _Camera_outdoor!!
        
        _Camera_outdoor = ImageVector.Builder(
            name = "camera_outdoor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(80f)
                horizontalLineTo(440f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -120f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                lineToRelative(80f, -42f)
                verticalLineToRelative(164f)
                lineToRelative(-80f, -42f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Camera_outdoor!!
    }

private var _Camera_outdoor: ImageVector? = null

