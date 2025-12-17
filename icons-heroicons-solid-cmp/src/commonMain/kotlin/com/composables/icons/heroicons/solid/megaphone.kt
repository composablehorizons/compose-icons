package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) return _Megaphone!!
        
        _Megaphone = ImageVector.Builder(
            name = "megaphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.881f, 4.345f)
                arcTo(23.112f, 23.112f, 0f, false, true, 8.25f, 6f)
                horizontalLineTo(7.5f)
                arcToRelative(5.25f, 5.25f, 0f, false, false, -0.88f, 10.427f)
                arcToRelative(21.593f, 21.593f, 0f, false, false, 1.378f, 3.94f)
                curveToRelative(0.464f, 1.004f, 1.674f, 1.32f, 2.582f, 0.796f)
                lineToRelative(0.657f, -0.379f)
                curveToRelative(0.88f, -0.508f, 1.165f, -1.593f, 0.772f, -2.468f)
                arcToRelative(17.116f, 17.116f, 0f, false, true, -0.628f, -1.607f)
                curveToRelative(1.918f, 0.258f, 3.76f, 0.75f, 5.5f, 1.446f)
                arcTo(21.727f, 21.727f, 0f, false, false, 18f, 11.25f)
                curveToRelative(0f, -2.414f, -0.393f, -4.735f, -1.119f, -6.905f)
                close()
                moveTo(18.26f, 3.74f)
                arcToRelative(23.22f, 23.22f, 0f, false, true, 1.24f, 7.51f)
                arcToRelative(23.22f, 23.22f, 0f, false, true, -1.41f, 7.992f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.409f, 0.516f)
                arcToRelative(24.555f, 24.555f, 0f, false, false, 1.415f, -6.43f)
                arcToRelative(2.992f, 2.992f, 0f, false, false, 0.836f, -2.078f)
                curveToRelative(0f, -0.807f, -0.319f, -1.54f, -0.836f, -2.078f)
                arcToRelative(24.65f, 24.65f, 0f, false, false, -1.415f, -6.43f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.409f, 0.516f)
                curveToRelative(0.059f, 0.16f, 0.116f, 0.321f, 0.17f, 0.483f)
                close()
            }
        }.build()
        
        return _Megaphone!!
    }

private var _Megaphone: ImageVector? = null

