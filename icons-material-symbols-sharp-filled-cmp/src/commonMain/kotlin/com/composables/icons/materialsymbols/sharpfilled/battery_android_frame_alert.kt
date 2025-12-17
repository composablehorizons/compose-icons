package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_android_frame_alert: ImageVector
    get() {
        if (_Battery_android_frame_alert != null) return _Battery_android_frame_alert!!
        
        _Battery_android_frame_alert = ImageVector.Builder(
            name = "battery_android_frame_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 660f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 620f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 580f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 620f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 660f)
                close()
                moveToRelative(-40f, -140f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(40f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(600f)
                quadToRelative(0f, 23f, 8.5f, 43.5f)
                reflectiveQuadTo(751f, 720f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -120f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_alert!!
    }

private var _Battery_android_frame_alert: ImageVector? = null

