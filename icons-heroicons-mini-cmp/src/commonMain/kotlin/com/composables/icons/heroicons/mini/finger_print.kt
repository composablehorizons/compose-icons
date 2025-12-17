package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.FingerPrint: ImageVector
    get() {
        if (_FingerPrint != null) return _FingerPrint!!
        
        _FingerPrint = ImageVector.Builder(
            name = "finger-print",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2.5f)
                curveToRelative(-1.31f, 0f, -2.526f, 0.386f, -3.546f, 1.051f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.82f, -1.256f)
                arcTo(8f, 8f, 0f, false, true, 18f, 9f)
                arcToRelative(22.47f, 22.47f, 0f, false, true, -1.228f, 7.351f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.417f, -0.49f)
                arcTo(20.97f, 20.97f, 0f, false, false, 16.5f, 9f)
                arcTo(6.5f, 6.5f, 0f, false, false, 10f, 2.5f)
                close()
                moveTo(4.333f, 4.416f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.218f, 1.038f)
                arcTo(6.466f, 6.466f, 0f, false, false, 3.5f, 9f)
                arcToRelative(7.966f, 7.966f, 0f, false, true, -1.293f, 4.362f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.257f, -0.819f)
                arcTo(6.466f, 6.466f, 0f, false, false, 2f, 9f)
                curveToRelative(0f, -1.61f, 0.476f, -3.11f, 1.295f, -4.365f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.038f, -0.219f)
                close()
                moveTo(10f, 6.12f)
                arcToRelative(3f, 3f, 0f, false, false, -3.001f, 3.041f)
                arcToRelative(11.455f, 11.455f, 0f, false, true, -2.697f, 7.24f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.148f, -0.965f)
                arcTo(9.957f, 9.957f, 0f, false, false, 5.5f, 9f)
                curveToRelative(0f, -0.028f, 0.002f, -0.055f, 0.004f, -0.082f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 8.996f, 0.084f)
                verticalLineTo(9.15f)
                lineToRelative(-0.005f, 0.297f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, -0.034f)
                curveToRelative(0.003f, -0.11f, 0.004f, -0.219f, 0.005f, -0.328f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -2.965f)
                close()
                moveToRelative(0f, 2.13f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                curveToRelative(0f, 3.51f, -1.187f, 6.745f, -3.181f, 9.323f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.186f, -0.918f)
                arcTo(13.687f, 13.687f, 0f, false, false, 9.25f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(3.529f, 3.698f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.584f, 0.885f)
                arcToRelative(18.883f, 18.883f, 0f, false, true, -2.257f, 5.84f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.29f, -0.764f)
                arcToRelative(17.386f, 17.386f, 0f, false, false, 2.078f, -5.377f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.885f, -0.584f)
                close()
            }
        }.build()
        
        return _FingerPrint!!
    }

private var _FingerPrint: ImageVector? = null

