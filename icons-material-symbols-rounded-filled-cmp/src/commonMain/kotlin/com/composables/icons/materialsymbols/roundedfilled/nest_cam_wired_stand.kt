package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nest_cam_wired_stand: ImageVector
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
                moveTo(320f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 880f)
                verticalLineToRelative(-80f)
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
                lineToRelative(165f, -16f)
                quadToRelative(35f, -3f, 61f, 21f)
                reflectiveQuadToRelative(26f, 59f)
                verticalLineToRelative(379f)
                quadToRelative(0f, 35f, -26f, 59f)
                reflectiveQuadToRelative(-61f, 21f)
                horizontalLineToRelative(-1f)
                lineToRelative(-38f, 57f)
                quadToRelative(39f, 27f, 62f, 70f)
                reflectiveQuadToRelative(23f, 94f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 920f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Nest_cam_wired_stand!!
    }

private var _Nest_cam_wired_stand: ImageVector? = null

