package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_android_frame_3: ImageVector
    get() {
        if (_Battery_android_frame_3 != null) return _Battery_android_frame_3!!
        
        _Battery_android_frame_3 = ImageVector.Builder(
            name = "battery_android_frame_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveTo(40f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(780f)
                verticalLineToRelative(480f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(620f)
                verticalLineToRelative(-320f)
                horizontalLineTo(120f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(740f, -60f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_3!!
    }

private var _Battery_android_frame_3: ImageVector? = null

