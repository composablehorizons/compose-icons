package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Motion_sensor_alert: ImageVector
    get() {
        if (_Motion_sensor_alert != null) return _Motion_sensor_alert!!
        
        _Motion_sensor_alert = ImageVector.Builder(
            name = "motion_sensor_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(360f, 436f)
                quadToRelative(-92f, -14f, -157f, -79f)
                reflectiveQuadToRelative(-79f, -157f)
                horizontalLineToRelative(80f)
                quadToRelative(12f, 59f, 54.5f, 101.5f)
                reflectiveQuadTo(440f, 596f)
                verticalLineToRelative(80f)
                close()
                moveTo(204f, 360f)
                quadToRelative(14f, -92f, 79f, -157.5f)
                reflectiveQuadTo(440f, 124f)
                verticalLineToRelative(80f)
                quadToRelative(-59f, 12f, -101.5f, 54.5f)
                reflectiveQuadTo(284f, 360f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(276f, 120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, -34f, 23.5f, -57f)
                reflectiveQuadToRelative(56.5f, -23f)
                quadToRelative(34f, 0f, 57f, 23f)
                reflectiveQuadToRelative(23f, 57f)
                quadToRelative(0f, 33f, -23f, 56.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(196f, -120f)
                quadToRelative(-12f, -59f, -54.5f, -101.5f)
                reflectiveQuadTo(520f, 204f)
                verticalLineToRelative(-80f)
                quadToRelative(92f, 14f, 157.5f, 79f)
                reflectiveQuadTo(756f, 360f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(124f, -120f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(760f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(560f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 880f)
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
                moveToRelative(-20f, -80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Motion_sensor_alert!!
    }

private var _Motion_sensor_alert: ImageVector? = null

