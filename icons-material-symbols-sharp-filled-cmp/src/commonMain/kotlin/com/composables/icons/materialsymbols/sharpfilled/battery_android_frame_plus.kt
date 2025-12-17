package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_android_frame_plus: ImageVector
    get() {
        if (_Battery_android_frame_plus != null) return _Battery_android_frame_plus!!
        
        _Battery_android_frame_plus = ImageVector.Builder(
            name = "battery_android_frame_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(680f, -80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-560f, -40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_plus!!
    }

private var _Battery_android_frame_plus: ImageVector? = null

