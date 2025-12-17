package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fiber_dvr: ImageVector
    get() {
        if (_Fiber_dvr != null) return _Fiber_dvr!!
        
        _Fiber_dvr = ImageVector.Builder(
            name = "fiber_dvr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 600f)
                horizontalLineToRelative(120f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                horizontalLineTo(180f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(40f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(254f, -42f)
                lineToRelative(-34f, -117f)
                quadToRelative(-3f, -9f, -10.5f, -15f)
                reflectiveQuadToRelative(-17.5f, -6f)
                quadToRelative(-14f, 0f, -22.5f, 11.5f)
                reflectiveQuadTo(385f, 397f)
                lineToRelative(53f, 182f)
                quadToRelative(3f, 9f, 10.5f, 15f)
                reflectiveQuadToRelative(17.5f, 6f)
                horizontalLineToRelative(16f)
                quadToRelative(10f, 0f, 17.5f, -6f)
                reflectiveQuadToRelative(10.5f, -15f)
                lineToRelative(53f, -182f)
                quadToRelative(4f, -14f, -4.5f, -25.5f)
                reflectiveQuadTo(536f, 360f)
                quadToRelative(-10f, 0f, -17.5f, 6f)
                reflectiveQuadTo(508f, 381f)
                lineToRelative(-34f, 117f)
                close()
                moveToRelative(186f, 22f)
                horizontalLineToRelative(46f)
                lineToRelative(27f, 63f)
                quadToRelative(3f, 8f, 10f, 12.5f)
                reflectiveQuadToRelative(15f, 4.5f)
                quadToRelative(15f, 0f, 23.5f, -12f)
                reflectiveQuadToRelative(2.5f, -26f)
                lineToRelative(-20f, -46f)
                quadToRelative(15f, -8f, 25.5f, -23f)
                reflectiveQuadToRelative(10.5f, -33f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                horizontalLineTo(620f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(190f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(630f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(660f, 570f)
                verticalLineToRelative(-50f)
                close()
                moveToRelative(0f, -60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(120f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-480f)
                horizontalLineTo(120f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Fiber_dvr!!
    }

private var _Fiber_dvr: ImageVector? = null

