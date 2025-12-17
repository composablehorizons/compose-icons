package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Reminder: ImageVector
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
                moveToRelative(62f, 300f)
                close()
                moveTo(419f, 880f)
                quadToRelative(-28f, 0f, -52.5f, -12f)
                reflectiveQuadTo(325f, 834f)
                lineTo(124f, 579f)
                quadToRelative(-8f, -9f, -7f, -21.5f)
                reflectiveQuadToRelative(9f, -20.5f)
                quadToRelative(20f, -21f, 48f, -25f)
                reflectiveQuadToRelative(52f, 11f)
                lineToRelative(74f, 45f)
                verticalLineToRelative(-168f)
                horizontalLineToRelative(-40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(11f, 0f, 20.5f, 2f)
                reflectiveQuadToRelative(19.5f, 5f)
                verticalLineToRelative(-47f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(340f, 80f)
                quadToRelative(17f, 0f, 29f, 11.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                verticalLineToRelative(56f)
                quadToRelative(14f, -8f, 28.5f, -12f)
                reflectiveQuadToRelative(30.5f, -4f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineToRelative(-59f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 23f, -20.5f, 34.5f)
                reflectiveQuadTo(320f, 674f)
                lineToRelative(-36f, -22f)
                lineToRelative(104f, 133f)
                quadToRelative(6f, 7f, 14f, 11f)
                reflectiveQuadToRelative(17f, 4f)
                horizontalLineToRelative(221f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 520f)
                horizontalLineTo(501f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(461f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(501f, 440f)
                horizontalLineToRelative(179f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(419f)
                close()
            }
        }.build()
        
        return _Reminder!!
    }

private var _Reminder: ImageVector? = null

