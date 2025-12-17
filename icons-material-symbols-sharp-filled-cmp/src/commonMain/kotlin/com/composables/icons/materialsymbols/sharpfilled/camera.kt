package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 335f)
                lineToRelative(140f, -240f)
                quadToRelative(91f, 24f, 161.5f, 88f)
                reflectiveQuadTo(852f, 335f)
                horizontalLineTo(448f)
                close()
                moveTo(337f, 435f)
                lineTo(200f, 195f)
                quadToRelative(54f, -53f, 125.5f, -84f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(13f, 0f, 30f, 1.5f)
                reflectiveQuadToRelative(31f, 3.5f)
                lineTo(337f, 435f)
                close()
                moveTo(93f, 580f)
                quadToRelative(-6f, -24f, -9.5f, -49f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -71f, 23f, -134f)
                reflectiveQuadToRelative(65f, -115f)
                lineToRelative(202f, 349f)
                horizontalLineTo(93f)
                close()
                moveTo(373f, 865f)
                quadToRelative(-91f, -24f, -162f, -88f)
                reflectiveQuadTo(108f, 625f)
                horizontalLineToRelative(403f)
                lineTo(373f, 865f)
                close()
                moveToRelative(107f, 15f)
                quadToRelative(-15f, 0f, -30.5f, -2f)
                reflectiveQuadTo(420f, 874f)
                lineToRelative(203f, -349f)
                lineToRelative(137f, 240f)
                quadToRelative(-54f, 53f, -125.5f, 84f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(312f, -151f)
                lineTo(590f, 380f)
                horizontalLineToRelative(277f)
                quadToRelative(6f, 24f, 9.5f, 49f)
                reflectiveQuadToRelative(3.5f, 51f)
                quadToRelative(0f, 70f, -24.5f, 134f)
                reflectiveQuadTo(792f, 729f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

