package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Auto_meeting_room: ImageVector
    get() {
        if (_Auto_meeting_room != null) return _Auto_meeting_room!!
        
        _Auto_meeting_room = ImageVector.Builder(
            name = "auto_meeting_room",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 936f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineTo(216f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineTo(336f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(600f)
                horizontalLineTo(40f)
                close()
                moveToRelative(320f, -320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 576f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 536f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 576f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 616f)
                close()
                moveTo(200f, 856f)
                horizontalLineToRelative(240f)
                verticalLineTo(296f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(560f, 120f)
                lineToRelative(50f, -110f)
                lineToRelative(110f, -50f)
                lineToRelative(-110f, -50f)
                lineToRelative(-50f, -110f)
                lineToRelative(-50f, 110f)
                lineToRelative(-110f, 50f)
                lineToRelative(110f, 50f)
                lineToRelative(50f, 110f)
                close()
                moveTo(200f, 856f)
                verticalLineTo(296f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Auto_meeting_room!!
    }

private var _Auto_meeting_room: ImageVector? = null

