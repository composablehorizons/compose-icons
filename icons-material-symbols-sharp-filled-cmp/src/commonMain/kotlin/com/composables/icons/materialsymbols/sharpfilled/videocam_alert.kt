package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Videocam_alert: ImageVector
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
                moveTo(467f, 800f)
                quadToRelative(25f, -35f, 38f, -76f)
                reflectiveQuadToRelative(13f, -85f)
                quadToRelative(0f, -116f, -81.5f, -197.5f)
                reflectiveQuadTo(239f, 360f)
                quadToRelative(-43f, 0f, -83.5f, 12.5f)
                reflectiveQuadTo(80f, 409f)
                verticalLineToRelative(-249f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(260f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                lineTo(720f, 540f)
                verticalLineToRelative(260f)
                horizontalLineTo(467f)
                close()
                moveToRelative(-227f, 40f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 640f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(240f, 840f)
                close()
                moveToRelative(-20f, -160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(20f, 80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
            }
        }.build()
        
        return _Videocam_alert!!
    }

private var _Videocam_alert: ImageVector? = null

