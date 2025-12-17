package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Battery_android_frame_share: ImageVector
    get() {
        if (_Battery_android_frame_share != null) return _Battery_android_frame_share!!
        
        _Battery_android_frame_share = ImageVector.Builder(
            name = "battery_android_frame_share",
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
                horizontalLineToRelative(567f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 640f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, -80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 440f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-57f, -57f)
                lineToRelative(64f, -63f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, -40f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(447f)
                quadToRelative(-69f, 0f, -118f, 44.5f)
                reflectiveQuadTo(440f, 520f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_share!!
    }

private var _Battery_android_frame_share: ImageVector? = null

