package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.HandThumbDown: ImageVector
    get() {
        if (_HandThumbDown != null) return _HandThumbDown!!
        
        _HandThumbDown = ImageVector.Builder(
            name = "hand-thumb-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.905f, 12.75f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, -2.5f, 0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, 2.5f, 0f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(8.905f, 17f)
                verticalLineToRelative(1.3f)
                curveToRelative(0f, 0.268f, -0.14f, 0.526f, -0.395f, 0.607f)
                arcTo(2f, 2f, 0f, false, true, 5.905f, 17f)
                curveToRelative(0f, -0.995f, 0.182f, -1.948f, 0.514f, -2.826f)
                curveToRelative(0.204f, -0.54f, -0.166f, -1.174f, -0.744f, -1.174f)
                horizontalLineToRelative(-2.52f)
                curveToRelative(-1.243f, 0f, -2.261f, -1.01f, -2.146f, -2.247f)
                curveToRelative(0.193f, -2.08f, 0.651f, -4.082f, 1.341f, -5.974f)
                curveTo(2.752f, 3.678f, 3.833f, 3f, 5.005f, 3f)
                horizontalLineToRelative(3.192f)
                arcToRelative(3f, 3f, 0f, false, true, 1.341f, 0.317f)
                lineToRelative(2.734f, 1.366f)
                arcTo(3f, 3f, 0f, false, false, 13.613f, 5f)
                horizontalLineToRelative(1.292f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-0.963f)
                curveToRelative(-0.685f, 0f, -1.258f, 0.482f, -1.612f, 1.068f)
                arcToRelative(4.01f, 4.01f, 0f, false, true, -2.166f, 1.73f)
                curveToRelative(-0.432f, 0.143f, -0.853f, 0.386f, -1.011f, 0.814f)
                curveToRelative(-0.16f, 0.432f, -0.248f, 0.9f, -0.248f, 1.388f)
                close()
            }
        }.build()
        
        return _HandThumbDown!!
    }

private var _HandThumbDown: ImageVector? = null

