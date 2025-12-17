package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.HandThumbUp: ImageVector
    get() {
        if (_HandThumbUp != null) return _HandThumbUp!!
        
        _HandThumbUp = ImageVector.Builder(
            name = "hand-thumb-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8.25f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, 2.5f, 0f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, -2.5f, 0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(11f, 3f)
                verticalLineTo(1.7f)
                curveToRelative(0f, -0.268f, 0.14f, -0.526f, 0.395f, -0.607f)
                arcTo(2f, 2f, 0f, false, true, 14f, 3f)
                curveToRelative(0f, 0.995f, -0.182f, 1.948f, -0.514f, 2.826f)
                curveToRelative(-0.204f, 0.54f, 0.166f, 1.174f, 0.744f, 1.174f)
                horizontalLineToRelative(2.52f)
                curveToRelative(1.243f, 0f, 2.261f, 1.01f, 2.146f, 2.247f)
                arcToRelative(23.864f, 23.864f, 0f, false, true, -1.341f, 5.974f)
                curveTo(17.153f, 16.323f, 16.072f, 17f, 14.9f, 17f)
                horizontalLineToRelative(-3.192f)
                arcToRelative(3f, 3f, 0f, false, true, -1.341f, -0.317f)
                lineToRelative(-2.734f, -1.366f)
                arcTo(3f, 3f, 0f, false, false, 6.292f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(0.963f)
                curveToRelative(0.685f, 0f, 1.258f, -0.483f, 1.612f, -1.068f)
                arcToRelative(4.011f, 4.011f, 0f, false, true, 2.166f, -1.73f)
                curveToRelative(0.432f, -0.143f, 0.853f, -0.386f, 1.011f, -0.814f)
                curveToRelative(0.16f, -0.432f, 0.248f, -0.9f, 0.248f, -1.388f)
                close()
            }
        }.build()
        
        return _HandThumbUp!!
    }

private var _HandThumbUp: ImageVector? = null

