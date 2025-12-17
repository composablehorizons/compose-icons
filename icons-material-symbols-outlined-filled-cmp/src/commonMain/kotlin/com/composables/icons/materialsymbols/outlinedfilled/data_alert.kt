package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Data_alert: ImageVector
    get() {
        if (_Data_alert != null) return _Data_alert!!
        
        _Data_alert = ImageVector.Builder(
            name = "data_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(520f, -280f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(840f, 320f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(640f, 520f)
                close()
                moveToRelative(-520f, -40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(252f)
                quadToRelative(7f, 22f, 16f, 42f)
                reflectiveQuadToRelative(22f, 38f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(376f)
                quadToRelative(23f, 14f, 49f, 23.5f)
                reflectiveQuadToRelative(55f, 13.5f)
                verticalLineToRelative(43f)
                horizontalLineTo(120f)
                close()
                moveToRelative(500f, -280f)
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
        
        return _Data_alert!!
    }

private var _Data_alert: ImageVector? = null

