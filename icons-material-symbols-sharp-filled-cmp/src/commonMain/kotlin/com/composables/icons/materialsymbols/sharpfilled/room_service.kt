package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Room_service: ImageVector
    get() {
        if (_Room_service != null) return _Room_service!!
        
        _Room_service = ImageVector.Builder(
            name = "room_service",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(40f, -120f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -128f, 78.5f, -226f)
                reflectiveQuadTo(400f, 250f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(90f)
                quadToRelative(124f, 26f, 202f, 124f)
                reflectiveQuadToRelative(78f, 226f)
                verticalLineToRelative(40f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Room_service!!
    }

private var _Room_service: ImageVector? = null

