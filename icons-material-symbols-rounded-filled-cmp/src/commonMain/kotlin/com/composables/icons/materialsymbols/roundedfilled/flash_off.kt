package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flash_off: ImageVector
    get() {
        if (_Flash_off != null) return _Flash_off!!
        
        _Flash_off = ImageVector.Builder(
            name = "flash_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(609f, 495f)
                lineTo(298f, 184f)
                quadToRelative(-9f, -9f, -13f, -18.5f)
                reflectiveQuadToRelative(-4f, -20.5f)
                quadToRelative(0f, -25f, 20f, -45f)
                reflectiveQuadToRelative(49f, -20f)
                horizontalLineToRelative(244f)
                quadToRelative(32f, 0f, 51.5f, 25f)
                reflectiveQuadToRelative(11.5f, 55f)
                lineToRelative(-57f, 200f)
                horizontalLineToRelative(45f)
                quadToRelative(37f, 0f, 53.5f, 32f)
                reflectiveQuadToRelative(-3.5f, 62f)
                lineToRelative(-25f, 36f)
                quadToRelative(-11f, 15f, -29f, 17f)
                reflectiveQuadToRelative(-32f, -12f)
                close()
                moveTo(763f, 876f)
                lineTo(550f, 664f)
                lineToRelative(-95f, 137f)
                quadToRelative(-5f, 8f, -14.5f, 11.5f)
                reflectiveQuadToRelative(-19.5f, 0.5f)
                quadToRelative(-10f, -3f, -15.5f, -11f)
                reflectiveQuadToRelative(-5.5f, -18f)
                verticalLineToRelative(-224f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 480f)
                verticalLineToRelative(-86f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
            }
        }.build()
        
        return _Flash_off!!
    }

private var _Flash_off: ImageVector? = null

