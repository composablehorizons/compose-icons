package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Circle_notifications: ImageVector
    get() {
        if (_Circle_notifications != null) return _Circle_notifications!!
        
        _Circle_notifications = ImageVector.Builder(
            name = "circle_notifications",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 740f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 680f)
                horizontalLineTo(420f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 740f)
                close()
                moveTo(280f, 640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-104f)
                quadToRelative(0f, -61f, -31.5f, -111.5f)
                reflectiveQuadTo(520f, 280f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                quadToRelative(-57f, 14f, -88.5f, 64.5f)
                reflectiveQuadTo(320f, 456f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(200f, -80f)
                close()
                moveToRelative(0f, 320f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Circle_notifications!!
    }

private var _Circle_notifications: ImageVector? = null

