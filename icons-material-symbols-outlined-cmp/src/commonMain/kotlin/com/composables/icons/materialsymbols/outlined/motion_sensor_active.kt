package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Motion_sensor_active: ImageVector
    get() {
        if (_Motion_sensor_active != null) return _Motion_sensor_active!!
        
        _Motion_sensor_active = ImageVector.Builder(
            name = "motion_sensor_active",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveTo(80f, 320f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(160f)
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
                reflectiveQuadTo(440f, 676f)
                verticalLineToRelative(80f)
                close()
                moveTo(204f, 440f)
                quadToRelative(14f, -92f, 79f, -157.5f)
                reflectiveQuadTo(440f, 204f)
                verticalLineToRelative(80f)
                quadToRelative(-59f, 12f, -101.5f, 54.5f)
                reflectiveQuadTo(284f, 440f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(276f, 120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -34f, 23.5f, -57f)
                reflectiveQuadToRelative(56.5f, -23f)
                quadToRelative(34f, 0f, 57f, 23f)
                reflectiveQuadToRelative(23f, 57f)
                quadToRelative(0f, 33f, -23f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(40f, 196f)
                verticalLineToRelative(-80f)
                quadToRelative(59f, -12f, 101.5f, -54.5f)
                reflectiveQuadTo(676f, 520f)
                horizontalLineToRelative(80f)
                quadToRelative(-13f, 92f, -78.5f, 157f)
                reflectiveQuadTo(520f, 756f)
                close()
                moveToRelative(156f, -316f)
                quadToRelative(-12f, -59f, -54.5f, -101.5f)
                reflectiveQuadTo(520f, 284f)
                verticalLineToRelative(-80f)
                quadToRelative(92f, 14f, 157.5f, 79f)
                reflectiveQuadTo(756f, 440f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(640f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(640f)
                close()
                moveToRelative(160f, -560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Motion_sensor_active!!
    }

private var _Motion_sensor_active: ImageVector? = null

