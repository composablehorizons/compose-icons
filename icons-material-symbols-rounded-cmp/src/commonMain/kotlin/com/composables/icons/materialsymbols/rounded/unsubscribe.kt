package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Unsubscribe: ImageVector
    get() {
        if (_Unsubscribe != null) return _Unsubscribe!!
        
        _Unsubscribe = ImageVector.Builder(
            name = "unsubscribe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(-80f)
                lineTo(501f, 507f)
                quadToRelative(-5f, 3f, -10.5f, 4.5f)
                reflectiveQuadTo(480f, 513f)
                quadToRelative(-5f, 0f, -10.5f, -1.5f)
                reflectiveQuadTo(459f, 507f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -360f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-280f)
                verticalLineToRelative(3f)
                verticalLineToRelative(-123f)
                verticalLineToRelative(10f)
                verticalLineToRelative(-58f)
                quadToRelative(0f, -11f, 0f, 0f)
                verticalLineToRelative(-32f)
                verticalLineToRelative(32f)
                verticalLineToRelative(-0.5f)
                verticalLineToRelative(58.5f)
                verticalLineToRelative(-10f)
                verticalLineToRelative(400f)
                close()
                moveTo(760f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 920f)
                close()
                moveTo(660f, 740f)
                horizontalLineToRelative(200f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineTo(660f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
            }
        }.build()
        
        return _Unsubscribe!!
    }

private var _Unsubscribe: ImageVector? = null

