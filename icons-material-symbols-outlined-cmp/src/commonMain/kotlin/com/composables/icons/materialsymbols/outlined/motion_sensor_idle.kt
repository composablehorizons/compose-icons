package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Motion_sensor_idle: ImageVector
    get() {
        if (_Motion_sensor_idle != null) return _Motion_sensor_idle!!
        
        _Motion_sensor_idle = ImageVector.Builder(
            name = "motion_sensor_idle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 153f)
                verticalLineToRelative(80f)
                quadToRelative(-8f, 2f, -16f, 4.5f)
                reflectiveQuadToRelative(-16f, 5.5f)
                lineToRelative(-60f, -60f)
                quadToRelative(21f, -11f, 44f, -18.5f)
                reflectiveQuadToRelative(48f, -11.5f)
                close()
                moveToRelative(316f, 316f)
                quadToRelative(-4f, 25f, -11.5f, 48f)
                reflectiveQuadTo(726f, 561f)
                lineToRelative(-60f, -60f)
                quadToRelative(3f, -8f, 5.5f, -16f)
                reflectiveQuadToRelative(4.5f, -16f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(63f, 412f)
                lineTo(27f, 89f)
                lineToRelative(57f, -57f)
                lineToRelative(792f, 792f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-659f, -53f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 748f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(640f, -560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 108f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-720f, 0f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 6f, -31.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(57f, 58f)
                verticalLineToRelative(159f)
                horizontalLineTo(80f)
                close()
                moveToRelative(560f, 560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(159f)
                lineToRelative(57f, 56f)
                quadToRelative(-11f, 11f, -25f, 17.5f)
                reflectiveQuadToRelative(-31f, 6.5f)
                horizontalLineTo(640f)
                close()
                moveTo(273f, 108f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(127f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-47f)
                close()
                moveToRelative(607f, 607f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(127f)
                close()
                moveTo(204f, 469f)
                horizontalLineToRelative(80f)
                quadToRelative(12f, 59f, 54.5f, 101.5f)
                reflectiveQuadTo(440f, 625f)
                verticalLineToRelative(80f)
                quadToRelative(-92f, -14f, -157f, -79f)
                reflectiveQuadToRelative(-79f, -157f)
                close()
                moveToRelative(79f, -238f)
                lineToRelative(56f, 56f)
                quadToRelative(-20f, 21f, -34.5f, 47f)
                reflectiveQuadTo(284f, 389f)
                horizontalLineToRelative(-80f)
                quadToRelative(7f, -46f, 27.5f, -86f)
                reflectiveQuadToRelative(51.5f, -72f)
                close()
                moveToRelative(339f, 339f)
                lineToRelative(56f, 56f)
                quadToRelative(-32f, 31f, -72f, 51.5f)
                reflectiveQuadTo(520f, 705f)
                verticalLineToRelative(-80f)
                quadToRelative(29f, -6f, 55f, -20.5f)
                reflectiveQuadToRelative(47f, -34.5f)
                close()
                moveTo(520f, 153f)
                quadToRelative(92f, 14f, 157.5f, 79f)
                reflectiveQuadTo(756f, 389f)
                horizontalLineToRelative(-80f)
                quadToRelative(-12f, -59f, -54.5f, -101.5f)
                reflectiveQuadTo(520f, 233f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Motion_sensor_idle!!
    }

private var _Motion_sensor_idle: ImageVector? = null

