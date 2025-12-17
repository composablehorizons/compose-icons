package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nest_cam_stand: ImageVector
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
                moveTo(360f, 317f)
                quadToRelative(-40f, 27f, -65.5f, 69.5f)
                reflectiveQuadTo(264f, 480f)
                lineToRelative(-24f, 280f)
                horizontalLineToRelative(480f)
                lineToRelative(-24f, -280f)
                quadToRelative(-4f, -52f, -29.5f, -94.5f)
                reflectiveQuadTo(600f, 316f)
                verticalLineToRelative(84f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-83f)
                close()
                moveToRelative(120f, 123f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 400f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 240f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveTo(240f, 840f)
                quadToRelative(-35f, 0f, -59f, -26f)
                reflectiveQuadToRelative(-21f, -61f)
                lineToRelative(24f, -281f)
                quadToRelative(7f, -85f, 55f, -150f)
                reflectiveQuadToRelative(122f, -97f)
                quadToRelative(6f, -45f, 39.5f, -75f)
                reflectiveQuadToRelative(79.5f, -30f)
                quadToRelative(46f, 0f, 79.5f, 29.5f)
                reflectiveQuadTo(599f, 224f)
                quadToRelative(74f, 32f, 122.5f, 97.5f)
                reflectiveQuadTo(776f, 472f)
                lineToRelative(24f, 281f)
                quadToRelative(3f, 35f, -21f, 61f)
                reflectiveQuadToRelative(-59f, 26f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Nest_cam_stand!!
    }

private var _Nest_cam_stand: ImageVector? = null

