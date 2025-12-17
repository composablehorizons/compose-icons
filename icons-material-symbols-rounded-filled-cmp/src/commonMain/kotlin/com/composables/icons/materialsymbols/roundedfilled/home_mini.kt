package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Home_mini: ImageVector
    get() {
        if (_Home_mini != null) return _Home_mini!!
        
        _Home_mini = ImageVector.Builder(
            name = "home_mini",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 200f)
                quadToRelative(76f, 0f, 148f, 18.5f)
                reflectiveQuadToRelative(128f, 54f)
                quadToRelative(56f, 35.5f, 90f, 87.5f)
                reflectiveQuadToRelative(34f, 120f)
                horizontalLineTo(80f)
                quadToRelative(0f, -68f, 34f, -120f)
                reflectiveQuadToRelative(90f, -87.5f)
                quadToRelative(56f, -35.5f, 128f, -54f)
                reflectiveQuadTo(480f, 200f)
                close()
                moveTo(360f, 760f)
                quadToRelative(-94f, 0f, -167.5f, -55.5f)
                reflectiveQuadTo(92f, 560f)
                horizontalLineToRelative(776f)
                quadToRelative(-27f, 89f, -100.5f, 144.5f)
                reflectiveQuadTo(600f, 760f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Home_mini!!
    }

private var _Home_mini: ImageVector? = null

