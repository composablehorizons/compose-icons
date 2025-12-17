package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Fitness_trackers: ImageVector
    get() {
        if (_Fitness_trackers != null) return _Fitness_trackers!!
        
        _Fitness_trackers = ImageVector.Builder(
            name = "fitness_trackers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(151f, 852f)
                lineToRelative(-39f, -130f)
                quadToRelative(-15f, -17f, -23.5f, -37.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -24f, 8.5f, -44.5f)
                reflectiveQuadTo(112f, 238f)
                lineToRelative(39f, -130f)
                quadToRelative(4f, -13f, 14.5f, -20.5f)
                reflectiveQuadTo(190f, 80f)
                horizontalLineToRelative(180f)
                quadToRelative(14f, 0f, 24.5f, 7.5f)
                reflectiveQuadTo(409f, 108f)
                lineToRelative(39f, 130f)
                quadToRelative(15f, 17f, 23.5f, 37.5f)
                reflectiveQuadTo(480f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 24f, -8.5f, 44.5f)
                reflectiveQuadTo(448f, 722f)
                lineToRelative(-39f, 130f)
                quadToRelative(-4f, 13f, -14.5f, 20.5f)
                reflectiveQuadTo(370f, 880f)
                horizontalLineTo(190f)
                quadToRelative(-14f, 0f, -24.5f, -7.5f)
                reflectiveQuadTo(151f, 852f)
                close()
                moveToRelative(49f, -172f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 280f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 680f)
                close()
                moveTo(640f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 800f)
                verticalLineToRelative(-440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 280f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(640f)
                close()
                moveToRelative(0f, -540f)
                verticalLineToRelative(460f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-460f)
                horizontalLineTo(640f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-100f)
                horizontalLineTo(640f)
                verticalLineToRelative(100f)
                close()
            }
        }.build()
        
        return _Fitness_trackers!!
    }

private var _Fitness_trackers: ImageVector? = null

