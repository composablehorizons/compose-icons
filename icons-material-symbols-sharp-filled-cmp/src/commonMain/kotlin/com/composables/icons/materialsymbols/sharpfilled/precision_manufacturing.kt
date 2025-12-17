package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Precision_manufacturing: ImageVector
    get() {
        if (_Precision_manufacturing != null) return _Precision_manufacturing!!
        
        _Precision_manufacturing = ImageVector.Builder(
            name = "precision_manufacturing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(159f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(124f)
                lineTo(181f, 386f)
                quadToRelative(-27f, -15f, -44.5f, -44f)
                reflectiveQuadTo(119f, 280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(39f, 0f, 69.5f, 22.5f)
                reflectiveQuadTo(351f, 240f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(59f)
                lineToRelative(13f, 16f)
                lineToRelative(89f, -84f)
                lineToRelative(208f, 98f)
                lineToRelative(-24f, 52f)
                lineToRelative(-171f, -78f)
                lineToRelative(-94f, 88f)
                verticalLineToRelative(56f)
                lineToRelative(94f, 86f)
                lineToRelative(173f, -78f)
                lineToRelative(24f, 52f)
                lineToRelative(-210f, 100f)
                lineToRelative(-89f, -84f)
                lineToRelative(-16f, 16f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(-80f)
                horizontalLineTo(351f)
                quadToRelative(-3f, 8f, -6.5f, 15f)
                reflectiveQuadToRelative(-9.5f, 15f)
                lineToRelative(200f, 370f)
                horizontalLineToRelative(144f)
                verticalLineToRelative(120f)
                horizontalLineTo(159f)
                close()
                moveToRelative(80f, -520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(279f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(239f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(199f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(239f, 320f)
                close()
            }
        }.build()
        
        return _Precision_manufacturing!!
    }

private var _Precision_manufacturing: ImageVector? = null

