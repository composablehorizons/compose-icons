package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cancel_schedule_send: ImageVector
    get() {
        if (_Cancel_schedule_send != null) return _Cancel_schedule_send!!
        
        _Cancel_schedule_send = ImageVector.Builder(
            name = "cancel_schedule_send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(679f, 709f)
                lineToRelative(55f, 55f)
                quadToRelative(6f, 6f, 15f, 6f)
                reflectiveQuadToRelative(15f, -6f)
                quadToRelative(6f, -6f, 6f, -15f)
                reflectiveQuadToRelative(-6f, -15f)
                lineToRelative(-54f, -54f)
                lineToRelative(55f, -55f)
                quadToRelative(6f, -6f, 6f, -15f)
                reflectiveQuadToRelative(-6f, -15f)
                quadToRelative(-6f, -6f, -15f, -6f)
                reflectiveQuadToRelative(-15f, 6f)
                lineToRelative(-55f, 55f)
                lineToRelative(-55f, -55f)
                quadToRelative(-6f, -6f, -15f, -6f)
                reflectiveQuadToRelative(-15f, 6f)
                quadToRelative(-6f, 6f, -6f, 15f)
                reflectiveQuadToRelative(6f, 15f)
                lineToRelative(55f, 55f)
                lineToRelative(-56f, 56f)
                quadToRelative(-6f, 6f, -6f, 14f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(6f, 6f, 15f, 6f)
                reflectiveQuadToRelative(15f, -6f)
                lineToRelative(55f, -55f)
                close()
                moveToRelative(-559f, 31f)
                verticalLineToRelative(-149f)
                quadToRelative(0f, -14f, 8f, -25f)
                reflectiveQuadToRelative(22f, -14f)
                lineToRelative(174f, -43f)
                quadToRelative(10f, -2f, 16f, -10f)
                reflectiveQuadToRelative(6f, -19f)
                quadToRelative(0f, -11f, -6f, -19f)
                reflectiveQuadToRelative(-16f, -10f)
                lineToRelative(-174f, -43f)
                quadToRelative(-14f, -3f, -22f, -14f)
                reflectiveQuadToRelative(-8f, -25f)
                verticalLineToRelative(-149f)
                quadToRelative(0f, -22f, 17.5f, -33.5f)
                reflectiveQuadTo(175f, 183f)
                lineToRelative(404f, 169f)
                quadToRelative(23f, 9f, 20.5f, 35f)
                reflectiveQuadTo(571f, 422f)
                quadToRelative(-32f, 11f, -58f, 31.5f)
                reflectiveQuadTo(466f, 500f)
                quadToRelative(-27f, 32f, -43f, 69.5f)
                reflectiveQuadTo(402f, 649f)
                quadToRelative(-2f, 15f, -10f, 27.5f)
                reflectiveQuadTo(370f, 695f)
                lineToRelative(-194f, 82f)
                quadToRelative(-20f, 8f, -38f, -3.5f)
                reflectiveQuadTo(120f, 740f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
            }
        }.build()
        
        return _Cancel_schedule_send!!
    }

private var _Cancel_schedule_send: ImageVector? = null

