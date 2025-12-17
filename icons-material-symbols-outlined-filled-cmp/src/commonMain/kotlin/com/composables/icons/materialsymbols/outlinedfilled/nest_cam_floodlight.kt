package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nest_cam_floodlight: ImageVector
    get() {
        if (_Nest_cam_floodlight != null) return _Nest_cam_floodlight!!
        
        _Nest_cam_floodlight = ImageVector.Builder(
            name = "nest_cam_floodlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(180f, -76f)
                lineToRelative(84f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                close()
                moveTo(0f, 0f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(160f, 80f)
                verticalLineToRelative(68f)
                quadToRelative(32f, -50f, 85f, -79f)
                reflectiveQuadToRelative(116f, -29f)
                horizontalLineToRelative(199f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 120f)
                verticalLineToRelative(171f)
                lineToRelative(-63f, -62f)
                quadToRelative(-42f, -42f, -98f, -65.5f)
                reflectiveQuadTo(363f, 140f)
                quadToRelative(-57f, 0f, -110.5f, 22f)
                reflectiveQuadTo(160f, 219f)
                verticalLineToRelative(92f)
                quadToRelative(27f, -45f, 83f, -78f)
                reflectiveQuadToRelative(120f, -33f)
                quadToRelative(48f, 0f, 93f, 19f)
                reflectiveQuadToRelative(79f, 53f)
                lineToRelative(141f, 141f)
                quadToRelative(23f, 23f, 23f, 57f)
                reflectiveQuadToRelative(-23f, 57f)
                lineTo(446f, 756f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineTo(191f, 615f)
                quadToRelative(-9f, -9f, -16.5f, -18f)
                reflectiveQuadTo(160f, 577f)
                verticalLineToRelative(63f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(80f, 720f)
                horizontalLineTo(0f)
                verticalLineToRelative(-720f)
                close()
                moveToRelative(680f, 560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Nest_cam_floodlight!!
    }

private var _Nest_cam_floodlight: ImageVector? = null

