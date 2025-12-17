package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_android_frame_full: ImageVector
    get() {
        if (_Battery_android_frame_full != null) return _Battery_android_frame_full!!
        
        _Battery_android_frame_full = ImageVector.Builder(
            name = "battery_android_frame_full",
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
                horizontalLineToRelative(540f)
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
        
        return _Battery_android_frame_full!!
    }

private var _Battery_android_frame_full: ImageVector? = null

