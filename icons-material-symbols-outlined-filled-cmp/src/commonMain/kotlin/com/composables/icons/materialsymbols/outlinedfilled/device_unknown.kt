package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Device_unknown: ImageVector
    get() {
        if (_Device_unknown != null) return _Device_unknown!!
        
        _Device_unknown = ImageVector.Builder(
            name = "device_unknown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(-17f, 0f, -29.5f, -12.5f)
                reflectiveQuadTo(438f, 638f)
                quadToRelative(0f, -17f, 12.5f, -29.5f)
                reflectiveQuadTo(480f, 596f)
                quadToRelative(17f, 0f, 29.5f, 12.5f)
                reflectiveQuadTo(522f, 638f)
                quadToRelative(0f, 17f, -12.5f, 29.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-30f, -128f)
                quadToRelative(0f, -46f, 7.5f, -63f)
                reflectiveQuadToRelative(42.5f, -47f)
                quadToRelative(14f, -14f, 24f, -27.5f)
                reflectiveQuadToRelative(10f, -30.5f)
                quadToRelative(0f, -18f, -13.5f, -32f)
                reflectiveQuadTo(480f, 338f)
                quadToRelative(-27f, 0f, -41f, 15.5f)
                reflectiveQuadTo(420f, 386f)
                lineToRelative(-54f, -22f)
                quadToRelative(12f, -35f, 41f, -59.5f)
                reflectiveQuadToRelative(73f, -24.5f)
                quadToRelative(47f, 0f, 80.5f, 25.5f)
                reflectiveQuadTo(594f, 382f)
                quadToRelative(0f, 24f, -12f, 45f)
                reflectiveQuadToRelative(-30f, 39f)
                quadToRelative(-30f, 30f, -36f, 42f)
                reflectiveQuadToRelative(-6f, 44f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Device_unknown!!
    }

private var _Device_unknown: ImageVector? = null

