package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flash_auto: ImageVector
    get() {
        if (_Flash_auto != null) return _Flash_auto!!
        
        _Flash_auto = ImageVector.Builder(
            name = "flash_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(679f, 348f)
                lineToRelative(-25f, 73f)
                quadToRelative(-3f, 8f, -10.5f, 13.5f)
                reflectiveQuadTo(627f, 440f)
                quadToRelative(-15f, 0f, -23.5f, -12.5f)
                reflectiveQuadTo(600f, 401f)
                lineToRelative(108f, -289f)
                quadToRelative(5f, -14f, 17.5f, -22f)
                reflectiveQuadToRelative(26.5f, -8f)
                quadToRelative(15f, 0f, 27.5f, 9.5f)
                reflectiveQuadTo(797f, 115f)
                lineToRelative(109f, 287f)
                quadToRelative(5f, 14f, -3f, 26f)
                reflectiveQuadToRelative(-23f, 12f)
                quadToRelative(-9f, 0f, -17f, -5.5f)
                reflectiveQuadTo(852f, 420f)
                lineToRelative(-25f, -72f)
                horizontalLineTo(679f)
                close()
                moveToRelative(18f, -52f)
                horizontalLineToRelative(110f)
                lineToRelative(-53f, -150f)
                horizontalLineToRelative(-2f)
                lineToRelative(-55f, 150f)
                close()
                moveTo(280f, 624f)
                lineToRelative(128f, -184f)
                horizontalLineTo(294f)
                lineToRelative(80f, -280f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(144f)
                close()
                moveToRelative(-59f, 189f)
                quadToRelative(-9f, -3f, -15f, -10.5f)
                reflectiveQuadToRelative(-6f, -18.5f)
                verticalLineToRelative(-224f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 480f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(234f)
                quadToRelative(32f, 0f, 51.5f, 25f)
                reflectiveQuadToRelative(11.5f, 55f)
                lineToRelative(-57f, 200f)
                horizontalLineToRelative(45f)
                quadToRelative(36f, 0f, 53.5f, 32f)
                reflectiveQuadToRelative(-3.5f, 62f)
                lineTo(255f, 801f)
                quadToRelative(-6f, 9f, -15.5f, 12f)
                reflectiveQuadToRelative(-18.5f, 0f)
                close()
                moveToRelative(59f, -333f)
                horizontalLineTo(160f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Flash_auto!!
    }

private var _Flash_auto: ImageVector? = null

