package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Data_loss_prevention: ImageVector
    get() {
        if (_Data_loss_prevention != null) return _Data_loss_prevention!!
        
        _Data_loss_prevention = ImageVector.Builder(
            name = "data_loss_prevention",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 400f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(520f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(440f, 400f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(45f, 0f, 84.5f, -19f)
                reflectiveQuadToRelative(68.5f, -54f)
                quadToRelative(-35f, -23f, -73.5f, -35f)
                reflectiveQuadTo(440f, 440f)
                quadToRelative(-41f, 0f, -79.5f, 12f)
                reflectiveQuadTo(287f, 487f)
                quadToRelative(29f, 35f, 68.5f, 54f)
                reflectiveQuadToRelative(84.5f, 19f)
                close()
                moveToRelative(384f, 280f)
                lineTo(636f, 652f)
                quadToRelative(-41f, 32f, -90.5f, 50f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 56f, -18f, 105.5f)
                reflectiveQuadTo(692f, 596f)
                lineToRelative(188f, 188f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Data_loss_prevention!!
    }

private var _Data_loss_prevention: ImageVector? = null

