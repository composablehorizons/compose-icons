package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Money_off: ImageVector
    get() {
        if (_Money_off != null) return _Money_off!!
        
        _Money_off = ImageVector.Builder(
            name = "money_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(574f, 342f)
                quadToRelative(-12f, -30f, -35.5f, -47f)
                reflectiveQuadTo(482f, 278f)
                quadToRelative(-18f, 0f, -35f, 5f)
                reflectiveQuadToRelative(-31f, 19f)
                lineToRelative(-58f, -58f)
                quadToRelative(14f, -14f, 38f, -25.5f)
                reflectiveQuadToRelative(44f, -14.5f)
                verticalLineToRelative(-84f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(82f)
                quadToRelative(45f, 9f, 79f, 36.5f)
                reflectiveQuadToRelative(51f, 71.5f)
                lineToRelative(-76f, 32f)
                close()
                moveTo(792f, 904f)
                lineTo(608f, 720f)
                quadToRelative(-15f, 15f, -41f, 24.5f)
                reflectiveQuadTo(520f, 756f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-86f)
                quadToRelative(-56f, -14f, -93.5f, -51f)
                reflectiveQuadTo(292f, 610f)
                lineToRelative(80f, -32f)
                quadToRelative(12f, 42f, 40.5f, 72f)
                reflectiveQuadToRelative(75.5f, 30f)
                quadToRelative(18f, 0f, 33f, -4.5f)
                reflectiveQuadToRelative(29f, -13.5f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Money_off!!
    }

private var _Money_off: ImageVector? = null

