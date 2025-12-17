package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Av_timer: ImageVector
    get() {
        if (_Av_timer != null) return _Av_timer!!
        
        _Av_timer = ImageVector.Builder(
            name = "av_timer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-74f, 0f, -139.5f, -28.5f)
                reflectiveQuadTo(226f, 734f)
                quadToRelative(-49f, -49f, -77.5f, -114.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -44f, 10f, -85.5f)
                reflectiveQuadToRelative(29f, -78f)
                quadToRelative(19f, -36.5f, 45.5f, -68f)
                reflectiveQuadTo(264f, 192f)
                lineToRelative(272f, 272f)
                lineToRelative(-56f, 56f)
                lineToRelative(-216f, -216f)
                quadToRelative(-30f, 36f, -47f, 80.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                quadToRelative(116f, 0f, 198f, -82f)
                reflectiveQuadToRelative(82f, -198f)
                quadToRelative(0f, -107f, -68.5f, -184.5f)
                reflectiveQuadTo(520f, 204f)
                verticalLineToRelative(76f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(40f)
                quadToRelative(74f, 0f, 139.5f, 28.5f)
                reflectiveQuadTo(734f, 226f)
                quadToRelative(49f, 49f, 77.5f, 114.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 74f, -28.5f, 139.5f)
                reflectiveQuadTo(734f, 734f)
                quadToRelative(-49f, 49f, -114.5f, 77.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveTo(280f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 520f)
                close()
                moveToRelative(200f, 200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(200f, -200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 520f)
                close()
            }
        }.build()
        
        return _Av_timer!!
    }

private var _Av_timer: ImageVector? = null

