package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Battery_android_frame_bolt: ImageVector
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
                horizontalLineToRelative(458f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(658f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(618f, 320f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 640f)
                horizontalLineToRelative(418f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(618f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(578f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 360f)
                horizontalLineToRelative(343f)
                quadToRelative(26f, 0f, 36.5f, 22.5f)
                reflectiveQuadTo(574f, 425f)
                lineTo(458f, 570f)
                quadToRelative(-11f, 14f, -27.5f, 22f)
                reflectiveQuadToRelative(-34.5f, 8f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 560f)
                close()
                moveToRelative(566f, 123f)
                quadToRelative(-5f, 6f, -12.5f, 3f)
                reflectiveQuadToRelative(-5.5f, -11f)
                lineToRelative(27f, -155f)
                horizontalLineToRelative(-93f)
                quadToRelative(-13f, 0f, -18.5f, -11f)
                reflectiveQuadToRelative(2.5f, -21f)
                lineToRelative(168f, -211f)
                quadToRelative(5f, -6f, 12.5f, -3f)
                reflectiveQuadToRelative(5.5f, 11f)
                lineToRelative(-27f, 155f)
                horizontalLineToRelative(93f)
                quadToRelative(13f, 0f, 18.5f, 11f)
                reflectiveQuadToRelative(-2.5f, 21f)
                lineTo(726f, 683f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_bolt!!
    }

private var _Battery_android_frame_bolt: ImageVector? = null

