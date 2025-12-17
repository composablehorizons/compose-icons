package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tools_flat_head: ImageVector
    get() {
        if (_Tools_flat_head != null) return _Tools_flat_head!!
        
        _Tools_flat_head = ImageVector.Builder(
            name = "tools_flat_head",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 760f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                close()
                moveToRelative(-5f, -120f)
                quadToRelative(-15f, 0f, -26.5f, -9.5f)
                reflectiveQuadTo(315f, 686f)
                lineToRelative(-33f, -230f)
                quadToRelative(-1f, -8f, -0.5f, -15.5f)
                reflectiveQuadTo(284f, 425f)
                lineToRelative(68f, -275f)
                quadToRelative(3f, -14f, 14f, -22f)
                reflectiveQuadToRelative(25f, -8f)
                horizontalLineToRelative(178f)
                quadToRelative(14f, 0f, 25f, 8f)
                reflectiveQuadToRelative(14f, 22f)
                lineToRelative(68f, 275f)
                quadToRelative(2f, 8f, 2.5f, 15.5f)
                reflectiveQuadTo(678f, 456f)
                lineToRelative(-33f, 230f)
                quadToRelative(-2f, 15f, -13.5f, 24.5f)
                reflectiveQuadTo(605f, 720f)
                horizontalLineTo(355f)
                close()
                moveToRelative(17f, -320f)
                horizontalLineToRelative(216f)
                lineToRelative(-50f, -200f)
                horizontalLineTo(422f)
                lineToRelative(-50f, 200f)
                close()
            }
        }.build()
        
        return _Tools_flat_head!!
    }

private var _Tools_flat_head: ImageVector? = null

