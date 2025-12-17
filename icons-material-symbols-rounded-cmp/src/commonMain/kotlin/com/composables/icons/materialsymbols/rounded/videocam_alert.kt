package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Videocam_alert: ImageVector
    get() {
        if (_Videocam_alert != null) return _Videocam_alert!!
        
        _Videocam_alert = ImageVector.Builder(
            name = "videocam_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(546f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(506f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(546f, 720f)
                horizontalLineToRelative(94f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(91f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 371f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 331f)
                verticalLineToRelative(-91f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(180f)
                lineToRelative(126f, -126f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(344f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineTo(720f, 540f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 800f)
                horizontalLineToRelative(-94f)
                close()
                moveToRelative(-306f, 40f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 640f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(240f, 840f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(160f, -200f)
                close()
            }
        }.build()
        
        return _Videocam_alert!!
    }

private var _Videocam_alert: ImageVector? = null

