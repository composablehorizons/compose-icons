package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Swipe_right: ImageVector
    get() {
        if (_Swipe_right != null) return _Swipe_right!!
        
        _Swipe_right = ImageVector.Builder(
            name = "swipe_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 280f)
                quadToRelative(30f, -106f, 142f, -173f)
                reflectiveQuadToRelative(258f, -67f)
                quadToRelative(94f, 0f, 181f, 31f)
                reflectiveQuadToRelative(159f, 90f)
                verticalLineToRelative(-81f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(116f)
                quadToRelative(-66f, -58f, -147f, -89f)
                reflectiveQuadToRelative(-169f, -31f)
                quadToRelative(-118f, 0f, -208.5f, 48f)
                reflectiveQuadTo(143f, 280f)
                horizontalLineTo(80f)
                close()
                moveTo(423f, 880f)
                lineTo(184f, 640f)
                lineToRelative(63f, -65f)
                lineToRelative(113f, 32f)
                verticalLineToRelative(-367f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineTo(423f)
                close()
            }
        }.build()
        
        return _Swipe_right!!
    }

private var _Swipe_right: ImageVector? = null

