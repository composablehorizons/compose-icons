package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Car_fan_recirculate: ImageVector
    get() {
        if (_Car_fan_recirculate != null) return _Car_fan_recirculate!!
        
        _Car_fan_recirculate = ImageVector.Builder(
            name = "car_fan_recirculate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 600f)
                lineTo(40f, 440f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-63f, 64f)
                horizontalLineToRelative(229f)
                lineToRelative(197f, -240f)
                lineToRelative(61f, 52f)
                lineToRelative(-222f, 268f)
                horizontalLineTo(193f)
                lineToRelative(63f, 64f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(212f, -314f)
                lineToRelative(-85f, -86f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                lineToRelative(104f, 104f)
                lineToRelative(-52f, 62f)
                close()
                moveToRelative(148f, 515f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 721f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(560f, 641f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(480f, 721f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(560f, 801f)
                close()
                moveToRelative(0f, 79f)
                quadToRelative(-56f, 0f, -98f, -34f)
                reflectiveQuadToRelative(-56f, -86f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(206f)
                quadToRelative(14f, -51f, 56f, -85f)
                reflectiveQuadToRelative(98f, -34f)
                quadToRelative(56f, 0f, 98f, 34f)
                reflectiveQuadToRelative(56f, 85f)
                horizontalLineToRelative(86f)
                verticalLineToRelative(-179f)
                quadToRelative(0f, -30f, -20f, -52.5f)
                reflectiveQuadTo(730f, 422f)
                lineToRelative(-108f, -14f)
                lineToRelative(60f, -73f)
                lineToRelative(58f, 7f)
                quadToRelative(60f, 8f, 100f, 53f)
                reflectiveQuadToRelative(40f, 106f)
                verticalLineToRelative(259f)
                horizontalLineTo(714f)
                quadToRelative(-14f, 52f, -56f, 86f)
                reflectiveQuadToRelative(-98f, 34f)
                close()
            }
        }.build()
        
        return _Car_fan_recirculate!!
    }

private var _Car_fan_recirculate: ImageVector? = null

