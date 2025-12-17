package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Emergency_recording: ImageVector
    get() {
        if (_Emergency_recording != null) return _Emergency_recording!!
        
        _Emergency_recording = ImageVector.Builder(
            name = "emergency_recording",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 549f)
                verticalLineToRelative(91f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 640f)
                verticalLineToRelative(-91f)
                lineToRelative(86f, 49f)
                quadToRelative(14f, 8f, 30f, 4f)
                reflectiveQuadToRelative(24f, -18f)
                quadToRelative(8f, -14f, 3.5f, -30.5f)
                reflectiveQuadTo(565f, 529f)
                lineToRelative(-85f, -49f)
                lineToRelative(85f, -49f)
                quadToRelative(14f, -8f, 18.5f, -24.5f)
                reflectiveQuadTo(580f, 376f)
                quadToRelative(-8f, -14f, -24f, -18f)
                reflectiveQuadToRelative(-30f, 4f)
                lineToRelative(-86f, 49f)
                verticalLineToRelative(-91f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 320f)
                verticalLineToRelative(91f)
                lineToRelative(-86f, -49f)
                quadToRelative(-14f, -8f, -30f, -4f)
                reflectiveQuadToRelative(-24f, 18f)
                quadToRelative(-8f, 14f, -3.5f, 30.5f)
                reflectiveQuadTo(235f, 431f)
                lineToRelative(85f, 49f)
                lineToRelative(-85f, 49f)
                quadToRelative(-14f, 8f, -18.5f, 24.5f)
                reflectiveQuadTo(220f, 584f)
                quadToRelative(8f, 14f, 24f, 18f)
                reflectiveQuadToRelative(30f, -4f)
                lineToRelative(86f, -49f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
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
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Emergency_recording!!
    }

private var _Emergency_recording: ImageVector? = null

