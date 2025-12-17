package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Battery_android_frame_plus: ImageVector
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
                moveTo(160f, 720f)
                quadToRelative(-51f, 0f, -85.5f, -34.5f)
                reflectiveQuadTo(40f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 34.5f, -85f)
                reflectiveQuadToRelative(85.5f, -35f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(560f, -80f)
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

