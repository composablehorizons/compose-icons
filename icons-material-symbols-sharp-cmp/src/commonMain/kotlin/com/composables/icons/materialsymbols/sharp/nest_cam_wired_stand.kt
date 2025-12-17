package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nest_cam_wired_stand: ImageVector
    get() {
        if (_Nest_cam_wired_stand != null) return _Nest_cam_wired_stand!!
        
        _Nest_cam_wired_stand = ImageVector.Builder(
            name = "nest_cam_wired_stand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(-50f, 0f, -85f, 34.5f)
                reflectiveQuadTo(360f, 800f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -51f, -34.5f, -85.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveTo(320f, 310f)
                quadToRelative(0f, 67f, 45f, 116f)
                reflectiveQuadToRelative(112f, 57f)
                lineToRelative(164f, 17f)
                verticalLineToRelative(-380f)
                lineToRelative(-164f, 16f)
                quadToRelative(-67f, 7f, -112f, 56.5f)
                reflectiveQuadTo(320f, 310f)
                close()
                moveTo(680f, 920f)
                horizontalLineTo(280f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -84f, 58.5f, -142f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(11f, 0f, 21f, 1f)
                reflectiveQuadToRelative(20f, 3f)
                lineToRelative(22f, -34f)
                lineToRelative(-74f, -7f)
                quadToRelative(-97f, -10f, -163f, -82.5f)
                reflectiveQuadTo(240f, 310f)
                quadToRelative(0f, -99f, 65.5f, -171.5f)
                reflectiveQuadTo(469f, 56f)
                lineToRelative(252f, -24f)
                verticalLineToRelative(555f)
                lineToRelative(-88f, -8f)
                lineToRelative(-38f, 57f)
                quadToRelative(39f, 27f, 62f, 70f)
                reflectiveQuadToRelative(23f, 94f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-200f, -80f)
                close()
                moveToRelative(161f, -530f)
                close()
            }
        }.build()
        
        return _Nest_cam_wired_stand!!
    }

private var _Nest_cam_wired_stand: ImageVector? = null

