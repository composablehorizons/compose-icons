package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Battery_android_frame_bolt: ImageVector
    get() {
        if (_Battery_android_frame_bolt != null) return _Battery_android_frame_bolt!!
        
        _Battery_android_frame_bolt = ImageVector.Builder(
            name = "battery_android_frame_bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(562f)
                lineToRelative(-64f, 80f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 640f)
                horizontalLineToRelative(473f)
                lineToRelative(-15f, 80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(547f, -40f)
                lineToRelative(28f, -160f)
                horizontalLineTo(600f)
                lineToRelative(192f, -240f)
                horizontalLineToRelative(21f)
                lineToRelative(-28f, 160f)
                horizontalLineToRelative(135f)
                lineTo(728f, 680f)
                horizontalLineToRelative(-21f)
                close()
                moveToRelative(-547f, -80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(466f)
                lineTo(434f, 600f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_bolt!!
    }

private var _Battery_android_frame_bolt: ImageVector? = null

