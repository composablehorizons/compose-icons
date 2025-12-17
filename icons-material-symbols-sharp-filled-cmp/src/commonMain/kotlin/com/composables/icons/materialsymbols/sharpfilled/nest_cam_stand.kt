package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nest_cam_stand: ImageVector
    get() {
        if (_Nest_cam_stand != null) return _Nest_cam_stand!!
        
        _Nest_cam_stand = ImageVector.Builder(
            name = "nest_cam_stand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(152f, 840f)
                lineToRelative(32f, -368f)
                quadToRelative(5f, -72f, 42f, -131f)
                reflectiveQuadToRelative(94f, -95f)
                verticalLineToRelative(154f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(67f, 0f, 113.5f, -47f)
                reflectiveQuadTo(640f, 400f)
                verticalLineToRelative(-154f)
                quadToRelative(57f, 36f, 94f, 95f)
                reflectiveQuadToRelative(42f, 131f)
                lineToRelative(31f, 368f)
                horizontalLineTo(152f)
                close()
                moveToRelative(328f, -360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 400f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 240f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Nest_cam_stand!!
    }

private var _Nest_cam_stand: ImageVector? = null

