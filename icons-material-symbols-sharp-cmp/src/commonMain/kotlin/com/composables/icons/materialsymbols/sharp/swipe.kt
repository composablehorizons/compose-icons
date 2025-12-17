package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Swipe: ImageVector
    get() {
        if (_Swipe != null) return _Swipe!!
        
        _Swipe = ImageVector.Builder(
            name = "swipe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 280f)
                horizontalLineTo(680f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(116f)
                quadToRelative(-66f, -58f, -147f, -89f)
                reflectiveQuadToRelative(-169f, -31f)
                quadToRelative(-88f, 0f, -169f, 31f)
                reflectiveQuadToRelative(-147f, 89f)
                horizontalLineToRelative(116f)
                verticalLineToRelative(60f)
                horizontalLineTo(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(81f)
                quadToRelative(72f, -59f, 159f, -90f)
                reflectiveQuadToRelative(181f, -31f)
                quadToRelative(94f, 0f, 181f, 31f)
                reflectiveQuadToRelative(159f, 90f)
                verticalLineToRelative(-81f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(200f)
                close()
                moveTo(423f, 880f)
                lineTo(184f, 640f)
                lineToRelative(63f, -65f)
                lineToRelative(113f, 32f)
                verticalLineToRelative(-367f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(473f)
                lineToRelative(-97f, -27f)
                lineToRelative(114f, 114f)
                horizontalLineToRelative(263f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineTo(423f)
                close()
                moveToRelative(57f, -280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-19f, 80f)
                close()
            }
        }.build()
        
        return _Swipe!!
    }

private var _Swipe: ImageVector? = null

