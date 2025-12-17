package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Checkbook: ImageVector
    get() {
        if (_Checkbook != null) return _Checkbook!!
        
        _Checkbook = ImageVector.Builder(
            name = "checkbook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 600f)
                horizontalLineToRelative(280f)
                lineToRelative(80f, -80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, -160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(280f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                close()
                moveToRelative(756f, 212f)
                quadToRelative(5f, 5f, 5f, 11f)
                reflectiveQuadToRelative(-5f, 11f)
                lineToRelative(-36f, 36f)
                lineToRelative(-70f, -70f)
                lineToRelative(36f, -36f)
                quadToRelative(5f, -5f, 11f, -5f)
                reflectiveQuadToRelative(11f, 5f)
                lineToRelative(48f, 48f)
                close()
                moveTo(520f, 840f)
                verticalLineToRelative(-70f)
                lineToRelative(266f, -266f)
                lineToRelative(70f, 70f)
                lineToRelative(-266f, 266f)
                horizontalLineToRelative(-70f)
                close()
                moveTo(160f, 280f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Checkbook!!
    }

private var _Checkbook: ImageVector? = null

