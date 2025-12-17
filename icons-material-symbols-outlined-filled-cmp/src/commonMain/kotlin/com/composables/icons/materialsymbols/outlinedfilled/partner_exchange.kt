package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Partner_exchange: ImageVector
    get() {
        if (_Partner_exchange != null) return _Partner_exchange!!
        
        _Partner_exchange = ImageVector.Builder(
            name = "partner_exchange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 360f)
                lineTo(340f, 220f)
                lineToRelative(140f, -140f)
                lineToRelative(140f, 140f)
                lineToRelative(-140f, 140f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -34f, 23.5f, -57f)
                reflectiveQuadToRelative(56.5f, -23f)
                horizontalLineToRelative(131f)
                quadToRelative(20f, 0f, 38f, 10f)
                reflectiveQuadToRelative(29f, 27f)
                quadToRelative(29f, 39f, 71.5f, 61f)
                reflectiveQuadToRelative(90.5f, 22f)
                quadToRelative(49f, 0f, 91.5f, -22f)
                reflectiveQuadToRelative(70.5f, -61f)
                quadToRelative(13f, -17f, 30.5f, -27f)
                reflectiveQuadToRelative(36.5f, -10f)
                horizontalLineToRelative(131f)
                quadToRelative(34f, 0f, 57f, 23f)
                reflectiveQuadToRelative(23f, 57f)
                verticalLineToRelative(160f)
                horizontalLineTo(640f)
                verticalLineToRelative(-91f)
                quadToRelative(-35f, 25f, -75.5f, 38f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(-43f, 0f, -84f, -13.5f)
                reflectiveQuadTo(320f, 708f)
                verticalLineToRelative(92f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -280f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(0f, 50f, -34.5f, 85f)
                reflectiveQuadTo(160f, 520f)
                close()
                moveToRelative(640f, 0f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(920f, 400f)
                quadToRelative(0f, 50f, -34.5f, 85f)
                reflectiveQuadTo(800f, 520f)
                close()
            }
        }.build()
        
        return _Partner_exchange!!
    }

private var _Partner_exchange: ImageVector? = null

