package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nest_cam_wall_mount: ImageVector
    get() {
        if (_Nest_cam_wall_mount != null) return _Nest_cam_wall_mount!!
        
        _Nest_cam_wall_mount = ImageVector.Builder(
            name = "nest_cam_wall_mount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 698f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 618f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 218f)
                quadToRelative(33f, 0f, 56.5f, 24f)
                reflectiveQuadToRelative(23.5f, 57f)
                quadToRelative(35f, -55f, 92.5f, -88f)
                reflectiveQuadTo(460f, 178f)
                quadToRelative(52f, 0f, 99.5f, 19.5f)
                reflectiveQuadTo(644f, 254f)
                lineToRelative(172f, 172f)
                quadToRelative(12f, 12f, 18f, 26.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(816f, 540f)
                lineTo(562f, 794f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                quadToRelative(-16f, 0f, -31f, -6f)
                reflectiveQuadToRelative(-26f, -17f)
                lineTo(276f, 622f)
                quadToRelative(-11f, -11f, -19.5f, -22f)
                reflectiveQuadTo(240f, 577f)
                verticalLineToRelative(41f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(160f, 698f)
                close()
                moveToRelative(120f, -261f)
                quadToRelative(0f, 36f, 13.5f, 69f)
                reflectiveQuadToRelative(39.5f, 59f)
                lineToRelative(173f, 173f)
                lineToRelative(254f, -255f)
                lineToRelative(-173f, -173f)
                quadToRelative(-26f, -26f, -58.5f, -39.5f)
                reflectiveQuadTo(460f, 257f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(280f, 437f)
                close()
                moveToRelative(240f, 61f)
                close()
            }
        }.build()
        
        return _Nest_cam_wall_mount!!
    }

private var _Nest_cam_wall_mount: ImageVector? = null

