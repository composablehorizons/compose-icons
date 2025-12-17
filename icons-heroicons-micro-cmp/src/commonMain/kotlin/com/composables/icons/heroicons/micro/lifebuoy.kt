package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Lifebuoy: ImageVector
    get() {
        if (_Lifebuoy != null) return _Lifebuoy!!
        
        _Lifebuoy = ImageVector.Builder(
            name = "lifebuoy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.95f, 3.05f)
                arcToRelative(7f, 7f, 0f, true, false, -9.9f, 9.9f)
                arcToRelative(7f, 7f, 0f, false, false, 9.9f, -9.9f)
                close()
                moveToRelative(-7.262f, -0.042f)
                arcToRelative(5.516f, 5.516f, 0f, false, true, 4.624f, 0f)
                lineTo(8.698f, 5.082f)
                arcToRelative(3.016f, 3.016f, 0f, false, false, -1.396f, 0f)
                lineTo(5.688f, 3.008f)
                close()
                moveToRelative(-2.68f, 2.68f)
                arcToRelative(5.516f, 5.516f, 0f, false, false, 0f, 4.624f)
                lineToRelative(2.074f, -1.614f)
                arcToRelative(3.015f, 3.015f, 0f, false, true, 0f, -1.396f)
                lineTo(3.008f, 5.688f)
                close()
                moveToRelative(2.68f, 7.304f)
                lineToRelative(1.614f, -2.074f)
                curveToRelative(0.458f, 0.11f, 0.938f, 0.11f, 1.396f, 0f)
                lineToRelative(1.614f, 2.074f)
                arcToRelative(5.516f, 5.516f, 0f, false, true, -4.624f, 0f)
                close()
                moveToRelative(7.304f, -2.68f)
                arcToRelative(5.516f, 5.516f, 0f, false, false, 0f, -4.624f)
                lineToRelative(-2.074f, 1.614f)
                curveToRelative(0.11f, 0.458f, 0.11f, 0.938f, 0f, 1.396f)
                lineToRelative(2.074f, 1.614f)
                close()
                moveTo(6.94f, 6.939f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 2.122f, 2.122f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -2.122f, -2.122f)
                close()
            }
        }.build()
        
        return _Lifebuoy!!
    }

private var _Lifebuoy: ImageVector? = null

