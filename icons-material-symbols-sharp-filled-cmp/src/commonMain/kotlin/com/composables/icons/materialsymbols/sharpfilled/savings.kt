package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Savings: ImageVector
    get() {
        if (_Savings != null) return _Savings!!
        
        _Savings = ImageVector.Builder(
            name = "savings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 440f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 440f)
                close()
                moveToRelative(-320f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveTo(180f, 840f)
                quadToRelative(-34f, -114f, -67f, -227.5f)
                reflectiveQuadTo(80f, 380f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                horizontalLineToRelative(200f)
                quadToRelative(29f, -38f, 70.5f, -59f)
                reflectiveQuadToRelative(89.5f, -21f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(720f, 140f)
                quadToRelative(0f, 5f, -5f, 23f)
                quadToRelative(-4f, 11f, -7.5f, 22.5f)
                reflectiveQuadTo(702f, 209f)
                lineToRelative(91f, 91f)
                horizontalLineToRelative(87f)
                verticalLineToRelative(279f)
                lineToRelative(-113f, 37f)
                lineToRelative(-67f, 224f)
                horizontalLineTo(480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineTo(180f)
                close()
            }
        }.build()
        
        return _Savings!!
    }

private var _Savings: ImageVector? = null

