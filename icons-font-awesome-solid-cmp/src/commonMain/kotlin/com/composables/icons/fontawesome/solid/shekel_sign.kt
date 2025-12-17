package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShekelSign: ImageVector
    get() {
        if (_ShekelSign != null) return _ShekelSign!!
        
        _ShekelSign = ImageVector.Builder(
            name = "shekel-sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 168f)
                verticalLineToRelative(168f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(168f)
                curveToRelative(0f, -75.11f, -60.89f, -136f, -136f, -136f)
                horizontalLineTo(24f)
                curveTo(10.75f, 32f, 0f, 42.74f, 0f, 56f)
                verticalLineToRelative(408f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(112f)
                horizontalLineToRelative(112f)
                curveToRelative(30.93f, 0f, 56f, 25.07f, 56f, 56f)
                close()
                moveTo(432f, 32f)
                horizontalLineToRelative(-48f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(296f)
                curveToRelative(0f, 30.93f, -25.07f, 56f, -56f, 56f)
                horizontalLineTo(200f)
                verticalLineTo(176f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-48f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(280f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(168f)
                curveToRelative(75.11f, 0f, 136f, -60.89f, 136f, -136f)
                verticalLineTo(48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _ShekelSign!!
    }

private var _ShekelSign: ImageVector? = null

