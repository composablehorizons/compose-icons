package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Water_loss: ImageVector
    get() {
        if (_Water_loss != null) return _Water_loss!!
        
        _Water_loss = ImageVector.Builder(
            name = "water_loss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                horizontalLineToRelative(400f)
                lineToRelative(13f, -120f)
                quadToRelative(-36f, 0f, -67f, -6f)
                reflectiveQuadToRelative(-84f, -21f)
                quadToRelative(-23f, -7f, -48f, -10f)
                reflectiveQuadToRelative(-50f, -3f)
                quadToRelative(-47f, 0f, -91.5f, 11.5f)
                reflectiveQuadTo(267f, 685f)
                lineToRelative(13f, 115f)
                close()
                moveToRelative(-22f, -200f)
                quadToRelative(45f, -20f, 92f, -30f)
                reflectiveQuadToRelative(95f, -10f)
                quadToRelative(30f, 0f, 59.5f, 4f)
                reflectiveQuadToRelative(58.5f, 12f)
                quadToRelative(50f, 14f, 76.5f, 19f)
                reflectiveQuadToRelative(56.5f, 5f)
                horizontalLineToRelative(6f)
                lineToRelative(48f, -440f)
                horizontalLineTo(210f)
                lineToRelative(48f, 440f)
                close()
                moveTo(208f, 880f)
                lineToRelative(-88f, -800f)
                horizontalLineToRelative(720f)
                lineTo(752f, 880f)
                horizontalLineTo(208f)
                close()
                moveToRelative(72f, -80f)
                horizontalLineToRelative(-13f)
                horizontalLineToRelative(426f)
                horizontalLineToRelative(-413f)
                close()
            }
        }.build()
        
        return _Water_loss!!
    }

private var _Water_loss: ImageVector? = null

