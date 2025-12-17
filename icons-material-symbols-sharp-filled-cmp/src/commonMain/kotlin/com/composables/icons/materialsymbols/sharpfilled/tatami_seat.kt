package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tatami_seat: ImageVector
    get() {
        if (_Tatami_seat != null) return _Tatami_seat!!
        
        _Tatami_seat = ImageVector.Builder(
            name = "tatami_seat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                quadToRelative(-38f, 0f, -71.5f, -17f)
                reflectiveQuadTo(152f, 776f)
                quadToRelative(-23f, -30f, -30f, -67.5f)
                reflectiveQuadToRelative(4f, -73.5f)
                lineToRelative(24f, -82f)
                lineToRelative(-30f, -427f)
                lineToRelative(80f, -6f)
                quadToRelative(66f, -5f, 115.5f, 39f)
                reflectiveQuadTo(370f, 269f)
                lineToRelative(9f, 119f)
                quadToRelative(5f, 66f, -38.5f, 116f)
                reflectiveQuadTo(231f, 559f)
                lineToRelative(-28f, 98f)
                quadToRelative(-5f, 18f, -1.5f, 37f)
                reflectiveQuadToRelative(14.5f, 34f)
                quadToRelative(5f, 6f, 11f, 11f)
                reflectiveQuadToRelative(14f, 10f)
                quadToRelative(5f, -63f, 50.5f, -106f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineToRelative(280f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Tatami_seat!!
    }

private var _Tatami_seat: ImageVector? = null

