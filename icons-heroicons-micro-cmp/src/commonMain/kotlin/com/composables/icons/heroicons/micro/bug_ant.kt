package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.BugAnt: ImageVector
    get() {
        if (_BugAnt != null) return _BugAnt!!
        
        _BugAnt = ImageVector.Builder(
            name = "bug-ant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.983f, 1.364f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.281f, 0.78f)
                curveToRelative(0.096f, 0.158f, 0.184f, 0.321f, 0.264f, 0.489f)
                arcToRelative(5.48f, 5.48f, 0f, false, true, -0.713f, 0.386f)
                arcTo(2.993f, 2.993f, 0f, false, false, 8f, 2f)
                curveToRelative(-0.898f, 0f, -1.703f, 0.394f, -2.253f, 1.02f)
                arcToRelative(5.485f, 5.485f, 0f, false, true, -0.713f, -0.387f)
                curveToRelative(0.08f, -0.168f, 0.168f, -0.33f, 0.264f, -0.489f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.28f, -0.78f)
                curveToRelative(-0.245f, 0.401f, -0.45f, 0.83f, -0.61f, 1.278f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.239f, 0.84f)
                arcToRelative(7f, 7f, 0f, false, false, 1.422f, 0.876f)
                arcTo(3.01f, 3.01f, 0f, false, false, 5f, 5f)
                curveToRelative(0f, 0.126f, 0.072f, 0.24f, 0.183f, 0.3f)
                curveToRelative(0.386f, 0.205f, 0.796f, 0.37f, 1.227f, 0.487f)
                curveToRelative(-0.126f, 0.165f, -0.227f, 0.35f, -0.297f, 0.549f)
                arcTo(10.418f, 10.418f, 0f, false, true, 3.51f, 5.5f)
                arcToRelative(10.686f, 10.686f, 0f, false, true, -0.008f, -0.733f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, -0.033f)
                arcToRelative(12.222f, 12.222f, 0f, false, false, 0.041f, 1.31f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.4f, 0.6f)
                arcTo(11.922f, 11.922f, 0f, false, false, 6.199f, 7.87f)
                curveToRelative(0.04f, 0.084f, 0.088f, 0.166f, 0.14f, 0.243f)
                lineToRelative(-0.214f, 0.031f)
                lineToRelative(-0.027f, 0.005f)
                curveToRelative(-1.299f, 0.207f, -2.529f, 0.622f, -3.654f, 1.211f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.4f, 0.6f)
                arcToRelative(12.148f, 12.148f, 0f, false, false, 0.197f, 3.443f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.47f, -0.299f)
                arcToRelative(10.551f, 10.551f, 0f, false, true, -0.2f, -2.6f)
                curveToRelative(0.352f, -0.167f, 0.714f, -0.314f, 1.085f, -0.441f)
                curveToRelative(-0.063f, 0.3f, -0.096f, 0.614f, -0.096f, 0.936f)
                curveToRelative(0f, 2.21f, 1.567f, 4f, 3.5f, 4f)
                reflectiveCurveToRelative(3.5f, -1.79f, 3.5f, -4f)
                curveToRelative(0f, -0.322f, -0.034f, -0.636f, -0.097f, -0.937f)
                curveToRelative(0.372f, 0.128f, 0.734f, 0.275f, 1.085f, 0.442f)
                arcToRelative(10.703f, 10.703f, 0f, false, true, -0.199f, 2.6f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.47f, 0.3f)
                arcToRelative(12.049f, 12.049f, 0f, false, false, 0.197f, -3.443f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.4f, -0.6f)
                arcToRelative(11.921f, 11.921f, 0f, false, false, -3.671f, -1.215f)
                lineToRelative(-0.011f, -0.002f)
                arcToRelative(11.95f, 11.95f, 0f, false, false, -0.213f, -0.03f)
                curveToRelative(0.052f, -0.078f, 0.1f, -0.16f, 0.14f, -0.244f)
                curveToRelative(1.336f, -0.202f, 2.6f, -0.623f, 3.755f, -1.227f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.4f, -0.6f)
                arcToRelative(12.178f, 12.178f, 0f, false, false, 0.041f, -1.31f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0.033f)
                arcToRelative(11.061f, 11.061f, 0f, false, true, -0.008f, 0.733f)
                curveToRelative(-0.815f, 0.386f, -1.688f, 0.67f, -2.602f, 0.836f)
                curveToRelative(-0.07f, -0.2f, -0.17f, -0.384f, -0.297f, -0.55f)
                curveToRelative(0.43f, -0.117f, 0.842f, -0.282f, 1.228f, -0.488f)
                arcTo(0.34f, 0.34f, 0f, false, false, 11f, 5f)
                curveToRelative(0f, -0.22f, -0.024f, -0.435f, -0.069f, -0.642f)
                arcToRelative(7f, 7f, 0f, false, false, 1.422f, -0.876f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.24f, -0.84f)
                arcToRelative(6.97f, 6.97f, 0f, false, false, -0.61f, -1.278f)
                close()
            }
        }.build()
        
        return _BugAnt!!
    }

private var _BugAnt: ImageVector? = null

