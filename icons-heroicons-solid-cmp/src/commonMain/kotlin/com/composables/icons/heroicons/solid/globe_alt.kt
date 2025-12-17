package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.GlobeAlt: ImageVector
    get() {
        if (_GlobeAlt != null) return _GlobeAlt!!
        
        _GlobeAlt = ImageVector.Builder(
            name = "globe-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.721f, 12.752f)
                arcToRelative(9.711f, 9.711f, 0f, false, false, -0.945f, -5.003f)
                arcToRelative(12.754f, 12.754f, 0f, false, true, -4.339f, 2.708f)
                arcToRelative(18.991f, 18.991f, 0f, false, true, -0.214f, 4.772f)
                arcToRelative(17.165f, 17.165f, 0f, false, false, 5.498f, -2.477f)
                close()
                moveTo(14.634f, 15.55f)
                arcToRelative(17.324f, 17.324f, 0f, false, false, 0.332f, -4.647f)
                curveToRelative(-0.952f, 0.227f, -1.945f, 0.347f, -2.966f, 0.347f)
                curveToRelative(-1.021f, 0f, -2.014f, -0.12f, -2.966f, -0.347f)
                arcToRelative(17.515f, 17.515f, 0f, false, false, 0.332f, 4.647f)
                arcToRelative(17.385f, 17.385f, 0f, false, false, 5.268f, 0f)
                close()
                moveTo(9.772f, 17.119f)
                arcToRelative(18.963f, 18.963f, 0f, false, false, 4.456f, 0f)
                arcTo(17.182f, 17.182f, 0f, false, true, 12f, 21.724f)
                arcToRelative(17.18f, 17.18f, 0f, false, true, -2.228f, -4.605f)
                close()
                moveTo(7.777f, 15.23f)
                arcToRelative(18.87f, 18.87f, 0f, false, true, -0.214f, -4.774f)
                arcToRelative(12.753f, 12.753f, 0f, false, true, -4.34f, -2.708f)
                arcToRelative(9.711f, 9.711f, 0f, false, false, -0.944f, 5.004f)
                arcToRelative(17.165f, 17.165f, 0f, false, false, 5.498f, 2.477f)
                close()
                moveTo(21.356f, 14.752f)
                arcToRelative(9.765f, 9.765f, 0f, false, true, -7.478f, 6.817f)
                arcToRelative(18.64f, 18.64f, 0f, false, false, 1.988f, -4.718f)
                arcToRelative(18.627f, 18.627f, 0f, false, false, 5.49f, -2.098f)
                close()
                moveTo(2.644f, 14.752f)
                curveToRelative(1.682f, 0.971f, 3.53f, 1.688f, 5.49f, 2.099f)
                arcToRelative(18.64f, 18.64f, 0f, false, false, 1.988f, 4.718f)
                arcToRelative(9.765f, 9.765f, 0f, false, true, -7.478f, -6.816f)
                close()
                moveTo(13.878f, 2.43f)
                arcToRelative(9.755f, 9.755f, 0f, false, true, 6.116f, 3.986f)
                arcToRelative(11.267f, 11.267f, 0f, false, true, -3.746f, 2.504f)
                arcToRelative(18.63f, 18.63f, 0f, false, false, -2.37f, -6.49f)
                close()
                moveTo(12f, 2.276f)
                arcToRelative(17.152f, 17.152f, 0f, false, true, 2.805f, 7.121f)
                curveToRelative(-0.897f, 0.23f, -1.837f, 0.353f, -2.805f, 0.353f)
                curveToRelative(-0.968f, 0f, -1.908f, -0.122f, -2.805f, -0.353f)
                arcTo(17.151f, 17.151f, 0f, false, true, 12f, 2.276f)
                close()
                moveTo(10.122f, 2.43f)
                arcToRelative(18.629f, 18.629f, 0f, false, false, -2.37f, 6.49f)
                arcToRelative(11.266f, 11.266f, 0f, false, true, -3.746f, -2.504f)
                arcToRelative(9.754f, 9.754f, 0f, false, true, 6.116f, -3.985f)
                close()
            }
        }.build()
        
        return _GlobeAlt!!
    }

private var _GlobeAlt: ImageVector? = null

