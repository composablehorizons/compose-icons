package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Museum: ImageVector
    get() {
        if (_Museum != null) return _Museum!!
        
        _Museum = ImageVector.Builder(
            name = "museum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-26f)
                quadToRelative(-23f, 0f, -38.5f, -16f)
                reflectiveQuadTo(80f, 385f)
                quadToRelative(0f, -12f, 5.5f, -22f)
                reflectiveQuadToRelative(15.5f, -17f)
                lineToRelative(333f, -234f)
                quadToRelative(11f, -8f, 22.5f, -11.5f)
                reflectiveQuadTo(480f, 97f)
                quadToRelative(12f, 0f, 23.5f, 3.5f)
                reflectiveQuadTo(526f, 112f)
                lineToRelative(333f, 234f)
                quadToRelative(10f, 7f, 15.5f, 17.5f)
                reflectiveQuadTo(880f, 386f)
                quadToRelative(0f, 23f, -15.5f, 38.5f)
                reflectiveQuadTo(826f, 440f)
                horizontalLineToRelative(-26f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, -80f)
                verticalLineToRelative(-454f)
                lineTo(480f, 178f)
                lineTo(240f, 346f)
                verticalLineToRelative(454f)
                horizontalLineToRelative(480f)
                close()
                moveTo(480f, 648f)
                quadToRelative(10f, 0f, 18.5f, -4.5f)
                reflectiveQuadTo(513f, 630f)
                lineToRelative(47f, -70f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 680f)
                verticalLineToRelative(-207f)
                quadToRelative(0f, -14f, -9.5f, -23.5f)
                reflectiveQuadTo(607f, 440f)
                horizontalLineToRelative(-29f)
                quadToRelative(-8f, 0f, -15.5f, 4f)
                reflectiveQuadTo(550f, 455f)
                lineToRelative(-70f, 105f)
                lineToRelative(-68f, -102f)
                quadToRelative(-5f, -8f, -14f, -13f)
                reflectiveQuadToRelative(-19f, -5f)
                horizontalLineToRelative(-19f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 480f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 680f)
                verticalLineToRelative(-120f)
                lineToRelative(47f, 70f)
                quadToRelative(6f, 9f, 14.5f, 13.5f)
                reflectiveQuadTo(480f, 648f)
                close()
                moveToRelative(240f, 152f)
                horizontalLineTo(240f)
                horizontalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Museum!!
    }

private var _Museum: ImageVector? = null

