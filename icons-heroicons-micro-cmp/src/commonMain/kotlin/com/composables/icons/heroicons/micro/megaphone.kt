package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) return _Megaphone!!
        
        _Megaphone = ImageVector.Builder(
            name = "megaphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.407f, 2.59f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.464f, 0.326f)
                curveToRelative(0.365f, 1.636f, 0.557f, 3.337f, 0.557f, 5.084f)
                curveToRelative(0f, 1.747f, -0.192f, 3.448f, -0.557f, 5.084f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.464f, 0.327f)
                curveToRelative(0.264f, -1.185f, 0.444f, -2.402f, 0.531f, -3.644f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -3.534f)
                arcToRelative(24.736f, 24.736f, 0f, false, false, -0.531f, -3.643f)
                close()
                moveTo(4.348f, 11f)
                horizontalLineTo(4f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -6f)
                horizontalLineToRelative(2f)
                curveToRelative(1.647f, 0f, 3.217f, -0.332f, 4.646f, -0.933f)
                curveTo(10.878f, 5.341f, 11f, 6.655f, 11f, 8f)
                curveToRelative(0f, 1.345f, -0.122f, 2.659f, -0.354f, 3.933f)
                arcToRelative(11.946f, 11.946f, 0f, false, false, -4.23f, -0.925f)
                curveToRelative(0.203f, 0.718f, 0.478f, 1.407f, 0.816f, 2.057f)
                curveToRelative(0.12f, 0.23f, 0.057f, 0.515f, -0.155f, 0.663f)
                lineToRelative(-0.828f, 0.58f)
                arcToRelative(0.484f, 0.484f, 0f, false, true, -0.707f, -0.16f)
                arcTo(12.91f, 12.91f, 0f, false, true, 4.348f, 11f)
                close()
            }
        }.build()
        
        return _Megaphone!!
    }

private var _Megaphone: ImageVector? = null

