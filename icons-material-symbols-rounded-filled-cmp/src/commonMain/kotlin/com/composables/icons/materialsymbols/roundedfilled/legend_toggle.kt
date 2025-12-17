package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Legend_toggle: ImageVector
    get() {
        if (_Legend_toggle != null) return _Legend_toggle!!
        
        _Legend_toggle = ImageVector.Builder(
            name = "legend_toggle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 600f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 520f)
                close()
                moveToRelative(-21f, -186f)
                lineToRelative(176f, -107f)
                quadToRelative(20f, -13f, 44f, -12f)
                reflectiveQuadToRelative(44f, 15f)
                lineToRelative(157f, 112f)
                lineToRelative(137f, -97f)
                quadToRelative(20f, -14f, 41.5f, -3.5f)
                reflectiveQuadTo(800f, 277f)
                quadToRelative(0f, 10f, -4.5f, 19f)
                reflectiveQuadTo(783f, 310f)
                lineToRelative(-137f, 97f)
                quadToRelative(-21f, 15f, -46f, 15f)
                reflectiveQuadToRelative(-46f, -15f)
                lineTo(397f, 296f)
                lineTo(221f, 403f)
                quadToRelative(-20f, 12f, -40.5f, 0.5f)
                reflectiveQuadTo(160f, 369f)
                quadToRelative(0f, -11f, 5f, -20.5f)
                reflectiveQuadToRelative(14f, -14.5f)
                close()
            }
        }.build()
        
        return _Legend_toggle!!
    }

private var _Legend_toggle: ImageVector? = null

