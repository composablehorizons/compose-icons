package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.On_hub_device: ImageVector
    get() {
        if (_On_hub_device != null) return _On_hub_device!!
        
        _On_hub_device = ImageVector.Builder(
            name = "on_hub_device",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 760f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                close()
                moveToRelative(-43f, -157f)
                lineToRelative(-37f, -477f)
                quadToRelative(-3f, -35f, 21f, -60.5f)
                reflectiveQuadToRelative(59f, -25.5f)
                horizontalLineToRelative(240f)
                quadToRelative(35f, 0f, 59f, 25.5f)
                reflectiveQuadToRelative(21f, 60.5f)
                lineToRelative(-37f, 477f)
                quadToRelative(-2f, 16f, -13f, 26.5f)
                reflectiveQuadTo(603f, 720f)
                horizontalLineTo(357f)
                quadToRelative(-16f, 0f, -27f, -10.5f)
                reflectiveQuadTo(317f, 683f)
                close()
                moveToRelative(77f, -43f)
                horizontalLineToRelative(172f)
                lineToRelative(34f, -440f)
                horizontalLineTo(360f)
                lineToRelative(34f, 440f)
                close()
                moveToRelative(0f, -440f)
                horizontalLineToRelative(-34f)
                horizontalLineToRelative(240f)
                horizontalLineToRelative(-206f)
                close()
            }
        }.build()
        
        return _On_hub_device!!
    }

private var _On_hub_device: ImageVector? = null

