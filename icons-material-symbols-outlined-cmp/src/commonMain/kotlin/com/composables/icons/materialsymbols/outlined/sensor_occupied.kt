package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sensor_occupied: ImageVector
    get() {
        if (_Sensor_occupied != null) return _Sensor_occupied!!
        
        _Sensor_occupied = ImageVector.Builder(
            name = "sensor_occupied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 440f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 360f)
                close()
                moveTo(240f, 680f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(279f, 535f)
                quadToRelative(45f, -26f, 95f, -40.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(56f, 0f, 106f, 14.5f)
                reflectiveQuadToRelative(95f, 40.5f)
                quadToRelative(18f, 11f, 28.5f, 29.5f)
                reflectiveQuadTo(720f, 604f)
                verticalLineToRelative(76f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -120f)
                quadToRelative(-41f, 0f, -80f, 10f)
                reflectiveQuadToRelative(-74f, 30f)
                horizontalLineToRelative(308f)
                quadToRelative(-35f, -20f, -74f, -30f)
                reflectiveQuadToRelative(-80f, -10f)
                close()
                moveToRelative(369f, -234f)
                quadToRelative(-31f, -73f, -86.5f, -128.5f)
                reflectiveQuadTo(634f, 111f)
                lineToRelative(31f, -74f)
                quadToRelative(88f, 36f, 154.5f, 103f)
                reflectiveQuadTo(923f, 295f)
                lineToRelative(-74f, 31f)
                close()
                moveToRelative(-738f, 0f)
                lineToRelative(-74f, -31f)
                quadToRelative(37f, -88f, 103.5f, -154.5f)
                reflectiveQuadTo(295f, 37f)
                lineToRelative(31f, 74f)
                quadToRelative(-73f, 31f, -128.5f, 86.5f)
                reflectiveQuadTo(111f, 326f)
                close()
                moveTo(295f, 923f)
                quadToRelative(-88f, -36f, -154.5f, -103f)
                reflectiveQuadTo(37f, 665f)
                lineToRelative(74f, -31f)
                quadToRelative(31f, 73f, 86.5f, 128.5f)
                reflectiveQuadTo(326f, 849f)
                lineToRelative(-31f, 74f)
                close()
                moveToRelative(370f, 0f)
                lineToRelative(-31f, -74f)
                quadToRelative(73f, -31f, 128.5f, -86.5f)
                reflectiveQuadTo(849f, 634f)
                lineToRelative(74f, 31f)
                quadToRelative(-36f, 88f, -103f, 154.5f)
                reflectiveQuadTo(665f, 923f)
                close()
                moveTo(480f, 320f)
                close()
                moveToRelative(0f, 280f)
                horizontalLineToRelative(154f)
                horizontalLineToRelative(-308f)
                horizontalLineToRelative(154f)
                close()
            }
        }.build()
        
        return _Sensor_occupied!!
    }

private var _Sensor_occupied: ImageVector? = null

