package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Water_full: ImageVector
    get() {
        if (_Water_full != null) return _Water_full!!
        
        _Water_full = ImageVector.Builder(
            name = "water_full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(444f, 360f)
                quadToRelative(-55f, 0f, -108f, 15.5f)
                reflectiveQuadTo(238f, 422f)
                lineToRelative(42f, 378f)
                horizontalLineToRelative(400f)
                lineToRelative(44f, -400f)
                horizontalLineToRelative(-28f)
                quadToRelative(-38f, 0f, -69f, -5.5f)
                reflectiveQuadTo(542f, 373f)
                quadToRelative(-23f, -7f, -48f, -10f)
                reflectiveQuadToRelative(-50f, -3f)
                close()
                moveToRelative(-216f, -25f)
                quadToRelative(51f, -27f, 105.5f, -41f)
                reflectiveQuadTo(445f, 280f)
                quadToRelative(30f, 0f, 59.5f, 4f)
                reflectiveQuadToRelative(58.5f, 12f)
                quadToRelative(50f, 14f, 76.5f, 19f)
                reflectiveQuadToRelative(56.5f, 5f)
                horizontalLineToRelative(37f)
                lineToRelative(17f, -160f)
                horizontalLineTo(210f)
                lineToRelative(18f, 175f)
                close()
                moveToRelative(51f, 545f)
                quadToRelative(-31f, 0f, -53.5f, -20f)
                reflectiveQuadTo(200f, 809f)
                lineToRelative(-80f, -729f)
                horizontalLineToRelative(720f)
                lineToRelative(-80f, 729f)
                quadToRelative(-3f, 31f, -25.5f, 51f)
                reflectiveQuadTo(681f, 880f)
                horizontalLineTo(279f)
                close()
                moveToRelative(165f, -80f)
                horizontalLineToRelative(236f)
                horizontalLineToRelative(-400f)
                horizontalLineToRelative(164f)
                close()
            }
        }.build()
        
        return _Water_full!!
    }

private var _Water_full: ImageVector? = null

