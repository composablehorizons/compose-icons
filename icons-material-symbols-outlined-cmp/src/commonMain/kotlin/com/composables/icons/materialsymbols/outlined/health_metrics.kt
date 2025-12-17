package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Health_metrics: ImageVector
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
                moveTo(280f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineTo(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(400f)
                horizontalLineTo(680f)
                verticalLineToRelative(200f)
                horizontalLineTo(280f)
                close()
                moveTo(160f, 440f)
                horizontalLineToRelative(200f)
                quadToRelative(10f, 0f, 19f, 5f)
                reflectiveQuadToRelative(14f, 13f)
                lineToRelative(35f, 52f)
                lineToRelative(54f, -162f)
                quadToRelative(4f, -12f, 14.5f, -20f)
                reflectiveQuadToRelative(23.5f, -8f)
                quadToRelative(10f, 0f, 19f, 5f)
                reflectiveQuadToRelative(14f, 13f)
                lineToRelative(68f, 102f)
                horizontalLineToRelative(179f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(-200f)
                horizontalLineTo(360f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(200f, 360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                quadToRelative(-10f, 0f, -19f, -5f)
                reflectiveQuadToRelative(-15f, -13f)
                lineToRelative(-34f, -52f)
                lineToRelative(-54f, 162f)
                quadToRelative(-4f, 12f, -15f, 20f)
                reflectiveQuadToRelative(-24f, 8f)
                quadToRelative(-10f, 0f, -19f, -5f)
                reflectiveQuadToRelative(-14f, -13f)
                lineToRelative(-68f, -102f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(120f, -320f)
                close()
            }
        }.build()
        
        return _Health_metrics!!
    }

private var _Health_metrics: ImageVector? = null

