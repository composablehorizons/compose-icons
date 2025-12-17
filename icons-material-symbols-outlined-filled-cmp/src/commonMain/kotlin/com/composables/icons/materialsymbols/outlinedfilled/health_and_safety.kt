package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Health_and_safety: ImageVector
    get() {
        if (_Health_and_safety != null) return _Health_and_safety!!
        
        _Health_and_safety = ImageVector.Builder(
            name = "health_and_safety",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 620f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-120f)
                horizontalLineTo(540f)
                verticalLineToRelative(-100f)
                horizontalLineTo(420f)
                verticalLineToRelative(100f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(60f, 260f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Health_and_safety!!
    }

private var _Health_and_safety: ImageVector? = null

