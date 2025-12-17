package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Reminder: ImageVector
    get() {
        if (_Reminder != null) return _Reminder!!
        
        _Reminder = ImageVector.Builder(
            name = "reminder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 320f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(260f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(220f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(260f, 320f)
                close()
                moveToRelative(180f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 280f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(120f, 340f)
                close()
                moveTo(800f, 880f)
                horizontalLineTo(361f)
                lineTo(107f, 557f)
                lineToRelative(64f, -67f)
                lineToRelative(129f, 78f)
                verticalLineToRelative(-168f)
                horizontalLineToRelative(-40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(11f, 0f, 20.5f, 2f)
                reflectiveQuadToRelative(19.5f, 5f)
                verticalLineToRelative(-87f)
                horizontalLineToRelative(81f)
                verticalLineToRelative(96f)
                quadToRelative(14f, -8f, 28.5f, -12f)
                reflectiveQuadToRelative(30.5f, -4f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineToRelative(-59f)
                verticalLineToRelative(312f)
                lineToRelative(-97f, -60f)
                lineToRelative(116f, 148f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-280f)
                horizontalLineTo(461f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(339f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Reminder!!
    }

private var _Reminder: ImageVector? = null

