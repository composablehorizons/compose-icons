package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Health_metrics: ImageVector
    get() {
        if (_Health_metrics != null) return _Health_metrics!!
        
        _Health_metrics = ImageVector.Builder(
            name = "health_metrics",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(258f)
                lineToRelative(68f, 102f)
                quadToRelative(5f, 8f, 14f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                quadToRelative(13f, 0f, 24f, -8f)
                reflectiveQuadToRelative(15f, -20f)
                lineToRelative(54f, -162f)
                lineToRelative(34f, 52f)
                quadToRelative(6f, 8f, 15f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(360f)
                close()
                moveToRelative(68f, -370f)
                lineToRelative(-35f, -52f)
                quadToRelative(-5f, -8f, -14f, -13f)
                reflectiveQuadToRelative(-19f, -5f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(80f)
                horizontalLineTo(621f)
                lineToRelative(-68f, -102f)
                quadToRelative(-5f, -8f, -14f, -13f)
                reflectiveQuadToRelative(-19f, -5f)
                quadToRelative(-13f, 0f, -23.5f, 8f)
                reflectiveQuadTo(482f, 348f)
                lineToRelative(-54f, 162f)
                close()
            }
        }.build()
        
        return _Health_metrics!!
    }

private var _Health_metrics: ImageVector? = null

