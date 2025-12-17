package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Attach_email: ImageVector
    get() {
        if (_Attach_email != null) return _Attach_email!!
        
        _Attach_email = ImageVector.Builder(
            name = "attach_email",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(760f, 800f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 880f)
                close()
                moveTo(40f, 720f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(320f)
                horizontalLineTo(700f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                verticalLineToRelative(180f)
                horizontalLineTo(40f)
                close()
                moveToRelative(400f, -280f)
                lineToRelative(320f, -200f)
                verticalLineToRelative(-80f)
                lineTo(440f, 360f)
                lineTo(120f, 160f)
                verticalLineToRelative(80f)
                lineToRelative(320f, 200f)
                close()
            }
        }.build()
        
        return _Attach_email!!
    }

private var _Attach_email: ImageVector? = null

