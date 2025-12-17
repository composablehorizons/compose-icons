package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Family_star: ImageVector
    get() {
        if (_Family_star != null) return _Family_star!!
        
        _Family_star = ImageVector.Builder(
            name = "family_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(48f, 0f, 85.5f, -28.5f)
                reflectiveQuadTo(620f, 538f)
                horizontalLineTo(340f)
                quadToRelative(17f, 45f, 54.5f, 73.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveTo(380f, 480f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 420f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 360f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 420f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 480f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(640f, 420f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(580f, 360f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(520f, 420f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(580f, 480f)
                close()
                moveTo(305f, 256f)
                lineToRelative(175f, -227f)
                lineToRelative(175f, 227f)
                lineToRelative(274f, 92f)
                lineToRelative(-173f, 245f)
                lineToRelative(7f, 273f)
                lineToRelative(-283f, -79f)
                lineToRelative(-283f, 79f)
                lineToRelative(7f, -274f)
                lineTo(32f, 348f)
                lineToRelative(273f, -92f)
                close()
            }
        }.build()
        
        return _Family_star!!
    }

private var _Family_star: ImageVector? = null

