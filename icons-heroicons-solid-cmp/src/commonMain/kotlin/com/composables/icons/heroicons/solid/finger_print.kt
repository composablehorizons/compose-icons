package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.FingerPrint: ImageVector
    get() {
        if (_FingerPrint != null) return _FingerPrint!!
        
        _FingerPrint = ImageVector.Builder(
            name = "finger-print",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3.75f)
                arcToRelative(6.715f, 6.715f, 0f, false, false, -3.722f, 1.118f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.828f, -1.25f)
                arcToRelative(8.25f, 8.25f, 0f, false, true, 12.8f, 6.883f)
                curveToRelative(0f, 3.014f, -0.574f, 5.897f, -1.62f, 8.543f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.395f, -0.551f)
                arcTo(21.69f, 21.69f, 0f, false, false, 18.75f, 10.5f)
                arcTo(6.75f, 6.75f, 0f, false, false, 12f, 3.75f)
                close()
                moveTo(6.157f, 5.739f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.21f, 1.04f)
                arcTo(6.715f, 6.715f, 0f, false, false, 5.25f, 10.5f)
                curveToRelative(0f, 1.613f, -0.463f, 3.12f, -1.265f, 4.393f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.27f, -0.8f)
                arcTo(6.715f, 6.715f, 0f, false, false, 3.75f, 10.5f)
                curveToRelative(0f, -1.68f, 0.503f, -3.246f, 1.367f, -4.55f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.04f, -0.211f)
                close()
                moveTo(12f, 7.5f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                curveToRelative(0f, 3.1f, -1.176f, 5.927f, -3.105f, 8.056f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.112f, -1.008f)
                arcTo(10.459f, 10.459f, 0f, false, false, 7.5f, 10.5f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 9f, 0f)
                curveToRelative(0f, 0.547f, -0.022f, 1.09f, -0.067f, 1.626f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.495f, -0.123f)
                curveToRelative(0.041f, -0.495f, 0.062f, -0.996f, 0.062f, -1.503f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
                moveToRelative(0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                curveToRelative(0f, 3.908f, -1.424f, 7.485f, -3.781f, 10.238f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.14f, -0.975f)
                arcTo(14.19f, 14.19f, 0f, false, false, 11.25f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(3.239f, 5.183f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.515f, 0.927f)
                arcToRelative(19.417f, 19.417f, 0f, false, true, -2.585f, 5.544f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.243f, -0.84f)
                arcToRelative(17.915f, 17.915f, 0f, false, false, 2.386f, -5.116f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.927f, -0.515f)
                close()
            }
        }.build()
        
        return _FingerPrint!!
    }

private var _FingerPrint: ImageVector? = null

