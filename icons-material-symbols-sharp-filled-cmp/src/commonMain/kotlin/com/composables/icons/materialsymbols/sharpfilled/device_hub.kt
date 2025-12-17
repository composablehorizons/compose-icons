package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Device_hub: ImageVector
    get() {
        if (_Device_hub != null) return _Device_hub!!
        
        _Device_hub = ImageVector.Builder(
            name = "device_hub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(160f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(-128f)
                quadToRelative(-36f, -13f, -58f, -43.5f)
                reflectiveQuadTo(360f, 240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 38f, -22f, 68.5f)
                reflectiveQuadTo(520f, 352f)
                verticalLineToRelative(128f)
                lineToRelative(160f, 160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(200f)
                horizontalLineTo(640f)
                verticalLineToRelative(-122f)
                lineTo(480f, 558f)
                lineTo(320f, 718f)
                verticalLineToRelative(122f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Device_hub!!
    }

private var _Device_hub: ImageVector? = null

