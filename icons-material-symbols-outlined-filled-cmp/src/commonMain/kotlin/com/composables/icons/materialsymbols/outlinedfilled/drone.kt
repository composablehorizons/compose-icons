package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Drone: ImageVector
    get() {
        if (_Drone != null) return _Drone!!
        
        _Drone = ImageVector.Builder(
            name = "drone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(0f, -75f, 41f, -134.5f)
                reflectiveQuadTo(307f, 579f)
                lineToRelative(-10f, -99f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(48f)
                lineToRelative(-8f, -80f)
                horizontalLineToRelative(400f)
                lineToRelative(-8f, 80f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(321f)
                verticalLineToRelative(80f)
                horizontalLineTo(801f)
                verticalLineToRelative(240f)
                horizontalLineTo(664f)
                lineToRelative(-10f, 99f)
                quadToRelative(65f, 27f, 105.5f, 86.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                horizontalLineTo(400f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Drone!!
    }

private var _Drone: ImageVector? = null

