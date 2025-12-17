package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Local_post_office: ImageVector
    get() {
        if (_Local_post_office != null) return _Local_post_office!!
        
        _Local_post_office = ImageVector.Builder(
            name = "local_post_office",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                horizontalLineToRelative(160f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(640f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(280f, -206f)
                lineTo(160f, 560f)
                verticalLineToRelative(70f)
                lineToRelative(200f, 114f)
                lineToRelative(200f, -114f)
                verticalLineToRelative(-70f)
                lineTo(360f, 674f)
                close()
                moveToRelative(280f, 6f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                horizontalLineTo(480f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                close()
                moveTo(400f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Local_post_office!!
    }

private var _Local_post_office: ImageVector? = null

